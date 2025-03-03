package C4;

import I2.b;
import L4.h;
import i5.C1103c;
import u.C1477r;
import z3.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f687a = new e(14);

    /* renamed from: b  reason: collision with root package name */
    public final f[] f688b = new f[C1477r.k(4).length];

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, I2.b] */
    public static void a(f fVar, f fVar2) {
        if (fVar2 != null) {
            Object obj = fVar2.f10050V;
            while (true) {
                C1103c cVar = (C1103c) ((b) obj);
                if (cVar == null) {
                    return;
                }
                if (((V4.a) ((h) fVar.f704Z.f2711c)).f5976f == k5.a.f13047U) {
                    ? obj2 = new Object();
                    b bVar = (b) fVar.f10051W;
                    if (bVar == null) {
                        fVar.f10051W = obj2;
                        fVar.f10050V = obj2;
                    } else {
                        bVar.f2258V = obj2;
                        obj2.f2257U = bVar;
                        fVar.f10051W = obj2;
                    }
                    obj = cVar.f2258V;
                } else {
                    throw null;
                }
            }
        }
    }
}
