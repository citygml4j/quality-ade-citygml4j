package org.citygml4j.ade.quality.bind;

import de.hft.stuttgart.qualityade._0_1_4.ErrorType;
import de.hft.stuttgart.qualityade._0_1_4.RequirementType;
import de.hft.stuttgart.qualityade._0_1_4.RingSelfIntersectionType;
import de.hft.stuttgart.qualityade._0_1_4.*;
import org.citygml4j.ade.quality.model.Error;
import org.citygml4j.ade.quality.model.*;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.xlink.XLinkActuate;
import org.citygml4j.model.gml.xlink.XLinkShow;
import org.citygml4j.model.gml.xlink.XLinkType;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

public class QualityADEUnmarshaller implements ADEUnmarshaller {
    private CheckedTypeMapper<ADEModelObject> typeMapper;
    private ADEUnmarshallerHelper helper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(EdgeType.class, this::unmarshalEdge)
                    .with(ErrorType.class, this::unmarshalError)
                    .with(FeatureStatisticsType.class, this::unmarshalFeatureStatistics)
                    .with(FilterType.class, this::unmarshalFilter)
                    .with(ParameterType.class, this::unmarshalParameter)
                    .with(PolygonHoleOutsideType.class, this::unmarshalPolygonHoleOutside)
                    .with(PolygonIdListType.class, this::unmarshalPolygonIdList)
                    .with(PolygonInnerRingsNestedType.class, this::unmarshalPolygonInnerRingsNested)
                    .with(PolygonInteriorDisconnectedType.class, this::unmarshalPolygonInteriorDisconnected)
                    .with(PolygonIntersectingRingsType.class, this::unmarshalPolygonIntersectingRings)
                    .with(PolygonNonPlanarDistancePlaneType.class, this::unmarshalPolygonNonPlanarDistancePlane)
                    .with(PolygonNonPlanarNormalsDeviationType.class, this::unmarshalPolygonNonPlanarNormalsDeviation)
                    .with(PolygonOrientationRingsSameType.class, this::unmarshalPolygonOrientationRingsSame)
                    .with(RequirementType.class, this::unmarshalRequirement)
                    .with(RingConsecutivePointsSameType.class, this::unmarshalRingConsecutivePointsSame)
                    .with(RingNotClosedType.class, this::unmarshalRingNotClosed)
                    .with(RingSelfIntersectionType.class, this::unmarshalRingSelfIntersection)
                    .with(RingTooFewPointsType.class, this::unmarshalRingTooFewPoints)
                    .with(SemanticAttributeMissingType.class, this::unmarshalSemanticAttributeMissing)
                    .with(SemanticAttributeWrongValueType.class, this::unmarshalSemanticAttributeWrongValue)
                    .with(SolidAllPolygonsWrongOrientationType.class, this::unmarshalSolidAllPolygonsWrongOrientation)
                    .with(SolidMultipleConnectedComponentsType.class, this::unmarshalSolidMultipleConnectedComponents)
                    .with(SolidNonManifoldEdgeType.class, this::unmarshalSolidNonManifoldEdge)
                    .with(SolidNonManifoldVertexType.class, this::unmarshalSolidNonManifoldVertex)
                    .with(SolidNotClosedType.class, this::unmarshalSolidNotClosed)
                    .with(SolidPolygonWrongOrientationType.class, this::unmarshalSolidPolygonWrongOrientation)
                    .with(SolidSelfIntersectionType.class, this::unmarshalSolidSelfIntersection)
                    .with(SolidTooFewPolygonsType.class, this::unmarshalSolidTooFewPolygons)
                    .with(StatisticsType.class, this::unmarshalStatistics)
                    .with(ValidationType.class, this::unmarshalValidation)
                    .with(ValidationPlanType.class, this::unmarshalValidationPlan)
                    .with(ValidationPropertyType.class, this::unmarshalValidationProperty)
                    .with(ValidationResultType.class, this::unmarshalValidationResult)
                    .with(ValidationResultPropertyType.class, this::unmarshalValidationResultProperty);
        }

        return typeMapper;
    }

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        final Object value = src.getValue();

        // generic application properties
        if ("validationResult".equals(src.getName().getLocalPart())) {
            return new ValidationResultPropertyElement(unmarshalValidationResultProperty((ValidationResultPropertyType) src.getValue()));
        } else {
            return unmarshal(value);
        }
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        CheckedTypeMapper<ADEModelObject> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void unmarshalAbstractPolygonError(AbstractPolygonErrorType src, AbstractPolygonError dest) {
        if (src.isSetPolygonId()) {
            dest.setPolygonId(src.getPolygonId());
        }
    }

    private void unmarshalAbstractRingError(AbstractRingErrorType src, AbstractRingError dest) {
        if (src.isSetLinearRingId()) {
            dest.setLinearRingId(src.getLinearRingId());
        }
    }

    private void unmarshalAbstractSolidError(AbstractSolidErrorType src, AbstractSolidError dest) {
        if (src.isSetGeometryId()) {
            dest.setGeometryId(src.getGeometryId());
        }
    }

    private Edge unmarshalEdge(EdgeType src) {
        Edge dest = new Edge();

        if (src.isSetFrom()) {
            dest.setFrom(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getFrom()));
        }

        if (src.isSetTo()) {
            dest.setTo(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getTo()));
        }

        return dest;
    }

    private Error unmarshalError(ErrorType src) {
        Error dest = new Error();

        if (src.isSetOccurrences()) {
            dest.setOccurrences(src.getOccurrences().intValue());
        }

        if (src.isSetName()) {
            dest.setName(org.citygml4j.ade.quality.model.ErrorType.fromValue(src.getName().value()));
        }

        return dest;
    }

    private FeatureStatistics unmarshalFeatureStatistics(FeatureStatisticsType src) {
        FeatureStatistics dest = new FeatureStatistics();

        if (src.isSetNumChecked()) {
            dest.setNumChecked(src.getNumChecked().intValue());
        }

        if (src.isSetNumErrors()) {
            dest.setNumErrors(src.getNumErrors().intValue());
        }

        return dest;
    }

    private Filter unmarshalFilter(FilterType src) {
        Filter dest = new Filter();

        if (src.isSetChecking()) {
            for (CheckingPropertyType property : src.getChecking()) {
                if (property.isSetChecking() && property.getChecking().isSetFeatureType()) {
                    dest.getChecking().add(FeatureType.fromValue(property.getChecking().getFeatureType().value()));
                }
            }
        }

        return dest;
    }

    private Parameter unmarshalParameter(ParameterType src) {
        Parameter dest = new Parameter();

        if (src.isSetName()) {
            dest.setName(src.getName());
        }

        if (src.isSetUom()) {
            dest.setUom(src.getUom());
        }

        if (src.isSetValue()) {
            dest.setValue(src.getValue());
        }

        return dest;
    }

    private PolygonHoleOutside unmarshalPolygonHoleOutside(PolygonHoleOutsideType src) {
        PolygonHoleOutside dest = new PolygonHoleOutside();
        unmarshalAbstractPolygonError(src, dest);

        if (src.isSetLinearRingId()) {
            dest.setLinearRingId(src.getLinearRingId());
        }

        return dest;
    }

    private PolygonIdList unmarshalPolygonIdList(PolygonIdListType src) {
        PolygonIdList dest = new PolygonIdList();

        if (src.isSetPolygonId()) {
            dest.setPolygonIds(src.getPolygonId());
        }

        return dest;
    }

    private PolygonInnerRingsNested unmarshalPolygonInnerRingsNested(PolygonInnerRingsNestedType src) {
        PolygonInnerRingsNested dest = new PolygonInnerRingsNested();
        unmarshalAbstractPolygonError(src, dest);

        if (src.isSetLinearRingId1()) {
            dest.setLinearRingId1(src.getLinearRingId1());
        }

        if (src.isSetLinearRingId2()) {
            dest.setLinearRingId2(src.getLinearRingId2());
        }

        return dest;
    }

    private PolygonInteriorDisconnected unmarshalPolygonInteriorDisconnected(PolygonInteriorDisconnectedType src) {
        PolygonInteriorDisconnected dest = new PolygonInteriorDisconnected();
        unmarshalAbstractPolygonError(src, dest);
        return dest;
    }

    private PolygonIntersectingRings unmarshalPolygonIntersectingRings(PolygonIntersectingRingsType src) {
        PolygonIntersectingRings dest = new PolygonIntersectingRings();
        unmarshalAbstractPolygonError(src, dest);

        if (src.isSetLinearRingId1()) {
            dest.setLinearRingId1(src.getLinearRingId1());
        }

        if (src.isSetLinearRingId2()) {
            dest.setLinearRingId2(src.getLinearRingId2());
        }

        return dest;
    }

    private PolygonNonPlanarDistancePlane unmarshalPolygonNonPlanarDistancePlane(PolygonNonPlanarDistancePlaneType src) {
        PolygonNonPlanarDistancePlane dest = new PolygonNonPlanarDistancePlane();
        unmarshalAbstractPolygonError(src, dest);

        if (src.isSetDistance()) {
            dest.setDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getDistance()));
        }

        if (src.isSetVertex()) {
            dest.setVertex(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getVertex()));
        }

        return dest;
    }

    private PolygonNonPlanarNormalsDeviation unmarshalPolygonNonPlanarNormalsDeviation(PolygonNonPlanarNormalsDeviationType src) {
        PolygonNonPlanarNormalsDeviation dest = new PolygonNonPlanarNormalsDeviation();
        unmarshalAbstractPolygonError(src, dest);

        if (src.isSetDeviation()) {
            dest.setDeviation(helper.getGMLUnmarshaller().unmarshalAngle(src.getDeviation()));
        }

        return dest;
    }

    private PolygonOrientationRingsSame unmarshalPolygonOrientationRingsSame(PolygonOrientationRingsSameType src) {
        PolygonOrientationRingsSame dest = new PolygonOrientationRingsSame();
        unmarshalAbstractPolygonError(src, dest);

        if (src.isSetLinearRingId()) {
            dest.setLinearRingId(src.getLinearRingId());
        }

        return dest;
    }

    private Requirement unmarshalRequirement(RequirementType src) {
        Requirement dest = new Requirement();

        dest.setEnabled(src.isEnabled());

        if (src.isSetRequirementType()) {
            dest.setRequirementType(org.citygml4j.ade.quality.model.RequirementType.fromValue(src.getRequirementType().value()));
        }

        if (src.isSetParameter()) {
            for (ParameterPropertyType property : src.getParameter()) {
                if (property.isSetParameter()) {
                    dest.getParameters().add(unmarshalParameter(property.getParameter()));
                }
            }
        }

        return dest;
    }

    private RingConsecutivePointsSame unmarshalRingConsecutivePointsSame(RingConsecutivePointsSameType src) {
        RingConsecutivePointsSame dest = new RingConsecutivePointsSame();
        unmarshalAbstractRingError(src, dest);

        if (src.isSetVertex1()) {
            dest.setVertex1(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getVertex1()));
        }

        if (src.isSetVertex2()) {
            dest.setVertex2(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getVertex2()));
        }

        return dest;
    }

    private RingNotClosed unmarshalRingNotClosed(RingNotClosedType src) {
        RingNotClosed dest = new RingNotClosed();
        unmarshalAbstractRingError(src, dest);
        return dest;
    }

    private RingSelfIntersection unmarshalRingSelfIntersection(RingSelfIntersectionType src) {
        RingSelfIntersection dest = new RingSelfIntersection();
        unmarshalAbstractRingError(src, dest);

        if (src.isSetEdge1() && src.getEdge1().getEdge() != null) {
            dest.setEdge1(unmarshalEdge(src.getEdge1().getEdge()));
        }

        if (src.isSetEdge2() && src.getEdge2().getEdge() != null) {
            dest.setEdge2(unmarshalEdge(src.getEdge2().getEdge()));
        }

        if (src.isSetVertex1()) {
            dest.setVertex1(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getVertex1()));
        }

        if (src.isSetVertex2()) {
            dest.setVertex2(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getVertex2()));
        }

        if (src.isSetType()) {
            dest.setType(org.citygml4j.ade.quality.model.RingSelfIntersectionType.fromValue(src.getType().value()));
        }

        return dest;
    }

    private RingTooFewPoints unmarshalRingTooFewPoints(RingTooFewPointsType src) {
        RingTooFewPoints dest = new RingTooFewPoints();
        unmarshalAbstractRingError(src, dest);
        return dest;
    }

    private SemanticAttributeMissing unmarshalSemanticAttributeMissing(SemanticAttributeMissingType src) {
        SemanticAttributeMissing dest = new SemanticAttributeMissing();

        if (src.isSetAttributeName()) {
            dest.setAttributeName(src.getAttributeName());
        }

        if (src.isSetChildId()) {
            dest.setChildId(src.getChildId());
        }

        dest.setGeneric(src.isGeneric());

        return dest;
    }

    private SemanticAttributeWrongValue unmarshalSemanticAttributeWrongValue(SemanticAttributeWrongValueType src) {
        SemanticAttributeWrongValue dest = new SemanticAttributeWrongValue();

        if (src.isSetAttributeName()) {
            dest.setAttributeName(src.getAttributeName());
        }

        if (src.isSetChildId()) {
            dest.setChildId(src.getChildId());
        }

        dest.setGeneric(src.isGeneric());

        return dest;
    }

    private SolidAllPolygonsWrongOrientation unmarshalSolidAllPolygonsWrongOrientation(SolidAllPolygonsWrongOrientationType src) {
        SolidAllPolygonsWrongOrientation dest = new SolidAllPolygonsWrongOrientation();
        unmarshalAbstractSolidError(src, dest);
        return dest;
    }

    private SolidMultipleConnectedComponents unmarshalSolidMultipleConnectedComponents(SolidMultipleConnectedComponentsType src) {
        SolidMultipleConnectedComponents dest = new SolidMultipleConnectedComponents();
        unmarshalAbstractSolidError(src, dest);

        if (src.isSetComponent()) {
            for (PolygonIdListPropertyType property : src.getComponent()) {
                if (property.isSetPolygonIdList()) {
                    dest.getComponents().add(unmarshalPolygonIdList(property.getPolygonIdList()));
                }
            }
        }

        return dest;
    }

    private SolidNonManifoldEdge unmarshalSolidNonManifoldEdge(SolidNonManifoldEdgeType src) {
        SolidNonManifoldEdge dest = new SolidNonManifoldEdge();
        unmarshalAbstractSolidError(src, dest);

        if (src.isSetEdges()
                && src.getEdges().isSetEdgeList()
                && src.getEdges().getEdgeList().isSetEdge()) {
            for (EdgePropertyType property : src.getEdges().getEdgeList().getEdge()) {
                if (property.isSetEdge()) {
                    dest.getEdges().add(unmarshalEdge(property.getEdge()));
                }
            }
        }

        return dest;
    }

    private SolidNonManifoldVertex unmarshalSolidNonManifoldVertex(SolidNonManifoldVertexType src) {
        SolidNonManifoldVertex dest = new SolidNonManifoldVertex();
        unmarshalAbstractSolidError(src, dest);

        if (src.isSetVertex()) {
            dest.setVertex(helper.getGMLUnmarshaller().unmarshalDirectPosition(src.getVertex()));
        }

        return dest;
    }

    private SolidNotClosed unmarshalSolidNotClosed(SolidNotClosedType src) {
        SolidNotClosed dest = new SolidNotClosed();
        unmarshalAbstractSolidError(src, dest);

        if (src.isSetEdges()
                && src.getEdges().isSetEdgeList()
                && src.getEdges().getEdgeList().isSetEdge()) {
            for (EdgePropertyType property : src.getEdges().getEdgeList().getEdge()) {
                if (property.isSetEdge()) {
                    dest.getEdges().add(unmarshalEdge(property.getEdge()));
                }
            }
        }

        return dest;
    }

    private SolidPolygonWrongOrientation unmarshalSolidPolygonWrongOrientation(SolidPolygonWrongOrientationType src) {
        SolidPolygonWrongOrientation dest = new SolidPolygonWrongOrientation();
        unmarshalAbstractSolidError(src, dest);

        if (src.isSetEdges()
                && src.getEdges().isSetEdgeList()
                && src.getEdges().getEdgeList().isSetEdge()) {
            for (EdgePropertyType property : src.getEdges().getEdgeList().getEdge()) {
                if (property.isSetEdge()) {
                    dest.getEdges().add(unmarshalEdge(property.getEdge()));
                }
            }
        }

        return dest;
    }

    private SolidSelfIntersection unmarshalSolidSelfIntersection(SolidSelfIntersectionType src) {
        SolidSelfIntersection dest = new SolidSelfIntersection();
        unmarshalAbstractSolidError(src, dest);

        if (src.isSetPolygonId1()) {
            dest.setPolygonId1(src.getPolygonId1());
        }

        if (src.isSetPolygonId2()) {
            dest.setPolygonId2(src.getPolygonId2());
        }

        return dest;
    }

    private SolidTooFewPolygons unmarshalSolidTooFewPolygons(SolidTooFewPolygonsType src) {
        SolidTooFewPolygons dest = new SolidTooFewPolygons();
        unmarshalAbstractSolidError(src, dest);
        return dest;
    }

    private Statistics unmarshalStatistics(StatisticsType src) {
        Statistics dest = new Statistics();

        if (src.isSetNumErrorBridgeObjects() && src.getNumErrorBridgeObjects().isSetFeatureStatistics()) {
            dest.setNumErrorBridgeObjects(unmarshalFeatureStatistics(src.getNumErrorBridgeObjects().getFeatureStatistics()));
        }

        if (src.isSetNumErrorBuildings() && src.getNumErrorBuildings().isSetFeatureStatistics()) {
            dest.setNumErrorBuildings(unmarshalFeatureStatistics(src.getNumErrorBuildings().getFeatureStatistics()));
        }

        if (src.isSetNumErrorLandObjects() && src.getNumErrorLandObjects().isSetFeatureStatistics()) {
            dest.setNumErrorLandObjects(unmarshalFeatureStatistics(src.getNumErrorLandObjects().getFeatureStatistics()));
        }

        if (src.isSetNumErrorTransportation() && src.getNumErrorTransportation().isSetFeatureStatistics()) {
            dest.setNumErrorTransportation(unmarshalFeatureStatistics(src.getNumErrorTransportation().getFeatureStatistics()));
        }

        if (src.isSetNumErrorVegetation() && src.getNumErrorVegetation().isSetFeatureStatistics()) {
            dest.setNumErrorVegetation(unmarshalFeatureStatistics(src.getNumErrorVegetation().getFeatureStatistics()));
        }

        if (src.isSetNumErrorWaterObjects() && src.getNumErrorWaterObjects().isSetFeatureStatistics()) {
            dest.setNumErrorWaterObjects(unmarshalFeatureStatistics(src.getNumErrorWaterObjects().getFeatureStatistics()));
        }

        if (src.isSetError()) {
            for (ErrorPropertyType property : src.getError()) {
                if (property.isSetError()) {
                    dest.getErrors().add(unmarshalError(property.getError()));
                }
            }
        }

        return dest;
    }

    private Validation unmarshalValidation(ValidationType src) throws MissingADESchemaException {
        Validation dest = new Validation();
        helper.getGMLUnmarshaller().unmarshalAbstractFeature(src, dest);

        if (src.isSetValidationDate()) {
            XMLGregorianCalendar validationDate = src.getValidationDate();
            if (validationDate.getTimezone() == DatatypeConstants.FIELD_UNDEFINED) {
                validationDate.setTimezone(0);
            }

            dest.setValidationDate(validationDate.toGregorianCalendar().toZonedDateTime());
        }

        if (src.isSetValidationSoftware()) {
            dest.setValidationSoftware(src.getValidationSoftware());
        }

        if (src.isSetStatistics() && src.getStatistics().isSetStatistics()) {
            dest.setStatistics(unmarshalStatistics(src.getStatistics().getStatistics()));
        }

        if (src.isSetValidationPlan() && src.getValidationPlan().isSetValidationPlan()) {
            dest.setValidationPlan(unmarshalValidationPlan(src.getValidationPlan().getValidationPlan()));
        }

        return dest;
    }

    private ValidationPlan unmarshalValidationPlan(ValidationPlanType src) {
        ValidationPlan dest = new ValidationPlan();

        if (src.isSetGlobalParameters()
                && src.getGlobalParameters().isSetGlobalParameters()
                && src.getGlobalParameters().getGlobalParameters().isSetParameter()) {
            for (ParameterPropertyType property : src.getGlobalParameters().getGlobalParameters().getParameter()) {
                if (property.isSetParameter()) {
                    dest.getGlobalParameters().add(unmarshalParameter(property.getParameter()));
                }
            }
        }

        if (src.isSetFilter() && src.getFilter().isSetFilter()) {
            dest.setFilter(unmarshalFilter(src.getFilter().getFilter()));
        }

        if (src.isSetRequirement()) {
            for (RequirementPropertyType property : src.getRequirement()) {
                if (property.isSetRequirement()) {
                    dest.getRequirements().add(unmarshalRequirement(property.getRequirement()));
                }
            }
        }

        return dest;
    }

    public ValidationProperty unmarshalValidationProperty(ValidationPropertyType src) throws MissingADESchemaException {
        ValidationProperty dest = new ValidationProperty();

        if (src.isSetValidation()) {
            dest.setFeature(unmarshalValidation(src.getValidation()));
        }

        if (src.isSetRemoteSchema()) {
            dest.setRemoteSchema(src.getRemoteSchema());
        }

        if (src.isSetType()) {
            dest.setType(XLinkType.fromValue(src.getType().value()));
        }

        if (src.isSetHref()) {
            dest.setHref(src.getHref());
        }

        if (src.isSetRole()) {
            dest.setRole(src.getRole());
        }

        if (src.isSetArcrole()) {
            dest.setArcrole(src.getArcrole());
        }

        if (src.isSetTitle()) {
            dest.setTitle(src.getTitle());
        }

        if (src.isSetShow()) {
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));
        }

        if (src.isSetActuate()) {
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
        }

        return dest;
    }

    private ValidationResult unmarshalValidationResult(ValidationResultType src) throws MissingADESchemaException {
        ValidationResult dest = new ValidationResult();

        if (src.isSetValidationPlanID()) {
            dest.setValidationPlanID(helper.getGMLUnmarshaller().unmarshalReference(src.getValidationPlanID()));
        }

        if (src.isSetError()) {
            for (AbstractErrorPropertyType property : src.getError()) {
                if (property.isSetAbstractError()) {
                    ModelObject object = helper.getJAXBUnmarshaller().unmarshal(property.getAbstractError());
                    if (object instanceof AbstractError) {
                        dest.getErrors().add((AbstractError) object);
                    }
                }
            }
        }

        if (src.isSetResultType()) {
            dest.setResultType(ResultType.fromValue(src.getResultType().value()));
        }

        return dest;
    }

    public ValidationResultProperty unmarshalValidationResultProperty(ValidationResultPropertyType src) throws MissingADESchemaException {
        ValidationResultProperty dest = new ValidationResultProperty();

        if (src.isSetValidationResult()) {
            dest.setObject(unmarshalValidationResult(src.getValidationResult()));
        }

        return dest;
    }
}
