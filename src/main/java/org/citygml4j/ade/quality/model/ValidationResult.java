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
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.base.Reference;

import java.util.List;

public class ValidationResult extends AbstractDataType {
    private Reference validationPlanID;
    private List<AbstractError> errors;
    private ResultType resultType;

    public ValidationResult() {
    }

    public ValidationResult(Reference validationPlanID, ResultType resultType) {
        setValidationPlanID(validationPlanID);
        setResultType(resultType);
    }

    public Reference getValidationPlanID() {
        return validationPlanID;
    }

    public void setValidationPlanID(Reference validationPlanID) {
        this.validationPlanID = ModelObjects.setParent(validationPlanID, this);
    }

    public boolean isSetErrors() {
        return errors != null && !errors.isEmpty();
    }

    public List<AbstractError> getErrors() {
        if (errors == null) {
            errors = new ChildList<>(this);
        }

        return errors;
    }

    public void setErrors(List<AbstractError> errors) {
        this.errors = ModelObjects.setParent(errors, this);
    }

    public ResultType getResultType() {
        return resultType;
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ValidationResult copy = target == null ? new ValidationResult() : (ValidationResult) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ValidationResult(), copyBuilder);
    }
}
