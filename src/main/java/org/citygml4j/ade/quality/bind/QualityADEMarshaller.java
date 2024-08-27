package org.citygml4j.ade.quality.bind;

import de.hft.stuttgart.qualityade._0_1_4.ErrorType;
import de.hft.stuttgart.qualityade._0_1_4.RequirementType;
import de.hft.stuttgart.qualityade._0_1_4.RingSelfIntersectionType;
import de.hft.stuttgart.qualityade._0_1_4.*;
import org.citygml4j.ade.quality.model.Error;
import org.citygml4j.ade.quality.model.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.util.mapper.TypeMapper;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class QualityADEMarshaller implements ADEMarshaller {
    private final ObjectFactory factory = new ObjectFactory();
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;
    private ADEMarshallerHelper helper;

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create();
            elementMapper.with(PolygonHoleOutside.class, this::createPolygonHoleOutside);
            elementMapper.with(PolygonInnerRingsNested.class, this::createPolygonInnerRingsNested);
            elementMapper.with(PolygonInteriorDisconnected.class, this::createPolygonInteriorDisconnected);
            elementMapper.with(PolygonIntersectingRings.class, this::createPolygonIntersectingRings);
            elementMapper.with(PolygonNonPlanarDistancePlane.class, this::createPolygonNonPlanarDistancePlane);
            elementMapper.with(PolygonNonPlanarNormalsDeviation.class, this::createPolygonNonPlanarNormalsDeviation);
            elementMapper.with(PolygonOrientationRingsSame.class, this::createPolygonOrientationRingsSame);
            elementMapper.with(RingConsecutivePointsSame.class, this::createRingConsecutivePointsSame);
            elementMapper.with(RingNotClosed.class, this::createRingNotClosed);
            elementMapper.with(RingSelfIntersection.class, this::createRingSelfIntersection);
            elementMapper.with(RingTooFewPoints.class, this::createRingTooFewPoints);
            elementMapper.with(SemanticAttributeMissing.class, this::createSemanticAttributeMissing);
            elementMapper.with(SemanticAttributeWrongValue.class, this::createSemanticAttributeWrongValue);
            elementMapper.with(SolidAllPolygonsWrongOrientation.class, this::createSolidAllPolygonsWrongOrientation);
            elementMapper.with(SolidMultipleConnectedComponents.class, this::createSolidMultipleConnectedComponents);
            elementMapper.with(SolidNonManifoldEdge.class, this::createSolidNonManifoldEdge);
            elementMapper.with(SolidNonManifoldVertex.class, this::createSolidNonManifoldVertex);
            elementMapper.with(SolidNotClosed.class, this::createSolidNotClosed);
            elementMapper.with(SolidPolygonWrongOrientation.class, this::createSolidPolygonWrongOrientation);
            elementMapper.with(SolidSelfIntersection.class, this::createSolidSelfIntersection);
            elementMapper.with(SolidTooFewPolygons.class, this::createSolidTooFewPolygons);
            elementMapper.with(Validation.class, this::createValidation);
            elementMapper.with(ValidationResultPropertyElement.class, this::createValidationResultPropertyElement);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(Edge.class, this::marshalEdge)
                    .with(Error.class, this::marshalError)
                    .with(FeatureStatistics.class, this::marshalFeatureStatistics)
                    .with(Filter.class, this::marshalFilter)
                    .with(Parameter.class, this::marshalParameter)
                    .with(PolygonHoleOutside.class, this::marshalPolygonHoleOutside)
                    .with(PolygonIdList.class, this::marshalPolygonIdList)
                    .with(PolygonInnerRingsNested.class, this::marshalPolygonInnerRingsNested)
                    .with(PolygonInteriorDisconnected.class, this::marshalPolygonInteriorDisconnected)
                    .with(PolygonIntersectingRings.class, this::marshalPolygonIntersectingRings)
                    .with(PolygonNonPlanarDistancePlane.class, this::marshalPolygonNonPlanarDistancePlane)
                    .with(PolygonNonPlanarNormalsDeviation.class, this::marshalPolygonNonPlanarNormalsDeviation)
                    .with(PolygonOrientationRingsSame.class, this::marshalPolygonOrientationRingsSame)
                    .with(Parameter.class, this::marshalParameter)
                    .with(RingConsecutivePointsSame.class, this::marshalRingConsecutivePointsSame)
                    .with(RingNotClosed.class, this::marshalRingNotClosed)
                    .with(RingSelfIntersection.class, this::marshalRingSelfIntersection)
                    .with(RingTooFewPoints.class, this::marshalRingTooFewPoints)
                    .with(SemanticAttributeMissing.class, this::marshalSemanticAttributeMissing)
                    .with(SemanticAttributeWrongValue.class, this::marshalSemanticAttributeWrongValue)
                    .with(SolidAllPolygonsWrongOrientation.class, this::marshalSolidAllPolygonsWrongOrientation)
                    .with(SolidMultipleConnectedComponents.class, this::marshalSolidMultipleConnectedComponents)
                    .with(SolidNonManifoldEdge.class, this::marshalSolidNonManifoldEdge)
                    .with(SolidNonManifoldVertex.class, this::marshalSolidNonManifoldVertex)
                    .with(SolidNotClosed.class, this::marshalSolidNotClosed)
                    .with(SolidPolygonWrongOrientation.class, this::marshalSolidPolygonWrongOrientation)
                    .with(SolidSelfIntersection.class, this::marshalSolidSelfIntersection)
                    .with(SolidTooFewPolygons.class, this::marshalSolidTooFewPolygons)
                    .with(Statistics.class, this::marshalStatistics)
                    .with(Validation.class, this::marshalValidation)
                    .with(ValidationPlan.class, this::marshalValidationPlan)
                    .with(ValidationProperty.class, this::marshalValidationProperty)
                    .with(ValidationResult.class, this::marshalValidationResult)
                    .with(ValidationResultProperty.class, this::marshalValidationResultProperty);
        }

        return typeMapper;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        TypeMapper<JAXBElement<?>> elementMapper = getElementMapper();
        return elementMapper != null ? elementMapper.apply(src) : null;
    }

    @Override
    public Object marshal(ADEModelObject src) {
        TypeMapper<Object> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void marshalAbstractPolygonError(AbstractPolygonError src, AbstractPolygonErrorType dest) {
        if (src.getPolygonId() != null) {
            dest.setPolygonId(src.getPolygonId());
        }
    }

    private void marshalAbstractRingError(AbstractRingError src, AbstractRingErrorType dest) {
        if (src.getLinearRingId() != null) {
            dest.setLinearRingId(src.getLinearRingId());
        }
    }

    private void marshalAbstractSolidError(AbstractSolidError src, AbstractSolidErrorType dest) {
        if (src.getGeometryId() != null) {
            dest.setGeometryId(src.getGeometryId());
        }
    }

    private EdgeType marshalEdge(Edge src) {
        EdgeType dest = factory.createEdgeType();

        if (src.getFrom() != null) {
            dest.setFrom(helper.getGMLMarshaller().marshalDirectPosition(src.getFrom()));
        }

        if (src.getTo() != null) {
            dest.setTo(helper.getGMLMarshaller().marshalDirectPosition(src.getTo()));
        }

        return dest;
    }

    private ErrorType marshalError(Error src) {
        ErrorType dest = factory.createErrorType();

        dest.setOccurrences(BigInteger.valueOf(src.getOccurrences()));

        if (src.getName() != null) {
            dest.setName(ErrorTypeType.fromValue(src.getName().name()));
        }

        return dest;
    }

    private FeatureStatisticsType marshalFeatureStatistics(FeatureStatistics src) {
        FeatureStatisticsType dest = factory.createFeatureStatisticsType();

        dest.setNumChecked(BigInteger.valueOf(src.getNumChecked()));
        dest.setNumErrors(BigInteger.valueOf(src.getNumErrors()));

        return dest;
    }

    private FilterType marshalFilter(Filter src) {
        FilterType dest = factory.createFilterType();

        if (src.isSetChecking()) {
            for (FeatureType featureType : src.getChecking()) {
                CheckingType checking = factory.createCheckingType();
                checking.setFeatureType(FeatureTypeType.fromValue(featureType.name()));
                CheckingPropertyType property = factory.createCheckingPropertyType();
                property.setChecking(checking);
                dest.getChecking().add(property);
            }
        }

        return dest;
    }

    private ParameterType marshalParameter(Parameter src) {
        ParameterType dest = factory.createParameterType();

        if (src.getName() != null) {
            dest.setName(src.getName());
        }

        if (src.getUom() != null) {
            dest.setUom(src.getUom());
        }

        if (src.getValue() != null) {
            dest.setValue(src.getValue());
        }

        return dest;
    }

    private PolygonHoleOutsideType marshalPolygonHoleOutside(PolygonHoleOutside src) {
        PolygonHoleOutsideType dest = factory.createPolygonHoleOutsideType();
        marshalAbstractPolygonError(src, dest);

        if (src.getLinearRingId() != null) {
            dest.setLinearRingId(src.getLinearRingId());
        }

        return dest;
    }

    private PolygonIdListType marshalPolygonIdList(PolygonIdList src) {
        PolygonIdListType dest = factory.createPolygonIdListType();

        if (src.isSetPolygonIds()) {
            dest.getPolygonId().addAll(src.getPolygonIds());
        }

        return dest;
    }

    private PolygonInnerRingsNestedType marshalPolygonInnerRingsNested(PolygonInnerRingsNested src) {
        PolygonInnerRingsNestedType dest = factory.createPolygonInnerRingsNestedType();
        marshalAbstractPolygonError(src, dest);

        if (src.getLinearRingId1() != null) {
            dest.setLinearRingId1(src.getLinearRingId1());
        }

        if (src.getLinearRingId2() != null) {
            dest.setLinearRingId2(src.getLinearRingId2());
        }

        return dest;
    }

    private PolygonInteriorDisconnectedType marshalPolygonInteriorDisconnected(PolygonInteriorDisconnected src) {
        PolygonInteriorDisconnectedType dest = factory.createPolygonInteriorDisconnectedType();
        marshalAbstractPolygonError(src, dest);
        return dest;
    }

    private PolygonIntersectingRingsType marshalPolygonIntersectingRings(PolygonIntersectingRings src) {
        PolygonIntersectingRingsType dest = factory.createPolygonIntersectingRingsType();
        marshalAbstractPolygonError(src, dest);

        if (src.getLinearRingId1() != null) {
            dest.setLinearRingId1(src.getLinearRingId1());
        }

        if (src.getLinearRingId2() != null) {
            dest.setLinearRingId2(src.getLinearRingId2());
        }

        return dest;
    }

    private PolygonNonPlanarDistancePlaneType marshalPolygonNonPlanarDistancePlane(PolygonNonPlanarDistancePlane src) {
        PolygonNonPlanarDistancePlaneType dest = factory.createPolygonNonPlanarDistancePlaneType();
        marshalAbstractPolygonError(src, dest);

        if (src.getDistance() != null) {
            dest.setDistance(helper.getGMLMarshaller().marshalLength(src.getDistance()));
        }

        if (src.getVertex() != null) {
            dest.setVertex(helper.getGMLMarshaller().marshalDirectPosition(src.getVertex()));
        }

        return dest;
    }

    private PolygonNonPlanarNormalsDeviationType marshalPolygonNonPlanarNormalsDeviation(PolygonNonPlanarNormalsDeviation src) {
        PolygonNonPlanarNormalsDeviationType dest = factory.createPolygonNonPlanarNormalsDeviationType();
        marshalAbstractPolygonError(src, dest);

        if (src.getDeviation() != null) {
            dest.setDeviation(helper.getGMLMarshaller().marshalAngle(src.getDeviation()));
        }

        return dest;
    }

    private PolygonOrientationRingsSameType marshalPolygonOrientationRingsSame(PolygonOrientationRingsSame src) {
        PolygonOrientationRingsSameType dest = factory.createPolygonOrientationRingsSameType();
        marshalAbstractPolygonError(src, dest);

        if (src.getLinearRingId() != null) {
            dest.setLinearRingId(src.getLinearRingId());
        }

        return dest;
    }

    private RequirementType marshalRequirement(Requirement src) {
        RequirementType dest = factory.createRequirementType();

        dest.setEnabled(src.isEnabled());

        if (src.getRequirementType() != null) {
            dest.setRequirementType(RequirementTypeType.fromValue(src.getRequirementType().name()));
        }

        if (src.isSetParameters()) {
            for (Parameter parameter : src.getParameters()) {
                ParameterPropertyType property = factory.createParameterPropertyType();
                property.setParameter(marshalParameter(parameter));
                dest.getParameter().add(property);
            }
        }

        return dest;
    }

    private RingConsecutivePointsSameType marshalRingConsecutivePointsSame(RingConsecutivePointsSame src) {
        RingConsecutivePointsSameType dest = factory.createRingConsecutivePointsSameType();
        marshalAbstractRingError(src, dest);

        if (src.getVertex1() != null) {
            dest.setVertex1(helper.getGMLMarshaller().marshalDirectPosition(src.getVertex1()));
        }

        if (src.getVertex2() != null) {
            dest.setVertex2(helper.getGMLMarshaller().marshalDirectPosition(src.getVertex2()));
        }

        return dest;
    }

    private RingNotClosedType marshalRingNotClosed(RingNotClosed src) {
        RingNotClosedType dest = factory.createRingNotClosedType();
        marshalAbstractRingError(src, dest);
        return dest;
    }

    private RingSelfIntersectionType marshalRingSelfIntersection(RingSelfIntersection src) {
        RingSelfIntersectionType dest = factory.createRingSelfIntersectionType();
        marshalAbstractRingError(src, dest);

        if (src.getEdge1() != null) {
            EdgePropertyType property = factory.createEdgePropertyType();
            property.setEdge(marshalEdge(src.getEdge1()));
            dest.setEdge1(property);
        }

        if (src.getEdge2() != null) {
            EdgePropertyType property = factory.createEdgePropertyType();
            property.setEdge(marshalEdge(src.getEdge2()));
            dest.setEdge2(property);
        }

        if (src.getVertex1() != null) {
            dest.setVertex1(helper.getGMLMarshaller().marshalDirectPosition(src.getVertex1()));
        }

        if (src.getVertex2() != null) {
            dest.setVertex2(helper.getGMLMarshaller().marshalDirectPosition(src.getVertex2()));
        }

        if (src.getType() != null) {
            dest.setType(RingSelfIntersectionTypeType.fromValue(src.getType().name()));
        }

        return dest;
    }

    private RingTooFewPointsType marshalRingTooFewPoints(RingTooFewPoints src) {
        RingTooFewPointsType dest = factory.createRingTooFewPointsType();
        marshalAbstractRingError(src, dest);
        return dest;
    }

    private SemanticAttributeMissingType marshalSemanticAttributeMissing(SemanticAttributeMissing src) {
        SemanticAttributeMissingType dest = factory.createSemanticAttributeMissingType();

        if (src.getAttributeName() != null) {
            dest.setAttributeName(src.getAttributeName());
        }

        if (src.getChildId() != null) {
            dest.setChildId(src.getChildId());
        }

        dest.setGeneric(src.isGeneric());

        return dest;
    }

    private SemanticAttributeWrongValueType marshalSemanticAttributeWrongValue(SemanticAttributeWrongValue src) {
        SemanticAttributeWrongValueType dest = factory.createSemanticAttributeWrongValueType();

        if (src.getAttributeName() != null) {
            dest.setAttributeName(src.getAttributeName());
        }

        if (src.getChildId() != null) {
            dest.setChildId(src.getChildId());
        }

        dest.setGeneric(src.isGeneric());

        return dest;
    }

    private SolidAllPolygonsWrongOrientationType marshalSolidAllPolygonsWrongOrientation(SolidAllPolygonsWrongOrientation src) {
        SolidAllPolygonsWrongOrientationType dest = factory.createSolidAllPolygonsWrongOrientationType();
        marshalAbstractSolidError(src, dest);
        return dest;
    }

    private SolidMultipleConnectedComponentsType marshalSolidMultipleConnectedComponents(SolidMultipleConnectedComponents src) {
        SolidMultipleConnectedComponentsType dest = factory.createSolidMultipleConnectedComponentsType();
        marshalAbstractSolidError(src, dest);

        if (src.isSetComponents()) {
            for (PolygonIdList component : src.getComponents()) {
                PolygonIdListPropertyType property = factory.createPolygonIdListPropertyType();
                property.setPolygonIdList(marshalPolygonIdList(component));
                dest.getComponent().add(property);
            }
        }

        return dest;
    }

    private SolidNonManifoldEdgeType marshalSolidNonManifoldEdge(SolidNonManifoldEdge src) {
        SolidNonManifoldEdgeType dest = factory.createSolidNonManifoldEdgeType();
        marshalAbstractSolidError(src, dest);

        if (src.isSetEdges()) {
            EdgeListType edgeList = factory.createEdgeListType();
            for (Edge edge : src.getEdges()) {
                EdgePropertyType property = factory.createEdgePropertyType();
                property.setEdge(marshalEdge(edge));
                edgeList.getEdge().add(property);
            }

            EdgeListPropertyType property = factory.createEdgeListPropertyType();
            property.setEdgeList(edgeList);
            dest.setEdges(property);
        }

        return dest;
    }

    private SolidNonManifoldVertexType marshalSolidNonManifoldVertex(SolidNonManifoldVertex src) {
        SolidNonManifoldVertexType dest = factory.createSolidNonManifoldVertexType();
        marshalAbstractSolidError(src, dest);

        if (src.getVertex() != null) {
            dest.setVertex(helper.getGMLMarshaller().marshalDirectPosition(src.getVertex()));
        }

        return dest;
    }

    private SolidNotClosedType marshalSolidNotClosed(SolidNotClosed src) {
        SolidNotClosedType dest = factory.createSolidNotClosedType();
        marshalAbstractSolidError(src, dest);

        if (src.isSetEdges()) {
            EdgeListType edgeList = factory.createEdgeListType();
            for (Edge edge : src.getEdges()) {
                EdgePropertyType property = factory.createEdgePropertyType();
                property.setEdge(marshalEdge(edge));
                edgeList.getEdge().add(property);
            }

            EdgeListPropertyType property = factory.createEdgeListPropertyType();
            property.setEdgeList(edgeList);
            dest.setEdges(property);
        }

        return dest;
    }

    private SolidPolygonWrongOrientationType marshalSolidPolygonWrongOrientation(SolidPolygonWrongOrientation src) {
        SolidPolygonWrongOrientationType dest = factory.createSolidPolygonWrongOrientationType();
        marshalAbstractSolidError(src, dest);

        if (src.isSetEdges()) {
            EdgeListType edgeList = factory.createEdgeListType();
            for (Edge edge : src.getEdges()) {
                EdgePropertyType property = factory.createEdgePropertyType();
                property.setEdge(marshalEdge(edge));
                edgeList.getEdge().add(property);
            }

            EdgeListPropertyType property = factory.createEdgeListPropertyType();
            dest.setEdges(property);
        }

        return dest;
    }

    private SolidSelfIntersectionType marshalSolidSelfIntersection(SolidSelfIntersection src) {
        SolidSelfIntersectionType dest = factory.createSolidSelfIntersectionType();
        marshalAbstractSolidError(src, dest);

        if (src.getPolygonId1() != null) {
            dest.setPolygonId1(src.getPolygonId1());
        }

        if (src.getPolygonId2() != null) {
            dest.setPolygonId2(src.getPolygonId2());
        }

        return dest;
    }

    private SolidTooFewPolygonsType marshalSolidTooFewPolygons(SolidTooFewPolygons src) {
        SolidTooFewPolygonsType dest = factory.createSolidTooFewPolygonsType();
        marshalAbstractSolidError(src, dest);
        return dest;
    }

    private StatisticsType marshalStatistics(Statistics src) {
        StatisticsType dest = factory.createStatisticsType();

        if (src.getNumErrorBridgeObjects() != null) {
            FeatureStatisticsPropertyType property = factory.createFeatureStatisticsPropertyType();
            property.setFeatureStatistics(marshalFeatureStatistics(src.getNumErrorBridgeObjects()));
            dest.setNumErrorBridgeObjects(property);
        }

        if (src.getNumErrorBuildings() != null) {
            FeatureStatisticsPropertyType property = factory.createFeatureStatisticsPropertyType();
            property.setFeatureStatistics(marshalFeatureStatistics(src.getNumErrorBuildings()));
            dest.setNumErrorBuildings(property);
        }

        if (src.getNumErrorLandObjects() != null) {
            FeatureStatisticsPropertyType property = factory.createFeatureStatisticsPropertyType();
            property.setFeatureStatistics(marshalFeatureStatistics(src.getNumErrorLandObjects()));
            dest.setNumErrorLandObjects(property);
        }

        if (src.getNumErrorTransportation() != null) {
            FeatureStatisticsPropertyType property = factory.createFeatureStatisticsPropertyType();
            property.setFeatureStatistics(marshalFeatureStatistics(src.getNumErrorTransportation()));
            dest.setNumErrorTransportation(property);
        }

        if (src.getNumErrorVegetation() != null) {
            FeatureStatisticsPropertyType property = factory.createFeatureStatisticsPropertyType();
            property.setFeatureStatistics(marshalFeatureStatistics(src.getNumErrorVegetation()));
            dest.setNumErrorVegetation(property);
        }

        if (src.getNumErrorWaterObjects() != null) {
            FeatureStatisticsPropertyType property = factory.createFeatureStatisticsPropertyType();
            property.setFeatureStatistics(marshalFeatureStatistics(src.getNumErrorWaterObjects()));
            dest.setNumErrorWaterObjects(property);
        }

        if (src.isSetErrors()) {
            for (Error error : src.getErrors()) {
                ErrorPropertyType property = factory.createErrorPropertyType();
                property.setError(marshalError(error));
                dest.getError().add(property);
            }
        }

        return dest;
    }

    public ValidationType marshalValidation(Validation src) {
        ValidationType dest = factory.createValidationType();
        helper.getGMLMarshaller().marshalAbstractFeature(src, dest);

        if (src.getValidationDate() != null) {
            ZonedDateTime validationDate = src.getValidationDate();
            XMLGregorianCalendar value = helper.getJAXBMarshaller().getDataTypeFactory().newXMLGregorianCalendar(
                    validationDate.getYear(),
                    validationDate.getMonthValue(),
                    validationDate.getDayOfMonth(),
                    validationDate.getHour(),
                    validationDate.getMinute(),
                    validationDate.getSecond(),
                    DatatypeConstants.FIELD_UNDEFINED,
                    validationDate.getOffset() != ZoneOffset.UTC ?
                            validationDate.getOffset().getTotalSeconds() / 60 :
                            DatatypeConstants.FIELD_UNDEFINED);

            if (validationDate.getNano() != 0) {
                value.setFractionalSecond(BigDecimal.valueOf(validationDate.getNano(), 9).stripTrailingZeros());
            }

            dest.setValidationDate(value);
        }

        if (src.getValidationSoftware() != null) {
            dest.setValidationSoftware(src.getValidationSoftware());
        }

        if (src.getStatistics() != null) {
            StatisticsPropertyType property = factory.createStatisticsPropertyType();
            property.setStatistics(marshalStatistics(src.getStatistics()));
            dest.setStatistics(property);
        }

        if (src.getValidationPlan() != null) {
            ValidationPlanPropertyType property = factory.createValidationPlanPropertyType();
            property.setValidationPlan(marshalValidationPlan(src.getValidationPlan()));
            dest.setValidationPlan(property);
        }

        return dest;
    }

    public ValidationPlanType marshalValidationPlan(ValidationPlan src) {
        ValidationPlanType dest = factory.createValidationPlanType();

        if (src.isSetGlobalParameters()) {
            GlobalParametersType globalParameters = factory.createGlobalParametersType();
            for (Parameter parameter : src.getGlobalParameters()) {
                ParameterPropertyType property = factory.createParameterPropertyType();
                property.setParameter(marshalParameter(parameter));
                globalParameters.getParameter().add(property);
            }

            GlobalParametersPropertyType property = factory.createGlobalParametersPropertyType();
            property.setGlobalParameters(globalParameters);
            dest.setGlobalParameters(property);
        }

        if (src.getFilter() != null) {
            FilterPropertyType property = factory.createFilterPropertyType();
            property.setFilter(marshalFilter(src.getFilter()));
            dest.setFilter(property);
        }

        if (src.isSetRequirements()) {
            for (Requirement requirement : src.getRequirements()) {
                RequirementPropertyType property = factory.createRequirementPropertyType();
                property.setRequirement(marshalRequirement(requirement));
                dest.getRequirement().add(property);
            }
        }

        return dest;
    }

    public ValidationPropertyType marshalValidationProperty(ValidationProperty src) {
        ValidationPropertyType dest = factory.createValidationPropertyType();

        if (src.isSetFeature()) {
            dest.setValidation(marshalValidation(src.getFeature()));
        }

        if (src.isSetRemoteSchema())
            dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        if (src.isSetHref())
            dest.setHref(src.getHref());

        if (src.isSetRole())
            dest.setRole(src.getRole());

        if (src.isSetArcrole())
            dest.setArcrole(src.getArcrole());

        if (src.isSetTitle())
            dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    @SuppressWarnings("unchecked")
    private ValidationResultType marshalValidationResult(ValidationResult src) {
        ValidationResultType dest = factory.createValidationResultType();

        if (src.getValidationPlanID() != null) {
            dest.setValidationPlanID(helper.getGMLMarshaller().marshalReference(src.getValidationPlanID()));
        }

        if (src.isSetErrors()) {
            for (AbstractError error : src.getErrors()) {
                JAXBElement<?> element = helper.getJAXBMarshaller().marshalJAXBElement(error);
                if (element != null && element.getValue() instanceof AbstractErrorType) {
                    AbstractErrorPropertyType property = factory.createAbstractErrorPropertyType();
                    property.setAbstractError((JAXBElement<? extends AbstractErrorType>) element);
                    dest.getError().add(property);
                }
            }
        }

        if (src.getResultType() != null) {
            dest.setResultType(ResultTypeType.fromValue(src.getResultType().name()));
        }

        return dest;
    }

    public ValidationResultPropertyType marshalValidationResultProperty(ValidationResultProperty src) {
        ValidationResultPropertyType dest = factory.createValidationResultPropertyType();

        if (src.isSetObject()) {
            dest.setValidationResult(marshalValidationResult(src.getObject()));
        }

        return dest;
    }

    private JAXBElement<?> createPolygonHoleOutside(PolygonHoleOutside src) {
        return factory.createPolygonHoleOutside(marshalPolygonHoleOutside(src));
    }

    private JAXBElement<?> createPolygonInnerRingsNested(PolygonInnerRingsNested src) {
        return factory.createPolygonInnerRingsNested(marshalPolygonInnerRingsNested(src));
    }

    private JAXBElement<?> createPolygonInteriorDisconnected(PolygonInteriorDisconnected src) {
        return factory.createPolygonInteriorDisconnected(marshalPolygonInteriorDisconnected(src));
    }

    private JAXBElement<?> createPolygonIntersectingRings(PolygonIntersectingRings src) {
        return factory.createPolygonIntersectingRings(marshalPolygonIntersectingRings(src));
    }

    private JAXBElement<?> createPolygonNonPlanarDistancePlane(PolygonNonPlanarDistancePlane src) {
        return factory.createPolygonNonPlanarDistancePlane(marshalPolygonNonPlanarDistancePlane(src));
    }

    private JAXBElement<?> createPolygonNonPlanarNormalsDeviation(PolygonNonPlanarNormalsDeviation src) {
        return factory.createPolygonNonPlanarNormalsDeviation(marshalPolygonNonPlanarNormalsDeviation(src));
    }

    private JAXBElement<?> createPolygonOrientationRingsSame(PolygonOrientationRingsSame src) {
        return factory.createPolygonOrientationRingsSame(marshalPolygonOrientationRingsSame(src));
    }

    private JAXBElement<?> createRingConsecutivePointsSame(RingConsecutivePointsSame src) {
        return factory.createRingConsecutivePointsSame(marshalRingConsecutivePointsSame(src));
    }

    private JAXBElement<?> createRingNotClosed(RingNotClosed src) {
        return factory.createRingNotClosed(marshalRingNotClosed(src));
    }

    private JAXBElement<?> createRingSelfIntersection(RingSelfIntersection src) {
        return factory.createRingSelfIntersection(marshalRingSelfIntersection(src));
    }

    private JAXBElement<?> createRingTooFewPoints(RingTooFewPoints src) {
        return factory.createRingTooFewPoints(marshalRingTooFewPoints(src));
    }

    private JAXBElement<?> createSemanticAttributeMissing(SemanticAttributeMissing src) {
        return factory.createSemanticAttributeMissing(marshalSemanticAttributeMissing(src));
    }

    private JAXBElement<?> createSemanticAttributeWrongValue(SemanticAttributeWrongValue src) {
        return factory.createSemanticAttributeWrongValue(marshalSemanticAttributeWrongValue(src));
    }

    private JAXBElement<?> createSolidAllPolygonsWrongOrientation(SolidAllPolygonsWrongOrientation src) {
        return factory.createSolidAllPolygonsWrongOrientation(marshalSolidAllPolygonsWrongOrientation(src));
    }

    private JAXBElement<?> createSolidMultipleConnectedComponents(SolidMultipleConnectedComponents src) {
        return factory.createSolidMultipleConnectedComponents(marshalSolidMultipleConnectedComponents(src));
    }

    private JAXBElement<?> createSolidNonManifoldEdge(SolidNonManifoldEdge src) {
        return factory.createSolidNonManifoldEdge(marshalSolidNonManifoldEdge(src));
    }

    private JAXBElement<?> createSolidNonManifoldVertex(SolidNonManifoldVertex src) {
        return factory.createSolidNonManifoldVertex(marshalSolidNonManifoldVertex(src));
    }

    private JAXBElement<?> createSolidNotClosed(SolidNotClosed src) {
        return factory.createSolidNotClosed(marshalSolidNotClosed(src));
    }

    private JAXBElement<?> createSolidPolygonWrongOrientation(SolidPolygonWrongOrientation src) {
        return factory.createSolidPolygonWrongOrientation(marshalSolidPolygonWrongOrientation(src));
    }

    private JAXBElement<?> createSolidSelfIntersection(SolidSelfIntersection src) {
        return factory.createSolidSelfIntersection(marshalSolidSelfIntersection(src));
    }

    private JAXBElement<?> createSolidTooFewPolygons(SolidTooFewPolygons src) {
        return factory.createSolidTooFewPolygons(marshalSolidTooFewPolygons(src));
    }

    public JAXBElement<?> createValidation(Validation src) {
        return factory.createValidation(marshalValidation(src));
    }

    public JAXBElement<?> createValidationResultPropertyElement(ValidationResultPropertyElement src) {
        return factory.createValidationResultProperty(marshalValidationResultProperty(src.getValue()));
    }
}
