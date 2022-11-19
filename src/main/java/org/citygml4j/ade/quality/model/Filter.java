package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

import java.util.ArrayList;
import java.util.List;

public class Filter extends AbstractDataType {
    private List<FeatureType> checking;

    public boolean isSetChecking() {
        return checking != null && !checking.isEmpty();
    }

    public List<FeatureType> getChecking() {
        if (checking == null) {
            checking = new ArrayList<>();
        }

        return checking;
    }

    public void setChecking(List<FeatureType> checking) {
        this.checking = checking;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Filter copy = target == null ? new Filter() : (Filter) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Filter(), copyBuilder);
    }
}
