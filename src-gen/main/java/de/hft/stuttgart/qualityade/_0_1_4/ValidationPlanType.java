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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValidationPlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidationPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globalParameters" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GlobalParametersPropertyType"/&gt;
 *         &lt;element name="filter" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FilterPropertyType"/&gt;
 *         &lt;element name="requirement" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}RequirementPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationPlanType", propOrder = {
    "globalParameters",
    "filter",
    "requirement"
})
public class ValidationPlanType {

    @XmlElement(required = true)
    protected GlobalParametersPropertyType globalParameters;
    @XmlElement(required = true)
    protected FilterPropertyType filter;
    @XmlElement(required = true)
    protected List<RequirementPropertyType> requirement;

    /**
     * Ruft den Wert der globalParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GlobalParametersPropertyType }
     *     
     */
    public GlobalParametersPropertyType getGlobalParameters() {
        return globalParameters;
    }

    /**
     * Legt den Wert der globalParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalParametersPropertyType }
     *     
     */
    public void setGlobalParameters(GlobalParametersPropertyType value) {
        this.globalParameters = value;
    }

    public boolean isSetGlobalParameters() {
        return (this.globalParameters!= null);
    }

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FilterPropertyType }
     *     
     */
    public FilterPropertyType getFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPropertyType }
     *     
     */
    public void setFilter(FilterPropertyType value) {
        this.filter = value;
    }

    public boolean isSetFilter() {
        return (this.filter!= null);
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequirementPropertyType }
     * 
     * 
     */
    public List<RequirementPropertyType> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<RequirementPropertyType>();
        }
        return this.requirement;
    }

    public boolean isSetRequirement() {
        return ((this.requirement!= null)&&(!this.requirement.isEmpty()));
    }

    public void unsetRequirement() {
        this.requirement = null;
    }

}
