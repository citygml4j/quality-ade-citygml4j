package org.citygml4j.ade.quality;

import org.citygml4j.ade.quality.model.Validation;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class QualityADEModule extends ADEModule {
    public static final QualityADEModule v0_1_4 = new QualityADEModule();

    private QualityADEModule() {
        super("https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4",
                "qual",
                "https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4/qualityAde.xsd",
                CityGMLVersion.v2_0_0);
    }

    @Override
    public URL getSchemaResource() {
        return getClass().getResource("/org/citygml4j/ade/quality/qualityAde.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("de.hft.stuttgart.qualityade._0_1_4");
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return false;
    }

    @Override
    public boolean hasFeature(String name) {
        return "Validation".equals(name);
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return "Validation".equals(name) ? Validation.class : null;
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        return featureClass == Validation.class ? new QName(getNamespaceURI(), "Validation") : null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return Collections.singletonMap("Validation", Validation.class);
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return "Validation".equals(name);
    }
}
