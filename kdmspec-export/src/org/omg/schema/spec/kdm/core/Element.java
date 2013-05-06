
package org.omg.schema.spec.kdm.core;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.Annotation;
import org.omg.schema.spec.kdm.kdm.Attribute;
import org.omg.xmi.Extension;
import org.omg.xmi.ObjectAttribs;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.omg.org/XMI" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/core" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="Element">
 *   &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *     &lt;!-- Reference to inner class Choice -->
 *   &lt;/xs:choice>
 *   &lt;xs:attribute ref="ns:id">
 *     &lt;!-- Reference to inner class Id -->
 *   &lt;/xs:attribute>
 *   &lt;xs:attributeGroup ref="ns:ObjectAttribs"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class Element
{
    private List<Choice> choiceList = new ArrayList<Choice>();
    private Id id;
    private ObjectAttribs objectAttribs;

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoices() {
        return choiceList;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoices(List<Choice> list) {
        choiceList = list;
    }

    /** 
     * Get the 'id' attribute value.
     * 
     * @return value
     */
    public Id getId() {
        return id;
    }

    /** 
     * Set the 'id' attribute value.
     * 
     * @param id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /** 
     * Get the 'ObjectAttribs' attributeGroup value.
     * 
     * @return value
     */
    public ObjectAttribs getObjectAttribs() {
        return objectAttribs;
    }

    /** 
     * Set the 'ObjectAttribs' attributeGroup value.
     * 
     * @param objectAttribs
     */
    public void setObjectAttribs(ObjectAttribs objectAttribs) {
        this.objectAttribs = objectAttribs;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://www.omg.org/XMI" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns1:Attribute" name="attribute"/>
     *   &lt;xs:element type="ns1:Annotation" name="annotation"/>
     *   &lt;xs:element ref="ns:Extension"/>
     * &lt;/xs:choice>
     * 
     * &lt;xs:element xmlns:ns="http://www.omg.org/XMI" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="ns:Extension" name="Extension"/>
     * </pre>
     */
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int ATTRIBUTE_CHOICE = 0;
        private static final int ANNOTATION_CHOICE = 1;
        private static final int EXTENSION_CHOICE = 2;
        private Attribute attribute;
        private Annotation annotation;
        private Extension extension;

        private void setChoiceSelect(int choice) {
            if (choiceSelect == -1) {
                choiceSelect = choice;
            } else if (choiceSelect != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoiceSelect() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoiceSelect() {
            choiceSelect = -1;
        }

        /** 
         * Check if Attribute is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAttribute() {
            return choiceSelect == ATTRIBUTE_CHOICE;
        }

        /** 
         * Get the 'attribute' element value.
         * 
         * @return value
         */
        public Attribute getAttribute() {
            return attribute;
        }

        /** 
         * Set the 'attribute' element value.
         * 
         * @param attribute
         */
        public void setAttribute(Attribute attribute) {
            setChoiceSelect(ATTRIBUTE_CHOICE);
            this.attribute = attribute;
        }

        /** 
         * Check if Annotation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAnnotation() {
            return choiceSelect == ANNOTATION_CHOICE;
        }

        /** 
         * Get the 'annotation' element value.
         * 
         * @return value
         */
        public Annotation getAnnotation() {
            return annotation;
        }

        /** 
         * Set the 'annotation' element value.
         * 
         * @param annotation
         */
        public void setAnnotation(Annotation annotation) {
            setChoiceSelect(ANNOTATION_CHOICE);
            this.annotation = annotation;
        }

        /** 
         * Check if Extension is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifExtension() {
            return choiceSelect == EXTENSION_CHOICE;
        }

        /** 
         * Get the 'Extension' element value.
         * 
         * @return value
         */
        public Extension getExtension() {
            return extension;
        }

        /** 
         * Set the 'Extension' element value.
         * 
         * @param extension
         */
        public void setExtension(Extension extension) {
            setChoiceSelect(EXTENSION_CHOICE);
            this.extension = extension;
        }
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:attribute xmlns:ns="http://www.omg.org/XMI" xmlns:xs="http://www.w3.org/2001/XMLSchema" ref="ns:id"/>
     * 
     * &lt;xs:attribute xmlns:ns="http://www.omg.org/XMI" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="xs:string" name="id"/>
     * </pre>
     */
    public static class Id
    {
        private String id;

        /** 
         * Get the 'id' attribute value.
         * 
         * @return value
         */
        public String getId() {
            return id;
        }

        /** 
         * Set the 'id' attribute value.
         * 
         * @param id
         */
        public void setId(String id) {
            this.id = id;
        }
    }
}
