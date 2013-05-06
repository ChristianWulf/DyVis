
package org.omg.schema.spec.kdm.structure;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.AggregatedRelationship;
import org.omg.schema.spec.kdm.core.KDMEntity;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/structure" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="AbstractStructureElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMEntity">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="implementation"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class AbstractStructureElement extends KDMEntity
{
    private List<Choice> choice2List = new ArrayList<Choice>();
    private String implementation;

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoice2s() {
        return choice2List;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoice2s(List<Choice> list) {
        choice2List = list;
    }

    /** 
     * Get the 'implementation' attribute value.
     * 
     * @return value
     */
    public String getImplementation() {
        return implementation;
    }

    /** 
     * Set the 'implementation' attribute value.
     * 
     * @param implementation
     */
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/structure" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:AggregatedRelationship" name="aggregated"/>
     *   &lt;xs:element type="ns:KDMEntity" name="implementation"/>
     *   &lt;xs:element type="ns1:AbstractStructureElement" name="structureElement"/>
     *   &lt;xs:element type="ns1:AbstractStructureRelationship" name="structureRelationship"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int AGGREGATED_CHOICE = 0;
        private static final int IMPLEMENTATION_CHOICE = 1;
        private static final int STRUCTURE_ELEMENT_CHOICE = 2;
        private static final int STRUCTURE_RELATIONSHIP_CHOICE = 3;
        private AggregatedRelationship aggregated;
        private KDMEntity implementation;
        private AbstractStructureElement structureElement;
        private AbstractStructureRelationship structureRelationship;

        private void setChoice2Select(int choice) {
            if (choice2Select == -1) {
                choice2Select = choice;
            } else if (choice2Select != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoice2Select() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoice2Select() {
            choice2Select = -1;
        }

        /** 
         * Check if Aggregated is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAggregated() {
            return choice2Select == AGGREGATED_CHOICE;
        }

        /** 
         * Get the 'aggregated' element value.
         * 
         * @return value
         */
        public AggregatedRelationship getAggregated() {
            return aggregated;
        }

        /** 
         * Set the 'aggregated' element value.
         * 
         * @param aggregated
         */
        public void setAggregated(AggregatedRelationship aggregated) {
            setChoice2Select(AGGREGATED_CHOICE);
            this.aggregated = aggregated;
        }

        /** 
         * Check if Implementation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifImplementation() {
            return choice2Select == IMPLEMENTATION_CHOICE;
        }

        /** 
         * Get the 'implementation' element value.
         * 
         * @return value
         */
        public KDMEntity getImplementation() {
            return implementation;
        }

        /** 
         * Set the 'implementation' element value.
         * 
         * @param implementation
         */
        public void setImplementation(KDMEntity implementation) {
            setChoice2Select(IMPLEMENTATION_CHOICE);
            this.implementation = implementation;
        }

        /** 
         * Check if StructureElement is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifStructureElement() {
            return choice2Select == STRUCTURE_ELEMENT_CHOICE;
        }

        /** 
         * Get the 'structureElement' element value.
         * 
         * @return value
         */
        public AbstractStructureElement getStructureElement() {
            return structureElement;
        }

        /** 
         * Set the 'structureElement' element value.
         * 
         * @param structureElement
         */
        public void setStructureElement(
                AbstractStructureElement structureElement) {
            setChoice2Select(STRUCTURE_ELEMENT_CHOICE);
            this.structureElement = structureElement;
        }

        /** 
         * Check if StructureRelationship is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifStructureRelationship() {
            return choice2Select == STRUCTURE_RELATIONSHIP_CHOICE;
        }

        /** 
         * Get the 'structureRelationship' element value.
         * 
         * @return value
         */
        public AbstractStructureRelationship getStructureRelationship() {
            return structureRelationship;
        }

        /** 
         * Set the 'structureRelationship' element value.
         * 
         * @param structureRelationship
         */
        public void setStructureRelationship(
                AbstractStructureRelationship structureRelationship) {
            setChoice2Select(STRUCTURE_RELATIONSHIP_CHOICE);
            this.structureRelationship = structureRelationship;
        }
    }
}
