package h1;

import D.O;
import M0.r;
import Y0.e;
import Y0.f;
import g1.g;
import java.io.IOException;

/* renamed from: h1.i  reason: case insensitive filesystem */
public final class C1043i implements G, f {

    /* renamed from: U  reason: collision with root package name */
    public final Object f12483U;

    /* renamed from: V  reason: collision with root package name */
    public e f12484V;

    /* renamed from: W  reason: collision with root package name */
    public e f12485W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1045k f12486X;

    public C1043i(C1045k kVar, Object obj) {
        this.f12486X = kVar;
        this.f12484V = kVar.a((C1031B) null);
        this.f12485W = new e(kVar.f12433d.f6317c, 0, (C1031B) null);
        this.f12483U = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (j$.util.Objects.equals(r0.f6316b, r5) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, h1.C1031B r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12483U
            h1.k r1 = r3.f12486X
            if (r5 == 0) goto L_0x000e
            h1.B r5 = r1.t(r0, r5)
            if (r5 != 0) goto L_0x000f
            r4 = 0
            return r4
        L_0x000e:
            r5 = 0
        L_0x000f:
            int r4 = r1.v(r4, r0)
            Y0.e r0 = r3.f12484V
            int r2 = r0.f6315a
            if (r2 != r4) goto L_0x0023
            int r2 = P0.z.f3748a
            h1.B r0 = r0.f6316b
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L_0x002e
        L_0x0023:
            Y0.e r0 = new Y0.e
            Y0.e r2 = r1.f12432c
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f6317c
            r0.<init>(r2, r4, r5)
            r3.f12484V = r0
        L_0x002e:
            Y0.e r0 = r3.f12485W
            int r2 = r0.f6315a
            if (r2 != r4) goto L_0x003e
            int r2 = P0.z.f3748a
            h1.B r0 = r0.f6316b
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L_0x0049
        L_0x003e:
            Y0.e r0 = new Y0.e
            Y0.e r1 = r1.f12433d
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f6317c
            r0.<init>(r1, r4, r5)
            r3.f12485W = r0
        L_0x0049:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1043i.a(int, h1.B):boolean");
    }

    public final g b(g gVar, C1031B b8) {
        C1045k kVar = this.f12486X;
        Object obj = this.f12483U;
        long j7 = gVar.f11888d;
        long u3 = kVar.u(obj, j7);
        long j8 = gVar.e;
        long u8 = kVar.u(obj, j8);
        if (u3 == j7 && u8 == j8) {
            return gVar;
        }
        return new g(gVar.f11885a, gVar.f11886b, (r) gVar.f11889f, gVar.f11887c, gVar.f11890g, u3, u8);
    }

    public final void g(int i, C1031B b8, C1053t tVar, g gVar) {
        if (a(i, b8)) {
            e eVar = this.f12484V;
            g b9 = b(gVar, b8);
            eVar.getClass();
            eVar.a(new C1033D(eVar, tVar, b9, 2));
        }
    }

    public final void k(int i, C1031B b8, C1053t tVar, g gVar, IOException iOException, boolean z) {
        if (a(i, b8)) {
            e eVar = this.f12484V;
            g b9 = b(gVar, b8);
            eVar.getClass();
            eVar.a(new C1034E(eVar, tVar, b9, iOException, z));
        }
    }

    public final void r(int i, C1031B b8, C1053t tVar, g gVar) {
        if (a(i, b8)) {
            e eVar = this.f12484V;
            g b9 = b(gVar, b8);
            eVar.getClass();
            eVar.a(new C1033D(eVar, tVar, b9, 1));
        }
    }

    public final void s(int i, C1031B b8, g gVar) {
        if (a(i, b8)) {
            e eVar = this.f12484V;
            g b9 = b(gVar, b8);
            eVar.getClass();
            eVar.a(new A.g(eVar, 14, b9));
        }
    }

    public final void u(int i, C1031B b8, g gVar) {
        if (a(i, b8)) {
            e eVar = this.f12484V;
            g b9 = b(gVar, b8);
            C1031B b10 = eVar.f6316b;
            b10.getClass();
            eVar.a(new O(eVar, b10, b9, 8));
        }
    }

    public final void x(int i, C1031B b8, C1053t tVar, g gVar) {
        if (a(i, b8)) {
            e eVar = this.f12484V;
            g b9 = b(gVar, b8);
            eVar.getClass();
            eVar.a(new C1033D(eVar, tVar, b9, 0));
        }
    }
}
