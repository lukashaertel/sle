package sle.gbt.utils;

import static sle.gbt.utils.Ranges.*;
import static sle.gbt.utils.Iterables.*;

public class Tests {
	public static void main(String[] args) {
		for (int i : ints(1, 5)) {
			System.out.println(i);
		}
		System.out.println();
		for (int i : ints(1, 5).subList(2, 3)) {
			System.out.println(i);
		}
		System.out.println();
		for (char c : chars('f', 'j')) {
			System.out.println(c);
		}
		System.out.println();
		for (int i : then(then(one(1), 2), 5)) {
			System.out.println(i);
		}
	}
}
