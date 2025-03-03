package M0;

import H3.L;
import H3.M;
import H3.O;
import H3.i0;
import P0.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public int f2898a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f2899b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f2900c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f2901d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public int f2902f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2903g = true;

    /* renamed from: h  reason: collision with root package name */
    public i0 f2904h;
    public i0 i;

    /* renamed from: j  reason: collision with root package name */
    public int f2905j;

    /* renamed from: k  reason: collision with root package name */
    public int f2906k;

    /* renamed from: l  reason: collision with root package name */
    public i0 f2907l;

    /* renamed from: m  reason: collision with root package name */
    public a0 f2908m;

    /* renamed from: n  reason: collision with root package name */
    public i0 f2909n;

    /* renamed from: o  reason: collision with root package name */
    public int f2910o;

    /* renamed from: p  reason: collision with root package name */
    public int f2911p;

    /* renamed from: q  reason: collision with root package name */
    public HashMap f2912q;

    /* renamed from: r  reason: collision with root package name */
    public HashSet f2913r;

    public b0() {
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        this.f2904h = i0Var;
        this.i = i0Var;
        this.f2905j = Integer.MAX_VALUE;
        this.f2906k = Integer.MAX_VALUE;
        this.f2907l = i0Var;
        this.f2908m = a0.f2892a;
        this.f2909n = i0Var;
        this.f2910o = 0;
        this.f2911p = 0;
        this.f2912q = new HashMap();
        this.f2913r = new HashSet();
    }

    public void a(int i8) {
        Iterator it = this.f2912q.values().iterator();
        while (it.hasNext()) {
            if (((Z) it.next()).f2889a.f2887c == i8) {
                it.remove();
            }
        }
    }

    public final void b(c0 c0Var) {
        this.f2898a = c0Var.f2918a;
        this.f2899b = c0Var.f2919b;
        this.f2900c = c0Var.f2920c;
        this.f2901d = c0Var.f2921d;
        this.e = c0Var.e;
        this.f2902f = c0Var.f2922f;
        this.f2903g = c0Var.f2923g;
        this.f2904h = c0Var.f2924h;
        this.i = c0Var.i;
        this.f2905j = c0Var.f2925j;
        this.f2906k = c0Var.f2926k;
        this.f2907l = c0Var.f2927l;
        this.f2908m = c0Var.f2928m;
        this.f2909n = c0Var.f2929n;
        this.f2910o = c0Var.f2930o;
        this.f2911p = c0Var.f2931p;
        this.f2913r = new HashSet(c0Var.f2933r);
        this.f2912q = new HashMap(c0Var.f2932q);
    }

    public b0 c(String... strArr) {
        L j7 = O.j();
        for (String str : strArr) {
            str.getClass();
            j7.a(z.P(str));
        }
        this.f2909n = j7.g();
        return this;
    }

    public b0 d(int i8, int i9) {
        this.e = i8;
        this.f2902f = i9;
        this.f2903g = true;
        return this;
    }
}
