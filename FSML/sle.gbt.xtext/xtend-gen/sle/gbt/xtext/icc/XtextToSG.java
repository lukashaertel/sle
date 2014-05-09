package sle.gbt.xtext.icc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CharacterRange;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EOF;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.NegatedToken;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.UntilToken;
import org.eclipse.xtext.Wildcard;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import sle.gbt.sg.Alternative;
import sle.gbt.sg.Any;
import sle.gbt.sg.Negation;
import sle.gbt.sg.Optional;
import sle.gbt.sg.Plus;
import sle.gbt.sg.Range;
import sle.gbt.sg.Reference;
import sle.gbt.sg.SG;
import sle.gbt.sg.Sequence;
import sle.gbt.sg.SgFactory;
import sle.gbt.sg.Single;
import sle.gbt.sg.Star;
import sle.gbt.sg.Until;

@SuppressWarnings("all")
public class XtextToSG {
  @Extension
  private static SgFactory sgFactory = SgFactory.eINSTANCE;
  
  public final static String KEYWORD_HEADER = "keyword:";
  
  public static List<String> terminalsFrom(final Grammar grammar) {
    LinkedList<String> _xblockexpression = null;
    {
      final LinkedList<String> result = CollectionLiterals.<String>newLinkedList();
      EList<Grammar> _usedGrammars = grammar.getUsedGrammars();
      int _size = _usedGrammars.size();
      ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_size, 0, false);
      for (final Integer i : _greaterThanDoubleDot) {
        EList<Grammar> _usedGrammars_1 = grammar.getUsedGrammars();
        Grammar _get = _usedGrammars_1.get((i).intValue());
        List<String> _terminalsFrom = XtextToSG.terminalsFrom(_get);
        Iterables.<String>addAll(result, _terminalsFrom);
      }
      EList<AbstractRule> _rules = grammar.getRules();
      int _size_1 = _rules.size();
      ExclusiveRange _greaterThanDoubleDot_1 = new ExclusiveRange(_size_1, 0, false);
      for (final Integer i_1 : _greaterThanDoubleDot_1) {
        {
          EList<AbstractRule> _rules_1 = grammar.getRules();
          final AbstractRule rule = _rules_1.get((i_1).intValue());
          boolean _matched = false;
          if (!_matched) {
            if (rule instanceof EnumRule) {
              final EnumRule _enumRule = (EnumRule)rule;
              _matched=true;
              TreeIterator<EObject> _eAllContents = _enumRule.eAllContents();
              Iterator<EnumLiteralDeclaration> _filter = Iterators.<EnumLiteralDeclaration>filter(_eAllContents, EnumLiteralDeclaration.class);
              final Function1<EnumLiteralDeclaration,String> _function = new Function1<EnumLiteralDeclaration,String>() {
                public String apply(final EnumLiteralDeclaration it) {
                  Keyword _literal = it.getLiteral();
                  String _value = _literal.getValue();
                  String _plus = (XtextToSG.KEYWORD_HEADER + _value);
                  return _plus;
                }
              };
              Iterator<String> _map = IteratorExtensions.<EnumLiteralDeclaration, String>map(_filter, _function);
              Iterable<String> _iterable = IteratorExtensions.<String>toIterable(_map);
              Iterables.<String>addAll(result, _iterable);
            }
          }
          if (!_matched) {
            if (rule instanceof ParserRule) {
              final ParserRule _parserRule = (ParserRule)rule;
              _matched=true;
              TreeIterator<EObject> _eAllContents = _parserRule.eAllContents();
              Iterator<Keyword> _filter = Iterators.<Keyword>filter(_eAllContents, Keyword.class);
              final Function1<Keyword,String> _function = new Function1<Keyword,String>() {
                public String apply(final Keyword it) {
                  String _value = it.getValue();
                  String _plus = (XtextToSG.KEYWORD_HEADER + _value);
                  return _plus;
                }
              };
              Iterator<String> _map = IteratorExtensions.<Keyword, String>map(_filter, _function);
              Iterable<String> _iterable = IteratorExtensions.<String>toIterable(_map);
              Iterables.<String>addAll(result, _iterable);
            }
          }
          if (!_matched) {
            if (rule instanceof TerminalRule) {
              final TerminalRule _terminalRule = (TerminalRule)rule;
              _matched=true;
              String _name = _terminalRule.getName();
              result.add(_name);
            }
          }
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public static Map<String,SG> grammarFrom(final Grammar grammar) {
    HashMap<String,SG> _xblockexpression = null;
    {
      final HashMap<String,SG> result = CollectionLiterals.<String, SG>newHashMap();
      EList<Grammar> _usedGrammars = grammar.getUsedGrammars();
      int _size = _usedGrammars.size();
      ExclusiveRange _greaterThanDoubleDot = new ExclusiveRange(_size, 0, false);
      for (final Integer i : _greaterThanDoubleDot) {
        EList<Grammar> _usedGrammars_1 = grammar.getUsedGrammars();
        Grammar _get = _usedGrammars_1.get((i).intValue());
        Map<String,SG> _grammarFrom = XtextToSG.grammarFrom(_get);
        result.putAll(_grammarFrom);
      }
      EList<AbstractRule> _rules = grammar.getRules();
      int _size_1 = _rules.size();
      ExclusiveRange _greaterThanDoubleDot_1 = new ExclusiveRange(_size_1, 0, false);
      for (final Integer i_1 : _greaterThanDoubleDot_1) {
        {
          EList<AbstractRule> _rules_1 = grammar.getRules();
          final AbstractRule rule = _rules_1.get((i_1).intValue());
          String _name = rule.getName();
          AbstractElement _alternatives = rule.getAlternatives();
          SG _xtextToSG = XtextToSG.xtextToSG(_alternatives);
          result.put(_name, _xtextToSG);
        }
      }
      List<String> _terminalsFrom = XtextToSG.terminalsFrom(grammar);
      final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
        public Boolean apply(final String it) {
          boolean _startsWith = it.startsWith(XtextToSG.KEYWORD_HEADER);
          return Boolean.valueOf(_startsWith);
        }
      };
      Iterable<String> _filter = IterableExtensions.<String>filter(_terminalsFrom, _function);
      for (final String keyword : _filter) {
        Single _createSingle = XtextToSG.sgFactory.createSingle();
        final Procedure1<Single> _function_1 = new Procedure1<Single>() {
          public void apply(final Single it) {
            int _length = XtextToSG.KEYWORD_HEADER.length();
            String _substring = keyword.substring(_length);
            it.setToken(_substring);
          }
        };
        Single _doubleArrow = ObjectExtensions.<Single>operator_doubleArrow(_createSingle, _function_1);
        result.put(keyword, _doubleArrow);
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public static SG xtextToSG(final AbstractElement e) {
    SG _xtextToSG_ = XtextToSG.xtextToSG_(e);
    String _cardinality = e.getCardinality();
    SG _applyCardinality = XtextToSG.applyCardinality(_xtextToSG_, _cardinality);
    return _applyCardinality;
  }
  
  private static SG applyCardinality(final SG sg, final String card) {
    SG _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(card,"?")) {
        _matched=true;
        Optional _createOptional = XtextToSG.sgFactory.createOptional();
        final Procedure1<Optional> _function = new Procedure1<Optional>() {
          public void apply(final Optional it) {
            it.setOf(sg);
          }
        };
        Optional _doubleArrow = ObjectExtensions.<Optional>operator_doubleArrow(_createOptional, _function);
        _switchResult = _doubleArrow;
      }
    }
    if (!_matched) {
      if (Objects.equal(card,"+")) {
        _matched=true;
        Plus _createPlus = XtextToSG.sgFactory.createPlus();
        final Procedure1<Plus> _function_1 = new Procedure1<Plus>() {
          public void apply(final Plus it) {
            it.setOf(sg);
          }
        };
        Plus _doubleArrow_1 = ObjectExtensions.<Plus>operator_doubleArrow(_createPlus, _function_1);
        _switchResult = _doubleArrow_1;
      }
    }
    if (!_matched) {
      if (Objects.equal(card,"*")) {
        _matched=true;
        Star _createStar = XtextToSG.sgFactory.createStar();
        final Procedure1<Star> _function_2 = new Procedure1<Star>() {
          public void apply(final Star it) {
            it.setOf(sg);
          }
        };
        Star _doubleArrow_2 = ObjectExtensions.<Star>operator_doubleArrow(_createStar, _function_2);
        _switchResult = _doubleArrow_2;
      }
    }
    if (!_matched) {
      _switchResult = sg;
    }
    return _switchResult;
  }
  
  private static SG _xtextToSG_(final AbstractElement e) {
    String _plus = ("Cannot dispatch " + e);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException(_plus);
    throw _unsupportedOperationException;
  }
  
  private static SG _xtextToSG_(final NegatedToken e) {
    Negation _createNegation = XtextToSG.sgFactory.createNegation();
    final Procedure1<Negation> _function = new Procedure1<Negation>() {
      public void apply(final Negation it) {
        AbstractElement _terminal = e.getTerminal();
        SG _xtextToSG = XtextToSG.xtextToSG(_terminal);
        it.setOf(_xtextToSG);
      }
    };
    Negation _doubleArrow = ObjectExtensions.<Negation>operator_doubleArrow(_createNegation, _function);
    return _doubleArrow;
  }
  
  private static SG _xtextToSG_(final UntilToken e) {
    Until _createUntil = XtextToSG.sgFactory.createUntil();
    final Procedure1<Until> _function = new Procedure1<Until>() {
      public void apply(final Until it) {
        AbstractElement _terminal = e.getTerminal();
        SG _xtextToSG = XtextToSG.xtextToSG(_terminal);
        it.setOf(_xtextToSG);
      }
    };
    Until _doubleArrow = ObjectExtensions.<Until>operator_doubleArrow(_createUntil, _function);
    return _doubleArrow;
  }
  
  private static SG _xtextToSG_(final Assignment e) {
    AbstractElement _terminal = e.getTerminal();
    SG _xtextToSG = XtextToSG.xtextToSG(_terminal);
    return _xtextToSG;
  }
  
  private static SG _xtextToSG_(final CharacterRange e) {
    Range _createRange = XtextToSG.sgFactory.createRange();
    final Procedure1<Range> _function = new Procedure1<Range>() {
      public void apply(final Range it) {
        Keyword _left = e.getLeft();
        String _value = _left.getValue();
        it.setMin(_value);
        Keyword _right = e.getRight();
        String _value_1 = _right.getValue();
        it.setMax(_value_1);
      }
    };
    Range _doubleArrow = ObjectExtensions.<Range>operator_doubleArrow(_createRange, _function);
    return _doubleArrow;
  }
  
  private static SG _xtextToSG_(final Alternatives e) {
    EList<AbstractElement> _elements = e.getElements();
    SG _calt = XtextToSG.calt(_elements);
    return _calt;
  }
  
  /**
   * Constructs a balanced alternative tree
   */
  private static SG calt(final List<AbstractElement> elements) {
    SG _switchResult = null;
    int _size = elements.size();
    final int _switchValue = _size;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,0)) {
        _matched=true;
        IllegalArgumentException _illegalArgumentException = new IllegalArgumentException();
        throw _illegalArgumentException;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,1)) {
        _matched=true;
        AbstractElement _get = elements.get(0);
        SG _xtextToSG = XtextToSG.xtextToSG(_get);
        _switchResult = _xtextToSG;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,2)) {
        _matched=true;
        Alternative _createAlternative = XtextToSG.sgFactory.createAlternative();
        final Procedure1<Alternative> _function = new Procedure1<Alternative>() {
          public void apply(final Alternative it) {
            AbstractElement _get = elements.get(0);
            SG _xtextToSG = XtextToSG.xtextToSG(_get);
            it.setLeft(_xtextToSG);
            AbstractElement _get_1 = elements.get(1);
            SG _xtextToSG_1 = XtextToSG.xtextToSG(_get_1);
            it.setRight(_xtextToSG_1);
          }
        };
        Alternative _doubleArrow = ObjectExtensions.<Alternative>operator_doubleArrow(_createAlternative, _function);
        _switchResult = _doubleArrow;
      }
    }
    if (!_matched) {
      Alternative _createAlternative_1 = XtextToSG.sgFactory.createAlternative();
      final Procedure1<Alternative> _function_1 = new Procedure1<Alternative>() {
        public void apply(final Alternative it) {
          int _size = elements.size();
          int _divide = (_size / 2);
          List<AbstractElement> _subList = elements.subList(0, _divide);
          SG _calt = XtextToSG.calt(_subList);
          it.setLeft(_calt);
          int _size_1 = elements.size();
          int _divide_1 = (_size_1 / 2);
          int _size_2 = elements.size();
          List<AbstractElement> _subList_1 = elements.subList(_divide_1, _size_2);
          SG _calt_1 = XtextToSG.calt(_subList_1);
          it.setRight(_calt_1);
        }
      };
      Alternative _doubleArrow_1 = ObjectExtensions.<Alternative>operator_doubleArrow(_createAlternative_1, _function_1);
      _switchResult = _doubleArrow_1;
    }
    return _switchResult;
  }
  
  private static SG _xtextToSG_(final Group e) {
    EList<AbstractElement> _elements = e.getElements();
    SG _cseq = XtextToSG.cseq(_elements);
    return _cseq;
  }
  
  /**
   * Constructs a balanced sequence tree
   */
  private static SG cseq(final List<AbstractElement> elements) {
    SG _switchResult = null;
    int _size = elements.size();
    final int _switchValue = _size;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,0)) {
        _matched=true;
        IllegalArgumentException _illegalArgumentException = new IllegalArgumentException();
        throw _illegalArgumentException;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,1)) {
        _matched=true;
        AbstractElement _get = elements.get(0);
        SG _xtextToSG = XtextToSG.xtextToSG(_get);
        _switchResult = _xtextToSG;
      }
    }
    if (!_matched) {
      if (Objects.equal(_switchValue,2)) {
        _matched=true;
        Sequence _createSequence = XtextToSG.sgFactory.createSequence();
        final Procedure1<Sequence> _function = new Procedure1<Sequence>() {
          public void apply(final Sequence it) {
            AbstractElement _get = elements.get(0);
            SG _xtextToSG = XtextToSG.xtextToSG(_get);
            it.setLeft(_xtextToSG);
            AbstractElement _get_1 = elements.get(1);
            SG _xtextToSG_1 = XtextToSG.xtextToSG(_get_1);
            it.setRight(_xtextToSG_1);
          }
        };
        Sequence _doubleArrow = ObjectExtensions.<Sequence>operator_doubleArrow(_createSequence, _function);
        _switchResult = _doubleArrow;
      }
    }
    if (!_matched) {
      Sequence _createSequence_1 = XtextToSG.sgFactory.createSequence();
      final Procedure1<Sequence> _function_1 = new Procedure1<Sequence>() {
        public void apply(final Sequence it) {
          int _size = elements.size();
          int _divide = (_size / 2);
          List<AbstractElement> _subList = elements.subList(0, _divide);
          SG _cseq = XtextToSG.cseq(_subList);
          it.setLeft(_cseq);
          int _size_1 = elements.size();
          int _divide_1 = (_size_1 / 2);
          int _size_2 = elements.size();
          List<AbstractElement> _subList_1 = elements.subList(_divide_1, _size_2);
          SG _cseq_1 = XtextToSG.cseq(_subList_1);
          it.setRight(_cseq_1);
        }
      };
      Sequence _doubleArrow_1 = ObjectExtensions.<Sequence>operator_doubleArrow(_createSequence_1, _function_1);
      _switchResult = _doubleArrow_1;
    }
    return _switchResult;
  }
  
  private static SG _xtextToSG_(final EnumLiteralDeclaration e) {
    Keyword _literal = e.getLiteral();
    SG _xtextToSG = XtextToSG.xtextToSG(_literal);
    return _xtextToSG;
  }
  
  private static SG _xtextToSG_(final UnorderedGroup e) {
    return null;
  }
  
  private static SG _xtextToSG_(final CrossReference e) {
    AbstractElement _terminal = e.getTerminal();
    SG _xtextToSG = XtextToSG.xtextToSG(_terminal);
    return _xtextToSG;
  }
  
  private static SG _xtextToSG_(final EOF e) {
    return null;
  }
  
  private static SG _xtextToSG_(final Keyword e) {
    Single _createSingle = XtextToSG.sgFactory.createSingle();
    final Procedure1<Single> _function = new Procedure1<Single>() {
      public void apply(final Single it) {
        String _value = e.getValue();
        it.setToken(_value);
      }
    };
    Single _doubleArrow = ObjectExtensions.<Single>operator_doubleArrow(_createSingle, _function);
    return _doubleArrow;
  }
  
  private static SG _xtextToSG_(final RuleCall e) {
    Reference _createReference = XtextToSG.sgFactory.createReference();
    final Procedure1<Reference> _function = new Procedure1<Reference>() {
      public void apply(final Reference it) {
        AbstractRule _rule = e.getRule();
        String _name = _rule.getName();
        it.setTo(_name);
      }
    };
    Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function);
    return _doubleArrow;
  }
  
  private static SG _xtextToSG_(final Wildcard e) {
    Any _createAny = XtextToSG.sgFactory.createAny();
    return _createAny;
  }
  
  private static SG xtextToSG_(final AbstractElement e) {
    if (e instanceof Alternatives) {
      return _xtextToSG_((Alternatives)e);
    } else if (e instanceof Group) {
      return _xtextToSG_((Group)e);
    } else if (e instanceof NegatedToken) {
      return _xtextToSG_((NegatedToken)e);
    } else if (e instanceof UnorderedGroup) {
      return _xtextToSG_((UnorderedGroup)e);
    } else if (e instanceof UntilToken) {
      return _xtextToSG_((UntilToken)e);
    } else if (e instanceof Assignment) {
      return _xtextToSG_((Assignment)e);
    } else if (e instanceof CharacterRange) {
      return _xtextToSG_((CharacterRange)e);
    } else if (e instanceof CrossReference) {
      return _xtextToSG_((CrossReference)e);
    } else if (e instanceof EOF) {
      return _xtextToSG_((EOF)e);
    } else if (e instanceof EnumLiteralDeclaration) {
      return _xtextToSG_((EnumLiteralDeclaration)e);
    } else if (e instanceof Keyword) {
      return _xtextToSG_((Keyword)e);
    } else if (e instanceof RuleCall) {
      return _xtextToSG_((RuleCall)e);
    } else if (e instanceof Wildcard) {
      return _xtextToSG_((Wildcard)e);
    } else if (e != null) {
      return _xtextToSG_(e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
