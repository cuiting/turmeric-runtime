//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 06:34:08 AM PDT 
//


package org.ebayopensource.turmeric.runtime.codegen.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLayerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceLayerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="APPLICATION"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="INFRASTRUCTURE"/>
 *     &lt;enumeration value="INTEGRATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceLayerType")
@XmlEnum
public enum ServiceLayerType {

    APPLICATION,
    BUSINESS,
    INFRASTRUCTURE,
    INTEGRATION;

    public String value() {
        return name();
    }

    public static ServiceLayerType fromValue(String v) {
        return valueOf(v);
    }

}
