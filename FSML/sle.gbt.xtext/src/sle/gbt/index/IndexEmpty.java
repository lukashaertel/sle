package sle.gbt.index;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Empty index
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 *            The item type
 */
public class IndexEmpty<Item> implements Index<Item> {
	@Override
	public long domainSize() {
		return 0;
	}

	@Override
	public boolean exists(long i) {
		return false;
	}

	@Override
	public Item get(long i) {
		return null;
	}

	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Item next() {
				throw new NoSuchElementException();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub

			}
		};
	}

}
