package e7;

import c7.m;
import l7.f;
import l7.j;
import l7.o;
import l7.u;
import l7.y;

/* renamed from: e7.b  reason: case insensitive filesystem */
public final class C0867b implements u {

    /* renamed from: U  reason: collision with root package name */
    public final j f11277U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f11278V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ m f11279W;

    public C0867b(m mVar) {
        this.f11279W = mVar;
        this.f11277U = new j(((o) mVar.e).f13232U.a());
    }

    public final y a() {
        return this.f11277U;
    }

    public final synchronized void close() {
        if (!this.f11278V) {
            this.f11278V = true;
            ((o) this.f11279W.e).i("0\r\n\r\n");
            m mVar = this.f11279W;
            j jVar = this.f11277U;
            mVar.getClass();
            y yVar = jVar.e;
            jVar.e = y.f13251d;
            yVar.a();
            yVar.b();
            this.f11279W.f8959a = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.f11278V) {
            ((o) this.f11279W.e).flush();
        }
    }

    public final void h(f fVar, long j7) {
        if (this.f11278V) {
            throw new IllegalStateException("closed");
        } else if (j7 != 0) {
            m mVar = this.f11279W;
            o oVar = (o) mVar.e;
            if (!oVar.f13234W) {
                oVar.f13233V.A(j7);
                oVar.k();
                o oVar2 = (o) mVar.e;
                oVar2.i("\r\n");
                oVar2.h(fVar, j7);
                oVar2.i("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }
}
