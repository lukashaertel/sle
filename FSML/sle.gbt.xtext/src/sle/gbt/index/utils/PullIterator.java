package sle.gbt.index.utils;

import sle.gbt.index.Index;

import com.google.common.collect.AbstractIterator;

public class PullIterator<Item> extends AbstractIterator<Item> {
	public final Index<? extends Item> source;

	private long at = -1;

	public PullIterator(Index<? extends Item> source) {
		this.source = source;
	}

	@Override
	protected Item computeNext() {
		while (source.domainSize() == -1 || at < source.domainSize()) {
			at++;

			if (source.exists(at)) {
				return source.get(at);
			}
		}

		return endOfData();
	}
}
