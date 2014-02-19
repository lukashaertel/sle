package sle.gbt.index;

import java.util.Iterator;

/**
 * Index of all natural numbers <em>not</em> including zero
 * 
 * @author lukashaertel
 * 
 */
public class IndexNaturals implements Index<Long> {
	public static IndexNaturals naturals() {
		return new IndexNaturals();
	}

	@Override
	public long domainSize() {
		return -1;
	}

	@Override
	public boolean exists(long i) {
		return false;
	}

	@Override
	public Long get(long i) {
		return i + 1;
	}

	@Override
	public Iterator<Long> iterator() {
		return new Iterator<Long>() {

			private long at = 1;

			@Override
			public Long next() {
				return at++;
			}

			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

}
