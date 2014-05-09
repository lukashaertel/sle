/**
 * generated by Xtext
 */
package sle.gbt.xtext.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import sle.gbt.index.Index;
import sle.gbt.sg.SG;
import sle.gbt.sg.SgFactory;
import sle.gbt.xtext.gBTS.Apply;
import sle.gbt.xtext.gBTS.Member;
import sle.gbt.xtext.gBTS.New;
import sle.gbt.xtext.gBTS.Sub;
import sle.gbt.xtext.gBTS.Test;
import sle.gbt.xtext.icc.ICC;
import sle.gbt.xtext.icc.XtextToSG;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class GBTSGenerator implements IGenerator {
  @Extension
  private SgFactory sgFactory = SgFactory.eINSTANCE;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Test> _filter = Iterators.<Test>filter(_allContents, Test.class);
    Iterable<Test> _iterable = IteratorExtensions.<Test>toIterable(_filter);
    for (final Test test : _iterable) {
      {
        Grammar _ref = test.getRef();
        final List<String> terminals = XtextToSG.terminalsFrom(_ref);
        Grammar _ref_1 = test.getRef();
        final Map<String,SG> grammar = XtextToSG.grammarFrom(_ref_1);
        EList<Member> _members = test.getMembers();
        Iterable<Sub> _filter_1 = Iterables.<Sub>filter(_members, Sub.class);
        for (final Sub sub : _filter_1) {
          AbstractRule _rule = sub.getRule();
          String _name = _rule.getName();
          SG _substitution = sub.getSubstitution();
          grammar.put(_name, _substitution);
        }
        final ArrayList<String> newterms = CollectionLiterals.<String>newArrayList();
        EList<Member> _members_1 = test.getMembers();
        Iterable<New> _filter_2 = Iterables.<New>filter(_members_1, New.class);
        for (final New new_ : _filter_2) {
          {
            String _rule_1 = new_.getRule();
            SG _definition = new_.getDefinition();
            grammar.put(_rule_1, _definition);
            boolean _isTerm = new_.isTerm();
            if (_isTerm) {
              String _rule_2 = new_.getRule();
              newterms.add(0, _rule_2);
            }
          }
        }
        Iterables.<String>addAll(terminals, newterms);
        long _xifexpression = (long) 0;
        boolean _isHasLbr = test.isHasLbr();
        if (_isHasLbr) {
          int _lbr = test.getLbr();
          _xifexpression = _lbr;
        } else {
          _xifexpression = ICC.DEEPENING_LBR_DEFAULT;
        }
        final long lbr = _xifexpression;
        long _xifexpression_1 = (long) 0;
        boolean _isHasLbrInitial = test.isHasLbrInitial();
        if (_isHasLbrInitial) {
          int _lbrInitial = test.getLbrInitial();
          _xifexpression_1 = _lbrInitial;
        } else {
          _xifexpression_1 = ICC.INITIAL_LBR;
        }
        final long lbrInitial = _xifexpression_1;
        ICC _iCC = new ICC(lbr, terminals, grammar);
        final ICC icc = _iCC;
        final ArrayList<Integer> range = CollectionLiterals.<Integer>newArrayList();
        EList<Member> _members_2 = test.getMembers();
        Iterable<Apply> _filter_3 = Iterables.<Apply>filter(_members_2, Apply.class);
        for (final Apply apply : _filter_3) {
          {
            int _xifexpression_2 = (int) 0;
            boolean _isHasNum = apply.isHasNum();
            if (_isHasNum) {
              int _num = apply.getNum();
              _xifexpression_2 = _num;
            } else {
              _xifexpression_2 = 10;
            }
            final int num = _xifexpression_2;
            boolean _isHasMax = apply.isHasMax();
            if (_isHasMax) {
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, num, true);
              final Function1<Integer,Integer> _function = new Function1<Integer,Integer>() {
                public Integer apply(final Integer it) {
                  int _minOrIt = apply.getMinOrIt();
                  int _max = apply.getMax();
                  int _minOrIt_1 = apply.getMinOrIt();
                  int _minus = (_max - _minOrIt_1);
                  int _multiply = ((it).intValue() * _minus);
                  int _divide = (_multiply / num);
                  int _plus = (_minOrIt + _divide);
                  return Integer.valueOf(_plus);
                }
              };
              Iterable<Integer> _map = IterableExtensions.<Integer, Integer>map(_doubleDotLessThan, _function);
              Iterables.<Integer>addAll(range, _map);
            } else {
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, num, true);
              final Function1<Integer,Integer> _function_1 = new Function1<Integer,Integer>() {
                public Integer apply(final Integer it) {
                  int _minOrIt = apply.getMinOrIt();
                  int _plus = (_minOrIt + (it).intValue());
                  return Integer.valueOf(_plus);
                }
              };
              Iterable<Integer> _map_1 = IterableExtensions.<Integer, Integer>map(_doubleDotLessThan_1, _function_1);
              Iterables.<Integer>addAll(range, _map_1);
            }
          }
        }
        String _xifexpression_2 = null;
        boolean _isHasStartrule = test.isHasStartrule();
        if (_isHasStartrule) {
          AbstractRule _startrule = test.getStartrule();
          String _name_1 = _startrule.getName();
          _xifexpression_2 = _name_1;
        } else {
          Grammar _ref_2 = test.getRef();
          EList<AbstractRule> _rules = _ref_2.getRules();
          Iterable<ParserRule> _filter_4 = Iterables.<ParserRule>filter(_rules, ParserRule.class);
          ParserRule _head = IterableExtensions.<ParserRule>head(_filter_4);
          String _name_2 = _head.getName();
          _xifexpression_2 = _name_2;
        }
        final String startrule = _xifexpression_2;
        StringConcatenation _builder = new StringConcatenation();
        String _name_3 = test.getName();
        _builder.append(_name_3, "");
        _builder.append(".htm");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<html>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<head>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<title>");
        String _name_4 = test.getName();
        _builder_1.append(_name_4, "		");
        _builder_1.append("</title>");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("</head>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<body>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<p><table border=\"1\" width=\"640\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<th colspan=\"2\">Generated tests</th>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</tr>");
        _builder_1.newLine();
        {
          boolean _hasElements = false;
          for(final Integer i : range) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("<tr>");
              _builder_2.newLine();
              _builder_2.append("\t\t\t\t\t\t\t\t\t");
              _builder_2.append("<td colspan=\"2\">&nbsp;</td>");
              _builder_2.newLine();
              _builder_2.append("\t\t\t\t\t\t\t\t");
              _builder_2.append("</tr>");
              _builder_1.appendImmediate(_builder_2.toString(), "		");
            }
            _builder_1.append("\t\t");
            _builder_1.append("<tr>");
            _builder_1.newLine();
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("<td>");
            _builder_1.append(i, "			");
            _builder_1.append("</td>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t");
            _builder_1.append("</tr>");
            _builder_1.newLine();
            _builder_1.append("\t\t");
            _builder_1.append("<tr>");
            _builder_1.newLine();
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("<td><code>");
            SG _get = grammar.get(startrule);
            Index<String> _iterate = icc.iterate(_get, lbrInitial);
            Iterator<String> _iterator = _iterate.iterator((i).intValue());
            String _head_1 = IteratorExtensions.<String>head(_iterator);
            _builder_1.append(_head_1, "			");
            _builder_1.append("</code></td>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t");
            _builder_1.append("</tr>");
            _builder_1.newLine();
          }
        }
        _builder_1.append("\t\t");
        _builder_1.append("</table></p>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<p><table border=\"1\" width=\"640\">");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<th colspan=\"2\">Generated from the derived specification</th>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("</tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<td>Initial LBR</td>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<td>");
        _builder_1.append(lbrInitial, "				");
        _builder_1.append("</td>");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t");
        _builder_1.append("</tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<td>LBR</td>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t");
        _builder_1.append("<td>");
        _builder_1.append(lbr, "				");
        _builder_1.append("</td>");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t");
        _builder_1.append("</tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("<tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<td colspan=\"2\">&nbsp;</td>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</tr>");
        _builder_1.newLine();
        {
          int _size = terminals.size();
          ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_size, 0, false);
          for(final Integer ti : _greaterThanDoubleDot) {
            _builder_1.append("\t\t");
            _builder_1.append("<tr>");
            _builder_1.newLine();
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("<td>Terminal #");
            _builder_1.append(ti, "			");
            _builder_1.append("</td>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("<td>");
            String _get_1 = terminals.get((ti).intValue());
            _builder_1.append(_get_1, "			");
            _builder_1.append("</td>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t");
            _builder_1.append("</tr>");
            _builder_1.newLine();
          }
        }
        _builder_1.append("\t\t");
        _builder_1.append("<tr>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("<td colspan=\"2\">&nbsp;</td>");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("</tr>");
        _builder_1.newLine();
        {
          Set<Entry<String,SG>> _entrySet = grammar.entrySet();
          for(final Entry<String, SG> ge : _entrySet) {
            _builder_1.append("\t\t");
            _builder_1.append("<tr>");
            _builder_1.newLine();
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("<td>Rule ");
            String _key = ge.getKey();
            _builder_1.append(_key, "			");
            _builder_1.append("</td>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("<td>");
            SG _value = ge.getValue();
            _builder_1.append(_value, "			");
            _builder_1.append("</td>");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t");
            _builder_1.append("</tr>");
            _builder_1.newLine();
          }
        }
        _builder_1.append("\t\t");
        _builder_1.append("</table></p>");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("</body>");
        _builder_1.newLine();
        _builder_1.append("</html>\t");
        _builder_1.newLine();
        fsa.generateFile(_builder.toString(), _builder_1);
      }
    }
  }
}
