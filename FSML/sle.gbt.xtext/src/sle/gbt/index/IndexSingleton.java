package sle.gbt.index;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IndexSingleton<Item> implements Index<Item> {
	public final Item item;

	public IndexSingleton(Item item) {
		this.item = item;
	}

	public static <Item> IndexSingleton<Item> singleton(Item item) {
		return new IndexSingleton<>(item);
	}

	@Override
	public long domainSize() {
		return 1;
	}

	@Override
	public boolean exists(long i) {
		return i == 0;
	}

	@Override
	public Item get(long i) {
		return exists(i) ? item : null;
	}

	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			private boolean exhausted = false;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return !exhausted;
			}

			@Override
			public Item next() {
				if (!exhausted) {
					exhausted = true;
					return item;
				} else
					throw new NoSuchElementException();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();

			}
		};
	}

	@Override
	public String toString() {
		return "just " + item;
	}
}
