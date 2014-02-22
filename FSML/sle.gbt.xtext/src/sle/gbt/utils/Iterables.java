package sle.gbt.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.google.common.base.Function;

public class Iterables {

	public static <Item> Iterable<Item> none() {
		return new Iterable<Item>() {

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
						throw new UnsupportedOperationException();
					}
				};
			}

			@Override
			public String toString() {
				return "()";
			}
		};
	}

	public static <Item> Iterable<Item> one(final Item item) {
		return new Iterable<Item>() {

			@Override
			public Iterator<Item> iterator() {
				return new Iterator<Item>() {
					private boolean itemOut = false;

					@Override
					public boolean hasNext() {
						return !itemOut;
					}

					@Override
					public Item next() {
						if (!itemOut) {
							itemOut = true;
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

					private boolean lastOut = false;

					@Override
					public boolean hasNext() {
						return initIterator.hasNext() || !lastOut;
					}

					@Override
					public Item next() {
						if (initIterator.hasNext())
							return initIterator.next();
						else if (!lastOut) {
							lastOut = true;
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
				return "(" + init + ":" + last + ")";
			}
		};
	}

	public static <Item> Iterable<Item> then(final Item head,
			final Iterable<? extends Item> tail) {
		return new Iterable<Item>() {
			@Override
			public Iterator<Item> iterator() {
				return new Iterator<Item>() {

					private boolean headOut = false;

					private final Iterator<? extends Item> tailIterator = tail
							.iterator();

					@Override
					public boolean hasNext() {
						return !headOut || tailIterator.hasNext();
					}

					@Override
					public Item next() {
						if (!headOut) {
							headOut = true;
							return head;
						} else if (tailIterator.hasNext())
							return tailIterator.next();
						else
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
				return "(" + head + ":" + tail + ")";
			}
		};
	}
}
