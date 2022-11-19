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
import net.opengis.gml.ReferenceType;


/**
 * <p>Java-Klasse für ValidationResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidationResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validationPlanID" type="{http://www.opengis.net/gml}ReferenceType"/&gt;
 *         &lt;element name="error" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractErrorPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resultType" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}ResultTypeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResultType", propOrder = {
    "validationPlanID",
    "error",
    "resultType"
})
public class ValidationResultType {

    @XmlElement(required = true)
    protected ReferenceType validationPlanID;
    protected List<AbstractErrorPropertyType> error;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResultTypeType resultType;

    /**
     * Ruft den Wert der validationPlanID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getValidationPlanID() {
        return validationPlanID;
    }

    /**
     * Legt den Wert der validationPlanID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setValidationPlanID(ReferenceType value) {
        this.validationPlanID = value;
    }

    public boolean isSetValidationPlanID() {
        return (this.validationPlanID!= null);
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractErrorPropertyType }
     * 
     * 
     */
    public List<AbstractErrorPropertyType> getError() {
        if (error == null) {
            error = new ArrayList<AbstractErrorPropertyType>();
        }
        return this.error;
    }

    public boolean isSetError() {
        return ((this.error!= null)&&(!this.error.isEmpty()));
    }

    public void unsetError() {
        this.error = null;
    }

    /**
     * Ruft den Wert der resultType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResultTypeType }
     *     
     */
    public ResultTypeType getResultType() {
        return resultType;
    }

    /**
     * Legt den Wert der resultType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultTypeType }
     *     
     */
    public void setResultType(ResultTypeType value) {
        this.resultType = value;
    }

    public boolean isSetResultType() {
        return (this.resultType!= null);
    }

}
