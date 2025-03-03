package v6;

import java.util.concurrent.TimeUnit;
import l6.d;
import l6.e;
import m6.a;
import m6.b;
import o6.C1326b;

/* renamed from: v6.a  reason: case insensitive filesystem */
public final class C1562a extends e {

    /* renamed from: U  reason: collision with root package name */
    public final a f16088U;

    /* renamed from: V  reason: collision with root package name */
    public final a f16089V;

    /* renamed from: W  reason: collision with root package name */
    public final C1564c f16090W;

    /* renamed from: X  reason: collision with root package name */
    public volatile boolean f16091X;

    public C1562a(C1564c cVar) {
        this.f16090W = cVar;
        a aVar = new a(1);
        a aVar2 = new a(0);
        this.f16088U = aVar2;
        a aVar3 = new a(1);
        this.f16089V = aVar3;
        aVar3.a(aVar);
        aVar3.a(aVar2);
    }

    public final b a(d dVar, TimeUnit timeUnit) {
        if (this.f16091X) {
            return C1326b.f14277U;
        }
        return this.f16090W.b(dVar, timeUnit, this.f16088U);
    }

    public final void d() {
        if (!this.f16091X) {
            this.f16091X = true;
            this.f16089V.d();
        }
    }
}
