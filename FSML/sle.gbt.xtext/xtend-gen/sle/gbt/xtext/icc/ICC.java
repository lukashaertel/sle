package sle.gbt.xtext.icc;

import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import sle.gbt.index.CharIndices;
import sle.gbt.index.Index;
import sle.gbt.index.IndexList;
import sle.gbt.index.IndexSingleton;
import sle.gbt.index.Indices;
import sle.gbt.index.complex.IndexCache;
import sle.gbt.index.complex.IndexConcat;
import sle.gbt.index.complex.IndexFilter;
import sle.gbt.index.complex.IndexPair;
import sle.gbt.index.complex.IndexProduce;
import sle.gbt.index.complex.IndexZip;
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
import sle.gbt.utils.Iterables;
import sle.gbt.utils.Ranges;

@SuppressWarnings("all")
public class ICC {
  @Extension
  private static SgFactory sgFactory = SgFactory.eINSTANCE;
  
  /**
   * Initial value for the length/breadth parameter
   */
  public final static long INITIAL_LBR = 782L;
  
  /**
   * Initial value for the length/breadth parameter
   */
  public final static long DEEPENING_LBR_DEFAULT = 3L;
  
  /**
   * Reduction factor for the length/breadth parameter
   */
  private final long deepeningLBR;
  
  /**
   * List of terminals in ascending precedence
   */
  private final List<String> terminals;
  
  /**
   * Grammar mapping identifiers to constructs
   */
  private final Map<String,SG> grammar;
  
  /**
   * Cache that maps identical constructs to the same indices for sharing purposes
   */
  private final HashMap<SG,Index<String>> cache = new Function0<HashMap<SG,Index<String>>>() {
    public HashMap<SG,Index<String>> apply() {
      HashMap<SG,Index<String>> _hashMap = new HashMap<SG, Index<String>>();
      return _hashMap;
    }
  }.apply();
  
  /**
   * Creates a new ICC
   * @param terminals List of terminals in ascending precedence
   * @param grammar Grammar-function mapping identifiers to constructs
   */
  public ICC(final long deepeningLBR, final List<String> terminals, final Map<String,SG> grammar) {
    this.deepeningLBR = deepeningLBR;
    this.terminals = terminals;
    this.grammar = grammar;
  }
  
