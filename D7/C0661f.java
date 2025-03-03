package d7;

import C7.d;
import P6.f;
import Q5.a;
import Y6.o;
import Y6.p;
import Y6.u;
import c7.C0625e;
import c7.h;
import java.util.ArrayList;

/* renamed from: d7.f  reason: case insensitive filesystem */
public final class C0661f {

    /* renamed from: a  reason: collision with root package name */
    public final h f9772a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9773b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9774c;

    /* renamed from: d  reason: collision with root package name */
    public final a f9775d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9776f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9777g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9778h;
    public int i;

    public C0661f(h hVar, ArrayList arrayList, int i8, a aVar, d dVar, int i9, int i10, int i11) {
        f.e(hVar, "call");
        this.f9772a = hVar;
        this.f9773b = arrayList;
        this.f9774c = i8;
        this.f9775d = aVar;
        this.e = dVar;
        this.f9776f = i9;
        this.f9777g = i10;
        this.f9778h = i11;
    }

    public static C0661f a(C0661f fVar, int i8, a aVar, d dVar, int i9) {
        if ((i9 & 1) != 0) {
            i8 = fVar.f9774c;
        }
        int i10 = i8;
        if ((i9 & 2) != 0) {
            aVar = fVar.f9775d;
        }
        a aVar2 = aVar;
        if ((i9 & 4) != 0) {
            dVar = fVar.e;
        }
        d dVar2 = dVar;
        int i11 = fVar.f9776f;
        int i12 = fVar.f9777g;
        int i13 = fVar.f9778h;
        fVar.getClass();
        f.e(dVar2, "request");
        return new C0661f(fVar.f9772a, fVar.f9773b, i10, aVar2, dVar2, i11, i12, i13);
    }

    public final u b(d dVar) {
        f.e(dVar, "request");
        ArrayList arrayList = this.f9773b;
        int size = arrayList.size();
        int i8 = this.f9774c;
        if (i8 < size) {
            this.i++;
            a aVar = this.f9775d;
            if (aVar != null) {
                if (!((C0625e) aVar.f4124c).d((o) dVar.f732V)) {
                    throw new IllegalStateException(("network interceptor " + arrayList.get(i8 - 1) + " must retain the same host and port").toString());
                } else if (this.i != 1) {
                    throw new IllegalStateException(("network interceptor " + arrayList.get(i8 - 1) + " must call proceed() exactly once").toString());
                }
            }
            int i9 = i8 + 1;
            C0661f a8 = a(this, i9, (a) null, dVar, 58);
            p pVar = (p) arrayList.get(i8);
            u a9 = pVar.a(a8);
            if (a9 == null) {
                throw new NullPointerException("interceptor " + pVar + " returned null");
            } else if (aVar != null && i9 < arrayList.size() && a8.i != 1) {
                throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
            } else if (a9.f6745a0 != null) {
                return a9;
            } else {
                throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }
}
