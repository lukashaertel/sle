package sle.gbt.xtext.icc.index

interface Index<T> {

	/**
	 * Returns true if i and any subsequent index do not exist
	 */
	def boolean exceeds(long i)

	/**
	 * Returns true if the item at the index exists
	 * @param i Index of the item to test
	 */
	def boolean exists(long i);

	/**
	 * Returns the item at the index i
	 * @param i Index of the item to get
	 */
	def T get(long i)
}
