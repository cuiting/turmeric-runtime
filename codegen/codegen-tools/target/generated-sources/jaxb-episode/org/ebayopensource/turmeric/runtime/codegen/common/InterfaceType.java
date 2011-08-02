//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 06:34:08 AM PDT 
//


package org.ebayopensource.turmeric.runtime.codegen.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type definition to indicate type of interface input for Service Code Gen Tools
 * 
 * <p>Java class for InterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="interface-class-def" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}InterfaceClassDefType" minOccurs="0"/>
 *         &lt;element name="impl-class-def" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}ImplClassDefType" minOccurs="0"/>
 *         &lt;element name="interface-def" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}InterfaceDefType" minOccurs="0"/>
 *         &lt;element name="wsdl-def" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}WSDLDefType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceType", propOrder = {
    "interfaceClassDef",
    "implClassDef",
    "interfaceDef",
    "wsdlDef"
})
public class InterfaceType {

    @XmlElement(name = "interface-class-def")
    protected InterfaceClassDefType interfaceClassDef;
    @XmlElement(name = "impl-class-def")
    protected ImplClassDefType implClassDef;
    @XmlElement(name = "interface-def")
    protected InterfaceDefType interfaceDef;
    @XmlElement(name = "wsdl-def")
    protected WSDLDefType wsdlDef;

    /**
     * Gets the value of the interfaceClassDef property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceClassDefType }
     *     
     */
    public InterfaceClassDefType getInterfaceClassDef() {
        return interfaceClassDef;
    }

    /**
     * Sets the value of the interfaceClassDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceClassDefType }
     *     
     */
    public void setInterfaceClassDef(InterfaceClassDefType value) {
        this.interfaceClassDef = value;
    }

    /**
     * Gets the value of the implClassDef property.
     * 
     * @return
     *     possible object is
     *     {@link ImplClassDefType }
     *     
     */
    public ImplClassDefType getImplClassDef() {
        return implClassDef;
    }

    /**
     * Sets the value of the implClassDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplClassDefType }
     *     
     */
    public void setImplClassDef(ImplClassDefType value) {
        this.implClassDef = value;
    }

    /**
     * Gets the value of the interfaceDef property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceDefType }
     *     
     */
    public InterfaceDefType getInterfaceDef() {
        return interfaceDef;
    }

    /**
     * Sets the value of the interfaceDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceDefType }
     *     
     */
    public void setInterfaceDef(InterfaceDefType value) {
        this.interfaceDef = value;
    }

    /**
     * Gets the value of the wsdlDef property.
     * 
     * @return
     *     possible object is
     *     {@link WSDLDefType }
     *     
     */
    public WSDLDefType getWsdlDef() {
        return wsdlDef;
    }

    /**
     * Sets the value of the wsdlDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDLDefType }
     *     
     */
    public void setWsdlDef(WSDLDefType value) {
        this.wsdlDef = value;
    }

}
