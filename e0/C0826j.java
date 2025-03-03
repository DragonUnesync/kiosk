package e0;

import java.util.ArrayList;

/* renamed from: e0.j  reason: case insensitive filesystem */
public final class C0826j {

    /* renamed from: a  reason: collision with root package name */
    public l f11151a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f11152b;

    public static long a(C0821e eVar, long j7) {
        l lVar = eVar.f11142d;
        if (lVar instanceof C0824h) {
            return j7;
        }
        ArrayList arrayList = eVar.f11147k;
        int size = arrayList.size();
        long j8 = j7;
        for (int i = 0; i < size; i++) {
            C0820d dVar = (C0820d) arrayList.get(i);
            if (dVar instanceof C0821e) {
                C0821e eVar2 = (C0821e) dVar;
                if (eVar2.f11142d != lVar) {
                    j8 = Math.min(j8, a(eVar2, ((long) eVar2.f11143f) + j7));
                }
            }
        }
        if (eVar != lVar.i) {
            return j8;
        }
        long j9 = lVar.j();
        C0821e eVar3 = lVar.f11161h;
        long j10 = j7 - j9;
        return Math.min(Math.min(j8, a(eVar3, j10)), j10 - ((long) eVar3.f11143f));
    }

    public static long b(C0821e eVar, long j7) {
        l lVar = eVar.f11142d;
        if (lVar instanceof C0824h) {
            return j7;
        }
        ArrayList arrayList = eVar.f11147k;
        int size = arrayList.size();
        long j8 = j7;
        for (int i = 0; i < size; i++) {
            C0820d dVar = (C0820d) arrayList.get(i);
            if (dVar instanceof C0821e) {
                C0821e eVar2 = (C0821e) dVar;
                if (eVar2.f11142d != lVar) {
                    j8 = Math.max(j8, b(eVar2, ((long) eVar2.f11143f) + j7));
                }
            }
        }
        if (eVar != lVar.f11161h) {
            return j8;
        }
        long j9 = lVar.j();
        C0821e eVar3 = lVar.i;
        long j10 = j7 + j9;
        return Math.max(Math.max(j8, b(eVar3, j10)), j10 - ((long) eVar3.f11143f));
    }
}
