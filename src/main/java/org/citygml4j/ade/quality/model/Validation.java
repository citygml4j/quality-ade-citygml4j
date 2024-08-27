/*
 * quality-ade-citygml4j - Quality ADE module for citygml4j
 * https://github.com/citygml4j/quality-ade-citygml4j
 *
 * quality-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
