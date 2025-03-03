package U7;

import E7.d;
import R2.c;
import S7.k;
import S7.p;
import S7.q;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

public final class t extends h {
    public static final c e = new c((Supplier) new d(10));

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5466d;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[EDGE_INSN: B:14:0x0025->B:10:0x0025 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(U7.p r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            boolean r0 = r3 instanceof U7.c
            if (r0 == 0) goto L_0x0025
            U7.c r3 = (U7.c) r3
            java.util.ArrayList r3 = r3.f5436a
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r3.next()
            U7.p r0 = (U7.p) r0
            boolean r1 = r0 instanceof U7.x
            if (r1 != 0) goto L_0x0023
            boolean r0 = r0 instanceof U7.v
            if (r0 == 0) goto L_0x000f
        L_0x0023:
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            r2.f5466d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.t.<init>(U7.p):void");
    }

    public final int a() {
        return ((p) this.f5446b).a() * 10;
    }

    public final boolean b(k kVar, k kVar2) {
        k kVar3;
        boolean z = this.f5466d;
        p pVar = (p) this.f5446b;
        if (z) {
            k kVar4 = (k) kVar2.f4578U;
            if (kVar4 != null) {
                kVar3 = kVar4.I();
            } else {
                kVar3 = kVar2;
            }
            while (kVar3 != null) {
                if (kVar3 != kVar2 && pVar.b(kVar2, kVar3)) {
                    return true;
                }
                kVar3 = kVar3.J();
            }
        }
        c cVar = e;
        q qVar = (q) cVar.F();
        if (qVar.f4585Z.isInstance(kVar2)) {
            qVar.f4581V = kVar2;
        }
        qVar.f4582W = kVar2;
        qVar.f4583X = kVar2;
        qVar.f4580U = kVar2;
        qVar.f4584Y = kVar2.v();
        while (qVar.hasNext()) {
            try {
                qVar.a();
                p pVar2 = qVar.f4581V;
                if (pVar2 != null) {
                    qVar.f4583X = qVar.f4582W;
                    qVar.f4582W = pVar2;
                    qVar.f4584Y = pVar2.v();
                    qVar.f4581V = null;
                    k kVar5 = (k) pVar2;
                    if (kVar5 != kVar2) {
                        if (pVar.b(kVar2, kVar5)) {
                            return true;
                        }
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } finally {
                cVar.u0(qVar);
            }
        }
        cVar.u0(qVar);
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", new Object[]{(p) this.f5446b});
    }
}
