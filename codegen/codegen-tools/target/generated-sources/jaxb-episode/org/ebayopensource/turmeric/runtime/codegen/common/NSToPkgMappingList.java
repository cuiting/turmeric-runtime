//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.30 at 06:34:08 AM PDT 
//


package org.ebayopensource.turmeric.runtime.codegen.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type definition for specifying  XML namespaces to Java package 
 * 
 * <p>Java class for NSToPkgMappingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSToPkgMappingList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pkg-ns-map" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}NSPkgMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NSToPkgMappingList", propOrder = {
    "pkgNsMap"
})
public class NSToPkgMappingList {

    @XmlElement(name = "pkg-ns-map")
    protected List<NSPkgMappingType> pkgNsMap;

    /**
     * Gets the value of the pkgNsMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pkgNsMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPkgNsMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NSPkgMappingType }
     * 
     * 
     */
    public List<NSPkgMappingType> getPkgNsMap() {
        if (pkgNsMap == null) {
            pkgNsMap = new ArrayList<NSPkgMappingType>();
        }
        return this.pkgNsMap;
    }

}
