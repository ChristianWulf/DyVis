
package org.omg.xmi;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.omg.org/XMI" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IdentityAttribs">
 *   &lt;xs:attribute type="xs:string" use="optional" form="qualified" name="label"/>
 *   &lt;xs:attribute type="xs:string" use="optional" form="qualified" name="uuid"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class IdentityAttribs
{
    private String label;
    private String uuid;

    /** 
     * Get the 'label' attribute value.
     * 
     * @return value
     */
    public String getLabel() {
        return label;
    }

    /** 
     * Set the 'label' attribute value.
     * 
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /** 
     * Get the 'uuid' attribute value.
     * 
     * @return value
     */
    public String getUuid() {
        return uuid;
    }

    /** 
     * Set the 'uuid' attribute value.
     * 
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
