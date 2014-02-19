package sle.gbt.xtext.icc.index

class IndexSingleton<T> implements Index<T> {
	val T element;

	new(T element) {
		this.element = element
	}

	override exceeds(long i) {
		1 <= i
	}

	override exists(long i) {
		i < 1
	}

	override get(long i) {
		if(i == 0) element
	}
}
