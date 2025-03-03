package org.altbeacon.beacon.service;

import android.os.Bundle;
import org.altbeacon.beacon.Region;

public class MonitoringData {
    private static final String INSIDE_KEY = "inside";
    private static final String REGION_KEY = "region";
    private static final String TAG = "MonitoringData";
    private final boolean mInside;
    private final Region mRegion;

    public MonitoringData(boolean z, Region region) {
        this.mInside = z;
        this.mRegion = region;
    }

    public static MonitoringData fromBundle(Bundle bundle) {
        Region region;
        bundle.setClassLoader(Region.class.getClassLoader());
        if (bundle.get(REGION_KEY) != null) {
            region = (Region) bundle.getSerializable(REGION_KEY);
        } else {
            region = null;
        }
        return new MonitoringData(bundle.getBoolean(INSIDE_KEY), region);
    }

    public Region getRegion() {
        return this.mRegion;
    }

    public boolean isInside() {
        return this.mInside;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putSerializable(REGION_KEY, this.mRegion);
        bundle.putBoolean(INSIDE_KEY, this.mInside);
        return bundle;
    }
}
