package h1;

import H3.L;
import H3.O;
import H3.i0;
import P0.l;
import T0.I;
import java.util.List;

/* renamed from: h1.m  reason: case insensitive filesystem */
public final class C1047m implements a0 {

    /* renamed from: U  reason: collision with root package name */
    public final i0 f12494U;

    /* renamed from: V  reason: collision with root package name */
    public long f12495V;

    public C1047m(List list, List list2) {
        boolean z;
        L j7 = O.j();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        for (int i = 0; i < list.size(); i++) {
            j7.a(new C1046l((a0) list.get(i), (List) list2.get(i)));
        }
        this.f12494U = j7.g();
        this.f12495V = -9223372036854775807L;
    }

    public final boolean b() {
        int i = 0;
        while (true) {
            i0 i0Var = this.f12494U;
            if (i >= i0Var.size()) {
                return false;
            }
            if (((C1046l) i0Var.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    public final long e() {
        int i = 0;
        long j7 = Long.MAX_VALUE;
        while (true) {
            i0 i0Var = this.f12494U;
            if (i >= i0Var.size()) {
                break;
            }
            long e = ((C1046l) i0Var.get(i)).e();
            if (e != Long.MIN_VALUE) {
                j7 = Math.min(j7, e);
            }
            i++;
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    public final boolean h(I i) {
        boolean z;
        boolean z6;
        boolean z8 = false;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            int i8 = 0;
            z = false;
            while (true) {
                i0 i0Var = this.f12494U;
                if (i8 >= i0Var.size()) {
                    break;
                }
                long e8 = ((C1046l) i0Var.get(i8)).e();
                if (e8 == Long.MIN_VALUE || e8 > i.f4675a) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (e8 == e || z6) {
                    z |= ((C1046l) i0Var.get(i8)).h(i);
                }
                i8++;
            }
            z8 |= z;
        } while (z);
        return z8;
    }

    public final long n() {
        int i = 0;
        long j7 = Long.MAX_VALUE;
        long j8 = Long.MAX_VALUE;
        while (true) {
            i0 i0Var = this.f12494U;
            if (i >= i0Var.size()) {
                break;
            }
            C1046l lVar = (C1046l) i0Var.get(i);
            long n4 = lVar.n();
            if ((lVar.a().contains(1) || lVar.a().contains(2) || lVar.a().contains(4)) && n4 != Long.MIN_VALUE) {
                j7 = Math.min(j7, n4);
            }
            if (n4 != Long.MIN_VALUE) {
                j8 = Math.min(j8, n4);
            }
            i++;
        }
        if (j7 != Long.MAX_VALUE) {
            this.f12495V = j7;
            return j7;
        } else if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j9 = this.f12495V;
            if (j9 != -9223372036854775807L) {
                return j9;
            }
            return j8;
        }
    }

    public final void u(long j7) {
        int i = 0;
        while (true) {
            i0 i0Var = this.f12494U;
            if (i < i0Var.size()) {
                ((C1046l) i0Var.get(i)).u(j7);
                i++;
            } else {
                return;
            }
        }
    }
}
