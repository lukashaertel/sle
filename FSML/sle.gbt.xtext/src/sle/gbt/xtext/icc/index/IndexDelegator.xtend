package sle.gbt.xtext.icc.index
class IndexDelegator<T> implements Index<T> {
	val (long)=>boolean exceeds

	val (long)=>boolean exists

	val (long)=>T get

	new((long)=>boolean exceeds, (long)=>boolean exists, (long)=>T get) {
		this.exceeds = exceeds
		this.exists = exists
		this.get = get
	}

	override exceeds(long i) {
		exceeds.apply(i)
	}

	override exists(long i) {
		exists.apply(i)
	}

	override get(long i) {
		get.apply(i)
	}
}
