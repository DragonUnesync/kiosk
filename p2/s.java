package p2;

import B3.q;
import com.samsung.android.knox.EnterpriseDeviceManager;
import d4.k;
import de.ozerov.fully.K2;
import h1.C1048n;
import t2.C1419a;
import t2.C1420b;
import t2.C1424f;
import t2.C1425g;
import t2.l;
import y2.C1628c;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final k f14632a;

    /* renamed from: b  reason: collision with root package name */
    public final k f14633b;

    /* renamed from: c  reason: collision with root package name */
    public final K2 f14634c;

    /* renamed from: d  reason: collision with root package name */
    public final q f14635d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f14636f = null;

    /* renamed from: g  reason: collision with root package name */
    public final int f14637g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14638h;

    /* JADX WARNING: type inference failed for: r5v0, types: [t2.e, java.lang.Object, J1.d] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, B3.q] */
    /* JADX WARNING: type inference failed for: r2v6, types: [t2.e, Q0.l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8, types: [t2.e, Q0.l, java.lang.Object] */
    public s(k kVar, int i, C1048n nVar) {
        int i8 = 0;
        this.f14632a = kVar;
        this.f14633b = new k(kVar);
        this.f14637g = i;
        boolean[] zArr = {true};
        C1420b bVar = (C1420b) kVar.f9766V;
        if (bVar.f15187X == -1) {
            ? obj = new Object();
            obj.f4037U = 0;
            int length = bVar.f16371V.length;
            for (int i9 = 0; i9 < length; i9++) {
                C1425g gVar = ((C1419a) bVar.e(i9)).f15183b;
                int length2 = gVar.f16371V.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    ((C1424f) gVar.e(i10)).b(obj);
                }
            }
            bVar.f15187X = obj.f4037U;
        }
        int i11 = bVar.f15187X;
        ? obj2 = new Object();
        obj2.f2353W = zArr;
        obj2.f2351U = i11;
        obj2.f2352V = i;
        int length3 = bVar.f16371V.length;
        for (int i12 = 0; i12 < length3; i12++) {
            C1425g gVar2 = ((C1419a) bVar.e(i12)).f15183b;
            int length4 = gVar2.f16371V.length;
            for (int i13 = 0; i13 < length4; i13++) {
                ((C1424f) gVar2.e(i13)).b(obj2);
            }
        }
        this.f14638h = zArr[0];
        Object[] objArr = bVar.f16371V;
        int length5 = objArr.length * 3;
        int i14 = 0;
        for (Object obj3 : objArr) {
            C1419a aVar = (C1419a) obj3;
            if (aVar != null) {
                i14 += aVar.f15183b.f16371V.length;
            }
        }
        int i15 = length5 + i14;
        if (bVar.f15187X == -1) {
            ? obj4 = new Object();
            obj4.f4037U = 0;
            int length6 = bVar.f16371V.length;
            for (int i16 = 0; i16 < length6; i16++) {
                C1425g gVar3 = ((C1419a) bVar.e(i16)).f15183b;
                int length7 = gVar3.f16371V.length;
                for (int i17 = 0; i17 < length7; i17++) {
                    ((C1424f) gVar3.e(i17)).b(obj4);
                }
            }
            bVar.f15187X = obj4.f4037U;
        }
        int i18 = bVar.f15187X + (!this.f14638h ? this.f14637g : i8);
        this.e = i18;
        K2 k22 = new K2(nVar, i15, length5, i18, i);
        this.f14634c = k22;
        ? obj5 = new Object();
        obj5.f452X = this;
        obj5.f449U = k22;
        this.f14635d = obj5;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [y2.f, y2.c, t2.l] */
    public static l a(C1424f fVar, t2.k kVar) {
        l lVar = fVar.f15199X;
        int i = fVar.f15196U.f15209a;
        if (!(i == 14 || i == 16)) {
            switch (i) {
                case EnterpriseDeviceManager.KNOX_2_7:
                case 21:
                case 22:
                    break;
            }
        }
        if (lVar.f16371V.length == 2 && kVar.f15204U == ((t2.k) lVar.e(1)).f15204U) {
            lVar = l.i((t2.k) lVar.e(1), (t2.k) lVar.e(0));
        }
        if (kVar == null) {
            return lVar;
        }
        int length = lVar.f16371V.length;
        ? cVar = new C1628c(length + 1);
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            cVar.f(i9, lVar.e(i8));
            i8 = i9;
        }
        cVar.f(0, kVar);
        if (!lVar.f16382U) {
            cVar.f16382U = false;
        }
        return cVar;
    }
}
