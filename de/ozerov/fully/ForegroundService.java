package de.ozerov.fully;

import C3.h;
import Q0.g;
import U.d;
import Z1.c;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import d4.k;
import de.ozerov.fully.receiver.CrashTestReceiver;
import java.util.List;
import n2.a;

public class ForegroundService extends Service {

    /* renamed from: a0  reason: collision with root package name */
    public static long f9897a0 = -1;

    /* renamed from: b0  reason: collision with root package name */
    public static long f9898b0 = 4000;

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f9899c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public static int f9900d0 = -1;

    /* renamed from: U  reason: collision with root package name */
    public k f9901U;

    /* renamed from: V  reason: collision with root package name */
    public final String f9902V = "Running on this device";

    /* renamed from: W  reason: collision with root package name */
    public final String f9903W = "Foreground Service";

    /* renamed from: X  reason: collision with root package name */
    public C0767r3 f9904X;

    /* renamed from: Y  reason: collision with root package name */
    public Handler f9905Y;

    /* renamed from: Z  reason: collision with root package name */
    public Handler f9906Z;

    public static boolean f(Context context) {
        if (a.b0(context) < 34 || !a.F0()) {
            return true;
        }
        return false;
    }

    public final synchronized void a(String str, long j7) {
        try {
            d.h(this, str, j7);
            if (this.f9904X == null) {
                C0767r3 r3Var = new C0767r3(this);
                this.f9904X = r3Var;
                r3Var.g(2131558500);
                C0767r3 r3Var2 = this.f9904X;
                r3Var2.f10916d = false;
                r3Var2.e = true;
                r3Var2.f10921k = true;
                r3Var2.f10926p = "restartingApp";
            }
            this.f9904X.j();
            b();
        } catch (Exception e) {
            Log.e("ForegroundService", "Something failed when restarting the app due to " + e.getMessage());
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = n2.a.r0()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            r4.d()     // Catch:{ all -> 0x002f }
            boolean r0 = n2.a.B0()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0031
            boolean r0 = n2.a.r0()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0031
            de.ozerov.fully.C0794w0.b(r4)     // Catch:{ all -> 0x002f }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x002f }
            r0.<init>()     // Catch:{ all -> 0x002f }
            r4.f9905Y = r0     // Catch:{ all -> 0x002f }
            de.ozerov.fully.l0 r1 = new de.ozerov.fully.l0     // Catch:{ all -> 0x002f }
            r2 = 0
            r1.<init>(r4, r2)     // Catch:{ all -> 0x002f }
            r2 = 20
            long r2 = (long) r2     // Catch:{ all -> 0x002f }
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x002f }
            goto L_0x0031
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            monitor-exit(r4)
            return
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.ForegroundService.b():void");
    }

    public final synchronized void c() {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
            if (!(runningAppProcesses == null || f9900d0 == -1)) {
                boolean z = false;
                for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                    if (!next.processName.contains(":") && next.pid == f9900d0) {
                        z = true;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (!z) {
                    if (this.f9901U.P1().booleanValue() || ((c) this.f9901U.f9767W).n("restartAfterUpdate", true)) {
                        if (currentTimeMillis - f9897a0 >= f9898b0) {
                            f9897a0 = System.currentTimeMillis();
                            long j7 = f9898b0;
                            if (j7 < 4096000) {
                                f9898b0 = j7 * 2;
                            }
                            String str = "Missing main app process, restarting the app. Next check in " + f9898b0 + " ms...";
                            C0794w0.q0(1, "ForegroundService", str);
                            Log.w("ForegroundService", str);
                            a("Process Killed", 0);
                        } else if (f9899c0) {
                            String str2 = "Missing main app process, but waiting another " + (f9898b0 - (currentTimeMillis - f9897a0)) + " ms...";
                            C0794w0.q0(1, "ForegroundService", str2);
                            Log.w("ForegroundService", str2);
                        }
                    } else if (f9899c0) {
                        C0794w0.q0(1, "ForegroundService", "Missing main app process, but not restarting as disabled by settings");
                        Log.w("ForegroundService", "Missing main app process, but not restarting as disabled by settings");
                    }
                    f9899c0 = false;
                }
                if (z) {
                    long j8 = f9898b0;
                    if (j8 != 4000 && currentTimeMillis - f9897a0 > j8 * 2) {
                        System.currentTimeMillis();
                        f9898b0 = 4000;
                    }
                    C0767r3 r3Var = this.f9904X;
                    if (r3Var != null && r3Var.f10924n) {
                        C0794w0.q0(0, "ForegroundService", "Main app process detected, removing overlay...");
                        Log.i("ForegroundService", "Main app process detected, removing overlay...");
                        this.f9904X.e();
                    }
                    f9899c0 = true;
                }
            }
        } catch (Exception e) {
            Log.e("ForegroundService", "Failed to get running processes due to " + e.getMessage());
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        e();
        Handler handler = new Handler();
        this.f9906Z = handler;
        handler.postDelayed(new C0729l0(this, 1), (long) 2000);
    }

    public final synchronized void d() {
        Handler handler = this.f9905Y;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9905Y = null;
        }
    }

