
package org.omg.schema.spec.kdm.build;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.KDMEntity;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/build" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="AbstractBuildElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMEntity">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:AbstractBuildRelationship" name="buildRelation" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class AbstractBuildElement extends KDMEntity
{
    private List<AbstractBuildRelationship> buildRelationList = new ArrayList<AbstractBuildRelationship>();

    /** 
     * Get the list of 'buildRelation' element items.
     * 
     * @return list
     */
    public List<AbstractBuildRelationship> getBuildRelations() {
        return buildRelationList;
    }

    /** 
     * Set the list of 'buildRelation' element items.
     * 
     * @param list
     */
    public void setBuildRelations(List<AbstractBuildRelationship> list) {
        buildRelationList = list;
    }
}
