package de.ozerov.fully;

import android.content.Context;
import android.os.Handler;
import d4.k;

/* renamed from: de.ozerov.fully.g4  reason: case insensitive filesystem */
public final class C0703g4 {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10649a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10650b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f10651c = new Handler();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f10652d = new Handler();
    public final C0697f4 e = new C0697f4(this, 0);

    /* renamed from: f  reason: collision with root package name */
    public long f10653f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f10654g = new Handler();

    /* renamed from: h  reason: collision with root package name */
    public final Handler f10655h;
    public final Handler i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f10656j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f10657k;

    public C0703g4(FullyActivity fullyActivity) {
        new C0697f4(this, 1);
        this.f10655h = new Handler();
        this.i = new Handler();
        this.f10656j = new Handler();
        this.f10657k = new Handler();
        this.f10649a = fullyActivity;
        this.f10650b = new k((Context) fullyActivity, 1);
    }

    public final void a() {
        int i8;
        Handler handler = this.i;
        handler.removeCallbacksAndMessages((Object) null);
        k kVar = this.f10650b;
        if (kVar.o2() > 0) {
            i8 = kVar.o2();
        } else {
            i8 = kVar.p1();
        }
        if (i8 > 0 && kVar.c0().booleanValue() && kVar.g2().booleanValue() && !kVar.e2().isEmpty()) {
            handler.postDelayed(new C0691e4(this, 1), ((long) i8) * 1000);
        }
    }

    public final void b() {
        Handler handler = this.f10657k;
        handler.removeCallbacksAndMessages((Object) null);
        int p22 = this.f10650b.p2();
        if (p22 > 0) {
            handler.postDelayed(new C0691e4(this, 2), ((long) p22) * 1000);
        }
    }

    public final void c() {
        Handler handler = this.f10656j;
        handler.removeCallbacksAndMessages((Object) null);
        int q22 = this.f10650b.q2();
        if (q22 > 0) {
            handler.postDelayed(new C0691e4(this, 0), ((long) q22) * 1000);
        }
    }

    public final void d() {
        Handler handler = this.f10651c;
        handler.removeCallbacksAndMessages((Object) null);
        k kVar = this.f10650b;
        if (kVar.H1() > 0) {
            handler.postDelayed(this.e, ((long) kVar.H1()) * 1000);
        }
    }
}
