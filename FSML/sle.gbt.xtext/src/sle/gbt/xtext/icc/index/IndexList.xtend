package sle.gbt.xtext.icc.index

import java.util.List

class IndexList<T> implements Index<T> {
	val List<? extends T> list;

	new(List<? extends T> list) {
		this.list = list
	}

	override exceeds(long i) {
		list.size <= i
	}

	override exists(long i) {
		i < list.size
	}

	override get(long i) {
		list.get(i as int)
	}

}
