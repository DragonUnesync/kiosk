package k1;

import H3.E;
import H3.O;
import H3.g0;
import H3.h0;
import H3.i0;
import H3.p0;
import M0.Y;
import Q0.g;

/* renamed from: k1.l  reason: case insensitive filesystem */
public final class C1143l extends n implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f12971Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f12972Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f12973a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f12974b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f12975c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f12976d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f12977e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f12978f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f12979g0;

    public C1143l(int i, Y y8, int i8, C1141j jVar, int i9, String str) {
        super(i, y8, i8);
        boolean z;
        boolean z6;
        i0 i0Var;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        int i11 = 0;
        this.f12972Z = g.i(i9, false);
        int i12 = this.f12983X.e & (~jVar.f2931p);
        if ((i12 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f12973a0 = z;
        if ((i12 & 2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f12974b0 = z6;
        i0 i0Var2 = jVar.f2929n;
        if (i0Var2.isEmpty()) {
            i0Var = O.r("");
        } else {
            i0Var = i0Var2;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= i0Var.size()) {
                i13 = Integer.MAX_VALUE;
                i10 = 0;
                break;
            }
            i10 = p.d(this.f12983X, (String) i0Var.get(i13), false);
            if (i10 > 0) {
                break;
            }
            i13++;
        }
        this.f12975c0 = i13;
        this.f12976d0 = i10;
        int b8 = p.b(this.f12983X.f3029f, jVar.f2930o);
        this.f12977e0 = b8;
        if ((this.f12983X.f3029f & 1088) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f12979g0 = z8;
        if (p.g(str) == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int d8 = p.d(this.f12983X, str, z9);
        this.f12978f0 = d8;
        if (i10 > 0 || ((i0Var2.isEmpty() && b8 > 0) || this.f12973a0 || (this.f12974b0 && d8 > 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g.i(i9, jVar.f12968x) && z10) {
            i11 = 1;
        }
        this.f12971Y = i11;
    }

    public final int a() {
        return this.f12971Y;
    }

    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        C1143l lVar = (C1143l) nVar;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(C1143l lVar) {
        E c8 = E.f2008a.c(this.f12972Z, lVar.f12972Z);
        Integer valueOf = Integer.valueOf(this.f12975c0);
        Integer valueOf2 = Integer.valueOf(lVar.f12975c0);
        h0 h0Var = g0.f2070U;
        h0Var.getClass();
        h0 h0Var2 = p0.f2110U;
        E b8 = c8.b(valueOf, valueOf2, h0Var2);
        int i = this.f12976d0;
        E a8 = b8.a(i, lVar.f12976d0);
        int i8 = this.f12977e0;
        E c9 = a8.a(i8, lVar.f12977e0).c(this.f12973a0, lVar.f12973a0);
        Boolean valueOf3 = Boolean.valueOf(this.f12974b0);
        Boolean valueOf4 = Boolean.valueOf(lVar.f12974b0);
        if (i != 0) {
            h0Var = h0Var2;
        }
        E a9 = c9.b(valueOf3, valueOf4, h0Var).a(this.f12978f0, lVar.f12978f0);
        if (i8 == 0) {
            a9 = a9.d(this.f12979g0, lVar.f12979g0);
        }
        return a9.e();
    }
}
