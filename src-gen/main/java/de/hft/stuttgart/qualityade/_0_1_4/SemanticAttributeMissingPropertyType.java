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
 * <p>Java-Klasse für SE_ATTRIBUTE_MISSINGPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SE_ATTRIBUTE_MISSINGPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}SE_ATTRIBUTE_MISSING"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SE_ATTRIBUTE_MISSINGPropertyType", propOrder = {
    "se_ATTRIBUTE_MISSING"
})
public class SemanticAttributeMissingPropertyType {

    @XmlElement(name = "SE_ATTRIBUTE_MISSING", required = true)
    protected SemanticAttributeMissingType se_ATTRIBUTE_MISSING;

    /**
     * Ruft den Wert der se_ATTRIBUTE_MISSING-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SemanticAttributeMissingType }
     *     
     */
    public SemanticAttributeMissingType getSE_ATTRIBUTE_MISSING() {
        return se_ATTRIBUTE_MISSING;
    }

    /**
     * Legt den Wert der se_ATTRIBUTE_MISSING-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticAttributeMissingType }
     *     
     */
    public void setSE_ATTRIBUTE_MISSING(SemanticAttributeMissingType value) {
        this.se_ATTRIBUTE_MISSING = value;
    }

    public boolean isSetSE_ATTRIBUTE_MISSING() {
        return (this.se_ATTRIBUTE_MISSING!= null);
    }

}
