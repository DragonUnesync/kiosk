package i1;

import D.O;
import D2.G;
import H3.P;
import M0.r;
import P0.l;
import P0.z;
import Q0.g;
import R2.c;
import S0.f;
import W0.b;
import W0.i;
import Y0.e;
import Y0.h;
import android.net.Uri;
import de.ozerov.fully.K2;
import h1.C1031B;
import h1.C1036b;
import h1.C1048n;
import h1.C1053t;
import h1.X;
import h1.Y;
import h1.a0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l1.k;
import l1.m;
import l1.n;
import l1.p;

/* renamed from: i1.g  reason: case insensitive filesystem */
public final class C1094g implements Y, a0, k, n {

    /* renamed from: U  reason: collision with root package name */
    public final int f12673U;

    /* renamed from: V  reason: collision with root package name */
    public final int[] f12674V;

    /* renamed from: W  reason: collision with root package name */
    public final r[] f12675W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean[] f12676X;

    /* renamed from: Y  reason: collision with root package name */
    public final W0.k f12677Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f12678Z;

    /* renamed from: a0  reason: collision with root package name */
    public final e f12679a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C1048n f12680b0;

    /* renamed from: c0  reason: collision with root package name */
    public final p f12681c0 = new p("ChunkSampleStream");

    /* renamed from: d0  reason: collision with root package name */
    public final G f12682d0 = new Object();

    /* renamed from: e0  reason: collision with root package name */
    public final ArrayList f12683e0;

    /* renamed from: f0  reason: collision with root package name */
    public final List f12684f0;

    /* renamed from: g0  reason: collision with root package name */
    public final X f12685g0;

    /* renamed from: h0  reason: collision with root package name */
    public final X[] f12686h0;

    /* renamed from: i0  reason: collision with root package name */
    public final K2 f12687i0;

    /* renamed from: j0  reason: collision with root package name */
    public C1092e f12688j0;

    /* renamed from: k0  reason: collision with root package name */
    public r f12689k0;

    /* renamed from: l0  reason: collision with root package name */
    public b f12690l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f12691m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f12692n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f12693o0;
    public C1088a p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12694q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f12695r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f12696s0;

    /* JADX WARNING: type inference failed for: r3v2, types: [D2.G, java.lang.Object] */
    public C1094g(int i, int[] iArr, r[] rVarArr, W0.k kVar, b bVar, l1.e eVar, long j7, h hVar, e eVar2, C1048n nVar, e eVar3, boolean z) {
        this.f12673U = i;
        this.f12674V = iArr;
        this.f12675W = rVarArr;
        this.f12677Y = kVar;
        this.f12678Z = bVar;
        this.f12679a0 = eVar3;
        this.f12680b0 = nVar;
        this.f12694q0 = z;
        ArrayList arrayList = new ArrayList();
        this.f12683e0 = arrayList;
        this.f12684f0 = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12686h0 = new X[length];
        this.f12676X = new boolean[length];
        int i8 = length + 1;
        int[] iArr2 = new int[i8];
        X[] xArr = new X[i8];
        hVar.getClass();
        X x8 = new X(eVar, hVar, eVar2);
        this.f12685g0 = x8;
        int i9 = 0;
        iArr2[0] = i;
        xArr[0] = x8;
        while (i9 < length) {
            X x9 = new X(eVar, (h) null, (e) null);
            this.f12686h0[i9] = x9;
            int i10 = i9 + 1;
            xArr[i10] = x9;
            iArr2[i10] = this.f12674V[i9];
            i9 = i10;
        }
        this.f12687i0 = new K2((Object) iArr2, 13, (Object) xArr);
        this.f12691m0 = j7;
        this.f12692n0 = j7;
    }

    public final void A(m mVar, long j7, long j8, boolean z) {
        C1092e eVar = (C1092e) mVar;
        this.f12688j0 = null;
        this.p0 = null;
        long j9 = eVar.f12659U;
        Uri uri = eVar.f12667c0.f4324W;
        C1053t tVar = new C1053t(j8);
        this.f12680b0.getClass();
        this.f12679a0.c(tVar, eVar.f12661W, this.f12673U, eVar.f12662X, eVar.f12663Y, eVar.f12664Z, eVar.f12665a0, eVar.f12666b0);
        if (!z) {
            if (x()) {
                this.f12685g0.D(false);
                for (X D8 : this.f12686h0) {
                    D8.D(false);
                }
            } else if (eVar instanceof C1088a) {
                ArrayList arrayList = this.f12683e0;
                q(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.f12691m0 = this.f12692n0;
                }
            }
            this.f12678Z.f0(this);
        }
    }

    public final void B(b bVar) {
        this.f12690l0 = bVar;
        X x8 = this.f12685g0;
        x8.j();
        P p3 = x8.f12413h;
        if (p3 != null) {
            p3.D0(x8.e);
            x8.f12413h = null;
            x8.f12412g = null;
        }
        for (X x9 : this.f12686h0) {
            x9.j();
            P p8 = x9.f12413h;
            if (p8 != null) {
                p8.D0(x9.e);
                x9.f12413h = null;
                x9.f12412g = null;
            }
        }
        this.f12681c0.e(this);
    }

    public final void a() {
        p pVar = this.f12681c0;
        pVar.a();
        this.f12685g0.y();
        if (!pVar.d()) {
            W0.k kVar = this.f12677Y;
            C1036b bVar = kVar.f6097m;
            if (bVar == null) {
                kVar.f6087a.a();
                return;
            }
            throw bVar;
        }
    }

    public final boolean b() {
        return this.f12681c0.d();
    }

