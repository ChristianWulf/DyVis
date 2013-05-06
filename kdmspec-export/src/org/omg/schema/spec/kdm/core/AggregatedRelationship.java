
package org.omg.schema.spec.kdm.core;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AggregatedRelationship">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ModelElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="density"/>
 *       &lt;xs:attribute type="xs:string" name="from"/>
 *       &lt;xs:attribute type="xs:string" name="to"/>
 *       &lt;xs:attribute type="xs:string" name="relation"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AggregatedRelationship extends ModelElement
{
    private List<Choice> choice2List = new ArrayList<Choice>();
    private String density;
    private String from;
    private String to;
    private String relation;

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
     * Get the 'density' attribute value.
     * 
     * @return value
     */
    public String getDensity() {
        return density;
    }

    /** 
     * Set the 'density' attribute value.
     * 
     * @param density
     */
    public void setDensity(String density) {
        this.density = density;
    }

    /** 
     * Get the 'from' attribute value.
     * 
     * @return value
     */
    public String getFrom() {
        return from;
    }

    /** 
     * Set the 'from' attribute value.
     * 
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /** 
     * Get the 'to' attribute value.
     * 
     * @return value
     */
    public String getTo() {
        return to;
    }

    /** 
     * Set the 'to' attribute value.
     * 
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /** 
     * Get the 'relation' attribute value.
     * 
     * @return value
     */
    public String getRelation() {
        return relation;
    }

    /** 
     * Set the 'relation' attribute value.
     * 
     * @param relation
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:KDMEntity" name="from"/>
     *   &lt;xs:element type="ns:KDMEntity" name="to"/>
     *   &lt;xs:element type="ns:KDMRelationship" name="relation"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int FROM_CHOICE = 0;
        private static final int TO_CHOICE = 1;
        private static final int RELATION_CHOICE = 2;
        private KDMEntity from;
        private KDMEntity to;
        private KDMRelationship relation;

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
         * Check if From is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifFrom() {
            return choice2Select == FROM_CHOICE;
        }

        /** 
         * Get the 'from' element value.
         * 
         * @return value
         */
        public KDMEntity getFrom() {
            return from;
        }

        /** 
         * Set the 'from' element value.
         * 
         * @param from
         */
        public void setFrom(KDMEntity from) {
            setChoice2Select(FROM_CHOICE);
            this.from = from;
        }

        /** 
         * Check if To is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTo() {
            return choice2Select == TO_CHOICE;
        }

        /** 
         * Get the 'to' element value.
         * 
         * @return value
         */
        public KDMEntity getTo() {
            return to;
        }

        /** 
         * Set the 'to' element value.
         * 
         * @param to
         */
        public void setTo(KDMEntity to) {
            setChoice2Select(TO_CHOICE);
            this.to = to;
        }

        /** 
         * Check if Relation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifRelation() {
            return choice2Select == RELATION_CHOICE;
        }

        /** 
         * Get the 'relation' element value.
         * 
         * @return value
         */
        public KDMRelationship getRelation() {
            return relation;
        }

        /** 
         * Set the 'relation' element value.
         * 
         * @param relation
         */
        public void setRelation(KDMRelationship relation) {
            setChoice2Select(RELATION_CHOICE);
            this.relation = relation;
        }
    }
}
