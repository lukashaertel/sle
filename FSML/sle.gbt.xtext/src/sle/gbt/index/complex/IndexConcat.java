package sle.gbt.index.complex;

import sle.gbt.index.Index;

/**
 * Index concatenate takes a finite first index and concatenates it with a
 * second index on an arbitrary domain
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 *            Type of the items
 */
public class IndexConcat<Item> extends IndexComplex<Item> {
	public final Index<? extends Item> initial;

	public final Index<? extends Item> rest;

	public IndexConcat(Index<? extends Item> initial, Index<? extends Item> rest) {
		if (initial.domainSize() == -1) {
			throw new IllegalArgumentException("initial");
		}

		this.initial = initial;
		this.rest = rest;
	}

	@Override
	public long domainSize() {
		if (rest.domainSize() != -1)
			return initial.domainSize() + rest.domainSize();
		else
			return -1;
	}

	@Override
	public boolean exists(long i) {
		final long ids = initial.domainSize();

		if (i < ids)
			return initial.exists(i);
		else
			return rest.exists(i - ids);
	}

	@Override
	public Item get(long i) {
		final long ids = initial.domainSize();

		if (i < ids)
			return initial.get(i);
		else
			return rest.get(i - ids);
	}

	@Override
	public String toString() {
		return initial + " ~~> " + rest;
	}
}
