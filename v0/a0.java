package v0;

import F.h;
import m0.C1197c;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f15916a;

    /* renamed from: b  reason: collision with root package name */
    public C1197c[] f15917b;

    public a0() {
        this(new j0());
    }

    public final void a() {
        C1197c[] cVarArr = this.f15917b;
        if (cVarArr != null) {
            C1197c cVar = cVarArr[0];
            C1197c cVar2 = cVarArr[1];
            j0 j0Var = this.f15916a;
            if (cVar2 == null) {
                cVar2 = j0Var.f15952a.f(2);
            }
            if (cVar == null) {
                cVar = j0Var.f15952a.f(1);
            }
            g(C1197c.a(cVar, cVar2));
            C1197c cVar3 = this.f15917b[h.r(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            C1197c cVar4 = this.f15917b[h.r(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            C1197c cVar5 = this.f15917b[h.r(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract j0 b();

    public void c(int i, C1197c cVar) {
        if (this.f15917b == null) {
            this.f15917b = new C1197c[9];
        }
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i & i8) != 0) {
                this.f15917b[h.r(i8)] = cVar;
            }
        }
    }

    public void d(C1197c cVar) {
    }

    public abstract void e(C1197c cVar);

    public void f(C1197c cVar) {
    }

    public abstract void g(C1197c cVar);

    public void h(C1197c cVar) {
    }

    public a0(j0 j0Var) {
        this.f15916a = j0Var;
    }
}
