
package org.omg.schema.spec.kdm.build;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.KDMModel;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/build" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BuildModel">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMModel">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:AbstractBuildElement" name="buildElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BuildModel extends KDMModel
{
    private List<AbstractBuildElement> buildElementList = new ArrayList<AbstractBuildElement>();

    /** 
     * Get the list of 'buildElement' element items.
     * 
     * @return list
     */
    public List<AbstractBuildElement> getBuildElements() {
        return buildElementList;
    }

    /** 
     * Set the list of 'buildElement' element items.
     * 
     * @param list
     */
    public void setBuildElements(List<AbstractBuildElement> list) {
        buildElementList = list;
    }
}