    public final synchronized void e() {
        Handler handler = this.f9906Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9906Z = null;
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f9901U.N1().booleanValue() || this.f9901U.O1().booleanValue()) {
            C0794w0.u0(this, this.f9901U.N1().booleanValue(), this.f9901U.O1().booleanValue());
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.f9901U = new k((Context) this, 1);
        Log.i("ForegroundService", "onCreate " + this.f9903W);
    }

    public final void onDestroy() {
        Log.i("ForegroundService", "onDestroy " + this.f9903W);
        C0767r3 r3Var = this.f9904X;
        if (r3Var != null) {
            r3Var.b();
        }
        d();
        e();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i8) {
        if (intent == null) {
            if (this.f9901U.P1().booleanValue() || ((c) this.f9901U.f9767W).n("restartAfterUpdate", true)) {
                Log.i("ForegroundService", "Received null intent, restarting app after crash/kill in another 1000 ms...");
                C0794w0.q0(1, "ForegroundService", "The foreground service has restarted, will try to restart the activity...");
                CrashTestReceiver.f10932a = true;
                d.h(this, "App Killed", 1000);
            }
            return 1;
        } else if (intent.getAction() == null) {
            Log.w("ForegroundService", "Foreground service called with null action");
            return 1;
        } else if (intent.getAction().equals("com.fullykiosk.singleapp.action.kill_main_process")) {
            int intExtra = intent.getIntExtra("processId", -1);
            if (intExtra != -1) {
                Log.w("ForegroundService", "Going to Kill Main Process for processId " + intExtra);
                C0794w0.q0(1, "ForegroundService", "Going to Kill Main Process for processId " + intExtra);
                Process.killProcess(intExtra);
            }
            return 1;
        } else if (intent.getAction().equals("com.fullykiosk.singleapp.action.process_started")) {
            int intExtra2 = intent.getIntExtra("processId", -1);
            if (intExtra2 != -1) {
                Log.i("ForegroundService", "Main process ID " + intExtra2);
                f9900d0 = intExtra2;
            }
            return 1;
        } else {
            if (intent.getAction().equals("com.fullykiosk.singleapp.action.start_foreground")) {
                Log.i("ForegroundService", "Received Start " + this.f9903W + " Intent");
                c();
                C0767r3 r3Var = this.f9904X;
                if (r3Var != null) {
                    r3Var.e();
                }
                d();
                Intent intent2 = new Intent(this, MainActivity.class);
                intent2.setAction("com.fullykiosk.singleapp.action.notification_click");
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, 67108864);
                Notification.Builder builder = new Notification.Builder(this);
                builder.setContentTitle(getResources().getString(2131951646)).setTicker(getResources().getString(2131951646)).setContentText(this.f9902V).setSmallIcon(2131230974).setContentIntent(activity).setOngoing(true);
                builder.setColor(getResources().getColor(2131099714));
                if (a.B0()) {
                    ((NotificationManager) getSystemService("notification")).createNotificationChannel(h.c());
                    builder.setChannelId("4565");
                }
                try {
                    if (f(this)) {
                        startForeground(8989, builder.build());
                    }
                } catch (Exception e) {
                    g.x(e, new StringBuilder("Failed to start foreground service due to "), "ForegroundService");
                }
            } else if (intent.getAction().equals("com.fullykiosk.singleapp.action.stop_foreground")) {
                Log.i("ForegroundService", "Received Stop " + this.f9903W + " Intent");
                if (f(this)) {
                    stopForeground(true);
                }
                stopSelf(i8);
            }
            return 1;
        }
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        if (intent == null || intent.getComponent() == null || !intent.getComponent().getClassName().equals(FullyActivity.class.getName())) {
            if (intent != null) {
                a.o0(intent);
            }
        } else if (this.f9901U.c0().booleanValue()) {
            Log.i("ForegroundService", "onTaskRemoved: " + a.o0(intent));
            C0794w0.q0(0, "ForegroundService", "Task removed, will try to restart everything...");
            a("Task removed", 1000);
        } else {
            stopForeground(true);
            stopSelf();
        }
    }
}
