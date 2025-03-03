package U;

import A.f;
import B.q0;
import D.C0047h0;
import D.C0069x;
import D.C0070y;
import D.O;
import D7.b;
import G.h;
import G.i;
import Q0.g;
import T0.C0233z;
import Z1.c;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.util.Range;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import b3.C0528a;
import d4.k;
import de.ozerov.fully.C0680d;
import de.ozerov.fully.C0723k0;
import de.ozerov.fully.C0747o0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.ForegroundService;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.HelperService;
import de.ozerov.fully.MainActivity;
import de.ozerov.fully.P;
import h1.C1030A;
import h1.C1049o;
import java.util.ArrayList;
import java.util.HashMap;
import k2.C1160q;
import n2.a;
import p1.m;
import u.C1467h;
import u.C1477r;
import u.b0;
import u.d0;

public final class d implements C0047h0 {

    /* renamed from: U  reason: collision with root package name */
    public boolean f5256U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f5257V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f5258W;

    /* renamed from: X  reason: collision with root package name */
    public Object f5259X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f5260Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f5261Z;

    public d(FullyActivity fullyActivity) {
        this.f5257V = fullyActivity;
        this.f5258W = new k((Context) fullyActivity, 1);
    }

    public static void h(Context context, String str, long j7) {
        k kVar = new k(context, 1);
        if (!a.p0() || Settings.canDrawOverlays(context)) {
            Log.i("ActivityHelper", "Restarting after ".concat(str));
        } else {
            Log.w("ActivityHelper", "Restarting after " + str + ", may fail due to background starts restriction");
        }
        try {
            if (!kVar.c0().booleanValue() || !kVar.C().booleanValue()) {
                Class<MainActivity> cls = MainActivity.class;
                if (j7 == 0) {
                    Intent intent = new Intent(context, cls);
                    intent.setFlags(268435456);
                    intent.putExtra("reason", str);
                    context.startActivity(intent);
                    return;
                }
                Intent intent2 = new Intent(context, cls);
                intent2.setFlags(268435456);
                intent2.putExtra("reason", str);
                ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + j7, PendingIntent.getActivity(context, 2323, intent2, 335544320));
                return;
            }
            C0528a.p(context, str);
        } catch (Exception e) {
            g.x(e, g.s("Restart by ", str, " failed due to "), "ActivityHelper");
        }
    }

    public void H(Object obj) {
        C0070y yVar = (C0070y) obj;
        C0070y yVar2 = C0070y.f969Z;
        j jVar = j.f5282U;
        if (yVar == yVar2 || yVar == C0070y.f967X || yVar == C0070y.f966W || yVar == C0070y.f965V) {
            o(jVar);
            if (this.f5256U) {
                this.f5256U = false;
                G.d dVar = (G.d) this.f5261Z;
                if (dVar != null) {
                    dVar.cancel(false);
                    this.f5261Z = null;
                }
            }
        } else if ((yVar == C0070y.f970a0 || yVar == C0070y.f971b0 || yVar == C0070y.f968Y) && !this.f5256U) {
            o(jVar);
            ArrayList arrayList = new ArrayList();
            C0069x xVar = (C0069x) this.f5257V;
            G.d a8 = G.d.a(com.bumptech.glide.d.i(new O(this, xVar, arrayList, 3)));
            b bVar = new b(this);
            F.a l8 = b.l();
            a8.getClass();
            G.b f8 = i.f(a8, bVar, l8);
            b bVar2 = new b(this);
            G.b f9 = i.f(f8, new f(20, (Object) bVar2), b.l());
            this.f5261Z = f9;
            q0 q0Var = new q0(this, arrayList, xVar, 17, false);
            f9.d(new h(f9, 0, q0Var), b.l());
            this.f5256U = true;
        }
    }

    public void a(Throwable th) {
        G.d dVar = (G.d) this.f5261Z;
        if (dVar != null) {
            dVar.cancel(false);
            this.f5261Z = null;
        }
        o(j.f5282U);
    }

    public void b() {
        try {
            m();
        } catch (Exception unused) {
            c();
        }
    }

    public boolean c() {
        FullyActivity fullyActivity = (FullyActivity) this.f5257V;
        if (fullyActivity.getTaskId() != -1) {
            try {
                ((ActivityManager) fullyActivity.getApplicationContext().getSystemService("activity")).moveTaskToFront(fullyActivity.getTaskId(), 2);
                return true;
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to bring my task to foreground due to "), "ActivityHelper");
            }
        }
        return false;
    }

    public void d(boolean z) {
        if (!this.f5256U) {
            k kVar = (k) this.f5258W;
            boolean booleanValue = kVar.K().booleanValue();
            FullyActivity fullyActivity = (FullyActivity) this.f5257V;
            if (booleanValue) {
                a.b1(fullyActivity, "Exiting...");
            }
            Log.i("ActivityHelper", "Exiting...");
            C0794w0.q0(0, "ActivityHelper", "Exit app");
            this.f5256U = true;
            kVar.R2("isRunning", false);
            if (z) {
                n();
            }
            String r8 = ((c) kVar.f9767W).r("defaultLauncher", "");
            if (!r8.isEmpty()) {
                fullyActivity.f9948k1.z(r8.split("/")[0]);
            }
            fullyActivity.f9921J0.d();
            fullyActivity.finish();
        }
    }

    public void e(String str, C0747o0 o0Var) {
        if (P.f10240j) {
            for (String str2 : a.e1(((c) ((k) this.f5258W).f9767W).r("killAppsBeforeStartingList", ""))) {
                if (str.equalsIgnoreCase(str2)) {
                    C0723k0 k0Var = new C0723k0();
                    k0Var.f10766b = C1477r.d("am force-stop ", str2);
                    k0Var.f10767c = o0Var;
                    k0Var.execute(new Void[0]);
                    return;
                }
            }
        }
        o0Var.run();
    }

    public G3.i f(int i) {
        G3.i iVar;
        HashMap hashMap = (HashMap) this.f5258W;
        G3.i iVar2 = (G3.i) hashMap.get(Integer.valueOf(i));
        if (iVar2 != null) {
            return iVar2;
        }
        A1.d dVar = (A1.d) this.f5260Y;
        dVar.getClass();
        Class<C1030A> cls = C1030A.class;
        if (i == 0) {
            iVar = new C1049o(DashMediaSource$Factory.class.asSubclass(cls), dVar, 0);
        } else if (i == 1) {
            iVar = new C1049o(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls), dVar, 1);
        } else if (i == 2) {
            iVar = new C1049o(HlsMediaSource$Factory.class.asSubclass(cls), dVar, 2);
        } else if (i == 3) {
            iVar = new C0233z(1, RtspMediaSource$Factory.class.asSubclass(cls));
        } else if (i == 4) {
            iVar = new C1049o(this, dVar, 3);
        } else {
            throw new IllegalArgumentException(g.m(i, "Unrecognized contentType: "));
        }
        hashMap.put(Integer.valueOf(i), iVar);
        return iVar;
    }

    public void g() {
        k kVar = (k) this.f5258W;
        FullyActivity fullyActivity = (FullyActivity) this.f5257V;
        try {
            ((AlarmManager) fullyActivity.getSystemService("alarm")).set(0, System.currentTimeMillis() + kVar.o(), PendingIntent.getActivity(fullyActivity, 123456, new Intent(fullyActivity, MainActivity.class), 335544320));
            if (a.p0()) {
                if (!Settings.canDrawOverlays(fullyActivity)) {
                    Log.w("ActivityHelper", "Restarting app in " + kVar.o() + " ms, however will likely fail due to background starts restriction");
                    d(false);
                }
            }
            Log.i("ActivityHelper", "Restarting app in " + kVar.o() + " ms");
        } catch (Exception e) {
            g.x(e, new StringBuilder("Failed to set an alarm for app restart due to "), "ActivityHelper");
        }
        d(false);
    }

    public synchronized void i() {
        try {
            if (((Handler) this.f5261Z) == null) {
                if (!c()) {
                    b();
                }
                Handler handler = new Handler();
                this.f5261Z = handler;
                handler.postDelayed(new C0680d(this, 1), 1000);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void j() {
        if (((c) ((k) this.f5258W).f9767W).n("runInForeground", false) ||
                ((k) this.f5258W).J1().booleanValue() ||
                ((k) this.f5258W).s1().booleanValue() ||
                ((((k) this.f5258W).u().booleanValue() &&
                        ((k) this.f5258W).J1().booleanValue()) ||
                        ((c) ((k) this.f5258W).f9767W).n("restartAfterUpdate", true) ||
                        ((k) this.f5258W).N1().booleanValue() ||
                        N5.k.e((FullyActivity) this.f5257V) ||
                        a.B0())) {
            Intent intent = new Intent((FullyActivity) this.f5257V, ForegroundService.class);
            intent.setAction("com.fullykiosk.singleapp.action.start_foreground");
            try {
                if (!a.B0() || !ForegroundService.f((FullyActivity) this.f5257V)) {
                    ((FullyActivity) this.f5257V).startService(intent);
                } else {
                    ((FullyActivity) this.f5257V).startForegroundService(intent);
                }
                Log.i("ActivityHelper", "startForegroundService called, isActive: " + ((FullyActivity) this.f5257V).f10980u0);
            } catch (Exception e) {
                a.b1((FullyActivity) this.f5257V, "Failed to start foreground service");
                g.x(e, new StringBuilder("Failed to start foreground service due to "), "ActivityHelper");
            }
        } else {
            n();
        }
    }

    public void k(String str) {
        FullyActivity fullyActivity = (FullyActivity) this.f5257V;
        try {
            Intent intent = new Intent(fullyActivity, HelperService.class);
            intent.putExtra("isKioskLocked", fullyActivity.f9921J0.i());
            intent.putExtra("intentUrl", str);
            intent.setAction("com.fullykiosk.singleapp.action.start_activity_from_service");
            fullyActivity.startService(intent);
        } catch (Exception e) {
            Log.e("ActivityHelper", "Failed to start the helper service due to " + e.getMessage());
            a.b1(fullyActivity, "Failed to start helper service");
        }
    }

    public void l() {
        FullyActivity fullyActivity = (FullyActivity) this.f5257V;
        k kVar = (k) this.f5258W;
        if (!((c) kVar.f9767W).r("appToRunInForegroundOnStart", "").isEmpty()) {
            String r8 = ((c) kVar.f9767W).r("appToRunInForegroundOnStart", "");
            try {
                fullyActivity.startActivity(C0794w0.F(fullyActivity, r8));
            } catch (Exception unused) {
                Log.w("ActivityHelper", "Can't start package " + r8);
                a.b1(fullyActivity, "Failed to start " + r8);
            }
        }
    }

    public void m() {
        FullyActivity fullyActivity = (FullyActivity) this.f5257V;
        Intent intent = new Intent(fullyActivity, HelperService.class);
        intent.putExtra("taskId", fullyActivity.getTaskId());
        intent.putExtra("isKioskLocked", fullyActivity.f9921J0.i());
        intent.putExtra("isLauncher", fullyActivity.f9954q1);
        intent.setAction("com.fullykiosk.singleapp.action.bring_to_foreground");
        fullyActivity.startService(intent);
    }

    public void n() {
        Intent intent = new Intent((FullyActivity) this.f5257V, ForegroundService.class);
        intent.setAction("com.fullykiosk.singleapp.action.stop_foreground");
        ((FullyActivity) this.f5257V).stopService(intent);
        Log.i("ActivityHelper", "stopForegroundService called, isActive: " + ((FullyActivity) this.f5257V).f10980u0);
    }

    public void o(j jVar) {
        synchronized (this) {
            try {
                if (!((j) this.f5259X).equals(jVar)) {
                    this.f5259X = jVar;
                    F.h.j("StreamStateObserver", "Update Preview stream state to " + jVar);
                    ((z) this.f5258W).k(jVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public d(C0069x xVar, z zVar, k kVar) {
        this.f5256U = false;
        this.f5257V = xVar;
        this.f5258W = zVar;
        this.f5260Y = kVar;
        synchronized (this) {
            this.f5259X = (j) zVar.d();
        }
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [D2.G, java.lang.Object] */
    public d(C1467h hVar, v.k kVar, F.i iVar) {
        C1160q qVar;
        Range range;
        this.f5256U = false;
        this.f5261Z = new b0(this);
        this.f5257V = hVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) kVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e) {
                F.h.J("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                ? obj = new Object();
                boolean z = false;
                obj.f1051U = false;
                obj.f1052V = (Range) kVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
                if (Build.VERSION.SDK_INT >= 34) {
                    C1160q qVar2 = kVar.f15855b;
                    int[] iArr = (int[]) ((CameraCharacteristics) qVar2.f13026V).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
                    if (iArr != null) {
                        int length = iArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (iArr[i] == 1) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                obj.f1051U = z;
                qVar = obj;
                this.f5260Y = qVar;
                d0 d0Var = new d0(qVar.o(), qVar.y());
                this.f5259X = d0Var;
                d0Var.e();
                this.f5258W = new x(new H.b(d0Var.d(), d0Var.b(), d0Var.c(), d0Var.a()));
                hVar.b((b0) this.f5261Z);
            }
        }
        qVar = new C1160q(18, (Object) kVar);
        this.f5260Y = qVar;
        d0 d0Var2 = new d0(qVar.o(), qVar.y());
        this.f5259X = d0Var2;
        d0Var2.e();
        this.f5258W = new x(new H.b(d0Var2.d(), d0Var2.b(), d0Var2.c(), d0Var2.a()));
        hVar.b((b0) this.f5261Z);
    }

    public d(m mVar, K1.i iVar) {
        this.f5257V = mVar;
        this.f5261Z = iVar;
        this.f5258W = new HashMap();
        this.f5259X = new HashMap();
        this.f5256U = true;
    }
}
