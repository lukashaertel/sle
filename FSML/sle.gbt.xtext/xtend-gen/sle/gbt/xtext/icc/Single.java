package sle.gbt.xtext.icc;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import sle.gbt.xtext.icc.SG;

/**
 * (1.2d)
 */
@Data
@SuppressWarnings("all")
public class Single extends SG {
  private final String _token;
  
  public String getToken() {
    return this._token;
  }
  
  public Single(final String token) {
    super();
    this._token = token;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((_token== null) ? 0 : _token.hashCode());
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
    Single other = (Single) obj;
    if (_token == null) {
      if (other._token != null)
        return false;
    } else if (!_token.equals(other._token))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
