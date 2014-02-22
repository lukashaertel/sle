package sle.gbt.index.complex;

import sle.gbt.index.Index;

public abstract class IndexLate<Item> extends IndexComplex<Item> {
	private Index<? extends Item> bound = null;

	@Override
	public long domainSize() {
		if (bound == null)
			return -1;
		return bound.domainSize();
	}

	@Override
	public boolean exists(long i) {
		if (bound == null)
			bound = bind();
		return bound.exists(i);
	}

	@Override
	public Item get(long i) {
		if (bound == null)
			bound = bind();
		return bound.get(i);
	}

	protected abstract Index<? extends Item> bind();

}
