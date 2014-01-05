package sle.fsml.input.ui.contentassist;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;

@SuppressWarnings("all")
public class FSMInputsCollector implements IResourceProxyVisitor {
  /**
   * Resource-set used to parse the '.fsml' files
   */
  private final XtextResourceSet resourceSet = new Function0<XtextResourceSet>() {
    public XtextResourceSet apply() {
      XtextResourceSet _xtextResourceSet = new XtextResourceSet();
      return _xtextResourceSet;
    }
  }.apply();
  
  /**
   * Result-set
   */
  private final Set<String> inputs = new Function0<Set<String>>() {
    public Set<String> apply() {
      HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet();
      return _newHashSet;
    }
  }.apply();
  
  public boolean visit(final IResourceProxy proxy) throws CoreException {
    boolean _and = false;
    int _type = proxy.getType();
    boolean _equals = (_type == IResource.FILE);
    if (!_equals) {
      _and = false;
    } else {
      String _name = proxy.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _endsWith = _lowerCase.endsWith(".fsml");
      _and = (_equals && _endsWith);
    }
    if (_and) {
      IPath _requestFullPath = proxy.requestFullPath();
      IPath _makeAbsolute = _requestFullPath.makeAbsolute();
      String _string = _makeAbsolute.toString();
      URI _createFileURI = URI.createFileURI(_string);
      final Resource resource = this.resourceSet.getResource(_createFileURI, true);
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterator<FSM> _filter = Iterators.<FSM>filter(_allContents, FSM.class);
      Iterable<FSM> _iterable = IteratorExtensions.<FSM>toIterable(_filter);
      for (final FSM fsm : _iterable) {
        EList<FSMState> _states = fsm.getStates();
        final Function1<FSMState,EList<FSMTransition>> _function = new Function1<FSMState,EList<FSMTransition>>() {
          public EList<FSMTransition> apply(final FSMState it) {
            EList<FSMTransition> _transitions = it.getTransitions();
            return _transitions;
          }
        };
        List<EList<FSMTransition>> _map = ListExtensions.<FSMState, EList<FSMTransition>>map(_states, _function);
        Iterable<FSMTransition> _flatten = Iterables.<FSMTransition>concat(_map);
        final Function1<FSMTransition,String> _function_1 = new Function1<FSMTransition,String>() {
          public String apply(final FSMTransition it) {
            String _input = it.getInput();
            return _input;
          }
        };
        Iterable<String> _map_1 = IterableExtensions.<FSMTransition, String>map(_flatten, _function_1);
        Iterables.<String>addAll(this.inputs, _map_1);
      }
      return false;
    } else {
      return true;
    }
  }
  
  public Set<String> getInputs() {
    return Collections.<String>unmodifiableSet(this.inputs);
  }
}
