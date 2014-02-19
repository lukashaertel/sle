package sle.gbt.index.complex;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

import sle.gbt.index.Index;

public class IndexProduce<Item> extends IndexComplex<Item> {

	/**
	 * Maps the start area to the index providing their items
	 */
	private final SortedMap<Long, Index<? extends Item>> stage = new TreeMap<>();

	public final Iterator<Index<? extends Item>> production;

	public IndexProduce(Iterator<Index<? extends Item>> production) {
		this.production = production;
	}

	/**
	 * {@inheritDoc}<br/>
	 * Calculation of domain size does not pull further
	 */
	@Override
	public long domainSize() {
		if (!production.hasNext()) {
			if (stage.isEmpty())
				// No production left and no index in stage, then zero items
				// total
				return 0;
			else {
				// No production left and at least one index in stage
				final long lo = stage.lastKey();
				final Index<?> li = stage.get(lo);

				// If the last index is infinite, total is infinite
				if (li.domainSize() == -1) {
					return -1;
				} else {
					// Else, total is the last offset plus the last domain size
					return lo + li.domainSize();
				}
			}
		} else
			return -1;
	}

	@Override
	public boolean exists(long i) {
		// Get the appropriate index
		final Tuple<Long, Index<? extends Item>> appropriate = getAppropriate(i);

		// If an appropriate index could be found, return its existence
		if (appropriate != null)
			return appropriate.right.exists(i - appropriate.left);
		else
			return false;
	}

	@Override
	public Item get(long i) {
		// Get the appropriate index
		final Tuple<Long, Index<? extends Item>> appropriate = getAppropriate(i);

		// If an appropriate index could be found, return its item
		if (appropriate != null)
			return appropriate.right.exists(i - appropriate.left) ? appropriate.right
					.get(i - appropriate.left) : null;
		else
			return null;
	}

	/**
	 * Gets an existing appropriate index and offset or tries to create it
	 * 
	 * @param i
	 *            The index to find the appropriate index for
	 */
	public Tuple<Long, Index<? extends Item>> getAppropriate(final long i) {
		// Store for the appropriate offset and index
		Tuple<Long, Index<? extends Item>> appropriate;

		// While no appropriate item was found and the production is non-empty
		while ((appropriate = existingAppropriate(i)) == null
				&& production.hasNext()) {
			// Produce one more
			final Index<? extends Item> next = production.next();

			// If stage is empty, this will be the first item
			if (stage.isEmpty())
				stage.put(0L, next);
			else {
				// If not, get the last item with its offset
				final long lo = stage.lastKey();
				final Index<?> li = stage.get(lo);

				// Check that the domain size is not infinite, then add after
				if (li.domainSize() == -1)
					throw new IllegalStateException();
				else
					stage.put(lo + li.domainSize(), next);
			}
		}
		return appropriate;
	}

	/**
	 * Returns the appropriate index with its offset
	 */
	private Tuple<Long, Index<? extends Item>> existingAppropriate(final long i) {
		// Try to find the direct index
		final Index<? extends Item> pat = stage.get(i);

		// If it exists, return it
		if (pat != null) {
			return new Tuple<Long, Index<? extends Item>>(i, pat);
		} else {
			// Else, try to find the first one before
			final SortedMap<Long, Index<? extends Item>> before = stage
					.headMap(i);

			if (before.isEmpty()) {
				return null;
			} else {
				final long lo = before.lastKey();
				final Index<? extends Item> li = before.get(lo);

				if (li.domainSize() == -1 || i < lo + li.domainSize()) {
					return new Tuple<Long, Index<? extends Item>>(lo, li);
				} else {
					return null;
				}
			}
		}
	}
}
