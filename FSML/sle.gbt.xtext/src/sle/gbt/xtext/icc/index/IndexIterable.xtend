package sle.gbt.xtext.icc.index

class IndexIterable<T> implements Iterable<T> {
	val Index<T> index
	
	new(Index<T> index) {
		this.index = index
	}
	
	override iterator() {
		new IndexIterator(index)
	}
}