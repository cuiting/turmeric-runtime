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
import javax.xml.namespace.QName;


/**
 * <p>Java class for SchemaNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attributes" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}SchemaNodeAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentNode" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}SchemaNode"/>
 *         &lt;element name="childNodes" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}SchemaNode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columnNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="libraryInfo" type="{http://www.ebayopensource.org/turmeric/runtime/codegen/common}SchemaNodeLibraryInfo"/>
 *         &lt;element name="abstractAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxoccursAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nameAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="baseAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="typeAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="itemTypeAttrExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="abstractAttrValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxoccursAttrValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameAttrValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseAttrValue" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="refAttrValue" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="typeAttrValue" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="itemTypeAttrValue" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaNode", propOrder = {
    "nodeName",
    "attributes",
    "parentNode",
    "childNodes",
    "fileName",
    "lineNumber",
    "columnNumber",
    "targetNamespace",
    "libraryInfo",
    "abstractAttrExists",
    "maxoccursAttrExists",
    "nameAttrExists",
    "baseAttrExists",
    "refAttrExists",
    "typeAttrExists",
    "itemTypeAttrExists",
    "abstractAttrValue",
    "maxoccursAttrValue",
    "nameAttrValue",
    "baseAttrValue",
    "refAttrValue",
    "typeAttrValue",
    "itemTypeAttrValue"
})
public class SchemaNode {

    @XmlElement(required = true)
    protected String nodeName;
    protected List<SchemaNodeAttribute> attributes;
    @XmlElement(required = true)
    protected SchemaNode parentNode;
    protected List<SchemaNode> childNodes;
    @XmlElement(required = true)
    protected String fileName;
    protected int lineNumber;
    protected int columnNumber;
    @XmlElement(required = true)
    protected String targetNamespace;
    @XmlElement(required = true)
    protected SchemaNodeLibraryInfo libraryInfo;
    protected boolean abstractAttrExists;
    protected boolean maxoccursAttrExists;
    protected boolean nameAttrExists;
    protected boolean baseAttrExists;
    protected boolean refAttrExists;
    protected boolean typeAttrExists;
    protected boolean itemTypeAttrExists;
    protected boolean abstractAttrValue;
    @XmlElement(required = true)
    protected String maxoccursAttrValue;
    @XmlElement(required = true)
    protected String nameAttrValue;
    @XmlElement(required = true)
    protected QName baseAttrValue;
    @XmlElement(required = true)
    protected QName refAttrValue;
    @XmlElement(required = true)
    protected QName typeAttrValue;
    @XmlElement(required = true)
    protected QName itemTypeAttrValue;

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemaNodeAttribute }
     * 
     * 
     */
    public List<SchemaNodeAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<SchemaNodeAttribute>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the parentNode property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaNode }
     *     
     */
    public SchemaNode getParentNode() {
        return parentNode;
    }

    /**
     * Sets the value of the parentNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaNode }
     *     
     */
    public void setParentNode(SchemaNode value) {
        this.parentNode = value;
    }

    /**
     * Gets the value of the childNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemaNode }
     * 
     * 
     */
    public List<SchemaNode> getChildNodes() {
        if (childNodes == null) {
            childNodes = new ArrayList<SchemaNode>();
        }
        return this.childNodes;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the columnNumber property.
     * 
     */
    public int getColumnNumber() {
        return columnNumber;
    }

    /**
     * Sets the value of the columnNumber property.
     * 
     */
    public void setColumnNumber(int value) {
        this.columnNumber = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the libraryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaNodeLibraryInfo }
     *     
     */
    public SchemaNodeLibraryInfo getLibraryInfo() {
        return libraryInfo;
    }

    /**
     * Sets the value of the libraryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaNodeLibraryInfo }
     *     
     */
    public void setLibraryInfo(SchemaNodeLibraryInfo value) {
        this.libraryInfo = value;
    }

    /**
     * Gets the value of the abstractAttrExists property.
     * 
     */
    public boolean isAbstractAttrExists() {
        return abstractAttrExists;
    }

    /**
     * Sets the value of the abstractAttrExists property.
     * 
     */
    public void setAbstractAttrExists(boolean value) {
        this.abstractAttrExists = value;
    }

    /**
     * Gets the value of the maxoccursAttrExists property.
     * 
     */
    public boolean isMaxoccursAttrExists() {
        return maxoccursAttrExists;
    }

    /**
     * Sets the value of the maxoccursAttrExists property.
     * 
     */
    public void setMaxoccursAttrExists(boolean value) {
        this.maxoccursAttrExists = value;
    }

    /**
     * Gets the value of the nameAttrExists property.
     * 
     */
    public boolean isNameAttrExists() {
        return nameAttrExists;
    }

    /**
     * Sets the value of the nameAttrExists property.
     * 
     */
    public void setNameAttrExists(boolean value) {
        this.nameAttrExists = value;
    }

    /**
     * Gets the value of the baseAttrExists property.
     * 
     */
    public boolean isBaseAttrExists() {
        return baseAttrExists;
    }

    /**
     * Sets the value of the baseAttrExists property.
     * 
     */
    public void setBaseAttrExists(boolean value) {
        this.baseAttrExists = value;
    }

    /**
     * Gets the value of the refAttrExists property.
     * 
     */
    public boolean isRefAttrExists() {
        return refAttrExists;
    }

    /**
     * Sets the value of the refAttrExists property.
     * 
     */
    public void setRefAttrExists(boolean value) {
        this.refAttrExists = value;
    }

    /**
     * Gets the value of the typeAttrExists property.
     * 
     */
    public boolean isTypeAttrExists() {
        return typeAttrExists;
    }

    /**
     * Sets the value of the typeAttrExists property.
     * 
     */
    public void setTypeAttrExists(boolean value) {
        this.typeAttrExists = value;
    }

    /**
     * Gets the value of the itemTypeAttrExists property.
     * 
     */
    public boolean isItemTypeAttrExists() {
        return itemTypeAttrExists;
    }

    /**
     * Sets the value of the itemTypeAttrExists property.
     * 
     */
    public void setItemTypeAttrExists(boolean value) {
        this.itemTypeAttrExists = value;
    }

    /**
     * Gets the value of the abstractAttrValue property.
     * 
     */
    public boolean isAbstractAttrValue() {
        return abstractAttrValue;
    }

    /**
     * Sets the value of the abstractAttrValue property.
     * 
     */
    public void setAbstractAttrValue(boolean value) {
        this.abstractAttrValue = value;
    }

    /**
     * Gets the value of the maxoccursAttrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxoccursAttrValue() {
        return maxoccursAttrValue;
    }

    /**
     * Sets the value of the maxoccursAttrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxoccursAttrValue(String value) {
        this.maxoccursAttrValue = value;
    }

    /**
     * Gets the value of the nameAttrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAttrValue() {
        return nameAttrValue;
    }

    /**
     * Sets the value of the nameAttrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAttrValue(String value) {
        this.nameAttrValue = value;
    }

    /**
     * Gets the value of the baseAttrValue property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBaseAttrValue() {
        return baseAttrValue;
    }

    /**
     * Sets the value of the baseAttrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBaseAttrValue(QName value) {
        this.baseAttrValue = value;
    }

    /**
     * Gets the value of the refAttrValue property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getRefAttrValue() {
        return refAttrValue;
    }

    /**
     * Sets the value of the refAttrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setRefAttrValue(QName value) {
        this.refAttrValue = value;
    }

    /**
     * Gets the value of the typeAttrValue property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getTypeAttrValue() {
        return typeAttrValue;
    }

    /**
     * Sets the value of the typeAttrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setTypeAttrValue(QName value) {
        this.typeAttrValue = value;
    }

    /**
     * Gets the value of the itemTypeAttrValue property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getItemTypeAttrValue() {
        return itemTypeAttrValue;
    }

    /**
     * Sets the value of the itemTypeAttrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setItemTypeAttrValue(QName value) {
        this.itemTypeAttrValue = value;
    }

}
