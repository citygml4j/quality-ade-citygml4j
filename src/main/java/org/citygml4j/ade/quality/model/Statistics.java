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

import java.util.List;

public class Statistics extends AbstractDataType {
    private FeatureStatistics numErrorBuildings;
    private FeatureStatistics numErrorVegetation;
    private FeatureStatistics numErrorLandObjects;
    private FeatureStatistics numErrorBridgeObjects;
    private FeatureStatistics numErrorWaterObjects;
    private FeatureStatistics numErrorTransportation;
    private List<Error> errors;

    public FeatureStatistics getNumErrorBuildings() {
        return numErrorBuildings;
    }

    public void setNumErrorBuildings(FeatureStatistics numErrorBuildings) {
        this.numErrorBuildings = ModelObjects.setParent(numErrorBuildings, this);
    }

    public FeatureStatistics getNumErrorVegetation() {
        return numErrorVegetation;
    }

    public void setNumErrorVegetation(FeatureStatistics numErrorVegetation) {
        this.numErrorVegetation = ModelObjects.setParent(numErrorVegetation, this);
    }

    public FeatureStatistics getNumErrorLandObjects() {
        return numErrorLandObjects;
    }

    public void setNumErrorLandObjects(FeatureStatistics numErrorLandObjects) {
        this.numErrorLandObjects = ModelObjects.setParent(numErrorLandObjects, this);
    }

    public FeatureStatistics getNumErrorBridgeObjects() {
        return numErrorBridgeObjects;
    }

    public void setNumErrorBridgeObjects(FeatureStatistics numErrorBridgeObjects) {
        this.numErrorBridgeObjects = ModelObjects.setParent(numErrorBridgeObjects, this);
    }

    public FeatureStatistics getNumErrorWaterObjects() {
        return numErrorWaterObjects;
    }

    public void setNumErrorWaterObjects(FeatureStatistics numErrorWaterObjects) {
        this.numErrorWaterObjects = ModelObjects.setParent(numErrorWaterObjects, this);
    }

    public FeatureStatistics getNumErrorTransportation() {
        return numErrorTransportation;
    }

    public void setNumErrorTransportation(FeatureStatistics numErrorTransportation) {
        this.numErrorTransportation = ModelObjects.setParent(numErrorTransportation, this);
    }

    public boolean isSetErrors() {
        return errors != null && !errors.isEmpty();
    }

    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ChildList<>(this);
        }

        return errors;
    }

    public void setError(List<Error> edges) {
        this.errors = ModelObjects.setParent(edges, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Statistics copy = target == null ? new Statistics() : (Statistics) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Statistics(), copyBuilder);
    }
}
