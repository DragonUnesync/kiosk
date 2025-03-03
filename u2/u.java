package u2;

import j$.util.concurrent.ConcurrentHashMap;
import v2.c;

public final class u extends v {

    /* renamed from: W  reason: collision with root package name */
    public static final ConcurrentHashMap f15768W = new ConcurrentHashMap(1000, 0.75f);

    /* renamed from: X  reason: collision with root package name */
    public static final u f15769X;

    /* renamed from: Y  reason: collision with root package name */
    public static final u f15770Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final u f15771Z = new u(c.f16063n0);

    /* renamed from: U  reason: collision with root package name */
    public final c f15772U;

    /* renamed from: V  reason: collision with root package name */
    public t f15773V;

    static {
        u uVar = new u(c.f16064o0);
        f15769X = uVar;
        u uVar2 = new u(c.f16066r0);
        u uVar3 = new u(c.f16067s0);
        u uVar4 = new u(c.f16068t0);
        u uVar5 = new u(c.f16069u0);
        u uVar6 = new u(c.f16070v0);
        u uVar7 = new u(c.f16072x0);
        u uVar8 = new u(c.f16071w0);
        u uVar9 = new u(c.f16073y0);
        u uVar10 = new u(c.f16074z0);
        u uVar11 = new u(c.f16040A0);
        u uVar12 = new u(c.f16041B0);
        u uVar13 = new u(c.f16042C0);
        u uVar14 = new u(c.f16043D0);
        u uVar15 = new u(c.f16044E0);
        u uVar16 = new u(c.f16046G0);
        u uVar17 = new u(c.f16045F0);
        u uVar18 = new u(c.f16048I0);
        u uVar19 = new u(c.f16062m0);
        f15770Y = uVar19;
        g(uVar);
        g(uVar2);
        g(uVar3);
        g(uVar4);
        g(uVar5);
        g(uVar6);
        g(uVar7);
        g(uVar8);
        g(uVar9);
        g(uVar10);
        g(uVar11);
        g(uVar12);
        g(uVar13);
        g(uVar14);
        g(uVar15);
        g(uVar16);
        g(uVar17);
        g(uVar18);
        g(uVar19);
    }

    public u(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("type == null");
        } else if (cVar != c.f16059j0) {
            this.f15772U = cVar;
            this.f15773V = null;
        } else {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
    }

    public static void g(u uVar) {
        if (f15768W.putIfAbsent(uVar.f15772U, uVar) != null) {
            throw new IllegalStateException("Attempted re-init of " + uVar);
        }
    }

    public final String a() {
        return this.f15772U.a();
    }

    public final int d(C1490a aVar) {
        return this.f15772U.f16075U.compareTo(((u) aVar).f15772U.f16075U);
    }

    public final String e() {
        return "type";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u) && this.f15772U == ((u) obj).f15772U) {
            return true;
        }
        return false;
    }

    public final t f() {
        if (this.f15773V == null) {
            this.f15773V = new t(this.f15772U.f16075U);
        }
        return this.f15773V;
    }

    public final c getType() {
        return c.f16061l0;
    }

    public final int hashCode() {
        return this.f15772U.f16075U.hashCode();
    }

    public final String toString() {
        return "type{" + this.f15772U.a() + '}';
    }
}
