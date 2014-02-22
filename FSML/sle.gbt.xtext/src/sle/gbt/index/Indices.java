package sle.gbt.index;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Iterables;

import sle.gbt.index.complex.IndexConcat;
import sle.gbt.index.complex.IndexFilter;
import sle.gbt.index.complex.IndexLate;
import sle.gbt.index.complex.IndexLimit;
import sle.gbt.index.complex.IndexMap;
import sle.gbt.index.complex.IndexPair;
import sle.gbt.index.complex.IndexProduce;
import sle.gbt.index.complex.IndexZip;
import sle.gbt.index.complex.Tuple;
import static sle.gbt.utils.Iterables.*;

public class Indices {
	public static <Item> Index<? extends Iterable<Item>> combinationsFinite(
			final Index<? extends Item> source, final Long limit) {
		final Index<Iterable<Item>> sourceOnes = map(source,
				new Function<Item, Iterable<Item>>() {
					@Override
					public Iterable<Item> apply(Item arg0) {
						return one(arg0);
					}
				});
		if (limit != null && limit < 1)
			throw new IllegalArgumentException();
		else if (limit != null && limit == 1)
			return sourceOnes;
		else
			return concatWith(sourceOnes,
					late(new Supplier<Index<? extends Iterable<Item>>>() {
						@Override
						public Index<? extends Iterable<Item>> get() {

							return map(
									pairWith(
											source,
											combinationsFinite(source,
													limit == null ? null
															: limit - 1)),
									new Function<Tuple<Item, Iterable<Item>>, Iterable<Item>>() {
										@Override
										public Iterable<Item> apply(
												Tuple<Item, Iterable<Item>> x) {

											return then(x.left, x.right);
										}
									});
						}
					}));
	}

	/**
	 * Index of all combinations of any index, will return some items multiple
	 * times but works for infinite indices
	 * 
	 * @param items
	 *            Index of elements to be combined
	 * @param limit
	 *            Optional limit of length
	 */
	public static <Item> IndexProduce<? extends Iterable<Item>> combinationsInfinite(
			final Index<? extends Item> items, final Long limit) {
		return produce(new AbstractIterator<Index<? extends Iterable<Item>>>() {

			private long at = 1;

			@Override
			protected Index<? extends Iterable<Item>> computeNext() {
				if (limit != null && at > limit)
					return endOfData();

				at++;

				return combinationsFinite(limit(items, at - 1), at - 1);

			}
			//
			// @Override
			// public String toString() {
			// if (limit != null)
			// return "An := (" + items + ")^n + An-1, n=" + init
			// + ",..., " + limit;
			// else
			// return "An := (" + items + ")^n + An-1, n=" + init + ",...";
			// }
		});
	}

	public static <Item> Index<? extends Iterable<Item>> combinations(
			Index<? extends Item> items, Long limit) {
		if (items.domainSize() == -1)
			return combinationsInfinite(items, limit);
		else
			return combinationsFinite(items, limit);
	}

	// public static <Item> Index<Iterable<Item>> combinationsToArb(
	// Index<? extends Item> items, long init, Long limit) {
	// if (items.domainSize() == -1)
	// return combinationsToOfInfinite(items, init, limit);
	// else
	// return combinationsToOfFinite(items, init, limit);
	// }

	//
	// /**
	// * Index of all combinations of any index, will return some items multiple
	// * times but works for infinite indices
	// *
	// * @param items
	// * Index of elements to be combined
	// * @param limit
	// * Optional limit of length
	// */
	// public static <Item> IndexProduce<Iterable<Item>> allFiniteCombinations(
	// final Index<? extends Item> items, final Long limit) {
	// return produce(new AbstractIterator<Index<Iterable<Item>>>() {
	//
	// private long at = 0L;
	//
	// @Override
	// protected Index<Iterable<Item>> computeNext() {
	// if (limit != null && at == limit)
	// return endOfData();
	//
	// at++;
	//
	// return combinations(items, at);
	//
	// }
	//
	// @Override
	// public String toString() {
	// if (limit != null)
	// return "n := all combinations of " + items
	// + " of legnth n up to length " + limit;
	// else
	// return "n := all combinations of " + items + " of legnth n";
	// }
	// });
	// }

	// /**
	// * Maps to the matching of {@link #allInfiniteCombinations(Index, Long)}
	// and
	// * {@link #allFiniteCombinations(Index, Long)}
	// */
	// public static <Item> IndexProduce<Iterable<Item>> allCombinations(
	// final Index<? extends Item> items, final Long limit) {
	// if (items.domainSize() == -1)
	// return allInfiniteCombinations(items, limit);
	// else
	// return allFiniteCombinations(items, limit);
	// }

	public static <Item> Index<Item> consolidate(Index<Item> items,
			Class<Item> type) {
		if (items.domainSize() == -1)
			throw new IllegalArgumentException();

		return array(Iterables.toArray(items, type));
	}

	public static Index<String> mapToString(Index<?> items) {
		return map(items, new Function<Object, String>() {

			@Override
			public String apply(Object x) {
				return Objects.toString(x);
			}

			@Override
			public String toString() {
				return "x := x.toString";
			}
		});
	}

