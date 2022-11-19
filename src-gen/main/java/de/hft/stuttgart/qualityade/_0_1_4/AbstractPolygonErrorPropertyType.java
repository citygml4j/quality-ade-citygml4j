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
 * <p>Java-Klasse für AbstractPolygonErrorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractPolygonErrorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractPolygonError"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPolygonErrorPropertyType", propOrder = {
    "abstractPolygonError"
})
public class AbstractPolygonErrorPropertyType {

    @XmlElementRef(name = "AbstractPolygonError", namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPolygonErrorType> abstractPolygonError;

    /**
     * Ruft den Wert der abstractPolygonError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PolygonIntersectingRingsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInteriorDisconnectedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonOrientationRingsSameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInnerRingsNestedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonHoleOutsideType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarDistancePlaneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarNormalsDeviationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPolygonErrorType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractPolygonErrorType> getAbstractPolygonError() {
        return abstractPolygonError;
    }

    /**
     * Legt den Wert der abstractPolygonError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PolygonIntersectingRingsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInteriorDisconnectedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonOrientationRingsSameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInnerRingsNestedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonHoleOutsideType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarDistancePlaneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarNormalsDeviationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPolygonErrorType }{@code >}
     *     
     */
    public void setAbstractPolygonError(JAXBElement<? extends AbstractPolygonErrorType> value) {
        this.abstractPolygonError = value;
    }

    public boolean isSetAbstractPolygonError() {
        return (this.abstractPolygonError!= null);
    }

}
