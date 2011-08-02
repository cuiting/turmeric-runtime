//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 06:34:06 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClientConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service-interface-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="service-location" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="service-location-mappings" type="{http://www.ebayopensource.org/turmeric/common/config}ServiceLocationMappingList" minOccurs="0"/>
 *         &lt;element name="wsdl-location" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="client-instance-config" type="{http://www.ebayopensource.org/turmeric/common/config}ClientGroupConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="service-name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientConfig", propOrder = {
    "serviceInterfaceClassName",
    "serviceLocation",
    "serviceLocationMappings",
    "wsdlLocation",
    "clientInstanceConfig"
})
public class ClientConfig {

    @XmlElement(name = "service-interface-class-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInterfaceClassName;
    @XmlElement(name = "service-location")
    @XmlSchemaType(name = "anyURI")
    protected String serviceLocation;
    @XmlElement(name = "service-location-mappings")
    protected ServiceLocationMappingList serviceLocationMappings;
    @XmlElement(name = "wsdl-location")
    @XmlSchemaType(name = "anyURI")
    protected String wsdlLocation;
    @XmlElement(name = "client-instance-config")
    protected ClientGroupConfig clientInstanceConfig;
    @XmlAttribute
    protected String group;
    @XmlAttribute(name = "service-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceName;

    /**
     * Gets the value of the serviceInterfaceClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInterfaceClassName() {
        return serviceInterfaceClassName;
    }

    /**
     * Sets the value of the serviceInterfaceClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInterfaceClassName(String value) {
        this.serviceInterfaceClassName = value;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Sets the value of the serviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLocation(String value) {
        this.serviceLocation = value;
    }

    /**
     * Gets the value of the serviceLocationMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocationMappingList }
     *     
     */
    public ServiceLocationMappingList getServiceLocationMappings() {
        return serviceLocationMappings;
    }

    /**
     * Sets the value of the serviceLocationMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocationMappingList }
     *     
     */
    public void setServiceLocationMappings(ServiceLocationMappingList value) {
        this.serviceLocationMappings = value;
    }

    /**
     * Gets the value of the wsdlLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlLocation() {
        return wsdlLocation;
    }

    /**
     * Sets the value of the wsdlLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlLocation(String value) {
        this.wsdlLocation = value;
    }

    /**
     * Gets the value of the clientInstanceConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClientGroupConfig }
     *     
     */
    public ClientGroupConfig getClientInstanceConfig() {
        return clientInstanceConfig;
    }

    /**
     * Sets the value of the clientInstanceConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientGroupConfig }
     *     
     */
    public void setClientInstanceConfig(ClientGroupConfig value) {
        this.clientInstanceConfig = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

}
