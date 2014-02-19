package sle.gbt.xtext.icc.index

class IndexEmpty<T> implements Index<T> {

	override exceeds(long i) {
		true
	}

	override exists(long i) {
		false
	}

	override get(long i) {
		null
	}

}