	public static Index<String> mapConcat(
			Index<? extends Tuple<String, String>> items) {
		return map(items, new Function<Tuple<String, String>, String>() {

			@Override
			public String apply(Tuple<String, String> x) {
				final StringBuilder builder = new StringBuilder(x.left);

				builder.append(x.right);

				return builder.toString();
			}

			@Override
			public String toString() {
				return "(x, y) := x + y";
			}
		});
	}

	public static Index<String> mapFoldString(
			Index<? extends Iterable<String>> items) {
		return map(items, new Function<Iterable<String>, String>() {

			@Override
			public String apply(Iterable<String> xs) {
				final StringBuilder builder = new StringBuilder();

				for (String x : xs)
					builder.append(x);

				return builder.toString();
			}

			@Override
			public String toString() {
				return "xs := fold strings xs";
			}
		});
	}

	public static Index<String> mapFoldChars(
			Index<? extends Iterable<Character>> items) {
		return map(items, new Function<Iterable<Character>, String>() {

			@Override
			public String apply(Iterable<Character> xs) {
				final StringBuilder builder = new StringBuilder();

				for (char x : xs)
					builder.append(x);

				return builder.toString();
			}

			@Override
			public String toString() {
				return "xs := fold strings xs";
			}
		});
	}

	/**
	 * Concatenates the first index with the second one
	 */
	public static <Item> IndexConcat<Item> concatWith(
			Index<? extends Item> initial, Index<? extends Item> rest) {
		return new IndexConcat<>(initial, rest);
	}

	/**
	 * Concatenates all consecutive indices
	 */
	@SafeVarargs
	public static <Item> Index<Item> concatAll(Index<Item>... indice) {
		if (indice.length == 0)
			return empty();
		else if (indice.length == 1)
			return indice[0];
		else {
			Index<Item> result = indice[0];
			for (int i = 1; i < indice.length; i++) {
				result = concatWith(result, indice[i]);
			}
			return result;
		}
	}

	/**
	 * Uses the predicate to filter the index
	 */
	public static <Item> IndexFilter<Item> filter(Index<? extends Item> items,
			final Predicate<Item> predicate) {
		return new IndexFilter<Item>(items) {

			@Override
			protected boolean filter(Item item) {
				return predicate.apply(item);
			}

			@Override
			public String toString() {
				return items + ", filtered with " + predicate;
			}
		};
	}

	public static <Item> IndexLate<Item> late(
			final Supplier<Index<? extends Item>> bind) {
		return new IndexLate<Item>() {

			@Override
			protected Index<? extends Item> bind() {
				return bind.get();
			}
		};
	}

	/**
	 * Limits the domain of the index
	 */
	public static <Item> IndexLimit<Item> limit(Index<? extends Item> items,
			long limit) {
		return new IndexLimit<Item>(items, limit);
	}

	/**
	 * Maps the items of the index with the given mapping function
	 */
	public static <InItem, OutItem> IndexMap<InItem, OutItem> map(
			Index<? extends InItem> items,
			final Function<? super InItem, ? extends OutItem> map) {
		return new IndexMap<InItem, OutItem>(items) {

			@Override
			protected OutItem map(InItem item) {
				return map.apply(item);
			}

			@Override
			public String toString() {
				return items + ", mapped with " + map;
			}
		};
	}

	/**
	 * Pairs the left index with the right index
	 */
	public static <Left, Right> IndexPair<Left, Right> pairWith(
			Index<? extends Left> lefts, Index<? extends Right> rights) {
		return new IndexPair<>(lefts, rights);
	}

	/**
	 * Creates a production index
	 */
	public static <Item> IndexProduce<Item> produce(
			Iterator<? extends Index<? extends Item>> production) {
		return new IndexProduce<>(production);
	}

	/**
	 * Zips the first index with the second one
	 */
	public static <Item> IndexZip<Item> zipWith(Index<? extends Item> evens,
			Index<? extends Item> odds) {
		return new IndexZip<Item>(evens, odds);
	}

	/**
	 * Zips all consecutive indices
	 */
	@SafeVarargs
	public static <Item> Index<Item> zipAll(Index<Item>... indice) {
		if (indice.length == 0)
			return empty();
		else if (indice.length == 1)
			return indice[0];
		else {
			Index<Item> result = indice[0];
			for (int i = 1; i < indice.length; i++) {
				result = zipWith(result, indice[i]);
			}
			return result;
		}
	}

	/**
	 * Converts the array to an index
	 */
	public static <Item> IndexArray<Item> array(Item[] items) {
		return new IndexArray<>(items);
	}

	/**
	 * Makes a new empty index
	 */
	public static <Item> IndexEmpty<Item> empty() {
		return new IndexEmpty<>();
	}

	/**
	 * Converts the list to an index
	 */
	public static <Item> IndexList<Item> list(List<Item> items) {
		return new IndexList<>(items);
	}

	/**
	 * Makes a new naturals index
	 */
	public static IndexNaturals naturals() {
		return new IndexNaturals();
	}

	/**
	 * Makes a new naturals including zero index
	 */
	public static IndexNaturalsZero naturalsZero() {
		return new IndexNaturalsZero();
	}

	/**
	 * Makes a new singleton index
	 */
	public static <Item> IndexSingleton<Item> singleton(Item item) {
		return new IndexSingleton<>(item);
	}
}
