package sle.gbt.utils;

import java.util.Map;

import com.google.common.base.Function;

public class Maps {
	public static <T, U> Function<T, U> asFunction(
			final Map<? super T, ? extends U> map) {
		return new Function<T, U>() {

			@Override
			public U apply(T x) {
				return map.get(x);
			}

			@Override
			public String toString() {
				return "discrete function: " + map;
			}
		};
	}
}
