
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RangeType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DerivedType">
 *       &lt;xs:attribute type="xs:string" name="lower"/>
 *       &lt;xs:attribute type="xs:string" name="upper"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RangeType extends DerivedType
{
    private String lower;
    private String upper;

    /** 
     * Get the 'lower' attribute value.
     * 
     * @return value
     */
    public String getLower() {
        return lower;
    }

    /** 
     * Set the 'lower' attribute value.
     * 
     * @param lower
     */
    public void setLower(String lower) {
        this.lower = lower;
    }

    /** 
     * Get the 'upper' attribute value.
     * 
     * @return value
     */
    public String getUpper() {
        return upper;
    }

    /** 
     * Set the 'upper' attribute value.
     * 
     * @param upper
     */
    public void setUpper(String upper) {
        this.upper = upper;
    }
}
