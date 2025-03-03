package org.altbeacon.beacon.service;

import Q0.g;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.le.ScanResult;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.BeaconLocalBroadcastProcessor;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;

public class ScanJobScheduler {
    private static final long MIN_MILLIS_BETWEEN_SCAN_JOB_SCHEDULING = 10000;
    private static final Object SINGLETON_LOCK = new Object();
    private static final String TAG = "ScanJobScheduler";
    private static volatile ScanJobScheduler sInstance;
    private boolean mBackgroundScanJobFirstRun = true;
    private List<ScanResult> mBackgroundScanResultQueue = new ArrayList();
    private BeaconLocalBroadcastProcessor mBeaconNotificationProcessor;
    private Long mScanJobScheduleTime = 0L;

    private ScanJobScheduler() {
    }

    private void applySettingsToScheduledJob(Context context, BeaconManager beaconManager, ScanState scanState) {
        scanState.applyChanges(beaconManager);
        String str = TAG;
        boolean z = false;
        LogManager.d(str, "Applying scan job settings with background mode " + scanState.getBackgroundMode(), new Object[0]);
        if (this.mBackgroundScanJobFirstRun && scanState.getBackgroundMode().booleanValue()) {
            LogManager.d(str, "This is the first time we schedule a job and we are in background, set immediate scan flag to true in order to trigger the HW filter install.", new Object[0]);
            z = true;
        }
        schedule(context, scanState, z);
    }

