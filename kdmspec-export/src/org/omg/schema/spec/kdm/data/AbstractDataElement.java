
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.action.ActionElement;
import org.omg.schema.spec.kdm.core.KDMEntity;
import org.omg.schema.spec.kdm.source.SourceRef;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="AbstractDataElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMEntity">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class AbstractDataElement extends KDMEntity
{
    private List<Choice> choice2List = new ArrayList<Choice>();

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
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/action" xmlns:ns2="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns2:SourceRef" name="source"/>
     *   &lt;xs:element type="ns:AbstractDataRelationship" name="dataRelation"/>
     *   &lt;xs:element type="ns1:ActionElement" name="abstraction"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int SOURCE_CHOICE = 0;
        private static final int DATA_RELATION_CHOICE = 1;
        private static final int ABSTRACTION_CHOICE = 2;
        private SourceRef source;
        private AbstractDataRelationship dataRelation;
        private ActionElement abstraction;

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
         * Check if Source is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifSource() {
            return choice2Select == SOURCE_CHOICE;
        }

        /** 
         * Get the 'source' element value.
         * 
         * @return value
         */
        public SourceRef getSource() {
            return source;
        }

        /** 
         * Set the 'source' element value.
         * 
         * @param source
         */
        public void setSource(SourceRef source) {
            setChoice2Select(SOURCE_CHOICE);
            this.source = source;
        }

        /** 
         * Check if DataRelation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDataRelation() {
            return choice2Select == DATA_RELATION_CHOICE;
        }

        /** 
         * Get the 'dataRelation' element value.
         * 
         * @return value
         */
        public AbstractDataRelationship getDataRelation() {
            return dataRelation;
        }

        /** 
         * Set the 'dataRelation' element value.
         * 
         * @param dataRelation
         */
        public void setDataRelation(AbstractDataRelationship dataRelation) {
            setChoice2Select(DATA_RELATION_CHOICE);
            this.dataRelation = dataRelation;
        }

        /** 
         * Check if Abstraction is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAbstraction() {
            return choice2Select == ABSTRACTION_CHOICE;
        }

        /** 
         * Get the 'abstraction' element value.
         * 
         * @return value
         */
        public ActionElement getAbstraction() {
            return abstraction;
        }

        /** 
         * Set the 'abstraction' element value.
         * 
         * @param abstraction
         */
        public void setAbstraction(ActionElement abstraction) {
            setChoice2Select(ABSTRACTION_CHOICE);
            this.abstraction = abstraction;
        }
    }
}
