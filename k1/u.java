package k1;

import M0.e0;
import P0.l;
import P0.z;
import Q0.t;
import T0.d0;
import j$.util.Objects;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f13009a;

    /* renamed from: b  reason: collision with root package name */
    public final d0[] f13010b;

    /* renamed from: c  reason: collision with root package name */
    public final r[] f13011c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f13012d;
    public final t e;

    public u(d0[] d0VarArr, r[] rVarArr, e0 e0Var, t tVar) {
        boolean z;
        if (d0VarArr.length == rVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f13010b = d0VarArr;
        this.f13011c = (r[]) rVarArr.clone();
        this.f13012d = e0Var;
        this.e = tVar;
        this.f13009a = d0VarArr.length;
    }

    public final boolean a(u uVar, int i) {
        if (uVar == null) {
            return false;
        }
        d0 d0Var = this.f13010b[i];
        d0 d0Var2 = uVar.f13010b[i];
        int i8 = z.f3748a;
        if (!Objects.equals(d0Var, d0Var2) || !Objects.equals(this.f13011c[i], uVar.f13011c[i])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i) {
        if (this.f13010b[i] != null) {
            return true;
        }
        return false;
    }
}
