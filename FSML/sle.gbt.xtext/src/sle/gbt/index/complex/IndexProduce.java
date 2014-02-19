package sle.gbt.index.complex;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.TreeMap;

import sle.gbt.index.Index;
import sle.gbt.index.IndexNaturals;
import sle.gbt.index.IndexNaturalsZero;
import sle.gbt.index.IndexSingleton;
import sle.gbt.xtext.icc.index.IndexNatural;

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
		Entry<Long, Index<? extends Item>> potential = ranges.floorEntry(i);

		while ((potential == null || potential.getValue().domainSize() <= i
				- potential.getKey())
				&& production.hasNext()) {
			final Index<? extends Item> next = production.next();

			final Entry<Long, Index<? extends Item>> range = ranges.lastEntry();
			if (range == null) {
				ranges.put(0L, next);
			} else {
				final long offset = range.getKey();
				final Index<? extends Item> items = range.getValue();

				if (items.domainSize() == -1)
					throw new IllegalStateException();

				ranges.put(offset + items.domainSize(), next);
			}

			potential = ranges.floorEntry(i);
		}

		return potential;
	}

	public static void main(String[] args) {
		final List<Index<? extends Object>> host = new ArrayList<>();

		host.add(IndexSingleton.singleton("A"));
		host.add(IndexLimit.limit(IndexNaturals.naturals(), 5L));
		host.add(IndexSingleton.singleton("B"));
		host.add(IndexLimit.limit(IndexNaturals.naturals(), 5L));
		host.add(IndexSingleton.singleton("C"));

		final Iterator<Index<? extends Object>> production = host.iterator();

		final IndexProduce<Object> produce = new IndexProduce<>(production);

		for (Object item : produce) {
			System.out.println(item);
		}
	}
}
