package r2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import u2.C1490a;
import u2.c;
import u2.d;
import u2.e;
import u2.f;
import u2.g;
import u2.i;
import u2.j;
import u2.k;
import u2.n;
import u2.o;
import u2.s;
import u2.u;
import y2.C1627b;
import y2.C1628c;

/* renamed from: r2.b  reason: case insensitive filesystem */
public final class C1383b extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final u f14860Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f14861Z;

    /* renamed from: a0  reason: collision with root package name */
    public final HashMap f14862a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList f14863b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList f14864c0;

    /* renamed from: d0  reason: collision with root package name */
    public final ArrayList f14865d0;

    /* renamed from: e0  reason: collision with root package name */
    public c f14866e0;

    /* renamed from: f0  reason: collision with root package name */
    public byte[] f14867f0;

    public C1383b(u uVar) {
        super(1, -1);
        if (uVar != null) {
            this.f14860Y = uVar;
            this.f14861Z = new ArrayList(20);
            this.f14862a0 = new HashMap(40);
            this.f14863b0 = new ArrayList(20);
            this.f14864c0 = new ArrayList(20);
            this.f14865d0 = new ArrayList(20);
            this.f14866e0 = null;
            return;
        }
        throw new NullPointerException("thisClass == null");
    }

    public static void l(C1387f fVar, C1627b bVar, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (bVar.d()) {
                bVar.b(0, "  " + str + ":");
            }
            int i = 0;
            for (int i8 = 0; i8 < size; i8++) {
                i = ((i) arrayList.get(i8)).b(fVar, bVar, i, i8);
            }
        }
    }

    public static void n(C1627b bVar, String str, int i) {
        if (bVar.d()) {
            bVar.c(String.format("  %-21s %08x", new Object[]{str.concat("_size:"), Integer.valueOf(i)}));
        }
        bVar.m(i);
    }

    public final void a(C1387f fVar) {
        ArrayList arrayList = this.f14861Z;
        if (!arrayList.isEmpty()) {
            o();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.getClass();
                fVar.f14889h.m(hVar.f14898V);
            }
        }
        ArrayList arrayList2 = this.f14863b0;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                hVar2.getClass();
                fVar.f14889h.m(hVar2.f14898V);
            }
        }
        ArrayList arrayList3 = this.f14864c0;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                j jVar = (j) it3.next();
                jVar.getClass();
                fVar.i.m(jVar.f14900V);
                C1386e eVar = jVar.f14901W;
                if (eVar != null) {
                    fVar.f14883a.k(eVar);
                }
            }
        }
        ArrayList arrayList4 = this.f14865d0;
        if (!arrayList4.isEmpty()) {
            Collections.sort(arrayList4);
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                j jVar2 = (j) it4.next();
                jVar2.getClass();
                fVar.i.m(jVar2.f14900V);
                C1386e eVar2 = jVar2.f14901W;
                if (eVar2 != null) {
                    fVar.f14883a.k(eVar2);
                }
            }
        }
    }

    public final q b() {
        return q.TYPE_CLASS_DATA_ITEM;
    }

    public final void i(w wVar, int i) {
        C1627b bVar = new C1627b();
        m(wVar.f14851b, bVar);
        int i8 = bVar.f16368c;
        byte[] bArr = new byte[i8];
        System.arraycopy(bVar.f16367b, 0, bArr, 0, i8);
        this.f14867f0 = bArr;
        j(i8);
    }

    public final void k(C1387f fVar, C1627b bVar) {
        if (bVar.d()) {
            m(fVar, bVar);
        } else {
            bVar.h(this.f14867f0);
        }
    }

    public final void m(C1387f fVar, C1627b bVar) {
        boolean d8 = bVar.d();
        if (d8) {
            bVar.b(0, g() + " class data for " + this.f14860Y.f15772U.a());
        }
        ArrayList arrayList = this.f14861Z;
        n(bVar, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f14863b0;
        n(bVar, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f14864c0;
        n(bVar, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f14865d0;
        n(bVar, "virtual_methods", arrayList4.size());
        l(fVar, bVar, "static_fields", arrayList);
        l(fVar, bVar, "instance_fields", arrayList2);
        l(fVar, bVar, "direct_methods", arrayList3);
        l(fVar, bVar, "virtual_methods", arrayList4);
        if (d8) {
            bVar.e();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [u2.b, y2.f, y2.c] */
    public final c o() {
        HashMap hashMap;
        c cVar;
        C1490a aVar;
        if (this.f14866e0 == null) {
            ArrayList arrayList = this.f14861Z;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    hashMap = this.f14862a0;
                    if (size <= 0) {
                        break;
                    }
                    C1490a aVar2 = (C1490a) hashMap.get((h) arrayList.get(size - 1));
                    if (aVar2 instanceof n) {
                        if (((n) aVar2).h() != 0) {
                            break;
                        }
                    } else if (aVar2 != null) {
                        break;
                    }
                    size--;
                }
                if (size == 0) {
                    cVar = null;
                } else {
                    ? cVar2 = new C1628c(size);
                    for (int i = 0; i < size; i++) {
                        h hVar = (h) arrayList.get(i);
                        C1490a aVar3 = (C1490a) hashMap.get(hVar);
                        if (aVar3 == null) {
                            v2.c type = hVar.f14898V.getType();
                            switch (type.f16076V) {
                                case 1:
                                    aVar = d.f15747V;
                                    break;
                                case 2:
                                    aVar = e.f15749V;
                                    break;
                                case 3:
                                    aVar = f.f15750V;
                                    break;
                                case 4:
                                    aVar = g.f15751V;
                                    break;
                                case 5:
                                    aVar = i.f15752V;
                                    break;
                                case 6:
                                    aVar = j.f15754W;
                                    break;
                                case 7:
                                    aVar = o.f15758V;
                                    break;
                                case 8:
                                    aVar = s.f15765V;
                                    break;
                                case 9:
                                    aVar = k.f15755U;
                                    break;
                                default:
                                    throw new UnsupportedOperationException("no zero for type: " + type.a());
                            }
                            aVar3 = aVar;
                        }
                        cVar2.f(i, aVar3);
                    }
                    cVar2.f16382U = false;
                    cVar = new c(cVar2);
                }
                this.f14866e0 = cVar;
            }
        }
        return this.f14866e0;
    }

    public final boolean p() {
        if (!this.f14861Z.isEmpty() || !this.f14863b0.isEmpty() || !this.f14864c0.isEmpty() || !this.f14865d0.isEmpty()) {
            return false;
        }
        return true;
    }
}
