//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractSemanticErrorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractSemanticErrorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractSemanticError"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSemanticErrorPropertyType", propOrder = {
    "abstractSemanticError"
})
public class AbstractSemanticErrorPropertyType {

    @XmlElementRef(name = "AbstractSemanticError", namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSemanticErrorType> abstractSemanticError;

    /**
     * Ruft den Wert der abstractSemanticError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeMissingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeWrongValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSemanticErrorType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractSemanticErrorType> getAbstractSemanticError() {
        return abstractSemanticError;
    }

    /**
     * Legt den Wert der abstractSemanticError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeMissingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeWrongValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSemanticErrorType }{@code >}
     *     
     */
    public void setAbstractSemanticError(JAXBElement<? extends AbstractSemanticErrorType> value) {
        this.abstractSemanticError = value;
    }

    public boolean isSetAbstractSemanticError() {
        return (this.abstractSemanticError!= null);
    }

}
