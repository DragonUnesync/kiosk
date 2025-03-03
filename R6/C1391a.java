package r6;

import com.bumptech.glide.g;
import java.util.concurrent.atomic.AtomicReference;
import l6.C1180a;
import l6.f;
import m6.b;
import o6.C1325a;

/* renamed from: r6.a  reason: case insensitive filesystem */
public final class C1391a extends AtomicReference implements C1180a, b, Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final C1180a f14950U;

    /* renamed from: V  reason: collision with root package name */
    public final f f14951V;

    /* renamed from: W  reason: collision with root package name */
    public g f14952W;

    public C1391a(C1180a aVar, f fVar) {
        this.f14950U = aVar;
        this.f14951V = fVar;
    }

    public final void a(Throwable th) {
        this.f14952W = (g) th;
        C1325a.b(this, this.f14951V.b(this));
    }

    public final void b() {
        C1325a.b(this, this.f14951V.b(this));
    }

    public final void c(b bVar) {
        if (C1325a.c(this, bVar)) {
            this.f14950U.c(this);
        }
    }

    public final void d() {
        C1325a.a(this);
    }

    public final void run() {
        g gVar = this.f14952W;
        C1180a aVar = this.f14950U;
        if (gVar != null) {
            this.f14952W = null;
            aVar.a(gVar);
            return;
        }
        aVar.b();
    }
}
