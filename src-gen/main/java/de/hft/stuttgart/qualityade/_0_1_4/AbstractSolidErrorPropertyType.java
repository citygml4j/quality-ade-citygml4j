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
 * <p>Java-Klasse für AbstractSolidErrorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractSolidErrorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractSolidError"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSolidErrorPropertyType", propOrder = {
    "abstractSolidError"
})
public class AbstractSolidErrorPropertyType {

    @XmlElementRef(name = "AbstractSolidError", namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSolidErrorType> abstractSolidError;

    /**
     * Ruft den Wert der abstractSolidError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SolidPolygonWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidAllPolygonsWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidMultipleConnectedComponentsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldVertexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidSelfIntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNotClosedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidTooFewPolygonsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldEdgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSolidErrorType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractSolidErrorType> getAbstractSolidError() {
        return abstractSolidError;
    }

    /**
     * Legt den Wert der abstractSolidError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SolidPolygonWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidAllPolygonsWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidMultipleConnectedComponentsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldVertexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidSelfIntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNotClosedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidTooFewPolygonsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldEdgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSolidErrorType }{@code >}
     *     
     */
    public void setAbstractSolidError(JAXBElement<? extends AbstractSolidErrorType> value) {
        this.abstractSolidError = value;
    }

    public boolean isSetAbstractSolidError() {
        return (this.abstractSolidError!= null);
    }

}
