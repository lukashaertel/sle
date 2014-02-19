package sle.gbt.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterables {

	public static <Item> Iterable<Item> one(final Item item) {
		return new Iterable<Item>() {

			@Override
			public Iterator<Item> iterator() {
				return new Iterator<Item>() {
					private boolean done = false;

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return !done;
					}

					@Override
					public Item next() {
						if (!done) {
							done = true;
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
				return item.toString();
			}
		};
	}

	public static <Item> Iterable<Item> then(
			final Iterable<? extends Item> init, final Item last) {
		return new Iterable<Item>() {
			@Override
			public Iterator<Item> iterator() {
				return new Iterator<Item>() {
					private final Iterator<? extends Item> initIterator = init
							.iterator();

					private boolean done = false;

					@Override
					public boolean hasNext() {
						return initIterator.hasNext() || !done;
					}

					@Override
					public Item next() {
						if (initIterator.hasNext())
							return initIterator.next();
						else if (!done) {
							done = true;
							return last;
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
				return init + ", " + last;
			}
		};
	}
}
