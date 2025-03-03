package D;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class C0 {
    public static final List i = Arrays.asList(new Integer[]{1, 5, 3});

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f747a;

    /* renamed from: b  reason: collision with root package name */
    public final C0044g f748b;

    /* renamed from: c  reason: collision with root package name */
    public final List f749c;

    /* renamed from: d  reason: collision with root package name */
    public final List f750d;
    public final List e;

    /* renamed from: f  reason: collision with root package name */
    public final A0 f751f;

    /* renamed from: g  reason: collision with root package name */
    public final I f752g;

    /* renamed from: h  reason: collision with root package name */
    public final InputConfiguration f753h;

    public C0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, I i8, A0 a02, InputConfiguration inputConfiguration, C0044g gVar) {
        this.f747a = arrayList;
        this.f749c = DesugarCollections.unmodifiableList(arrayList2);
        this.f750d = DesugarCollections.unmodifiableList(arrayList3);
        this.e = DesugarCollections.unmodifiableList(arrayList4);
        this.f751f = a02;
        this.f752g = i8;
        this.f753h = inputConfiguration;
        this.f748b = gVar;
    }

    public static C0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C0041e0 b8 = C0041e0.b();
        ArrayList arrayList5 = new ArrayList();
        C0045g0 a8 = C0045g0.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C0053k0 a9 = C0053k0.a(b8);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        H0 h02 = H0.f784b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a8.f785a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new C0(arrayList, arrayList2, arrayList3, arrayList4, new I(arrayList6, a9, -1, arrayList7, false, new H0(arrayMap), (C0064s) null), (A0) null, (InputConfiguration) null, (C0044g) null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f747a.iterator();
        while (it.hasNext()) {
            C0044g gVar = (C0044g) it.next();
            arrayList.add(gVar.f899a);
            for (N add : gVar.f900b) {
                arrayList.add(add);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
