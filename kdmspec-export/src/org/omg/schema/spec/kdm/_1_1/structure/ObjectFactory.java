//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.structure;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.schema.spec.kdm._1_1.structure package. 
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

    private final static QName _StructureRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "StructureRelationship");
    private final static QName _SoftwareSystem_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "SoftwareSystem");
    private final static QName _AbstractStructureElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "AbstractStructureElement");
    private final static QName _Subsystem_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "Subsystem");
    private final static QName _AbstractStructureRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "AbstractStructureRelationship");
    private final static QName _Component_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "Component");
    private final static QName _StructureElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "StructureElement");
    private final static QName _StructureModel_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "StructureModel");
    private final static QName _Layer_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "Layer");
    private final static QName _ArchitectureView_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/structure", "ArchitectureView");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.schema.spec.kdm._1_1.structure
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link Layer }
     * 
     */
    public Layer createLayer() {
        return new Layer();
    }

    /**
     * Create an instance of {@link Subsystem }
     * 
     */
    public Subsystem createSubsystem() {
        return new Subsystem();
    }

    /**
     * Create an instance of {@link ArchitectureView }
     * 
     */
    public ArchitectureView createArchitectureView() {
        return new ArchitectureView();
    }

    /**
     * Create an instance of {@link StructureModel }
     * 
     */
    public StructureModel createStructureModel() {
        return new StructureModel();
    }

    /**
     * Create an instance of {@link SoftwareSystem }
     * 
     */
    public SoftwareSystem createSoftwareSystem() {
        return new SoftwareSystem();
    }

    /**
     * Create an instance of {@link StructureRelationship }
     * 
     */
    public StructureRelationship createStructureRelationship() {
        return new StructureRelationship();
    }

    /**
     * Create an instance of {@link StructureElement }
     * 
     */
    public StructureElement createStructureElement() {
        return new StructureElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "StructureRelationship")
    public JAXBElement<StructureRelationship> createStructureRelationship(StructureRelationship value) {
        return new JAXBElement<StructureRelationship>(_StructureRelationship_QNAME, StructureRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftwareSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "SoftwareSystem")
    public JAXBElement<SoftwareSystem> createSoftwareSystem(SoftwareSystem value) {
        return new JAXBElement<SoftwareSystem>(_SoftwareSystem_QNAME, SoftwareSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractStructureElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "AbstractStructureElement")
    public JAXBElement<AbstractStructureElement> createAbstractStructureElement(AbstractStructureElement value) {
        return new JAXBElement<AbstractStructureElement>(_AbstractStructureElement_QNAME, AbstractStructureElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subsystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "Subsystem")
    public JAXBElement<Subsystem> createSubsystem(Subsystem value) {
        return new JAXBElement<Subsystem>(_Subsystem_QNAME, Subsystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractStructureRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "AbstractStructureRelationship")
    public JAXBElement<AbstractStructureRelationship> createAbstractStructureRelationship(AbstractStructureRelationship value) {
        return new JAXBElement<AbstractStructureRelationship>(_AbstractStructureRelationship_QNAME, AbstractStructureRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Component }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "Component")
    public JAXBElement<Component> createComponent(Component value) {
        return new JAXBElement<Component>(_Component_QNAME, Component.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "StructureElement")
    public JAXBElement<StructureElement> createStructureElement(StructureElement value) {
        return new JAXBElement<StructureElement>(_StructureElement_QNAME, StructureElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructureModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "StructureModel")
    public JAXBElement<StructureModel> createStructureModel(StructureModel value) {
        return new JAXBElement<StructureModel>(_StructureModel_QNAME, StructureModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Layer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "Layer")
    public JAXBElement<Layer> createLayer(Layer value) {
        return new JAXBElement<Layer>(_Layer_QNAME, Layer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchitectureView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/structure", name = "ArchitectureView")
    public JAXBElement<ArchitectureView> createArchitectureView(ArchitectureView value) {
        return new JAXBElement<ArchitectureView>(_ArchitectureView_QNAME, ArchitectureView.class, null, value);
    }

}