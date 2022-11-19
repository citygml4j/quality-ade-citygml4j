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
 * <p>Java-Klasse für AbstractErrorPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractErrorPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractError"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractErrorPropertyType", propOrder = {
    "abstractError"
})
public class AbstractErrorPropertyType {

    @XmlElementRef(name = "AbstractError", namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractErrorType> abstractError;

    /**
     * Ruft den Wert der abstractError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeMissingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeWrongValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSemanticErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingConsecutivePointsSameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingNotClosedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingSelfIntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingTooFewPointsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRingErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonIntersectingRingsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInteriorDisconnectedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonOrientationRingsSameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInnerRingsNestedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonHoleOutsideType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarDistancePlaneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarNormalsDeviationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPolygonErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidPolygonWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidAllPolygonsWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidMultipleConnectedComponentsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldVertexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidSelfIntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNotClosedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidTooFewPolygonsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldEdgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSolidErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometryErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractErrorType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractErrorType> getAbstractError() {
        return abstractError;
    }

    /**
     * Legt den Wert der abstractError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeMissingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SemanticAttributeWrongValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSemanticErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingConsecutivePointsSameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingNotClosedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingSelfIntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RingTooFewPointsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRingErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonIntersectingRingsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInteriorDisconnectedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonOrientationRingsSameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonInnerRingsNestedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonHoleOutsideType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarDistancePlaneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonNonPlanarNormalsDeviationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractPolygonErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidPolygonWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidAllPolygonsWrongOrientationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidMultipleConnectedComponentsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldVertexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidSelfIntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNotClosedType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidTooFewPolygonsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolidNonManifoldEdgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSolidErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractGeometryErrorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractErrorType }{@code >}
     *     
     */
    public void setAbstractError(JAXBElement<? extends AbstractErrorType> value) {
        this.abstractError = value;
    }

    public boolean isSetAbstractError() {
        return (this.abstractError!= null);
    }

}
