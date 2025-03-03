package i1;

import D2.G;
import K1.i;
import M0.C0132u;
import M0.r;
import P0.l;
import android.util.SparseArray;
import de.ozerov.fully.K2;
import p1.o;
import p1.q;
import p1.z;

/* renamed from: i1.d  reason: case insensitive filesystem */
public final class C1091d implements q {

    /* renamed from: d0  reason: collision with root package name */
    public static final G f12648d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final C0132u f12649e0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public final o f12650U;

    /* renamed from: V  reason: collision with root package name */
    public final int f12651V;

    /* renamed from: W  reason: collision with root package name */
    public final r f12652W;

    /* renamed from: X  reason: collision with root package name */
    public final SparseArray f12653X = new SparseArray();

    /* renamed from: Y  reason: collision with root package name */
    public boolean f12654Y;

    /* renamed from: Z  reason: collision with root package name */
    public K2 f12655Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f12656a0;

    /* renamed from: b0  reason: collision with root package name */
    public z f12657b0;

    /* renamed from: c0  reason: collision with root package name */
    public r[] f12658c0;

    /* JADX WARNING: type inference failed for: r0v0, types: [D2.G, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [M0.u, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.f1052V = new i(9);
        f12648d0 = obj;
    }

    public C1091d(o oVar, int i, r rVar) {
        this.f12650U = oVar;
        this.f12651V = i;
        this.f12652W = rVar;
    }

    public final void a(K2 k22, long j7, long j8) {
        this.f12655Z = k22;
        this.f12656a0 = j8;
        boolean z = this.f12654Y;
        o oVar = this.f12650U;
        if (!z) {
            oVar.l(this);
            if (j7 != -9223372036854775807L) {
                oVar.a(0, j7);
            }
            this.f12654Y = true;
            return;
        }
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        oVar.a(0, j7);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f12653X;
            if (i < sparseArray.size()) {
                C1090c cVar = (C1090c) sparseArray.valueAt(i);
                if (k22 == null) {
                    cVar.e = cVar.f12645c;
                } else {
                    cVar.f12647f = j8;
                    p1.G W7 = k22.W(cVar.f12643a);
                    cVar.e = W7;
                    r rVar = cVar.f12646d;
                    if (rVar != null) {
                        W7.c(rVar);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray = this.f12653X;
        r[] rVarArr = new r[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            r rVar = ((C1090c) sparseArray.valueAt(i)).f12646d;
            l.k(rVar);
            rVarArr[i] = rVar;
        }
        this.f12658c0 = rVarArr;
    }

    public final void l(z zVar) {
        this.f12657b0 = zVar;
    }

    public final p1.G q(int i, int i8) {
        boolean z;
        r rVar;
        SparseArray sparseArray = this.f12653X;
        C1090c cVar = (C1090c) sparseArray.get(i);
        if (cVar == null) {
            if (this.f12658c0 == null) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            if (i8 == this.f12651V) {
                rVar = this.f12652W;
            } else {
                rVar = null;
            }
            cVar = new C1090c(i, i8, rVar);
            K2 k22 = this.f12655Z;
            long j7 = this.f12656a0;
            if (k22 == null) {
                cVar.e = cVar.f12645c;
            } else {
                cVar.f12647f = j7;
                p1.G W7 = k22.W(i8);
                cVar.e = W7;
                r rVar2 = cVar.f12646d;
                if (rVar2 != null) {
                    W7.c(rVar2);
                }
            }
            sparseArray.put(i, cVar);
        }
        return cVar;
    }
}
