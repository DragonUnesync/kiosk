package de.ozerov.fully.receiver;

import B.C0002c;
import Z1.c;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import d4.k;
import n2.a;

public class CrashTestReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f10932a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile int f10933b;

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        k kVar = new k(applicationContext, 1);
        if (((c) kVar.f9767W).n("enableCrashTest", true)) {
            AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
            try {
                PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, 433433, new Intent(applicationContext, CrashTestReceiver.class), 335544320);
                if (broadcast != null) {
                    alarmManager.cancel(broadcast);
                    if (a.r0()) {
                        if (!alarmManager.canScheduleExactAlarms()) {
                            return;
                        }
                    }
                    if (!kVar.P1().booleanValue()) {
                        return;
                    }
                    if (kVar.Z().booleanValue() || kVar.E1().booleanValue()) {
                        alarmManager.setExact(0, System.currentTimeMillis() + 10000, broadcast);
                    }
                }
            } catch (Exception e) {
                e = e;
                Log.w("CrashTestReceiver", "Failed to schedule crash test due to " + e.getMessage());
            } catch (Error e8) {
                e = e8;
                Log.w("CrashTestReceiver", "Failed to schedule crash test due to " + e.getMessage());
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        new Thread(new C0002c(this, context.getApplicationContext(), context)).start();
    }
}
