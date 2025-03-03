package h1;

import M0.C0129q;
import M0.r;
import R2.c;
import S0.f;

/* renamed from: h1.c  reason: case insensitive filesystem */
public final class C1037c implements Y {

    /* renamed from: U  reason: collision with root package name */
    public final Y f12439U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f12440V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C1038d f12441W;

    public C1037c(C1038d dVar, Y y8) {
        this.f12441W = dVar;
        this.f12439U = y8;
    }

    public final void a() {
        this.f12439U.a();
    }

    public final boolean g() {
        if (this.f12441W.a() || !this.f12439U.g()) {
            return false;
        }
        return true;
    }

    public final int l(c cVar, f fVar, int i) {
        C1038d dVar = this.f12441W;
        if (dVar.a()) {
            return -3;
        }
        if (this.f12440V) {
            fVar.f4018V = 4;
            return -4;
        }
        long n4 = dVar.n();
        int l8 = this.f12439U.l(cVar, fVar, i);
        if (l8 == -5) {
            r rVar = (r) cVar.f4337W;
            rVar.getClass();
            int i8 = rVar.f3018G;
            int i9 = rVar.f3017F;
            if (!(i9 == 0 && i8 == 0)) {
                if (dVar.f12457Y != 0) {
                    i9 = 0;
                }
                if (dVar.f12458Z != Long.MIN_VALUE) {
                    i8 = 0;
                }
                C0129q a8 = rVar.a();
                a8.f2982E = i9;
                a8.f2983F = i8;
                cVar.f4337W = new r(a8);
            }
            return -5;
        }
        long j7 = dVar.f12458Z;
        if (j7 == Long.MIN_VALUE || ((l8 != -4 || fVar.f4388a0 < j7) && (l8 != -3 || n4 != Long.MIN_VALUE || fVar.f4387Z))) {
            return l8;
        }
        fVar.r();
        fVar.f4018V = 4;
        this.f12440V = true;
        return -4;
    }

    public final int o(long j7) {
        if (this.f12441W.a()) {
            return -3;
        }
        return this.f12439U.o(j7);
    }
}
