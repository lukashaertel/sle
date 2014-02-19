package sle.gbt.xtext.icc.index

class IndexNatural implements Index<Long> {

	override exceeds(long i) {
		false
	}

	override exists(long i) {
		true
	}

	override get(long i) {
		i
	}

}
