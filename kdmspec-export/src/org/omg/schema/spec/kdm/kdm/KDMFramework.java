
package org.omg.schema.spec.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.ModelElement;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="KDMFramework">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ModelElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="name"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class KDMFramework extends ModelElement
{
    private List<Choice> choice2List = new ArrayList<Choice>();
    private String name;

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
     * Get the 'name' attribute value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' attribute value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:Audit" name="audit"/>
     *   &lt;xs:element type="ns:ExtensionFamily" name="extensionFamily"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int AUDIT_CHOICE = 0;
        private static final int EXTENSION_FAMILY_CHOICE = 1;
        private Audit audit;
        private ExtensionFamily extensionFamily;

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
         * Check if Audit is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAudit() {
            return choice2Select == AUDIT_CHOICE;
        }

        /** 
         * Get the 'audit' element value.
         * 
         * @return value
         */
        public Audit getAudit() {
            return audit;
        }

        /** 
         * Set the 'audit' element value.
         * 
         * @param audit
         */
        public void setAudit(Audit audit) {
            setChoice2Select(AUDIT_CHOICE);
            this.audit = audit;
        }

        /** 
         * Check if ExtensionFamily is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifExtensionFamily() {
            return choice2Select == EXTENSION_FAMILY_CHOICE;
        }

        /** 
         * Get the 'extensionFamily' element value.
         * 
         * @return value
         */
        public ExtensionFamily getExtensionFamily() {
            return extensionFamily;
        }

        /** 
         * Set the 'extensionFamily' element value.
         * 
         * @param extensionFamily
         */
        public void setExtensionFamily(ExtensionFamily extensionFamily) {
            setChoice2Select(EXTENSION_FAMILY_CHOICE);
            this.extensionFamily = extensionFamily;
        }
    }
}
