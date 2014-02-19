package sle.gbt.xtext.icc.index

import static java.util.Collections.*
import static extension sle.gbt.xtext.icc.index.Indices.*

/**
 * Pairing contains the pairs and cats method, both pairing up indices in an exhautive combinatorial fashion
 */
class Pairing {

	/**
	 * <p>Calculates the x-coordinate of the element by is index</p>
	 * <p>Implementation of the cantor	pairing function by indices taken from Wikipedia</p>
	 * @param z The index
	 */
	private def static long computeX(long z) {
		val j = ( Math.floor(Math.sqrt(0.25 + 2 * z) - 0.5) as long)
		j - (z - j * (j + 1) / 2)
	}

	/**
	 * <p>Calculates the y-coordinate of the element by is index</p>
	 * <p>Implementation of the cantor	pairing function by indices taken from Wikipedia</p>
	 * @param z The index
	 */
	private def static long computeY(long z) {
		val j = Math.floor(Math.sqrt(0.25 + 2 * z) - 0.5)as long;
		z - j * (j + 1) / 2
	}

	/**
	 * Returns the indexer indexing all pairings of the indices specified as parameters
	 * @param l The index of the elements to the left
	 * @param r The index of the elements to the right
	 */
	def static <T, U> Index<Pair<T, U>> pairs(Index<T> l, Index<U> r) {
		index(
			[
				l.exceeds(computeX) && r.exceeds(computeY)
			],
			[
				l.exists(computeX) && r.exists(computeY)
			],
			[
				l.get(computeX) -> r.get(computeY)
			])
	}

	def static <T> Index<Iterable<T>> combinations(Index<T> i, long l) {
		switch (l) {
			case 0L:
				EMPTY_LIST.toSingletonIndex
			case 1L:
				i.map[singleton(it) as Iterable<T>]
			case l > 1L: {
				(combinations(i, 1) * combinations(i, l - 1L)).map[key + value]
			}
		}
	}

	def static <T> Index<Iterable<T>> combinationsUnion(Index<T> i, long minL, long maxL) {
		var r = emptyIndex
		var k = minL
		while(k <= maxL) {
			r = r + combinations(i, k)
			k = k + 1
		}

		return r
	}
}
