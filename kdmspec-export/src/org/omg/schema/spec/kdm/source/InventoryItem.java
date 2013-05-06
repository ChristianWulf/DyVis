
package org.omg.schema.spec.kdm.source;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InventoryItem">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractInventoryElement">
 *       &lt;xs:attribute type="xs:string" name="version"/>
 *       &lt;xs:attribute type="xs:string" name="path"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InventoryItem extends AbstractInventoryElement
{
    private String version;
    private String path;

    /** 
     * Get the 'version' attribute value.
     * 
     * @return value
     */
    public String getVersion() {
        return version;
    }

    /** 
     * Set the 'version' attribute value.
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

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
