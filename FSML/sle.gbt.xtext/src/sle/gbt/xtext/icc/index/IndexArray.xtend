package sle.gbt.xtext.icc.index

class IndexArray<T> implements Index<T> {
	val T[] array;

	new(T[] array) {
		this.array = array
	}

	override exceeds(long i) {
		array.length <= i
	}

	override exists(long i) {
		i < array.length
	}

	override get(long i) {
		array.get(i as int)
	}
}
