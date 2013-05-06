
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ParameterUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DataElement">
 *       &lt;xs:attribute type="ns:ParameterKind" name="kind"/>
 *       &lt;xs:attribute type="xs:string" name="pos"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ParameterUnit extends DataElement
{
    private ParameterKind kind;
    private String pos;

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public ParameterKind getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(ParameterKind kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'pos' attribute value.
     * 
     * @return value
     */
    public String getPos() {
        return pos;
    }

    /** 
     * Set the 'pos' attribute value.
     * 
     * @param pos
     */
    public void setPos(String pos) {
        this.pos = pos;
    }
}
