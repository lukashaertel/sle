package sle.gbt.xtext.icc;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import sle.gbt.xtext.icc.SG;

/**
 * (1.2b)
 */
@Data
@SuppressWarnings("all")
public class Range extends SG {
  private final char _min;
  
  public char getMin() {
    return this._min;
  }
  
  private final char _max;
  
  public char getMax() {
    return this._max;
  }
  
  public Range(final char min, final char max) {
    super();
    this._min = min;
    this._max = max;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + _min;
    result = prime * result + _max;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (!super.equals(obj))
      return false;
    Range other = (Range) obj;
    if (other._min != _min)
      return false;
    if (other._max != _max)
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
