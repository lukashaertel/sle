package sle.gbt.index.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AtIterator<Item> implements Iterator<Item> {
	protected abstract long length();

	protected abstract Item get(long i);

	private long at;

	@Override
	public boolean hasNext() {
		return at < length();
	}

	@Override
	public Item next() {

		if (at < length())
			return get(at++);
		else
			throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
