package sle.gbt.index.complex;

import java.util.LinkedHashMap;
import java.util.Map;

import sle.gbt.index.Index;

public class IndexCache<Item> extends IndexComplex<Item> {
	public final Index<Item> items;

	public final int degree;

	private final class DALHM<T> extends LinkedHashMap<Long, T> {
		private static final long serialVersionUID = 8354294111747977982L;

		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<Long, T> eldest) {
			return size() > degree;
		}
	}

	private final Map<Long, Boolean> cacheExists = new DALHM<>();

	private final LinkedHashMap<Long, Item> cacheGet = new DALHM<>();

	public IndexCache(Index<Item> items, int degree) {
		this.items = items;
		this.degree = degree;
	}

	@Override
	public long domainSize() {
		return items.domainSize();
	}

	@Override
	public boolean exists(long i) {
		if (cacheExists.containsKey(i))
			return cacheExists.get(i);
		else {
			final boolean result = items.exists(i);

			cacheExists.put(i, result);

			return result;
		}
	}

	@Override
	public Item get(long i) {
		if (cacheGet.containsKey(i))
			return cacheGet.get(i);
		else {
			final Item result = items.get(i);

			cacheGet.put(i, result);

			return result;
		}
	}
	
	@Override
	public String toString() {
		return items.toString();
	}
	
}
