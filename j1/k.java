package J1;

import A1.d;
import B.q0;
import H3.M;
import H3.O;
import H3.P;
import H3.i0;
import M0.C0125m;
import M0.C0126n;
import M0.C0129q;
import M0.I;
import M0.J;
import M0.r;
import M1.j;
import P0.l;
import P0.w;
import P0.z;
import Q0.c;
import Q0.g;
import Q0.s;
import Q0.t;
import W0.n;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p1.D;
import p1.G;
import p1.o;
import p1.p;
import p1.q;

public final class k implements o {

    /* renamed from: L  reason: collision with root package name */
    public static final byte[] f2378L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: M  reason: collision with root package name */
    public static final r f2379M;

    /* renamed from: A  reason: collision with root package name */
    public long f2380A;

    /* renamed from: B  reason: collision with root package name */
    public j f2381B;

    /* renamed from: C  reason: collision with root package name */
    public int f2382C;

    /* renamed from: D  reason: collision with root package name */
    public int f2383D;

    /* renamed from: E  reason: collision with root package name */
    public int f2384E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f2385F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f2386G;

    /* renamed from: H  reason: collision with root package name */
    public q f2387H;

    /* renamed from: I  reason: collision with root package name */
    public G[] f2388I;

    /* renamed from: J  reason: collision with root package name */
    public G[] f2389J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f2390K;

    /* renamed from: a  reason: collision with root package name */
    public final j f2391a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2392b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2393c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray f2394d;
    public final P0.r e = new P0.r(Q0.q.f4068a);

    /* renamed from: f  reason: collision with root package name */
    public final P0.r f2395f = new P0.r(5);

    /* renamed from: g  reason: collision with root package name */
    public final P0.r f2396g = new P0.r();

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f2397h;
    public final P0.r i;

    /* renamed from: j  reason: collision with root package name */
    public final w f2398j;

    /* renamed from: k  reason: collision with root package name */
    public final d f2399k = new d(0);

    /* renamed from: l  reason: collision with root package name */
    public final P0.r f2400l = new P0.r(16);

    /* renamed from: m  reason: collision with root package name */
    public final ArrayDeque f2401m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayDeque f2402n;

    /* renamed from: o  reason: collision with root package name */
    public final t f2403o;

    /* renamed from: p  reason: collision with root package name */
    public final n f2404p;

    /* renamed from: q  reason: collision with root package name */
    public i0 f2405q;

    /* renamed from: r  reason: collision with root package name */
    public int f2406r;

    /* renamed from: s  reason: collision with root package name */
    public int f2407s;

    /* renamed from: t  reason: collision with root package name */
    public long f2408t;

    /* renamed from: u  reason: collision with root package name */
    public int f2409u;

    /* renamed from: v  reason: collision with root package name */
    public P0.r f2410v;

    /* renamed from: w  reason: collision with root package name */
    public long f2411w;

    /* renamed from: x  reason: collision with root package name */
    public int f2412x;

    /* renamed from: y  reason: collision with root package name */
    public long f2413y;
    public long z;

    static {
        C0129q qVar = new C0129q();
        qVar.f2999m = I.o("application/x-emsg");
        f2379M = new r(qVar);
    }

    public k(j jVar, int i8, w wVar, List list, n nVar) {
        this.f2391a = jVar;
        this.f2392b = i8;
        this.f2398j = wVar;
        this.f2393c = DesugarCollections.unmodifiableList(list);
        this.f2404p = nVar;
        byte[] bArr = new byte[16];
        this.f2397h = bArr;
        this.i = new P0.r(bArr);
        this.f2401m = new ArrayDeque();
        this.f2402n = new ArrayDeque();
        this.f2394d = new SparseArray();
        M m8 = O.f2026V;
        this.f2405q = i0.f2073Y;
        this.z = -9223372036854775807L;
        this.f2413y = -9223372036854775807L;
        this.f2380A = -9223372036854775807L;
        this.f2387H = q.f14419T;
        this.f2388I = new G[0];
        this.f2389J = new G[0];
        this.f2403o = new t((s) new h(this));
    }

