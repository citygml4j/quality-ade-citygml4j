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

public class SolidMultipleConnectedComponents extends AbstractSolidError {
    private List<PolygonIdList> components;

    public SolidMultipleConnectedComponents() {
    }

    public SolidMultipleConnectedComponents(String geometryId, List<PolygonIdList> components) {
        super(geometryId);
        setComponents(components);
    }

    public boolean isSetComponents() {
        return components != null && !components.isEmpty();
    }

    public List<PolygonIdList> getComponents() {
        if (components == null) {
            components = new ChildList<>(this);
        }

        return components;
    }

    public void setComponents(List<PolygonIdList> components) {
        this.components = ModelObjects.setParent(components, this);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_S_MULTIPLE_CONNECTED_COMPONENTS;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SolidMultipleConnectedComponents copy = target == null ?
                new SolidMultipleConnectedComponents() :
                (SolidMultipleConnectedComponents) target;

        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SolidMultipleConnectedComponents(), copyBuilder);
    }
}
