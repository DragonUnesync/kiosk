package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.widget.FrameLayout;
import d4.k;
import n2.a;

public final class Y3 {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10514a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10515b;

    /* renamed from: c  reason: collision with root package name */
    public final k f10516c;

    /* renamed from: d  reason: collision with root package name */
    public int f10517d = 0;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f10518f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f10519g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f10520h = 7;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f10521j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10522k = false;

    /* renamed from: l  reason: collision with root package name */
    public Handler f10523l;

    public Y3(FullyActivity fullyActivity) {
        this.f10514a = fullyActivity;
        this.f10515b = new k((Context) fullyActivity, 1);
        k kVar = new k(3, (Object) fullyActivity);
        this.f10516c = kVar;
        kVar.f9768X = new X3(this, 0);
    }

    public final boolean a() {
        k kVar = this.f10515b;
        if (!((c) kVar.f9767W).n("remoteAdminSingleAppExit", false) || !kVar.J1().booleanValue() || !((c) kVar.f9767W).n("remoteAdminLan", true) || kVar.K1().isEmpty()) {
            return false;
        }
        return true;
    }

    public final void b() {
        int i8;
        this.f10520h = this.f10515b.m2();
        k kVar = this.f10515b;
        kVar.getClass();
        try {
            i8 = Integer.parseInt(((c) kVar.f9767W).r("millisScreenOnToPinDialogInSingleAppMode", ""));
        } catch (Exception unused) {
            i8 = 0;
        }
        this.i = i8;
        this.f10522k = this.f10515b.b0().equals(this.f10514a.getResources().getString(2131951778));
        k kVar2 = this.f10516c;
        k kVar3 = this.f10515b;
        if ((kVar3.c0().booleanValue() && ((kVar3.g2().booleanValue() && !a()) || this.f10515b.b0().equals(this.f10514a.getResources().getString(2131951778)))) || kVar3.q2() > 0 || kVar3.o2() > 0 || kVar3.p1() > 0 || ((c) kVar3.f9767W).n("touchesOtherAppsBreakIdle", false)) {
            kVar2.getClass();
            if (!a.y0() || Settings.canDrawOverlays((FullyActivity) kVar2.f9766V)) {
                synchronized (kVar2) {
                    try {
                        if (((C0767r3) kVar2.f9767W) == null) {
                            FrameLayout frameLayout = new FrameLayout((FullyActivity) kVar2.f9766V);
                            frameLayout.setOnTouchListener(new C3.k(5, kVar2));
                            C0767r3 r3Var = new C0767r3((FullyActivity) kVar2.f9766V);
                            kVar2.f9767W = r3Var;
                            r3Var.h(frameLayout);
                            C0767r3 r3Var2 = (C0767r3) kVar2.f9767W;
                            r3Var2.f10920j = 8388693;
                            r3Var2.f10916d = false;
                            r3Var2.e = true;
                            r3Var2.f10917f = true;
                            r3Var2.f10921k = true;
                            r3Var2.f10918g = 1;
                            r3Var2.f10919h = 1;
                            r3Var2.f10926p = "snifferPixel";
                        }
                        ((C0767r3) kVar2.f9767W).j();
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        kVar2.G2();
    }
}
