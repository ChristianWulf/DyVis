//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.ui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.omg.schema.spec.kdm._1_1.kdm.KDMModel;


/**
 * <p>Java class for UIModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UIModel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/kdm}KDMModel">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="UIElement" type="{http://schema.omg.org/spec/KDM/1.1/ui}AbstractUIElement"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UIModel", propOrder = {
    "uiElement"
})
public class UIModel
    extends KDMModel
{

    @XmlElement(name = "UIElement")
    protected List<AbstractUIElement> uiElement;

    /**
     * Gets the value of the uiElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUIElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractUIElement }
     * 
     * 
     */
    public List<AbstractUIElement> getUIElement() {
        if (uiElement == null) {
            uiElement = new ArrayList<AbstractUIElement>();
        }
        return this.uiElement;
    }

}
