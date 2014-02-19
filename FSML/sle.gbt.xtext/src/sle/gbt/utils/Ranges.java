package sle.gbt.utils;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Ranges {
	/**
	 * Returns the inclusive range [min, max] of integers
	 * 
	 * @param min
	 *            The first integer to return
	 * @param max
	 *            The last integer to return
	 */
	public static List<Integer> ints(final int min, final int max) {
		return new AbstractList<Integer>() {

			@Override
			public Iterator<Integer> iterator() {
				return new Iterator<Integer>() {
					private int pos = min;

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}

					@Override
					public Integer next() {
						return pos++;
					}

					@Override
					public boolean hasNext() {
						return pos <= max;
					}
				};
			}

			@Override
			public boolean add(Integer e) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void add(int i, Integer e) {
				throw new UnsupportedOperationException();

			}

			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean addAll(int i, Collection<? extends Integer> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void clear() {
				throw new UnsupportedOperationException();

			}

			@Override
			public boolean contains(Object o) {
				return o instanceof Integer && min <= (Integer) o
						&& (Integer) o <= max;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				for (Object o : c) {
					if (!contains(o))
						return false;
				}
				return true;
			}

			@Override
			public Integer get(int i) {
				if (i > max - min)
					throw new NoSuchElementException();
				else
					return min + i;
			}

			@Override
			public int indexOf(Object o) {
				return contains(o) ? (Integer) o - min : -1;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public int lastIndexOf(Object o) {
				return indexOf(o);
			}

			@Override
			public boolean remove(Object o) {
				throw new UnsupportedOperationException();
			}

			@Override
			public Integer remove(int i) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public Integer set(int i, Integer e) {
				throw new UnsupportedOperationException();
			}

			@Override
			public int size() {
				return 1 + max - min;
			}

			@Override
			public List<Integer> subList(int fromIndex, int toIndex) {
				if (fromIndex == toIndex)
					return Collections.emptyList();
				else
					return ints(get(fromIndex), get(toIndex - 1));
			}
		};
	}

	/**
	 * Returns the inclusive range [min, max] of characters
	 * 
	 * @param min
	 *            The first character to return
	 * @param max
	 *            The last character to return
	 */
	public static List<Character> chars(final char min, final char max) {
		return new AbstractList<Character>() {

			@Override
			public Iterator<Character> iterator() {
				return new Iterator<Character>() {
					private int pos = min;

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}

					@Override
					public Character next() {
						return (char) pos++;
					}

					@Override
					public boolean hasNext() {
						return pos <= max;
					}
				};
			}

			@Override
			public boolean add(Character e) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void add(int i, Character e) {
				throw new UnsupportedOperationException();

			}

			@Override
			public boolean addAll(Collection<? extends Character> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean addAll(int i, Collection<? extends Character> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void clear() {
				throw new UnsupportedOperationException();

			}

			@Override
			public boolean contains(Object o) {
				return o instanceof Character && min <= (Character) o
						&& (Character) o <= max;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				for (Object o : c) {
					if (!contains(o))
						return false;
				}
				return true;
			}

			@Override
			public Character get(int i) {
				if (i > max - min)
					throw new NoSuchElementException();
				else
					return (char) (min + i);
			}

			@Override
			public int indexOf(Object o) {
				return contains(o) ? (Integer) o - min : -1;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public int lastIndexOf(Object o) {
				return indexOf(o);
			}

			@Override
			public boolean remove(Object o) {
				throw new UnsupportedOperationException();
			}

			@Override
			public Character remove(int i) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public Character set(int i, Character e) {
				throw new UnsupportedOperationException();
			}

			@Override
			public int size() {
				return 1 + max - min;
			}

			@Override
			public List<Character> subList(int fromIndex, int toIndex) {
				if (fromIndex == toIndex)
					return Collections.emptyList();
				else
					return chars(get(fromIndex), get(toIndex - 1));
			}
		};
	}
}
