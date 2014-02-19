package sle.gbt.xtext.icc.index

import static extension sle.gbt.xtext.icc.index.Indices.*

class Zipping {

	/**
	 * Returns the indexer indexing the inputs zipped into eachother
	 * @param evens The index of the elements for the even numbers i.e. 0, 2, 4, ...
	 * @param odds The index of the elements to the odd numbers i.e. 1, 3, 5 ...
	 */
	def static <T> Index<T> zip(Index<T> evens, Index<T> odds) {
		index(
			[
				// We have to join exceeds for both to accomodate the fact that
				// zip exhausts both indices and one could be exhausted earlier
				// than the other
				if(it % 2 == 0)
					evens.exceeds(it / 2) && odds.exceeds(it / 2)
				else
					evens.exceeds((it - 1) / 2) && odds.exceeds((it - 1) / 2)
			],
			[if(it % 2 == 0) evens.exists(it / 2) else odds.exists((it - 1) / 2)],
			[if(it % 2 == 0) evens.get(it / 2) else odds.get((it - 1) / 2)]
		)
	}

	/**
	 * Flattens an index index by folding them with zip, requires that the outter index is finite
	 */
	def static <T> Index<T> zflatten(Index<Index<T>> is) {
		var r = emptyIndex
		for (i : is.toIterable) {
			r = zip(r, i)
		}
		return r
	}
}
