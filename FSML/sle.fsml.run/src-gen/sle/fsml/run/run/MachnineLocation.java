/**
 */
package sle.fsml.run.run;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machnine Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.run.run.MachnineLocation#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.run.run.RunPackage#getMachnineLocation()
 * @model
 * @generated
 */
public interface MachnineLocation extends Machine
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see sle.fsml.run.run.RunPackage#getMachnineLocation_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link sle.fsml.run.run.MachnineLocation#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

} // MachnineLocation
