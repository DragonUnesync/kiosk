package org.altbeacon.beacon;

import N.e;
import Q0.g;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.ServiceStartNotAllowedException;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.logging.Loggers;
import org.altbeacon.beacon.powersave.BackgroundPowerSaverInternal;
import org.altbeacon.beacon.service.BeaconService;
import org.altbeacon.beacon.service.Callback;
import org.altbeacon.beacon.service.IntentScanStrategyCoordinator;
import org.altbeacon.beacon.service.MonitoringStatus;
import org.altbeacon.beacon.service.RangeState;
import org.altbeacon.beacon.service.RangedBeacon;
import org.altbeacon.beacon.service.RegionMonitoringState;
import org.altbeacon.beacon.service.ScanJobScheduler;
import org.altbeacon.beacon.service.SettingsData;
import org.altbeacon.beacon.service.StartRMData;
import org.altbeacon.beacon.service.scanner.NonBeaconLeScanCallback;
import org.altbeacon.beacon.simulator.BeaconSimulator;
import org.altbeacon.beacon.utils.ChangeAwareCopyOnWriteArrayList;
import org.altbeacon.beacon.utils.ChangeAwareCopyOnWriteArrayListNotifier;
import org.altbeacon.beacon.utils.ProcessUtils;

public class BeaconManager {
    public static final long DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD = 300000;
    public static final long DEFAULT_BACKGROUND_SCAN_PERIOD = 10000;
    public static final long DEFAULT_EXIT_PERIOD = 10000;
    public static final long DEFAULT_FOREGROUND_BETWEEN_SCAN_PERIOD = 0;
    public static final long DEFAULT_FOREGROUND_SCAN_PERIOD = 1100;
    private static final Object SINGLETON_LOCK = new Object();
    private static final String TAG = "BeaconManager";
    protected static BeaconSimulator beaconSimulator = null;
    protected static String distanceModelUpdateUrl = null;
    protected static Class rssiFilterImplClass = null;
    private static boolean sAndroidLScanningDisabled = false;
    private static long sExitRegionPeriod = 10000;
    protected static volatile BeaconManager sInstance;
    private static boolean sManifestCheckingDisabled;
    private BeaconConsumer autoBindConsumer = null;
    /* access modifiers changed from: private */
    public final Set<Region> autoBindMonitoredRegions = new HashSet();
    /* access modifiers changed from: private */
    public final Set<Region> autoBindRangedRegions = new HashSet();
    private long backgroundBetweenScanPeriod = DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD;
    private long backgroundScanPeriod = 10000;
    private final List<BeaconParser> beaconParsers;
    /* access modifiers changed from: private */
    public final ConcurrentMap<InternalBeaconConsumer, ConsumerInfo> consumers = new ConcurrentHashMap();
    protected RangeNotifier dataRequestNotifier = null;
    private long foregroundBetweenScanPeriod = 0;
    private long foregroundScanPeriod = DEFAULT_FOREGROUND_SCAN_PERIOD;
    private boolean mBackgroundMode = false;
    private boolean mBackgroundModeUninitialized = true;
    /* access modifiers changed from: private */
    public final Context mContext;
    private Notification mForegroundServiceNotification = null;
    private int mForegroundServiceNotificationId = -1;
    private IntentScanStrategyCoordinator mIntentScanStrategyCoordinator = null;
    BackgroundPowerSaverInternal mInternalBackgroundPowerSaver = null;
    private boolean mMainProcess = false;
    private NonBeaconLeScanCallback mNonBeaconLeScanCallback;
    private boolean mRegionStatePersistenceEnabled = true;
    private HashMap<Region, RegionViewModel> mRegionViewModels = new HashMap<>();
    /* access modifiers changed from: private */
    public Boolean mScannerInSameProcess = null;
    private boolean mScheduledScanJobsEnabled = false;
    private boolean mScheduledScanJobsEnabledByFallback = false;
    private Handler mServiceSyncHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public boolean mServiceSyncScheduled = false;
    protected final Set<MonitorNotifier> monitorNotifiers = new CopyOnWriteArraySet();
    protected final Set<RangeNotifier> rangeNotifiers = new CopyOnWriteArraySet();
    private final Set<Region> rangedRegions = new CopyOnWriteArraySet();
    /* access modifiers changed from: private */
    public Messenger serviceMessenger = null;

