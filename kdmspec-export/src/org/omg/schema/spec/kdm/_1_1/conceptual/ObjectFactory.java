//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.conceptual;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.schema.spec.kdm._1_1.conceptual package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConceptualRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ConceptualRelationship");
    private final static QName _ScenarioUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ScenarioUnit");
    private final static QName _FactUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "FactUnit");
    private final static QName _AbstractConceptualElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "AbstractConceptualElement");
    private final static QName _AbstractConceptualRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "AbstractConceptualRelationship");
    private final static QName _BehaviorUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "BehaviorUnit");
    private final static QName _RuleUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "RuleUnit");
    private final static QName _ConceptualModel_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ConceptualModel");
    private final static QName _ConceptualContainer_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ConceptualContainer");
    private final static QName _TermUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "TermUnit");
    private final static QName _ConceptualFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ConceptualFlow");
    private final static QName _ConceptualElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ConceptualElement");
    private final static QName _ConceptualRole_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/conceptual", "ConceptualRole");
    private final static QName _ConceptualFlowTo_QNAME = new QName("", "to");
    private final static QName _ConceptualFlowFrom_QNAME = new QName("", "from");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.schema.spec.kdm._1_1.conceptual
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConceptualFlow }
     * 
     */
    public ConceptualFlow createConceptualFlow() {
        return new ConceptualFlow();
    }

    /**
     * Create an instance of {@link FactUnit }
     * 
     */
    public FactUnit createFactUnit() {
        return new FactUnit();
    }

    /**
     * Create an instance of {@link ConceptualRelationship }
     * 
     */
    public ConceptualRelationship createConceptualRelationship() {
        return new ConceptualRelationship();
    }

    /**
     * Create an instance of {@link RuleUnit }
     * 
     */
    public RuleUnit createRuleUnit() {
        return new RuleUnit();
    }

    /**
     * Create an instance of {@link ConceptualModel }
     * 
     */
    public ConceptualModel createConceptualModel() {
        return new ConceptualModel();
    }

    /**
     * Create an instance of {@link ScenarioUnit }
     * 
     */
    public ScenarioUnit createScenarioUnit() {
        return new ScenarioUnit();
    }

    /**
     * Create an instance of {@link BehaviorUnit }
     * 
     */
    public BehaviorUnit createBehaviorUnit() {
        return new BehaviorUnit();
    }

    /**
     * Create an instance of {@link ConceptualElement }
     * 
     */
    public ConceptualElement createConceptualElement() {
        return new ConceptualElement();
    }

    /**
     * Create an instance of {@link ConceptualContainer }
     * 
     */
    public ConceptualContainer createConceptualContainer() {
        return new ConceptualContainer();
    }

    /**
     * Create an instance of {@link TermUnit }
     * 
     */
    public TermUnit createTermUnit() {
        return new TermUnit();
    }

    /**
     * Create an instance of {@link ConceptualRole }
     * 
     */
    public ConceptualRole createConceptualRole() {
        return new ConceptualRole();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ConceptualRelationship")
    public JAXBElement<ConceptualRelationship> createConceptualRelationship(ConceptualRelationship value) {
        return new JAXBElement<ConceptualRelationship>(_ConceptualRelationship_QNAME, ConceptualRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScenarioUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ScenarioUnit")
    public JAXBElement<ScenarioUnit> createScenarioUnit(ScenarioUnit value) {
        return new JAXBElement<ScenarioUnit>(_ScenarioUnit_QNAME, ScenarioUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "FactUnit")
    public JAXBElement<FactUnit> createFactUnit(FactUnit value) {
        return new JAXBElement<FactUnit>(_FactUnit_QNAME, FactUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConceptualElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "AbstractConceptualElement")
    public JAXBElement<AbstractConceptualElement> createAbstractConceptualElement(AbstractConceptualElement value) {
        return new JAXBElement<AbstractConceptualElement>(_AbstractConceptualElement_QNAME, AbstractConceptualElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConceptualRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "AbstractConceptualRelationship")
    public JAXBElement<AbstractConceptualRelationship> createAbstractConceptualRelationship(AbstractConceptualRelationship value) {
        return new JAXBElement<AbstractConceptualRelationship>(_AbstractConceptualRelationship_QNAME, AbstractConceptualRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BehaviorUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "BehaviorUnit")
    public JAXBElement<BehaviorUnit> createBehaviorUnit(BehaviorUnit value) {
        return new JAXBElement<BehaviorUnit>(_BehaviorUnit_QNAME, BehaviorUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "RuleUnit")
    public JAXBElement<RuleUnit> createRuleUnit(RuleUnit value) {
        return new JAXBElement<RuleUnit>(_RuleUnit_QNAME, RuleUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ConceptualModel")
    public JAXBElement<ConceptualModel> createConceptualModel(ConceptualModel value) {
        return new JAXBElement<ConceptualModel>(_ConceptualModel_QNAME, ConceptualModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ConceptualContainer")
    public JAXBElement<ConceptualContainer> createConceptualContainer(ConceptualContainer value) {
        return new JAXBElement<ConceptualContainer>(_ConceptualContainer_QNAME, ConceptualContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "TermUnit")
    public JAXBElement<TermUnit> createTermUnit(TermUnit value) {
        return new JAXBElement<TermUnit>(_TermUnit_QNAME, TermUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ConceptualFlow")
    public JAXBElement<ConceptualFlow> createConceptualFlow(ConceptualFlow value) {
        return new JAXBElement<ConceptualFlow>(_ConceptualFlow_QNAME, ConceptualFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ConceptualElement")
    public JAXBElement<ConceptualElement> createConceptualElement(ConceptualElement value) {
        return new JAXBElement<ConceptualElement>(_ConceptualElement_QNAME, ConceptualElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/conceptual", name = "ConceptualRole")
    public JAXBElement<ConceptualRole> createConceptualRole(ConceptualRole value) {
        return new JAXBElement<ConceptualRole>(_ConceptualRole_QNAME, ConceptualRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "to", scope = ConceptualFlow.class)
    public JAXBElement<ConceptualContainer> createConceptualFlowTo(ConceptualContainer value) {
        return new JAXBElement<ConceptualContainer>(_ConceptualFlowTo_QNAME, ConceptualContainer.class, ConceptualFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptualContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "from", scope = ConceptualFlow.class)
    public JAXBElement<ConceptualContainer> createConceptualFlowFrom(ConceptualContainer value) {
        return new JAXBElement<ConceptualContainer>(_ConceptualFlowFrom_QNAME, ConceptualContainer.class, ConceptualFlow.class, value);
    }

}
