package sle.gbt.index;

import java.util.Iterator;
import java.util.List;

import sle.gbt.index.utils.AtIterator;

/**
 * Indexes a fixed list
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 *            The item type of the list
 */
public class IndexList<Item> implements Index<Item> {
	/**
	 * Items that this index indexes
	 */
	public final List<? extends Item> items;

	/**
	 * Constructs the list index
	 * 
	 * @param items
	 *            Items to index
	 */
	public IndexList(List<? extends Item> items) {
		this.items = items;
	}

	@Override
	public long domainSize() {
		return items.size();
	}

	@Override
	public boolean exists(long i) {
		return i < items.size();
	}

	@Override
	public Item get(long i) {
		return exists(i) ? items.get((int) i) : null;
	}

	@Override
	public Iterator<Item> iterator() {
		return new AtIterator<Item>() {

			@Override
			protected long length() {
				return items.size();
			}

			@Override
			protected Item get(long i) {
				return items.get((int) i);
			}
		};
	}

	@Override
	public String toString() {
		return items.toString();
	}

}