    public class BeaconServiceConnection implements ServiceConnection {
        public /* synthetic */ BeaconServiceConnection(BeaconManager beaconManager, int i) {
            this();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogManager.d(BeaconManager.TAG, "we have a connection to the service now", new Object[0]);
            if (BeaconManager.this.mScannerInSameProcess == null) {
                BeaconManager.this.mScannerInSameProcess = Boolean.FALSE;
            }
            BeaconManager.this.serviceMessenger = new Messenger(iBinder);
            BeaconManager.this.applySettings();
            synchronized (BeaconManager.this.consumers) {
                try {
                    for (Map.Entry entry : BeaconManager.this.consumers.entrySet()) {
                        if (!((ConsumerInfo) entry.getValue()).isConnected) {
                            ((InternalBeaconConsumer) entry.getKey()).onBeaconServiceConnect();
                            ((ConsumerInfo) entry.getValue()).isConnected = true;
                        }
                    }
                } finally {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            LogManager.e(BeaconManager.TAG, "onServiceDisconnected", new Object[0]);
            BeaconManager.this.serviceMessenger = null;
        }

        private BeaconServiceConnection() {
        }
    }

    public class ConsumerInfo {
        public BeaconServiceConnection beaconServiceConnection;
        public boolean isConnected = false;

        public ConsumerInfo() {
            this.beaconServiceConnection = new BeaconServiceConnection(BeaconManager.this, 0);
        }
    }

    public class ServiceNotDeclaredException extends RuntimeException {
        public ServiceNotDeclaredException() {
            super("The BeaconService is not properly declared in AndroidManifest.xml.  If using Eclipse, please verify that your project.properties has manifestmerger.enabled=true");
        }
    }

    public BeaconManager(Context context) {
        this.mContext = context.getApplicationContext();
        checkIfMainProcess();
        if (!sManifestCheckingDisabled) {
            verifyServiceDeclaration();
        }
        ChangeAwareCopyOnWriteArrayList changeAwareCopyOnWriteArrayList = new ChangeAwareCopyOnWriteArrayList();
        changeAwareCopyOnWriteArrayList.setNotifier(new ChangeAwareCopyOnWriteArrayListNotifier() {
            public void onChange() {
                LogManager.d(BeaconManager.TAG, "API Beacon parsers changed", new Object[0]);
                BeaconManager.this.applySettings();
            }
        });
        this.beaconParsers = changeAwareCopyOnWriteArrayList;
        changeAwareCopyOnWriteArrayList.add(new AltBeaconParser());
        setScheduledScanJobsEnabledDefault();
    }

    /* access modifiers changed from: private */
    @TargetApi(18)
    public void applyChangesToServices(int i, Region region) {
        if (!isAnyConsumerBound()) {
            LogManager.w(TAG, "The BeaconManager is not bound to the service.  Call beaconManager.bind(BeaconConsumer consumer) and wait for a callback to onBeaconServiceConnect()", new Object[0]);
            return;
        }
        IntentScanStrategyCoordinator intentScanStrategyCoordinator = this.mIntentScanStrategyCoordinator;
        if (intentScanStrategyCoordinator != null) {
            intentScanStrategyCoordinator.applySettings();
        } else if (this.mScheduledScanJobsEnabled || this.mScheduledScanJobsEnabledByFallback) {
            ScanJobScheduler.getInstance().applySettingsToScheduledJob(this.mContext, this);
        } else {
            Message obtain = Message.obtain((Handler) null, i, 0, 0);
            if (i == 6) {
                obtain.setData(new StartRMData(getScanPeriod(), getBetweenScanPeriod(), this.mBackgroundMode).toBundle());
            } else if (i == 7) {
                obtain.setData(new SettingsData().collect(this.mContext).toBundle());
            } else {
                obtain.setData(new StartRMData(region, callbackPackageName(), getScanPeriod(), getBetweenScanPeriod(), this.mBackgroundMode).toBundle());
            }
            this.serviceMessenger.send(obtain);
        }
    }

    private synchronized void autoBind() {
        try {
            if (this.autoBindConsumer == null) {
                this.autoBindConsumer = new BeaconConsumer() {
                    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
                        return BeaconManager.this.mContext.bindService(intent, serviceConnection, i);
                    }

                    public Context getApplicationContext() {
                        return BeaconManager.this.mContext;
                    }

                    public void onBeaconServiceConnect() {
                        if (!BeaconManager.this.isBleAvailableOrSimulated()) {
                            LogManager.w(BeaconManager.TAG, "Method invocation will be ignored -- no BLE.", new Object[0]);
                            return;
                        }
                        synchronized (BeaconManager.this.autoBindRangedRegions) {
                            for (Region startRangingBeaconsInRegion : BeaconManager.this.autoBindRangedRegions) {
                                try {
                                    BeaconManager.this.startRangingBeaconsInRegion(startRangingBeaconsInRegion);
                                } catch (RemoteException e) {
                                    LogManager.e(BeaconManager.TAG, "Failed to start ranging", e);
                                }
                            }
                            BeaconManager.this.autoBindRangedRegions.clear();
                        }
                        synchronized (BeaconManager.this.autoBindMonitoredRegions) {
                            for (Region startMonitoringBeaconsInRegion : BeaconManager.this.autoBindMonitoredRegions) {
                                try {
                                    BeaconManager.this.startMonitoringBeaconsInRegion(startMonitoringBeaconsInRegion);
                                } catch (RemoteException e8) {
                                    LogManager.e(BeaconManager.TAG, "Failed to start monitoring", e8);
                                }
                            }
                            BeaconManager.this.autoBindMonitoredRegions.clear();
                        }
                    }

                    public void unbindService(ServiceConnection serviceConnection) {
                        BeaconManager.this.mContext.unbindService(serviceConnection);
                    }
                };
            }
            bindInternal(this.autoBindConsumer);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    private void autoUnbindIfNeeded() {
        BeaconConsumer beaconConsumer;
        if (getMonitoredRegions().size() == 0 && getRangedRegions().size() == 0 && (beaconConsumer = this.autoBindConsumer) != null) {
            unbindInternal(beaconConsumer);
            this.autoBindConsumer = null;
            this.autoBindRangedRegions.clear();
            this.autoBindMonitoredRegions.clear();
        }
    }

    private String callbackPackageName() {
        String packageName = this.mContext.getPackageName();
        LogManager.d(TAG, "callback packageName: %s", packageName);
        return packageName;
    }

    private boolean determineIfCalledFromSeparateScannerProcess() {
        if (!isScannerInDifferentProcess() || isMainProcess()) {
            return false;
        }
        LogManager.w(TAG, "Ranging/Monitoring may not be controlled from a separate BeaconScanner process.  To remove this warning, please wrap this call in: if (beaconManager.isMainProcess())", new Object[0]);
        return true;
    }

    private void ensureBackgroundPowerSaver() {
        if (this.mInternalBackgroundPowerSaver == null) {
            BackgroundPowerSaverInternal backgroundPowerSaverInternal = new BackgroundPowerSaverInternal(this.mContext);
            this.mInternalBackgroundPowerSaver = backgroundPowerSaverInternal;
            backgroundPowerSaverInternal.enableDefaultBackgroundStateInference();
        }
    }

    public static BeaconSimulator getBeaconSimulator() {
        return beaconSimulator;
    }

    private long getBetweenScanPeriod() {
        if (this.mBackgroundMode) {
            return this.backgroundBetweenScanPeriod;
        }
        return this.foregroundBetweenScanPeriod;
    }

    public static String getDistanceModelUpdateUrl() {
        return distanceModelUpdateUrl;
    }

    public static BeaconManager getInstanceForApplication(Context context) {
        BeaconManager beaconManager = sInstance;
        if (beaconManager == null) {
            synchronized (SINGLETON_LOCK) {
                try {
                    beaconManager = sInstance;
                    if (beaconManager == null) {
                        beaconManager = new BeaconManager(context);
                        sInstance = beaconManager;
                        LogManager.d(TAG, "API BeaconManager constructed ", new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return beaconManager;
    }

    public static boolean getManifestCheckingDisabled() {
        return sManifestCheckingDisabled;
    }

    public static long getRegionExitPeriod() {
        return sExitRegionPeriod;
    }

    public static Class getRssiFilterImplClass() {
        return rssiFilterImplClass;
    }

    private long getScanPeriod() {
        if (this.mBackgroundMode) {
            return this.backgroundScanPeriod;
        }
        return this.foregroundScanPeriod;
    }

    public static boolean isAndroidLScanningDisabled() {
        return sAndroidLScanningDisabled;
    }

    private boolean isBleAvailable() {
        if (this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        }
        LogManager.w(TAG, "This device does not support bluetooth LE.", new Object[0]);
        return false;
    }

    /* access modifiers changed from: private */
    public boolean isBleAvailableOrSimulated() {
        if (getBeaconSimulator() != null) {
            return true;
        }
        return isBleAvailable();
    }

    @Deprecated
    public static void logDebug(String str, String str2) {
        LogManager.d(str, str2, new Object[0]);
    }

    public static void setAndroidLScanningDisabled(boolean z) {
        LogManager.d(TAG, "API setAndroidLScanningDisabled " + z, new Object[0]);
        sAndroidLScanningDisabled = z;
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null) {
            beaconManager.applySettings();
        }
    }

    public static void setBeaconSimulator(BeaconSimulator beaconSimulator2) {
        LogManager.d(TAG, "API setBeaconSimulator " + beaconSimulator2, new Object[0]);
        warnIfScannerNotInSameProcess();
        beaconSimulator = beaconSimulator2;
    }

    public static void setDebug(boolean z) {
        if (z) {
            LogManager.setLogger(Loggers.verboseLogger());
            LogManager.setVerboseLoggingEnabled(true);
            return;
        }
        LogManager.setLogger(Loggers.empty());
        LogManager.setVerboseLoggingEnabled(false);
    }

    public static void setDistanceModelUpdateUrl(String str) {
        warnIfScannerNotInSameProcess();
        distanceModelUpdateUrl = str;
    }

    public static void setManifestCheckingDisabled(boolean z) {
        LogManager.d(TAG, "API setManifestCheckingDisabled " + z, new Object[0]);
        sManifestCheckingDisabled = z;
    }

    public static void setRegionExitPeriod(long j7) {
        LogManager.d(TAG, e.w("API setRegionExitPeriod ", j7), new Object[0]);
        sExitRegionPeriod = j7;
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null) {
            beaconManager.applySettings();
        }
    }

    public static void setRssiFilterImplClass(Class cls) {
        warnIfScannerNotInSameProcess();
        rssiFilterImplClass = cls;
    }

    private void setScheduledScanJobsEnabledDefault() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        } else {
            z = false;
        }
        this.mScheduledScanJobsEnabled = z;
    }

    public static void setUseTrackingCache(boolean z) {
        RangeState.setUseTrackingCache(z);
        if (sInstance != null) {
            sInstance.applySettings();
        }
    }

    @Deprecated
    public static void setsManifestCheckingDisabled(boolean z) {
        sManifestCheckingDisabled = z;
    }

    private void verifyLocationPermissionGrantedForForegroundService() {
        boolean z;
        boolean z6;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (this.mContext.getApplicationInfo().targetSdkVersion >= 34) {
            z6 = true;
        } else {
            z6 = false;
        }
        LogManager.d(TAG, "Running SDK 34? %b.  Targeting SDK 34? %b", valueOf, Boolean.valueOf(z6));
        if (i >= 34 && this.mContext.getApplicationInfo().targetSdkVersion >= 34) {
            LogManager.d(TAG, "Checking fine location permission as required for foreground service", new Object[0]);
            if (this.mContext.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                throw new SecurityException("Foreground service may not be enabled until after user grants Manifest.permission.ACCESS_FINE_LOCATION when target SdkVersion is set to SDK 34 or above.  See: https://altbeacon.github.io/android-beacon-library/foreground-service.html");
            }
        }
    }

    private void verifyServiceDeclaration() {
        List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent(this.mContext, BeaconService.class), 65536);
        if (queryIntentServices != null && queryIntentServices.isEmpty()) {
            throw new ServiceNotDeclaredException();
        }
    }

    private static void warnIfScannerNotInSameProcess() {
        BeaconManager beaconManager = sInstance;
        if (beaconManager != null && beaconManager.isScannerInDifferentProcess()) {
            LogManager.w(TAG, "Unsupported configuration change made for BeaconScanner in separate process", new Object[0]);
        }
    }

    public void addMonitorNotifier(MonitorNotifier monitorNotifier) {
        LogManager.d(TAG, "API addMonitorNotifier " + monitorNotifier, new Object[0]);
        if (!determineIfCalledFromSeparateScannerProcess() && monitorNotifier != null) {
            this.monitorNotifiers.add(monitorNotifier);
        }
    }

    public void addRangeNotifier(RangeNotifier rangeNotifier) {
        LogManager.d(TAG, "API addRangeNotifier " + rangeNotifier, new Object[0]);
        if (rangeNotifier != null) {
            this.rangeNotifiers.add(rangeNotifier);
        }
    }

    public void applySettings() {
        LogManager.d(TAG, "API applySettings", new Object[0]);
        if (!determineIfCalledFromSeparateScannerProcess()) {
            if (!isAnyConsumerBound()) {
                LogManager.d(TAG, "Not synchronizing settings to service, as it has not started up yet", new Object[0]);
            } else {
                syncSettingsToService();
            }
        }
    }

    @Deprecated
    public void bind(BeaconConsumer beaconConsumer) {
        LogManager.d(TAG, "API bind", new Object[0]);
        bindInternal(beaconConsumer);
    }

    public void bindInternal(InternalBeaconConsumer internalBeaconConsumer) {
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.consumers) {
            try {
                ConsumerInfo consumerInfo = new ConsumerInfo();
                ConsumerInfo putIfAbsent = this.consumers.putIfAbsent(internalBeaconConsumer, consumerInfo);
                boolean z = this.mScheduledScanJobsEnabledByFallback;
                if (!z) {
                    if (putIfAbsent != null) {
                        LogManager.d(TAG, "This consumer is already bound", new Object[0]);
                    }
                }
                if (z) {
                    LogManager.d(TAG, "Need to rebind for switch to foreground service", internalBeaconConsumer);
                    this.mScheduledScanJobsEnabledByFallback = false;
                } else {
                    LogManager.d(TAG, "This consumer is not bound.  Binding now: %s", internalBeaconConsumer);
                }
                IntentScanStrategyCoordinator intentScanStrategyCoordinator = this.mIntentScanStrategyCoordinator;
                if (intentScanStrategyCoordinator != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        intentScanStrategyCoordinator.start();
                    }
                    internalBeaconConsumer.onBeaconServiceConnect();
                } else if (this.mScheduledScanJobsEnabled) {
                    LogManager.d(TAG, "Not starting beacon scanning service. Using scheduled jobs", new Object[0]);
                    internalBeaconConsumer.onBeaconServiceConnect();
                } else {
                    LogManager.d(TAG, "Binding to service", new Object[0]);
                    Intent intent = new Intent(internalBeaconConsumer.getApplicationContext(), BeaconService.class);
                    if (Build.VERSION.SDK_INT >= 26 && getForegroundServiceNotification() != null) {
                        if (!isAnyConsumerBound() || this.mScheduledScanJobsEnabledByFallback) {
                            verifyLocationPermissionGrantedForForegroundService();
                            LogManager.i(TAG, "Attempting to starting foreground beacon scanning service.", new Object[0]);
                            this.mContext.startForegroundService(intent);
                            if (this.mScheduledScanJobsEnabledByFallback) {
                                LogManager.i(TAG, "Successfully switched to foreground service from fallback", new Object[0]);
                                this.mScheduledScanJobsEnabledByFallback = false;
                                ScanJobScheduler.getInstance().cancelSchedule(this.mContext);
                            } else {
                                LogManager.i(TAG, "successfully started foreground beacon scanning service.", new Object[0]);
                            }
                        } else {
                            LogManager.i(TAG, "Not starting foreground beacon scanning service.  A consumer is already bound, so it should be started", new Object[0]);
                        }
                    }
                    internalBeaconConsumer.bindService(intent, consumerInfo.beaconServiceConnection, 1);
                }
                LogManager.d(TAG, "consumer count is now: %s", Integer.valueOf(this.consumers.size()));
            } catch (ServiceStartNotAllowedException unused) {
                LogManager.w(TAG, "Foreground service blocked by ServiceStartNotAllowedException.  Falling back to job scheduler", new Object[0]);
                this.mScheduledScanJobsEnabledByFallback = true;
                syncSettingsToService();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(18)
    public boolean checkAvailability() {
        if (isBleAvailableOrSimulated()) {
            return ((BluetoothManager) this.mContext.getSystemService("bluetooth")).getAdapter().isEnabled();
        }
        throw new BleNotAvailableException("Bluetooth LE not supported by this device");
    }

    public void checkIfMainProcess() {
        ProcessUtils processUtils = new ProcessUtils(this.mContext);
        String processName = processUtils.getProcessName();
        String packageName = processUtils.getPackageName();
        int pid = processUtils.getPid();
        this.mMainProcess = processUtils.isMainProcess();
        LogManager.i(TAG, "BeaconManager started up on pid " + pid + " named '" + processName + "' for application package '" + packageName + "'.  isMainProcess=" + this.mMainProcess, new Object[0]);
    }

    public void disableForegroundServiceScanning() {
        LogManager.d(TAG, "API disableForegroundServiceScanning", new Object[0]);
        if (!isAnyConsumerBound()) {
            this.mForegroundServiceNotification = null;
            setScheduledScanJobsEnabledDefault();
            return;
        }
        throw new IllegalStateException("May not be called after consumers are already bound");
    }

    public void enableForegroundServiceScanning(Notification notification, int i) {
        LogManager.d(TAG, "API enableForegroundServiceScanning " + notification, new Object[0]);
        if (isAnyConsumerBound()) {
            throw new IllegalStateException("May not be called after consumers are already bound.");
        } else if (notification != null) {
            setEnableScheduledScanJobs(false);
            this.mForegroundServiceNotification = notification;
            this.mForegroundServiceNotificationId = i;
        } else {
            throw new NullPointerException("Notification cannot be null");
        }
    }

    public boolean foregroundServiceStartFailed() {
        return this.mScheduledScanJobsEnabledByFallback;
    }

    public long getBackgroundBetweenScanPeriod() {
        return this.backgroundBetweenScanPeriod;
    }

    public boolean getBackgroundMode() {
        return this.mBackgroundMode;
    }

    public long getBackgroundScanPeriod() {
        return this.backgroundScanPeriod;
    }

    public List<BeaconParser> getBeaconParsers() {
        return this.beaconParsers;
    }

    public RangeNotifier getDataRequestNotifier() {
        return this.dataRequestNotifier;
    }

    public long getForegroundBetweenScanPeriod() {
        return this.foregroundBetweenScanPeriod;
    }

    public long getForegroundScanPeriod() {
        return this.foregroundScanPeriod;
    }

    public Notification getForegroundServiceNotification() {
        return this.mForegroundServiceNotification;
    }

    public int getForegroundServiceNotificationId() {
        return this.mForegroundServiceNotificationId;
    }

    public IntentScanStrategyCoordinator getIntentScanStrategyCoordinator() {
        return this.mIntentScanStrategyCoordinator;
    }

    public Collection<Region> getMonitoredRegions() {
        return MonitoringStatus.getInstanceForApplication(this.mContext).getActiveRegions();
    }

    @Deprecated
    public MonitorNotifier getMonitoringNotifier() {
        Iterator<MonitorNotifier> it = this.monitorNotifiers.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public Set<MonitorNotifier> getMonitoringNotifiers() {
        return DesugarCollections.unmodifiableSet(this.monitorNotifiers);
    }

    public NonBeaconLeScanCallback getNonBeaconLeScanCallback() {
        return this.mNonBeaconLeScanCallback;
    }

    public Collection<Region> getRangedRegions() {
        return DesugarCollections.unmodifiableSet(this.rangedRegions);
    }

    @Deprecated
    public RangeNotifier getRangingNotifier() {
        Iterator<RangeNotifier> it = this.rangeNotifiers.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public Set<RangeNotifier> getRangingNotifiers() {
        return DesugarCollections.unmodifiableSet(this.rangeNotifiers);
    }

    public RegionViewModel getRegionViewModel(Region region) {
        RegionViewModel regionViewModel = this.mRegionViewModels.get(region);
        if (regionViewModel != null) {
            return regionViewModel;
        }
        RegionViewModel regionViewModel2 = new RegionViewModel();
        this.mRegionViewModels.put(region, regionViewModel2);
        return regionViewModel2;
    }

    public boolean getScheduledScanJobsEnabled() {
        return this.mScheduledScanJobsEnabled;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleStategyFailover() {
        /*
            r5 = this;
            boolean r0 = r5.mScheduledScanJobsEnabledByFallback
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.isAnyConsumerBound()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x0011
        L_0x000e:
            r5.mScheduledScanJobsEnabledByFallback = r2
        L_0x0010:
            r0 = 0
        L_0x0011:
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator r3 = r5.mIntentScanStrategyCoordinator
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.getDisableOnFailure()
            if (r3 == 0) goto L_0x0027
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator r3 = r5.mIntentScanStrategyCoordinator
            int r3 = r3.getLastStrategyFailureDetectionCount()
            if (r3 <= 0) goto L_0x0027
            r0 = 0
            r5.mIntentScanStrategyCoordinator = r0
            goto L_0x0028
        L_0x0027:
            r1 = r0
        L_0x0028:
            if (r1 == 0) goto L_0x0074
            java.lang.String r0 = "unbinding all consumers for stategy failover"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "BeaconManager"
            org.altbeacon.beacon.logging.LogManager.i(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.concurrent.ConcurrentMap<org.altbeacon.beacon.InternalBeaconConsumer, org.altbeacon.beacon.BeaconManager$ConsumerInfo> r1 = r5.consumers
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0042:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r1.next()
            org.altbeacon.beacon.InternalBeaconConsumer r4 = (org.altbeacon.beacon.InternalBeaconConsumer) r4
            r5.unbindInternal(r4)
            goto L_0x0042
        L_0x0052:
            java.lang.String r1 = "binding all consumers for strategy failover"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.i(r3, r1, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x005d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r0.next()
            org.altbeacon.beacon.InternalBeaconConsumer r1 = (org.altbeacon.beacon.InternalBeaconConsumer) r1
            r5.bindInternal(r1)
            goto L_0x005d
        L_0x006d:
            java.lang.String r0 = "Done with failover"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.i(r3, r0, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconManager.handleStategyFailover():void");
    }

    public boolean isAnyConsumerBound() {
        boolean z;
        synchronized (this.consumers) {
            try {
                if (!this.consumers.isEmpty()) {
                    if (this.mIntentScanStrategyCoordinator == null && !this.mScheduledScanJobsEnabled && !this.mScheduledScanJobsEnabledByFallback) {
                        if (this.serviceMessenger != null) {
                        }
                    }
                    z = true;
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean isAutoBindActive() {
        if (this.autoBindConsumer != null) {
            return true;
        }
        return false;
    }

    public boolean isBackgroundModeUninitialized() {
        return this.mBackgroundModeUninitialized;
    }

    @Deprecated
    public boolean isBound(BeaconConsumer beaconConsumer) {
        boolean z;
        synchronized (this.consumers) {
            if (beaconConsumer != null) {
                try {
                    if (this.consumers.get(beaconConsumer) != null) {
                        if (!this.mScheduledScanJobsEnabled && !this.mScheduledScanJobsEnabledByFallback) {
                            if (this.serviceMessenger != null) {
                            }
                        }
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    public boolean isMainProcess() {
        return this.mMainProcess;
    }

    public boolean isRegionStatePersistenceEnabled() {
        return this.mRegionStatePersistenceEnabled;
    }

    public boolean isRegionViewModelInitialized(Region region) {
        if (this.mRegionViewModels.get(region) != null) {
            return true;
        }
        return false;
    }

    public boolean isScannerInDifferentProcess() {
        Boolean bool = this.mScannerInSameProcess;
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public void removeAllMonitorNotifiers() {
        LogManager.d(TAG, "API removeAllMonitorNotifiers", new Object[0]);
        if (!determineIfCalledFromSeparateScannerProcess()) {
            this.monitorNotifiers.clear();
        }
    }

    public void removeAllRangeNotifiers() {
        LogManager.d(TAG, "API removeAllRangeNotifiers", new Object[0]);
        this.rangeNotifiers.clear();
    }

    public boolean removeMonitorNotifier(MonitorNotifier monitorNotifier) {
        LogManager.d(TAG, "API removeMonitorNotifier " + monitorNotifier, new Object[0]);
        if (determineIfCalledFromSeparateScannerProcess()) {
            return false;
        }
        return this.monitorNotifiers.remove(monitorNotifier);
    }

    @Deprecated
    public boolean removeMonitoreNotifier(MonitorNotifier monitorNotifier) {
        return removeMonitorNotifier(monitorNotifier);
    }

    public boolean removeRangeNotifier(RangeNotifier rangeNotifier) {
        LogManager.d(TAG, "API removeRangeNotifier " + rangeNotifier, new Object[0]);
        return this.rangeNotifiers.remove(rangeNotifier);
    }

    public void requestStateForRegion(Region region) {
        int i;
        if (!determineIfCalledFromSeparateScannerProcess()) {
            RegionMonitoringState stateOf = MonitoringStatus.getInstanceForApplication(this.mContext).stateOf(region);
            if (stateOf == null || !stateOf.getInside()) {
                i = 0;
            } else {
                i = 1;
            }
            for (MonitorNotifier didDetermineStateForRegion : this.monitorNotifiers) {
                didDetermineStateForRegion.didDetermineStateForRegion(i, region);
            }
        }
    }

    public void retryForegroundServiceScanning() {
        if (foregroundServiceStartFailed()) {
            handleStategyFailover();
        }
    }

    public void setBackgroundBetweenScanPeriod(long j7) {
        LogManager.d(TAG, e.w("API setBackgroundBetweenScanPeriod ", j7), new Object[0]);
        this.backgroundBetweenScanPeriod = j7;
        if (Build.VERSION.SDK_INT >= 26 && j7 < 900000) {
            LogManager.w(TAG, "Setting a short backgroundBetweenScanPeriod has no effect on Android 8+, which is limited to scanning every ~15 minutes", new Object[0]);
        }
    }

    @Deprecated
    public void setBackgroundMode(boolean z) {
        LogManager.d(TAG, "API setBackgroundMode " + z, new Object[0]);
        setBackgroundModeInternal(z);
    }

    public void setBackgroundModeInternal(boolean z) {
        LogManager.d(TAG, "API setBackgroundModeIternal " + z, new Object[0]);
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
            return;
        }
        this.mBackgroundModeUninitialized = false;
        if (z != this.mBackgroundMode) {
            if (!z && getIntentScanStrategyCoordinator() != null) {
                getIntentScanStrategyCoordinator().performPeriodicProcessing(this.mContext);
            }
            this.mBackgroundMode = z;
            try {
                updateScanPeriods();
            } catch (RemoteException unused) {
                LogManager.e(TAG, "Cannot contact service to set scan periods", new Object[0]);
            }
        }
    }

    public void setBackgroundScanPeriod(long j7) {
        LogManager.d(TAG, e.w("API setBackgroundScanPeriod ", j7), new Object[0]);
        this.backgroundScanPeriod = j7;
    }

    public void setDataRequestNotifier(RangeNotifier rangeNotifier) {
        LogManager.d(TAG, "API setDataRequestNotifier " + rangeNotifier, new Object[0]);
        this.dataRequestNotifier = rangeNotifier;
    }

    public void setEnableScheduledScanJobs(boolean z) {
        LogManager.d(TAG, "API setEnableScheduledScanJobs " + z, new Object[0]);
        if (!isAnyConsumerBound()) {
            if (!z && Build.VERSION.SDK_INT >= 26) {
                LogManager.w(TAG, "Disabling ScanJobs on Android 8+ may disable delivery of beacon callbacks in the background unless a foreground service is active.", new Object[0]);
            }
            if (z) {
                this.mScheduledScanJobsEnabledByFallback = false;
            }
            this.mScheduledScanJobsEnabled = z;
            if (!z && !this.mScheduledScanJobsEnabledByFallback) {
                ScanJobScheduler.getInstance().cancelSchedule(this.mContext);
                return;
            }
            return;
        }
        LogManager.e(TAG, "ScanJob may not be configured because a consumer is already bound.", new Object[0]);
        throw new IllegalStateException("Method must be called before starting ranging or monitoring");
    }

    public void setForegroundBetweenScanPeriod(long j7) {
        LogManager.d(TAG, e.w("API setForegroundBetweenScanPeriod ", j7), new Object[0]);
        this.foregroundBetweenScanPeriod = j7;
    }

    public void setForegroundScanPeriod(long j7) {
        LogManager.d(TAG, e.w("API setForegroundScanPeriod ", j7), new Object[0]);
        this.foregroundScanPeriod = j7;
    }

    public void setIntentScanningStrategyEnabled(boolean z) {
        LogManager.d(TAG, "API setIntentScanningStrategyEnabled " + z, new Object[0]);
        if (isAnyConsumerBound()) {
            LogManager.e(TAG, "IntentScanningStrategy may not be configured because a consumer is already bound.", new Object[0]);
            throw new IllegalStateException("Method must be called before starting ranging or monitoring");
        } else if (z && Build.VERSION.SDK_INT < 26) {
            LogManager.e(TAG, "IntentScanningStrategy may not be configured because Intent Scanning is not availble prior to Android 8.0", new Object[0]);
        } else if (!z || Build.VERSION.SDK_INT < 26) {
            this.mIntentScanStrategyCoordinator = null;
        } else {
            this.mScheduledScanJobsEnabled = false;
            this.mScheduledScanJobsEnabledByFallback = false;
            ScanJobScheduler.getInstance().cancelSchedule(this.mContext);
            this.mIntentScanStrategyCoordinator = new IntentScanStrategyCoordinator(this.mContext);
        }
    }

    public void setMaxTrackingAge(int i) {
        LogManager.d(TAG, g.m(i, "API setMaxTrackingAge "), new Object[0]);
        RangedBeacon.setMaxTrackinAge(i);
    }

    @Deprecated
    public void setMonitorNotifier(MonitorNotifier monitorNotifier) {
        LogManager.d(TAG, "API setMonitorNotifier " + monitorNotifier, new Object[0]);
        if (!determineIfCalledFromSeparateScannerProcess()) {
            this.monitorNotifiers.clear();
            if (monitorNotifier != null) {
                addMonitorNotifier(monitorNotifier);
            }
        }
    }

    public void setNonBeaconLeScanCallback(NonBeaconLeScanCallback nonBeaconLeScanCallback) {
        LogManager.d(TAG, "API setNonBeaconLeScanCallback " + nonBeaconLeScanCallback, new Object[0]);
        this.mNonBeaconLeScanCallback = nonBeaconLeScanCallback;
    }

    @Deprecated
    public void setRangeNotifier(RangeNotifier rangeNotifier) {
        LogManager.d(TAG, "API setRangeNotifier " + rangeNotifier, new Object[0]);
        this.rangeNotifiers.clear();
        if (rangeNotifier != null) {
            addRangeNotifier(rangeNotifier);
        }
    }

    @Deprecated
    public void setRegionStatePeristenceEnabled(boolean z) {
        setRegionStatePersistenceEnabled(z);
    }

    public void setRegionStatePersistenceEnabled(boolean z) {
        LogManager.d(TAG, "API setRegionStatePerisistenceEnabled " + z, new Object[0]);
        this.mRegionStatePersistenceEnabled = z;
        if (!isScannerInDifferentProcess()) {
            if (z) {
                MonitoringStatus.getInstanceForApplication(this.mContext).startStatusPreservation();
            } else {
                MonitoringStatus.getInstanceForApplication(this.mContext).stopStatusPreservation();
            }
        }
        applySettings();
    }

    public void setScannerInSameProcess(boolean z) {
        LogManager.d(TAG, "API setScannerInSameProcess " + z, new Object[0]);
        this.mScannerInSameProcess = Boolean.valueOf(z);
    }

    public boolean shutdownIfIdle() {
        BeaconConsumer beaconConsumer;
        if (this.autoBindConsumer == null || this.rangedRegions.size() != 0 || getMonitoredRegions().size() != 0 || (beaconConsumer = this.autoBindConsumer) == null) {
            return false;
        }
        unbindInternal(beaconConsumer);
        this.autoBindConsumer = null;
        return true;
    }

    @TargetApi(18)
    public void startMonitoring(Region region) {
        LogManager.d(TAG, "API startMonitoring " + region, new Object[0]);
        ensureBackgroundPowerSaver();
        if (isAnyConsumerBound()) {
            try {
                startMonitoringBeaconsInRegion(region);
            } catch (RemoteException e) {
                LogManager.e(TAG, "Failed to start monitoring", e);
            }
        } else {
            synchronized (this.autoBindMonitoredRegions) {
                this.autoBindMonitoredRegions.remove(region);
                this.autoBindMonitoredRegions.add(region);
            }
            autoBind();
        }
    }

    @TargetApi(18)
    @Deprecated
    public void startMonitoringBeaconsInRegion(Region region) {
        LogManager.d(TAG, "API startMonitoringBeaconsInRegion " + region, new Object[0]);
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            if (!isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.mContext).addRegion(region, new Callback(callbackPackageName()));
            }
            applyChangesToServices(4, region);
            if (isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.mContext).addLocalRegion(region);
            }
            requestStateForRegion(region);
        }
    }

    @TargetApi(18)
    public void startRangingBeacons(Region region) {
        LogManager.d(TAG, "API startRangingBeacons " + region, new Object[0]);
        LogManager.d(TAG, "startRanging", new Object[0]);
        ensureBackgroundPowerSaver();
        if (isAnyConsumerBound()) {
            try {
                startRangingBeaconsInRegion(region);
            } catch (RemoteException e) {
                LogManager.e(TAG, "Failed to start ranging", e);
            }
        } else {
            synchronized (this.autoBindRangedRegions) {
                this.autoBindRangedRegions.remove(region);
                this.autoBindRangedRegions.add(region);
            }
            autoBind();
        }
    }

    @TargetApi(18)
    @Deprecated
    public void startRangingBeaconsInRegion(Region region) {
        LogManager.d(TAG, "API startRangingBeaconsInRegion " + region, new Object[0]);
        LogManager.d(TAG, "startRangingBeaconsInRegion", new Object[0]);
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            this.rangedRegions.remove(region);
            this.rangedRegions.add(region);
            applyChangesToServices(2, region);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(18)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopMonitoring(org.altbeacon.beacon.Region r5) {
        /*
            r4 = this;
            java.lang.String r0 = "BeaconManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "API stopMonitoring "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r0, r1, r3)
            r4.ensureBackgroundPowerSaver()
            boolean r0 = r4.isAnyConsumerBound()
            if (r0 == 0) goto L_0x0031
            r4.stopMonitoringBeaconsInRegion(r5)     // Catch:{ RemoteException -> 0x0023 }
            goto L_0x0043
        L_0x0023:
            r5 = move-exception
            java.lang.String r0 = "BeaconManager"
            java.lang.String r1 = "Failed to stop monitoring"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r5
            org.altbeacon.beacon.logging.LogManager.e(r0, r1, r3)
            goto L_0x0043
        L_0x0031:
            java.util.Set<org.altbeacon.beacon.Region> r0 = r4.autoBindMonitoredRegions
            monitor-enter(r0)
            java.util.Set<org.altbeacon.beacon.Region> r1 = r4.autoBindMonitoredRegions     // Catch:{ all -> 0x0044 }
            r1.remove(r5)     // Catch:{ all -> 0x0044 }
            android.content.Context r1 = r4.mContext     // Catch:{ all -> 0x0044 }
            org.altbeacon.beacon.service.MonitoringStatus r1 = org.altbeacon.beacon.service.MonitoringStatus.getInstanceForApplication(r1)     // Catch:{ all -> 0x0044 }
            r1.removeRegion(r5)     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
        L_0x0043:
            return
        L_0x0044:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconManager.stopMonitoring(org.altbeacon.beacon.Region):void");
    }

    @TargetApi(18)
    @Deprecated
    public void stopMonitoringBeaconsInRegion(Region region) {
        LogManager.d(TAG, "API stopMonitoringBeaconsInRegion " + region, new Object[0]);
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            if (!isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.mContext).removeRegion(region);
            }
            applyChangesToServices(5, region);
            if (isScannerInDifferentProcess()) {
                MonitoringStatus.getInstanceForApplication(this.mContext).removeLocalRegion(region);
            }
            autoUnbindIfNeeded();
        }
    }

    @TargetApi(18)
    public void stopRangingBeacons(Region region) {
        LogManager.d(TAG, "API stopRangingBeacons " + region, new Object[0]);
        LogManager.d(TAG, "stopRangingBeacons", new Object[0]);
        ensureBackgroundPowerSaver();
        if (isAnyConsumerBound()) {
            try {
                stopRangingBeaconsInRegion(region);
            } catch (RemoteException e) {
                LogManager.e(TAG, "Cannot stop ranging", e);
            }
        } else {
            synchronized (this.autoBindMonitoredRegions) {
                this.autoBindRangedRegions.remove(region);
            }
        }
        autoUnbindIfNeeded();
    }

    @TargetApi(18)
    @Deprecated
    public void stopRangingBeaconsInRegion(Region region) {
        LogManager.d(TAG, "API stopRangingBeacons " + region, new Object[0]);
        LogManager.d(TAG, "stopRangingBeaconsInRegion", new Object[0]);
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            this.rangedRegions.remove(region);
            applyChangesToServices(3, region);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void syncSettingsToService() {
        /*
            r4 = this;
            monitor-enter(r4)
            org.altbeacon.beacon.service.IntentScanStrategyCoordinator r0 = r4.mIntentScanStrategyCoordinator     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x000c
            r0.applySettings()     // Catch:{ all -> 0x000a }
            monitor-exit(r4)
            return
        L_0x000a:
            r0 = move-exception
            goto L_0x005a
        L_0x000c:
            boolean r0 = r4.mScheduledScanJobsEnabled     // Catch:{ all -> 0x000a }
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4.mScheduledScanJobsEnabledByFallback     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            boolean r0 = r4.isAnyConsumerBound()     // Catch:{ all -> 0x000a }
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "BeaconManager"
            java.lang.String r2 = "No settings sync to running service -- service not bound"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x000a }
            org.altbeacon.beacon.logging.LogManager.d(r0, r2, r1)     // Catch:{ all -> 0x000a }
            monitor-exit(r4)
            return
        L_0x0027:
            boolean r0 = r4.mServiceSyncScheduled     // Catch:{ all -> 0x000a }
            if (r0 != 0) goto L_0x0044
            r0 = 1
            r4.mServiceSyncScheduled = r0     // Catch:{ all -> 0x000a }
            java.lang.String r0 = "BeaconManager"
            java.lang.String r2 = "API Scheduling settings sync to running service."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x000a }
            org.altbeacon.beacon.logging.LogManager.d(r0, r2, r1)     // Catch:{ all -> 0x000a }
            android.os.Handler r0 = r4.mServiceSyncHandler     // Catch:{ all -> 0x000a }
            org.altbeacon.beacon.BeaconManager$2 r1 = new org.altbeacon.beacon.BeaconManager$2     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            r2 = 100
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x000a }
            goto L_0x004d
        L_0x0044:
            java.lang.String r0 = "BeaconManager"
            java.lang.String r2 = "Already scheduled settings sync to running service."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x000a }
            org.altbeacon.beacon.logging.LogManager.d(r0, r2, r1)     // Catch:{ all -> 0x000a }
        L_0x004d:
            monitor-exit(r4)
            return
        L_0x004f:
            org.altbeacon.beacon.service.ScanJobScheduler r0 = org.altbeacon.beacon.service.ScanJobScheduler.getInstance()     // Catch:{ all -> 0x000a }
            android.content.Context r1 = r4.mContext     // Catch:{ all -> 0x000a }
            r0.applySettingsToScheduledJob(r1, r4)     // Catch:{ all -> 0x000a }
            monitor-exit(r4)
            return
        L_0x005a:
            monitor-exit(r4)     // Catch:{ all -> 0x000a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconManager.syncSettingsToService():void");
    }

    @Deprecated
    public void unbind(BeaconConsumer beaconConsumer) {
        LogManager.d(TAG, "API unbind", new Object[0]);
        unbindInternal(beaconConsumer);
    }

    public void unbindInternal(InternalBeaconConsumer internalBeaconConsumer) {
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
            return;
        }
        synchronized (this.consumers) {
            try {
                if (this.consumers.containsKey(internalBeaconConsumer)) {
                    LogManager.d(TAG, "Unbinding", new Object[0]);
                    if (this.mIntentScanStrategyCoordinator != null) {
                        LogManager.d(TAG, "Not unbinding as we are using intent scanning strategy", new Object[0]);
                    } else {
                        if (!this.mScheduledScanJobsEnabled) {
                            if (!this.mScheduledScanJobsEnabledByFallback) {
                                internalBeaconConsumer.unbindService(this.consumers.get(internalBeaconConsumer).beaconServiceConnection);
                            }
                        }
                        LogManager.d(TAG, "Not unbinding from scanning service as we are using scan jobs.", new Object[0]);
                    }
                    LogManager.d(TAG, "Before unbind, consumer count is " + this.consumers.size(), new Object[0]);
                    this.consumers.remove(internalBeaconConsumer);
                    LogManager.d(TAG, "After unbind, consumer count is " + this.consumers.size(), new Object[0]);
                    if (this.consumers.size() == 0) {
                        this.serviceMessenger = null;
                        if (this.mScheduledScanJobsEnabled || this.mScheduledScanJobsEnabledByFallback || this.mIntentScanStrategyCoordinator != null) {
                            LogManager.i(TAG, "Cancelling scheduled jobs after unbind of last consumer.", new Object[0]);
                            ScanJobScheduler.getInstance().cancelSchedule(this.mContext);
                        }
                    }
                } else {
                    LogManager.d(TAG, "This consumer is not bound to: %s", internalBeaconConsumer);
                    LogManager.d(TAG, "Bound consumers: ", new Object[0]);
                    for (Map.Entry<InternalBeaconConsumer, ConsumerInfo> value : this.consumers.entrySet()) {
                        LogManager.d(TAG, String.valueOf(value.getValue()), new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(18)
    public void updateScanPeriods() {
        LogManager.d(TAG, "API updateScanPeriods", new Object[0]);
        if (!isBleAvailableOrSimulated()) {
            LogManager.w(TAG, "Method invocation will be ignored.", new Object[0]);
        } else if (!determineIfCalledFromSeparateScannerProcess()) {
            LogManager.d(TAG, "updating background flag to %s", Boolean.valueOf(this.mBackgroundMode));
            LogManager.d(TAG, "updating scan periods to %s, %s", Long.valueOf(getScanPeriod()), Long.valueOf(getBetweenScanPeriod()));
            if (isAnyConsumerBound()) {
                applyChangesToServices(6, (Region) null);
            }
        }
    }

    @Deprecated
    public static void logDebug(String str, String str2, Throwable th) {
        LogManager.d(th, str, str2, new Object[0]);
    }
}
