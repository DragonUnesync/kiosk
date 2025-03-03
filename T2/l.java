package t2;

import java.util.BitSet;
import v2.c;
import v2.e;
import y2.C1628c;

public final class l extends C1628c implements e {

    /* renamed from: W  reason: collision with root package name */
    public static final l f15206W = new C1628c(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [y2.c, t2.l] */
    public static l h(k kVar) {
        ? cVar = new C1628c(1);
        cVar.f(0, kVar);
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [y2.c, t2.l] */
    public static l i(k kVar, k kVar2) {
        ? cVar = new C1628c(2);
        cVar.f(0, kVar);
        cVar.f(1, kVar2);
        return cVar;
    }

    public final c b(int i) {
        c type = ((k) e(i)).f15205V.getType();
        type.getClass();
        return type;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [y2.f, y2.c, t2.l] */
    public final l j(boolean z, BitSet bitSet) {
        Object[] objArr = this.f16371V;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        ? cVar = new C1628c(objArr.length);
        int i = 0;
        int i8 = 0;
        while (i < length) {
            k kVar = (k) e(i);
            if (bitSet == null || !bitSet.get(i)) {
                if (kVar.f15204U != i8) {
                    kVar = k.e(i8, kVar.f15205V);
                }
                if (!z) {
                    i8 += kVar.d();
                }
            }
            cVar.f(i, kVar);
            i++;
            z = false;
        }
        if (!this.f16382U) {
            cVar.f16382U = false;
        }
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [y2.f, y2.c, t2.l] */
    public final l k(int i) {
        int i8;
        int i9;
        int length = this.f16371V.length;
        if (length == 0) {
            return this;
        }
        ? cVar = new C1628c(length);
        for (int i10 = 0; i10 < length; i10++) {
            k kVar = (k) e(i10);
            if (!(i == 0 || (i8 = kVar.f15204U) == (i9 = i8 + i))) {
                kVar = k.e(i9, kVar.f15205V);
            }
            cVar.f(i10, kVar);
        }
        if (!this.f16382U) {
            cVar.f16382U = false;
        }
        return cVar;
    }
}
