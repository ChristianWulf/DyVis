
package org.omg.xmi;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:attributeGroup xmlns:ns="http://www.omg.org/XMI" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LinkAttribs">
 *   &lt;xs:attribute type="xs:string" use="optional" name="href"/>
 *   &lt;xs:attribute type="xs:string" use="optional" form="qualified" name="idref"/>
 * &lt;/xs:attributeGroup>
 * </pre>
 */
public class LinkAttribs
{
    private String href;
    private String idref;

    /** 
     * Get the 'href' attribute value.
     * 
     * @return value
     */
    public String getHref() {
        return href;
    }

    /** 
     * Set the 'href' attribute value.
     * 
     * @param href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /** 
     * Get the 'idref' attribute value.
     * 
     * @return value
     */
    public String getIdref() {
        return idref;
    }

    /** 
     * Set the 'idref' attribute value.
     * 
     * @param idref
     */
    public void setIdref(String idref) {
        this.idref = idref;
    }
}
