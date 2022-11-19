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

public class ValidationPlan extends AbstractDataType {
    private List<Parameter> globalParameters;
    private Filter filter;
    private List<Requirement> requirements;

    public boolean isSetGlobalParameters() {
        return globalParameters != null && !globalParameters.isEmpty();
    }

    public List<Parameter> getGlobalParameters() {
        if (globalParameters == null) {
            globalParameters = new ChildList<>(this);
        }

        return globalParameters;
    }

    public void setGlobalParameters(List<Parameter> globalParameters) {
        this.globalParameters = ModelObjects.setParent(globalParameters, this);
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = ModelObjects.setParent(filter, this);
    }

    public boolean isSetRequirements() {
        return requirements != null && !requirements.isEmpty();
    }

    public List<Requirement> getRequirements() {
        if (requirements == null) {
            requirements = new ChildList<>(this);
        }

        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = ModelObjects.setParent(requirements, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ValidationPlan copy = target == null ? new ValidationPlan() : (ValidationPlan) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ValidationPlan(), copyBuilder);
    }
}
