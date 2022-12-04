/*
 * Copyright 2021 Hochschule für Technik Stuttgart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
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

import java.util.List;

public class Requirement extends AbstractDataType {
    private boolean enabled;
    private RequirementType requirementType;
    private List<Parameter> parameters;

    public Requirement() {
    }

    public Requirement(RequirementType requirementType, boolean enabled) {
        setRequirementType(requirementType);
        setEnabled(enabled);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public RequirementType getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(RequirementType requirementType) {
        this.requirementType = requirementType;
    }

    public boolean isSetParameters() {
        return parameters != null && !parameters.isEmpty();
    }

    public List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new ChildList<>(this);
        }

        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = ModelObjects.setParent(parameters, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Requirement copy = target == null ? new Requirement() : (Requirement) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Requirement(), copyBuilder);
    }
}
