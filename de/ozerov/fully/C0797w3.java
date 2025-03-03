package de.ozerov.fully;

import L0.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import d4.k;
import n2.a;

/* renamed from: de.ozerov.fully.w3  reason: case insensitive filesystem */
public final class C0797w3 {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f11041k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f11042a;

    /* renamed from: b  reason: collision with root package name */
    public final k f11043b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11044c = false;

    /* renamed from: d  reason: collision with root package name */
    public final C0785u3 f11045d;
    public final C0785u3 e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11046f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f11047g;

    /* renamed from: h  reason: collision with root package name */
    public final C0791v3 f11048h;
    public final Handler i;

    /* renamed from: j  reason: collision with root package name */
    public final C0791v3 f11049j;

    public C0797w3(FullyActivity fullyActivity) {
        C0785u3 u3Var = new C0785u3(this, 0);
        this.f11045d = u3Var;
        C0785u3 u3Var2 = new C0785u3(this, 1);
        this.e = u3Var2;
        this.f11046f = false;
        this.f11047g = new Handler();
        this.f11048h = new C0791v3(this, 0);
        this.i = new Handler();
        this.f11049j = new C0791v3(this, 1);
        this.f11042a = fullyActivity;
        this.f11043b = new k((Context) fullyActivity, 1);
        c.a(fullyActivity).b(u3Var, new IntentFilter("com.fullykiosk.singleapp.event.screensaver_start"));
        c.a(fullyActivity).b(u3Var2, new IntentFilter("com.fullykiosk.singleapp.event.screensaver_stop"));
    }

    public final void a() {
        k kVar = this.f11043b;
        boolean n4 = ((Z1.c) kVar.f9767W).n("reloadOnScreensaverStop", false);
        FullyActivity fullyActivity = this.f11042a;
        if (n4) {
            fullyActivity.f9951n1.a();
        }
        c();
        fullyActivity.f9945h1.c();
        C0794w0.A0(fullyActivity, kVar.Z1().booleanValue(), kVar.c2().booleanValue());
    }

    public final void b() {
        Handler handler = this.i;
        handler.removeCallbacksAndMessages((Object) null);
        k kVar = this.f11043b;
        if (kVar.r2() > 0) {
            handler.postDelayed(this.f11049j, ((long) kVar.r2()) * 1000);
        }
    }

    public final void c() {
        Handler handler = this.f11047g;
        handler.removeCallbacksAndMessages((Object) null);
        k kVar = this.f11043b;
        if (((Z1.c) kVar.f9767W).n("screensaverEnabled", true) && kVar.s2() > 0) {
            handler.postDelayed(this.f11048h, ((long) kVar.s2()) * 1000);
        }
    }

    public final void d() {
        FullyActivity fullyActivity = this.f11042a;
        if (C0794w0.g0(fullyActivity)) {
            fullyActivity.moveTaskToBack(true);
        }
        fullyActivity.f9948k1.z("com.android.systemui");
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName("com.android.systemui", "com.android.systemui.Somnambulator");
        fullyActivity.f9919H0.k(a.o0(intent));
        fullyActivity.f9960y1.e(false, false);
    }

    public final void e() {
        if (!this.f11044c && this.f11042a.w()) {
            Class<ScreensaverActivity> cls = ScreensaverActivity.class;
            if (!this.f11042a.f10981v0) {
                Intent intent = new Intent(this.f11042a, cls);
                intent.putExtra("isKioskLocked", this.f11042a.f9921J0.i());
                intent.setFlags(65536);
                intent.addFlags(268435456);
                this.f11042a.startActivity(intent);
                this.f11042a.overridePendingTransition(0, 0);
            } else {
                this.f11042a.f9919H0.k(a.o0(new Intent(this.f11042a, cls)));
            }
            this.f11042a.f9960y1.e(false, false);
        }
    }

    public final void f() {
        if (this.f11044c) {
            c.a(this.f11042a).c(new Intent("com.fullykiosk.singleapp.action.stop_screensaver"));
        }
        g();
    }

    public final void g() {
        k kVar = this.f11043b;
        if (kVar.T1().booleanValue() && !kVar.U1().isEmpty()) {
            FullyActivity fullyActivity = this.f11042a;
            if ((fullyActivity.getApplicationContext() instanceof MyApplication) && ((MyApplication) fullyActivity.getApplicationContext()).f10112a0.isEmpty()) {
                String r8 = C0794w0.r(fullyActivity);
                String str = "";
                try {
                    Intent P02 = a.P0(kVar.U1());
                    str = P02.getPackage();
                    if (str == null) {
                        str = P02.getComponent().getPackageName();
                    }
                } catch (Exception unused) {
                    Log.w("w3", "Could not get target app from screensaver intent URL");
                }
                if (r8 == null || r8.equals(str)) {
                    fullyActivity.f9919H0.b();
                }
            }
        }
    }
}
