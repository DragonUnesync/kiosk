package O5;

import A.d;
import B3.q;
import Z1.c;
import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import d4.k;
import de.ozerov.fully.C0723k0;
import de.ozerov.fully.C0726k3;
import de.ozerov.fully.C0752p;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.D2;
import de.ozerov.fully.DeviceOwnerReceiver;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.G2;
import de.ozerov.fully.P;

public final class a extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final String f3661b = C0726k3.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public FullyActivity f3662a;

    public final void onReceive(Context context, Intent intent) {
        long j7;
        if (intent != null && intent.getExtras() != null) {
            k kVar = new k(context, 1);
            String str = (String) intent.getExtras().getSerializable("alarmType");
            if (str != null) {
                boolean equals = str.equals("wakeup");
                String str2 = f3661b;
                if (equals) {
                    if (!((c) kVar.f9767W).n("keepSleepingIfUnplugged", false) || P.H(context)) {
                        q.s0(context, true, false);
                        FullyActivity fullyActivity = this.f3662a;
                        fullyActivity.f9911B0.w0("wakeup", C0726k3.a(fullyActivity));
                        this.f3662a.f9944g1.e();
                        n2.a.b1(context, "Wakeup Time");
                        C0794w0.q0(0, str2, "Scheduled Wakeup");
                        G2 g22 = this.f3662a.f9949l1;
                        k kVar2 = g22.f9967b;
                        if (kVar2.c0().booleanValue() && kVar2.g2().booleanValue() && !kVar2.e2().isEmpty() && ((c) kVar2.f9767W).n("singleAppPauseForUpdates", false)) {
                            FullyActivity fullyActivity2 = g22.f9966a;
                            if (fullyActivity2.f9921J0.i()) {
                                g22.f9971g = true;
                                fullyActivity2.f9919H0.b();
                                g22.d();
                                Handler handler = g22.f9973j;
                                if (handler != null) {
                                    handler.removeCallbacksAndMessages((Object) null);
                                    g22.f9973j = null;
                                }
                                Handler handler2 = new Handler();
                                g22.f9973j = handler2;
                                D2 d22 = new D2(g22, 4);
                                try {
                                    j7 = Long.parseLong(((c) kVar2.f9767W).r("singleAppUpdatingModeDuration", "900"));
                                } catch (Exception unused) {
                                    j7 = 900;
                                }
                                handler2.postDelayed(d22, j7 * 1000);
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (str.equals("sleep")) {
                    FullyActivity fullyActivity3 = this.f3662a;
                    fullyActivity3.f9911B0.w0("sleep", C0726k3.a(fullyActivity3));
                    this.f3662a.f9944g1.d(500);
                    C0794w0.q0(0, str2, "Scheduled Sleep");
                }
                if (str.equals("reboot")) {
                    this.f3662a.f9911B0.v0("reboot", ((c) kVar.f9767W).r("rebootTime", ""));
                    if (!kVar.Q1().booleanValue() || !P.f10240j) {
                        Log.w(str2, "Can't reboot as not rooted");
                    } else {
                        Log.i(str2, "Rebooting...");
                        this.f3662a.f9919H0.d(true);
                        P.K();
                    }
                }
                if (str.equals("mdmReboot")) {
                    this.f3662a.f9911B0.v0("mdmReboot", ((c) kVar.f9767W).r("mdmRebootTime", ""));
                    if (C0794w0.Z(this.f3662a) && n2.a.z0()) {
                        Log.i(str2, "Rebooting...");
                        ((DevicePolicyManager) this.f3662a.getSystemService("device_policy")).reboot(DeviceOwnerReceiver.a(this.f3662a));
                    }
                }
                if (str.equals("mdmApkUpdate")) {
                    this.f3662a.f9911B0.v0("mdmApkUpdate", ((c) kVar.f9767W).r("mdmApkToInstallTime", ""));
                    if (C0794w0.Z(this.f3662a)) {
                        Log.i(str2, "Checking APK files for updates...");
                        C0752p.e(this.f3662a);
                    }
                }
                if (str.equals("folderCleanup")) {
                    this.f3662a.f9911B0.v0("folderCleanup", ((c) kVar.f9767W).r("folderCleanupTime", ""));
                    Log.i(str2, "Folder cleanup time...");
                    q qVar = new q((Context) this.f3662a);
                    qVar.e(((c) kVar.f9767W).n("useFullWakelockForKeepalive", false));
                    C0723k0.b(this.f3662a, new d(26, qVar));
                }
            }
        }
    }
}
