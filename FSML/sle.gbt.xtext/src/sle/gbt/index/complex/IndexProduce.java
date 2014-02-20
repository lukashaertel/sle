package sle.gbt.index.complex;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

import sle.gbt.index.Index;

/**
 * Index concatenates a production of indices, only pulling indices from the
 * production when their items are accessed
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 */
public class IndexProduce<Item> extends IndexComplex<Item> {

	/**
	 * Maps the start area to the index providing their items, will not contain
	 * empty indices
	 */
	private final NavigableMap<Long, Index<? extends Item>> ranges = new TreeMap<>();

	public final Iterator<? extends Index<? extends Item>> production;

	public IndexProduce(Iterator<? extends Index<? extends Item>> production) {
		this.production = production;
	}

	/**
	 * {@inheritDoc}<br/>
	 * Calculation of domain size does not pull further
	 */
	@Override
	public long domainSize() {
		if (!production.hasNext()) {
			final Entry<Long, Index<? extends Item>> range = ranges.lastEntry();

			if (range == null)
				return 0;
			else {
				final long offset = range.getKey();
				final Index<? extends Item> items = range.getValue();

				// If the last index is infinite, total is infinite
				if (items.domainSize() == -1) {
					return -1;
				} else {
					// Else, total is the last offset plus the last domain size
					return offset + items.domainSize();
				}
			}
		} else
			return -1;
	}

	@Override
	public boolean exists(long i) {
		// Get the appropriate range
		final Entry<Long, Index<? extends Item>> range = getRange(i);

		// If such a range exists, return its existence
		if (range != null) {
			final long offset = range.getKey();
			final Index<? extends Item> items = range.getValue();

			return items.exists(i - offset);
		} else
			return false;
	}

	@Override
	public Item get(long i) {
		// Get the appropriate range
		final Entry<Long, Index<? extends Item>> range = getRange(i);

		// If such a range exists, return its item
		if (range != null) {
			final long offset = range.getKey();
			final Index<? extends Item> items = range.getValue();

			return items.get(i - offset);
		} else
			return null;
	}

	private Entry<Long, Index<? extends Item>> getRange(final long i) {
		// Try to directly find the potential range
		Entry<Long, Index<? extends Item>> potential = ranges.floorEntry(i);

		// If it does not exist or the domain is not responsible for this index,
		// and if the production has another index, append and retry
		while ((potential == null || potential.getValue().domainSize() <= i
				- potential.getKey())
				&& production.hasNext()) {

			// Get the next index
			final Index<? extends Item> next = production.next();

			// If it is non-empty
			if (next.domainSize() != 0) {
				// Get the range to append the next one to
				final Entry<Long, Index<? extends Item>> range = ranges
						.lastEntry();

				// If no range yet, make next the first
				if (range == null) {
					ranges.put(0L, next);
				} else {
					// Else append
					final long offset = range.getKey();
					final Index<? extends Item> items = range.getValue();

					// Assert the domain of the index appended to is not
					// infinite
					if (items.domainSize() == -1)
						throw new IllegalStateException();

					ranges.put(offset + items.domainSize(), next);
				}

				// Retry to find a potential range
				potential = ranges.floorEntry(i);
			}
		}

		return potential;
	}

	@Override
	public String toString() {
		return "~~> from " + production;
	}
}
