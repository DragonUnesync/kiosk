package u;

import D.A0;
import D.C0;
import D.C0036c;
import D.C0041e0;
import D.C0044g;
import D.C0045g0;
import D.C0053k0;
import D.C0064s;
import D.H0;
import D.I;
import D.K;
import D.L0;
import D.N0;
import D.O0;
import D.X;
import android.content.Context;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: u.A  reason: case insensitive filesystem */
public final class C1441A implements O0 {

    /* renamed from: b  reason: collision with root package name */
    public final C1450J f15489b;

    public C1441A(Context context) {
        this.f15489b = C1450J.b(context);
    }

    public final K a(N0 n02, int i) {
        int i8;
        int i9;
        Object obj;
        int i10;
        int i11;
        N0 n03 = n02;
        int i12 = i;
        C0041e0 b8 = C0041e0.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C0041e0 b9 = C0041e0.b();
        ArrayList arrayList = new ArrayList();
        C0045g0 a8 = C0045g0.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal = n02.ordinal();
        if (ordinal == 0) {
            if (i12 == 2) {
                i11 = 5;
            } else {
                i11 = 1;
            }
            i8 = i11;
        } else if (ordinal != 3) {
            i8 = 1;
        } else {
            i8 = 3;
        }
        C0036c cVar = L0.f810s;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C0053k0 a9 = C0053k0.a(b9);
        ArrayList arrayList10 = new ArrayList(arrayList);
        H0 h02 = H0.f784b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a8.f785a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        b8.e(cVar, new C0(arrayList5, arrayList6, arrayList7, arrayList8, new I(arrayList9, a9, i8, arrayList10, false, new H0(arrayMap), (C0064s) null), (A0) null, (InputConfiguration) null, (C0044g) null));
        b8.e(L0.f812u, C1485z.f15730a);
        HashSet hashSet2 = new HashSet();
        C0041e0 b10 = C0041e0.b();
        ArrayList arrayList11 = new ArrayList();
        C0045g0 a10 = C0045g0.a();
        int ordinal2 = n02.ordinal();
        if (ordinal2 == 0) {
            if (i12 == 2) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            i9 = i10;
        } else if (ordinal2 != 3) {
            i9 = 1;
        } else {
            i9 = 3;
        }
        C0036c cVar2 = L0.f811t;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        C0053k0 a11 = C0053k0.a(b10);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        H0 h03 = H0.f784b;
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = a10.f785a;
        for (String str2 : arrayMap4.keySet()) {
            arrayMap3.put(str2, arrayMap4.get(str2));
        }
        b8.e(cVar2, new I(arrayList12, a11, i9, arrayList13, false, new H0(arrayMap3), (C0064s) null));
        C0036c cVar3 = L0.f813v;
        if (n03 == N0.f830U) {
            obj = C1453M.f15527b;
        } else {
            obj = C1484y.f15729a;
        }
        b8.e(cVar3, obj);
        N0 n04 = N0.f831V;
        C1450J j7 = this.f15489b;
        if (n03 == n04) {
            b8.e(X.f872o, j7.e());
        }
        b8.e(X.f867j, Integer.valueOf(j7.c(true).getRotation()));
        if (n03 == N0.f833X || n03 == N0.f834Y) {
            b8.e(L0.f816y, Boolean.TRUE);
        }
        return C0053k0.a(b8);
    }
}
