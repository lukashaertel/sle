package sle.gbt.index;

import static sle.gbt.index.IndexArray.*;
import static sle.gbt.index.IndexEmpty.*;
import static sle.gbt.index.IndexList.*;
import static sle.gbt.index.IndexNaturals.*;
import static sle.gbt.index.IndexNaturalsZero.*;
import static sle.gbt.index.IndexSingleton.*;
import static sle.gbt.index.complex.IndexConcat.*;
import static sle.gbt.index.complex.IndexFilter.*;
import static sle.gbt.index.complex.IndexLimit.*;
import static sle.gbt.index.complex.IndexMap.*;
import static sle.gbt.index.complex.IndexPair.*;
import static sle.gbt.index.complex.IndexProduce.*;
import static sle.gbt.index.complex.IndexZip.*;
import static sle.gbt.index.Indices.*;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;

@SuppressWarnings("unused")
public class Tests {
	public static void main(String[] args) {
		// Test array index
		testIndex(array(new Integer[] { 1, 3, 5, 6 }));

		// Test empty index
		testIndex(empty());

		// Test list index
		testIndex(list(Arrays.asList("Hallo", "Welt")));

		// Test natural numbers
		testIndex(naturals(), 3);

		// Test natural numbers including zero
		testIndex(naturalsZero(), 3);

		// Test singleton indices
		testIndex(singleton(true));

		// Test concatenation
		testIndex(concatWith(list(Arrays.asList("X", "Y")), naturals()), 6);

		// Test filter
		testIndex(filter(naturals(), new Predicate<Long>() {

			@Override
			public boolean apply(Long l) {
				return l % 3 == 0;
			}

			@Override
			public String toString() {
				return "n := n % 3 = 0";
			}
		}), 6);

		// Test limiter
		testIndex(limit(singleton("X"), 6));

		// Test mapping
		testIndex(map(naturals(), new Function<Long, Double>() {

			@Override
			public Double apply(Long l) {
				return Math.sqrt(l);
			}

			@Override
			public String toString() {
				return "n := sqrt(n)";
			}
		}), 6);
		// Test pairing
		testIndex(pairWith(list(Arrays.asList("X", "Y", "Z")),
				list(Arrays.asList("1", "2", "3"))));

		// Test productive concatenation
		testIndex(produce(new AbstractIterator<Index<Long>>() {
			private long l = 1L;

			@Override
			protected Index<Long> computeNext() {
				return limit(naturals(), l++);
			}

			@Override
			public String toString() {
				return "n := {x| 1 <= x < n + 1}";
			}
		}), 15);

		// Test zipping
		testIndex(zipWith(list(Arrays.asList("A", "B", "C", "D")), naturals()),
				10);

		// Test combinations
		testIndex(combinationsOf(list(Arrays.asList("A", "B", "C")), 3L));
		// Test combinations
		testIndex(combinationsUpTo(list(Arrays.asList("A", "B", "C")), 3L));
		// Test combinations
		testIndex(combinationsAll(naturals(), 4L));
	}

	/**
	 * Equal to {@code testIndex(index, null)}
	 */
	private static void testIndex(Index<?> index) {
		testIndex(index, null);
	}

	/**
	 * Equal to {@code testIndex(index, (Long) limit)}
	 */
	private static void testIndex(Index<?> index, long limit) {
		testIndex(index, (Long) limit);
	}

	private static void testIndex(Index<?> index, Long limit) {
		// Show source
		System.out.print("Index: ");
		System.out.print(index);

		// Show the optional limit
		if (limit != null) {
			System.out.print(" [first ");
			System.out.print(limit);
			System.out.print(']');
		}

		// Show the estimate domain size
		final long ds = index.domainSize();
		if (ds == -1) {
			System.out.print(", estimate: infinite");
		} else {
			System.out.print(", estimate: ");
			System.out.print(ds);
		}

		// Show items
		System.out.println(" {");
		long i = 0L;
		long y = 0L;
		while ((index.domainSize() == -1 || i < index.domainSize())
				&& (limit == null || y < limit)) {
			if (index.exists(i)) {
				System.out.print("  #");
				System.out.print(y);
				System.out.print(": ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.println(index.get(i));
				y++;
			}
			i++;
		}
		final long ads = index.domainSize();
		if (ads != ds) {
			if (ads == -1)
				System.out.println("}, domain size changed: infinite");
			else {
				System.out.print("}, domain size changed: ");
				System.out.println(ads);
			}
		} else
			System.out.println("}");
	}
}
