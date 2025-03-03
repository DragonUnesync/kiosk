package p1;

import M0.C0122j;
import P0.r;
import java.io.EOFException;

public final class n implements G {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14418a = new byte[4096];

    public final /* synthetic */ void a(int i, r rVar) {
        E.c(this, rVar, i);
    }

    public final int b(C0122j jVar, int i, boolean z) {
        return d(jVar, i, z);
    }

    public final void c(M0.r rVar) {
    }

    public final int d(C0122j jVar, int i, boolean z) {
        byte[] bArr = this.f14418a;
        int x8 = jVar.x(bArr, 0, Math.min(bArr.length, i));
        if (x8 != -1) {
            return x8;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(long j7, int i, int i8, int i9, F f8) {
    }

    public final void f(r rVar, int i, int i8) {
        rVar.I(i);
    }
}
