package sle.gbt.index;

import static sle.gbt.index.Indices.*;

import java.util.Arrays;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;

public class Tests {
	public static void main(String[] args) {
		// Test array index
		testIndex(Indices.array(new Integer[] { 1, 3, 5, 6 }));

		// Test empty index
		testIndex(Indices.empty());

		// Test list index
		testIndex(Indices.list(Arrays.asList("Hallo", "Welt")));

		// Test natural numbers
		testIndex(new IndexNaturals(), 3);

		// Test natural numbers including zero
		testIndex(new IndexNaturalsZero(), 3);

		// Test singleton indices
		testIndex(Indices.singleton(true));

		// Test concatenation
		testIndex(Indices.concatWith(Indices.list(Arrays.asList("X", "Y")),
				new IndexNaturals()), 6);

		// Test filter
		testIndex(Indices.filter(new IndexNaturals(), new Predicate<Long>() {

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
		testIndex(Indices.limit(Indices.singleton("X"), 6));

		// Test mapping
		testIndex(
				Indices.map(new IndexNaturals(), new Function<Long, Double>() {

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
		testIndex(Indices.pairWith(Indices.list(Arrays.asList("X", "Y", "Z")),
				Indices.list(Arrays.asList("1", "2", "3"))));

		// Test productive concatenation
		testIndex(Indices.produce(new AbstractIterator<Index<Long>>() {
			private long l = 1L;

			@Override
			protected Index<Long> computeNext() {
				return Indices.limit(new IndexNaturals(), l++);
			}

			@Override
			public String toString() {
				return "n := {x| 1 <= x < n + 1}";
			}
		}), 15);

		// Test zipping
		testIndex(Indices.zipWith(
				Indices.list(Arrays.asList("A", "B", "C", "D")),
				new IndexNaturals()), 10);

		// Test combinations
		testIndex(combinations(Indices.list(Arrays.asList("A", "B", "C")), 3L));
		// Test combinations
		testIndex(combinationsTo(Indices.list(Arrays.asList("A", "B", "C")),
				3L));
		// Test combinations
		testIndex(allInfiniteCombinations(new IndexNaturals(), 4L));
		testIndex(CharIndices.SIGMA, 70);
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
				System.out
						.println("}, domain size changed: infinite, fill rate: "
								+ Math.round(100.0 * (double) y / (double) i)
								+ "%");
			else {
				System.out.print("}, domain size changed: ");
				System.out.println(ads + ", fill rate: "
						+ Math.round(100.0 * (double) y / (double) i) + "%");
			}
		} else
			System.out.println("}, fill rate: "
					+ Math.round(100.0 * (double) y / (double) i) + "%");

		System.out.println();
	}
}
