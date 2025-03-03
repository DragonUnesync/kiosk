package org.altbeacon.bluetooth;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.Set;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.service.RangedBeacon;

public class BluetoothCrashResolver {
    private static final int BLUEDROID_MAX_BLUETOOTH_MAC_COUNT = 1990;
    private static final int BLUEDROID_POST_DISCOVERY_ESTIMATED_BLUETOOTH_MAC_COUNT = 400;
    private static final String DISTINCT_BLUETOOTH_ADDRESSES_FILE = "BluetoothCrashResolverState.txt";
    private static final long MIN_TIME_BETWEEN_STATE_SAVES_MILLIS = 60000;
    private static final boolean PREEMPTIVE_ACTION_ENABLED = true;
    private static final long SUSPICIOUSLY_SHORT_BLUETOOTH_OFF_INTERVAL_MILLIS = 600;
    private static final String TAG = "BluetoothCrashResolver";
    private static final int TIME_TO_LET_DISCOVERY_RUN_MILLIS = 5000;
    private Context context = null;
    private int detectedCrashCount = 0;
    /* access modifiers changed from: private */
    public boolean discoveryStartConfirmed = false;
    private final Set<String> distinctBluetoothAddresses = new HashSet();
    private long lastBluetoothCrashDetectionTime = 0;
    /* access modifiers changed from: private */
    public long lastBluetoothOffTime = 0;
    /* access modifiers changed from: private */
    public long lastBluetoothTurningOnTime = 0;
    private boolean lastRecoverySucceeded = false;
    private long lastStateSaveTime = 0;
    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                if (BluetoothCrashResolver.this.recoveryInProgress) {
                    LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth discovery finished", new Object[0]);
                    BluetoothCrashResolver.this.finishRecovery();
                } else {
                    LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth discovery finished (external)", new Object[0]);
                }
            }
            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED")) {
                if (BluetoothCrashResolver.this.recoveryInProgress) {
                    BluetoothCrashResolver.this.discoveryStartConfirmed = BluetoothCrashResolver.PREEMPTIVE_ACTION_ENABLED;
                    LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth discovery started", new Object[0]);
                } else {
                    LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth discovery started (external)", new Object[0]);
                }
            }
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RecyclerView.UNDEFINED_DURATION);
                if (intExtra != Integer.MIN_VALUE) {
                    switch (intExtra) {
                        case 10:
                            LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth state is OFF", new Object[0]);
                            BluetoothCrashResolver.this.lastBluetoothOffTime = SystemClock.elapsedRealtime();
                            return;
                        case 11:
                            BluetoothCrashResolver.this.lastBluetoothTurningOnTime = SystemClock.elapsedRealtime();
                            LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth state is TURNING_ON", new Object[0]);
                            return;
                        case 12:
                            LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth state is ON", new Object[0]);
                            LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth was turned off for %s milliseconds", Long.valueOf(BluetoothCrashResolver.this.lastBluetoothTurningOnTime - BluetoothCrashResolver.this.lastBluetoothOffTime));
                            if (BluetoothCrashResolver.this.lastBluetoothTurningOnTime - BluetoothCrashResolver.this.lastBluetoothOffTime < BluetoothCrashResolver.SUSPICIOUSLY_SHORT_BLUETOOTH_OFF_INTERVAL_MILLIS) {
                                BluetoothCrashResolver.this.crashDetected();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else {
                    LogManager.d(BluetoothCrashResolver.TAG, "Bluetooth state is ERROR", new Object[0]);
                }
            }
        }
    };
    private int recoveryAttemptCount = 0;
    /* access modifiers changed from: private */
    public boolean recoveryInProgress = false;
    private UpdateNotifier updateNotifier;

    public interface UpdateNotifier {
        void dataUpdated();
    }

    public BluetoothCrashResolver(Context context2) {
        this.context = context2.getApplicationContext();
        LogManager.d(TAG, "constructed", new Object[0]);
        loadState();
    }

    private void cancelDiscovery() {
        try {
            Thread.sleep(RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
            if (!this.discoveryStartConfirmed) {
                LogManager.w(TAG, "BluetoothAdapter.ACTION_DISCOVERY_STARTED never received.  Recovery may fail.", new Object[0]);
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isDiscovering()) {
                LogManager.d(TAG, "Cancelling discovery", new Object[0]);
                defaultAdapter.cancelDiscovery();
                return;
            }
            LogManager.d(TAG, "Discovery not running.  Won't cancel it", new Object[0]);
        } catch (InterruptedException unused) {
            LogManager.d(TAG, "DiscoveryCanceller sleep interrupted.", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public void finishRecovery() {
        LogManager.w(TAG, "Recovery attempt finished", new Object[0]);
        synchronized (this.distinctBluetoothAddresses) {
            this.distinctBluetoothAddresses.clear();
        }
        this.recoveryInProgress = false;
    }

    private int getCrashRiskDeviceCount() {
        return 1590;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (r4 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        if (r4 != null) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099 A[SYNTHETIC, Splitter:B:46:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadState() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "BluetoothCrashResolver"
            java.lang.String r3 = "BluetoothCrashResolverState.txt"
            r4 = 0
            android.content.Context r5 = r8.context     // Catch:{ IOException -> 0x0077, NumberFormatException -> 0x0068 }
            java.io.FileInputStream r5 = r5.openFileInput(r3)     // Catch:{ IOException -> 0x0077, NumberFormatException -> 0x0068 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0077, NumberFormatException -> 0x0068 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0077, NumberFormatException -> 0x0068 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x0077, NumberFormatException -> 0x0068 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0077, NumberFormatException -> 0x0068 }
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            if (r4 == 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            r8.lastBluetoothCrashDetectionTime = r4     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r0 = move-exception
            r4 = r6
            goto L_0x0097
        L_0x0028:
            r4 = r6
            goto L_0x0068
        L_0x002a:
            r4 = r6
            goto L_0x0077
        L_0x002c:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            if (r4 == 0) goto L_0x0038
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            r8.detectedCrashCount = r4     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
        L_0x0038:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            if (r4 == 0) goto L_0x0044
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            r8.recoveryAttemptCount = r4     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
        L_0x0044:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            if (r4 == 0) goto L_0x0056
            r8.lastRecoverySucceeded = r1     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            java.lang.String r5 = "1"
            boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            if (r4 == 0) goto L_0x0056
            r8.lastRecoverySucceeded = r0     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
        L_0x0056:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            if (r4 == 0) goto L_0x0062
            java.util.Set<java.lang.String> r5 = r8.distinctBluetoothAddresses     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            r5.add(r4)     // Catch:{ IOException -> 0x002a, NumberFormatException -> 0x0028, all -> 0x0024 }
            goto L_0x0056
        L_0x0062:
            r6.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0083
        L_0x0066:
            r0 = move-exception
            goto L_0x0097
        L_0x0068:
            java.lang.String r5 = "Can't parse file %s"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x0066 }
            r6[r1] = r3     // Catch:{ all -> 0x0066 }
            org.altbeacon.beacon.logging.LogManager.w(r2, r5, r6)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0083
        L_0x0073:
            r4.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0083
        L_0x0077:
            java.lang.String r5 = "Can't read macs from %s"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x0066 }
            r6[r1] = r3     // Catch:{ all -> 0x0066 }
            org.altbeacon.beacon.logging.LogManager.w(r2, r5, r6)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x0083
            goto L_0x0073
        L_0x0083:
            java.util.Set<java.lang.String> r3 = r8.distinctBluetoothAddresses
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r3
            java.lang.String r1 = "Read %s Bluetooth addresses"
            org.altbeacon.beacon.logging.LogManager.d(r2, r1, r0)
            return
        L_0x0097:
            if (r4 == 0) goto L_0x009c
            r4.close()     // Catch:{ IOException -> 0x009c }
        L_0x009c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.BluetoothCrashResolver.loadState():void");
    }

    private void processStateChange() {
        UpdateNotifier updateNotifier2 = this.updateNotifier;
        if (updateNotifier2 != null) {
            updateNotifier2.dataUpdated();
        }
        if (SystemClock.elapsedRealtime() - this.lastStateSaveTime > MIN_TIME_BETWEEN_STATE_SAVES_MILLIS) {
            saveState();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[SYNTHETIC, Splitter:B:40:0x00bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void saveState() {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.lastStateSaveTime = r2
            r2 = 0
            android.content.Context r3 = r7.context     // Catch:{ IOException -> 0x0092 }
            java.lang.String r4 = "BluetoothCrashResolverState.txt"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r1)     // Catch:{ IOException -> 0x0092 }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0092 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r2.<init>()     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            long r5 = r7.lastBluetoothCrashDetectionTime     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r2.append(r5)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r4.write(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r2.<init>()     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            int r3 = r7.detectedCrashCount     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r4.write(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r2.<init>()     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            int r3 = r7.recoveryAttemptCount     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            r4.write(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            boolean r2 = r7.lastRecoverySucceeded     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "1\n"
            goto L_0x0066
        L_0x005f:
            r0 = move-exception
            r2 = r4
            goto L_0x00ba
        L_0x0062:
            r2 = r4
            goto L_0x0092
        L_0x0064:
            java.lang.String r2 = "0\n"
        L_0x0066:
            r4.write(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.util.Set<java.lang.String> r2 = r7.distinctBluetoothAddresses     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0062, all -> 0x005f }
            java.util.Set<java.lang.String> r3 = r7.distinctBluetoothAddresses     // Catch:{ all -> 0x0087 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0072:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0087 }
            r4.write(r5)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "\n"
            r4.write(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x0072
        L_0x0087:
            r3 = move-exception
            goto L_0x008e
        L_0x0089:
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            r4.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x00a4
        L_0x008e:
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            throw r3     // Catch:{ IOException -> 0x0062, all -> 0x005f }
        L_0x0090:
            r0 = move-exception
            goto L_0x00ba
        L_0x0092:
            java.lang.String r3 = "BluetoothCrashResolver"
            java.lang.String r4 = "Can't write macs to %s"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = "BluetoothCrashResolverState.txt"
            r5[r1] = r6     // Catch:{ all -> 0x0090 }
            org.altbeacon.beacon.logging.LogManager.w(r3, r4, r5)     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x00a4
            r2.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            java.lang.String r2 = "BluetoothCrashResolver"
            java.lang.String r3 = "Wrote %s Bluetooth addresses"
            java.util.Set<java.lang.String> r4 = r7.distinctBluetoothAddresses
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            org.altbeacon.beacon.logging.LogManager.d(r2, r3, r0)
            return
        L_0x00ba:
            if (r2 == 0) goto L_0x00bf
            r2.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.BluetoothCrashResolver.saveState():void");
    }

    @TargetApi(17)
    private void startRecovery() {
        this.recoveryAttemptCount++;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        LogManager.d(TAG, "about to check if discovery is active", new Object[0]);
        if (!defaultAdapter.isDiscovering()) {
            LogManager.w(TAG, "Recovery attempt started", new Object[0]);
            this.recoveryInProgress = PREEMPTIVE_ACTION_ENABLED;
            this.discoveryStartConfirmed = false;
            LogManager.d(TAG, "about to command discovery", new Object[0]);
            if (!defaultAdapter.startDiscovery()) {
                LogManager.w(TAG, "Can't start discovery.  Is Bluetooth turned on?", new Object[0]);
            }
            LogManager.d(TAG, "startDiscovery commanded.  isDiscovering()=%s", Boolean.valueOf(defaultAdapter.isDiscovering()));
            LogManager.d(TAG, "We will be cancelling this discovery in %s milliseconds.", Integer.valueOf(TIME_TO_LET_DISCOVERY_RUN_MILLIS));
            cancelDiscovery();
            return;
        }
        LogManager.w(TAG, "Already discovering.  Recovery attempt abandoned.", new Object[0]);
    }

    public void crashDetected() {
        LogManager.w(TAG, "BluetoothService crash detected", new Object[0]);
        if (this.distinctBluetoothAddresses.size() > 0) {
            LogManager.d(TAG, "Distinct Bluetooth devices seen at crash: %s", Integer.valueOf(this.distinctBluetoothAddresses.size()));
        }
        this.lastBluetoothCrashDetectionTime = SystemClock.elapsedRealtime();
        this.detectedCrashCount++;
        if (this.recoveryInProgress) {
            LogManager.d(TAG, "Ignoring Bluetooth crash because recovery is already in progress.", new Object[0]);
        } else {
            startRecovery();
        }
        processStateChange();
    }

    @Deprecated
    public void disableDebug() {
    }

    @Deprecated
    public void enableDebug() {
    }

    public void forceFlush() {
        startRecovery();
        processStateChange();
    }

    public int getDetectedCrashCount() {
        return this.detectedCrashCount;
    }

    public long getLastBluetoothCrashDetectionTime() {
        return this.lastBluetoothCrashDetectionTime;
    }

    public int getRecoveryAttemptCount() {
        return this.recoveryAttemptCount;
    }

    public boolean isLastRecoverySucceeded() {
        return this.lastRecoverySucceeded;
    }

    public boolean isRecoveryInProgress() {
        return this.recoveryInProgress;
    }

    @TargetApi(18)
    public void notifyScannedDevice(BluetoothDevice bluetoothDevice, BluetoothAdapter.LeScanCallback leScanCallback) {
        int size = this.distinctBluetoothAddresses.size();
        synchronized (this.distinctBluetoothAddresses) {
            this.distinctBluetoothAddresses.add(bluetoothDevice.getAddress());
        }
        int size2 = this.distinctBluetoothAddresses.size();
        if (size != size2 && size2 % 100 == 0) {
            LogManager.d(TAG, "Distinct Bluetooth devices seen: %s", Integer.valueOf(this.distinctBluetoothAddresses.size()));
        }
        if (this.distinctBluetoothAddresses.size() > getCrashRiskDeviceCount() && !this.recoveryInProgress) {
            LogManager.w(TAG, "Large number of Bluetooth devices detected: %s Proactively attempting to clear out address list to prevent a crash", Integer.valueOf(this.distinctBluetoothAddresses.size()));
            LogManager.w(TAG, "Stopping LE Scan", new Object[0]);
            BluetoothAdapter.getDefaultAdapter().stopLeScan(leScanCallback);
            startRecovery();
            processStateChange();
        }
    }

    public void setUpdateNotifier(UpdateNotifier updateNotifier2) {
        this.updateNotifier = updateNotifier2;
    }

    public void start() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        this.context.registerReceiver(this.receiver, intentFilter);
        LogManager.d(TAG, "started listening for BluetoothAdapter events", new Object[0]);
    }

    public void stop() {
        this.context.unregisterReceiver(this.receiver);
        LogManager.d(TAG, "stopped listening for BluetoothAdapter events", new Object[0]);
        saveState();
    }
}
