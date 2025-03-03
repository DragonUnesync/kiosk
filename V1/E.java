package V1;

import B.q0;
import H3.M;
import H3.O;
import H3.i0;
import M1.j;
import P0.l;
import P0.r;
import P0.w;
import R2.c;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1.o;
import p1.p;
import p1.q;

public final class E implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f5694a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5695b;

    /* renamed from: c  reason: collision with root package name */
    public final List f5696c;

    /* renamed from: d  reason: collision with root package name */
    public final r f5697d;
    public final SparseIntArray e;

    /* renamed from: f  reason: collision with root package name */
    public final C0347f f5698f;

    /* renamed from: g  reason: collision with root package name */
    public final j f5699g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray f5700h;
    public final SparseBooleanArray i;

    /* renamed from: j  reason: collision with root package name */
    public final SparseBooleanArray f5701j;

    /* renamed from: k  reason: collision with root package name */
    public final z f5702k;

    /* renamed from: l  reason: collision with root package name */
    public y f5703l;

    /* renamed from: m  reason: collision with root package name */
    public q f5704m;

    /* renamed from: n  reason: collision with root package name */
    public int f5705n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5706o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5707p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5708q;

    /* renamed from: r  reason: collision with root package name */
    public H f5709r;

    /* renamed from: s  reason: collision with root package name */
    public int f5710s;

    /* renamed from: t  reason: collision with root package name */
    public int f5711t;

    public E(int i8, int i9, j jVar, w wVar, C0347f fVar) {
        this.f5698f = fVar;
        this.f5694a = i8;
        this.f5695b = i9;
        this.f5699g = jVar;
        if (i8 == 1 || i8 == 2) {
            this.f5696c = Collections.singletonList(wVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5696c = arrayList;
            arrayList.add(wVar);
        }
        this.f5697d = new r(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.f5701j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f5700h = sparseArray;
        this.e = new SparseIntArray();
        this.f5702k = new z(1);
        this.f5704m = q.f14419T;
        this.f5711t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (H) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new D(new c(this)));
        this.f5709r = null;
    }

    public final void a(long j7, long j8) {
        boolean z;
        y yVar;
        boolean z6;
        if (this.f5694a != 2) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        List list = this.f5696c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            w wVar = (w) list.get(i8);
            if (wVar.e() == -9223372036854775807L) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                long d8 = wVar.d();
                if (d8 == -9223372036854775807L || d8 == 0 || d8 == j8) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            }
            if (z6) {
                wVar.g(j8);
            }
        }
        if (!(j8 == 0 || (yVar = this.f5703l) == null)) {
            yVar.d(j8);
        }
        this.f5697d.E(0);
        this.e.clear();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f5700h;
            if (i9 < sparseArray.size()) {
                ((H) sparseArray.valueAt(i9)).a();
                i9++;
            } else {
                this.f5710s = 0;
                return;
            }
        }
    }

    public final o c() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: V1.H} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r28, M0.C0132u r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = r28
            p1.l r2 = (p1.l) r2
            long r14 = r2.f14407W
            r2 = 0
            r12 = 1
            int r13 = r0.f5694a
            r10 = 2
            if (r13 != r10) goto L_0x0014
            r17 = 1
            goto L_0x0016
        L_0x0014:
            r17 = 0
        L_0x0016:
            boolean r3 = r0.f5706o
            r11 = 71
            r18 = -1
            if (r3 == 0) goto L_0x01b5
            V1.z r5 = r0.f5702k
            int r6 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x012e
            if (r17 != 0) goto L_0x012e
            boolean r6 = r5.f5967d
            if (r6 != 0) goto L_0x012e
            int r6 = r0.f5711t
            if (r6 > 0) goto L_0x0037
            r1 = r28
            p1.l r1 = (p1.l) r1
            r5.a(r1)
            goto L_0x012d
        L_0x0037:
            boolean r7 = r5.f5968f
            P0.r r8 = r5.f5966c
            r9 = 112800(0x1b8a0, float:1.58066E-40)
            if (r7 != 0) goto L_0x00a3
            r7 = r28
            p1.l r7 = (p1.l) r7
            long r9 = (long) r9
            long r13 = r7.f14407W
            long r9 = java.lang.Math.min(r9, r13)
            int r10 = (int) r9
            long r3 = (long) r10
            long r13 = r13 - r3
            long r3 = r7.f14408X
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0059
            r1.f3050a = r13
        L_0x0056:
            r2 = 1
            goto L_0x012d
        L_0x0059:
            r8.E(r10)
            r7.f14410Z = r2
            byte[] r1 = r8.f3732a
            r7.r(r1, r2, r10, r2)
            int r1 = r8.f3733b
            int r3 = r8.f3734c
            int r4 = r3 + -188
        L_0x0069:
            if (r4 < r1) goto L_0x0098
            byte[] r7 = r8.f3732a
            r9 = -4
            r10 = 0
        L_0x006f:
            r13 = 4
            if (r9 > r13) goto L_0x0095
            int r13 = r9 * 188
            int r13 = r13 + r4
            if (r13 < r1) goto L_0x0091
            if (r13 >= r3) goto L_0x0091
            byte r13 = r7[r13]
            if (r13 == r11) goto L_0x007e
            goto L_0x0091
        L_0x007e:
            int r10 = r10 + r12
            r13 = 5
            if (r10 != r13) goto L_0x0092
            long r9 = E.e.t(r8, r4, r6)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0095
            r3 = r9
            goto L_0x009d
        L_0x0091:
            r10 = 0
        L_0x0092:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x0095:
            int r4 = r4 + -1
            goto L_0x0069
        L_0x0098:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x009d:
            r5.f5970h = r3
            r5.f5968f = r12
            goto L_0x012d
        L_0x00a3:
            long r3 = r5.f5970h
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x00b7
            r1 = r28
            p1.l r1 = (p1.l) r1
            r5.a(r1)
            goto L_0x012d
        L_0x00b7:
            boolean r3 = r5.e
            if (r3 != 0) goto L_0x0104
            long r3 = (long) r9
            r7 = r28
            p1.l r7 = (p1.l) r7
            long r9 = r7.f14407W
            long r3 = java.lang.Math.min(r3, r9)
            int r4 = (int) r3
            long r9 = r7.f14408X
            long r13 = (long) r2
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x00d1
            r1.f3050a = r13
            goto L_0x0056
        L_0x00d1:
            r8.E(r4)
            r7.f14410Z = r2
            byte[] r1 = r8.f3732a
            r7.r(r1, r2, r4, r2)
            int r1 = r8.f3733b
            int r3 = r8.f3734c
        L_0x00df:
            if (r1 >= r3) goto L_0x00fa
            byte[] r4 = r8.f3732a
            byte r4 = r4[r1]
            if (r4 == r11) goto L_0x00e8
            goto L_0x00f7
        L_0x00e8:
            long r9 = E.e.t(r8, r1, r6)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00f7
            r3 = r9
            goto L_0x00ff
        L_0x00f7:
            int r1 = r1 + 1
            goto L_0x00df
        L_0x00fa:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00ff:
            r5.f5969g = r3
            r5.e = r12
            goto L_0x012d
        L_0x0104:
            long r3 = r5.f5969g
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0117
            r1 = r28
            p1.l r1 = (p1.l) r1
            r5.a(r1)
            goto L_0x012d
        L_0x0117:
            P0.w r1 = r5.f5965b
            long r3 = r1.b(r3)
            long r6 = r5.f5970h
            long r6 = r1.c(r6)
            long r6 = r6 - r3
            r5.i = r6
            r1 = r28
            p1.l r1 = (p1.l) r1
            r5.a(r1)
        L_0x012d:
            return r2
        L_0x012e:
            boolean r3 = r0.f5707p
            if (r3 != 0) goto L_0x0185
            r0.f5707p = r12
            long r6 = r5.i
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0176
            V1.y r8 = new V1.y
            int r3 = r0.f5711t
            h1.n r4 = new h1.n
            r9 = 12
            r4.<init>(r9)
            D2.o r9 = new D2.o
            P0.w r5 = r5.f5965b
            r9.<init>((int) r3, (P0.w) r5)
            r20 = 1
            long r20 = r6 + r20
            r16 = 940(0x3ac, float:1.317E-42)
            r22 = 0
            r24 = 188(0xbc, double:9.3E-322)
            r3 = r8
            r5 = r9
            r2 = r8
            r8 = r20
            r10 = r22
            r26 = r13
            r12 = r14
            r20 = r14
            r14 = r24
            r3.<init>(r4, r5, r6, r8, r10, r12, r14, r16)
            r0.f5703l = r2
            p1.q r3 = r0.f5704m
            p1.e r2 = r2.f5960a
            r3.l(r2)
            goto L_0x0189
        L_0x0176:
            r26 = r13
            r20 = r14
            p1.q r2 = r0.f5704m
            p1.s r3 = new p1.s
            r3.<init>(r6)
            r2.l(r3)
            goto L_0x0189
        L_0x0185:
            r26 = r13
            r20 = r14
        L_0x0189:
            boolean r2 = r0.f5708q
            if (r2 == 0) goto L_0x01a3
            r2 = 0
            r0.f5708q = r2
            r2 = 0
            r0.a(r2, r2)
            r4 = r28
            p1.l r4 = (p1.l) r4
            long r4 = r4.f14408X
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x01a3
            r1.f3050a = r2
            r2 = 1
            return r2
        L_0x01a3:
            r2 = 1
            V1.y r3 = r0.f5703l
            if (r3 == 0) goto L_0x01ba
            p1.f r4 = r3.f5962c
            if (r4 == 0) goto L_0x01ba
            r2 = r28
            p1.l r2 = (p1.l) r2
            int r1 = r3.b(r2, r1)
            return r1
        L_0x01b5:
            r26 = r13
            r20 = r14
            r2 = 1
        L_0x01ba:
            P0.r r1 = r0.f5697d
            byte[] r3 = r1.f3732a
            int r4 = r1.f3733b
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 >= r5) goto L_0x01d5
            int r4 = r1.a()
            if (r4 <= 0) goto L_0x01d2
            int r6 = r1.f3733b
            r7 = 0
            java.lang.System.arraycopy(r3, r6, r3, r7, r4)
        L_0x01d2:
            r1.F(r4, r3)
        L_0x01d5:
            int r4 = r1.a()
            android.util.SparseArray r6 = r0.f5700h
            if (r4 >= r5) goto L_0x0221
            int r4 = r1.f3734c
            int r7 = 9400 - r4
            r8 = r28
            p1.l r8 = (p1.l) r8
            int r7 = r8.x(r3, r4, r7)
            r8 = -1
            if (r7 != r8) goto L_0x021c
            r1 = 0
        L_0x01ed:
            int r3 = r6.size()
            if (r1 >= r3) goto L_0x021b
            java.lang.Object r3 = r6.valueAt(r1)
            V1.H r3 = (V1.H) r3
            boolean r4 = r3 instanceof V1.x
            if (r4 == 0) goto L_0x0218
            V1.x r3 = (V1.x) r3
            int r4 = r3.f5952c
            r5 = 3
            if (r4 != r5) goto L_0x0218
            int r4 = r3.f5957j
            if (r4 != r8) goto L_0x0218
            if (r17 == 0) goto L_0x0210
            V1.i r4 = r3.f5950a
            boolean r4 = r4 instanceof V1.k
            if (r4 != 0) goto L_0x0218
        L_0x0210:
            P0.r r4 = new P0.r
            r4.<init>()
            r3.c(r2, r4)
        L_0x0218:
            int r1 = r1 + 1
            goto L_0x01ed
        L_0x021b:
            return r8
        L_0x021c:
            int r4 = r4 + r7
            r1.G(r4)
            goto L_0x01d5
        L_0x0221:
            int r3 = r1.f3733b
            int r4 = r1.f3734c
            byte[] r5 = r1.f3732a
            r7 = r3
        L_0x0228:
            if (r7 >= r4) goto L_0x0233
            byte r8 = r5[r7]
            r9 = 71
            if (r8 == r9) goto L_0x0233
            int r7 = r7 + 1
            goto L_0x0228
        L_0x0233:
            r1.H(r7)
            int r5 = r7 + 188
            r8 = 0
            if (r5 <= r4) goto L_0x0253
            int r4 = r0.f5710s
            int r7 = r7 - r3
            int r7 = r7 + r4
            r0.f5710s = r7
            r3 = r26
            r4 = 2
            if (r3 != r4) goto L_0x024a
            r9 = 376(0x178, float:5.27E-43)
            if (r7 > r9) goto L_0x024c
        L_0x024a:
            r7 = 0
            goto L_0x0259
        L_0x024c:
            java.lang.String r1 = "Cannot find sync byte. Most likely not a Transport Stream."
            M0.J r1 = M0.J.a(r8, r1)
            throw r1
        L_0x0253:
            r3 = r26
            r4 = 2
            r7 = 0
            r0.f5710s = r7
        L_0x0259:
            int r9 = r1.f3734c
            if (r5 <= r9) goto L_0x025e
            return r7
        L_0x025e:
            int r10 = r1.i()
            r11 = 8388608(0x800000, float:1.17549435E-38)
            r11 = r11 & r10
            if (r11 == 0) goto L_0x026b
            r1.H(r5)
            return r7
        L_0x026b:
            r7 = 4194304(0x400000, float:5.877472E-39)
            r7 = r7 & r10
            if (r7 == 0) goto L_0x0272
            r12 = 1
            goto L_0x0273
        L_0x0272:
            r12 = 0
        L_0x0273:
            r7 = 2096896(0x1fff00, float:2.938377E-39)
            r7 = r7 & r10
            int r7 = r7 >> 8
            r11 = r10 & 32
            if (r11 == 0) goto L_0x027f
            r11 = 1
            goto L_0x0280
        L_0x027f:
            r11 = 0
        L_0x0280:
            r13 = r10 & 16
            if (r13 == 0) goto L_0x028b
            java.lang.Object r6 = r6.get(r7)
            r8 = r6
            V1.H r8 = (V1.H) r8
        L_0x028b:
            if (r8 != 0) goto L_0x0292
            r1.H(r5)
            r6 = 0
            return r6
        L_0x0292:
            r6 = 0
            if (r3 == r4) goto L_0x02b0
            r10 = r10 & 15
            android.util.SparseIntArray r13 = r0.e
            int r14 = r10 + -1
            int r14 = r13.get(r7, r14)
            r13.put(r7, r10)
            if (r14 != r10) goto L_0x02a8
            r1.H(r5)
            return r6
        L_0x02a8:
            int r14 = r14 + r2
            r6 = r14 & 15
            if (r10 == r6) goto L_0x02b0
            r8.a()
        L_0x02b0:
            if (r11 == 0) goto L_0x02c6
            int r6 = r1.v()
            int r10 = r1.v()
            r10 = r10 & 64
            if (r10 == 0) goto L_0x02c0
            r10 = 2
            goto L_0x02c1
        L_0x02c0:
            r10 = 0
        L_0x02c1:
            r12 = r12 | r10
            int r6 = r6 - r2
            r1.I(r6)
        L_0x02c6:
            boolean r6 = r0.f5706o
            if (r3 == r4) goto L_0x02d5
            if (r6 != 0) goto L_0x02d5
            android.util.SparseBooleanArray r10 = r0.f5701j
            r11 = 0
            boolean r7 = r10.get(r7, r11)
            if (r7 != 0) goto L_0x02de
        L_0x02d5:
            r1.G(r5)
            r8.c(r12, r1)
            r1.G(r9)
        L_0x02de:
            if (r3 == r4) goto L_0x02ec
            if (r6 != 0) goto L_0x02ec
            boolean r3 = r0.f5706o
            if (r3 == 0) goto L_0x02ec
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x02ec
            r0.f5708q = r2
        L_0x02ec:
            r1.H(r5)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.E.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        byte[] bArr = this.f5697d.f3732a;
        p1.l lVar = (p1.l) pVar;
        lVar.r(bArr, 0, 940, false);
        int i8 = 0;
        while (i8 < 188) {
            int i9 = 0;
            while (i9 < 5) {
                if (bArr[(i9 * 188) + i8] != 71) {
                    i8++;
                } else {
                    i9++;
                }
            }
            lVar.m(i8);
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        if ((this.f5695b & 1) == 0) {
            qVar = new q0(qVar, this.f5699g);
        }
        this.f5704m = qVar;
    }

    public final void release() {
    }
}