    public static ScanJobScheduler getInstance() {
        ScanJobScheduler scanJobScheduler = sInstance;
        if (scanJobScheduler == null) {
            synchronized (SINGLETON_LOCK) {
                try {
                    scanJobScheduler = sInstance;
                    if (scanJobScheduler == null) {
                        scanJobScheduler = new ScanJobScheduler();
                        sInstance = scanJobScheduler;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return scanJobScheduler;
    }

    private void schedule(Context context, ScanState scanState, boolean z) {
        ensureNotificationProcessorSetup(context);
        long scanJobIntervalMillis = (long) (scanState.getScanJobIntervalMillis() - scanState.getScanJobRuntimeMillis());
        long j7 = 0;
        if (z) {
            LogManager.d(TAG, "We just woke up in the background based on a new scan result or first run of the app. Start scan job immediately.", new Object[0]);
        } else {
            if (scanJobIntervalMillis > 0) {
                j7 = SystemClock.elapsedRealtime() % ((long) scanState.getScanJobIntervalMillis());
            }
            if (j7 < 50) {
                j7 = 50;
            }
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (scanState.getRangedRegionState().size() + scanState.getMonitoringStatus().regions().size() > 0) {
            Class<ScanJob> cls = ScanJob.class;
            if (!z && scanState.getBackgroundMode().booleanValue()) {
                LogManager.d(TAG, "Not scheduling an immediate scan because we are in background mode.   Cancelling existing immediate ScanJob.", new Object[0]);
                jobScheduler.cancel(ScanJob.getImmediateScanJobId(context));
            } else if (j7 < ((long) (scanState.getScanJobIntervalMillis() - 50))) {
                String str = TAG;
                LogManager.d(str, "Scheduling immediate ScanJob to run in " + j7 + " millis", new Object[0]);
                int schedule = jobScheduler.schedule(new JobInfo.Builder(ScanJob.getImmediateScanJobId(context), new ComponentName(context, cls)).setPersisted(true).setExtras(new PersistableBundle()).setMinimumLatency(j7).setOverrideDeadline(j7).build());
                if (schedule < 0) {
                    LogManager.e(str, g.m(schedule, "Failed to schedule an immediate scan job.  Beacons will not be detected. Error: "), new Object[0]);
                } else if (this.mBackgroundScanJobFirstRun) {
                    LogManager.d(str, "First immediate scan job scheduled successful, change the flag to false.", new Object[0]);
                    this.mBackgroundScanJobFirstRun = false;
                }
            } else {
                LogManager.d(TAG, "Not scheduling immediate scan, assuming periodic is about to run", new Object[0]);
            }
            JobInfo.Builder extras = new JobInfo.Builder(ScanJob.getPeriodicScanJobId(context), new ComponentName(context, cls)).setPersisted(true).setExtras(new PersistableBundle());
            if (Build.VERSION.SDK_INT >= 24) {
                extras.setPeriodic((long) scanState.getScanJobIntervalMillis(), 0).build();
            } else {
                extras.setPeriodic((long) scanState.getScanJobIntervalMillis()).build();
            }
            JobInfo build = extras.build();
            String str2 = TAG;
            LogManager.d(str2, "Scheduling periodic ScanJob " + build + " to run every " + scanState.getScanJobIntervalMillis() + " millis", new Object[0]);
            int schedule2 = jobScheduler.schedule(build);
            if (schedule2 < 0) {
                LogManager.e(str2, g.m(schedule2, "Failed to schedule a periodic scan job.  Beacons will not be detected. Error: "), new Object[0]);
                return;
            }
            return;
        }
        LogManager.d(TAG, "We are not monitoring or ranging any regions.  We are going to cancel all scan jobs.", new Object[0]);
        jobScheduler.cancel(ScanJob.getImmediateScanJobId(context));
        jobScheduler.cancel(ScanJob.getPeriodicScanJobId(context));
        if (Build.VERSION.SDK_INT >= 26) {
            new ScanHelper(context).stopAndroidOBackgroundScan();
        }
    }

    public void cancelSchedule(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.cancel(ScanJob.getImmediateScanJobId(context));
        jobScheduler.cancel(ScanJob.getPeriodicScanJobId(context));
        BeaconLocalBroadcastProcessor beaconLocalBroadcastProcessor = this.mBeaconNotificationProcessor;
        if (beaconLocalBroadcastProcessor != null) {
            beaconLocalBroadcastProcessor.unregister();
        }
        this.mBackgroundScanJobFirstRun = true;
    }

    public List<ScanResult> dumpBackgroundScanResultQueue() {
        List<ScanResult> list = this.mBackgroundScanResultQueue;
        this.mBackgroundScanResultQueue = new ArrayList();
        return list;
    }

    public void ensureNotificationProcessorSetup(Context context) {
        if (this.mBeaconNotificationProcessor == null) {
            this.mBeaconNotificationProcessor = BeaconLocalBroadcastProcessor.getInstance(context);
        }
        this.mBeaconNotificationProcessor.register();
    }

    public void forceScheduleNextScan(Context context) {
        schedule(context, ScanState.restore(context), false);
    }

    public void scheduleAfterBackgroundWakeup(Context context, List<ScanResult> list) {
        if (list != null) {
            this.mBackgroundScanResultQueue.addAll(list);
        }
        synchronized (this) {
            if (System.currentTimeMillis() - this.mScanJobScheduleTime.longValue() > 10000) {
                String str = TAG;
                LogManager.d(str, "scheduling an immediate scan job because last did " + (System.currentTimeMillis() - this.mScanJobScheduleTime.longValue()) + "millis ago.", new Object[0]);
                this.mScanJobScheduleTime = Long.valueOf(System.currentTimeMillis());
                schedule(context, ScanState.restore(context), true);
                return;
            }
            LogManager.d(TAG, "Not scheduling an immediate scan job because we just did recently.", new Object[0]);
        }
    }

    public void scheduleForIntentScanStrategy(Context context) {
        JobInfo.Builder extras = new JobInfo.Builder(ScanJob.getPeriodicScanJobId(context), new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle());
        if (Build.VERSION.SDK_INT >= 24) {
            extras.setPeriodic(900000, 0).build();
        } else {
            extras.setPeriodic(900000).build();
        }
        JobInfo build = extras.build();
        String str = TAG;
        LogManager.d(str, "Scheduling periodic ScanJob " + build + " to run every 15 minutes", new Object[0]);
        int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(build);
        if (schedule < 0) {
            LogManager.e(str, g.m(schedule, "Failed to schedule a periodic scan job to look for region exits. Error: "), new Object[0]);
        }
    }

    public void applySettingsToScheduledJob(Context context, BeaconManager beaconManager) {
        LogManager.d(TAG, "Applying settings to ScanJob", new Object[0]);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        applySettingsToScheduledJob(context, beaconManager, ScanState.restore(context));
    }
}
