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
 * <p>Java-Klasse für RequirementPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequirementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}Requirement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementPropertyType", propOrder = {
    "requirement"
})
public class RequirementPropertyType {

    @XmlElement(name = "Requirement", required = true)
    protected RequirementType requirement;

    /**
     * Ruft den Wert der requirement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getRequirement() {
        return requirement;
    }

    /**
     * Legt den Wert der requirement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setRequirement(RequirementType value) {
        this.requirement = value;
    }

    public boolean isSetRequirement() {
        return (this.requirement!= null);
    }

}
