
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.action.EntryFlow;
import org.omg.schema.spec.kdm.core.KDMEntity;
import org.omg.schema.spec.kdm.source.SourceRef;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/core" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="AbstractCodeElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:KDMEntity">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class AbstractCodeElement extends KDMEntity
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
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/action" xmlns:ns2="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns2:SourceRef" name="source"/>
     *   &lt;xs:element type="ns:CommentUnit" name="comment"/>
     *   &lt;xs:element type="ns1:EntryFlow" name="entryFlow"/>
     *   &lt;xs:element type="ns:AbstractCodeRelationship" name="codeRelation"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int SOURCE_CHOICE = 0;
        private static final int COMMENT_CHOICE = 1;
        private static final int ENTRY_FLOW_CHOICE = 2;
        private static final int CODE_RELATION_CHOICE = 3;
        private SourceRef source;
        private CommentUnit comment;
        private EntryFlow entryFlow;
        private AbstractCodeRelationship codeRelation;

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
         * Check if Comment is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifComment() {
            return choice2Select == COMMENT_CHOICE;
        }

        /** 
         * Get the 'comment' element value.
         * 
         * @return value
         */
        public CommentUnit getComment() {
            return comment;
        }

        /** 
         * Set the 'comment' element value.
         * 
         * @param comment
         */
        public void setComment(CommentUnit comment) {
            setChoice2Select(COMMENT_CHOICE);
            this.comment = comment;
        }

        /** 
         * Check if EntryFlow is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifEntryFlow() {
            return choice2Select == ENTRY_FLOW_CHOICE;
        }

        /** 
         * Get the 'entryFlow' element value.
         * 
         * @return value
         */
        public EntryFlow getEntryFlow() {
            return entryFlow;
        }

        /** 
         * Set the 'entryFlow' element value.
         * 
         * @param entryFlow
         */
        public void setEntryFlow(EntryFlow entryFlow) {
            setChoice2Select(ENTRY_FLOW_CHOICE);
            this.entryFlow = entryFlow;
        }

        /** 
         * Check if CodeRelation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifCodeRelation() {
            return choice2Select == CODE_RELATION_CHOICE;
        }

        /** 
         * Get the 'codeRelation' element value.
         * 
         * @return value
         */
        public AbstractCodeRelationship getCodeRelation() {
            return codeRelation;
        }

        /** 
         * Set the 'codeRelation' element value.
         * 
         * @param codeRelation
         */
        public void setCodeRelation(AbstractCodeRelationship codeRelation) {
            setChoice2Select(CODE_RELATION_CHOICE);
            this.codeRelation = codeRelation;
        }
    }
}
