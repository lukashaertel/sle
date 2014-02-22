package sle.gbt.index.utils;

import sle.gbt.index.Index;

import com.google.common.collect.AbstractIterator;

public class PullIterator<Item> extends AbstractIterator<Item> {
	public final Index<? extends Item> source;

	private long at;

	public PullIterator(Index<? extends Item> source, long first) {
		this.source = source;
		this.at = first - 1;
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
