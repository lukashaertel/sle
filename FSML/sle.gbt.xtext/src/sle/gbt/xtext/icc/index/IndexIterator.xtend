package sle.gbt.xtext.icc.index

import com.google.common.collect.AbstractIterator

class IndexIterator<T> extends AbstractIterator<T> {
	val Index<T> index

	var i = -1L

	new(Index<T> index) {
		this.index = index
	}

	override protected computeNext() {
		while(!index.exceeds(i)) {
			i = i + 1

			if(index.exists(i)) {
				return index.get(i)
			}
		}

		endOfData
	}

}
