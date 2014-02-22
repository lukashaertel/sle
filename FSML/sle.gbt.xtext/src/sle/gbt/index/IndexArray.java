package sle.gbt.index;

import java.util.Arrays;
import java.util.Iterator;

import sle.gbt.index.utils.AtIterator;

/**
 * Indexes a fixed array
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 *            The item type of the array
 */
public class IndexArray<Item> implements Index<Item> {
	/**
	 * Items that this index indexes
	 */
	public final Item[] items;

	/**
	 * Constructs the array index
	 * 
	 * @param items
	 *            Items to index
	 */
	public IndexArray(Item[] items) {
		this.items = items;
	}

	@Override
	public long domainSize() {
		return items.length;
	}

	@Override
	public boolean exists(long i) {
		return i < items.length;
	}

	@Override
	public Item get(long i) {
		return exists(i) ? items[(int) i] : null;
	}

	@Override
	public Iterator<Item> iterator() {
		return iterator(0);
	}

	@Override
	public Iterator<Item> iterator(long offset) {
		return new AtIterator<Item>(offset) {

			@Override
			protected long length() {
				return items.length;
			}

			@Override
			protected Item get(long i) {
				return items[(int) i];
			}
		};
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}
