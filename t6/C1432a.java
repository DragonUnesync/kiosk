package t6;

import java.util.concurrent.atomic.AtomicReference;
import l6.f;
import l6.g;
import m6.b;
import o6.C1325a;

/* renamed from: t6.a  reason: case insensitive filesystem */
public final class C1432a extends AtomicReference implements g, b, Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final g f15485U;

    /* renamed from: V  reason: collision with root package name */
    public final f f15486V;

    /* renamed from: W  reason: collision with root package name */
    public Object f15487W;

    /* renamed from: X  reason: collision with root package name */
    public Throwable f15488X;

    public C1432a(g gVar, f fVar) {
        this.f15485U = gVar;
        this.f15486V = fVar;
    }

    public final void a(Throwable th) {
        this.f15488X = th;
        C1325a.b(this, this.f15486V.b(this));
    }

    public final void c(b bVar) {
        if (C1325a.c(this, bVar)) {
            this.f15485U.c(this);
        }
    }

    public final void d() {
        C1325a.a(this);
    }

    public final void f(Object obj) {
        this.f15487W = obj;
        C1325a.b(this, this.f15486V.b(this));
    }

    public final void run() {
        Throwable th = this.f15488X;
        g gVar = this.f15485U;
        if (th != null) {
            gVar.a(th);
        } else {
            gVar.f(this.f15487W);
        }
    }
}
