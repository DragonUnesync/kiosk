package B;

import D.C0036c;
import D.C0039d0;
import D.C0041e0;
import D.C0053k0;
import D.C0059n0;
import D.K0;
import D.L0;
import D.N0;
import D.T;
import D.U;
import D.X;
import H.l;
import java.util.UUID;

public final class E implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f144a;

    /* renamed from: b  reason: collision with root package name */
    public final C0041e0 f145b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public E(int i) {
        this(C0041e0.b(), 0);
        this.f144a = i;
        switch (i) {
            case 1:
                this(C0041e0.b(), 1);
                return;
            case 2:
                this(C0041e0.b(), 2);
                return;
            default:
                return;
        }
    }

    public final C0039d0 a() {
        switch (this.f144a) {
            case 0:
                return this.f145b;
            case 1:
                return this.f145b;
            default:
                return this.f145b;
        }
    }

    public final L0 b() {
        switch (this.f144a) {
            case 0:
                return new T(C0053k0.a(this.f145b));
            case 1:
                return new U(C0053k0.a(this.f145b));
            default:
                return new C0059n0(C0053k0.a(this.f145b));
        }
    }

    public E(C0041e0 e0Var, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        this.f144a = i;
        switch (i) {
            case 1:
                this.f145b = e0Var;
                Object obj4 = null;
                try {
                    obj = e0Var.b0(l.f1803F);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<T> cls2 = T.class;
                if (cls == null || cls.equals(cls2)) {
                    this.f145b.e(L0.f807A, N0.f830U);
                    C0036c cVar = l.f1803F;
                    C0041e0 e0Var2 = this.f145b;
                    e0Var2.e(cVar, cls2);
                    try {
                        obj4 = e0Var2.b0(l.f1802E);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj4 == null) {
                        this.f145b.e(l.f1802E, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            case 2:
                this.f145b = e0Var;
                Object obj5 = null;
                try {
                    obj2 = e0Var.b0(l.f1803F);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls3 = (Class) obj2;
                Class<f0> cls4 = f0.class;
                if (cls3 == null || cls3.equals(cls4)) {
                    this.f145b.e(L0.f807A, N0.f831V);
                    C0036c cVar2 = l.f1803F;
                    C0041e0 e0Var3 = this.f145b;
                    e0Var3.e(cVar2, cls4);
                    try {
                        obj5 = e0Var3.b0(l.f1802E);
                    } catch (IllegalArgumentException unused4) {
                    }
                    if (obj5 == null) {
                        this.f145b.e(l.f1802E, cls4.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                    int i8 = -1;
                    try {
                        i8 = e0Var.b0(X.f869l);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (((Integer) i8).intValue() == -1) {
                        e0Var.e(X.f869l, 2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
            default:
                this.f145b = e0Var;
                Object obj6 = null;
                try {
                    obj3 = e0Var.b0(l.f1803F);
                } catch (IllegalArgumentException unused6) {
                    obj3 = null;
                }
                Class cls5 = (Class) obj3;
                Class<H> cls6 = H.class;
                if (cls5 == null || cls5.equals(cls6)) {
                    this.f145b.e(L0.f807A, N0.f832W);
                    C0036c cVar3 = l.f1803F;
                    C0041e0 e0Var4 = this.f145b;
                    e0Var4.e(cVar3, cls6);
                    try {
                        obj6 = e0Var4.b0(l.f1802E);
                    } catch (IllegalArgumentException unused7) {
                    }
                    if (obj6 == null) {
                        e0Var4.e(l.f1802E, cls6.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls5);
        }
    }
}
