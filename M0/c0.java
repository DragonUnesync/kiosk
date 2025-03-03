package M0;

import H3.C0103u;
import H3.U;
import H3.i0;
import H3.n0;
import N.e;
import P0.z;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f2918a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2919b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2920c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2921d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2922f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2923g;

    /* renamed from: h  reason: collision with root package name */
    public final i0 f2924h;
    public final i0 i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2925j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2926k;

    /* renamed from: l  reason: collision with root package name */
    public final i0 f2927l;

    /* renamed from: m  reason: collision with root package name */
    public final a0 f2928m;

    /* renamed from: n  reason: collision with root package name */
    public final i0 f2929n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2930o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2931p;

    /* renamed from: q  reason: collision with root package name */
    public final n0 f2932q;

    /* renamed from: r  reason: collision with root package name */
    public final U f2933r;

    static {
        new c0(new b0());
        z.J(1);
        z.J(2);
        z.J(3);
        z.J(4);
        e.D(5, 6, 7, 8, 9);
        e.D(10, 11, 12, 13, 14);
        e.D(15, 16, 17, 18, 19);
        e.D(20, 21, 22, 23, 24);
        e.D(25, 26, 27, 28, 29);
        z.J(30);
        z.J(31);
    }

    public c0(b0 b0Var) {
        this.f2918a = b0Var.f2898a;
        this.f2919b = b0Var.f2899b;
        this.f2920c = b0Var.f2900c;
        this.f2921d = b0Var.f2901d;
        this.e = b0Var.e;
        this.f2922f = b0Var.f2902f;
        this.f2923g = b0Var.f2903g;
        this.f2924h = b0Var.f2904h;
        this.i = b0Var.i;
        this.f2925j = b0Var.f2905j;
        this.f2926k = b0Var.f2906k;
        this.f2927l = b0Var.f2907l;
        this.f2928m = b0Var.f2908m;
        this.f2929n = b0Var.f2909n;
        this.f2930o = b0Var.f2910o;
        this.f2931p = b0Var.f2911p;
        this.f2932q = n0.a(b0Var.f2912q);
        this.f2933r = U.l(b0Var.f2913r);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f2918a == c0Var.f2918a && this.f2919b == c0Var.f2919b && this.f2920c == c0Var.f2920c && this.f2921d == c0Var.f2921d && this.f2923g == c0Var.f2923g && this.e == c0Var.e && this.f2922f == c0Var.f2922f && this.f2924h.equals(c0Var.f2924h) && this.i.equals(c0Var.i) && this.f2925j == c0Var.f2925j && this.f2926k == c0Var.f2926k && this.f2927l.equals(c0Var.f2927l) && this.f2928m.equals(c0Var.f2928m) && this.f2929n.equals(c0Var.f2929n) && this.f2930o == c0Var.f2930o && this.f2931p == c0Var.f2931p) {
            n0 n0Var = this.f2932q;
            n0Var.getClass();
            if (!C0103u.h(n0Var, c0Var.f2932q) || !this.f2933r.equals(c0Var.f2933r)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f2924h.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.f2927l.hashCode();
        this.f2928m.getClass();
        int hashCode4 = this.f2929n.hashCode();
        int hashCode5 = this.f2932q.hashCode();
        return this.f2933r.hashCode() + ((hashCode5 + ((((((hashCode4 + ((((hashCode3 + ((((((hashCode2 + ((hashCode + ((((((((((((((this.f2918a + 31) * 31) + this.f2919b) * 31) + this.f2920c) * 31) + this.f2921d) * 28629151) + (this.f2923g ? 1 : 0)) * 31) + this.e) * 31) + this.f2922f) * 31)) * 961)) * 961) + this.f2925j) * 31) + this.f2926k) * 31)) * 31) + 29791) * 31)) * 31) + this.f2930o) * 31) + this.f2931p) * 28629151)) * 31);
    }
}
