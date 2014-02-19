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

import java.util.ArrayList;
import java.util.Arrays;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

@SuppressWarnings("unused")
public class Tests {
	public static void main(String[] args) {
		testIndex(array(new Integer[] { 1, 3, 5, 6 }));
		testIndex(empty());
		testIndex(list(Arrays.asList("Hallo", "Welt")));
		testIndex(naturals(), 3);
		testIndex(naturalsZero(), 3);
		testIndex(singleton(true));

		testIndex(concatWith(list(Arrays.asList("X", "Y")), naturals()), 6);
		testIndex(filter(naturals(), new Predicate<Long>() {

			@Override
			public boolean apply(Long l) {
				return l % 3 == 0;
			}
		}), 6);
		testIndex(map(naturals(), new Function<Long, Double>() {

			@Override
			public Double apply(Long l) {
				return Math.sqrt((double) (long) l);
			}
		}), 6);
		testIndex(pairWith(naturalsZero(), naturals()), 7);
		testIndex(
				produce(Arrays.asList(singleton("A"), singleton(true),
						naturals()).iterator()), 10);
		testIndex(zipWith(list(Arrays.asList("A", "B", "C", "D")), naturals()),
				10);
	}

	private static void testIndex(Index<?> index) {
		System.out.println("Index: " + index);
		long i = 0L;
		for (Object item : index) {
			System.out.print('#');
			System.out.print(i);
			System.out.print(": ");
			System.out.println(item);
			i++;
		}
		System.out.println();
	}

	private static void testIndex(Index<?> index, long limit) {
		System.out.println("Index: " + index);
		long i = 0L;
		for (Object item : index) {
			if (i >= limit)
				break;
			System.out.print('#');
			System.out.print(i);
			System.out.print(": ");
			System.out.println(item);
			i++;
		}
		System.out.println();
	}
}
