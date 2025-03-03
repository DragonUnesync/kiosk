package androidx.fragment.app;

import F.h;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.v;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.t;
import b2.C0526e;
import b2.C0527f;
import h.C1022j;
import j0.m;
import j0.n;
import k0.d;
import k0.e;
import v0.C1537j;

/* renamed from: androidx.fragment.app.x  reason: case insensitive filesystem */
public final class C0472x extends h implements d, e, m, n, P, v, androidx.activity.result.h, C0527f, O, C1537j {

    /* renamed from: d0  reason: collision with root package name */
    public final C1022j f8092d0;

    /* renamed from: e0  reason: collision with root package name */
    public final C1022j f8093e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Handler f8094f0;

    /* renamed from: g0  reason: collision with root package name */
    public final L f8095g0 = new L();

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1022j f8096h0;

    public C0472x(C1022j jVar) {
        this.f8096h0 = jVar;
        Handler handler = new Handler();
        this.f8092d0 = jVar;
        this.f8093e0 = jVar;
        this.f8094f0 = handler;
    }

    public final C0526e a() {
        return (C0526e) this.f8096h0.f7291Y.f9082X;
    }

    public final void b() {
    }

    public final O d() {
        return this.f8096h0.d();
    }

    public final t e() {
        return this.f8096h0.f12213n0;
    }

    public final View y(int i) {
        return this.f8096h0.findViewById(i);
    }

    public final boolean z() {
        Window window = this.f8096h0.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }
}
