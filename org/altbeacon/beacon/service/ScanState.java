package org.altbeacon.beacon.service;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.logging.LogManager;

public class ScanState implements Serializable {
    public static int MIN_SCAN_JOB_INTERVAL_MILLIS = 300000;
    private static final String STATUS_PRESERVATION_FILE_NAME = "android-beacon-library-scan-state";
    private static final String TAG = "ScanState";
    private static final String TEMP_STATUS_PRESERVATION_FILE_NAME = "android-beacon-library-scan-state-temp";
    private long mBackgroundBetweenScanPeriod;
    private boolean mBackgroundMode;
    private long mBackgroundScanPeriod;
    private Set<BeaconParser> mBeaconParsers = new HashSet();
    private transient Context mContext;
    private ExtraDataBeaconTracker mExtraBeaconDataTracker = new ExtraDataBeaconTracker();
    private long mForegroundBetweenScanPeriod;
    private long mForegroundScanPeriod;
    private long mLastScanStartTimeMillis = 0;
    private transient MonitoringStatus mMonitoringStatus;
    private Map<Region, RangeState> mRangedRegionState = new HashMap();

    public ScanState(Context context) {
        this.mContext = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:2|3|4|5|6|(5:7|8|9|10|(2:12|13))|15|16|(2:57|58)|59|(1:61)|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:65|(2:67|68)|(2:71|72)|73|74) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0086, code lost:
        if (r5 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0099, code lost:
        if (r5 != null) goto L_0x0023;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00f6 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[Catch:{ all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0071 A[Catch:{ all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081 A[SYNTHETIC, Splitter:B:45:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0094 A[SYNTHETIC, Splitter:B:52:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ec A[SYNTHETIC, Splitter:B:67:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f3 A[SYNTHETIC, Splitter:B:71:0x00f3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.altbeacon.beacon.service.ScanState restore(android.content.Context r11) {
        /*
            java.lang.String r0 = "Scan state restore regions: monitored="
            java.lang.Class<org.altbeacon.beacon.service.ScanState> r1 = org.altbeacon.beacon.service.ScanState.class
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            java.lang.String r4 = "android-beacon-library-scan-state"
            java.io.FileInputStream r4 = r11.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x0060, IOException -> 0x005e, ClassNotFoundException -> 0x005c, ClassCastException -> 0x0056, all -> 0x0052 }
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x004d, ClassNotFoundException -> 0x004b, ClassCastException -> 0x0046, all -> 0x0043 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x004d, ClassNotFoundException -> 0x004b, ClassCastException -> 0x0046, all -> 0x0043 }
            java.lang.Object r6 = r5.readObject()     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x003f, ClassNotFoundException -> 0x003d, ClassCastException -> 0x0038 }
            org.altbeacon.beacon.service.ScanState r6 = (org.altbeacon.beacon.service.ScanState) r6     // Catch:{ FileNotFoundException -> 0x0041, IOException -> 0x003f, ClassNotFoundException -> 0x003d, ClassCastException -> 0x0038 }
            r6.mContext = r11     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x0033, ClassNotFoundException -> 0x0031, ClassCastException -> 0x002f }
            if (r4 == 0) goto L_0x0023
            r4.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0023
        L_0x0020:
            r11 = move-exception
            goto L_0x00f7
        L_0x0023:
            r5.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x009c
        L_0x0028:
            goto L_0x009c
        L_0x002b:
            r11 = move-exception
        L_0x002c:
            r3 = r4
            goto L_0x00ea
        L_0x002f:
            r3 = move-exception
            goto L_0x0063
        L_0x0031:
            r3 = move-exception
            goto L_0x0063
        L_0x0033:
            r3 = move-exception
            goto L_0x0063
        L_0x0035:
            r3 = r4
            goto L_0x0089
        L_0x0038:
            r6 = move-exception
        L_0x0039:
            r10 = r6
            r6 = r3
            r3 = r10
            goto L_0x0063
        L_0x003d:
            r6 = move-exception
            goto L_0x0039
        L_0x003f:
            r6 = move-exception
            goto L_0x0039
        L_0x0041:
            r6 = r3
            goto L_0x0035
        L_0x0043:
            r11 = move-exception
            r5 = r3
            goto L_0x002c
        L_0x0046:
            r5 = move-exception
        L_0x0047:
            r6 = r3
            r3 = r5
            r5 = r6
            goto L_0x0063
        L_0x004b:
            r5 = move-exception
            goto L_0x0047
        L_0x004d:
            r5 = move-exception
            goto L_0x0047
        L_0x004f:
            r5 = r3
            r6 = r5
            goto L_0x0035
        L_0x0052:
            r11 = move-exception
            r5 = r3
            goto L_0x00ea
        L_0x0056:
            r4 = move-exception
        L_0x0057:
            r5 = r3
            r6 = r5
            r3 = r4
            r4 = r6
            goto L_0x0063
        L_0x005c:
            r4 = move-exception
            goto L_0x0057
        L_0x005e:
            r4 = move-exception
            goto L_0x0057
        L_0x0060:
            r5 = r3
            r6 = r5
            goto L_0x0089
        L_0x0063:
            boolean r7 = r3 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x002b }
            if (r7 == 0) goto L_0x0071
            java.lang.String r3 = TAG     // Catch:{ all -> 0x002b }
            java.lang.String r7 = "Serialized ScanState has wrong class. Just ignoring saved state..."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x002b }
            org.altbeacon.beacon.logging.LogManager.d(r3, r7, r8)     // Catch:{ all -> 0x002b }
            goto L_0x007f
        L_0x0071:
            java.lang.String r7 = TAG     // Catch:{ all -> 0x002b }
            java.lang.String r8 = "Deserialization exception"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x002b }
            org.altbeacon.beacon.logging.LogManager.e(r7, r8, r9)     // Catch:{ all -> 0x002b }
            java.lang.String r8 = "error: "
            android.util.Log.e(r7, r8, r3)     // Catch:{ all -> 0x002b }
        L_0x007f:
            if (r4 == 0) goto L_0x0086
            r4.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            if (r5 == 0) goto L_0x009c
            goto L_0x0023
        L_0x0089:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00e9 }
            java.lang.String r7 = "Serialized ScanState does not exist.  This may be normal on first run."
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e9 }
            org.altbeacon.beacon.logging.LogManager.w(r4, r7, r8)     // Catch:{ all -> 0x00e9 }
            if (r3 == 0) goto L_0x0099
            r3.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x0099
        L_0x0098:
        L_0x0099:
            if (r5 == 0) goto L_0x009c
            goto L_0x0023
        L_0x009c:
            if (r6 != 0) goto L_0x00a3
            org.altbeacon.beacon.service.ScanState r6 = new org.altbeacon.beacon.service.ScanState     // Catch:{ all -> 0x0020 }
            r6.<init>(r11)     // Catch:{ all -> 0x0020 }
        L_0x00a3:
            org.altbeacon.beacon.service.ExtraDataBeaconTracker r3 = r6.mExtraBeaconDataTracker     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x00ae
            org.altbeacon.beacon.service.ExtraDataBeaconTracker r3 = new org.altbeacon.beacon.service.ExtraDataBeaconTracker     // Catch:{ all -> 0x0020 }
            r3.<init>()     // Catch:{ all -> 0x0020 }
            r6.mExtraBeaconDataTracker = r3     // Catch:{ all -> 0x0020 }
        L_0x00ae:
            org.altbeacon.beacon.service.MonitoringStatus r11 = org.altbeacon.beacon.service.MonitoringStatus.getInstanceForApplication(r11)     // Catch:{ all -> 0x0020 }
            r6.mMonitoringStatus = r11     // Catch:{ all -> 0x0020 }
            java.lang.String r11 = TAG     // Catch:{ all -> 0x0020 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r3.<init>(r0)     // Catch:{ all -> 0x0020 }
            org.altbeacon.beacon.service.MonitoringStatus r0 = r6.getMonitoringStatus()     // Catch:{ all -> 0x0020 }
            java.util.Set r0 = r0.regions()     // Catch:{ all -> 0x0020 }
            int r0 = r0.size()     // Catch:{ all -> 0x0020 }
            r3.append(r0)     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = " ranged="
            r3.append(r0)     // Catch:{ all -> 0x0020 }
            java.util.Map r0 = r6.getRangedRegionState()     // Catch:{ all -> 0x0020 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0020 }
            int r0 = r0.size()     // Catch:{ all -> 0x0020 }
            r3.append(r0)     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0020 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0020 }
            org.altbeacon.beacon.logging.LogManager.d(r11, r0, r2)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            return r6
        L_0x00e9:
            r11 = move-exception
        L_0x00ea:
            if (r3 == 0) goto L_0x00f1
            r3.close()     // Catch:{ IOException -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            if (r5 == 0) goto L_0x00f6
            r5.close()     // Catch:{ IOException -> 0x00f6 }
        L_0x00f6:
            throw r11     // Catch:{ all -> 0x0020 }
        L_0x00f7:
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanState.restore(android.content.Context):org.altbeacon.beacon.service.ScanState");
    }

    public void applyChanges(BeaconManager beaconManager) {
        this.mBeaconParsers = new HashSet(beaconManager.getBeaconParsers());
        this.mForegroundScanPeriod = beaconManager.getForegroundScanPeriod();
        this.mForegroundBetweenScanPeriod = beaconManager.getForegroundBetweenScanPeriod();
        this.mBackgroundScanPeriod = beaconManager.getBackgroundScanPeriod();
        this.mBackgroundBetweenScanPeriod = beaconManager.getBackgroundBetweenScanPeriod();
        this.mBackgroundMode = beaconManager.getBackgroundMode();
        ArrayList arrayList = new ArrayList(this.mMonitoringStatus.regions());
        ArrayList arrayList2 = new ArrayList(this.mRangedRegionState.keySet());
        ArrayList arrayList3 = new ArrayList(beaconManager.getMonitoredRegions());
        ArrayList arrayList4 = new ArrayList(beaconManager.getRangedRegions());
        String str = TAG;
        LogManager.d(str, "ranged regions: old=" + arrayList2.size() + " new=" + arrayList4.size(), new Object[0]);
        LogManager.d(str, "monitored regions: old=" + arrayList.size() + " new=" + arrayList3.size(), new Object[0]);
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (!arrayList2.contains(region)) {
                String str2 = TAG;
                LogManager.d(str2, "Starting ranging region: " + region, new Object[0]);
                this.mRangedRegionState.put(region, new RangeState(new Callback(this.mContext.getPackageName())));
            } else {
                Region region2 = (Region) arrayList2.get(arrayList2.indexOf(region));
                if (region.hasSameIdentifiers(region2)) {
                    this.mRangedRegionState.remove(region2);
                    this.mRangedRegionState.put(region, new RangeState(new Callback(this.mContext.getPackageName())));
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region3 = (Region) it2.next();
            if (!arrayList4.contains(region3)) {
                String str3 = TAG;
                LogManager.d(str3, "Stopping ranging region: " + region3, new Object[0]);
                this.mRangedRegionState.remove(region3);
            }
        }
        String str4 = TAG;
        LogManager.d(str4, "Updated state with " + arrayList4.size() + " ranging regions and " + arrayList3.size() + " monitoring regions.", new Object[0]);
        save();
    }

    public Long getBackgroundBetweenScanPeriod() {
        return Long.valueOf(this.mBackgroundBetweenScanPeriod);
    }

    public Boolean getBackgroundMode() {
        return Boolean.valueOf(this.mBackgroundMode);
    }

    public Long getBackgroundScanPeriod() {
        return Long.valueOf(this.mBackgroundScanPeriod);
    }

    public Set<BeaconParser> getBeaconParsers() {
        return this.mBeaconParsers;
    }

    public ExtraDataBeaconTracker getExtraBeaconDataTracker() {
        return this.mExtraBeaconDataTracker;
    }

    public Long getForegroundBetweenScanPeriod() {
        return Long.valueOf(this.mForegroundBetweenScanPeriod);
    }

    public Long getForegroundScanPeriod() {
        return Long.valueOf(this.mForegroundScanPeriod);
    }

    public long getLastScanStartTimeMillis() {
        return this.mLastScanStartTimeMillis;
    }

    public MonitoringStatus getMonitoringStatus() {
        return this.mMonitoringStatus;
    }

    public Map<Region, RangeState> getRangedRegionState() {
        return this.mRangedRegionState;
    }

    public int getScanJobIntervalMillis() {
        long longValue;
        long longValue2;
        if (getBackgroundMode().booleanValue()) {
            longValue = getBackgroundScanPeriod().longValue();
            longValue2 = getBackgroundBetweenScanPeriod().longValue();
        } else {
            longValue = getForegroundScanPeriod().longValue();
            longValue2 = getForegroundBetweenScanPeriod().longValue();
        }
        long j7 = longValue2 + longValue;
        int i = MIN_SCAN_JOB_INTERVAL_MILLIS;
        if (j7 > ((long) i)) {
            return (int) j7;
        }
        return i;
    }

    public int getScanJobRuntimeMillis() {
        long j7;
        String str = TAG;
        LogManager.d(str, "ScanState says background mode for ScanJob is " + getBackgroundMode(), new Object[0]);
        if (getBackgroundMode().booleanValue()) {
            j7 = getBackgroundScanPeriod().longValue();
        } else {
            j7 = getForegroundScanPeriod().longValue();
        }
        if (!getBackgroundMode().booleanValue()) {
            int i = MIN_SCAN_JOB_INTERVAL_MILLIS;
            if (j7 < ((long) i)) {
                return i;
            }
        }
        return (int) j7;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:2|3|4|(5:5|6|7|8|(2:10|11))|13|14|33|34|(1:36)|37|(1:39)|40|41) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(2:44|45)|(2:48|49)|50|51) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r6 == null) goto L_0x0056;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00c9 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf A[SYNTHETIC, Splitter:B:44:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c6 A[SYNTHETIC, Splitter:B:48:0x00c6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0056=Splitter:B:33:0x0056, B:50:0x00c9=Splitter:B:50:0x00c9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void save() {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = "Perm file is "
            java.lang.String r2 = "Temp file is "
            java.lang.Class<org.altbeacon.beacon.service.ScanState> r3 = org.altbeacon.beacon.service.ScanState.class
            monitor-enter(r3)
            r4 = 0
            android.content.Context r5 = r11.mContext     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            java.lang.String r6 = "android-beacon-library-scan-state-temp"
            java.io.FileOutputStream r5 = r5.openFileOutput(r6, r0)     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x002f, all -> 0x002c }
            r6.<init>(r5)     // Catch:{ IOException -> 0x002f, all -> 0x002c }
            r6.writeObject(r11)     // Catch:{ IOException -> 0x002a }
            if (r5 == 0) goto L_0x0022
            r5.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            goto L_0x00ca
        L_0x0022:
            r6.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x0026:
            r0 = move-exception
        L_0x0027:
            r4 = r5
            goto L_0x00bd
        L_0x002a:
            r4 = move-exception
            goto L_0x003c
        L_0x002c:
            r0 = move-exception
            r6 = r4
            goto L_0x0027
        L_0x002f:
            r6 = move-exception
            r10 = r6
            r6 = r4
            r4 = r10
            goto L_0x003c
        L_0x0034:
            r0 = move-exception
            r6 = r4
            goto L_0x00bd
        L_0x0038:
            r5 = move-exception
            r6 = r4
            r4 = r5
            r5 = r6
        L_0x003c:
            java.lang.String r7 = TAG     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "Error while saving scan status to file: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0026 }
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0026 }
            r9[r0] = r4     // Catch:{ all -> 0x0026 }
            org.altbeacon.beacon.logging.LogManager.e(r7, r8, r9)     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x0053
            r5.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r6 == 0) goto L_0x0056
            goto L_0x0022
        L_0x0056:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x001f }
            android.content.Context r5 = r11.mContext     // Catch:{ all -> 0x001f }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ all -> 0x001f }
            java.lang.String r6 = "android-beacon-library-scan-state"
            r4.<init>(r5, r6)     // Catch:{ all -> 0x001f }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x001f }
            android.content.Context r6 = r11.mContext     // Catch:{ all -> 0x001f }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ all -> 0x001f }
            java.lang.String r7 = "android-beacon-library-scan-state-temp"
            r5.<init>(r6, r7)     // Catch:{ all -> 0x001f }
            java.lang.String r6 = TAG     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r7.<init>(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r2 = r5.getAbsolutePath()     // Catch:{ all -> 0x001f }
            r7.append(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x001f }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x001f }
            org.altbeacon.beacon.logging.LogManager.d(r6, r2, r7)     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>(r1)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r4.getAbsolutePath()     // Catch:{ all -> 0x001f }
            r2.append(r1)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x001f }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x001f }
            org.altbeacon.beacon.logging.LogManager.d(r6, r1, r2)     // Catch:{ all -> 0x001f }
            boolean r1 = r4.delete()     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x00a9
            java.lang.String r1 = "Error while saving scan status to file: Cannot delete existing file."
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x001f }
            org.altbeacon.beacon.logging.LogManager.e(r6, r1, r2)     // Catch:{ all -> 0x001f }
        L_0x00a9:
            boolean r1 = r5.renameTo(r4)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x00b6
            java.lang.String r1 = "Error while saving scan status to file: Cannot rename temp file."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x001f }
            org.altbeacon.beacon.logging.LogManager.e(r6, r1, r0)     // Catch:{ all -> 0x001f }
        L_0x00b6:
            org.altbeacon.beacon.service.MonitoringStatus r0 = r11.mMonitoringStatus     // Catch:{ all -> 0x001f }
            r0.saveMonitoringStatusIfOn()     // Catch:{ all -> 0x001f }
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            return
        L_0x00bd:
            if (r4 == 0) goto L_0x00c4
            r4.close()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
        L_0x00c4:
            if (r6 == 0) goto L_0x00c9
            r6.close()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            throw r0     // Catch:{ all -> 0x001f }
        L_0x00ca:
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanState.save():void");
    }

    public void setBackgroundBetweenScanPeriod(Long l8) {
        this.mBackgroundBetweenScanPeriod = l8.longValue();
    }

    public void setBackgroundMode(Boolean bool) {
        this.mBackgroundMode = bool.booleanValue();
    }

    public void setBackgroundScanPeriod(Long l8) {
        this.mBackgroundScanPeriod = l8.longValue();
    }

    public void setBeaconParsers(Set<BeaconParser> set) {
        this.mBeaconParsers = set;
    }

    public void setExtraBeaconDataTracker(ExtraDataBeaconTracker extraDataBeaconTracker) {
        this.mExtraBeaconDataTracker = extraDataBeaconTracker;
    }

    public void setForegroundBetweenScanPeriod(Long l8) {
        this.mForegroundBetweenScanPeriod = l8.longValue();
    }

    public void setForegroundScanPeriod(Long l8) {
        this.mForegroundScanPeriod = l8.longValue();
    }

    public void setLastScanStartTimeMillis(long j7) {
        this.mLastScanStartTimeMillis = j7;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.mMonitoringStatus = monitoringStatus;
    }

    public void setRangedRegionState(Map<Region, RangeState> map) {
        this.mRangedRegionState = map;
    }
}
