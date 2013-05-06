
package org.omg.xmi;

import org.jibx.runtime.QName;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.omg.org/XMI" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ObjectAttribs">
 *   &lt;xs:attributeGroup ref="ns:IdentityAttribs"/>
 *   &lt;xs:attributeGroup ref="ns:LinkAttribs"/>
 *   &lt;xs:attribute type="xs:string" use="optional" fixed="2.0" form="qualified" name="version"/>
 *   &lt;xs:attribute type="xs:QName" use="optional" form="qualified" name="type"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class ObjectAttribs
{
    private IdentityAttribs identityAttribs;
    private LinkAttribs linkAttribs;
    private String version;
    private QName type;

    /** 
     * Get the 'IdentityAttribs' attributeGroup value.
     * 
     * @return value
     */
    public IdentityAttribs getIdentityAttribs() {
        return identityAttribs;
    }

    /** 
     * Set the 'IdentityAttribs' attributeGroup value.
     * 
     * @param identityAttribs
     */
    public void setIdentityAttribs(IdentityAttribs identityAttribs) {
        this.identityAttribs = identityAttribs;
    }

    /** 
     * Get the 'LinkAttribs' attributeGroup value.
     * 
     * @return value
     */
    public LinkAttribs getLinkAttribs() {
        return linkAttribs;
    }

    /** 
     * Set the 'LinkAttribs' attributeGroup value.
     * 
     * @param linkAttribs
     */
    public void setLinkAttribs(LinkAttribs linkAttribs) {
        this.linkAttribs = linkAttribs;
    }

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
     * Get the 'type' attribute value.
     * 
     * @return value
     */
    public QName getType() {
        return type;
    }

    /** 
     * Set the 'type' attribute value.
     * 
     * @param type
     */
    public void setType(QName type) {
        this.type = type;
    }
}
