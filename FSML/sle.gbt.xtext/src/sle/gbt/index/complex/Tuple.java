package sle.gbt.index.complex;

public class Tuple<Left, Right> {

	public final Left left;

	public final Right right;

	public Tuple(Left left, Right right) {
		this.left = left;
		this.right = right;
	}

	public static <Left, Right> Tuple<Left, Right> tuple(Left left, Right right) {
		return new Tuple<>(left, right);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple<?, ?> other = (Tuple<?, ?>) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + left + ", " + right + ")";
	}
}
