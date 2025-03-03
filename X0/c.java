package X0;

import M0.C0135x;
import M0.T;
import P0.z;
import T7.C;
import android.net.Uri;
import e1.C0827a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class c implements C0827a {

    /* renamed from: a  reason: collision with root package name */
    public final long f6214a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6215b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6216c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6217d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6218f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6219g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6220h;
    public final C i;

    /* renamed from: j  reason: collision with root package name */
    public final C0135x f6221j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f6222k;

    /* renamed from: l  reason: collision with root package name */
    public final i f6223l;

    /* renamed from: m  reason: collision with root package name */
    public final List f6224m;

    public c(long j7, long j8, long j9, boolean z, long j10, long j11, long j12, long j13, i iVar, C c8, C0135x xVar, Uri uri, ArrayList arrayList) {
        this.f6214a = j7;
        this.f6215b = j8;
        this.f6216c = j9;
        this.f6217d = z;
        this.e = j10;
        this.f6218f = j11;
        this.f6219g = j12;
        this.f6220h = j13;
        this.f6223l = iVar;
        this.i = c8;
        this.f6222k = uri;
        this.f6221j = xVar;
        this.f6224m = arrayList;
    }

    public final Object a(List list) {
        long j7;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j8;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new T());
        ArrayList arrayList3 = new ArrayList();
        long j9 = 0;
        int i8 = 0;
        while (i8 < this.f6224m.size()) {
            if (((T) linkedList.peek()).f2859U != i8) {
                long c8 = c(i8);
                if (c8 != -9223372036854775807L) {
                    j9 += c8;
                }
                arrayList = arrayList3;
            } else {
                h b8 = b(i8);
                List list2 = b8.f6245c;
                T t8 = (T) linkedList.poll();
                int i9 = t8.f2859U;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i10 = t8.f2860V;
                    a aVar = (a) list2.get(i10);
                    List list3 = aVar.f6207c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(t8.f2861W));
                        t8 = (T) linkedList.poll();
                        if (!(t8.f2859U == i9 && t8.f2860V == i10)) {
                            arrayList2 = arrayList3;
                            j8 = j9;
                            arrayList4.add(new a(aVar.f6205a, aVar.f6206b, arrayList5, aVar.f6208d, aVar.e, aVar.f6209f));
                        }
                        arrayList5.add((m) list3.get(t8.f2861W));
                        t8 = (T) linkedList.poll();
                        break;
                    } while (t8.f2860V == i10);
                    arrayList2 = arrayList3;
                    j8 = j9;
                    arrayList4.add(new a(aVar.f6205a, aVar.f6206b, arrayList5, aVar.f6208d, aVar.e, aVar.f6209f));
                    if (t8.f2859U != i9) {
                        break;
                    }
                    arrayList3 = arrayList2;
                    j9 = j8;
                }
                linkedList.addFirst(t8);
                arrayList = arrayList2;
                arrayList.add(new h(b8.f6243a, b8.f6244b - j8, arrayList4, b8.f6246d));
                j9 = j8;
            }
            i8++;
            arrayList3 = arrayList;
        }
        ArrayList arrayList6 = arrayList3;
        long j10 = j9;
        long j11 = this.f6215b;
        if (j11 != -9223372036854775807L) {
            j7 = j11 - j10;
        } else {
            j7 = -9223372036854775807L;
        }
        return new c(this.f6214a, j7, this.f6216c, this.f6217d, this.e, this.f6218f, this.f6219g, this.f6220h, this.f6223l, this.i, this.f6221j, this.f6222k, arrayList6);
    }

    public final h b(int i8) {
        return (h) this.f6224m.get(i8);
    }

    public final long c(int i8) {
        List list = this.f6224m;
        if (i8 != list.size() - 1) {
            return ((h) list.get(i8 + 1)).f6244b - ((h) list.get(i8)).f6244b;
        }
        long j7 = this.f6215b;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j7 - ((h) list.get(i8)).f6244b;
    }

    public final long d(int i8) {
        return z.O(c(i8));
    }
}
