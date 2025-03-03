package h1;

import B2.c;
import H3.C0103u;
import H3.M;
import H3.O;
import H3.i0;
import M0.A;
import M0.C;
import M0.C0132u;
import M0.C0133v;
import M0.C0135x;
import M0.C0136y;
import M0.C0137z;
import M0.F;
import M0.X;
import P0.z;
import android.os.Handler;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l1.e;

public final class K extends C1045k {

    /* renamed from: s  reason: collision with root package name */
    public static final C f12305s;

    /* renamed from: k  reason: collision with root package name */
    public final C1035a[] f12306k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f12307l;

    /* renamed from: m  reason: collision with root package name */
    public final X[] f12308m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f12309n;

    /* renamed from: o  reason: collision with root package name */
    public final C1048n f12310o;

    /* renamed from: p  reason: collision with root package name */
    public int f12311p = -1;

    /* renamed from: q  reason: collision with root package name */
    public long[][] f12312q;

    /* renamed from: r  reason: collision with root package name */
    public c f12313r;

    /* JADX WARNING: type inference failed for: r4v0, types: [M0.v, M0.w] */
    static {
        C0132u uVar = new C0132u();
        M m8 = O.f2026V;
        i0 i0Var = i0.f2073Y;
        Collections.emptyList();
        i0 i0Var2 = i0.f2073Y;
        C0135x xVar = new C0135x();
        f12305s = new C("MergingMediaSource", new C0133v(uVar), (C0137z) null, new C0136y(xVar), F.z, A.f2783a);
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [H3.u, java.lang.Object] */
    public K(C1035a... aVarArr) {
        C1048n nVar = new C1048n(0);
        this.f12306k = aVarArr;
        this.f12310o = nVar;
        this.f12309n = new ArrayList(Arrays.asList(aVarArr));
        this.f12307l = new ArrayList(aVarArr.length);
        for (int i = 0; i < aVarArr.length; i++) {
            this.f12307l.add(new ArrayList());
        }
        this.f12308m = new X[aVarArr.length];
        this.f12312q = new long[0][];
        new HashMap();
        C0103u.e(8, "expectedKeys");
        new Object().a().v0();
    }

    public final C1059z b(C1031B b8, e eVar, long j7) {
        C1035a[] aVarArr = this.f12306k;
        int length = aVarArr.length;
        C1059z[] zVarArr = new C1059z[length];
        X[] xArr = this.f12308m;
        int b9 = xArr[0].b(b8.f12277a);
        for (int i = 0; i < length; i++) {
            C1031B a8 = b8.a(xArr[i].l(b9));
            zVarArr[i] = aVarArr[i].b(a8, eVar, j7 - this.f12312q[b9][i]);
            ((List) this.f12307l.get(i)).add(new J(a8, zVarArr[i]));
        }
        return new I(this.f12310o, this.f12312q[b9], zVarArr);
    }

    public final C h() {
        C1035a[] aVarArr = this.f12306k;
        if (aVarArr.length > 0) {
            return aVarArr[0].h();
        }
        return f12305s;
    }

    public final void j() {
        c cVar = this.f12313r;
        if (cVar == null) {
            super.j();
            return;
        }
        throw cVar;
    }

    public final void l(R0.A a8) {
        this.f12491j = a8;
        this.i = z.m((Handler.Callback) null);
        int i = 0;
        while (true) {
            C1035a[] aVarArr = this.f12306k;
            if (i < aVarArr.length) {
                x(Integer.valueOf(i), aVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void n(C1059z zVar) {
        I i = (I) zVar;
        int i8 = 0;
        while (true) {
            C1035a[] aVarArr = this.f12306k;
            if (i8 < aVarArr.length) {
                List list = (List) this.f12307l.get(i8);
                int i9 = 0;
                while (true) {
                    if (i9 >= list.size()) {
                        break;
                    } else if (((J) list.get(i9)).f12304b.equals(zVar)) {
                        list.remove(i9);
                        break;
                    } else {
                        i9++;
                    }
                }
                C1035a aVar = aVarArr[i8];
                C1059z zVar2 = i.f12294U[i8];
                if (zVar2 instanceof e0) {
                    zVar2 = ((e0) zVar2).f12465U;
                }
                aVar.n(zVar2);
                i8++;
            } else {
                return;
            }
        }
    }

    public final void p() {
        super.p();
        Arrays.fill(this.f12308m, (Object) null);
        this.f12311p = -1;
        this.f12313r = null;
        ArrayList arrayList = this.f12309n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f12306k);
    }

    public final void s(C c8) {
        this.f12306k[0].s(c8);
    }

    public final C1031B t(Object obj, C1031B b8) {
        ArrayList arrayList = this.f12307l;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i = 0; i < list.size(); i++) {
            if (((J) list.get(i)).f12303a.equals(b8)) {
                return ((J) ((List) arrayList.get(0)).get(i)).f12303a;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [java.io.IOException, B2.c] */
    public final void w(Object obj, C1035a aVar, X x8) {
        Integer num = (Integer) obj;
        if (this.f12313r == null) {
            if (this.f12311p == -1) {
                this.f12311p = x8.h();
            } else if (x8.h() != this.f12311p) {
                this.f12313r = new IOException();
                return;
            }
            int length = this.f12312q.length;
            X[] xArr = this.f12308m;
            if (length == 0) {
                int i = this.f12311p;
                int[] iArr = new int[2];
                iArr[1] = xArr.length;
                iArr[0] = i;
                this.f12312q = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.f12309n;
            arrayList.remove(aVar);
            xArr[num.intValue()] = x8;
            if (arrayList.isEmpty()) {
                m(xArr[0]);
            }
        }
    }
}
