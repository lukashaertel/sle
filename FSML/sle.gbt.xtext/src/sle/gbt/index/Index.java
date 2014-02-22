package sle.gbt.index;

import java.util.Iterator;

public interface Index<Item> extends Iterable<Item> {
	/**
	 * Size of the domain of this index or {@code -1} if infinite
	 */
	public long domainSize();

	/**
	 * True if the index is defined for the given position
	 * 
	 * @param i
	 *            The position to check
	 */
	public boolean exists(long i);

	/**
	 * Gets the item at the position or {@code null} if it does not exists
	 * 
	 * @param i
	 *            The position to get
	 */
	public Item get(long i);

	/**
	 * Behaves like {@link #iterator()} but uses an offset before that
	 */
	public Iterator<Item> iterator(long offset);
}
