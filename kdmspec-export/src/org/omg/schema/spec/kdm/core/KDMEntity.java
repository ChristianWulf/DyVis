
package org.omg.schema.spec.kdm.core;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="KDMEntity">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ModelElement">
 *       &lt;xs:attribute type="xs:string" name="name"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class KDMEntity extends ModelElement
{
    private String name;

    /** 
     * Get the 'name' attribute value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' attribute value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
