package org.altbeacon.bluetooth;

import Q0.g;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import de.ozerov.fully.C0735m0;
import j0.C1112a;
import j0.f;
import j0.j;
import j0.k;
import java.util.ArrayList;
import java.util.Iterator;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.service.RangedBeacon;
import u.C1477r;

public class BluetoothMedic {
    private static final long MIN_MILLIS_BETWEEN_BLUETOOTH_POWER_CYCLES = 60000;
    public static final int NO_TEST = 0;
    public static final int SCAN_TEST = 1;
    /* access modifiers changed from: private */
    public static final String TAG = "BluetoothMedic";
    public static final int TRANSMIT_TEST = 2;
    private static BluetoothMedic sInstance;
    /* access modifiers changed from: private */
    public BluetoothAdapter mAdapter;
    private Context mContext = null;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private long mLastBluetoothPowerCycleTime = 0;
    private boolean mNotificationChannelCreated = false;
    private int mNotificationIcon = 0;
    private boolean mNotificationsEnabled = false;
    /* access modifiers changed from: private */
    public Boolean mScanTestResult = null;
    private int mTestType = 0;
    /* access modifiers changed from: private */
    public Boolean mTransmitterTestResult = null;
    private boolean powerCycleOnFailureEnabled = false;

    private BluetoothMedic() {
    }

