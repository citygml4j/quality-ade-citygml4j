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
 * <p>Java-Klasse für SE_ATTRIBUTE_WRONG_VALUEPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SE_ATTRIBUTE_WRONG_VALUEPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}SE_ATTRIBUTE_WRONG_VALUE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SE_ATTRIBUTE_WRONG_VALUEPropertyType", propOrder = {
    "se_ATTRIBUTE_WRONG_VALUE"
})
public class SemanticAttributeWrongValuePropertyType {

    @XmlElement(name = "SE_ATTRIBUTE_WRONG_VALUE", required = true)
    protected SemanticAttributeWrongValueType se_ATTRIBUTE_WRONG_VALUE;

    /**
     * Ruft den Wert der se_ATTRIBUTE_WRONG_VALUE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SemanticAttributeWrongValueType }
     *     
     */
    public SemanticAttributeWrongValueType getSE_ATTRIBUTE_WRONG_VALUE() {
        return se_ATTRIBUTE_WRONG_VALUE;
    }

    /**
     * Legt den Wert der se_ATTRIBUTE_WRONG_VALUE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticAttributeWrongValueType }
     *     
     */
    public void setSE_ATTRIBUTE_WRONG_VALUE(SemanticAttributeWrongValueType value) {
        this.se_ATTRIBUTE_WRONG_VALUE = value;
    }

    public boolean isSetSE_ATTRIBUTE_WRONG_VALUE() {
        return (this.se_ATTRIBUTE_WRONG_VALUE!= null);
    }

}
