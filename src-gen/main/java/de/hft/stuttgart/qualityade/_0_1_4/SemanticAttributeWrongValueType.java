//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SE_ATTRIBUTE_WRONG_VALUEType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SE_ATTRIBUTE_WRONG_VALUEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractSemanticErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="generic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SE_ATTRIBUTE_WRONG_VALUEType", propOrder = {
    "childId",
    "attributeName",
    "generic"
})
public class SemanticAttributeWrongValueType
    extends AbstractSemanticErrorType
{

    @XmlElement(required = true)
    protected String childId;
    @XmlElement(required = true)
    protected String attributeName;
    protected boolean generic;

    /**
     * Ruft den Wert der childId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildId() {
        return childId;
    }

    /**
     * Legt den Wert der childId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildId(String value) {
        this.childId = value;
    }

    public boolean isSetChildId() {
        return (this.childId!= null);
    }

    /**
     * Ruft den Wert der attributeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Legt den Wert der attributeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    public boolean isSetAttributeName() {
        return (this.attributeName!= null);
    }

    /**
     * Ruft den Wert der generic-Eigenschaft ab.
     * 
     */
    public boolean isGeneric() {
        return generic;
    }

    /**
     * Legt den Wert der generic-Eigenschaft fest.
     * 
     */
    public void setGeneric(boolean value) {
        this.generic = value;
    }

    public boolean isSetGeneric() {
        return true;
    }

}
