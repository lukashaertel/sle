package sle.gbt.index.complex;

import com.google.common.base.Predicate;

import sle.gbt.index.Index;

/**
 * Index filter uses an abstract filter method to filter items
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 *            The type of the items
 */
public abstract class IndexFilter<Item> extends IndexComplex<Item> {
	public final Index<? extends Item> items;

	public IndexFilter(Index<? extends Item> items) {
		this.items = items;
	}

	public static <Item> IndexFilter<Item> filter(Index<? extends Item> items,
			final Predicate<Item> predicate) {
		return new IndexFilter<Item>(items) {

			@Override
			protected boolean filter(Item item) {
				return predicate.apply(item);
			}
		};
	}

	/**
	 * {@inheritDoc}<br/>
	 * Filter does not reduce the domain size but leaves out the items by
	 * modifying the exists-clause
	 */
	@Override
	public long domainSize() {
		return items.domainSize();
	}

	@Override
	public boolean exists(long i) {
		return items.exists(i) && filter(items.get(i));
	}

	@Override
	public Item get(long i) {
		if (items.exists(i)) {
			final Item item = items.get(i);

			if (filter(item)) {
				return item;
			}
		}

		return null;
	}

	protected abstract boolean filter(Item item);

	@Override
	public String toString() {
		return items + ", filtered";
	}
}
