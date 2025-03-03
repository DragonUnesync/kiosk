package org.altbeacon.beacon.service;

import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;

public class SettingsData implements Serializable {
    private static final String SETTINGS_DATA_KEY = "SettingsData";
    private static final String TAG = "SettingsData";
    Boolean mAndroidLScanningDisabled;
    ArrayList<BeaconParser> mBeaconParsers;
    Boolean mHardwareEqualityEnforced;
    Long mRegionExitPeriod;
    Boolean mRegionStatePersistenceEnabled;
    Boolean mUseTrackingCache;

    public static SettingsData fromBundle(Bundle bundle) {
        bundle.setClassLoader(Region.class.getClassLoader());
        if (bundle.get("SettingsData") != null) {
            return (SettingsData) bundle.getSerializable("SettingsData");
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void apply(org.altbeacon.beacon.service.BeaconService r7) {
        /*
            r6 = this;
            org.altbeacon.beacon.BeaconManager r0 = org.altbeacon.beacon.BeaconManager.getInstanceForApplication(r7)
            boolean r1 = r0.isMainProcess()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = TAG
            java.lang.String r1 = "API Applying settings changes to scanner service"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r0, r1, r2)
            r7.reloadParsers()
            goto L_0x00e8
        L_0x0019:
            java.lang.String r1 = TAG
            java.lang.String r3 = "API Applying settings changes to scanner in other process"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r1, r3, r4)
            java.util.List r3 = r0.getBeaconParsers()
            int r4 = r3.size()
            java.util.ArrayList<org.altbeacon.beacon.BeaconParser> r5 = r6.mBeaconParsers
            int r5 = r5.size()
            if (r4 != r5) goto L_0x007a
            r1 = 0
        L_0x0033:
            int r4 = r3.size()
            if (r1 >= r4) goto L_0x0070
            java.lang.Object r4 = r3.get(r1)
            org.altbeacon.beacon.BeaconParser r4 = (org.altbeacon.beacon.BeaconParser) r4
            java.util.ArrayList<org.altbeacon.beacon.BeaconParser> r5 = r6.mBeaconParsers
            java.lang.Object r5 = r5.get(r1)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006d
            java.lang.String r3 = TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Beacon parsers have changed to: "
            r4.<init>(r5)
            java.util.ArrayList<org.altbeacon.beacon.BeaconParser> r5 = r6.mBeaconParsers
            java.lang.Object r1 = r5.get(r1)
            org.altbeacon.beacon.BeaconParser r1 = (org.altbeacon.beacon.BeaconParser) r1
            java.lang.String r1 = r1.getLayout()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r3, r1, r4)
            goto L_0x0081
        L_0x006d:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0070:
            java.lang.String r0 = TAG
            java.lang.String r1 = "Beacon parsers unchanged."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r0, r1, r2)
            goto L_0x009d
        L_0x007a:
            java.lang.String r3 = "Beacon parsers have been added or removed."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r1, r3, r4)
        L_0x0081:
            java.lang.String r1 = TAG
            java.lang.String r3 = "Updating beacon parsers"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r1, r3, r2)
            java.util.List r1 = r0.getBeaconParsers()
            r1.clear()
            java.util.List r0 = r0.getBeaconParsers()
            java.util.ArrayList<org.altbeacon.beacon.BeaconParser> r1 = r6.mBeaconParsers
            r0.addAll(r1)
            r7.reloadParsers()
        L_0x009d:
            org.altbeacon.beacon.service.MonitoringStatus r7 = org.altbeacon.beacon.service.MonitoringStatus.getInstanceForApplication(r7)
            boolean r0 = r7.isStatePreservationOn()
            if (r0 == 0) goto L_0x00b3
            java.lang.Boolean r0 = r6.mRegionStatePersistenceEnabled
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b3
            r7.stopStatusPreservation()
            goto L_0x00c4
        L_0x00b3:
            boolean r0 = r7.isStatePreservationOn()
            if (r0 != 0) goto L_0x00c4
            java.lang.Boolean r0 = r6.mRegionStatePersistenceEnabled
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c4
            r7.startStatusPreservation()
        L_0x00c4:
            java.lang.Boolean r7 = r6.mAndroidLScanningDisabled
            boolean r7 = r7.booleanValue()
            org.altbeacon.beacon.BeaconManager.setAndroidLScanningDisabled(r7)
            java.lang.Long r7 = r6.mRegionExitPeriod
            long r0 = r7.longValue()
            org.altbeacon.beacon.BeaconManager.setRegionExitPeriod(r0)
            java.lang.Boolean r7 = r6.mUseTrackingCache
            boolean r7 = r7.booleanValue()
            org.altbeacon.beacon.service.RangeState.setUseTrackingCache(r7)
            java.lang.Boolean r7 = r6.mHardwareEqualityEnforced
            boolean r7 = r7.booleanValue()
            org.altbeacon.beacon.Beacon.setHardwareEqualityEnforced(r7)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.SettingsData.apply(org.altbeacon.beacon.service.BeaconService):void");
    }

    public SettingsData collect(Context context) {
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context);
        this.mBeaconParsers = new ArrayList<>(instanceForApplication.getBeaconParsers());
        this.mRegionStatePersistenceEnabled = Boolean.valueOf(instanceForApplication.isRegionStatePersistenceEnabled());
        this.mAndroidLScanningDisabled = Boolean.valueOf(BeaconManager.isAndroidLScanningDisabled());
        this.mRegionExitPeriod = Long.valueOf(BeaconManager.getRegionExitPeriod());
        this.mUseTrackingCache = Boolean.valueOf(RangeState.getUseTrackingCache());
        this.mHardwareEqualityEnforced = Boolean.valueOf(Beacon.getHardwareEqualityEnforced());
        return this;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("SettingsData", this);
        return bundle;
    }
}
