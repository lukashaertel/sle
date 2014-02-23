package sle.gbt.xtext.icc;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import sle.gbt.xtext.icc.SG;

/**
 * Any character construct<br/>
 * (1.2a)
 */
@Data
@SuppressWarnings("all")
public class Any extends SG {
  public Any() {
    super();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
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
    Any other = (Any) obj;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
