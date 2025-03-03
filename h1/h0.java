package h1;

import M0.C;
import M0.X;
import P0.z;
import R0.A;
import android.os.Handler;

public abstract class h0 extends C1045k {

    /* renamed from: k  reason: collision with root package name */
    public final C1035a f12482k;

    public h0(C1035a aVar) {
        this.f12482k = aVar;
    }

    public final void A() {
        x((Object) null, this.f12482k);
    }

    public void B() {
        A();
    }

    public final X g() {
        return this.f12482k.g();
    }

    public final C h() {
        return this.f12482k.h();
    }

    public final boolean i() {
        return this.f12482k.i();
    }

    public final void l(A a8) {
        this.f12491j = a8;
        this.i = z.m((Handler.Callback) null);
        B();
    }

    public void s(C c8) {
        this.f12482k.s(c8);
    }

    public final C1031B t(Object obj, C1031B b8) {
        Void voidR = (Void) obj;
        return y(b8);
    }

    public final long u(Object obj, long j7) {
        Void voidR = (Void) obj;
        return j7;
    }

    public final int v(int i, Object obj) {
        Void voidR = (Void) obj;
        return i;
    }

    public final void w(Object obj, C1035a aVar, X x8) {
        Void voidR = (Void) obj;
        z(x8);
    }

    public C1031B y(C1031B b8) {
        return b8;
    }

    public abstract void z(X x8);
}
