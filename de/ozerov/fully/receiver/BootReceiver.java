package de.ozerov.fully.receiver;

import A.d;
import Z1.c;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import d4.k;
import de.ozerov.fully.C0723k0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.LauncherReplacement;
import de.ozerov.fully.MyApplication;
import de.ozerov.fully.ProvisioningActivity;
import n2.a;

public class BootReceiver extends BroadcastReceiver {
    public static boolean a(Context context) {
        k kVar = new k(context, 1);
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        c cVar = (c) kVar.f9767W;
        cVar.getClass();
        long j7 = 0;
        try {
            j7 = ((SharedPreferences) cVar.f6955V).getLong("lastBootTime", 0);
        } catch (Exception unused) {
        }
        if (Math.abs(j7 - currentTimeMillis) < 1000) {
            return true;
        }
        return false;
    }

    public static void b(Context context) {
        new k(context, 1).U2("lastBootTime", System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    public final void onReceive(Context context, Intent intent) {
        Log.i("BootReceiver", "Received ACTION_BOOT_COMPLETED broadcast");
        C0794w0.q0(0, "BootReceiver", "Received ACTION_BOOT_COMPLETED broadcast");
        b(context);
        k kVar = new k(context, 1);
        boolean Z7 = C0794w0.Z(context);
        c cVar = (c) kVar.f9767W;
        if (!Z7 || cVar.n("isProvisioningCompleted", false) || cVar.n("isDeviceOwner", false)) {
            if (cVar.n("launchOnBoot", false) || (kVar.c0().booleanValue() && kVar.C().booleanValue())) {
                Intent intent2 = new Intent(context, FullyActivity.class);
                intent2.addFlags(268435456);
                if (kVar.c0().booleanValue() && kVar.C().booleanValue()) {
                    int i = LauncherReplacement.f10083U;
                    if (context.getPackageManager().getComponentEnabledSetting(new ComponentName(context.getApplicationContext(), LauncherReplacement.class)) == 1) {
                        intent2.addCategory("android.intent.category.HOME");
                        intent2.setAction("android.intent.action.MAIN");
                        intent2.putExtra("action", "com.fullykiosk.singleapp.action.onboot");
                        Intent c8 = a.c(intent2);
                        try {
                            PendingIntent.getActivity(context, 0, c8, 335544320).send();
                        } catch (Exception e) {
                            Log.w("BootReceiver", "Failed to send intent " + a.o0(c8) + " due to " + e.getMessage());
                        }
                        C0723k0.b(context, (d) null);
                    }
                }
                intent2.setAction("com.fullykiosk.singleapp.action.onboot");
                try {
                    context.startActivity(intent2);
                    Log.i("BootReceiver", "Sending onBoot intent " + a.o0(intent2));
                } catch (Exception e8) {
                    Log.e("BootReceiver", "Failed to start intent " + a.o0(intent2) + " due to " + e8.getMessage());
                }
                C0723k0.b(context, (d) null);
            }
        } else if (!((MyApplication) context.getApplicationContext()).f10112a0.isEmpty()) {
            Log.w("BootReceiver", "Don't restart provisioning on boot as some activity already running");
        } else {
            Log.i("BootReceiver", "Restarting incomplete provisioning on boot");
            C0794w0.q0(0, "BootReceiver", "Restarting incomplete provisioning on boot");
            try {
                Intent intent3 = new Intent(context, ProvisioningActivity.class);
                intent3.setFlags(268435456);
                context.startActivity(intent3);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }
}
