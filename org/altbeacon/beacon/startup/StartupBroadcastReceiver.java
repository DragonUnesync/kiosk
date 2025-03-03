package org.altbeacon.beacon.startup;

import Q0.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.service.ScanJobScheduler;

public class StartupBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupBroadcastReceiver";

    public void onReceive(Context context, Intent intent) {
        LogManager.d(TAG, "onReceive called in startup broadcast receiver", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        if (!(intent == null || intent.getAction() == null || !intent.getAction().equals("android.intent.action.BOOT_COMPLETED"))) {
            LogManager.i(TAG, "Android Beacon Library restarted via ACTION_BOOT_COMPLETED", new Object[0]);
            BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context.getApplicationContext());
            if (instanceForApplication.foregroundServiceStartFailed()) {
                LogManager.i(TAG, "Foreground service startup failure detected.  We will retry starting now that we have received a BOOT_COMPLETED action.", new Object[0]);
                instanceForApplication.retryForegroundServiceScanning();
            }
        }
        BeaconManager instanceForApplication2 = BeaconManager.getInstanceForApplication(context.getApplicationContext());
        if (instanceForApplication2.isAnyConsumerBound() || instanceForApplication2.getScheduledScanJobsEnabled() || instanceForApplication2.getIntentScanStrategyCoordinator() != null) {
            int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
            if (intExtra != -1) {
                LogManager.d(TAG, g.m(intExtra, "Passive background scan callback type: "), new Object[0]);
                LogManager.d(TAG, "got Android background scan via intent", new Object[0]);
                int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
                if (intExtra2 != -1) {
                    LogManager.w(TAG, g.m(intExtra2, "Passive background scan failed.  Code; "), new Object[0]);
                }
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
                if (instanceForApplication2.getIntentScanStrategyCoordinator() != null && i >= 26) {
                    instanceForApplication2.getIntentScanStrategyCoordinator().processScanResults(parcelableArrayListExtra);
                } else if (instanceForApplication2.getScheduledScanJobsEnabled()) {
                    ScanJobScheduler.getInstance().scheduleAfterBackgroundWakeup(context, parcelableArrayListExtra);
                }
            } else if (intent.getBooleanExtra("wakeup", false)) {
                LogManager.d(TAG, "got wake up intent", new Object[0]);
            } else {
                LogManager.d(TAG, "Already started.  Ignoring intent: %s of type: %s", intent, intent.getStringExtra("wakeup"));
            }
        } else {
            LogManager.d(TAG, "No consumers are bound.  Ignoring broadcast receiver.", new Object[0]);
        }
    }
}
