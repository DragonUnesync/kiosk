package e7;

import Z6.b;
import c7.m;
import l7.f;
import l7.j;
import l7.o;
import l7.u;
import l7.y;

/* renamed from: e7.e  reason: case insensitive filesystem */
public final class C0870e implements u {

    /* renamed from: U  reason: collision with root package name */
    public final j f11286U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f11287V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ m f11288W;

    public C0870e(m mVar) {
        this.f11288W = mVar;
        this.f11286U = new j(((o) mVar.e).f13232U.a());
    }

    public final y a() {
        return this.f11286U;
    }

    public final void close() {
        if (!this.f11287V) {
            this.f11287V = true;
            m mVar = this.f11288W;
            mVar.getClass();
            j jVar = this.f11286U;
            y yVar = jVar.e;
            jVar.e = y.f13251d;
            yVar.a();
            yVar.b();
            mVar.f8959a = 3;
        }
    }

    public final void flush() {
        if (!this.f11287V) {
            ((o) this.f11288W.e).flush();
        }
    }

    public final void h(f fVar, long j7) {
        if (!this.f11287V) {
            long j8 = fVar.f13216V;
            byte[] bArr = b.f6982a;
            if (j7 < 0 || 0 > j8 || j8 < j7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            ((o) this.f11288W.e).h(fVar, j7);
            return;
        }
        throw new IllegalStateException("closed");
    }
}