    public static C0126n b(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) arrayList.get(i8);
            if (cVar.f4018V == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = cVar.f4016W.f3732a;
                P i9 = q.i(bArr);
                if (i9 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i9.f2027U;
                }
                if (uuid == null) {
                    l.B("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0125m(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0126n((String) null, false, (C0125m[]) arrayList2.toArray(new C0125m[0]));
    }

    public static void d(P0.r rVar, int i8, t tVar) {
        boolean z6;
        rVar.H(i8 + 8);
        int i9 = rVar.i();
        byte[] bArr = f.f2359a;
        if ((i9 & 1) == 0) {
            if ((i9 & 2) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int z8 = rVar.z();
            if (z8 == 0) {
                Arrays.fill(tVar.f2480l, 0, tVar.e, false);
            } else if (z8 == tVar.e) {
                Arrays.fill(tVar.f2480l, 0, z8, z6);
                int a8 = rVar.a();
                P0.r rVar2 = tVar.f2482n;
                rVar2.E(a8);
                tVar.f2479k = true;
                tVar.f2483o = true;
                rVar.g(rVar2.f3732a, 0, rVar2.f3734c);
                rVar2.H(0);
                tVar.f2483o = false;
            } else {
                StringBuilder p3 = g.p(z8, "Senc sample count ", " is different from fragment sample count");
                p3.append(tVar.e);
                throw J.a((RuntimeException) null, p3.toString());
            }
        } else {
            throw J.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    public final void a(long j7, long j8) {
        SparseArray sparseArray = this.f2394d;
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((j) sparseArray.valueAt(i8)).e();
        }
        this.f2402n.clear();
        this.f2412x = 0;
        this.f2403o.d(0);
        this.f2413y = j8;
        this.f2401m.clear();
        this.f2406r = 0;
        this.f2409u = 0;
    }

    public final o c() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: J1.j} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0212, code lost:
        if ((r2 & 31) != 6) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0220, code lost:
        if (M0.I.c(r13, "video/hevc") == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0228, code lost:
        if (((r2 & 126) >> 1) != 39) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022a, code lost:
        r2 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r34, M0.C0132u r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            r2 = 1
        L_0x0005:
            int r3 = r0.f2406r
            java.util.ArrayDeque r4 = r0.f2401m
            android.util.SparseArray r5 = r0.f2394d
            Q0.t r9 = r0.f2403o
            r13 = 2
            if (r3 == 0) goto L_0x0652
            java.util.ArrayDeque r14 = r0.f2402n
            P0.w r15 = r0.f2398j
            java.lang.String r8 = "FragmentedMp4Extractor"
            if (r3 == r2) goto L_0x03f2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == r13) goto L_0x039b
            J1.j r3 = r0.f2381B
            if (r3 != 0) goto L_0x00b2
            int r3 = r5.size()
            r10 = 0
            r13 = 0
        L_0x0029:
            if (r13 >= r3) goto L_0x0064
            java.lang.Object r20 = r5.valueAt(r13)
            r7 = r20
            J1.j r7 = (J1.j) r7
            boolean r11 = r7.f2377l
            if (r11 != 0) goto L_0x003f
            int r4 = r7.f2372f
            J1.u r12 = r7.f2371d
            int r12 = r12.f2487b
            if (r4 == r12) goto L_0x0062
        L_0x003f:
            J1.t r4 = r7.f2369b
            if (r11 == 0) goto L_0x004a
            int r12 = r7.f2374h
            int r6 = r4.f2474d
            if (r12 != r6) goto L_0x004a
            goto L_0x0062
        L_0x004a:
            if (r11 != 0) goto L_0x0055
            J1.u r4 = r7.f2371d
            long[] r4 = r4.f2488c
            int r6 = r7.f2372f
            r11 = r4[r6]
            goto L_0x005b
        L_0x0055:
            long[] r4 = r4.f2475f
            int r6 = r7.f2374h
            r11 = r4[r6]
        L_0x005b:
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x0062
            r10 = r7
            r16 = r11
        L_0x0062:
            int r13 = r13 + r2
            goto L_0x0029
        L_0x0064:
            if (r10 != 0) goto L_0x0085
            long r3 = r0.f2411w
            r5 = r1
            p1.l r5 = (p1.l) r5
            long r5 = r5.f14408X
            long r3 = r3 - r5
            int r4 = (int) r3
            if (r4 < 0) goto L_0x007d
            r3 = r1
            p1.l r3 = (p1.l) r3
            r3.m(r4)
            r3 = 0
            r0.f2406r = r3
            r0.f2409u = r3
            goto L_0x0005
        L_0x007d:
            java.lang.String r1 = "Offset to end of mdat was negative."
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0085:
            boolean r3 = r10.f2377l
            if (r3 != 0) goto L_0x0092
            J1.u r3 = r10.f2371d
            long[] r3 = r3.f2488c
            int r4 = r10.f2372f
            r4 = r3[r4]
            goto L_0x009a
        L_0x0092:
            J1.t r3 = r10.f2369b
            long[] r3 = r3.f2475f
            int r4 = r10.f2374h
            r4 = r3[r4]
        L_0x009a:
            r3 = r1
            p1.l r3 = (p1.l) r3
            long r6 = r3.f14408X
            long r4 = r4 - r6
            int r3 = (int) r4
            if (r3 >= 0) goto L_0x00a9
            java.lang.String r3 = "Ignoring negative offset to sample data."
            P0.l.B(r8, r3)
            r3 = 0
        L_0x00a9:
            r4 = r1
            p1.l r4 = (p1.l) r4
            r4.m(r3)
            r0.f2381B = r10
            r3 = r10
        L_0x00b2:
            int r4 = r0.f2406r
            r5 = 6
            int r6 = r0.f2392b
            java.lang.String r7 = "video/avc"
            J1.t r8 = r3.f2369b
            r10 = 3
            if (r4 != r10) goto L_0x0182
            boolean r4 = r3.f2377l
            if (r4 != 0) goto L_0x00cb
            J1.u r4 = r3.f2371d
            int[] r4 = r4.f2489d
            int r10 = r3.f2372f
            r4 = r4[r10]
            goto L_0x00d1
        L_0x00cb:
            int[] r4 = r8.f2477h
            int r10 = r3.f2372f
            r4 = r4[r10]
        L_0x00d1:
            r0.f2382C = r4
            r4 = r6 & 64
            if (r4 == 0) goto L_0x00e8
            J1.u r4 = r3.f2371d
            J1.r r4 = r4.f2486a
            M0.r r4 = r4.f2462g
            java.lang.String r4 = r4.f3036n
            boolean r4 = j$.util.Objects.equals(r4, r7)
            if (r4 != 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r4 = 0
            goto L_0x00e9
        L_0x00e8:
            r4 = 1
        L_0x00e9:
            r0.f2385F = r4
            int r4 = r3.f2372f
            int r10 = r3.i
            if (r4 >= r10) goto L_0x012c
            int r2 = r0.f2382C
            p1.l r1 = (p1.l) r1
            r1.m(r2)
            J1.s r1 = r3.b()
            if (r1 != 0) goto L_0x00ff
            goto L_0x011d
        L_0x00ff:
            P0.r r2 = r8.f2482n
            int r1 = r1.f2470d
            if (r1 == 0) goto L_0x0108
            r2.I(r1)
        L_0x0108:
            int r1 = r3.f2372f
            boolean r4 = r8.f2479k
            if (r4 == 0) goto L_0x011d
            boolean[] r4 = r8.f2480l
            boolean r1 = r4[r1]
            if (r1 == 0) goto L_0x011d
            int r1 = r2.B()
            int r1 = r1 * 6
            r2.I(r1)
        L_0x011d:
            boolean r1 = r3.c()
            if (r1 != 0) goto L_0x0126
            r1 = 0
            r0.f2381B = r1
        L_0x0126:
            r1 = 3
            r0.f2406r = r1
        L_0x0129:
            r1 = 0
            goto L_0x039a
        L_0x012c:
            J1.u r4 = r3.f2371d
            J1.r r4 = r4.f2486a
            int r4 = r4.f2463h
            if (r4 != r2) goto L_0x0141
            int r4 = r0.f2382C
            r10 = 8
            int r4 = r4 - r10
            r0.f2382C = r4
            r4 = r1
            p1.l r4 = (p1.l) r4
            r4.m(r10)
        L_0x0141:
            J1.u r4 = r3.f2371d
            J1.r r4 = r4.f2486a
            M0.r r4 = r4.f2462g
            java.lang.String r4 = r4.f3036n
            java.lang.String r10 = "audio/ac4"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x016d
            int r4 = r0.f2382C
            r10 = 7
            int r4 = r3.d(r4, r10)
            r0.f2383D = r4
            int r4 = r0.f2382C
            P0.r r11 = r0.i
            p1.C1332b.h(r4, r11)
            p1.G r4 = r3.f2368a
            r4.a(r10, r11)
            int r4 = r0.f2383D
            int r4 = r4 + r10
            r0.f2383D = r4
            r10 = 0
            goto L_0x0176
        L_0x016d:
            int r4 = r0.f2382C
            r10 = 0
            int r4 = r3.d(r4, r10)
            r0.f2383D = r4
        L_0x0176:
            int r4 = r0.f2382C
            int r11 = r0.f2383D
            int r4 = r4 + r11
            r0.f2382C = r4
            r4 = 4
            r0.f2406r = r4
            r0.f2384E = r10
        L_0x0182:
            J1.u r4 = r3.f2371d
            boolean r10 = r3.f2377l
            if (r10 != 0) goto L_0x018f
            long[] r8 = r4.f2490f
            int r10 = r3.f2372f
            r10 = r8[r10]
            goto L_0x0195
        L_0x018f:
            int r10 = r3.f2372f
            long[] r8 = r8.i
            r10 = r8[r10]
        L_0x0195:
            if (r15 == 0) goto L_0x019b
            long r10 = r15.a(r10)
        L_0x019b:
            J1.r r4 = r4.f2486a
            int r8 = r4.f2465k
            p1.G r12 = r3.f2368a
            if (r8 == 0) goto L_0x030a
            P0.r r13 = r0.f2395f
            byte[] r5 = r13.f3732a
            r17 = 0
            r5[r17] = r17
            r5[r2] = r17
            r19 = 2
            r5[r19] = r17
            r30 = r15
            int r15 = r8 + 1
            r17 = 4
            int r8 = 4 - r8
        L_0x01b9:
            int r2 = r0.f2383D
            r31 = r14
            int r14 = r0.f2382C
            if (r2 >= r14) goto L_0x0307
            int r2 = r0.f2384E
            java.lang.String r14 = "video/hevc"
            r17 = r6
            M0.r r6 = r4.f2462g
            if (r2 != 0) goto L_0x0271
            r2 = r1
            p1.l r2 = (p1.l) r2
            r19 = r4
            r4 = 0
            r2.c(r5, r8, r15, r4)
            r13.H(r4)
            int r2 = r13.i()
            r4 = 1
            if (r2 < r4) goto L_0x0269
            int r2 = r2 - r4
            r0.f2384E = r2
            P0.r r2 = r0.e
            r4 = 0
            r2.H(r4)
            r4 = 4
            r12.a(r4, r2)
            r2 = 1
            r12.a(r2, r13)
            p1.G[] r2 = r0.f2389J
            int r2 = r2.length
            if (r2 <= 0) goto L_0x022c
            byte r2 = r5[r4]
            java.lang.String r4 = r6.f3036n
            boolean r4 = j$.util.Objects.equals(r4, r7)
            r20 = r13
            java.lang.String r13 = r6.f3033k
            if (r4 != 0) goto L_0x020d
            java.lang.String r4 = M0.I.c(r13, r7)
            if (r4 == 0) goto L_0x0209
            goto L_0x020d
        L_0x0209:
            r23 = r15
            r15 = 6
            goto L_0x0214
        L_0x020d:
            r4 = r2 & 31
            r23 = r15
            r15 = 6
            if (r4 == r15) goto L_0x022a
        L_0x0214:
            java.lang.String r4 = r6.f3036n
            boolean r4 = j$.util.Objects.equals(r4, r14)
            if (r4 != 0) goto L_0x0222
            java.lang.String r4 = M0.I.c(r13, r14)
            if (r4 == 0) goto L_0x0231
        L_0x0222:
            r2 = r2 & 126(0x7e, float:1.77E-43)
            r4 = 1
            int r2 = r2 >> r4
            r4 = 39
            if (r2 != r4) goto L_0x0231
        L_0x022a:
            r2 = 1
            goto L_0x0232
        L_0x022c:
            r20 = r13
            r23 = r15
            r15 = 6
        L_0x0231:
            r2 = 0
        L_0x0232:
            r0.f2386G = r2
            int r2 = r0.f2383D
            int r2 = r2 + 5
            r0.f2383D = r2
            int r2 = r0.f2382C
            int r2 = r2 + r8
            r0.f2382C = r2
            boolean r2 = r0.f2385F
            if (r2 != 0) goto L_0x025d
            J1.u r2 = r3.f2371d
            J1.r r2 = r2.f2486a
            M0.r r2 = r2.f2462g
            java.lang.String r2 = r2.f3036n
            boolean r2 = j$.util.Objects.equals(r2, r7)
            if (r2 == 0) goto L_0x025d
            r2 = 4
            byte r4 = r5[r2]
            boolean r2 = Q0.q.c(r4)
            if (r2 == 0) goto L_0x025d
            r2 = 1
            r0.f2385F = r2
        L_0x025d:
            r6 = r17
            r4 = r19
            r13 = r20
            r15 = r23
        L_0x0265:
            r14 = r31
            goto L_0x01b9
        L_0x0269:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0271:
            r19 = r4
            r20 = r13
            r23 = r15
            r15 = 6
            boolean r4 = r0.f2386G
            if (r4 == 0) goto L_0x02ea
            P0.r r4 = r0.f2396g
            r4.E(r2)
            byte[] r2 = r4.f3732a
            int r13 = r0.f2384E
            r15 = r1
            p1.l r15 = (p1.l) r15
            r24 = r5
            r5 = 0
            r15.c(r2, r5, r13, r5)
            int r2 = r0.f2384E
            r12.a(r2, r4)
            int r2 = r0.f2384E
            byte[] r5 = r4.f3732a
            int r13 = r4.f3734c
            int r5 = Q0.q.k(r13, r5)
            java.lang.String r13 = r6.f3036n
            boolean r13 = j$.util.Objects.equals(r13, r14)
            if (r13 != 0) goto L_0x02b0
            java.lang.String r13 = r6.f3033k
            java.lang.String r13 = M0.I.c(r13, r14)
            if (r13 == 0) goto L_0x02ae
            goto L_0x02b0
        L_0x02ae:
            r13 = 0
            goto L_0x02b1
        L_0x02b0:
            r13 = 1
        L_0x02b1:
            r4.H(r13)
            r4.G(r5)
            int r5 = r6.f3038p
            r6 = -1
            if (r5 != r6) goto L_0x02c7
            int r5 = r9.f4074a
            if (r5 == 0) goto L_0x02d8
            r5 = 0
            r9.f4074a = r5
            r9.d(r5)
            goto L_0x02d8
        L_0x02c7:
            int r6 = r9.f4074a
            if (r6 == r5) goto L_0x02d8
            if (r5 < 0) goto L_0x02cf
            r6 = 1
            goto L_0x02d0
        L_0x02cf:
            r6 = 0
        L_0x02d0:
            P0.l.j(r6)
            r9.f4074a = r5
            r9.d(r5)
        L_0x02d8:
            r9.a(r10, r4)
            int r4 = r3.a()
            r5 = 4
            r4 = r4 & r5
            if (r4 == 0) goto L_0x02e8
            r4 = 0
            r9.d(r4)
            goto L_0x02f1
        L_0x02e8:
            r4 = 0
            goto L_0x02f1
        L_0x02ea:
            r24 = r5
            r4 = 0
            int r2 = r12.b(r1, r2, r4)
        L_0x02f1:
            int r4 = r0.f2383D
            int r4 = r4 + r2
            r0.f2383D = r4
            int r4 = r0.f2384E
            int r4 = r4 - r2
            r0.f2384E = r4
            r6 = r17
            r4 = r19
            r13 = r20
            r15 = r23
            r5 = r24
            goto L_0x0265
        L_0x0307:
            r17 = r6
            goto L_0x0322
        L_0x030a:
            r17 = r6
            r31 = r14
            r30 = r15
        L_0x0310:
            int r2 = r0.f2383D
            int r4 = r0.f2382C
            if (r2 >= r4) goto L_0x0322
            int r4 = r4 - r2
            r2 = 0
            int r4 = r12.b(r1, r4, r2)
            int r2 = r0.f2383D
            int r2 = r2 + r4
            r0.f2383D = r2
            goto L_0x0310
        L_0x0322:
            int r1 = r3.a()
            r2 = r17 & 64
            if (r2 == 0) goto L_0x0331
            boolean r2 = r0.f2385F
            if (r2 != 0) goto L_0x0331
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r2
        L_0x0331:
            r26 = r1
            J1.s r1 = r3.b()
            if (r1 == 0) goto L_0x033e
            p1.F r1 = r1.f2469c
            r29 = r1
            goto L_0x0340
        L_0x033e:
            r29 = 0
        L_0x0340:
            int r1 = r0.f2382C
            r28 = 0
            r23 = r12
            r24 = r10
            r27 = r1
            r23.e(r24, r26, r27, r28, r29)
        L_0x034d:
            boolean r1 = r31.isEmpty()
            if (r1 != 0) goto L_0x038c
            java.lang.Object r1 = r31.removeFirst()
            J1.i r1 = (J1.i) r1
            int r2 = r0.f2412x
            int r4 = r1.f2367c
            int r2 = r2 - r4
            r0.f2412x = r2
            boolean r2 = r1.f2366b
            long r4 = r1.f2365a
            if (r2 == 0) goto L_0x0367
            long r4 = r4 + r10
        L_0x0367:
            r2 = r30
            if (r30 == 0) goto L_0x036f
            long r4 = r2.a(r4)
        L_0x036f:
            p1.G[] r6 = r0.f2388I
            int r7 = r6.length
            r8 = 0
        L_0x0373:
            if (r8 >= r7) goto L_0x0389
            r12 = r6[r8]
            int r9 = r0.f2412x
            r18 = 0
            r15 = 1
            int r13 = r1.f2367c
            r16 = r13
            r13 = r4
            r17 = r9
            r12.e(r13, r15, r16, r17, r18)
            r9 = 1
            int r8 = r8 + r9
            goto L_0x0373
        L_0x0389:
            r30 = r2
            goto L_0x034d
        L_0x038c:
            boolean r1 = r3.c()
            if (r1 != 0) goto L_0x0395
            r1 = 0
            r0.f2381B = r1
        L_0x0395:
            r1 = 3
            r0.f2406r = r1
            goto L_0x0129
        L_0x039a:
            return r1
        L_0x039b:
            int r2 = r5.size()
            r3 = 0
            r4 = 0
        L_0x03a1:
            if (r4 >= r2) goto L_0x03c0
            java.lang.Object r6 = r5.valueAt(r4)
            J1.j r6 = (J1.j) r6
            J1.t r6 = r6.f2369b
            boolean r7 = r6.f2483o
            if (r7 == 0) goto L_0x03bd
            long r6 = r6.f2473c
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x03bd
            java.lang.Object r3 = r5.valueAt(r4)
            J1.j r3 = (J1.j) r3
            r16 = r6
        L_0x03bd:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x03a1
        L_0x03c0:
            if (r3 != 0) goto L_0x03c7
            r2 = 3
            r0.f2406r = r2
            goto L_0x0004
        L_0x03c7:
            r2 = r1
            p1.l r2 = (p1.l) r2
            long r4 = r2.f14408X
            long r4 = r16 - r4
            int r2 = (int) r4
            if (r2 < 0) goto L_0x03ea
            r4 = r1
            p1.l r4 = (p1.l) r4
            r4.m(r2)
            J1.t r2 = r3.f2369b
            P0.r r3 = r2.f2482n
            byte[] r5 = r3.f3732a
            int r6 = r3.f3734c
            r7 = 0
            r4.c(r5, r7, r6, r7)
            r3.H(r7)
            r2.f2483o = r7
            goto L_0x0004
        L_0x03ea:
            java.lang.String r1 = "Offset to encryption data was negative."
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x03f2:
            r31 = r14
            r2 = r15
            long r5 = r0.f2408t
            int r3 = (int) r5
            int r5 = r0.f2409u
            int r3 = r3 - r5
            P0.r r5 = r0.f2410v
            if (r5 == 0) goto L_0x0642
            byte[] r6 = r5.f3732a
            r7 = r1
            p1.l r7 = (p1.l) r7
            r9 = 0
            r10 = 8
            r7.c(r6, r10, r3, r9)
            Q0.c r3 = new Q0.c
            int r6 = r0.f2407s
            r3.<init>(r6, r5)
            r7 = r1
            p1.l r7 = (p1.l) r7
            long r9 = r7.f14408X
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0429
            java.lang.Object r2 = r4.peek()
            Q0.b r2 = (Q0.b) r2
            java.util.ArrayList r2 = r2.f4014X
            r2.add(r3)
            goto L_0x0648
        L_0x0429:
            r3 = 1936286840(0x73696478, float:1.8491255E31)
            if (r6 != r3) goto L_0x04f7
            r3 = 8
            r5.H(r3)
            int r2 = r5.i()
            int r2 = J1.f.c(r2)
            r3 = 4
            r5.I(r3)
            long r3 = r5.x()
            if (r2 != 0) goto L_0x0450
            long r6 = r5.x()
            long r11 = r5.x()
        L_0x044d:
            long r11 = r11 + r9
            r8 = r11
            goto L_0x0459
        L_0x0450:
            long r6 = r5.A()
            long r11 = r5.A()
            goto L_0x044d
        L_0x0459:
            int r2 = P0.z.f3748a
            java.math.RoundingMode r17 = java.math.RoundingMode.DOWN
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r6
            r15 = r3
            long r23 = P0.z.W(r11, r13, r15, r17)
            r2 = 2
            r5.I(r2)
            int r2 = r5.B()
            int[] r10 = new int[r2]
            long[] r15 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r18 = r8
            r11 = r23
            r7 = r6
            r6 = 0
        L_0x047c:
            if (r6 >= r2) goto L_0x04cc
            int r9 = r5.i()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x04c4
            long r16 = r5.x()
            r20 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r20
            r10[r6] = r9
            r15[r6] = r18
            r14[r6] = r11
            long r7 = r7 + r16
            java.math.RoundingMode r17 = java.math.RoundingMode.DOWN
            r25 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r7
            r35 = r2
            r9 = r13
            r2 = r14
            r13 = r25
            r32 = r15
            r15 = r3
            long r11 = P0.z.W(r11, r13, r15, r17)
            r13 = r2[r6]
            long r13 = r11 - r13
            r9[r6] = r13
            r13 = 4
            r5.I(r13)
            r14 = r10[r6]
            long r14 = (long) r14
            long r18 = r18 + r14
            r14 = 1
            int r6 = r6 + r14
            r14 = r2
            r13 = r9
            r15 = r32
            r2 = r35
            goto L_0x047c
        L_0x04c4:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x04cc:
            r9 = r13
            r2 = r14
            r32 = r15
            java.lang.Long r3 = java.lang.Long.valueOf(r23)
            p1.j r4 = new p1.j
            r5 = r32
            r4.<init>(r10, r5, r9, r2)
            android.util.Pair r2 = android.util.Pair.create(r3, r4)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.f2380A = r3
            p1.q r3 = r0.f2387H
            java.lang.Object r2 = r2.second
            p1.z r2 = (p1.z) r2
            r3.l(r2)
            r2 = 1
            r0.f2390K = r2
            goto L_0x0648
        L_0x04f7:
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r6 != r3) goto L_0x0648
            p1.G[] r3 = r0.f2388I
            int r3 = r3.length
            if (r3 != 0) goto L_0x0503
            goto L_0x0648
        L_0x0503:
            r3 = 8
            r5.H(r3)
            int r3 = r5.i()
            int r3 = J1.f.c(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x055e
            r4 = 1
            if (r3 == r4) goto L_0x0521
            java.lang.String r2 = "Skipping unsupported emsg version: "
            Q0.g.u(r3, r2, r8)
            goto L_0x0648
        L_0x0521:
            long r3 = r5.x()
            long r9 = r5.A()
            java.math.RoundingMode r8 = java.math.RoundingMode.DOWN
            r11 = 1000000(0xf4240, double:4.940656E-318)
            r13 = r3
            r15 = r8
            long r16 = P0.z.W(r9, r11, r13, r15)
            long r9 = r5.x()
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = r3
            r15 = r8
            long r3 = P0.z.W(r9, r11, r13, r15)
            long r8 = r5.x()
            java.lang.String r10 = r5.q()
            r10.getClass()
            java.lang.String r11 = r5.q()
            r11.getClass()
            r26 = r3
            r28 = r8
            r24 = r10
            r25 = r11
            r3 = r16
            r8 = r6
            goto L_0x05ac
        L_0x055e:
            java.lang.String r10 = r5.q()
            r10.getClass()
            java.lang.String r11 = r5.q()
            r11.getClass()
            long r3 = r5.x()
            long r12 = r5.x()
            java.math.RoundingMode r8 = java.math.RoundingMode.DOWN
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r3
            r18 = r8
            long r19 = P0.z.W(r12, r14, r16, r18)
            long r12 = r0.f2380A
            int r9 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x058c
            long r12 = r12 + r19
            r21 = r12
            goto L_0x058e
        L_0x058c:
            r21 = r6
        L_0x058e:
            long r12 = r5.x()
            r14 = 1000(0x3e8, double:4.94E-321)
            r16 = r3
            r18 = r8
            long r3 = P0.z.W(r12, r14, r16, r18)
            long r8 = r5.x()
            r26 = r3
            r28 = r8
            r24 = r10
            r25 = r11
            r8 = r19
            r3 = r21
        L_0x05ac:
            int r10 = r5.a()
            byte[] r10 = new byte[r10]
            int r11 = r5.a()
            r12 = 0
            r5.g(r10, r12, r11)
            A1.b r5 = new A1.b
            r23 = r5
            r30 = r10
            r23.<init>(r24, r25, r26, r28, r30)
            P0.r r10 = new P0.r
            A1.d r11 = r0.f2399k
            byte[] r5 = r11.p(r5)
            r10.<init>((byte[]) r5)
            int r5 = r10.a()
            p1.G[] r11 = r0.f2388I
            int r12 = r11.length
            r13 = 0
        L_0x05d6:
            if (r13 >= r12) goto L_0x05e4
            r14 = r11[r13]
            r15 = 0
            r10.H(r15)
            r14.a(r5, r10)
            r14 = 1
            int r13 = r13 + r14
            goto L_0x05d6
        L_0x05e4:
            r14 = 1
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x05f9
            J1.i r2 = new J1.i
            r2.<init>(r8, r5, r14)
            r6 = r31
            r6.addLast(r2)
            int r2 = r0.f2412x
            int r2 = r2 + r5
            r0.f2412x = r2
            goto L_0x0648
        L_0x05f9:
            r6 = r31
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0610
            J1.i r2 = new J1.i
            r7 = 0
            r2.<init>(r3, r5, r7)
            r6.addLast(r2)
            int r2 = r0.f2412x
            int r2 = r2 + r5
            r0.f2412x = r2
            goto L_0x0648
        L_0x0610:
            r7 = 0
            if (r2 == 0) goto L_0x0627
            boolean r8 = r2.f()
            if (r8 != 0) goto L_0x0627
            J1.i r2 = new J1.i
            r2.<init>(r3, r5, r7)
            r6.addLast(r2)
            int r2 = r0.f2412x
            int r2 = r2 + r5
            r0.f2412x = r2
            goto L_0x0648
        L_0x0627:
            if (r2 == 0) goto L_0x062d
            long r3 = r2.a(r3)
        L_0x062d:
            p1.G[] r2 = r0.f2388I
            int r6 = r2.length
            r7 = 0
        L_0x0631:
            if (r7 >= r6) goto L_0x0648
            r11 = r2[r7]
            r17 = 0
            r14 = 1
            r16 = 0
            r12 = r3
            r15 = r5
            r11.e(r12, r14, r15, r16, r17)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x0631
        L_0x0642:
            r2 = r1
            p1.l r2 = (p1.l) r2
            r2.m(r3)
        L_0x0648:
            r2 = r1
            p1.l r2 = (p1.l) r2
            long r2 = r2.f14408X
            r0.g(r2)
            goto L_0x0004
        L_0x0652:
            int r2 = r0.f2409u
            P0.r r3 = r0.f2400l
            if (r2 != 0) goto L_0x067d
            byte[] r2 = r3.f3732a
            r6 = r1
            p1.l r6 = (p1.l) r6
            r7 = 0
            r8 = 8
            r10 = 1
            boolean r2 = r6.c(r2, r7, r8, r10)
            if (r2 != 0) goto L_0x066c
            r9.d(r7)
            r1 = -1
            return r1
        L_0x066c:
            r0.f2409u = r8
            r3.H(r7)
            long r6 = r3.x()
            r0.f2408t = r6
            int r2 = r3.i()
            r0.f2407s = r2
        L_0x067d:
            long r6 = r0.f2408t
            r8 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x069c
            byte[] r2 = r3.f3732a
            r6 = r1
            p1.l r6 = (p1.l) r6
            r7 = 0
            r8 = 8
            r6.c(r2, r8, r8, r7)
            int r2 = r0.f2409u
            int r2 = r2 + r8
            r0.f2409u = r2
            long r6 = r3.A()
            r0.f2408t = r6
            goto L_0x06cb
        L_0x069c:
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x06cb
            r2 = r1
            p1.l r2 = (p1.l) r2
            long r6 = r2.f14407W
            r8 = -1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x06bb
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x06bb
            java.lang.Object r2 = r4.peek()
            Q0.b r2 = (Q0.b) r2
            long r6 = r2.f4013W
        L_0x06bb:
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x06cb
            r2 = r1
            p1.l r2 = (p1.l) r2
            long r8 = r2.f14408X
            long r6 = r6 - r8
            int r2 = r0.f2409u
            long r8 = (long) r2
            long r6 = r6 + r8
            r0.f2408t = r6
        L_0x06cb:
            long r6 = r0.f2408t
            int r2 = r0.f2409u
            long r8 = (long) r2
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0856
            r6 = r1
            p1.l r6 = (p1.l) r6
            long r6 = r6.f14408X
            long r8 = (long) r2
            long r6 = r6 - r8
            int r2 = r0.f2407s
            r8 = 1835295092(0x6d646174, float:4.4175247E27)
            r9 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r9) goto L_0x06e7
            if (r2 != r8) goto L_0x06fa
        L_0x06e7:
            boolean r2 = r0.f2390K
            if (r2 != 0) goto L_0x06fa
            p1.q r2 = r0.f2387H
            p1.s r10 = new p1.s
            long r11 = r0.z
            r10.<init>(r11, r6)
            r2.l(r10)
            r2 = 1
            r0.f2390K = r2
        L_0x06fa:
            int r2 = r0.f2407s
            if (r2 != r9) goto L_0x0717
            int r2 = r5.size()
            r10 = 0
        L_0x0703:
            if (r10 >= r2) goto L_0x0717
            java.lang.Object r11 = r5.valueAt(r10)
            J1.j r11 = (J1.j) r11
            J1.t r11 = r11.f2369b
            r11.getClass()
            r11.f2473c = r6
            r11.f2472b = r6
            r11 = 1
            int r10 = r10 + r11
            goto L_0x0703
        L_0x0717:
            int r2 = r0.f2407s
            if (r2 != r8) goto L_0x0729
            r5 = 0
            r0.f2381B = r5
            long r2 = r0.f2408t
            long r6 = r6 + r2
            r0.f2411w = r6
            r2 = 2
            r0.f2406r = r2
        L_0x0726:
            r3 = 1
            goto L_0x0004
        L_0x0729:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x0753
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x0753
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x0753
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x0753
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x0753
            if (r2 == r9) goto L_0x0753
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x0753
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x0753
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0756
        L_0x0753:
            r3 = 1
            goto L_0x082e
        L_0x0756:
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r4) goto L_0x07fb
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r4) goto L_0x07fb
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r4) goto L_0x07fb
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x07fb
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x07fb
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x07fb
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x07fb
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x07fb
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x07fb
            r4 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r2 != r4) goto L_0x07e6
            goto L_0x07fb
        L_0x07e6:
            long r2 = r0.f2408t
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x07f4
            r2 = 0
            r0.f2410v = r2
            r2 = 1
            r0.f2406r = r2
            goto L_0x0726
        L_0x07f4:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x07fb:
            int r2 = r0.f2409u
            r4 = 8
            if (r2 != r4) goto L_0x0827
            long r7 = r0.f2408t
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0820
            P0.r r2 = new P0.r
            long r4 = r0.f2408t
            int r5 = (int) r4
            r2.<init>((int) r5)
            byte[] r3 = r3.f3732a
            byte[] r4 = r2.f3732a
            r5 = 0
            r6 = 8
            java.lang.System.arraycopy(r3, r5, r4, r5, r6)
            r0.f2410v = r2
            r3 = 1
            r0.f2406r = r3
            goto L_0x0004
        L_0x0820:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x0827:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            M0.J r1 = M0.J.c(r1)
            throw r1
        L_0x082e:
            r5 = r1
            p1.l r5 = (p1.l) r5
            long r5 = r5.f14408X
            long r7 = r0.f2408t
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            Q0.b r7 = new Q0.b
            r7.<init>(r2, r5)
            r4.push(r7)
            long r7 = r0.f2408t
            int r2 = r0.f2409u
            long r9 = (long) r2
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x084f
            r0.g(r5)
            goto L_0x0004
        L_0x084f:
            r2 = 0
            r0.f2406r = r2
            r0.f2409u = r2
            goto L_0x0004
        L_0x0856:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            M0.J r1 = M0.J.c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.k.e(p1.p, M0.u):int");
    }

    public final List f() {
        return this.f2405q;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: J1.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0393, code lost:
        if ((r0 + P0.z.W(r6[0], 1000000, r14.f2459c, r44)) >= r14.e) goto L_0x036b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(long r54) {
        /*
            r53 = this;
            r0 = r53
        L_0x0002:
            r5 = 1
            java.util.ArrayDeque r6 = r0.f2401m
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x07c6
            java.lang.Object r7 = r6.peek()
            Q0.b r7 = (Q0.b) r7
            long r9 = r7.f4013W
            int r7 = (r9 > r54 ? 1 : (r9 == r54 ? 0 : -1))
            if (r7 != 0) goto L_0x07c6
            java.lang.Object r7 = r6.pop()
            r9 = r7
            Q0.b r9 = (Q0.b) r9
            int r7 = r9.f4018V
            android.util.SparseArray r15 = r0.f2394d
            java.util.ArrayList r10 = r9.f4014X
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            int r12 = r0.f2392b
            r13 = 12
            if (r7 != r11) goto L_0x0188
            M0.n r6 = b(r10)
            r7 = 1836475768(0x6d766578, float:4.7659988E27)
            Q0.b r7 = r9.r(r7)
            r7.getClass()
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.ArrayList r7 = r7.f4014X
            int r10 = r7.size()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 0
        L_0x004c:
            if (r11 >= r10) goto L_0x00bf
            java.lang.Object r16 = r7.get(r11)
            r1 = r16
            Q0.c r1 = (Q0.c) r1
            int r8 = r1.f4018V
            r2 = 1953654136(0x74726578, float:7.6818474E31)
            P0.r r1 = r1.f4016W
            if (r8 != r2) goto L_0x0096
            r1.H(r13)
            int r2 = r1.i()
            int r8 = r1.i()
            int r8 = r8 - r5
            int r13 = r1.i()
            int r5 = r1.i()
            int r1 = r1.i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r19 = r7
            J1.g r7 = new J1.g
            r7.<init>(r8, r13, r5, r1)
            android.util.Pair r1 = android.util.Pair.create(r2, r7)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.second
            J1.g r1 = (J1.g) r1
            r14.put(r2, r1)
            goto L_0x00b7
        L_0x0096:
            r19 = r7
            r2 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r8 != r2) goto L_0x00b7
            r2 = 8
            r1.H(r2)
            int r2 = r1.i()
            int r2 = J1.f.c(r2)
            if (r2 != 0) goto L_0x00b2
            long r1 = r1.x()
        L_0x00b0:
            r3 = r1
            goto L_0x00b7
        L_0x00b2:
            long r1 = r1.A()
            goto L_0x00b0
        L_0x00b7:
            r1 = 1
            int r11 = r11 + r1
            r7 = r19
            r5 = 1
            r13 = 12
            goto L_0x004c
        L_0x00bf:
            p1.v r10 = new p1.v
            r10.<init>()
            r1 = 16
            r2 = r12 & 16
            if (r2 == 0) goto L_0x00cc
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            J1.h r2 = new J1.h
            r2.<init>(r0)
            r5 = 0
            r11 = r3
            r13 = r6
            r3 = r14
            r14 = r1
            r1 = r15
            r15 = r5
            r16 = r2
            java.util.ArrayList r2 = J1.f.g(r9, r10, r11, r13, r14, r15, r16)
            int r4 = r2.size()
            int r5 = r1.size()
            if (r5 != 0) goto L_0x0132
            r5 = 0
        L_0x00ea:
            if (r5 >= r4) goto L_0x012c
            java.lang.Object r6 = r2.get(r5)
            J1.u r6 = (J1.u) r6
            J1.r r7 = r6.f2486a
            J1.j r8 = new J1.j
            p1.q r9 = r0.f2387H
            int r10 = r7.f2458b
            p1.G r9 = r9.q(r5, r10)
            int r10 = r3.size()
            int r11 = r7.f2457a
            r12 = 1
            if (r10 != r12) goto L_0x010f
            r10 = 0
            java.lang.Object r12 = r3.valueAt(r10)
            J1.g r12 = (J1.g) r12
            goto L_0x0119
        L_0x010f:
            java.lang.Object r10 = r3.get(r11)
            r12 = r10
            J1.g r12 = (J1.g) r12
            r12.getClass()
        L_0x0119:
            r8.<init>(r9, r6, r12)
            r1.put(r11, r8)
            long r8 = r0.z
            long r6 = r7.e
            long r6 = java.lang.Math.max(r8, r6)
            r0.z = r6
            r6 = 1
            int r5 = r5 + r6
            goto L_0x00ea
        L_0x012c:
            p1.q r1 = r0.f2387H
            r1.g()
            goto L_0x017e
        L_0x0132:
            int r5 = r1.size()
            if (r5 != r4) goto L_0x013a
            r5 = 1
            goto L_0x013b
        L_0x013a:
            r5 = 0
        L_0x013b:
            P0.l.j(r5)
            r5 = 0
        L_0x013f:
            if (r5 >= r4) goto L_0x017e
            java.lang.Object r6 = r2.get(r5)
            J1.u r6 = (J1.u) r6
            J1.r r7 = r6.f2486a
            int r8 = r7.f2457a
            java.lang.Object r8 = r1.get(r8)
            J1.j r8 = (J1.j) r8
            int r9 = r3.size()
            r10 = 1
            if (r9 != r10) goto L_0x0160
            r9 = 0
            java.lang.Object r7 = r3.valueAt(r9)
            J1.g r7 = (J1.g) r7
            goto L_0x016b
        L_0x0160:
            int r7 = r7.f2457a
            java.lang.Object r7 = r3.get(r7)
            J1.g r7 = (J1.g) r7
            r7.getClass()
        L_0x016b:
            r8.f2371d = r6
            r8.e = r7
            J1.r r6 = r6.f2486a
            M0.r r6 = r6.f2462g
            p1.G r7 = r8.f2368a
            r7.c(r6)
            r8.e()
            r6 = 1
            int r5 = r5 + r6
            goto L_0x013f
        L_0x017e:
            r5 = r0
            r2 = 8
            r3 = 2
            r8 = 16
            r11 = 1
            r15 = 4
            goto L_0x07c3
        L_0x0188:
            r1 = r15
            r2 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r7 != r2) goto L_0x07aa
            java.util.ArrayList r2 = r9.f4015Y
            int r5 = r2.size()
            r6 = 0
        L_0x0195:
            if (r6 >= r5) goto L_0x070f
            java.lang.Object r8 = r2.get(r6)
            Q0.b r8 = (Q0.b) r8
            int r9 = r8.f4018V
            r11 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 != r11) goto L_0x06ea
            r9 = 1952868452(0x74666864, float:7.301914E31)
            Q0.c r9 = r8.t(r9)
            r9.getClass()
            P0.r r9 = r9.f4016W
            r11 = 8
            r9.H(r11)
            int r11 = r9.i()
            byte[] r13 = J1.f.f2359a
            int r13 = r9.i()
            java.lang.Object r13 = r1.get(r13)
            J1.j r13 = (J1.j) r13
            if (r13 != 0) goto L_0x01c9
            r13 = 0
            goto L_0x0218
        L_0x01c9:
            r14 = 1
            r15 = r11 & 1
            J1.t r14 = r13.f2369b
            if (r15 == 0) goto L_0x01d8
            long r3 = r9.A()
            r14.f2472b = r3
            r14.f2473c = r3
        L_0x01d8:
            J1.g r3 = r13.e
            r4 = 2
            r15 = r11 & 2
            if (r15 == 0) goto L_0x01e8
            int r4 = r9.i()
            r15 = 1
            int r4 = r4 - r15
        L_0x01e5:
            r15 = 8
            goto L_0x01eb
        L_0x01e8:
            int r4 = r3.f2360a
            goto L_0x01e5
        L_0x01eb:
            r20 = r11 & 8
            if (r20 == 0) goto L_0x01f6
            int r15 = r9.i()
        L_0x01f3:
            r17 = 16
            goto L_0x01f9
        L_0x01f6:
            int r15 = r3.f2361b
            goto L_0x01f3
        L_0x01f9:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0204
            int r20 = r9.i()
            r7 = r20
            goto L_0x0206
        L_0x0204:
            int r7 = r3.f2362c
        L_0x0206:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x020f
            int r3 = r9.i()
            goto L_0x0211
        L_0x020f:
            int r3 = r3.f2363d
        L_0x0211:
            J1.g r9 = new J1.g
            r9.<init>(r4, r15, r7, r3)
            r14.f2471a = r9
        L_0x0218:
            if (r13 != 0) goto L_0x021c
            goto L_0x06ea
        L_0x021c:
            J1.t r3 = r13.f2369b
            long r14 = r3.f2484p
            boolean r4 = r3.f2485q
            r13.e()
            r7 = 1
            r13.f2377l = r7
            r9 = 1952867444(0x74666474, float:7.3014264E31)
            Q0.c r9 = r8.t(r9)
            if (r9 == 0) goto L_0x0255
            r11 = 2
            r18 = r12 & 2
            if (r18 != 0) goto L_0x0255
            P0.r r4 = r9.f4016W
            r9 = 8
            r4.H(r9)
            int r9 = r4.i()
            int r9 = J1.f.c(r9)
            if (r9 != r7) goto L_0x024c
            long r14 = r4.A()
            goto L_0x0250
        L_0x024c:
            long r14 = r4.x()
        L_0x0250:
            r3.f2484p = r14
            r3.f2485q = r7
            goto L_0x0259
        L_0x0255:
            r3.f2484p = r14
            r3.f2485q = r4
        L_0x0259:
            java.util.ArrayList r4 = r8.f4014X
            int r7 = r4.size()
            r9 = 0
            r11 = 0
            r14 = 0
        L_0x0262:
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            if (r9 >= r7) goto L_0x028f
            java.lang.Object r21 = r4.get(r9)
            r22 = r2
            r2 = r21
            Q0.c r2 = (Q0.c) r2
            r21 = r5
            int r5 = r2.f4018V
            if (r5 != r15) goto L_0x0288
            P0.r r2 = r2.f4016W
            r5 = 12
            r2.H(r5)
            int r2 = r2.z()
            if (r2 <= 0) goto L_0x0288
            int r14 = r14 + r2
            r2 = 1
            int r11 = r11 + r2
            goto L_0x0289
        L_0x0288:
            r2 = 1
        L_0x0289:
            int r9 = r9 + r2
            r5 = r21
            r2 = r22
            goto L_0x0262
        L_0x028f:
            r22 = r2
            r21 = r5
            r2 = 0
            r13.f2374h = r2
            r13.f2373g = r2
            r13.f2372f = r2
            r3.f2474d = r11
            r3.e = r14
            int[] r2 = r3.f2476g
            int r2 = r2.length
            if (r2 >= r11) goto L_0x02ab
            long[] r2 = new long[r11]
            r3.f2475f = r2
            int[] r2 = new int[r11]
            r3.f2476g = r2
        L_0x02ab:
            int[] r2 = r3.f2477h
            int r2 = r2.length
            if (r2 >= r14) goto L_0x02c4
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r2 = new int[r14]
            r3.f2477h = r2
            long[] r2 = new long[r14]
            r3.i = r2
            boolean[] r2 = new boolean[r14]
            r3.f2478j = r2
            boolean[] r2 = new boolean[r14]
            r3.f2480l = r2
        L_0x02c4:
            r2 = 0
            r5 = 0
            r9 = 0
        L_0x02c7:
            r23 = 0
            if (r2 >= r7) goto L_0x04c5
            java.lang.Object r11 = r4.get(r2)
            Q0.c r11 = (Q0.c) r11
            int r14 = r11.f4018V
            if (r14 != r15) goto L_0x049b
            r14 = 1
            int r25 = r5 + 1
            P0.r r11 = r11.f4016W
            r14 = 8
            r11.H(r14)
            int r14 = r11.i()
            byte[] r26 = J1.f.f2359a
            J1.u r15 = r13.f2371d
            r27 = r7
            J1.g r7 = r3.f2471a
            int r28 = P0.z.f3748a
            r28 = r1
            int[] r1 = r3.f2476g
            int r29 = r11.z()
            r1[r5] = r29
            long[] r1 = r3.f2475f
            r29 = r8
            r30 = r9
            long r8 = r3.f2472b
            r1[r5] = r8
            r18 = 1
            r31 = r14 & 1
            if (r31 == 0) goto L_0x0317
            r31 = r10
            int r10 = r11.i()
            r32 = r12
            r33 = r13
            long r12 = (long) r10
            long r8 = r8 + r12
            r1[r5] = r8
        L_0x0315:
            r1 = 4
            goto L_0x031e
        L_0x0317:
            r31 = r10
            r32 = r12
            r33 = r13
            goto L_0x0315
        L_0x031e:
            r8 = r14 & 4
            if (r8 == 0) goto L_0x0324
            r1 = 1
            goto L_0x0325
        L_0x0324:
            r1 = 0
        L_0x0325:
            int r8 = r7.f2363d
            if (r1 == 0) goto L_0x032d
            int r8 = r11.i()
        L_0x032d:
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0333
            r9 = 1
            goto L_0x0334
        L_0x0333:
            r9 = 0
        L_0x0334:
            r10 = r14 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x033a
            r10 = 1
            goto L_0x033b
        L_0x033a:
            r10 = 0
        L_0x033b:
            r12 = r14 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0341
            r12 = 1
            goto L_0x0342
        L_0x0341:
            r12 = 0
        L_0x0342:
            r13 = r14 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0348
            r13 = 1
            goto L_0x0349
        L_0x0348:
            r13 = 0
        L_0x0349:
            J1.r r14 = r15.f2486a
            long[] r15 = r14.i
            if (r15 == 0) goto L_0x0399
            r34 = r8
            int r8 = r15.length
            r35 = r6
            r6 = 1
            if (r8 != r6) goto L_0x035b
            long[] r6 = r14.f2464j
            if (r6 != 0) goto L_0x0360
        L_0x035b:
            r8 = r1
            r15 = r12
            r36 = r13
            goto L_0x03a1
        L_0x0360:
            r8 = 0
            r36 = r15[r8]
            int r8 = (r36 > r23 ? 1 : (r36 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x036d
            r8 = r1
            r15 = r12
            r36 = r13
        L_0x036b:
            r0 = 0
            goto L_0x0396
        L_0x036d:
            java.math.RoundingMode r44 = java.math.RoundingMode.DOWN
            r38 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r1
            long r0 = r14.f2460d
            r40 = r0
            r42 = r44
            long r0 = P0.z.W(r36, r38, r40, r42)
            r15 = 0
            r38 = r6[r15]
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r12
            r36 = r13
            long r12 = r14.f2459c
            r42 = r12
            long r12 = P0.z.W(r38, r40, r42, r44)
            long r0 = r0 + r12
            long r12 = r14.e
            int r37 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r37 < 0) goto L_0x03a1
            goto L_0x036b
        L_0x0396:
            r23 = r6[r0]
            goto L_0x03a1
        L_0x0399:
            r35 = r6
            r34 = r8
            r15 = r12
            r36 = r13
            r8 = r1
        L_0x03a1:
            int[] r0 = r3.f2477h
            long[] r1 = r3.i
            boolean[] r6 = r3.f2478j
            int r12 = r14.f2458b
            r13 = 2
            if (r12 != r13) goto L_0x03b3
            r12 = 1
            r13 = r32 & 1
            if (r13 == 0) goto L_0x03b3
            r12 = 1
            goto L_0x03b4
        L_0x03b3:
            r12 = 0
        L_0x03b4:
            int[] r13 = r3.f2476g
            r5 = r13[r5]
            int r5 = r30 + r5
            r37 = r12
            long r12 = r3.f2484p
            r38 = r2
            r51 = r12
            r13 = r3
            r2 = r51
            r12 = r30
        L_0x03c7:
            if (r12 >= r5) goto L_0x048f
            if (r9 == 0) goto L_0x03d6
            int r30 = r11.i()
            r39 = r5
            r40 = r9
            r5 = r30
            goto L_0x03dc
        L_0x03d6:
            r39 = r5
            int r5 = r7.f2361b
            r40 = r9
        L_0x03dc:
            java.lang.String r9 = "Unexpected negative value: "
            if (r5 < 0) goto L_0x047d
            if (r10 == 0) goto L_0x03eb
            int r30 = r11.i()
            r41 = r10
            r10 = r30
            goto L_0x03ef
        L_0x03eb:
            r41 = r10
            int r10 = r7.f2362c
        L_0x03ef:
            if (r10 < 0) goto L_0x046b
            if (r15 == 0) goto L_0x03f8
            int r9 = r11.i()
            goto L_0x0401
        L_0x03f8:
            if (r12 != 0) goto L_0x03ff
            if (r8 == 0) goto L_0x03ff
            r9 = r34
            goto L_0x0401
        L_0x03ff:
            int r9 = r7.f2363d
        L_0x0401:
            if (r36 == 0) goto L_0x040e
            int r30 = r11.i()
            r42 = r7
            r43 = r8
            r7 = r30
            goto L_0x0413
        L_0x040e:
            r42 = r7
            r43 = r8
            r7 = 0
        L_0x0413:
            long r7 = (long) r7
            long r7 = r7 + r2
            long r44 = r7 - r23
            java.math.RoundingMode r50 = java.math.RoundingMode.DOWN
            r46 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r14.f2459c
            r48 = r7
            long r7 = P0.z.W(r44, r46, r48, r50)
            r1[r12] = r7
            r44 = r11
            boolean r11 = r13.f2485q
            if (r11 != 0) goto L_0x043a
            r11 = r33
            r33 = r14
            J1.u r14 = r11.f2371d
            r45 = r15
            long r14 = r14.f2492h
            long r7 = r7 + r14
            r1[r12] = r7
            goto L_0x0440
        L_0x043a:
            r45 = r15
            r11 = r33
            r33 = r14
        L_0x0440:
            r0[r12] = r10
            r7 = 16
            int r8 = r9 >> 16
            r7 = 1
            r8 = r8 & r7
            if (r8 != 0) goto L_0x0450
            if (r37 == 0) goto L_0x044e
            if (r12 != 0) goto L_0x0450
        L_0x044e:
            r7 = 1
            goto L_0x0451
        L_0x0450:
            r7 = 0
        L_0x0451:
            r6[r12] = r7
            long r7 = (long) r5
            long r2 = r2 + r7
            r5 = 1
            int r12 = r12 + r5
            r14 = r33
            r5 = r39
            r9 = r40
            r10 = r41
            r7 = r42
            r8 = r43
            r15 = r45
            r33 = r11
            r11 = r44
            goto L_0x03c7
        L_0x046b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 0
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x047d:
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x048f:
            r39 = r5
            r11 = r33
            r13.f2484p = r2
            r5 = r25
            r9 = r39
        L_0x0499:
            r0 = 1
            goto L_0x04ae
        L_0x049b:
            r28 = r1
            r38 = r2
            r35 = r6
            r27 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r12
            r11 = r13
            r13 = r3
            goto L_0x0499
        L_0x04ae:
            int r2 = r38 + 1
            r0 = r53
            r3 = r13
            r7 = r27
            r1 = r28
            r8 = r29
            r10 = r31
            r12 = r32
            r6 = r35
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            r13 = r11
            goto L_0x02c7
        L_0x04c5:
            r28 = r1
            r35 = r6
            r29 = r8
            r31 = r10
            r32 = r12
            r11 = r13
            r13 = r3
            J1.u r0 = r11.f2371d
            J1.g r1 = r13.f2471a
            r1.getClass()
            J1.r r0 = r0.f2486a
            J1.s[] r0 = r0.f2466l
            int r1 = r1.f2360a
            r0 = r0[r1]
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            r8 = r29
            Q0.c r1 = r8.t(r1)
            if (r1 == 0) goto L_0x0561
            r0.getClass()
            P0.r r1 = r1.f4016W
            r2 = 8
            r1.H(r2)
            int r3 = r1.i()
            byte[] r5 = J1.f.f2359a
            r5 = 1
            r3 = r3 & r5
            if (r3 != r5) goto L_0x0502
            r1.I(r2)
        L_0x0502:
            int r2 = r1.v()
            int r3 = r1.z()
            int r5 = r13.e
            if (r3 > r5) goto L_0x054a
            int r5 = r0.f2470d
            if (r2 != 0) goto L_0x0529
            boolean[] r2 = r13.f2480l
            r6 = 0
            r7 = 0
        L_0x0516:
            if (r6 >= r3) goto L_0x0527
            int r9 = r1.v()
            int r7 = r7 + r9
            if (r9 <= r5) goto L_0x0521
            r9 = 1
            goto L_0x0522
        L_0x0521:
            r9 = 0
        L_0x0522:
            r2[r6] = r9
            r9 = 1
            int r6 = r6 + r9
            goto L_0x0516
        L_0x0527:
            r5 = 0
            goto L_0x0536
        L_0x0529:
            if (r2 <= r5) goto L_0x052d
            r1 = 1
            goto L_0x052e
        L_0x052d:
            r1 = 0
        L_0x052e:
            int r7 = r2 * r3
            boolean[] r2 = r13.f2480l
            r5 = 0
            java.util.Arrays.fill(r2, r5, r3, r1)
        L_0x0536:
            boolean[] r1 = r13.f2480l
            int r2 = r13.e
            java.util.Arrays.fill(r1, r3, r2, r5)
            if (r7 <= 0) goto L_0x0561
            P0.r r1 = r13.f2482n
            r1.E(r7)
            r1 = 1
            r13.f2479k = r1
            r13.f2483o = r1
            goto L_0x0561
        L_0x054a:
            java.lang.String r0 = "Saiz sample count "
            java.lang.String r1 = " is greater than fragment sample count"
            java.lang.StringBuilder r0 = Q0.g.p(r3, r0, r1)
            int r1 = r13.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x0561:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            Q0.c r1 = r8.t(r1)
            if (r1 == 0) goto L_0x0599
            P0.r r1 = r1.f4016W
            r2 = 8
            r1.H(r2)
            int r3 = r1.i()
            byte[] r5 = J1.f.f2359a
            r5 = 1
            r6 = r3 & 1
            if (r6 != r5) goto L_0x057f
            r1.I(r2)
        L_0x057f:
            int r2 = r1.z()
            if (r2 != r5) goto L_0x059b
            int r2 = J1.f.c(r3)
            long r5 = r13.f2473c
            if (r2 != 0) goto L_0x0592
            long r1 = r1.x()
            goto L_0x0596
        L_0x0592:
            long r1 = r1.A()
        L_0x0596:
            long r5 = r5 + r1
            r13.f2473c = r5
        L_0x0599:
            r1 = 0
            goto L_0x05af
        L_0x059b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1 = 0
            M0.J r0 = M0.J.a(r1, r0)
            throw r0
        L_0x05af:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            Q0.c r2 = r8.t(r2)
            if (r2 == 0) goto L_0x05be
            P0.r r2 = r2.f4016W
            r3 = 0
            d(r2, r3, r13)
        L_0x05be:
            if (r0 == 0) goto L_0x05c4
            java.lang.String r0 = r0.f2468b
            r7 = r0
            goto L_0x05c5
        L_0x05c4:
            r7 = r1
        L_0x05c5:
            r0 = r1
            r2 = r0
            r3 = 0
        L_0x05c8:
            int r5 = r4.size()
            if (r3 >= r5) goto L_0x0602
            java.lang.Object r5 = r4.get(r3)
            Q0.c r5 = (Q0.c) r5
            P0.r r6 = r5.f4016W
            r8 = 1935828848(0x73626770, float:1.7937577E31)
            r9 = 1936025959(0x73656967, float:1.817587E31)
            int r5 = r5.f4018V
            if (r5 != r8) goto L_0x05ee
            r14 = 12
            r6.H(r14)
            int r5 = r6.i()
            if (r5 != r9) goto L_0x05ec
            r0 = r6
        L_0x05ec:
            r5 = 1
            goto L_0x0600
        L_0x05ee:
            r14 = 12
            r8 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r8) goto L_0x05ec
            r6.H(r14)
            int r5 = r6.i()
            if (r5 != r9) goto L_0x05ec
            r2 = r6
            goto L_0x05ec
        L_0x0600:
            int r3 = r3 + r5
            goto L_0x05c8
        L_0x0602:
            r5 = 1
            r14 = 12
            if (r0 == 0) goto L_0x0609
            if (r2 != 0) goto L_0x060d
        L_0x0609:
            r3 = 2
            r15 = 4
            goto L_0x06a6
        L_0x060d:
            r3 = 8
            r0.H(r3)
            int r6 = r0.i()
            int r6 = J1.f.c(r6)
            r15 = 4
            r0.I(r15)
            if (r6 != r5) goto L_0x0623
            r0.I(r15)
        L_0x0623:
            int r0 = r0.i()
            if (r0 != r5) goto L_0x069f
            r2.H(r3)
            int r0 = r2.i()
            int r0 = J1.f.c(r0)
            r2.I(r15)
            if (r0 != r5) goto L_0x064a
            long r5 = r2.x()
            int r0 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x0643
            r3 = 2
            goto L_0x0650
        L_0x0643:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x064a:
            r3 = 2
            if (r0 < r3) goto L_0x0650
            r2.I(r15)
        L_0x0650:
            long r5 = r2.x()
            r8 = 1
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0698
            r0 = 1
            r2.I(r0)
            int r5 = r2.v()
            r6 = r5 & 240(0xf0, float:3.36E-43)
            int r10 = r6 >> 4
            r11 = r5 & 15
            int r5 = r2.v()
            if (r5 != r0) goto L_0x0670
            r6 = 1
            goto L_0x0671
        L_0x0670:
            r6 = 0
        L_0x0671:
            if (r6 != 0) goto L_0x0674
            goto L_0x06a6
        L_0x0674:
            int r8 = r2.v()
            r0 = 16
            byte[] r9 = new byte[r0]
            r5 = 0
            r2.g(r9, r5, r0)
            if (r8 != 0) goto L_0x068b
            int r0 = r2.v()
            byte[] r1 = new byte[r0]
            r2.g(r1, r5, r0)
        L_0x068b:
            r12 = r1
            r0 = 1
            r13.f2479k = r0
            J1.s r0 = new J1.s
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.f2481m = r0
            goto L_0x06a6
        L_0x0698:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x069f:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            M0.J r0 = M0.J.c(r0)
            throw r0
        L_0x06a6:
            int r0 = r4.size()
            r10 = 0
        L_0x06ab:
            if (r10 >= r0) goto L_0x06e2
            java.lang.Object r1 = r4.get(r10)
            Q0.c r1 = (Q0.c) r1
            int r2 = r1.f4018V
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r5) goto L_0x06d9
            P0.r r1 = r1.f4016W
            r2 = 8
            r1.H(r2)
            r5 = r53
            byte[] r6 = r5.f2397h
            r7 = 0
            r8 = 16
            r1.g(r6, r7, r8)
            byte[] r7 = f2378L
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L_0x06d4
            goto L_0x06d7
        L_0x06d4:
            d(r1, r8, r13)
        L_0x06d7:
            r1 = 1
            goto L_0x06e0
        L_0x06d9:
            r2 = 8
            r8 = 16
            r5 = r53
            goto L_0x06d7
        L_0x06e0:
            int r10 = r10 + r1
            goto L_0x06ab
        L_0x06e2:
            r1 = 1
            r2 = 8
            r8 = 16
            r5 = r53
            goto L_0x0700
        L_0x06ea:
            r28 = r1
            r22 = r2
            r21 = r5
            r35 = r6
            r31 = r10
            r32 = r12
            r1 = 1
            r2 = 8
            r3 = 2
            r8 = 16
            r14 = 12
            r15 = 4
            r5 = r0
        L_0x0700:
            int r6 = r35 + 1
            r0 = r5
            r5 = r21
            r2 = r22
            r1 = r28
            r10 = r31
            r12 = r32
            goto L_0x0195
        L_0x070f:
            r5 = r0
            r28 = r1
            r31 = r10
            r1 = 0
            r2 = 8
            r3 = 2
            r8 = 16
            r15 = 4
            M0.n r0 = b(r31)
            if (r0 == 0) goto L_0x0765
            int r4 = r28.size()
            r10 = 0
        L_0x0726:
            if (r10 >= r4) goto L_0x0765
            r6 = r28
            java.lang.Object r7 = r6.valueAt(r10)
            J1.j r7 = (J1.j) r7
            J1.u r9 = r7.f2371d
            J1.t r11 = r7.f2369b
            J1.g r11 = r11.f2471a
            int r12 = P0.z.f3748a
            int r11 = r11.f2360a
            J1.r r9 = r9.f2486a
            J1.s[] r9 = r9.f2466l
            r9 = r9[r11]
            if (r9 == 0) goto L_0x0745
            java.lang.String r9 = r9.f2468b
            goto L_0x0746
        L_0x0745:
            r9 = r1
        L_0x0746:
            M0.n r9 = r0.k(r9)
            J1.u r11 = r7.f2371d
            J1.r r11 = r11.f2486a
            M0.r r11 = r11.f2462g
            M0.q r11 = r11.a()
            r11.f3003q = r9
            M0.r r9 = new M0.r
            r9.<init>(r11)
            p1.G r7 = r7.f2368a
            r7.c(r9)
            r7 = 1
            int r10 = r10 + r7
            r28 = r6
            goto L_0x0726
        L_0x0765:
            r6 = r28
            long r0 = r5.f2413y
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x07a8
            int r0 = r6.size()
            r1 = 0
        L_0x0777:
            if (r1 >= r0) goto L_0x079f
            java.lang.Object r4 = r6.valueAt(r1)
            J1.j r4 = (J1.j) r4
            long r9 = r5.f2413y
            int r7 = r4.f2372f
        L_0x0783:
            J1.t r11 = r4.f2369b
            int r12 = r11.e
            if (r7 >= r12) goto L_0x079c
            long[] r12 = r11.i
            r13 = r12[r7]
            int r12 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x079c
            boolean[] r11 = r11.f2478j
            boolean r11 = r11[r7]
            if (r11 == 0) goto L_0x0799
            r4.i = r7
        L_0x0799:
            r11 = 1
            int r7 = r7 + r11
            goto L_0x0783
        L_0x079c:
            r11 = 1
            int r1 = r1 + r11
            goto L_0x0777
        L_0x079f:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 1
            r5.f2413y = r9
            goto L_0x07c3
        L_0x07a8:
            r11 = 1
            goto L_0x07c3
        L_0x07aa:
            r5 = r0
            r2 = 8
            r3 = 2
            r8 = 16
            r11 = 1
            r15 = 4
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x07c3
            java.lang.Object r0 = r6.peek()
            Q0.b r0 = (Q0.b) r0
            java.util.ArrayList r0 = r0.f4015Y
            r0.add(r9)
        L_0x07c3:
            r0 = r5
            goto L_0x0002
        L_0x07c6:
            r5 = r0
            r0 = 0
            r5.f2406r = r0
            r5.f2409u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.k.g(long):void");
    }

    public final boolean h(p pVar) {
        i0 i0Var;
        D k8 = q.k(pVar, true, false);
        if (k8 != null) {
            i0Var = O.r(k8);
        } else {
            M m8 = O.f2026V;
            i0Var = i0.f2073Y;
        }
        this.f2405q = i0Var;
        if (k8 == null) {
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        int i8;
        int i9 = this.f2392b;
        if ((i9 & 32) == 0) {
            qVar = new q0(qVar, this.f2391a);
        }
        this.f2387H = qVar;
        int i10 = 0;
        this.f2406r = 0;
        this.f2409u = 0;
        G[] gArr = new G[2];
        this.f2388I = gArr;
        n nVar = this.f2404p;
        if (nVar != null) {
            gArr[0] = nVar;
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i11 = 100;
        if ((i9 & 4) != 0) {
            gArr[i8] = qVar.q(100, 5);
            i11 = 101;
            i8++;
        }
        G[] gArr2 = (G[]) z.Q(i8, this.f2388I);
        this.f2388I = gArr2;
        for (G c8 : gArr2) {
            c8.c(f2379M);
        }
        List list = this.f2393c;
        this.f2389J = new G[list.size()];
        while (i10 < this.f2389J.length) {
            G q7 = this.f2387H.q(i11, 3);
            q7.c((r) list.get(i10));
            this.f2389J[i10] = q7;
            i10++;
            i11++;
        }
    }

    public final void release() {
    }
}
