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

	private long fixLeft(long x, long y) {
		return y * lefts.domainSize() + x;
	}

	private long ifixLeftX(long z) {
		return z % lefts.domainSize();
	}

	private long ifixLeftY(long z) {
		return z / lefts.domainSize();
	}

	private long fixRight(long x, long y) {
		return y * rights.domainSize() + x;
	}

	private long ifixRightX(long z) {
		return z % rights.domainSize();
	}

	private long ifixRightY(long z) {
		return z / rights.domainSize();
	}

	private long index(long x, long y) {
		if (lefts.domainSize() != -1)
			return fixLeft(x, y);
		else if (rights.domainSize() != -1)
			return fixRight(x, y);
		else
			return cantor(x, y);
	}

	private long iindexX(long z) {
		if (lefts.domainSize() != -1)
			return ifixLeftX(z);
		else if (rights.domainSize() != -1)
			return ifixRightX(z);
		else
			return icantorX(z);
	}

	private long iindexY(long z) {
		if (lefts.domainSize() != -1)
			return ifixLeftY(z);
		else if (rights.domainSize() != -1)
			return ifixRightY(z);
		else
			return icantorY(z);
	}

	public final Index<? extends Left> lefts;

	public final Index<? extends Right> rights;

	public IndexPair(Index<? extends Left> lefts, Index<? extends Right> rights) {
		assert lefts.domainSize() == -1;
		assert rights.domainSize() == -1;

		this.lefts = lefts;
		this.rights = rights;
	}

	@Override
	public long domainSize() {
		if (lefts.domainSize() != -1 && rights.domainSize() != -1)
			return index(lefts.domainSize() - 1, rights.domainSize() - 1) + 1;
		else
			return -1;
	}

	@Override
	public boolean exists(long i) {
		return lefts.exists(iindexX(i)) && rights.exists(iindexY(i));
	}

	@Override
	public Tuple<Left, Right> get(long i) {
		final long x = iindexX(i);
		final long y = iindexY(i);

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
