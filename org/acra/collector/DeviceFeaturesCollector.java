package org.acra.collector;

import P6.f;
import android.content.Context;
import android.content.pm.FeatureInfo;
import org.acra.ReportField;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class DeviceFeaturesCollector extends BaseReportFieldCollector {
    public DeviceFeaturesCollector() {
        super(ReportField.DEVICE_FEATURES);
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        JSONObject jSONObject = new JSONObject();
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        f.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            String str = featureInfo.name;
            if (str != null) {
                jSONObject.put(str, true);
            } else {
                jSONObject.put("glEsVersion", featureInfo.getGlEsVersion());
            }
        }
        aVar.i(ReportField.DEVICE_FEATURES, jSONObject);
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }
}
