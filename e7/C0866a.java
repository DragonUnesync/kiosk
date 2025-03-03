package e7;

import c7.m;
import java.io.IOException;
import l7.f;
import l7.j;
import l7.q;
import l7.w;
import l7.y;

/* renamed from: e7.a  reason: case insensitive filesystem */
public abstract class C0866a implements w {

    /* renamed from: U  reason: collision with root package name */
    public final j f11274U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f11275V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ m f11276W;

    public C0866a(m mVar) {
        this.f11276W = mVar;
        this.f11274U = new j(((q) mVar.f8962d).f13236U.a());
    }

    public final y a() {
        return this.f11274U;
    }

    public long f(f fVar, long j7) {
        m mVar = this.f11276W;
        P6.f.e(fVar, "sink");
        try {
            return ((q) mVar.f8962d).f(fVar, j7);
        } catch (IOException e) {
            ((c7.j) mVar.f8961c).l();
            k();
            throw e;
        }
    }

    public final void k() {
        m mVar = this.f11276W;
        int i = mVar.f8959a;
        if (i != 6) {
            if (i == 5) {
                j jVar = this.f11274U;
                y yVar = jVar.e;
                jVar.e = y.f13251d;
                yVar.a();
                yVar.b();
                mVar.f8959a = 6;
                return;
            }
            throw new IllegalStateException("state: " + mVar.f8959a);
        }
    }
}
