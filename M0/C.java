package M0;

import H3.M;
import H3.O;
import H3.i0;
import N.e;
import P0.z;
import j$.util.Objects;
import java.util.Collections;

public final class C {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f2784g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f2785a;

    /* renamed from: b  reason: collision with root package name */
    public final C0137z f2786b;

    /* renamed from: c  reason: collision with root package name */
    public final C0136y f2787c;

    /* renamed from: d  reason: collision with root package name */
    public final F f2788d;
    public final C0134w e;

    /* renamed from: f  reason: collision with root package name */
    public final A f2789f;

    static {
        C0132u uVar = new C0132u();
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        Collections.emptyList();
        i0 i0Var2 = i0.f2073Y;
        C0135x xVar = new C0135x();
        A a8 = A.f2783a;
        uVar.a();
        xVar.a();
        F f8 = F.z;
        e.D(0, 1, 2, 3, 4);
        z.J(5);
    }

    public C(String str, C0134w wVar, C0137z zVar, C0136y yVar, F f8, A a8) {
        this.f2785a = str;
        this.f2786b = zVar;
        this.f2787c = yVar;
        this.f2788d = f8;
        this.e = wVar;
        this.f2789f = a8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        String str = c8.f2785a;
        int i = z.f3748a;
        if (!Objects.equals(this.f2785a, str) || !this.e.equals(c8.e) || !Objects.equals(this.f2786b, c8.f2786b) || !this.f2787c.equals(c8.f2787c) || !Objects.equals(this.f2788d, c8.f2788d) || !Objects.equals(this.f2789f, c8.f2789f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f2785a.hashCode() * 31;
        C0137z zVar = this.f2786b;
        if (zVar != null) {
            i = zVar.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f2787c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = (this.f2788d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
        this.f2789f.getClass();
        return hashCode4;
    }
}
