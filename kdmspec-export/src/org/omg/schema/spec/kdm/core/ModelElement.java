
package org.omg.schema.spec.kdm.core;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.ExtendedValue;
import org.omg.schema.spec.kdm.kdm.Stereotype;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="ModelElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="stereotype"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class ModelElement extends Element
{
    private List<Choice> choice1List = new ArrayList<Choice>();
    private String stereotype;

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoice1s() {
        return choice1List;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoice1s(List<Choice> list) {
        choice1List = list;
    }

    /** 
     * Get the 'stereotype' attribute value.
     * 
     * @return value
     */
    public String getStereotype() {
        return stereotype;
    }

    /** 
     * Set the 'stereotype' attribute value.
     * 
     * @param stereotype
     */
    public void setStereotype(String stereotype) {
        this.stereotype = stereotype;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:Stereotype" name="stereotype"/>
     *   &lt;xs:element type="ns:ExtendedValue" name="taggedValue"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice1Select = -1;
        private static final int STEREOTYPE_CHOICE = 0;
        private static final int TAGGED_VALUE_CHOICE = 1;
        private Stereotype stereotype;
        private ExtendedValue taggedValue;

        private void setChoice1Select(int choice) {
            if (choice1Select == -1) {
                choice1Select = choice;
            } else if (choice1Select != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoice1Select() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoice1Select() {
            choice1Select = -1;
        }

        /** 
         * Check if Stereotype is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifStereotype() {
            return choice1Select == STEREOTYPE_CHOICE;
        }

        /** 
         * Get the 'stereotype' element value.
         * 
         * @return value
         */
        public Stereotype getStereotype() {
            return stereotype;
        }

        /** 
         * Set the 'stereotype' element value.
         * 
         * @param stereotype
         */
        public void setStereotype(Stereotype stereotype) {
            setChoice1Select(STEREOTYPE_CHOICE);
            this.stereotype = stereotype;
        }

        /** 
         * Check if TaggedValue is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTaggedValue() {
            return choice1Select == TAGGED_VALUE_CHOICE;
        }

        /** 
         * Get the 'taggedValue' element value.
         * 
         * @return value
         */
        public ExtendedValue getTaggedValue() {
            return taggedValue;
        }

        /** 
         * Set the 'taggedValue' element value.
         * 
         * @param taggedValue
         */
        public void setTaggedValue(ExtendedValue taggedValue) {
            setChoice1Select(TAGGED_VALUE_CHOICE);
            this.taggedValue = taggedValue;
        }
    }
}
