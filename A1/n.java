package a1;

import M0.T;
import M0.r;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class n extends o {

    /* renamed from: l  reason: collision with root package name */
    public static final n f7104l = new n("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (r) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List f7105d;
    public final List e;

    /* renamed from: f  reason: collision with root package name */
    public final List f7106f;

    /* renamed from: g  reason: collision with root package name */
    public final List f7107g;

    /* renamed from: h  reason: collision with root package name */
    public final r f7108h;
    public final List i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f7109j;

    /* renamed from: k  reason: collision with root package name */
    public final List f7110k;

    public n(String str, List list, List list2, List list3, List list4, List list5, List list6, r rVar, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list2.size(); i8++) {
            Uri uri = ((m) list2.get(i8)).f7099a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f7105d = DesugarCollections.unmodifiableList(arrayList);
        this.e = DesugarCollections.unmodifiableList(list2);
        DesugarCollections.unmodifiableList(list3);
        this.f7106f = DesugarCollections.unmodifiableList(list4);
        this.f7107g = DesugarCollections.unmodifiableList(list5);
        DesugarCollections.unmodifiableList(list6);
        this.f7108h = rVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.i = list9;
        this.f7109j = DesugarCollections.unmodifiableMap(map);
        this.f7110k = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            Uri uri = ((l) list.get(i8)).f7096a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i8, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object obj = list.get(i9);
            int i10 = 0;
            while (true) {
                if (i10 >= list2.size()) {
                    break;
                }
                T t8 = (T) list2.get(i10);
                if (t8.f2860V == i8 && t8.f2861W == i9) {
                    arrayList.add(obj);
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    public final Object a(List list) {
        return new n(this.f7111a, this.f7112b, c(0, this.e, list), Collections.emptyList(), c(1, this.f7106f, list), c(2, this.f7107g, list), Collections.emptyList(), this.f7108h, this.i, this.f7113c, this.f7109j, this.f7110k);
    }
}
