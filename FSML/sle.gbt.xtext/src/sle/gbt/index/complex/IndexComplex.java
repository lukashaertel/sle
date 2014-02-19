package sle.gbt.index.complex;

import java.util.Iterator;

import sle.gbt.index.Index;
import sle.gbt.index.utils.PullIterator;

/**
 * Complex indices usually iterate themselves by a {@link PullIterator}
 * 
 * @author lukashaertel
 * 
 * @param <Item>
 *            Type of the items
 */
public abstract class IndexComplex<Item> implements Index<Item> {

	@Override
	public Iterator<Item> iterator() {
		return new PullIterator<>(this);
	}
}
