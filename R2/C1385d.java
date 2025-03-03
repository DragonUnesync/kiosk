package r2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;
import u2.u;
import v2.C1559b;
import v2.c;
import v2.e;
import y2.C1628c;

/* renamed from: r2.d  reason: case insensitive filesystem */
public final class C1385d extends F {

    /* renamed from: f  reason: collision with root package name */
    public final TreeMap f14876f = new TreeMap();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f14877g = null;

    public C1385d(C1387f fVar) {
        super("class_defs", fVar, 4);
    }

    public final Collection c() {
        ArrayList arrayList = this.f14877g;
        if (arrayList != null) {
            return arrayList;
        }
        return this.f14876f.values();
    }

    public final void k() {
        TreeMap treeMap = this.f14876f;
        int size = treeMap.size();
        this.f14877g = new ArrayList(size);
        int i = 0;
        for (c l8 : treeMap.keySet()) {
            i = l(l8, i, size - i);
        }
    }

    public final int l(c cVar, int i, int i8) {
        e eVar;
        C1384c cVar2 = (C1384c) this.f14876f.get(cVar);
        if (cVar2 == null || cVar2.f14904U >= 0) {
            return i;
        }
        if (i8 >= 0) {
            int i9 = i8 - 1;
            u uVar = cVar2.f14870X;
            if (uVar != null) {
                i = l(uVar.f15772U, i, i9);
            }
            C1381E e = cVar2.f14871Y;
            if (e == null) {
                eVar = C1559b.f16011W;
            } else {
                eVar = e.f14857Y;
            }
            int length = ((C1628c) eVar).f16371V.length;
            for (int i10 = 0; i10 < length; i10++) {
                i = l(eVar.b(i10), i, i9);
            }
            cVar2.g(i);
            this.f14877g.add(cVar2);
            return i + 1;
        }
        throw new RuntimeException("class circularity with " + cVar);
    }
}
