
package org.omg.schema.spec.kdm.event;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/event" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EventAction">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractEventElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:Event" name="eventElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EventAction extends AbstractEventElement
{
    private List<Event> eventElementList = new ArrayList<Event>();
    private String kind;

    /** 
     * Get the list of 'eventElement' element items.
     * 
     * @return list
     */
    public List<Event> getEventElements() {
        return eventElementList;
    }

    /** 
     * Set the list of 'eventElement' element items.
     * 
     * @param list
     */
    public void setEventElements(List<Event> list) {
        eventElementList = list;
    }

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
}
