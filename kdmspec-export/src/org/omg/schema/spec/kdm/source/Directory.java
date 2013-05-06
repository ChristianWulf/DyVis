
package org.omg.schema.spec.kdm.source;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Directory">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:InventoryContainer">
 *       &lt;xs:attribute type="xs:string" name="path"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Directory extends InventoryContainer
{
    private String path;

    /** 
     * Get the 'path' attribute value.
     * 
     * @return value
     */
    public String getPath() {
        return path;
    }

    /** 
     * Set the 'path' attribute value.
     * 
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }
}
