package org.altbeacon.beacon;

import C6.a;
import C6.e;
import androidx.lifecycle.M;
import androidx.lifecycle.z;
import g7.l;

public final class RegionViewModel extends M {
    private final a rangedBeacons$delegate = l.i(RegionViewModel$rangedBeacons$2.INSTANCE);
    private final a regionState$delegate = l.i(RegionViewModel$regionState$2.INSTANCE);

    public final z getRangedBeacons() {
        return (z) ((e) this.rangedBeacons$delegate).a();
    }

    public final z getRegionState() {
        return (z) ((e) this.regionState$delegate).a();
    }
}
