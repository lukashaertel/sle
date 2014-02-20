package sle.gbt.index.complex;

import sle.gbt.index.Index;

public abstract class IndexMap<InItem, OutItem> extends IndexComplex<OutItem> {
	public final Index<? extends InItem> items;

	public IndexMap(Index<? extends InItem> items) {
		this.items = items;
	}

	@Override
	public long domainSize() {
		return items.domainSize();
	}

	@Override
	public boolean exists(long i) {
		return items.exists(i);
	}

	@Override
	public OutItem get(long i) {
		if (items.exists(i)) {
			final InItem item = items.get(i);

			return map(item);
		}

		return null;
	}

	protected abstract OutItem map(InItem item);

	@Override
	public String toString() {
		return items + ", mapped";
	}
}
