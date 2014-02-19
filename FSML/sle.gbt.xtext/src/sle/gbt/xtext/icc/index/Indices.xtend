package sle.gbt.xtext.icc.index

import java.util.List

class Indices {

	/**
	 * Creates an index with the functors as implementations for the interface
	 */
	def static <T> Index<T> index((long)=>boolean exceeds, (long)=>boolean exists, (long)=>T get) {
		new IndexDelegator(exceeds, exists, get)
	}

	def static <T> Index<T> compactIndex(long size, (long)=>T get) {
		index([it >= size], [it < size], get)
	}

	def static <T> Index<T> compactUniversalIndex((long)=>T get) {
		index([false], [true], get)
	}

	def static <T> Index<T> universalIndex((long)=>boolean exists, (long)=>T get) {
		index([false], exists, get)
	}

	/**
	 * Creates an empty index
	 */
	def static <T> Index<T> emptyIndex() {
		new IndexEmpty()
	}

	/**
	 * Creates an index from a singleton element
	 */
	def static <T> Index<T> toSingletonIndex(T element) {
		new IndexSingleton(element)
	}

	/**
	 * Creates an index from a list
	 */
	def static <T> Index<T> toIndex(List<T> list) {
		new IndexList(list)
	}

	/**
	 * Creates an index from an array
	 */
	def static <T> Index<T> toIndex(T[] array) {
		new IndexArray(array)
	}

	/**
	 * Creates an iterable from an index
	 */
	def static <T> Iterable<T> toIterable(Index<T> i) {
		new IndexIterable(i)
	}

	/**
	 * Creates an index that maps all elements from the input index with the given mapping
	 */
	def static <T, U> Index<U> map(Index<T> i, (T)=>U mapping) {
		index([i.exceeds(it)], [i.exists(it)], [mapping.apply(i.get(it))])
	}

	/**
	 * Creates an index that filters all elements from the input that match a given predicate
	 */
	def static <T> Index<T> filter(Index<T> i, (T)=>boolean filter) {
		index([i.exceeds(it)], [i.exists(it) && filter.apply(i.get(it))], [val x = i.get(it) if(filter.apply(x)) x])
	}

	/**
	 * Operator maps to pairing of indices
	 */
	def static <T, U> Index<Pair<T, U>> operator_multiply(Index<T> l, Index<U> r) {
		Pairing.pairs(l, r)
	}

	/**
	 * Operator maps to zipping of indices
	 */
	def static <T> Index<T> operator_plus(Index<T> evens, Index<T> odds) {
		Zipping.zip(evens, odds)
	}

}
