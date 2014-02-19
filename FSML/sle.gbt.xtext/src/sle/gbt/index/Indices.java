package sle.gbt.index;

import com.google.common.base.Function;
import com.google.common.collect.AbstractIterator;

import sle.gbt.index.complex.IndexProduce;
import sle.gbt.index.complex.Tuple;
import static sle.gbt.index.IndexEmpty.*;
import static sle.gbt.index.complex.IndexProduce.*;
import static sle.gbt.index.complex.IndexMap.*;
import static sle.gbt.index.complex.IndexLimit.*;
import static sle.gbt.index.complex.IndexPair.*;
import static sle.gbt.index.complex.IndexConcat.*;
import static sle.gbt.utils.Iterables.*;

public class Indices {
	/**
	 * Returns the index of all combinations of base of the length exponent
	 * 
	 * @param base
	 *            Index of elements to be combined, must be finite
	 */
	public static <Item> Index<Iterable<Item>> combinationsOf(
			final Index<Item> base, final long exponent) {
		if (exponent == 0)
			return empty();
		else if (exponent == 1) {
			return map(base, new Function<Item, Iterable<Item>>() {

				@Override
				public Iterable<Item> apply(Item x) {
					return one(x);
				}

				@Override
				public String toString() {
					return "x := [x]";
				}
			});
		} else
			return map(
					pairWith(combinationsOf(base, exponent - 1), base),
					new Function<Tuple<Iterable<Item>, Item>, Iterable<Item>>() {

						@Override
						public Iterable<Item> apply(
								Tuple<Iterable<Item>, Item> x) {
							return then(x.left, x.right);
						}

						@Override
						public String toString() {
							return "([xs],x) := [xs:x]";
						}
					});
	}

	/**
	 * Returns the index of all combinations of base up to the length exponent
	 * 
	 * @param base
	 *            Index of elements to be combined, must be finite
	 */
	public static <Item> Index<Iterable<Item>> combinationsUpTo(
			Index<Item> base, long exponent) {
		if (exponent == 0)
			return combinationsOf(base, 0);
		else
			return concatWith(combinationsUpTo(base, exponent - 1),
					combinationsOf(base, exponent));
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
	public static <Item> IndexProduce<Iterable<Item>> combinationsAll(
			final Index<Item> items, final Long limit) {
		return produce(new AbstractIterator<Index<Iterable<Item>>>() {

			private long at = 0L;

			@Override
			protected Index<Iterable<Item>> computeNext() {
				if (limit != null && at == limit)
					return endOfData();

				at++;

				return combinationsUpTo(limit(items, at), at);

			}

			@Override
			public String toString() {
				if (limit != null)
					return "n := all combinations of " + items
							+ " up to length " + limit;
				else
					return "n := all combinations of " + items;
			}
		});
	}
}