    public final void c() {
        this.f12685g0.C();
        for (X C8 : this.f12686h0) {
            C8.C();
        }
        for (i iVar : this.f12677Y.i) {
            C1091d dVar = iVar.f6081a;
            if (dVar != null) {
                dVar.f12650U.release();
            }
        }
        b bVar = this.f12690l0;
        if (bVar != null) {
            synchronized (bVar) {
                W0.n nVar = (W0.n) bVar.f6024h0.remove(this);
                if (nVar != null) {
                    nVar.f6109a.C();
                }
            }
        }
    }

    public final long e() {
        if (x()) {
            return this.f12691m0;
        }
        if (this.f12696s0) {
            return Long.MIN_VALUE;
        }
        return v().f12666b0;
    }

    public final boolean g() {
        if (x() || !this.f12685g0.w(this.f12696s0)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v31, types: [java.io.IOException, h1.b] */
    /* JADX WARNING: type inference failed for: r41v3, types: [i1.h] */
    /* JADX WARNING: type inference failed for: r41v4, types: [i1.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x018a A[EDGE_INSN: B:204:0x018a->B:66:0x018a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(T0.I r66) {
        /*
            r65 = this;
            r0 = r65
            boolean r1 = r0.f12696s0
            if (r1 != 0) goto L_0x0014
            l1.p r1 = r0.f12681c0
            boolean r3 = r1.d()
            if (r3 != 0) goto L_0x0014
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0017
        L_0x0014:
            r1 = 0
            goto L_0x04e4
        L_0x0017:
            boolean r3 = r65.x()
            if (r3 == 0) goto L_0x0024
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.f12691m0
            goto L_0x002c
        L_0x0024:
            i1.a r4 = r65.v()
            long r5 = r4.f12666b0
            java.util.List r4 = r0.f12684f0
        L_0x002c:
            W0.k r15 = r0.f12677Y
            h1.b r7 = r15.f6097m
            D2.G r11 = r0.f12682d0
            if (r7 == 0) goto L_0x003b
            r38 = r1
            r17 = r3
            r0 = r11
            goto L_0x0420
        L_0x003b:
            r7 = r66
            long r8 = r7.f4675a
            long r16 = r5 - r8
            X0.c r7 = r15.f6095k
            r19 = r11
            long r10 = r7.f6214a
            long r10 = P0.z.O(r10)
            X0.c r7 = r15.f6095k
            int r2 = r15.f6096l
            X0.h r2 = r7.b(r2)
            long r12 = r2.f6244b
            long r12 = P0.z.O(r12)
            long r12 = r12 + r10
            long r12 = r12 + r5
            W0.n r2 = r15.f6093h
            if (r2 == 0) goto L_0x00da
            W0.o r2 = r2.e
            X0.c r7 = r2.f6118Z
            boolean r10 = r7.f6217d
            if (r10 != 0) goto L_0x006b
            r23 = r15
            r14 = 0
            goto L_0x00cd
        L_0x006b:
            boolean r10 = r2.f6120b0
            if (r10 == 0) goto L_0x0073
            r23 = r15
            r14 = 1
            goto L_0x00cd
        L_0x0073:
            java.util.TreeMap r10 = r2.f6117Y
            r23 = r15
            long r14 = r7.f6220h
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            java.util.Map$Entry r7 = r10.ceilingEntry(r7)
            W0.d r10 = r2.f6114V
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r11 = r7.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b2
            java.lang.Object r7 = r7.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            W0.g r7 = r10.f6038V
            long r13 = r7.f6061N
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r15 == 0) goto L_0x00ae
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x00b0
        L_0x00ae:
            r7.f6061N = r11
        L_0x00b0:
            r7 = 1
            goto L_0x00b3
        L_0x00b2:
            r7 = 0
        L_0x00b3:
            if (r7 == 0) goto L_0x00cc
            boolean r11 = r2.f6119a0
            if (r11 != 0) goto L_0x00ba
            goto L_0x00cc
        L_0x00ba:
            r11 = 1
            r2.f6120b0 = r11
            r11 = 0
            r2.f6119a0 = r11
            W0.g r2 = r10.f6038V
            android.os.Handler r10 = r2.f6051D
            W0.c r11 = r2.f6078w
            r10.removeCallbacks(r11)
            r2.y()
        L_0x00cc:
            r14 = r7
        L_0x00cd:
            if (r14 == 0) goto L_0x00d7
            r38 = r1
        L_0x00d1:
            r17 = r3
            r0 = r19
            goto L_0x0420
        L_0x00d7:
            r2 = r23
            goto L_0x00db
        L_0x00da:
            r2 = r15
        L_0x00db:
            long r10 = r2.f6091f
            long r10 = P0.z.y(r10)
            long r14 = P0.z.O(r10)
            X0.c r7 = r2.f6095k
            long r10 = r7.f6214a
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r23 != 0) goto L_0x00f8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0108
        L_0x00f8:
            int r12 = r2.f6096l
            X0.h r7 = r7.b(r12)
            long r12 = r7.f6244b
            long r10 = r10 + r12
            long r10 = P0.z.O(r10)
            long r10 = r14 - r10
            r12 = r10
        L_0x0108:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x0113
            r23 = 1
            r24 = 0
            goto L_0x0123
        L_0x0113:
            int r7 = r4.size()
            r23 = 1
            int r7 = r7 + -1
            java.lang.Object r7 = r4.get(r7)
            i1.j r7 = (i1.j) r7
            r24 = r7
        L_0x0123:
            k1.r r7 = r2.f6094j
            int r7 = r7.length()
            i1.k[] r10 = new i1.k[r7]
            r25 = r12
            r11 = 0
        L_0x012e:
            W0.i[] r12 = r2.i
            if (r11 >= r7) goto L_0x018a
            r12 = r12[r11]
            W0.h r13 = r12.f6084d
            h1.n r27 = i1.k.f12708Q
            if (r13 != 0) goto L_0x013f
            r10[r11] = r27
            r38 = r1
            goto L_0x0183
        L_0x013f:
            long r34 = r12.b(r14)
            long r36 = r12.c(r14)
            if (r24 == 0) goto L_0x0152
            long r12 = r24.a()
            r38 = r1
            r30 = r12
            goto L_0x016d
        L_0x0152:
            W0.h r13 = r12.f6084d
            P0.l.k(r13)
            r38 = r1
            long r0 = r12.e
            long r0 = r13.e(r5, r0)
            long r12 = r12.f6085f
            long r28 = r0 + r12
            r30 = r34
            r32 = r36
            long r0 = P0.z.j(r28, r30, r32)
            r30 = r0
        L_0x016d:
            int r0 = (r30 > r34 ? 1 : (r30 == r34 ? 0 : -1))
            if (r0 >= 0) goto L_0x0174
            r10[r11] = r27
            goto L_0x0183
        L_0x0174:
            W0.i r29 = r2.b(r11)
            W0.j r0 = new W0.j
            r28 = r0
            r32 = r36
            r28.<init>(r29, r30, r32)
            r10[r11] = r0
        L_0x0183:
            int r11 = r11 + 1
            r0 = r65
            r1 = r38
            goto L_0x012e
        L_0x018a:
            r38 = r1
            X0.c r0 = r2.f6095k
            boolean r0 = r0.f6217d
            r27 = r5
            r5 = 0
            if (r0 == 0) goto L_0x01a1
            r0 = 0
            r1 = r12[r0]
            long r29 = r1.d()
            int r1 = (r29 > r5 ? 1 : (r29 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01a7
        L_0x01a1:
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01df
        L_0x01a7:
            r1 = r12[r0]
            long r5 = r1.c(r14)
            r1 = r12[r0]
            long r0 = r1.e(r5)
            X0.c r5 = r2.f6095k
            long r6 = r5.f6214a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r11 != 0) goto L_0x01c3
            r5 = r21
            goto L_0x01d2
        L_0x01c3:
            int r11 = r2.f6096l
            X0.h r5 = r5.b(r11)
            long r11 = r5.f6244b
            long r6 = r6 + r11
            long r5 = P0.z.O(r6)
            long r5 = r14 - r5
        L_0x01d2:
            long r0 = java.lang.Math.min(r5, r0)
            long r0 = r0 - r8
            r5 = 0
            long r0 = java.lang.Math.max(r5, r0)
            r12 = r0
            goto L_0x01e1
        L_0x01df:
            r12 = r21
        L_0x01e1:
            k1.r r7 = r2.f6094j
            r5 = r10
            r1 = r19
            r0 = 0
            r10 = r16
            r39 = r25
            r41 = r14
            r6 = 1
            r14 = r4
            r15 = r5
            r7.b(r8, r10, r12, r14, r15)
            k1.r r5 = r2.f6094j
            int r5 = r5.o()
            android.os.SystemClock.elapsedRealtime()
            W0.i r5 = r2.b(r5)
            W0.h r7 = r5.f6084d
            X0.b r8 = r5.f6083c
            i1.d r9 = r5.f6081a
            X0.m r10 = r5.f6082b
            if (r9 == 0) goto L_0x025b
            M0.r[] r11 = r9.f12658c0
            if (r11 != 0) goto L_0x0211
            X0.j r11 = r10.f6262Y
            goto L_0x0212
        L_0x0211:
            r11 = r0
        L_0x0212:
            if (r7 != 0) goto L_0x0219
            X0.j r12 = r10.d()
            goto L_0x021a
        L_0x0219:
            r12 = r0
        L_0x021a:
            if (r11 != 0) goto L_0x021e
            if (r12 == 0) goto L_0x025b
        L_0x021e:
            k1.r r4 = r2.f6094j
            M0.r r16 = r4.m()
            k1.r r4 = r2.f6094j
            int r17 = r4.n()
            k1.r r4 = r2.f6094j
            java.lang.Object r18 = r4.r()
            if (r11 == 0) goto L_0x023d
            java.lang.String r4 = r8.f6210a
            X0.j r4 = r11.a(r12, r4)
            if (r4 != 0) goto L_0x023b
            goto L_0x0241
        L_0x023b:
            r11 = r4
            goto L_0x0241
        L_0x023d:
            r12.getClass()
            r11 = r12
        L_0x0241:
            java.lang.String r4 = r8.f6210a
            r7 = 0
            R0.l r15 = N7.a.b(r10, r4, r11, r7)
            i1.i r4 = new i1.i
            i1.d r5 = r5.f6081a
            R0.h r14 = r2.e
            r13 = r4
            r19 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.f1052V = r4
        L_0x0256:
            r0 = r1
            r17 = r3
            goto L_0x0420
        L_0x025b:
            X0.c r11 = r2.f6095k
            boolean r12 = r11.f6217d
            if (r12 == 0) goto L_0x026e
            int r12 = r2.f6096l
            java.util.List r11 = r11.f6224m
            int r11 = r11.size()
            int r11 = r11 - r6
            if (r12 != r11) goto L_0x026e
            r14 = 1
            goto L_0x026f
        L_0x026e:
            r14 = 0
        L_0x026f:
            long r12 = r5.e
            r15 = r7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x0280
            int r16 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x027e
            goto L_0x0280
        L_0x027e:
            r11 = 0
            goto L_0x0281
        L_0x0280:
            r11 = 1
        L_0x0281:
            long r16 = r5.d()
            r18 = 0
            int r21 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r21 != 0) goto L_0x028e
            r1.f1051U = r11
            goto L_0x0256
        L_0x028e:
            r6 = r41
            long r16 = r5.b(r6)
            long r6 = r5.c(r6)
            if (r14 == 0) goto L_0x02ae
            long r18 = r5.e(r6)
            long r21 = r5.f(r6)
            long r21 = r18 - r21
            long r21 = r21 + r18
            int r14 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x02ac
            r14 = 1
            goto L_0x02ad
        L_0x02ac:
            r14 = 0
        L_0x02ad:
            r11 = r11 & r14
        L_0x02ae:
            r19 = r1
            r14 = r11
            long r0 = r5.f6085f
            if (r24 == 0) goto L_0x02c0
            long r21 = r24.a()
            r63 = r21
            r21 = r10
            r10 = r63
            goto L_0x02d9
        L_0x02c0:
            P0.l.k(r15)
            r21 = r10
            r10 = r27
            long r24 = r15.e(r10, r12)
            long r29 = r24 + r0
            r31 = r16
            r33 = r6
            long r24 = P0.z.j(r29, r31, r33)
            r27 = r10
            r10 = r24
        L_0x02d9:
            int r22 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r22 >= 0) goto L_0x02e6
            h1.b r0 = new h1.b
            r0.<init>()
            r2.f6097m = r0
            goto L_0x00d1
        L_0x02e6:
            int r16 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r17 = r3
            if (r16 > 0) goto L_0x02f2
            boolean r3 = r2.f6098n
            if (r3 == 0) goto L_0x02f6
            if (r16 < 0) goto L_0x02f6
        L_0x02f2:
            r0 = r19
            goto L_0x041e
        L_0x02f6:
            if (r14 == 0) goto L_0x0308
            long r24 = r5.f(r10)
            int r3 = (r24 > r12 ? 1 : (r24 == r12 ? 0 : -1))
            if (r3 < 0) goto L_0x0308
            r14 = r19
            r3 = 1
            r14.f1051U = r3
            r0 = r14
            goto L_0x0420
        L_0x0308:
            r14 = r19
            int r3 = r2.f6092g
            r19 = r8
            r16 = r9
            long r8 = (long) r3
            long r6 = r6 - r10
            r22 = 1
            long r6 = r6 + r22
            long r6 = java.lang.Math.min(r8, r6)
            int r3 = (int) r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0336
        L_0x0324:
            r6 = 1
            if (r3 <= r6) goto L_0x0336
            long r6 = (long) r3
            long r6 = r6 + r10
            long r6 = r6 - r22
            long r6 = r5.f(r6)
            int r9 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x0336
            int r3 = r3 + -1
            goto L_0x0324
        L_0x0336:
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x033f
            r51 = r27
            goto L_0x0344
        L_0x033f:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0344:
            k1.r r4 = r2.f6094j
            M0.r r4 = r4.m()
            k1.r r6 = r2.f6094j
            int r45 = r6.n()
            k1.r r6 = r2.f6094j
            java.lang.Object r46 = r6.r()
            long r47 = r5.f(r10)
            P0.l.k(r15)
            long r6 = r10 - r0
            X0.j r6 = r15.F(r6)
            R0.h r7 = r2.e
            if (r16 != 0) goto L_0x0399
            long r49 = r5.e(r10)
            r0 = r39
            boolean r0 = r5.g(r10, r0)
            if (r0 == 0) goto L_0x0377
            r0 = r19
            r9 = 0
            goto L_0x037b
        L_0x0377:
            r0 = r19
            r9 = 8
        L_0x037b:
            java.lang.String r0 = r0.f6210a
            r1 = r21
            R0.l r43 = N7.a.b(r1, r0, r6, r9)
            i1.l r0 = new i1.l
            int r1 = r2.f6090d
            r41 = r0
            r42 = r7
            r44 = r4
            r51 = r10
            r53 = r1
            r54 = r4
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r54)
            r1 = r14
            goto L_0x041a
        L_0x0399:
            r2 = r19
            r9 = r21
            r61 = r39
            r16 = r7
            r19 = r14
            r7 = 1
            r14 = 1
        L_0x03a5:
            if (r14 >= r3) goto L_0x03c8
            r25 = r3
            r21 = r4
            long r3 = (long) r14
            long r3 = r3 + r10
            P0.l.k(r15)
            long r3 = r3 - r0
            X0.j r3 = r15.F(r3)
            java.lang.String r4 = r2.f6210a
            X0.j r3 = r6.a(r3, r4)
            if (r3 != 0) goto L_0x03be
            goto L_0x03ca
        L_0x03be:
            int r7 = r7 + 1
            int r14 = r14 + 1
            r6 = r3
            r4 = r21
            r3 = r25
            goto L_0x03a5
        L_0x03c8:
            r21 = r4
        L_0x03ca:
            long r0 = (long) r7
            long r0 = r0 + r10
            long r0 = r0 - r22
            long r49 = r5.e(r0)
            if (r8 == 0) goto L_0x03dd
            int r3 = (r12 > r49 ? 1 : (r12 == r49 ? 0 : -1))
            if (r3 > 0) goto L_0x03dd
            r53 = r12
            r3 = r61
            goto L_0x03e4
        L_0x03dd:
            r3 = r61
            r53 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03e4:
            boolean r0 = r5.g(r0, r3)
            if (r0 == 0) goto L_0x03ec
            r0 = 0
            goto L_0x03ee
        L_0x03ec:
            r0 = 8
        L_0x03ee:
            java.lang.String r1 = r2.f6210a
            R0.l r43 = N7.a.b(r9, r1, r6, r0)
            long r0 = r9.f6260W
            long r0 = -r0
            r2 = r21
            java.lang.String r3 = r2.f3036n
            boolean r3 = M0.I.l(r3)
            if (r3 == 0) goto L_0x0403
            long r0 = r0 + r47
        L_0x0403:
            r58 = r0
            i1.h r0 = new i1.h
            r41 = r0
            i1.d r1 = r5.f6081a
            r60 = r1
            r42 = r16
            r44 = r2
            r55 = r10
            r57 = r7
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r55, r57, r58, r60)
            r1 = r19
        L_0x041a:
            r1.f1052V = r0
            r0 = r1
            goto L_0x0420
        L_0x041e:
            r0.f1051U = r14
        L_0x0420:
            boolean r1 = r0.f1051U
            java.lang.Object r2 = r0.f1052V
            i1.e r2 = (i1.C1092e) r2
            r3 = 0
            r0.f1052V = r3
            r3 = 0
            r0.f1051U = r3
            if (r1 == 0) goto L_0x043b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r65
            r0.f12691m0 = r4
            r1 = 1
            r0.f12696s0 = r1
            return r1
        L_0x043b:
            r0 = r65
            if (r2 != 0) goto L_0x0440
            return r3
        L_0x0440:
            r0.f12688j0 = r2
            boolean r1 = r2 instanceof i1.C1088a
            de.ozerov.fully.K2 r3 = r0.f12687i0
            if (r1 == 0) goto L_0x04a5
            r1 = r2
            i1.a r1 = (i1.C1088a) r1
            if (r17 == 0) goto L_0x0484
            long r4 = r0.f12691m0
            long r6 = r1.f12665a0
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x047a
            h1.X r6 = r0.f12685g0
            r6.f12424t = r4
            h1.X[] r4 = r0.f12686h0
            int r5 = r4.length
            r6 = 0
        L_0x045d:
            if (r6 >= r5) goto L_0x0468
            r7 = r4[r6]
            long r8 = r0.f12691m0
            r7.f12424t = r8
            int r6 = r6 + 1
            goto L_0x045d
        L_0x0468:
            boolean r4 = r0.f12694q0
            if (r4 == 0) goto L_0x047a
            M0.r r4 = r1.f12662X
            java.lang.String r5 = r4.f3036n
            java.lang.String r4 = r4.f3033k
            boolean r4 = M0.I.a(r5, r4)
            r5 = 1
            r4 = r4 ^ r5
            r0.f12695r0 = r4
        L_0x047a:
            r4 = 0
            r0.f12694q0 = r4
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f12691m0 = r4
        L_0x0484:
            r1.f12638g0 = r3
            java.lang.Object r3 = r3.f10051W
            h1.X[] r3 = (h1.X[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x048e:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x049d
            r6 = r3[r5]
            int r7 = r6.f12421q
            int r6 = r6.f12420p
            int r7 = r7 + r6
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x048e
        L_0x049d:
            r1.f12639h0 = r4
            java.util.ArrayList r3 = r0.f12683e0
            r3.add(r1)
            goto L_0x04ae
        L_0x04a5:
            boolean r1 = r2 instanceof i1.i
            if (r1 == 0) goto L_0x04ae
            r1 = r2
            i1.i r1 = (i1.i) r1
            r1.f12704e0 = r3
        L_0x04ae:
            h1.n r1 = r0.f12680b0
            int r3 = r2.f12661W
            int r1 = r1.r(r3)
            r3 = r38
            long r8 = r3.f(r2, r0, r1)
            h1.t r13 = new h1.t
            long r5 = r2.f12659U
            R0.l r7 = r2.f12660V
            r4 = r13
            r4.<init>(r5, r7, r8)
            Y0.e r12 = r0.f12679a0
            int r1 = r2.f12663Y
            java.lang.Object r3 = r2.f12664Z
            int r14 = r2.f12661W
            int r15 = r0.f12673U
            M0.r r4 = r2.f12662X
            long r5 = r2.f12665a0
            long r7 = r2.f12666b0
            r16 = r4
            r17 = r1
            r18 = r3
            r19 = r5
            r21 = r7
            r12.g(r13, r14, r15, r16, r17, r18, r19, r21)
            r1 = 1
        L_0x04e4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1094g.h(T0.I):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final W1.e k(l1.m r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            r22 = this;
            r0 = r22
            r12 = r28
            r2 = 1
            r3 = r23
            i1.e r3 = (i1.C1092e) r3
            R0.z r4 = r3.f12667c0
            long r4 = r4.f4323V
            boolean r6 = r3 instanceof i1.C1088a
            java.util.ArrayList r7 = r0.f12683e0
            int r8 = r7.size()
            int r8 = r8 - r2
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0027
            if (r6 == 0) goto L_0x0027
            boolean r4 = r0.w(r8)
            if (r4 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            h1.t r5 = new h1.t
            R0.z r11 = r3.f12667c0
            android.net.Uri r11 = r11.f4324W
            r13 = r26
            r5.<init>(r13)
            long r13 = r3.f12665a0
            P0.z.c0(r13)
            long r9 = r3.f12666b0
            P0.z.c0(r9)
            D2.j r9 = new D2.j
            r10 = r29
            r9.<init>((int) r10, (java.lang.Object) r12)
            W0.k r10 = r0.f12677Y
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            h1.n r11 = r0.f12680b0
            if (r4 != 0) goto L_0x005a
            r20 = r3
            r19 = r5
            r16 = r7
            r18 = r8
        L_0x0057:
            r2 = 0
            goto L_0x0222
        L_0x005a:
            W0.n r1 = r10.f6093h
            r18 = r3
            if (r1 == 0) goto L_0x00a1
            long r2 = r1.f6112d
            int r19 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r19 == 0) goto L_0x006c
            int r19 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r19 >= 0) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            W0.o r1 = r1.e
            X0.c r3 = r1.f6118Z
            boolean r3 = r3.f6217d
            if (r3 != 0) goto L_0x0076
            goto L_0x00a1
        L_0x0076:
            boolean r3 = r1.f6120b0
            if (r3 == 0) goto L_0x007b
            goto L_0x0096
        L_0x007b:
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r1.f6119a0
            if (r2 != 0) goto L_0x0082
            goto L_0x0096
        L_0x0082:
            r2 = 1
            r1.f6120b0 = r2
            r2 = 0
            r1.f6119a0 = r2
            W0.d r1 = r1.f6114V
            W0.g r1 = r1.f6038V
            android.os.Handler r2 = r1.f6051D
            W0.c r3 = r1.f6078w
            r2.removeCallbacks(r3)
            r1.y()
        L_0x0096:
            r19 = r5
            r16 = r7
            r20 = r18
            r2 = 1
            r18 = r8
            goto L_0x0222
        L_0x00a1:
            X0.c r1 = r10.f6095k
            boolean r1 = r1.f6217d
            r2 = r18
            M0.r r3 = r2.f12662X
            W0.i[] r13 = r10.i
            if (r1 != 0) goto L_0x0102
            boolean r1 = r2 instanceof i1.j
            if (r1 == 0) goto L_0x0102
            boolean r1 = r12 instanceof R0.v
            if (r1 == 0) goto L_0x0102
            r1 = r12
            R0.v r1 = (R0.v) r1
            int r1 = r1.f4313X
            r14 = 404(0x194, float:5.66E-43)
            if (r1 != r14) goto L_0x0102
            k1.r r1 = r10.f6094j
            int r1 = r1.a(r3)
            r1 = r13[r1]
            long r18 = r1.d()
            r20 = -1
            int r14 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r14 == 0) goto L_0x0102
            r20 = 0
            int r14 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r14 == 0) goto L_0x0102
            W0.h r14 = r1.f6084d
            P0.l.k(r14)
            long r20 = r14.Z()
            long r14 = r1.f6085f
            long r20 = r20 + r14
            long r20 = r20 + r18
            r14 = 1
            long r20 = r20 - r14
            r1 = r2
            i1.j r1 = (i1.j) r1
            long r14 = r1.a()
            int r1 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x0102
            r1 = 1
            r10.f6098n = r1
        L_0x00f7:
            r20 = r2
            r19 = r5
            r16 = r7
            r18 = r8
        L_0x00ff:
            r2 = 1
            goto L_0x0222
        L_0x0102:
            k1.r r1 = r10.f6094j
            int r1 = r1.a(r3)
            r1 = r13[r1]
            X0.m r13 = r1.f6082b
            H3.O r13 = r13.f6259V
            B3.q r14 = r10.f6088b
            X0.b r13 = r14.k0(r13)
            X0.b r15 = r1.f6083c
            if (r13 == 0) goto L_0x011f
            boolean r13 = r15.equals(r13)
            if (r13 != 0) goto L_0x011f
            goto L_0x00f7
        L_0x011f:
            k1.r r13 = r10.f6094j
            X0.m r1 = r1.f6082b
            H3.O r1 = r1.f6259V
            r16 = r7
            r18 = r8
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r12 = r13.length()
            r20 = r2
            r19 = r5
            r2 = 0
            r5 = 0
        L_0x0137:
            if (r5 >= r12) goto L_0x0146
            boolean r21 = r13.d(r5, r7)
            r17 = 1
            if (r21 == 0) goto L_0x0143
            int r2 = r2 + 1
        L_0x0143:
            int r5 = r5 + 1
            goto L_0x0137
        L_0x0146:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = 0
        L_0x014c:
            int r8 = r1.size()
            if (r7 >= r8) goto L_0x0164
            java.lang.Object r8 = r1.get(r7)
            X0.b r8 = (X0.b) r8
            int r8 = r8.f6212c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.add(r8)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x014c
        L_0x0164:
            int r5 = r5.size()
            l1.i r7 = new l1.i
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r1 = r14.l(r1)
            r13 = 0
        L_0x0174:
            int r0 = r1.size()
            if (r13 >= r0) goto L_0x018c
            java.lang.Object r0 = r1.get(r13)
            X0.b r0 = (X0.b) r0
            int r0 = r0.f6212c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
            r0 = 1
            int r13 = r13 + r0
            goto L_0x0174
        L_0x018c:
            r0 = 1
            int r1 = r8.size()
            int r1 = r5 - r1
            r7.<init>(r5, r1, r12, r2)
            r1 = 2
            boolean r2 = r7.a(r1)
            if (r2 != 0) goto L_0x01a5
            boolean r2 = r7.a(r0)
            if (r2 != 0) goto L_0x01a5
            goto L_0x0057
        L_0x01a5:
            r11.getClass()
            W1.e r0 = h1.C1048n.p(r7, r9)
            if (r0 == 0) goto L_0x0057
            int r2 = r0.f6147a
            boolean r5 = r7.a(r2)
            if (r5 != 0) goto L_0x01b8
            goto L_0x0057
        L_0x01b8:
            long r7 = r0.f6148b
            if (r2 != r1) goto L_0x01c8
            k1.r r0 = r10.f6094j
            int r1 = r0.a(r3)
            boolean r0 = r0.p(r1, r7)
            r2 = r0
            goto L_0x0222
        L_0x01c8:
            r0 = 1
            if (r2 != r0) goto L_0x0057
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r7
            java.lang.String r2 = r15.f6211b
            java.lang.Object r3 = r14.f449U
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r5 = r3.containsKey(r2)
            if (r5 == 0) goto L_0x01ed
            java.lang.Object r5 = r3.get(r2)
            java.lang.Long r5 = (java.lang.Long) r5
            int r7 = P0.z.f3748a
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r0, r7)
            goto L_0x01ee
        L_0x01ed:
            r7 = r0
        L_0x01ee:
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r3.put(r2, r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r15.f6212c
            if (r3 == r2) goto L_0x00ff
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r14.f450V
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r5 = r3.containsKey(r2)
            if (r5 == 0) goto L_0x0219
            java.lang.Object r5 = r3.get(r2)
            java.lang.Long r5 = (java.lang.Long) r5
            int r7 = P0.z.f3748a
            long r7 = r5.longValue()
            long r0 = java.lang.Math.max(r0, r7)
        L_0x0219:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            goto L_0x00ff
        L_0x0222:
            r0 = 0
            if (r2 == 0) goto L_0x0257
            if (r4 == 0) goto L_0x024b
            r14 = r22
            if (r6 == 0) goto L_0x0246
            r8 = r18
            i1.a r1 = r14.q(r8)
            r2 = r20
            if (r1 != r2) goto L_0x0237
            r1 = 1
            goto L_0x0238
        L_0x0237:
            r1 = 0
        L_0x0238:
            P0.l.j(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x0248
            long r3 = r14.f12692n0
            r14.f12691m0 = r3
            goto L_0x0248
        L_0x0246:
            r2 = r20
        L_0x0248:
            W1.e r1 = l1.p.f13148Y
            goto L_0x025c
        L_0x024b:
            r14 = r22
            r2 = r20
            java.lang.String r1 = "ChunkSampleStream"
            java.lang.String r3 = "Ignoring attempt to cancel non-cancelable load."
            P0.l.B(r1, r3)
            goto L_0x025b
        L_0x0257:
            r14 = r22
            r2 = r20
        L_0x025b:
            r1 = r0
        L_0x025c:
            if (r1 != 0) goto L_0x0277
            r11.getClass()
            long r3 = h1.C1048n.s(r9)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0275
            W1.e r1 = new W1.e
            r5 = 0
            r1.<init>(r3, r5, r5)
            goto L_0x0277
        L_0x0275:
            W1.e r1 = l1.p.f13149Z
        L_0x0277:
            r15 = r1
            boolean r16 = r15.a()
            r1 = 1
            r13 = r16 ^ 1
            Y0.e r1 = r14.f12679a0
            long r8 = r2.f12665a0
            long r6 = r2.f12666b0
            int r3 = r2.f12661W
            int r4 = r14.f12673U
            M0.r r5 = r2.f12662X
            int r10 = r2.f12663Y
            java.lang.Object r12 = r2.f12664Z
            r2 = r19
            r17 = r6
            r6 = r10
            r7 = r12
            r19 = r11
            r10 = r17
            r12 = r28
            r1.e(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r16 != 0) goto L_0x02aa
            r14.f12688j0 = r0
            r19.getClass()
            W0.b r0 = r14.f12678Z
            r0.f0(r14)
        L_0x02aa:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1094g.k(l1.m, long, long, java.io.IOException, int):W1.e");
    }

    public final int l(c cVar, f fVar, int i) {
        if (x()) {
            return -3;
        }
        C1088a aVar = this.p0;
        X x8 = this.f12685g0;
        if (aVar != null && aVar.d(0) <= x8.r()) {
            return -3;
        }
        y();
        return x8.B(cVar, fVar, i, this.f12696s0);
    }

    public final long n() {
        if (this.f12696s0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f12691m0;
        }
        long j7 = this.f12692n0;
        C1088a v4 = v();
        if (!v4.b()) {
            ArrayList arrayList = this.f12683e0;
            if (arrayList.size() > 1) {
                v4 = (C1088a) g.l(2, arrayList);
            } else {
                v4 = null;
            }
        }
        if (v4 != null) {
            j7 = Math.max(j7, v4.f12666b0);
        }
        return Math.max(j7, this.f12685g0.o());
    }

    public final int o(long j7) {
        if (x()) {
            return 0;
        }
        X x8 = this.f12685g0;
        int t8 = x8.t(j7, this.f12696s0);
        C1088a aVar = this.p0;
        if (aVar != null) {
            t8 = Math.min(t8, aVar.d(0) - x8.r());
        }
        x8.H(t8);
        y();
        return t8;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [p1.z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(l1.m r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            i1.e r1 = (i1.C1092e) r1
            r2 = 0
            r0.f12688j0 = r2
            W0.k r3 = r0.f12677Y
            boolean r4 = r1 instanceof i1.i
            if (r4 == 0) goto L_0x004c
            r4 = r1
            i1.i r4 = (i1.i) r4
            k1.r r5 = r3.f6094j
            M0.r r4 = r4.f12662X
            int r4 = r5.a(r4)
            W0.i[] r5 = r3.i
            r6 = r5[r4]
            W0.h r7 = r6.f6084d
            if (r7 != 0) goto L_0x004c
            i1.d r7 = r6.f6081a
            P0.l.k(r7)
            p1.z r7 = r7.f12657b0
            boolean r8 = r7 instanceof p1.j
            if (r8 == 0) goto L_0x0030
            r2 = r7
            p1.j r2 = (p1.j) r2
        L_0x0030:
            if (r2 == 0) goto L_0x004c
            P5.E r15 = new P5.E
            X0.m r10 = r6.f6082b
            long r7 = r10.f6260W
            r9 = 1
            r15.<init>((java.lang.Object) r2, (long) r7, (int) r9)
            W0.i r2 = new W0.i
            i1.d r12 = r6.f6081a
            long r13 = r6.f6085f
            long r8 = r6.e
            X0.b r11 = r6.f6083c
            r7 = r2
            r7.<init>(r8, r10, r11, r12, r13, r15)
            r5[r4] = r2
        L_0x004c:
            W0.n r2 = r3.f6093h
            if (r2 == 0) goto L_0x006a
            long r3 = r2.f6112d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0061
            long r5 = r1.f12666b0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0065
        L_0x0061:
            long r3 = r1.f12666b0
            r2.f6112d = r3
        L_0x0065:
            r3 = 1
            W0.o r2 = r2.e
            r2.f6119a0 = r3
        L_0x006a:
            h1.t r5 = new h1.t
            long r2 = r1.f12659U
            R0.z r2 = r1.f12667c0
            android.net.Uri r2 = r2.f4324W
            r2 = r20
            r5.<init>(r2)
            h1.n r2 = r0.f12680b0
            r2.getClass()
            Y0.e r4 = r0.f12679a0
            long r11 = r1.f12665a0
            long r13 = r1.f12666b0
            int r6 = r1.f12661W
            int r7 = r0.f12673U
            M0.r r8 = r1.f12662X
            int r9 = r1.f12663Y
            java.lang.Object r10 = r1.f12664Z
            r4.d(r5, r6, r7, r8, r9, r10, r11, r13)
            W0.b r1 = r0.f12678Z
            r1.f0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1094g.p(l1.m, long, long):void");
    }

    public final C1088a q(int i) {
        ArrayList arrayList = this.f12683e0;
        C1088a aVar = (C1088a) arrayList.get(i);
        z.T(arrayList, i, arrayList.size());
        this.f12693o0 = Math.max(this.f12693o0, arrayList.size());
        int i8 = 0;
        this.f12685g0.l(aVar.d(0));
        while (true) {
            X[] xArr = this.f12686h0;
            if (i8 >= xArr.length) {
                return aVar;
            }
            X x8 = xArr[i8];
            i8++;
            x8.l(aVar.d(i8));
        }
    }

    public final void u(long j7) {
        int i;
        p pVar = this.f12681c0;
        if (!pVar.c() && !x()) {
            boolean d8 = pVar.d();
            W0.k kVar = this.f12677Y;
            ArrayList arrayList = this.f12683e0;
            boolean z = false;
            List list = this.f12684f0;
            if (d8) {
                C1092e eVar = this.f12688j0;
                eVar.getClass();
                boolean z6 = eVar instanceof C1088a;
                if (!z6 || !w(arrayList.size() - 1)) {
                    if (kVar.f6097m == null) {
                        z = kVar.f6094j.i(j7, eVar, list);
                    }
                    if (z) {
                        pVar.b();
                        if (z6) {
                            this.p0 = (C1088a) eVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (kVar.f6097m != null || kVar.f6094j.length() < 2) {
                i = list.size();
            } else {
                i = kVar.f6094j.h(j7, list);
            }
            if (i < arrayList.size()) {
                l.j(!pVar.d());
                int size = arrayList.size();
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    } else if (!w(i)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    long j8 = v().f12666b0;
                    C1088a q7 = q(i);
                    if (arrayList.isEmpty()) {
                        this.f12691m0 = this.f12692n0;
                    }
                    this.f12696s0 = false;
                    e eVar2 = this.f12679a0;
                    g1.g gVar = new g1.g(1, this.f12673U, (r) null, 3, (Object) null, z.c0(q7.f12665a0), z.c0(j8));
                    C1031B b8 = eVar2.f6316b;
                    b8.getClass();
                    eVar2.a(new O(eVar2, b8, gVar, 8));
                }
            }
        }
    }

    public final C1088a v() {
        return (C1088a) g.l(1, this.f12683e0);
    }

    public final boolean w(int i) {
        int r8;
        C1088a aVar = (C1088a) this.f12683e0.get(i);
        if (this.f12685g0.r() > aVar.d(0)) {
            return true;
        }
        int i8 = 0;
        do {
            X[] xArr = this.f12686h0;
            if (i8 >= xArr.length) {
                return false;
            }
            r8 = xArr[i8].r();
            i8++;
        } while (r8 <= aVar.d(i8));
        return true;
    }

    public final boolean x() {
        if (this.f12691m0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void y() {
        int z = z(this.f12685g0.r(), this.f12693o0 - 1);
        while (true) {
            int i = this.f12693o0;
            if (i <= z) {
                this.f12693o0 = i + 1;
                C1088a aVar = (C1088a) this.f12683e0.get(i);
                r rVar = aVar.f12662X;
                if (!rVar.equals(this.f12689k0)) {
                    r rVar2 = rVar;
                    this.f12679a0.b(this.f12673U, rVar2, aVar.f12663Y, aVar.f12664Z, aVar.f12665a0);
                }
                this.f12689k0 = rVar;
            } else {
                return;
            }
        }
    }

    public final int z(int i, int i8) {
        ArrayList arrayList;
        do {
            i8++;
            arrayList = this.f12683e0;
            if (i8 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((C1088a) arrayList.get(i8)).d(0) <= i);
        return i8 - 1;
    }
}
