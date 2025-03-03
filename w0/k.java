package W0;

import D2.G;
import H1.d;
import K1.i;
import L1.a;
import M0.I;
import P0.w;
import R0.h;
import X0.b;
import X0.c;
import X0.m;
import h1.C1036b;
import i1.C1091d;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import k1.r;
import l1.q;
import p1.o;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final q f6087a;

    /* renamed from: b  reason: collision with root package name */
    public final B3.q f6088b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f6089c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6090d;
    public final h e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6091f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6092g;

    /* renamed from: h  reason: collision with root package name */
    public final n f6093h;
    public final i[] i;

    /* renamed from: j  reason: collision with root package name */
    public r f6094j;

    /* renamed from: k  reason: collision with root package name */
    public c f6095k;

    /* renamed from: l  reason: collision with root package name */
    public int f6096l;

    /* renamed from: m  reason: collision with root package name */
    public C1036b f6097m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6098n;

    public k(G g8, q qVar, c cVar, B3.q qVar2, int i8, int[] iArr, r rVar, int i9, h hVar, long j7, int i10, boolean z, ArrayList arrayList, n nVar) {
        i[] iVarArr;
        C1091d dVar;
        o oVar;
        M0.r rVar2;
        G g9 = g8;
        c cVar2 = cVar;
        B3.q qVar3 = qVar2;
        int i11 = i8;
        r rVar3 = rVar;
        int i12 = i9;
        this.f6087a = qVar;
        this.f6095k = cVar2;
        this.f6088b = qVar3;
        this.f6089c = iArr;
        this.f6094j = rVar3;
        this.f6090d = i12;
        this.e = hVar;
        this.f6096l = i11;
        this.f6091f = j7;
        this.f6092g = i10;
        this.f6093h = nVar;
        long d8 = cVar2.d(i11);
        ArrayList a8 = a();
        this.i = new i[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.i.length) {
            m mVar = (m) a8.get(rVar3.g(i14));
            b k02 = qVar3.k0(mVar.f6259V);
            i[] iVarArr2 = this.i;
            b bVar = k02 == null ? (b) mVar.f6259V.get(i13) : k02;
            M0.r rVar4 = mVar.f6258U;
            g8.getClass();
            String str = rVar4.f3035m;
            if (!I.m(str)) {
                int i15 = 1;
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    rVar2 = rVar4;
                    iVarArr = iVarArr2;
                    oVar = new d((i) g9.f1052V, !g9.f1051U ? 3 : i15);
                    dVar = new C1091d(oVar, i12, rVar2);
                    int i16 = i14;
                    iVarArr[i16] = new i(d8, mVar, bVar, dVar, 0, mVar.c());
                    i14 = i16 + 1;
                    i13 = 0;
                } else if (Objects.equals(str, "image/jpeg")) {
                    oVar = new a(1);
                } else if (Objects.equals(str, "image/png")) {
                    oVar = new a(0, (byte) 0);
                } else {
                    int i17 = z ? 4 : 0;
                    rVar2 = rVar4;
                    iVarArr = iVarArr2;
                    oVar = new J1.k((i) g9.f1052V, !g9.f1051U ? i17 | 32 : i17, (w) null, arrayList, nVar);
                    dVar = new C1091d(oVar, i12, rVar2);
                    int i162 = i14;
                    iVarArr[i162] = new i(d8, mVar, bVar, dVar, 0, mVar.c());
                    i14 = i162 + 1;
                    i13 = 0;
                }
            } else if (!g9.f1051U) {
                dVar = null;
                iVarArr = iVarArr2;
                int i1622 = i14;
                iVarArr[i1622] = new i(d8, mVar, bVar, dVar, 0, mVar.c());
                i14 = i1622 + 1;
                i13 = 0;
            } else {
                oVar = new M1.h(((i) g9.f1052V).j(rVar4), rVar4);
            }
            rVar2 = rVar4;
            iVarArr = iVarArr2;
            dVar = new C1091d(oVar, i12, rVar2);
            int i16222 = i14;
            iVarArr[i16222] = new i(d8, mVar, bVar, dVar, 0, mVar.c());
            i14 = i16222 + 1;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f6095k.b(this.f6096l).f6245c;
        ArrayList arrayList = new ArrayList();
        for (int i8 : this.f6089c) {
            arrayList.addAll(((X0.a) list.get(i8)).f6207c);
        }
        return arrayList;
    }

    public final i b(int i8) {
        i[] iVarArr = this.i;
        i iVar = iVarArr[i8];
        b k02 = this.f6088b.k0(iVar.f6082b.f6259V);
        if (k02 == null || k02.equals(iVar.f6083c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.e, iVar.f6082b, k02, iVar.f6081a, iVar.f6085f, iVar.f6084d);
        iVarArr[i8] = iVar2;
        return iVar2;
    }
}
