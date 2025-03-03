package androidx.recyclerview.widget;

import Y.g;
import Y.h;
import Y.i;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final i f8521a = new i((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final g f8522b = new g();

    public final void a(j0 j0Var, L l8) {
        i iVar = this.f8521a;
        r0 r0Var = (r0) iVar.get(j0Var);
        if (r0Var == null) {
            r0Var = r0.a();
            iVar.put(j0Var, r0Var);
        }
        r0Var.f8512c = l8;
        r0Var.f8510a |= 8;
    }

    public final L b(j0 j0Var, int i) {
        r0 r0Var;
        L l8;
        i iVar = this.f8521a;
        int d8 = iVar.d(j0Var);
        if (d8 >= 0 && (r0Var = (r0) iVar.j(d8)) != null) {
            int i8 = r0Var.f8510a;
            if ((i8 & i) != 0) {
                int i9 = i8 & (~i);
                r0Var.f8510a = i9;
                if (i == 4) {
                    l8 = r0Var.f8511b;
                } else if (i == 8) {
                    l8 = r0Var.f8512c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i9 & 12) == 0) {
                    iVar.h(d8);
                    r0Var.f8510a = 0;
                    r0Var.f8511b = null;
                    r0Var.f8512c = null;
                    r0.f8509d.c(r0Var);
                }
                return l8;
            }
        }
        return null;
    }

    public final void c(j0 j0Var) {
        r0 r0Var = (r0) this.f8521a.get(j0Var);
        if (r0Var != null) {
            r0Var.f8510a &= -2;
        }
    }

    public final void d(j0 j0Var) {
        g gVar = this.f8522b;
        int h5 = gVar.h() - 1;
        while (true) {
            if (h5 < 0) {
                break;
            } else if (j0Var == gVar.i(h5)) {
                Object[] objArr = gVar.f6302W;
                Object obj = objArr[h5];
                Object obj2 = h.f6304a;
                if (obj != obj2) {
                    objArr[h5] = obj2;
                    gVar.f6300U = true;
                }
            } else {
                h5--;
            }
        }
        r0 r0Var = (r0) this.f8521a.remove(j0Var);
        if (r0Var != null) {
            r0Var.f8510a = 0;
            r0Var.f8511b = null;
            r0Var.f8512c = null;
            r0.f8509d.c(r0Var);
        }
    }
}
