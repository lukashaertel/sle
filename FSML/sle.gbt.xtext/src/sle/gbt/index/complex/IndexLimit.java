package sle.gbt.index.complex;

import sle.gbt.index.Index;

public class IndexLimit<Item> extends IndexComplex<Item> {
	public final Index<? extends Item> items;

	public final long limit;

	public IndexLimit(Index<? extends Item> items, long limit) {
		this.items = items;
		this.limit = limit;
	}

	@Override
	public long domainSize() {
		final long ids = items.domainSize();

		return ids == -1 ? limit : Math.min(ids, limit);
	}

	@Override
	public boolean exists(long i) {
		return i < limit && items.exists(i);
	}

	@Override
	public Item get(long i) {
		return exists(i) ? items.get(i) : null;
	}

}
