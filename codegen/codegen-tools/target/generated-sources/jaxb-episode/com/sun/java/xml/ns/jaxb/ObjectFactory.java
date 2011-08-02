//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 06:34:08 AM PDT 
//


package com.sun.java.xml.ns.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.java.xml.ns.jaxb package. 
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

    private final static QName _Bindings_QNAME = new QName("http://java.sun.com/xml/ns/jaxb", "bindings");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.java.xml.ns.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BindingsLevelTwo }
     * 
     */
    public BindingsLevelTwo createBindingsLevelTwo() {
        return new BindingsLevelTwo();
    }

    /**
     * Create an instance of {@link BindingsClassType }
     * 
     */
    public BindingsClassType createBindingsClassType() {
        return new BindingsClassType();
    }

    /**
     * Create an instance of {@link Bindings }
     * 
     */
    public Bindings createBindings() {
        return new Bindings();
    }

    /**
     * Create an instance of {@link BindingsLevelThree }
     * 
     */
    public BindingsLevelThree createBindingsLevelThree() {
        return new BindingsLevelThree();
    }

    /**
     * Create an instance of {@link SchemaBindings }
     * 
     */
    public SchemaBindings createSchemaBindings() {
        return new SchemaBindings();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bindings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://java.sun.com/xml/ns/jaxb", name = "bindings")
    public JAXBElement<Bindings> createBindings(Bindings value) {
        return new JAXBElement<Bindings>(_Bindings_QNAME, Bindings.class, null, value);
    }

}
