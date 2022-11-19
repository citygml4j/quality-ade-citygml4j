//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RequirementType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="requirementType" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}RequirementTypeType"/&gt;
 *         &lt;element name="parameter" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}ParameterPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementType", propOrder = {
    "enabled",
    "requirementType",
    "parameter"
})
public class RequirementType {

    protected boolean enabled;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequirementTypeType requirementType;
    protected List<ParameterPropertyType> parameter;

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    public boolean isSetEnabled() {
        return true;
    }

    /**
     * Ruft den Wert der requirementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequirementTypeType }
     *     
     */
    public RequirementTypeType getRequirementType() {
        return requirementType;
    }

    /**
     * Legt den Wert der requirementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementTypeType }
     *     
     */
    public void setRequirementType(RequirementTypeType value) {
        this.requirementType = value;
    }

    public boolean isSetRequirementType() {
        return (this.requirementType!= null);
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterPropertyType }
     * 
     * 
     */
    public List<ParameterPropertyType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterPropertyType>();
        }
        return this.parameter;
    }

    public boolean isSetParameter() {
        return ((this.parameter!= null)&&(!this.parameter.isEmpty()));
    }

    public void unsetParameter() {
        this.parameter = null;
    }

}
