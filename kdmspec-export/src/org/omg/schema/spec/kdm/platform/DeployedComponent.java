
package org.omg.schema.spec.kdm.platform;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.code.Module;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/platform" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeployedComponent">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractPlatformElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:Module" name="groupedCode" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="groupedCode"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DeployedComponent extends AbstractPlatformElement
{
    private List<Module> groupedCodeList = new ArrayList<Module>();
    private String groupedCode;

    /** 
     * Get the list of 'groupedCode' element items.
     * 
     * @return list
     */
    public List<Module> getGroupedCodes() {
        return groupedCodeList;
    }

    /** 
     * Set the list of 'groupedCode' element items.
     * 
     * @param list
     */
    public void setGroupedCodes(List<Module> list) {
        groupedCodeList = list;
    }

    /** 
     * Get the 'groupedCode' attribute value.
     * 
     * @return value
     */
    public String getGroupedCode() {
        return groupedCode;
    }

    /** 
     * Set the 'groupedCode' attribute value.
     * 
     * @param groupedCode
     */
    public void setGroupedCode(String groupedCode) {
        this.groupedCode = groupedCode;
    }
}
