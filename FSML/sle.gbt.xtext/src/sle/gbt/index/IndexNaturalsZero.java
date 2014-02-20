package sle.gbt.index;

import java.util.Iterator;

/**
 * Index of all natural numbers including zero
 * 
 * @author lukashaertel
 * 
 */
public class IndexNaturalsZero implements Index<Long> {
	@Override
	public long domainSize() {
		return -1;
	}

	@Override
	public boolean exists(long i) {
		return true;
	}

	@Override
	public Long get(long i) {
		return i;
	}

	@Override
	public Iterator<Long> iterator() {
		return new Iterator<Long>() {

			private long at = 0;

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

	@Override
	public String toString() {
		return "natural numbers including zero";
	}
}
