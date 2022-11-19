//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.hft.stuttgart.qualityade._0_1_4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbstractError_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "AbstractError");
    private final static QName _AbstractGeometryError_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "AbstractGeometryError");
    private final static QName _AbstractPolygonError_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "AbstractPolygonError");
    private final static QName _AbstractRingError_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "AbstractRingError");
    private final static QName _AbstractSemanticError_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "AbstractSemanticError");
    private final static QName _AbstractSolidError_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "AbstractSolidError");
    private final static QName _Checking_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Checking");
    private final static QName _Edge_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Edge");
    private final static QName _EdgeList_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "EdgeList");
    private final static QName _Error_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Error");
    private final static QName _FeatureStatistics_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "FeatureStatistics");
    private final static QName _Filter_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Filter");
    private final static QName _PolygonHoleOutside_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_HOLE_OUTSIDE");
    private final static QName _PolygonInnerRingsNested_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_INNER_RINGS_NESTED");
    private final static QName _PolygonInteriorDisconnected_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_INTERIOR_DISCONNECTED");
    private final static QName _PolygonIntersectingRings_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_INTERSECTING_RINGS");
    private final static QName _PolygonNonPlanarDistancePlane_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE");
    private final static QName _PolygonNonPlanarNormalsDeviation_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION");
    private final static QName _PolygonOrientationRingsSame_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_P_ORIENTATION_RINGS_SAME");
    private final static QName _RingConsecutivePointsSame_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_R_CONSECUTIVE_POINTS_SAME");
    private final static QName _RingNotClosed_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_R_NOT_CLOSED");
    private final static QName _RingSelfIntersection_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_R_SELF_INTERSECTION");
    private final static QName _RingTooFewPoints_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_R_TOO_FEW_POINTS");
    private final static QName _SolidAllPolygonsWrongOrientation_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_ALL_POLYGONS_WRONG_ORIENTATION");
    private final static QName _SolidMultipleConnectedComponents_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_MULTIPLE_CONNECTED_COMPONENTS");
    private final static QName _SolidNonManifoldEdge_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_NON_MANIFOLD_EDGE");
    private final static QName _SolidNonManifoldVertex_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_NON_MANIFOLD_VERTEX");
    private final static QName _SolidNotClosed_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_NOT_CLOSED");
    private final static QName _SolidPolygonWrongOrientation_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_POLYGON_WRONG_ORIENTATION");
    private final static QName _SolidSelfIntersection_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_SELF_INTERSECTION");
    private final static QName _SolidTooFewPolygons_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GE_S_TOO_FEW_POLYGONS");
    private final static QName _GlobalParameters_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "GlobalParameters");
    private final static QName _Parameter_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Parameter");
    private final static QName _PolygonIdList_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "PolygonIdList");
    private final static QName _Requirement_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Requirement");
    private final static QName _SemanticAttributeMissing_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "SE_ATTRIBUTE_MISSING");
    private final static QName _SemanticAttributeWrongValue_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "SE_ATTRIBUTE_WRONG_VALUE");
    private final static QName _Statistics_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Statistics");
    private final static QName _Validation_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "Validation");
    private final static QName _ValidationPlan_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "ValidationPlan");
    private final static QName _ValidationResult_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "ValidationResult");
    private final static QName _ValidationResultProperty_QNAME = new QName("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", "validationResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.hft.stuttgart.qualityade._0_1_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckingType }
     * 
     */
    public CheckingType createCheckingType() {
        return new CheckingType();
    }

    /**
     * Create an instance of {@link EdgeType }
     * 
     */
    public EdgeType createEdgeType() {
        return new EdgeType();
    }

    /**
     * Create an instance of {@link EdgeListType }
     * 
     */
    public EdgeListType createEdgeListType() {
        return new EdgeListType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link FeatureStatisticsType }
     * 
     */
    public FeatureStatisticsType createFeatureStatisticsType() {
        return new FeatureStatisticsType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link PolygonHoleOutsideType }
     * 
     */
    public PolygonHoleOutsideType createPolygonHoleOutsideType() {
        return new PolygonHoleOutsideType();
    }

    /**
     * Create an instance of {@link PolygonInnerRingsNestedType }
     * 
     */
    public PolygonInnerRingsNestedType createPolygonInnerRingsNestedType() {
        return new PolygonInnerRingsNestedType();
    }

    /**
     * Create an instance of {@link PolygonInteriorDisconnectedType }
     * 
     */
    public PolygonInteriorDisconnectedType createPolygonInteriorDisconnectedType() {
        return new PolygonInteriorDisconnectedType();
    }

    /**
     * Create an instance of {@link PolygonIntersectingRingsType }
     * 
     */
    public PolygonIntersectingRingsType createPolygonIntersectingRingsType() {
        return new PolygonIntersectingRingsType();
    }

    /**
     * Create an instance of {@link PolygonNonPlanarDistancePlaneType }
     * 
     */
    public PolygonNonPlanarDistancePlaneType createPolygonNonPlanarDistancePlaneType() {
        return new PolygonNonPlanarDistancePlaneType();
    }

    /**
     * Create an instance of {@link PolygonNonPlanarNormalsDeviationType }
     * 
     */
    public PolygonNonPlanarNormalsDeviationType createPolygonNonPlanarNormalsDeviationType() {
        return new PolygonNonPlanarNormalsDeviationType();
    }

    /**
     * Create an instance of {@link PolygonOrientationRingsSameType }
     * 
     */
    public PolygonOrientationRingsSameType createPolygonOrientationRingsSameType() {
        return new PolygonOrientationRingsSameType();
    }

    /**
     * Create an instance of {@link RingConsecutivePointsSameType }
     * 
     */
    public RingConsecutivePointsSameType createRingConsecutivePointsSameType() {
        return new RingConsecutivePointsSameType();
    }

    /**
     * Create an instance of {@link RingNotClosedType }
     * 
     */
    public RingNotClosedType createRingNotClosedType() {
        return new RingNotClosedType();
    }

    /**
     * Create an instance of {@link RingSelfIntersectionType }
     * 
     */
    public RingSelfIntersectionType createRingSelfIntersectionType() {
        return new RingSelfIntersectionType();
    }

    /**
     * Create an instance of {@link RingTooFewPointsType }
     * 
     */
    public RingTooFewPointsType createRingTooFewPointsType() {
        return new RingTooFewPointsType();
    }

    /**
     * Create an instance of {@link SolidAllPolygonsWrongOrientationType }
     * 
     */
    public SolidAllPolygonsWrongOrientationType createSolidAllPolygonsWrongOrientationType() {
        return new SolidAllPolygonsWrongOrientationType();
    }

    /**
     * Create an instance of {@link SolidMultipleConnectedComponentsType }
     * 
     */
    public SolidMultipleConnectedComponentsType createSolidMultipleConnectedComponentsType() {
        return new SolidMultipleConnectedComponentsType();
    }

    /**
     * Create an instance of {@link SolidNonManifoldEdgeType }
     * 
     */
    public SolidNonManifoldEdgeType createSolidNonManifoldEdgeType() {
        return new SolidNonManifoldEdgeType();
    }

    /**
     * Create an instance of {@link SolidNonManifoldVertexType }
     * 
     */
    public SolidNonManifoldVertexType createSolidNonManifoldVertexType() {
        return new SolidNonManifoldVertexType();
    }

    /**
     * Create an instance of {@link SolidNotClosedType }
     * 
     */
    public SolidNotClosedType createSolidNotClosedType() {
        return new SolidNotClosedType();
    }

    /**
     * Create an instance of {@link SolidPolygonWrongOrientationType }
     * 
     */
    public SolidPolygonWrongOrientationType createSolidPolygonWrongOrientationType() {
        return new SolidPolygonWrongOrientationType();
    }

    /**
     * Create an instance of {@link SolidSelfIntersectionType }
     * 
     */
    public SolidSelfIntersectionType createSolidSelfIntersectionType() {
        return new SolidSelfIntersectionType();
    }

    /**
     * Create an instance of {@link SolidTooFewPolygonsType }
     * 
     */
    public SolidTooFewPolygonsType createSolidTooFewPolygonsType() {
        return new SolidTooFewPolygonsType();
    }

    /**
     * Create an instance of {@link GlobalParametersType }
     * 
     */
    public GlobalParametersType createGlobalParametersType() {
        return new GlobalParametersType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link PolygonIdListType }
     * 
     */
    public PolygonIdListType createPolygonIdListType() {
        return new PolygonIdListType();
    }

    /**
     * Create an instance of {@link RequirementType }
     * 
     */
    public RequirementType createRequirementType() {
        return new RequirementType();
    }

    /**
     * Create an instance of {@link SemanticAttributeMissingType }
     * 
     */
    public SemanticAttributeMissingType createSemanticAttributeMissingType() {
        return new SemanticAttributeMissingType();
    }

    /**
     * Create an instance of {@link SemanticAttributeWrongValueType }
     * 
     */
    public SemanticAttributeWrongValueType createSemanticAttributeWrongValueType() {
        return new SemanticAttributeWrongValueType();
    }

    /**
     * Create an instance of {@link StatisticsType }
     * 
     */
    public StatisticsType createStatisticsType() {
        return new StatisticsType();
    }

    /**
     * Create an instance of {@link ValidationType }
     * 
     */
    public ValidationType createValidationType() {
        return new ValidationType();
    }

    /**
     * Create an instance of {@link ValidationPlanType }
     * 
     */
    public ValidationPlanType createValidationPlanType() {
        return new ValidationPlanType();
    }

    /**
     * Create an instance of {@link ValidationResultType }
     * 
     */
    public ValidationResultType createValidationResultType() {
        return new ValidationResultType();
    }

    /**
     * Create an instance of {@link ValidationResultPropertyType }
     * 
     */
    public ValidationResultPropertyType createValidationResultPropertyType() {
        return new ValidationResultPropertyType();
    }

    /**
     * Create an instance of {@link AbstractErrorPropertyType }
     * 
     */
    public AbstractErrorPropertyType createAbstractErrorPropertyType() {
        return new AbstractErrorPropertyType();
    }

    /**
     * Create an instance of {@link AbstractGeometryErrorPropertyType }
     * 
     */
    public AbstractGeometryErrorPropertyType createAbstractGeometryErrorPropertyType() {
        return new AbstractGeometryErrorPropertyType();
    }

    /**
     * Create an instance of {@link AbstractPolygonErrorPropertyType }
     * 
     */
    public AbstractPolygonErrorPropertyType createAbstractPolygonErrorPropertyType() {
        return new AbstractPolygonErrorPropertyType();
    }

    /**
     * Create an instance of {@link AbstractRingErrorPropertyType }
     * 
     */
    public AbstractRingErrorPropertyType createAbstractRingErrorPropertyType() {
        return new AbstractRingErrorPropertyType();
    }

    /**
     * Create an instance of {@link AbstractSemanticErrorPropertyType }
     * 
     */
    public AbstractSemanticErrorPropertyType createAbstractSemanticErrorPropertyType() {
        return new AbstractSemanticErrorPropertyType();
    }

    /**
     * Create an instance of {@link AbstractSolidErrorPropertyType }
     * 
     */
    public AbstractSolidErrorPropertyType createAbstractSolidErrorPropertyType() {
        return new AbstractSolidErrorPropertyType();
    }

    /**
     * Create an instance of {@link CheckingPropertyType }
     * 
     */
    public CheckingPropertyType createCheckingPropertyType() {
        return new CheckingPropertyType();
    }

    /**
     * Create an instance of {@link EdgePropertyType }
     * 
     */
    public EdgePropertyType createEdgePropertyType() {
        return new EdgePropertyType();
    }

    /**
     * Create an instance of {@link EdgeListPropertyType }
     * 
     */
    public EdgeListPropertyType createEdgeListPropertyType() {
        return new EdgeListPropertyType();
    }

    /**
     * Create an instance of {@link ErrorPropertyType }
     * 
     */
    public ErrorPropertyType createErrorPropertyType() {
        return new ErrorPropertyType();
    }

    /**
     * Create an instance of {@link FeatureStatisticsPropertyType }
     * 
     */
    public FeatureStatisticsPropertyType createFeatureStatisticsPropertyType() {
        return new FeatureStatisticsPropertyType();
    }

    /**
     * Create an instance of {@link FilterPropertyType }
     * 
     */
    public FilterPropertyType createFilterPropertyType() {
        return new FilterPropertyType();
    }

    /**
     * Create an instance of {@link PolygonHoleOutsidePropertyType }
     * 
     */
    public PolygonHoleOutsidePropertyType createPolygonHoleOutsidePropertyType() {
        return new PolygonHoleOutsidePropertyType();
    }

    /**
     * Create an instance of {@link PolygonInnerRingsNestedPropertyType }
     * 
     */
    public PolygonInnerRingsNestedPropertyType createPolygonInnerRingsNestedPropertyType() {
        return new PolygonInnerRingsNestedPropertyType();
    }

    /**
     * Create an instance of {@link PolygonInteriorDisconnectedPropertyType }
     * 
     */
    public PolygonInteriorDisconnectedPropertyType createPolygonInteriorDisconnectedPropertyType() {
        return new PolygonInteriorDisconnectedPropertyType();
    }

    /**
     * Create an instance of {@link PolygonIntersectingRingsPropertyType }
     * 
     */
    public PolygonIntersectingRingsPropertyType createPolygonIntersectingRingsPropertyType() {
        return new PolygonIntersectingRingsPropertyType();
    }

    /**
     * Create an instance of {@link PolygonNonPlanarDistancePlanePropertyType }
     * 
     */
    public PolygonNonPlanarDistancePlanePropertyType createPolygonNonPlanarDistancePlanePropertyType() {
        return new PolygonNonPlanarDistancePlanePropertyType();
    }

    /**
     * Create an instance of {@link PolygonNonPlanarNormalsDeviationPropertyType }
     * 
     */
    public PolygonNonPlanarNormalsDeviationPropertyType createPolygonNonPlanarNormalsDeviationPropertyType() {
        return new PolygonNonPlanarNormalsDeviationPropertyType();
    }

    /**
     * Create an instance of {@link PolygonOrientationRingsSamePropertyType }
     * 
     */
    public PolygonOrientationRingsSamePropertyType createPolygonOrientationRingsSamePropertyType() {
        return new PolygonOrientationRingsSamePropertyType();
    }

    /**
     * Create an instance of {@link RingConsecutivePointsSamePropertyType }
     * 
     */
    public RingConsecutivePointsSamePropertyType createRingConsecutivePointsSamePropertyType() {
        return new RingConsecutivePointsSamePropertyType();
    }

    /**
     * Create an instance of {@link RingNotClosedPropertyType }
     * 
     */
    public RingNotClosedPropertyType createRingNotClosedPropertyType() {
        return new RingNotClosedPropertyType();
    }

    /**
     * Create an instance of {@link RingSelfIntersectionPropertyType }
     * 
     */
    public RingSelfIntersectionPropertyType createRingSelfIntersectionPropertyType() {
        return new RingSelfIntersectionPropertyType();
    }

    /**
     * Create an instance of {@link RingTooFewPointsPropertyType }
     * 
     */
    public RingTooFewPointsPropertyType createRingTooFewPointsPropertyType() {
        return new RingTooFewPointsPropertyType();
    }

    /**
     * Create an instance of {@link SolidAllPolygonsWrongOrientationPropertyType }
     * 
     */
    public SolidAllPolygonsWrongOrientationPropertyType createSolidAllPolygonsWrongOrientationPropertyType() {
        return new SolidAllPolygonsWrongOrientationPropertyType();
    }

    /**
     * Create an instance of {@link SolidMultipleConnectedComponentsPropertyType }
     * 
     */
    public SolidMultipleConnectedComponentsPropertyType createSolidMultipleConnectedComponentsPropertyType() {
        return new SolidMultipleConnectedComponentsPropertyType();
    }

    /**
     * Create an instance of {@link SolidNonManifoldEdgePropertyType }
     * 
     */
    public SolidNonManifoldEdgePropertyType createSolidNonManifoldEdgePropertyType() {
        return new SolidNonManifoldEdgePropertyType();
    }

    /**
     * Create an instance of {@link SolidNonManifoldVertexPropertyType }
     * 
     */
    public SolidNonManifoldVertexPropertyType createSolidNonManifoldVertexPropertyType() {
        return new SolidNonManifoldVertexPropertyType();
    }

    /**
     * Create an instance of {@link SolidNotClosedPropertyType }
     * 
     */
    public SolidNotClosedPropertyType createSolidNotClosedPropertyType() {
        return new SolidNotClosedPropertyType();
    }

    /**
     * Create an instance of {@link SolidPolygonWrongOrientationPropertyType }
     * 
     */
    public SolidPolygonWrongOrientationPropertyType createSolidPolygonWrongOrientationPropertyType() {
        return new SolidPolygonWrongOrientationPropertyType();
    }

    /**
     * Create an instance of {@link SolidSelfIntersectionPropertyType }
     * 
     */
    public SolidSelfIntersectionPropertyType createSolidSelfIntersectionPropertyType() {
        return new SolidSelfIntersectionPropertyType();
    }

    /**
     * Create an instance of {@link SolidTooFewPolygonsPropertyType }
     * 
     */
    public SolidTooFewPolygonsPropertyType createSolidTooFewPolygonsPropertyType() {
        return new SolidTooFewPolygonsPropertyType();
    }

    /**
     * Create an instance of {@link GlobalParametersPropertyType }
     * 
     */
    public GlobalParametersPropertyType createGlobalParametersPropertyType() {
        return new GlobalParametersPropertyType();
    }

    /**
     * Create an instance of {@link ParameterPropertyType }
     * 
     */
    public ParameterPropertyType createParameterPropertyType() {
        return new ParameterPropertyType();
    }

    /**
     * Create an instance of {@link PolygonIdListPropertyType }
     * 
     */
    public PolygonIdListPropertyType createPolygonIdListPropertyType() {
        return new PolygonIdListPropertyType();
    }

    /**
     * Create an instance of {@link RequirementPropertyType }
     * 
     */
    public RequirementPropertyType createRequirementPropertyType() {
        return new RequirementPropertyType();
    }

    /**
     * Create an instance of {@link SemanticAttributeMissingPropertyType }
     * 
     */
    public SemanticAttributeMissingPropertyType createSemanticAttributeMissingPropertyType() {
        return new SemanticAttributeMissingPropertyType();
    }

    /**
     * Create an instance of {@link SemanticAttributeWrongValuePropertyType }
     * 
     */
    public SemanticAttributeWrongValuePropertyType createSemanticAttributeWrongValuePropertyType() {
        return new SemanticAttributeWrongValuePropertyType();
    }

    /**
     * Create an instance of {@link StatisticsPropertyType }
     * 
     */
    public StatisticsPropertyType createStatisticsPropertyType() {
        return new StatisticsPropertyType();
    }

    /**
     * Create an instance of {@link ValidationPropertyType }
     * 
     */
    public ValidationPropertyType createValidationPropertyType() {
        return new ValidationPropertyType();
    }

    /**
     * Create an instance of {@link ValidationPlanPropertyType }
     * 
     */
    public ValidationPlanPropertyType createValidationPlanPropertyType() {
        return new ValidationPlanPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "AbstractError", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<AbstractErrorType> createAbstractError(AbstractErrorType value) {
        return new JAXBElement<AbstractErrorType>(_AbstractError_QNAME, AbstractErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometryErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractGeometryErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "AbstractGeometryError", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractError")
    public JAXBElement<AbstractGeometryErrorType> createAbstractGeometryError(AbstractGeometryErrorType value) {
        return new JAXBElement<AbstractGeometryErrorType>(_AbstractGeometryError_QNAME, AbstractGeometryErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractPolygonErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractPolygonErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "AbstractPolygonError", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractGeometryError")
    public JAXBElement<AbstractPolygonErrorType> createAbstractPolygonError(AbstractPolygonErrorType value) {
        return new JAXBElement<AbstractPolygonErrorType>(_AbstractPolygonError_QNAME, AbstractPolygonErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractRingErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "AbstractRingError", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractGeometryError")
    public JAXBElement<AbstractRingErrorType> createAbstractRingError(AbstractRingErrorType value) {
        return new JAXBElement<AbstractRingErrorType>(_AbstractRingError_QNAME, AbstractRingErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSemanticErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractSemanticErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "AbstractSemanticError", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractError")
    public JAXBElement<AbstractSemanticErrorType> createAbstractSemanticError(AbstractSemanticErrorType value) {
        return new JAXBElement<AbstractSemanticErrorType>(_AbstractSemanticError_QNAME, AbstractSemanticErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSolidErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractSolidErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "AbstractSolidError", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractGeometryError")
    public JAXBElement<AbstractSolidErrorType> createAbstractSolidError(AbstractSolidErrorType value) {
        return new JAXBElement<AbstractSolidErrorType>(_AbstractSolidError_QNAME, AbstractSolidErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckingType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Checking", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<CheckingType> createChecking(CheckingType value) {
        return new JAXBElement<CheckingType>(_Checking_QNAME, CheckingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Edge", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<EdgeType> createEdge(EdgeType value) {
        return new JAXBElement<EdgeType>(_Edge_QNAME, EdgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdgeListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EdgeListType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "EdgeList", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<EdgeListType> createEdgeList(EdgeListType value) {
        return new JAXBElement<EdgeListType>(_EdgeList_QNAME, EdgeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Error", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureStatisticsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeatureStatisticsType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "FeatureStatistics", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<FeatureStatisticsType> createFeatureStatistics(FeatureStatisticsType value) {
        return new JAXBElement<FeatureStatisticsType>(_FeatureStatistics_QNAME, FeatureStatisticsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Filter", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<FilterType>(_Filter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonHoleOutsideType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonHoleOutsideType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_HOLE_OUTSIDE", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonHoleOutsideType> createPolygonHoleOutside(PolygonHoleOutsideType value) {
        return new JAXBElement<PolygonHoleOutsideType>(_PolygonHoleOutside_QNAME, PolygonHoleOutsideType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonInnerRingsNestedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonInnerRingsNestedType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_INNER_RINGS_NESTED", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonInnerRingsNestedType> createPolygonInnerRingsNested(PolygonInnerRingsNestedType value) {
        return new JAXBElement<PolygonInnerRingsNestedType>(_PolygonInnerRingsNested_QNAME, PolygonInnerRingsNestedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonInteriorDisconnectedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonInteriorDisconnectedType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_INTERIOR_DISCONNECTED", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonInteriorDisconnectedType> createPolygonInteriorDisconnected(PolygonInteriorDisconnectedType value) {
        return new JAXBElement<PolygonInteriorDisconnectedType>(_PolygonInteriorDisconnected_QNAME, PolygonInteriorDisconnectedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonIntersectingRingsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonIntersectingRingsType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_INTERSECTING_RINGS", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonIntersectingRingsType> createPolygonIntersectingRings(PolygonIntersectingRingsType value) {
        return new JAXBElement<PolygonIntersectingRingsType>(_PolygonIntersectingRings_QNAME, PolygonIntersectingRingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonNonPlanarDistancePlaneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonNonPlanarDistancePlaneType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonNonPlanarDistancePlaneType> createPolygonNonPlanarDistancePlane(PolygonNonPlanarDistancePlaneType value) {
        return new JAXBElement<PolygonNonPlanarDistancePlaneType>(_PolygonNonPlanarDistancePlane_QNAME, PolygonNonPlanarDistancePlaneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonNonPlanarNormalsDeviationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonNonPlanarNormalsDeviationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonNonPlanarNormalsDeviationType> createPolygonNonPlanarNormalsDeviation(PolygonNonPlanarNormalsDeviationType value) {
        return new JAXBElement<PolygonNonPlanarNormalsDeviationType>(_PolygonNonPlanarNormalsDeviation_QNAME, PolygonNonPlanarNormalsDeviationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonOrientationRingsSameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonOrientationRingsSameType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_P_ORIENTATION_RINGS_SAME", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractPolygonError")
    public JAXBElement<PolygonOrientationRingsSameType> createPolygonOrientationRingsSame(PolygonOrientationRingsSameType value) {
        return new JAXBElement<PolygonOrientationRingsSameType>(_PolygonOrientationRingsSame_QNAME, PolygonOrientationRingsSameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RingConsecutivePointsSameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RingConsecutivePointsSameType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_R_CONSECUTIVE_POINTS_SAME", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractRingError")
    public JAXBElement<RingConsecutivePointsSameType> createRingConsecutivePointsSame(RingConsecutivePointsSameType value) {
        return new JAXBElement<RingConsecutivePointsSameType>(_RingConsecutivePointsSame_QNAME, RingConsecutivePointsSameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RingNotClosedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RingNotClosedType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_R_NOT_CLOSED", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractRingError")
    public JAXBElement<RingNotClosedType> createRingNotClosed(RingNotClosedType value) {
        return new JAXBElement<RingNotClosedType>(_RingNotClosed_QNAME, RingNotClosedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RingSelfIntersectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RingSelfIntersectionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_R_SELF_INTERSECTION", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractRingError")
    public JAXBElement<RingSelfIntersectionType> createRingSelfIntersection(RingSelfIntersectionType value) {
        return new JAXBElement<RingSelfIntersectionType>(_RingSelfIntersection_QNAME, RingSelfIntersectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RingTooFewPointsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RingTooFewPointsType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_R_TOO_FEW_POINTS", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractRingError")
    public JAXBElement<RingTooFewPointsType> createRingTooFewPoints(RingTooFewPointsType value) {
        return new JAXBElement<RingTooFewPointsType>(_RingTooFewPoints_QNAME, RingTooFewPointsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidAllPolygonsWrongOrientationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidAllPolygonsWrongOrientationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_ALL_POLYGONS_WRONG_ORIENTATION", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidAllPolygonsWrongOrientationType> createSolidAllPolygonsWrongOrientation(SolidAllPolygonsWrongOrientationType value) {
        return new JAXBElement<SolidAllPolygonsWrongOrientationType>(_SolidAllPolygonsWrongOrientation_QNAME, SolidAllPolygonsWrongOrientationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidMultipleConnectedComponentsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidMultipleConnectedComponentsType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_MULTIPLE_CONNECTED_COMPONENTS", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidMultipleConnectedComponentsType> createSolidMultipleConnectedComponents(SolidMultipleConnectedComponentsType value) {
        return new JAXBElement<SolidMultipleConnectedComponentsType>(_SolidMultipleConnectedComponents_QNAME, SolidMultipleConnectedComponentsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidNonManifoldEdgeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidNonManifoldEdgeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_NON_MANIFOLD_EDGE", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidNonManifoldEdgeType> createSolidNonManifoldEdge(SolidNonManifoldEdgeType value) {
        return new JAXBElement<SolidNonManifoldEdgeType>(_SolidNonManifoldEdge_QNAME, SolidNonManifoldEdgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidNonManifoldVertexType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidNonManifoldVertexType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_NON_MANIFOLD_VERTEX", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidNonManifoldVertexType> createSolidNonManifoldVertex(SolidNonManifoldVertexType value) {
        return new JAXBElement<SolidNonManifoldVertexType>(_SolidNonManifoldVertex_QNAME, SolidNonManifoldVertexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidNotClosedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidNotClosedType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_NOT_CLOSED", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidNotClosedType> createSolidNotClosed(SolidNotClosedType value) {
        return new JAXBElement<SolidNotClosedType>(_SolidNotClosed_QNAME, SolidNotClosedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidPolygonWrongOrientationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidPolygonWrongOrientationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_POLYGON_WRONG_ORIENTATION", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidPolygonWrongOrientationType> createSolidPolygonWrongOrientation(SolidPolygonWrongOrientationType value) {
        return new JAXBElement<SolidPolygonWrongOrientationType>(_SolidPolygonWrongOrientation_QNAME, SolidPolygonWrongOrientationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidSelfIntersectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidSelfIntersectionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_SELF_INTERSECTION", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidSelfIntersectionType> createSolidSelfIntersection(SolidSelfIntersectionType value) {
        return new JAXBElement<SolidSelfIntersectionType>(_SolidSelfIntersection_QNAME, SolidSelfIntersectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidTooFewPolygonsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolidTooFewPolygonsType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GE_S_TOO_FEW_POLYGONS", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSolidError")
    public JAXBElement<SolidTooFewPolygonsType> createSolidTooFewPolygons(SolidTooFewPolygonsType value) {
        return new JAXBElement<SolidTooFewPolygonsType>(_SolidTooFewPolygons_QNAME, SolidTooFewPolygonsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalParametersType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalParametersType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "GlobalParameters", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<GlobalParametersType> createGlobalParameters(GlobalParametersType value) {
        return new JAXBElement<GlobalParametersType>(_GlobalParameters_QNAME, GlobalParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Parameter", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<ParameterType> createParameter(ParameterType value) {
        return new JAXBElement<ParameterType>(_Parameter_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonIdListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolygonIdListType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "PolygonIdList", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<PolygonIdListType> createPolygonIdList(PolygonIdListType value) {
        return new JAXBElement<PolygonIdListType>(_PolygonIdList_QNAME, PolygonIdListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequirementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequirementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Requirement", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<RequirementType> createRequirement(RequirementType value) {
        return new JAXBElement<RequirementType>(_Requirement_QNAME, RequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemanticAttributeMissingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SemanticAttributeMissingType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "SE_ATTRIBUTE_MISSING", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSemanticError")
    public JAXBElement<SemanticAttributeMissingType> createSemanticAttributeMissing(SemanticAttributeMissingType value) {
        return new JAXBElement<SemanticAttributeMissingType>(_SemanticAttributeMissing_QNAME, SemanticAttributeMissingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemanticAttributeWrongValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SemanticAttributeWrongValueType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "SE_ATTRIBUTE_WRONG_VALUE", substitutionHeadNamespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", substitutionHeadName = "AbstractSemanticError")
    public JAXBElement<SemanticAttributeWrongValueType> createSemanticAttributeWrongValue(SemanticAttributeWrongValueType value) {
        return new JAXBElement<SemanticAttributeWrongValueType>(_SemanticAttributeWrongValue_QNAME, SemanticAttributeWrongValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatisticsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatisticsType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Statistics", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<StatisticsType> createStatistics(StatisticsType value) {
        return new JAXBElement<StatisticsType>(_Statistics_QNAME, StatisticsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "Validation", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Feature")
    public JAXBElement<ValidationType> createValidation(ValidationType value) {
        return new JAXBElement<ValidationType>(_Validation_QNAME, ValidationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationPlanType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationPlanType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "ValidationPlan", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<ValidationPlanType> createValidationPlan(ValidationPlanType value) {
        return new JAXBElement<ValidationPlanType>(_ValidationPlan_QNAME, ValidationPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationResultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationResultType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "ValidationResult", substitutionHeadNamespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object")
    public JAXBElement<ValidationResultType> createValidationResult(ValidationResultType value) {
        return new JAXBElement<ValidationResultType>(_ValidationResult_QNAME, ValidationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationResultPropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationResultPropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4", name = "validationResult", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObject")
    public JAXBElement<ValidationResultPropertyType> createValidationResultProperty(ValidationResultPropertyType value) {
        return new JAXBElement<ValidationResultPropertyType>(_ValidationResultProperty_QNAME, ValidationResultPropertyType.class, null, value);
    }

}