    private void createNotificationChannel(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel e = C0735m0.e(str);
            e.setDescription("Scan errors");
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(e);
            this.mNotificationChannelCreated = true;
        }
    }

    @SuppressLint({"MissingPermission"})
    private void cycleBluetooth() {
        String str = TAG;
        LogManager.i(str, "Power cycling bluetooth", new Object[0]);
        if (isBleConnectPermissionDenied()) {
            LogManager.i(str, "Can't power cycle bleutooth.  Connect permisison is denied.", new Object[0]);
            return;
        }
        LogManager.i(str, "Turning Bluetooth off.", new Object[0]);
        BluetoothAdapter bluetoothAdapter = this.mAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.disable();
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    LogManager.d(BluetoothMedic.TAG, "Turning Bluetooth back on.", new Object[0]);
                    if (BluetoothMedic.this.mAdapter != null) {
                        BluetoothMedic.this.mAdapter.enable();
                    }
                }
            }, 1000);
            return;
        }
        LogManager.w(str, "Cannot cycle bluetooth.  Manager is null.", new Object[0]);
    }

    private boolean cycleBluetoothIfNotTooSoon() {
        long currentTimeMillis = System.currentTimeMillis() - this.mLastBluetoothPowerCycleTime;
        if (currentTimeMillis < MIN_MILLIS_BETWEEN_BLUETOOTH_POWER_CYCLES) {
            String str = TAG;
            LogManager.d(str, "Not cycling bluetooth because we just did so " + currentTimeMillis + " milliseconds ago.", new Object[0]);
            return false;
        }
        this.mLastBluetoothPowerCycleTime = System.currentTimeMillis();
        LogManager.d(TAG, "Power cycling bluetooth", new Object[0]);
        cycleBluetooth();
        return true;
    }

    private BluetoothLeAdvertiser getAdvertiserSafely(BluetoothAdapter bluetoothAdapter) {
        try {
            return bluetoothAdapter.getBluetoothLeAdvertiser();
        } catch (Exception e) {
            LogManager.w(TAG, "Cannot get bluetoothLeAdvertiser", e);
            return null;
        }
    }

    public static BluetoothMedic getInstance() {
        if (sInstance == null) {
            sInstance = new BluetoothMedic();
        }
        return sInstance;
    }

    private void initializeWithContext(Context context) {
        if (this.mAdapter == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (bluetoothManager != null) {
                this.mAdapter = bluetoothManager.getAdapter();
                return;
            }
            throw new NullPointerException("Cannot get BluetoothManager");
        }
    }

    private boolean isAndroidSPermissionDenied(String str) {
        Context context;
        if (Build.VERSION.SDK_INT < 31 || (context = this.mContext) == null || context.getApplicationInfo().targetSdkVersion < 31 || f.a(this.mContext, str) == 0) {
            return false;
        }
        return true;
    }

    private boolean isBleAdvertisePermissionDenied() {
        return isAndroidSPermissionDenied("android.permission.BLUETOOTH_ADVERTISE");
    }

    private boolean isBleConnectPermissionDenied() {
        return isAndroidSPermissionDenied("android.permission.BLUETOOTH_CONNECT");
    }

    private boolean isBleScanPermissionDenied() {
        return isAndroidSPermissionDenied("android.permission.BLUETOOTH_SCAN");
    }

    private void scheduleRegularTests(Context context) {
        initializeWithContext(context);
        JobInfo.Builder builder = new JobInfo.Builder(BluetoothTestJob.getJobId(context), new ComponentName(context, BluetoothTestJob.class));
        builder.setRequiresCharging(false);
        builder.setRequiresDeviceIdle(false);
        builder.setPeriodic(900000);
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("test_type", this.mTestType);
        builder.setExtras(persistableBundle);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.schedule(builder.build());
        }
    }

    /* access modifiers changed from: private */
    public void sendScreenNotification(String str, String str2) {
        ArrayList arrayList;
        Notification.Builder builder;
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        Bundle bundle;
        Notification notification;
        String str3 = str2;
        Context context = this.mContext;
        if (context == null) {
            LogManager.e(TAG, "congtext is unexpectedly null", new Object[0]);
            return;
        }
        initializeWithContext(context);
        if (this.mNotificationsEnabled) {
            if (!this.mNotificationChannelCreated) {
                createNotificationChannel(context, "err");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Notification notification2 = new Notification();
            notification2.when = System.currentTimeMillis();
            notification2.audioStreamType = -1;
            ArrayList<String> arrayList5 = new ArrayList<>();
            String d8 = C1477r.d("BluetoothMedic: ", str);
            CharSequence charSequence = d8;
            if (d8 != null) {
                int length = d8.length();
                charSequence = d8;
                if (length > 5120) {
                    charSequence = d8.subSequence(0, 5120);
                }
            }
            notification2.icon = this.mNotificationIcon;
            notification2.vibrate = new long[]{200, 100, 200};
            CharSequence charSequence2 = str3;
            if (str3 != null) {
                charSequence2 = str3;
                if (str2.length() > 5120) {
                    charSequence2 = str3.subSequence(0, 5120);
                }
            }
            TaskStackBuilder create = TaskStackBuilder.create(context);
            create.addNextIntent(new Intent("NoOperation"));
            PendingIntent pendingIntent = create.getPendingIntent(0, 201326592);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                new ArrayList();
                Bundle bundle2 = new Bundle();
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    builder = k.a(context);
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    builder = new Notification.Builder(context);
                }
                Notification.Builder lights = builder.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, (RemoteViews) null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS);
                if ((notification2.flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Notification.Builder ongoing = lights.setOngoing(z);
                if ((notification2.flags & 8) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z6);
                if ((notification2.flags & 16) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z8).setDefaults(notification2.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo((CharSequence) null).setContentIntent(pendingIntent).setDeleteIntent(notification2.deleteIntent);
                if ((notification2.flags & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                deleteIntent.setFullScreenIntent((PendingIntent) null, z9).setNumber(0).setProgress(0, 0, false);
                if (i < 23) {
                    builder.setLargeIcon((Bitmap) null);
                } else {
                    C1112a.e(builder);
                }
                builder.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(0);
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    builder.setShowWhen(true);
                    builder.setLocalOnly(false);
                    builder.setGroup((String) null);
                    builder.setSortKey((String) null);
                    builder.setGroupSummary(false);
                    builder.setCategory((String) null);
                    builder.setColor(0);
                    builder.setVisibility(0);
                    builder.setPublicVersion((Notification) null);
                    builder.setSound(notification2.sound, notification2.audioAttributes);
                    if (i < 28) {
                        ArrayList arrayList6 = new ArrayList(arrayList3.size());
                        Iterator it2 = arrayList3.iterator();
                        if (!it2.hasNext()) {
                            Y.f fVar = new Y.f(arrayList5.size() + arrayList6.size());
                            fVar.addAll(arrayList6);
                            fVar.addAll(arrayList5);
                            arrayList5 = new ArrayList<>(fVar);
                        } else {
                            throw g.k(it2);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        for (String addPerson : arrayList5) {
                            builder.addPerson(addPerson);
                        }
                    }
                    if (arrayList4.size() > 0) {
                        bundle = new Bundle();
                        Bundle bundle3 = bundle.getBundle("android.car.EXTENSIONS");
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        Bundle bundle4 = new Bundle(bundle3);
                        Bundle bundle5 = new Bundle();
                        if (arrayList4.size() <= 0) {
                            bundle3.putBundle("invisible_actions", bundle5);
                            bundle4.putBundle("invisible_actions", bundle5);
                            bundle.putBundle("android.car.EXTENSIONS", bundle3);
                            bundle2.putBundle("android.car.EXTENSIONS", bundle4);
                        } else {
                            Integer.toString(0);
                            if (arrayList4.get(0) == null) {
                                new Bundle();
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } else {
                        bundle = null;
                    }
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 24) {
                        builder.setExtras(bundle);
                        j.b(builder);
                    }
                    if (i8 >= 26) {
                        k.b(builder);
                        k.d(builder);
                        k.e(builder);
                        k.f(builder);
                        k.c(builder);
                        if (!TextUtils.isEmpty("err")) {
                            builder.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
                        }
                    }
                    if (i8 >= 28) {
                        Iterator it3 = arrayList3.iterator();
                        if (it3.hasNext()) {
                            throw g.k(it3);
                        }
                    }
                    if (i8 >= 29) {
                        j0.g.c(builder);
                        j0.g.d(builder);
                    }
                    if (i8 >= 26) {
                        notification = builder.build();
                    } else if (i8 >= 24) {
                        notification = builder.build();
                    } else {
                        builder.setExtras(bundle2);
                        notification = builder.build();
                    }
                    notificationManager.notify(1, notification);
                    return;
                }
                throw g.k(it);
            }
        }
    }

    public void enablePeriodicTests(Context context, int i) {
        initializeWithContext(context);
        this.mTestType = i;
        LogManager.d(TAG, g.m(i, "Medic scheduling periodic tests of types "), new Object[0]);
        scheduleRegularTests(context);
    }

    @Deprecated
    public void enablePowerCycleOnFailures(Context context) {
        legacyEnablePowerCycleOnFailures(context);
    }

    public void legacyEnablePowerCycleOnFailures(Context context) {
        this.mContext = context.getApplicationContext();
        this.powerCycleOnFailureEnabled = true;
        initializeWithContext(context);
        LogManager.d(TAG, "Medic monitoring for transmission and scan failure notifications", new Object[0]);
    }

    public void processMedicAction(String str, int i) {
        if (!this.powerCycleOnFailureEnabled) {
            return;
        }
        if (str.equalsIgnoreCase("onScanFailed")) {
            if (i == 2) {
                LogManager.i(TAG, "Detected a SCAN_FAILED_APPLICATION_REGISTRATION_FAILED.  We need to cycle bluetooth to recover", new Object[0]);
                sendScreenNotification("scan failed", "Power cycling bluetooth");
                if (!cycleBluetoothIfNotTooSoon()) {
                    sendScreenNotification("scan failed", "Cannot power cycle bluetooth again");
                }
            }
        } else if (!str.equalsIgnoreCase("onStartFailed")) {
            LogManager.d(TAG, "Unknown event.", new Object[0]);
        } else if (i == 4) {
            LogManager.i(TAG, "advertising failed: Expected failure.  Power cycling.", new Object[0]);
            sendScreenNotification("advertising failed", "Expected failure.  Power cycling.");
            if (!cycleBluetoothIfNotTooSoon()) {
                sendScreenNotification("advertising failed", "Cannot power cycle bluetooth again");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|17|18|(2:31|20)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean runScanTest(android.content.Context r11) {
        /*
            r10 = this;
            r10.initializeWithContext(r11)
            boolean r11 = r10.isBleScanPermissionDenied()
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0015
            java.lang.String r11 = TAG
            java.lang.String r2 = "Cant run scan test -- required scan permission is denied"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            org.altbeacon.beacon.logging.LogManager.i(r11, r2, r1)
            return r0
        L_0x0015:
            r11 = 0
            r10.mScanTestResult = r11
            java.lang.String r11 = TAG
            java.lang.String r2 = "Starting scan test"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            org.altbeacon.beacon.logging.LogManager.i(r11, r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            android.bluetooth.BluetoothAdapter r4 = r10.mAdapter
            if (r4 == 0) goto L_0x0081
            android.bluetooth.le.BluetoothLeScanner r4 = r4.getBluetoothLeScanner()
            org.altbeacon.bluetooth.BluetoothMedic$1 r5 = new org.altbeacon.bluetooth.BluetoothMedic$1
            r5.<init>(r4)
            if (r4 == 0) goto L_0x007a
            r4.startScan(r5)     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
        L_0x0037:
            java.lang.Boolean r11 = r10.mScanTestResult     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            if (r11 != 0) goto L_0x0060
            java.lang.String r11 = TAG     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            java.lang.String r6 = "Waiting for scan test to complete..."
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            org.altbeacon.beacon.logging.LogManager.d(r11, r6, r7)     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x004c }
            goto L_0x004c
        L_0x004a:
            r11 = move-exception
            goto L_0x0064
        L_0x004c:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            long r6 = r6 - r2
            r8 = 5000(0x1388, double:2.4703E-320)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0037
            java.lang.String r11 = TAG     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            java.lang.String r2 = "Timeout running scan test"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            org.altbeacon.beacon.logging.LogManager.d(r11, r2, r3)     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
        L_0x0060:
            r4.stopScan(r5)     // Catch:{ IllegalStateException -> 0x0070, NullPointerException -> 0x004a }
            goto L_0x0081
        L_0x0064:
            java.lang.String r2 = TAG
            java.lang.String r3 = "NullPointerException. Cannot run scan test."
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r11
            org.altbeacon.beacon.logging.LogManager.e(r2, r3, r4)
            goto L_0x0081
        L_0x0070:
            java.lang.String r11 = TAG
            java.lang.String r2 = "Bluetooth is off.  Cannot run scan test."
            java.lang.Object[] r3 = new java.lang.Object[r1]
            org.altbeacon.beacon.logging.LogManager.d(r11, r2, r3)
            goto L_0x0081
        L_0x007a:
            java.lang.String r2 = "Cannot get scanner"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            org.altbeacon.beacon.logging.LogManager.d(r11, r2, r3)
        L_0x0081:
            java.lang.String r11 = TAG
            java.lang.String r2 = "scan test complete"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            org.altbeacon.beacon.logging.LogManager.d(r11, r2, r3)
            java.lang.Boolean r11 = r10.mScanTestResult
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.BluetoothMedic.runScanTest(android.content.Context):boolean");
    }

    @SuppressLint({"MissingPermission"})
    public boolean runTransmitterTest(Context context) {
        initializeWithContext(context);
        if (isBleAdvertisePermissionDenied()) {
            LogManager.i(TAG, "Cannot run transmitter test -- advertise permission not granted", new Object[0]);
            return true;
        }
        this.mTransmitterTestResult = null;
        long currentTimeMillis = System.currentTimeMillis();
        BluetoothAdapter bluetoothAdapter = this.mAdapter;
        if (bluetoothAdapter != null) {
            final BluetoothLeAdvertiser advertiserSafely = getAdvertiserSafely(bluetoothAdapter);
            if (advertiserSafely != null) {
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(0).build();
                AdvertiseData build2 = new AdvertiseData.Builder().addManufacturerData(0, new byte[]{0}).build();
                LogManager.i(TAG, "Starting transmitter test", new Object[0]);
                advertiserSafely.startAdvertising(build, build2, new AdvertiseCallback() {
                    public void onStartFailure(int i) {
                        super.onStartFailure(i);
                        LogManager.d(BluetoothMedic.TAG, "Sending onStartFailure event", new Object[0]);
                        BluetoothMedic.this.processMedicAction("onStartFailed", i);
                        if (i == 4) {
                            BluetoothMedic.this.mTransmitterTestResult = Boolean.FALSE;
                            LogManager.w(BluetoothMedic.TAG, "Transmitter test failed in a way we consider a test failure", new Object[0]);
                            return;
                        }
                        BluetoothMedic.this.mTransmitterTestResult = Boolean.TRUE;
                        LogManager.i(BluetoothMedic.TAG, "Transmitter test failed, but not in a way we consider a test failure", new Object[0]);
                    }

                    public void onStartSuccess(AdvertiseSettings advertiseSettings) {
                        super.onStartSuccess(advertiseSettings);
                        LogManager.i(BluetoothMedic.TAG, "Transmitter test succeeded", new Object[0]);
                        advertiserSafely.stopAdvertising(this);
                        BluetoothMedic.this.mTransmitterTestResult = Boolean.TRUE;
                    }
                });
            } else {
                LogManager.d(TAG, "Cannot get advertiser", new Object[0]);
            }
            while (true) {
                if (this.mTransmitterTestResult != null) {
                    break;
                }
                LogManager.d(TAG, "Waiting for transmitter test to complete...", new Object[0]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
                if (System.currentTimeMillis() - currentTimeMillis > RangedBeacon.DEFAULT_MAX_TRACKING_AGE) {
                    LogManager.d(TAG, "Timeout running transmitter test", new Object[0]);
                    break;
                }
            }
        }
        LogManager.d(TAG, "transmitter test complete", new Object[0]);
        Boolean bool = this.mTransmitterTestResult;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public void setNotificationsEnabled(boolean z, int i) {
        this.mNotificationsEnabled = z;
        this.mNotificationIcon = i;
    }
}
