package sle.gbt.index.complex;

import sle.gbt.index.Index;

public class IndexZip<Item> extends IndexComplex<Item> {
	public final Index<? extends Item> evens;

	public final Index<? extends Item> odds;

	public IndexZip(Index<? extends Item> evens, Index<? extends Item> odds) {
		this.evens = evens;
		this.odds = odds;
	}

	public static <Item> IndexZip<Item> zipWith(Index<? extends Item> evens,
			Index<? extends Item> odds) {
		return new IndexZip<Item>(evens, odds);
	}

	@Override
	public long domainSize() {
		if (evens.domainSize() != -1 && evens.domainSize() != -1) {
			return evens.domainSize() + odds.domainSize();
		}

		return -1;
	}

	@Override
	public boolean exists(long i) {
		if (i % 2 == 0) {
			return evens.exists(i / 2);
		} else {
			return odds.exists(i / 2);
		}
	}

	@Override
	public Item get(long i) {
		if (i % 2 == 0) {
			return evens.exists(i / 2) ? evens.get(i / 2) : null;
		} else {
			return odds.exists(i / 2) ? odds.get(i / 2) : null;
		}
	}

}
