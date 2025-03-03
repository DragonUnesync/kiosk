package org.altbeacon.beacon.service;

import N.e;
import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.logging.LogManager;

public class MonitoringStatus {
    private static final int MAX_REGIONS_FOR_STATUS_PRESERVATION = 50;
    private static final int MAX_STATUS_PRESERVATION_FILE_AGE_TO_RESTORE_SECS = 900;
    private static final Object SINGLETON_LOCK = new Object();
    public static final String STATUS_PRESERVATION_FILE_NAME = "org.altbeacon.beacon.service.monitoring_status_state";
    private static final String TAG = "MonitoringStatus";
    private static volatile MonitoringStatus sInstance;
    private boolean inactiveRegionsExist = false;
    private Context mContext;
    private Map<Region, RegionMonitoringState> mRegionsStatesMap;
    private boolean mStatePreservationIsOn = true;

    public MonitoringStatus(Context context) {
        this.mContext = context;
    }

    public static MonitoringStatus getInstanceForApplication(Context context) {
        MonitoringStatus monitoringStatus = sInstance;
        if (monitoringStatus == null) {
            synchronized (SINGLETON_LOCK) {
                try {
                    monitoringStatus = sInstance;
                    if (monitoringStatus == null) {
                        monitoringStatus = new MonitoringStatus(context.getApplicationContext());
                        sInstance = monitoringStatus;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return monitoringStatus;
    }

    private Map<Region, RegionMonitoringState> getRegionsStateMap() {
        if (this.mRegionsStatesMap == null) {
            restoreOrInitializeMonitoringStatus();
        }
        return this.mRegionsStatesMap;
    }

    private List<Region> regionsMatchingTo(Beacon beacon) {
        ArrayList arrayList = new ArrayList();
        for (Region next : regions()) {
            if (next.matchesBeacon(beacon)) {
                arrayList.add(next);
            } else {
                LogManager.d(TAG, "This region (%s) does not match beacon: %s", next, beacon);
            }
        }
        return arrayList;
    }

    private void restoreOrInitializeMonitoringStatus() {
        long currentTimeMillis = System.currentTimeMillis() - getLastMonitoringStatusUpdateTime();
        this.mRegionsStatesMap = new ConcurrentHashMap();
        if (!this.mStatePreservationIsOn) {
            LogManager.d(TAG, "Not restoring monitoring state because persistence is disabled", new Object[0]);
        } else if (currentTimeMillis > 900000) {
            LogManager.d(TAG, e.w("Not restoring monitoring state because it was recorded too many milliseconds ago: ", currentTimeMillis), new Object[0]);
        } else {
            restoreMonitoringStatus();
            LogManager.d(TAG, "Done restoring monitoring status", new Object[0]);
        }
    }

    public RegionMonitoringState addLocalRegion(Region region) {
        return addLocalRegion(region, new Callback((String) null));
    }

    public synchronized void addRegion(Region region, Callback callback) {
        addLocalRegion(region, callback);
        saveMonitoringStatusIfOn();
    }

    public synchronized void clear() {
        this.mContext.deleteFile(STATUS_PRESERVATION_FILE_NAME);
        getRegionsStateMap().clear();
    }

    public synchronized Set<Region> getActiveRegions() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (Region next : getRegionsStateMap().keySet()) {
            if (getRegionsStateMap().get(next).getActiveSinceAppLaunch()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    public long getLastMonitoringStatusUpdateTime() {
        return this.mContext.getFileStreamPath(STATUS_PRESERVATION_FILE_NAME).lastModified();
    }

    public synchronized boolean insideAnyRegion() {
        for (Region stateOf : regions()) {
            RegionMonitoringState stateOf2 = stateOf(stateOf);
            if (stateOf2 != null && stateOf2.getInside()) {
                return true;
            }
        }
        return false;
    }

    public boolean isStatePreservationOn() {
        return this.mStatePreservationIsOn;
    }

    public synchronized void purgeInactiveRegions() {
        try {
            if (this.inactiveRegionsExist) {
                LogManager.d(TAG, "Time to purge inactive regions.", new Object[0]);
                HashMap hashMap = new HashMap();
                boolean z = false;
                for (Region next : getRegionsStateMap().keySet()) {
                    RegionMonitoringState regionMonitoringState = getRegionsStateMap().get(next);
                    if (regionMonitoringState.getActiveSinceAppLaunch()) {
                        hashMap.put(next, regionMonitoringState);
                    } else {
                        String str = TAG;
                        LogManager.d(str, "We will purge this inactive region: " + next, new Object[0]);
                        z = true;
                    }
                }
                if (z) {
                    this.mRegionsStatesMap = hashMap;
                    saveMonitoringStatusIfOn();
                }
                this.inactiveRegionsExist = false;
            }
        } finally {
            while (true) {
            }
        }
    }

    public synchronized Set<Region> regions() {
        return getRegionsStateMap().keySet();
    }

    public synchronized int regionsCount() {
        return regions().size();
    }

    public void removeLocalRegion(Region region) {
        getRegionsStateMap().remove(region);
    }

    public synchronized void removeRegion(Region region) {
        removeLocalRegion(region);
        saveMonitoringStatusIfOn();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(5:1|2|3|4|(9:5|6|(2:9|7)|60|18|(4:21|(2:23|64)(1:63)|61|19)|62|24|(2:26|27)))|28|29|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00ae */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6 A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7 A[SYNTHETIC, Splitter:B:46:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f2 A[SYNTHETIC, Splitter:B:52:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9 A[SYNTHETIC, Splitter:B:56:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void restoreMonitoringStatus() {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "Restored region monitoring state for "
            r3 = 0
            android.content.Context r4 = r10.mContext     // Catch:{ IOException -> 0x00c4, ClassNotFoundException -> 0x00c2, ClassCastException -> 0x00bf, all -> 0x00bc }
            java.lang.String r5 = "org.altbeacon.beacon.service.monitoring_status_state"
            java.io.FileInputStream r4 = r4.openFileInput(r5)     // Catch:{ IOException -> 0x00c4, ClassNotFoundException -> 0x00c2, ClassCastException -> 0x00bf, all -> 0x00bc }
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00ba, ClassNotFoundException -> 0x00b8, ClassCastException -> 0x00b5, all -> 0x00b2 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00ba, ClassNotFoundException -> 0x00b8, ClassCastException -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r3 = r5.readObject()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r6 = TAG     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            int r2 = r3.size()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r7.append(r2)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r2 = " regions."
            r7.append(r2)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r2 = r7.toString()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            org.altbeacon.beacon.logging.LogManager.d(r6, r2, r7)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.util.Set r2 = r3.keySet()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
        L_0x003c:
            boolean r6 = r2.hasNext()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r2.next()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            org.altbeacon.beacon.Region r6 = (org.altbeacon.beacon.Region) r6     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r7 = TAG     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r8.<init>()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r9 = "Region  "
            r8.append(r9)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r8.append(r6)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r9 = " uniqueId: "
            r8.append(r9)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r9 = r6.getUniqueId()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r8.append(r9)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r9 = " state: "
            r8.append(r9)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.Object r6 = r3.get(r6)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r8.append(r6)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.String r6 = r8.toString()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            org.altbeacon.beacon.logging.LogManager.d(r7, r6, r8)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            goto L_0x003c
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            r3 = r4
            goto L_0x00f0
        L_0x007d:
            r2 = move-exception
        L_0x007e:
            r3 = r4
            goto L_0x00c6
        L_0x0080:
            r2 = move-exception
            goto L_0x007e
        L_0x0082:
            r2 = move-exception
            goto L_0x007e
        L_0x0084:
            java.util.Collection r2 = r3.values()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
        L_0x008c:
            boolean r6 = r2.hasNext()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            if (r6 == 0) goto L_0x00a4
            java.lang.Object r6 = r2.next()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            org.altbeacon.beacon.service.RegionMonitoringState r6 = (org.altbeacon.beacon.service.RegionMonitoringState) r6     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r10.inactiveRegionsExist = r0     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            boolean r7 = r6.getInside()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            r6.markInside()     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            goto L_0x008c
        L_0x00a4:
            java.util.Map<org.altbeacon.beacon.Region, org.altbeacon.beacon.service.RegionMonitoringState> r2 = r10.mRegionsStatesMap     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            r2.putAll(r3)     // Catch:{ IOException -> 0x0082, ClassNotFoundException -> 0x0080, ClassCastException -> 0x007d, all -> 0x0079 }
            if (r4 == 0) goto L_0x00ae
            r4.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r5.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00ef
        L_0x00b2:
            r0 = move-exception
            r5 = r3
            goto L_0x007a
        L_0x00b5:
            r2 = move-exception
        L_0x00b6:
            r5 = r3
            goto L_0x007e
        L_0x00b8:
            r2 = move-exception
            goto L_0x00b6
        L_0x00ba:
            r2 = move-exception
            goto L_0x00b6
        L_0x00bc:
            r0 = move-exception
            r5 = r3
            goto L_0x00f0
        L_0x00bf:
            r2 = move-exception
        L_0x00c0:
            r5 = r3
            goto L_0x00c6
        L_0x00c2:
            r2 = move-exception
            goto L_0x00c0
        L_0x00c4:
            r2 = move-exception
            goto L_0x00c0
        L_0x00c6:
            boolean r4 = r2 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00d6
            java.lang.String r0 = TAG     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = "Serialized Monitoring State has wrong class. Just ignoring saved state..."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d4 }
            org.altbeacon.beacon.logging.LogManager.d(r0, r2, r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x00e5
        L_0x00d4:
            r0 = move-exception
            goto L_0x00f0
        L_0x00d6:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00d4 }
            java.lang.String r6 = "Deserialization exception, message: %s"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00d4 }
            r0[r1] = r2     // Catch:{ all -> 0x00d4 }
            org.altbeacon.beacon.logging.LogManager.e(r4, r6, r0)     // Catch:{ all -> 0x00d4 }
        L_0x00e5:
            if (r3 == 0) goto L_0x00ec
            r3.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            if (r5 == 0) goto L_0x00ef
            goto L_0x00ae
        L_0x00ef:
            return
        L_0x00f0:
            if (r3 == 0) goto L_0x00f7
            r3.close()     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
            r5.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.MonitoringStatus.restoreMonitoringStatus():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC, Splitter:B:37:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009c A[SYNTHETIC, Splitter:B:43:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3 A[SYNTHETIC, Splitter:B:47:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveMonitoringStatusIfOn() {
        /*
            r9 = this;
            r0 = 0
            boolean r1 = r9.mStatePreservationIsOn
            if (r1 != 0) goto L_0x0006
            return
        L_0x0006:
            java.lang.String r1 = TAG
            java.lang.String r2 = "saveMonitoringStatusIfOn()"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            org.altbeacon.beacon.logging.LogManager.d(r1, r2, r3)
            java.util.Map r2 = r9.getRegionsStateMap()
            int r2 = r2.size()
            r3 = 50
            java.lang.String r4 = "org.altbeacon.beacon.service.monitoring_status_state"
            if (r2 <= r3) goto L_0x002b
            java.lang.String r2 = "Too many regions being monitored.  Will not persist region state"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.altbeacon.beacon.logging.LogManager.w(r1, r2, r0)
            android.content.Context r0 = r9.mContext
            r0.deleteFile(r4)
            goto L_0x0099
        L_0x002b:
            r1 = 0
            android.content.Context r2 = r9.mContext     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.io.FileOutputStream r2 = r2.openFileOutput(r4, r0)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0072, all -> 0x006f }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0072, all -> 0x006f }
            java.util.Map r1 = r9.getRegionsStateMap()     // Catch:{ IOException -> 0x0061 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x0061 }
            r4.<init>()     // Catch:{ IOException -> 0x0061 }
            java.util.Set r5 = r1.keySet()     // Catch:{ IOException -> 0x0061 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0061 }
        L_0x0048:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0061 }
            if (r6 == 0) goto L_0x0063
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0061 }
            org.altbeacon.beacon.Region r6 = (org.altbeacon.beacon.Region) r6     // Catch:{ IOException -> 0x0061 }
            java.lang.Object r7 = r1.get(r6)     // Catch:{ IOException -> 0x0061 }
            org.altbeacon.beacon.service.RegionMonitoringState r7 = (org.altbeacon.beacon.service.RegionMonitoringState) r7     // Catch:{ IOException -> 0x0061 }
            r4.put(r6, r7)     // Catch:{ IOException -> 0x0061 }
            goto L_0x0048
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            r1 = r2
            goto L_0x009a
        L_0x0061:
            r1 = move-exception
            goto L_0x007e
        L_0x0063:
            r3.writeObject(r4)     // Catch:{ IOException -> 0x0061 }
            if (r2 == 0) goto L_0x006b
            r2.close()     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            r3.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x0099
        L_0x006f:
            r0 = move-exception
            r3 = r1
            goto L_0x005f
        L_0x0072:
            r3 = move-exception
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            r3 = r1
            goto L_0x009a
        L_0x007a:
            r2 = move-exception
            r3 = r1
            r1 = r2
            r2 = r3
        L_0x007e:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "Error while saving monitored region states to file "
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x005e }
            r6[r0] = r1     // Catch:{ all -> 0x005e }
            org.altbeacon.beacon.logging.LogManager.e(r4, r5, r6)     // Catch:{ all -> 0x005e }
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ all -> 0x005e }
            r1.printStackTrace(r0)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0096
            r2.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            if (r3 == 0) goto L_0x0099
            goto L_0x006b
        L_0x0099:
            return
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            r1.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.MonitoringStatus.saveMonitoringStatusIfOn():void");
    }

    public synchronized void startStatusPreservation() {
        if (!this.mStatePreservationIsOn) {
            this.mStatePreservationIsOn = true;
            saveMonitoringStatusIfOn();
        }
    }

    public synchronized RegionMonitoringState stateOf(Region region) {
        return getRegionsStateMap().get(region);
    }

    public synchronized void stopStatusPreservation() {
        this.mContext.deleteFile(STATUS_PRESERVATION_FILE_NAME);
        this.mStatePreservationIsOn = false;
    }

    public void updateLocalState(Region region, Integer num) {
        RegionMonitoringState regionMonitoringState = getRegionsStateMap().get(region);
        if (regionMonitoringState == null) {
            regionMonitoringState = addLocalRegion(region);
        }
        if (num != null) {
            if (num.intValue() == 0) {
                regionMonitoringState.markOutside();
            }
            if (num.intValue() == 1) {
                regionMonitoringState.markInside();
            }
        }
    }

    public void updateMonitoringStatusTime(long j7) {
        this.mContext.getFileStreamPath(STATUS_PRESERVATION_FILE_NAME).setLastModified(j7);
    }

    public synchronized void updateNewlyInsideInRegionsContaining(Beacon beacon) {
        try {
            boolean z = false;
            for (Region next : regionsMatchingTo(beacon)) {
                RegionMonitoringState regionMonitoringState = getRegionsStateMap().get(next);
                if (regionMonitoringState != null && regionMonitoringState.markInside()) {
                    if (regionMonitoringState.getActiveSinceAppLaunch()) {
                        regionMonitoringState.getCallback().call(this.mContext, "monitoringData", new MonitoringData(regionMonitoringState.getInside(), next).toBundle());
                    } else {
                        LogManager.d(TAG, "Not sending region update for region not active since last launch.", new Object[0]);
                    }
                    z = true;
                }
            }
            if (z) {
                saveMonitoringStatusIfOn();
            } else {
                updateMonitoringStatusTime(System.currentTimeMillis());
            }
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void updateNewlyOutside() {
        try {
            if (this.inactiveRegionsExist) {
                purgeInactiveRegions();
            }
            boolean z = false;
            for (Region next : regions()) {
                RegionMonitoringState stateOf = stateOf(next);
                if (stateOf.markOutsideIfExpired()) {
                    LogManager.d(TAG, "found a monitor that expired: %s", next);
                    stateOf.getCallback().call(this.mContext, "monitoringData", new MonitoringData(stateOf.getInside(), next).toBundle());
                    z = true;
                }
            }
            if (z) {
                saveMonitoringStatusIfOn();
            } else {
                updateMonitoringStatusTime(System.currentTimeMillis());
            }
        } finally {
            while (true) {
            }
        }
    }

    private RegionMonitoringState addLocalRegion(Region region, Callback callback) {
        if (getRegionsStateMap().containsKey(region)) {
            Iterator<Region> it = getRegionsStateMap().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Region next = it.next();
                if (next.equals(region)) {
                    if (!next.hasSameIdentifiers(region)) {
                        String str = TAG;
                        LogManager.d(str, "Replacing region with unique identifier " + region.getUniqueId(), new Object[0]);
                        LogManager.d(str, "Old definition: " + next, new Object[0]);
                        LogManager.d(str, "New definition: " + region, new Object[0]);
                        LogManager.d(str, "clearing state", new Object[0]);
                        getRegionsStateMap().remove(region);
                    } else if (!this.inactiveRegionsExist) {
                        return getRegionsStateMap().get(next);
                    }
                }
            }
        }
        RegionMonitoringState regionMonitoringState = new RegionMonitoringState(callback);
        String str2 = TAG;
        LogManager.d(str2, "Region marked as active: " + region, new Object[0]);
        regionMonitoringState.setActiveSinceAppLaunch(true);
        getRegionsStateMap().put(region, regionMonitoringState);
        return regionMonitoringState;
    }
}
