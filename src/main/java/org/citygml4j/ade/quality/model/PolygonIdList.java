package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

import java.util.ArrayList;
import java.util.List;

public class PolygonIdList extends AbstractDataType {
    private List<String> polygonIds;

    public boolean isSetPolygonIds() {
        return polygonIds != null && !polygonIds.isEmpty();
    }

    public List<String> getPolygonIds() {
        if (polygonIds == null) {
            polygonIds = new ArrayList<>();
        }

        return polygonIds;
    }

    public void setPolygonIds(List<String> polygonIds) {
        this.polygonIds = polygonIds;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PolygonIdList copy = target == null ? new PolygonIdList() : (PolygonIdList) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PolygonIdList(), copyBuilder);
    }
}