  /**
   * Tries to get a precalculated result; if none present calculates the
   * result, wraps it inside a cache, stores and returns it
   * @param sg The construct to iterate
   * @param lbr The length/breadth ratio to use
   */
  public Index<String> iterate(final SG sg, final long lbr) {
    Index<String> _xifexpression = null;
    boolean _containsKey = this.cache.containsKey(sg);
    if (_containsKey) {
      Index<String> _get = this.cache.get(sg);
      _xifexpression = _get;
    } else {
      IndexCache<String> _xblockexpression = null;
      {
        Index<String> _iterate_ = this.iterate_(sg, lbr);
        final IndexCache<String> result = Indices.<String>cache(_iterate_);
        this.cache.put(sg, result);
        _xblockexpression = (result);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * Dispatcher for the iteration
   */
  private Index<String> _iterate_(final SG sg, final long lbr) {
    String _plus = ("Cannot dispatch " + sg);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException(_plus);
    throw _unsupportedOperationException;
  }
  
  /**
   * Iterates the any character construct by enumerating sigma
   */
  private Index<String> _iterate_(final Any sg, final long lbr) {
    Index<String> _mapToString = Indices.mapToString(CharIndices.SIGMA);
    return _mapToString;
  }
  
  /**
   * Iterates the range by enumerating the ranges characters
   */
  private Index<String> _iterate_(final Range sg, final long lbr) {
    String _min = sg.getMin();
    char _charAt = _min.charAt(0);
    String _max = sg.getMax();
    char _charAt_1 = _max.charAt(0);
    List<Character> _chars = Ranges.chars(_charAt, _charAt_1);
    IndexList<Character> _list = Indices.<Character>list(_chars);
    Index<String> _mapToString = Indices.mapToString(_list);
    return _mapToString;
  }
  
  /**
   * Iterates the single token by just returning it
   */
  private Index<String> _iterate_(final Single sg, final long lbr) {
    String _token = sg.getToken();
    IndexSingleton<String> _singleton = Indices.<String>singleton(_token);
    return _singleton;
  }
  
  /**
   * Iterates the until construct by appending its token to all strings not containing its token
   */
  private Index<String> _iterate_(final Until sg, final long lbr) {
    IndexSingleton<String> _singleton = Indices.<String>singleton("");
    IndexProduce<? extends Iterable<Character>> _combinations = Indices.<Character>combinations(CharIndices.SIGMA, lbr, null);
    Index<String> _mapFoldChars = Indices.mapFoldChars(_combinations);
    IndexConcat<String> _concatWith = Indices.<String>concatWith(_singleton, _mapFoldChars);
    final Predicate<String> _function = new Predicate<String>() {
      public boolean apply(final String s) {
        SG _of = sg.getOf();
        boolean _doesAcceptAny = ICC.this.doesAcceptAny(_of, s);
        boolean _not = (!_doesAcceptAny);
        return _not;
      }
    };
    IndexFilter<String> _filter = Indices.<String>filter(_concatWith, _function);
    SG _of = sg.getOf();
    Index<String> _iterate = this.iterate(_of, lbr);
    IndexPair<String,String> _pairWith = Indices.<String, String>pairWith(_filter, _iterate);
    Index<String> _mapConcat = Indices.mapConcat(_pairWith);
    return _mapConcat;
  }
  
  /**
   * Iterates the sequence by enumerating all pairs of the left-hand and the right-hand
   */
  private Index<String> _iterate_(final Sequence sg, final long lbr) {
    SG _left = sg.getLeft();
    Index<String> _iterate = this.iterate(_left, lbr);
    SG _right = sg.getRight();
    Index<String> _iterate_1 = this.iterate(_right, lbr);
    IndexPair<String,String> _pairWith = Indices.<String, String>pairWith(_iterate, _iterate_1);
    Index<String> _mapConcat = Indices.mapConcat(_pairWith);
    return _mapConcat;
  }
  
  /**
   * Iterates the alternative by interleaving enumeration
   */
  private Index<String> _iterate_(final Alternative sg, final long lbr) {
    SG _left = sg.getLeft();
    Index<String> _iterate = this.iterate(_left, lbr);
    SG _right = sg.getRight();
    Index<String> _iterate_1 = this.iterate(_right, lbr);
    IndexZip<String> _zipWith = Indices.<String>zipWith(_iterate, _iterate_1);
    return _zipWith;
  }
  
  /**
   * Iterates the optional construct by iterating its inner construct and prepending the empty-length string
   */
  private Index<String> _iterate_(final Optional sg, final long lbr) {
    IndexSingleton<String> _singleton = Indices.<String>singleton("");
    SG _of = sg.getOf();
    Index<String> _iterate = this.iterate(_of, lbr);
    IndexConcat<String> _concatWith = Indices.<String>concatWith(_singleton, _iterate);
    return _concatWith;
  }
  
  /**
   * Iterates the plus construct by enumerating all combinations of its inner construct
   */
  private Index<String> _iterate_(final Plus sg, final long lbr) {
    SG _of = sg.getOf();
    long _divide = (lbr / this.deepeningLBR);
    Index<String> _iterate = this.iterate(_of, _divide);
    IndexProduce<? extends Iterable<String>> _combinations = Indices.<String>combinations(_iterate, lbr, null);
    Index<String> _mapFoldString = Indices.mapFoldString(_combinations);
    return _mapFoldString;
  }
  
  /**
   * Iterates the star construct just like the plus construct with the empty-length string prepended
   */
  private Index<String> _iterate_(final Star sg, final long lbr) {
    IndexSingleton<String> _singleton = Indices.<String>singleton("");
    SG _of = sg.getOf();
    long _divide = (lbr / this.deepeningLBR);
    Index<String> _iterate = this.iterate(_of, _divide);
    IndexProduce<? extends Iterable<String>> _combinations = Indices.<String>combinations(_iterate, lbr, null);
    Index<String> _mapFoldString = Indices.mapFoldString(_combinations);
    IndexConcat<String> _concatWith = Indices.<String>concatWith(_singleton, _mapFoldString);
    return _concatWith;
  }
  
  /**
   * ?????????????????
   */
  private Index<String> _iterate_(final Negation sg, final long lbr) {
    IndexSingleton<String> _singleton = Indices.<String>singleton("");
    IndexProduce<? extends Iterable<Character>> _combinations = Indices.<Character>combinations(CharIndices.SIGMA, lbr, null);
    Index<String> _mapFoldChars = Indices.mapFoldChars(_combinations);
    IndexConcat<String> _concatWith = Indices.<String>concatWith(_singleton, _mapFoldChars);
    final Predicate<String> _function = new Predicate<String>() {
      public boolean apply(final String s) {
        SG _of = sg.getOf();
        boolean _doesAcceptAny = ICC.this.doesAcceptAny(_of, s);
        boolean _not = (!_doesAcceptAny);
        return _not;
      }
    };
    IndexFilter<String> _filter = Indices.<String>filter(_concatWith, _function);
    return _filter;
  }
  
  /**
   * Iterates the reference by checking if a terminal precedence is to be applied to
   * the iteration of the inner construct
   */
  private Index<String> _iterate_(final Reference sg, final long lbr) {
    IndexFilter<String> _xblockexpression = null;
    {
      String _to = sg.getTo();
      List<String> _after = ICC.after(this.terminals, _to);
      final Function1<String,SG> _function = new Function1<String,SG>() {
        public SG apply(final String id) {
          SG _get = ICC.this.grammar.get(id);
          return _get;
        }
      };
      final List<SG> higher = ListExtensions.<String, SG>map(_after, _function);
      String _to_1 = sg.getTo();
      SG _get = this.grammar.get(_to_1);
      Index<String> _iterate = this.iterate(_get, lbr);
      final Predicate<String> _function_1 = new Predicate<String>() {
        public boolean apply(final String s) {
          final Function1<SG,Boolean> _function = new Function1<SG,Boolean>() {
            public Boolean apply(final SG t) {
              boolean _doesAccept = ICC.this.doesAccept(t, s);
              return Boolean.valueOf(_doesAccept);
            }
          };
          boolean _exists = IterableExtensions.<SG>exists(higher, _function);
          boolean _not = (!_exists);
          return _not;
        }
      };
      IndexFilter<String> _filter = Indices.<String>filter(_iterate, _function_1);
      _xblockexpression = (_filter);
    }
    return _xblockexpression;
  }
  
  /**
   * Returns all strings in the list that have a higher index
   * than the reference string or the empty list if the string is not contained
   */
  private static List<String> after(final List<String> strings, final String string) {
    List<String> _xblockexpression = null;
    {
      final int i = strings.indexOf(string);
      List<String> _xifexpression = null;
      int _minus = (-1);
      boolean _equals = (i == _minus);
      if (_equals) {
        List<String> _emptyList = CollectionLiterals.<String>emptyList();
        _xifexpression = _emptyList;
      } else {
        int _plus = (i + 1);
        int _length = ((Object[])Conversions.unwrapArray(strings, Object.class)).length;
        List<String> _subList = strings.subList(_plus, _length);
        _xifexpression = _subList;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  /**
   * Does accept returns true if the entire string is accepted by the construct
   */
  public boolean doesAccept(final SG sg, final String string) {
    Iterable<Integer> _accept = this.accept(sg, string);
    final Function1<Integer,Boolean> _function = new Function1<Integer,Boolean>() {
      public Boolean apply(final Integer it) {
        int _length = string.length();
        boolean _equals = ((it).intValue() == _length);
        return Boolean.valueOf(_equals);
      }
    };
    boolean _exists = IterableExtensions.<Integer>exists(_accept, _function);
    return _exists;
  }
  
  /**
   * Does accept any returns true if the any substring string is accepted by the construct
   */
  public boolean doesAcceptAny(final SG sg, final String string) {
    int _length = string.length();
    IntegerRange _upTo = new IntegerRange(0, _length);
    final Function1<Integer,Boolean> _function = new Function1<Integer,Boolean>() {
      public Boolean apply(final Integer l) {
        String _substring = string.substring((l).intValue());
        boolean _doesAccept = ICC.this.doesAccept(sg, _substring);
        return Boolean.valueOf(_doesAccept);
      }
    };
    boolean _exists = IterableExtensions.<Integer>exists(_upTo, _function);
    return _exists;
  }
  
  /**
   * Accept returns zero or more amounts of characters it can accept with the
   * given syntactic construct
   */
  protected Iterable<Integer> _accept(final SG sg, final String string) {
    String _plus = ("Cannot dispatch " + sg);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException(_plus);
    throw _unsupportedOperationException;
  }
  
  /**
   * Any accepts one character if the string is non-empty
   */
  protected Iterable<Integer> _accept(final Any sg, final String string) {
    Iterable<Integer> _xifexpression = null;
    int _length = string.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      Iterable<Integer> _one = Iterables.<Integer>one(Integer.valueOf(1));
      _xifexpression = _one;
    } else {
      Iterable<Integer> _none = Iterables.<Integer>none();
      _xifexpression = _none;
    }
    return _xifexpression;
  }
  
  /**
   * Range accepts one character if the string is non-empty and the first
   * character is inside of the given range
   */
  protected Iterable<Integer> _accept(final Range sg, final String string) {
    Iterable<Integer> _xifexpression = null;
    boolean _and = false;
    boolean _and_1 = false;
    int _length = string.length();
    boolean _greaterThan = (_length > 0);
    if (!_greaterThan) {
      _and_1 = false;
    } else {
      String _min = sg.getMin();
      char _charAt = _min.charAt(0);
      char _charAt_1 = string.charAt(0);
      boolean _lessEqualsThan = (_charAt <= _charAt_1);
      _and_1 = (_greaterThan && _lessEqualsThan);
    }
    if (!_and_1) {
      _and = false;
    } else {
      char _charAt_2 = string.charAt(0);
      String _max = sg.getMax();
      char _charAt_3 = _max.charAt(0);
      boolean _lessEqualsThan_1 = (_charAt_2 <= _charAt_3);
      _and = (_and_1 && _lessEqualsThan_1);
    }
    if (_and) {
      Iterable<Integer> _one = Iterables.<Integer>one(Integer.valueOf(1));
      _xifexpression = _one;
    } else {
      Iterable<Integer> _none = Iterables.<Integer>none();
      _xifexpression = _none;
    }
    return _xifexpression;
  }
  
  /**
   * Single accepts the length of its token if the string starts with the token
   */
  protected Iterable<Integer> _accept(final Single sg, final String string) {
    Iterable<Integer> _xifexpression = null;
    String _token = sg.getToken();
    boolean _startsWith = string.startsWith(_token);
    if (_startsWith) {
      String _token_1 = sg.getToken();
      int _length = _token_1.length();
      Iterable<Integer> _one = Iterables.<Integer>one(Integer.valueOf(_length));
      _xifexpression = _one;
    } else {
      Iterable<Integer> _none = Iterables.<Integer>none();
      _xifexpression = _none;
    }
    return _xifexpression;
  }
  
  /**
   * Accept all strings that end with the accepted until composee
   */
  protected Iterable<Integer> _accept(final Until sg, final String string) {
    int _length = string.length();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    final Function1<Integer,Boolean> _function = new Function1<Integer,Boolean>() {
      public Boolean apply(final Integer i) {
        SG _of = sg.getOf();
        String _substring = string.substring(0, (i).intValue());
        boolean _doesAcceptAny = ICC.this.doesAcceptAny(_of, _substring);
        boolean _not = (!_doesAcceptAny);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<Integer> _filter = IterableExtensions.<Integer>filter(_doubleDotLessThan, _function);
    final Function1<Integer,Iterable<Integer>> _function_1 = new Function1<Integer,Iterable<Integer>>() {
      public Iterable<Integer> apply(final Integer i) {
        SG _of = sg.getOf();
        String _substring = string.substring((i).intValue());
        Iterable<Integer> _accept = ICC.this.accept(_of, _substring);
        final Function1<Integer,Integer> _function = new Function1<Integer,Integer>() {
          public Integer apply(final Integer j) {
            int _plus = ((i).intValue() + (j).intValue());
            return Integer.valueOf(_plus);
          }
        };
        Iterable<Integer> _map = IterableExtensions.<Integer, Integer>map(_accept, _function);
        return _map;
      }
    };
    Iterable<Iterable<Integer>> _map = IterableExtensions.<Integer, Iterable<Integer>>map(_filter, _function_1);
    Iterable<Integer> _flatten = com.google.common.collect.Iterables.<Integer>concat(_map);
    return _flatten;
  }
  
  /**
   * Sequence accepts the second construct from all of the first constructs accepted lengths
   */
  protected Iterable<Integer> _accept(final Sequence sg, final String string) {
    SG _left = sg.getLeft();
    Iterable<Integer> _accept = this.accept(_left, string);
    final Function1<Integer,Iterable<Integer>> _function = new Function1<Integer,Iterable<Integer>>() {
      public Iterable<Integer> apply(final Integer l) {
        SG _right = sg.getRight();
        String _substring = string.substring((l).intValue());
        Iterable<Integer> _accept = ICC.this.accept(_right, _substring);
        final Function1<Integer,Integer> _function = new Function1<Integer,Integer>() {
          public Integer apply(final Integer it) {
            int _plus = ((it).intValue() + (l).intValue());
            return Integer.valueOf(_plus);
          }
        };
        Iterable<Integer> _map = IterableExtensions.<Integer, Integer>map(_accept, _function);
        return _map;
      }
    };
    Iterable<Iterable<Integer>> _map = IterableExtensions.<Integer, Iterable<Integer>>map(_accept, _function);
    Iterable<Integer> _flatten = com.google.common.collect.Iterables.<Integer>concat(_map);
    return _flatten;
  }
  
  /**
   * Alternative accepts the both alternatives individually and concatenates their results
   */
  protected Iterable<Integer> _accept(final Alternative sg, final String string) {
    SG _left = sg.getLeft();
    Iterable<Integer> _accept = this.accept(_left, string);
    SG _right = sg.getRight();
    Iterable<Integer> _accept_1 = this.accept(_right, string);
    Iterable<Integer> _plus = com.google.common.collect.Iterables.<Integer>concat(_accept, _accept_1);
    return _plus;
  }
  
  /**
   * Optional accepts based on its inner construct and prepends the empty length
   */
  protected Iterable<Integer> _accept(final Optional sg, final String string) {
    Iterable<Integer> _one = Iterables.<Integer>one(Integer.valueOf(0));
    SG _of = sg.getOf();
    Iterable<Integer> _accept = this.accept(_of, string);
    Iterable<Integer> _plus = com.google.common.collect.Iterables.<Integer>concat(_one, _accept);
    return _plus;
  }
  
  /**
   * Plus recursively repeats itself into the string
   */
  protected Iterable<Integer> _accept(final Plus sg, final String string) {
    Iterable<Integer> _xblockexpression = null;
    {
      SG _of = sg.getOf();
      final Iterable<Integer> first = this.accept(_of, string);
      final Function1<Integer,Iterable<Integer>> _function = new Function1<Integer,Iterable<Integer>>() {
        public Iterable<Integer> apply(final Integer l) {
          String _substring = string.substring((l).intValue());
          Iterable<Integer> _accept = ICC.this.accept(sg, _substring);
          final Function1<Integer,Integer> _function = new Function1<Integer,Integer>() {
            public Integer apply(final Integer it) {
              int _plus = ((it).intValue() + (l).intValue());
              return Integer.valueOf(_plus);
            }
          };
          Iterable<Integer> _map = IterableExtensions.<Integer, Integer>map(_accept, _function);
          return _map;
        }
      };
      Iterable<Iterable<Integer>> _map = IterableExtensions.<Integer, Iterable<Integer>>map(first, _function);
      Iterable<Integer> _flatten = com.google.common.collect.Iterables.<Integer>concat(_map);
      Iterable<Integer> _plus = com.google.common.collect.Iterables.<Integer>concat(first, _flatten);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  /**
   * Star uses the acceptor for plus and prepends the empty length
   */
  protected Iterable<Integer> _accept(final Star sg, final String string) {
    Iterable<Integer> _one = Iterables.<Integer>one(Integer.valueOf(0));
    Plus _createPlus = ICC.sgFactory.createPlus();
    final Procedure1<Plus> _function = new Procedure1<Plus>() {
      public void apply(final Plus it) {
        SG _of = sg.getOf();
        it.setOf(_of);
      }
    };
    Plus _doubleArrow = ObjectExtensions.<Plus>operator_doubleArrow(_createPlus, _function);
    Iterable<Integer> _accept = this.accept(_doubleArrow, string);
    Iterable<Integer> _plus = com.google.common.collect.Iterables.<Integer>concat(_one, _accept);
    return _plus;
  }
  
  /**
   * Negation rejects all indexes that are accepted by the composee
   */
  protected Iterable<Integer> _accept(final Negation sg, final String string) {
    int _length = string.length();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    final Function1<Integer,Boolean> _function = new Function1<Integer,Boolean>() {
      public Boolean apply(final Integer i) {
        SG _of = sg.getOf();
        String _substring = string.substring(0, (i).intValue());
        boolean _doesAcceptAny = ICC.this.doesAcceptAny(_of, _substring);
        boolean _not = (!_doesAcceptAny);
        return Boolean.valueOf(_not);
      }
    };
    Iterable<Integer> _filter = IterableExtensions.<Integer>filter(_doubleDotLessThan, _function);
    return _filter;
  }
  
  /**
   * Reference resolves the reference and accepts the construct mapped
   */
  protected Iterable<Integer> _accept(final Reference sg, final String string) {
    String _to = sg.getTo();
    SG _get = this.grammar.get(_to);
    Iterable<Integer> _accept = this.accept(_get, string);
    return _accept;
  }
  
  private Index<String> iterate_(final SG sg, final long lbr) {
    if (sg instanceof Alternative) {
      return _iterate_((Alternative)sg, lbr);
    } else if (sg instanceof Negation) {
      return _iterate_((Negation)sg, lbr);
    } else if (sg instanceof Optional) {
      return _iterate_((Optional)sg, lbr);
    } else if (sg instanceof Plus) {
      return _iterate_((Plus)sg, lbr);
    } else if (sg instanceof Sequence) {
      return _iterate_((Sequence)sg, lbr);
    } else if (sg instanceof Star) {
      return _iterate_((Star)sg, lbr);
    } else if (sg instanceof Until) {
      return _iterate_((Until)sg, lbr);
    } else if (sg instanceof Any) {
      return _iterate_((Any)sg, lbr);
    } else if (sg instanceof Range) {
      return _iterate_((Range)sg, lbr);
    } else if (sg instanceof Reference) {
      return _iterate_((Reference)sg, lbr);
    } else if (sg instanceof Single) {
      return _iterate_((Single)sg, lbr);
    } else if (sg != null) {
      return _iterate_(sg, lbr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sg, lbr).toString());
    }
  }
  
  public Iterable<Integer> accept(final SG sg, final String string) {
    if (sg instanceof Alternative) {
      return _accept((Alternative)sg, string);
    } else if (sg instanceof Negation) {
      return _accept((Negation)sg, string);
    } else if (sg instanceof Optional) {
      return _accept((Optional)sg, string);
    } else if (sg instanceof Plus) {
      return _accept((Plus)sg, string);
    } else if (sg instanceof Sequence) {
      return _accept((Sequence)sg, string);
    } else if (sg instanceof Star) {
      return _accept((Star)sg, string);
    } else if (sg instanceof Until) {
      return _accept((Until)sg, string);
    } else if (sg instanceof Any) {
      return _accept((Any)sg, string);
    } else if (sg instanceof Range) {
      return _accept((Range)sg, string);
    } else if (sg instanceof Reference) {
      return _accept((Reference)sg, string);
    } else if (sg instanceof Single) {
      return _accept((Single)sg, string);
    } else if (sg != null) {
      return _accept(sg, string);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sg, string).toString());
    }
  }
}
