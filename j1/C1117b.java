package j1;

import H3.C0102t;
import H3.F;
import H3.L;
import H3.O;
import H3.g0;
import H3.i0;
import H3.p0;
import M1.a;
import P0.l;
import U0.c;
import java.util.ArrayList;

/* renamed from: j1.b  reason: case insensitive filesystem */
public final class C1117b implements C1116a {

    /* renamed from: b  reason: collision with root package name */
    public static final F f12842b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12843a = new ArrayList();

    static {
        g0 g0Var = g0.f2070U;
        c cVar = new c(28);
        g0Var.getClass();
        C0102t tVar = new C0102t(cVar, g0Var);
        p0 p0Var = p0.f2110U;
        c cVar2 = new c(29);
        p0Var.getClass();
        f12842b = new F(tVar, new C0102t(cVar2, p0Var));
    }

    public final O a(long j7) {
        ArrayList arrayList = this.f12843a;
        if (!arrayList.isEmpty()) {
            if (j7 >= ((a) arrayList.get(0)).f3065b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    a aVar = (a) arrayList.get(i);
                    if (j7 >= aVar.f3065b && j7 < aVar.f3067d) {
                        arrayList2.add(aVar);
                    }
                    if (j7 < aVar.f3065b) {
                        break;
                    }
                }
                i0 u3 = O.u(f12842b, arrayList2);
                L j8 = O.j();
                for (int i8 = 0; i8 < u3.size(); i8++) {
                    j8.d(((a) u3.get(i8)).f3064a);
                }
                return j8.g();
            }
        }
        return O.p();
    }

    public final boolean b(a aVar, long j7) {
        boolean z;
        boolean z6;
        boolean z8;
        long j8 = aVar.f3065b;
        if (j8 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        if (aVar.f3066c != -9223372036854775807L) {
            z6 = true;
        } else {
            z6 = false;
        }
        l.d(z6);
        if (j8 > j7 || j7 >= aVar.f3067d) {
            z8 = false;
        } else {
            z8 = true;
        }
        ArrayList arrayList = this.f12843a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j8 >= ((a) arrayList.get(size)).f3065b) {
                arrayList.add(size + 1, aVar);
                return z8;
            }
        }
        arrayList.add(0, aVar);
        return z8;
    }

    public final long c(long j7) {
        int i = 0;
        long j8 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f12843a;
            if (i >= arrayList.size()) {
                break;
            }
            long j9 = ((a) arrayList.get(i)).f3065b;
            long j10 = ((a) arrayList.get(i)).f3067d;
            if (j7 >= j9) {
                if (j7 < j10) {
                    if (j8 == -9223372036854775807L) {
                        j8 = j10;
                    } else {
                        j8 = Math.min(j8, j10);
                    }
                }
                i++;
            } else if (j8 == -9223372036854775807L) {
                j8 = j9;
            } else {
                j8 = Math.min(j8, j9);
            }
        }
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        return Long.MIN_VALUE;
    }

    public final void clear() {
        this.f12843a.clear();
    }

    public final long d(long j7) {
        ArrayList arrayList = this.f12843a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j7 < ((a) arrayList.get(0)).f3065b) {
            return -9223372036854775807L;
        }
        long j8 = ((a) arrayList.get(0)).f3065b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j9 = ((a) arrayList.get(i)).f3065b;
            long j10 = ((a) arrayList.get(i)).f3067d;
            if (j10 > j7) {
                if (j9 > j7) {
                    break;
                }
                j8 = Math.max(j8, j9);
            } else {
                j8 = Math.max(j8, j10);
            }
        }
        return j8;
    }

    public final void e(long j7) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12843a;
            if (i < arrayList.size()) {
                int i8 = (j7 > ((a) arrayList.get(i)).f3065b ? 1 : (j7 == ((a) arrayList.get(i)).f3065b ? 0 : -1));
                if (i8 > 0 && j7 > ((a) arrayList.get(i)).f3067d) {
                    arrayList.remove(i);
                    i--;
                } else if (i8 < 0) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
