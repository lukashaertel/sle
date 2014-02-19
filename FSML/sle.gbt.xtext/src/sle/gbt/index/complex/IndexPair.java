package sle.gbt.index.complex;

import sle.gbt.index.Index;

public class IndexPair<Left, Right> extends IndexComplex<Tuple<Left, Right>> {
	private static long cantor(long x, long y) {
		return (x + y) * (x + y + 1) / 2 + y;
	}

	private static long icantorX(long z) {
		long j = (long) Math.floor(Math.sqrt(0.25 + 2 * z) - 0.5);
		return j - (z - j * (j + 1) / 2);
	}

	private static long icantorY(long z) {
		long j = (long) Math.floor(Math.sqrt(0.25 + 2 * z) - 0.5);
		return z - j * (j + 1) / 2;
	}

	public final Index<? extends Left> lefts;

	public final Index<? extends Right> rights;

	public IndexPair(Index<? extends Left> lefts, Index<? extends Right> rights) {
		this.lefts = lefts;
		this.rights = rights;
	}

	public static <Left, Right> IndexPair<Left, Right> pairWith(
			Index<? extends Left> lefts, Index<? extends Right> rights) {
		return new IndexPair<>(lefts, rights);
	}

	@Override
	public long domainSize() {
		if (lefts.domainSize() != -1 && rights.domainSize() != -1) {
			// last element is at (lefts.domainSize()-1, rights.domainSize()-1)

			return cantor(lefts.domainSize() - 1, rights.domainSize() - 1) + 1;
		}

		return -1;
	}

	@Override
	public boolean exists(long i) {
		return lefts.exists(icantorX(i)) && rights.exists(icantorY(i));
	}

	@Override
	public Tuple<Left, Right> get(long i) {
		final long x = icantorX(i);
		final long y = icantorY(i);

		if (lefts.exists(x) && rights.exists(y)) {

			final Left left = lefts.get(x);
			final Right right = rights.get(y);

			return new Tuple<>(left, right);
		}

		return null;
	}

	@Override
	public String toString() {
		return lefts + " * " + rights;
	}
}
