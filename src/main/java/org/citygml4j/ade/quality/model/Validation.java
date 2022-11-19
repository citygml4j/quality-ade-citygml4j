package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.AbstractFeature;

import java.time.ZonedDateTime;

public class Validation extends AbstractFeature implements ADEModelObject {
    private ZonedDateTime validationDate;
    private String validationSoftware;
    private Statistics statistics;
    private ValidationPlan validationPlan;

    public Validation() {
    }

    public Validation(ZonedDateTime validationDate, String validationSoftware, ValidationPlan validationPlan) {
        setValidationDate(validationDate);
        setValidationSoftware(validationSoftware);
        setValidationPlan(validationPlan);
    }

    public ZonedDateTime getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(ZonedDateTime validationDate) {
        this.validationDate = validationDate;
    }

    public String getValidationSoftware() {
        return validationSoftware;
    }

    public void setValidationSoftware(String validationSoftware) {
        this.validationSoftware = validationSoftware;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = ModelObjects.setParent(statistics, this);
    }

    public ValidationPlan getValidationPlan() {
        return validationPlan;
    }

    public void setValidationPlan(ValidationPlan validationPlan) {
        this.validationPlan = ModelObjects.setParent(validationPlan, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Validation copy = target == null ? new Validation() : (Validation) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Validation(), copyBuilder);
    }

    @Override
    public void accept(FeatureVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(FeatureFunctor<T> visitor) {
        return visitor.apply(this);
    }

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
