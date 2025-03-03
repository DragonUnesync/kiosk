package Z0;

import H3.M;
import H3.O;
import H3.i0;
import J1.k;
import M0.C0126n;
import P0.r;
import P0.w;
import R.e;
import R0.h;
import R0.l;
import V1.E;
import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p1.o;

public final class j extends i1.j {

    /* renamed from: F0  reason: collision with root package name */
    public static final AtomicInteger f6806F0 = new AtomicInteger();

    /* renamed from: A0  reason: collision with root package name */
    public volatile boolean f6807A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f6808B0;

    /* renamed from: C0  reason: collision with root package name */
    public i0 f6809C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f6810D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f6811E0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f6812e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f6813f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Uri f6814g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f6815h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f6816i0;

    /* renamed from: j0  reason: collision with root package name */
    public final h f6817j0;

    /* renamed from: k0  reason: collision with root package name */
    public final l f6818k0;

    /* renamed from: l0  reason: collision with root package name */
    public final b f6819l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f6820m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f6821n0;

    /* renamed from: o0  reason: collision with root package name */
    public final w f6822o0;
    public final c p0;

    /* renamed from: q0  reason: collision with root package name */
    public final List f6823q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C0126n f6824r0;

    /* renamed from: s0  reason: collision with root package name */
    public final D1.h f6825s0;

    /* renamed from: t0  reason: collision with root package name */
    public final r f6826t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f6827u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f6828v0;

    /* renamed from: w0  reason: collision with root package name */
    public b f6829w0;

    /* renamed from: x0  reason: collision with root package name */
    public q f6830x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6831y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f6832z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(c cVar, h hVar, l lVar, M0.r rVar, boolean z, h hVar2, l lVar2, boolean z6, Uri uri, List list, int i, Object obj, long j7, long j8, long j9, int i8, boolean z8, int i9, boolean z9, boolean z10, w wVar, C0126n nVar, b bVar, D1.h hVar3, r rVar2, boolean z11, U0.j jVar) {
        super(hVar, lVar, rVar, i, obj, j7, j8, j9);
        l lVar3 = lVar2;
        this.f6827u0 = z;
        this.f6816i0 = i8;
        this.f6811E0 = z8;
        this.f6813f0 = i9;
        this.f6818k0 = lVar3;
        this.f6817j0 = hVar2;
        this.f6832z0 = lVar3 != null;
        this.f6828v0 = z6;
        this.f6814g0 = uri;
        this.f6820m0 = z10;
        this.f6822o0 = wVar;
        this.f6821n0 = z9;
        this.p0 = cVar;
        this.f6823q0 = list;
        this.f6824r0 = nVar;
        this.f6819l0 = bVar;
        this.f6825s0 = hVar3;
        this.f6826t0 = rVar2;
        this.f6815h0 = z11;
        M m8 = O.f2026V;
        this.f6809C0 = i0.f2073Y;
        this.f6812e0 = f6806F0.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i;
        if (F.h.E(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    public final boolean b() {
        throw null;
    }

    public final void c() {
        b bVar;
        this.f6830x0.getClass();
        if (this.f6829w0 == null && (bVar = this.f6819l0) != null) {
            o c8 = bVar.f6772a.c();
            if ((c8 instanceof E) || (c8 instanceof k)) {
                this.f6829w0 = this.f6819l0;
                this.f6832z0 = false;
            }
        }
        if (this.f6832z0) {
            h hVar = this.f6817j0;
            hVar.getClass();
            l lVar = this.f6818k0;
            lVar.getClass();
            d(hVar, lVar, this.f6828v0, false);
            this.f6831y0 = 0;
            this.f6832z0 = false;
        }
        if (!this.f6807A0) {
            if (!this.f6821n0) {
                d(this.f12667c0, this.f12660V, this.f6827u0, true);
            }
            this.f6808B0 = !this.f6807A0;
        }
    }

    public final void d(h hVar, l lVar, boolean z, boolean z6) {
        l lVar2;
        p1.l h5;
        long j7;
        long j8;
        b bVar;
        boolean z8 = false;
        if (z) {
            if (this.f6831y0 != 0) {
                z8 = true;
            }
            lVar2 = lVar;
        } else {
            lVar2 = lVar.a((long) this.f6831y0);
        }
        try {
            h5 = h(hVar, lVar2, z6);
            if (z8) {
                h5.m(this.f6831y0);
            }
            do {
                if (!this.f6807A0) {
                    bVar = this.f6829w0;
                }
                break;
            } while (bVar.f6772a.e(h5, b.f6771f) == 0);
            break;
            j7 = h5.f14408X;
            j8 = lVar.e;
        } catch (EOFException e) {
            if ((this.f12662X.f3029f & 16384) != 0) {
                this.f6829w0.f6772a.a(0, 0);
                j7 = h5.f14408X;
                j8 = lVar.e;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            e.d(hVar);
            throw th;
        }
        this.f6831y0 = (int) (j7 - j8);
        e.d(hVar);
    }

    public final void e() {
        this.f6807A0 = true;
    }

    public final int g(int i) {
        P0.l.j(!this.f6815h0);
        if (i >= this.f6809C0.size()) {
            return 0;
        }
        return ((Integer) this.f6809C0.get(i)).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: V1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: V1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: V1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: I1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: H3.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: V1.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: J1.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: J1.k} */
    /* JADX WARNING: type inference failed for: r11v18, types: [Z0.t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p1.l h(R0.h r34, R0.l r35, boolean r36) {
        /*
            r33 = this;
            r1 = r33
            r0 = r35
            r4 = 10
            r5 = 1
            long r10 = r34.f(r35)
            long r12 = r1.f12665a0
            P0.w r14 = r1.f6822o0
            if (r36 == 0) goto L_0x0024
            boolean r6 = r1.f6820m0     // Catch:{ InterruptedException -> 0x001e, TimeoutException -> 0x0017 }
            r14.h(r12, r6)     // Catch:{ InterruptedException -> 0x001e, TimeoutException -> 0x0017 }
            goto L_0x0024
        L_0x0017:
            r0 = move-exception
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r0)
            throw r2
        L_0x001e:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0024:
            p1.l r15 = new p1.l
            long r8 = r0.e
            r6 = r15
            r7 = r34
            r6.<init>(r7, r8, r10)
            Z0.b r6 = r1.f6829w0
            r7 = 0
            if (r6 != 0) goto L_0x03d3
            P0.r r6 = r1.f6826t0
            r15.f14410Z = r7
            r8 = 8
            r6.E(r4)     // Catch:{ EOFException -> 0x004a }
            byte[] r11 = r6.f3732a     // Catch:{ EOFException -> 0x004a }
            r15.r(r11, r7, r4, r7)     // Catch:{ EOFException -> 0x004a }
            int r11 = r6.y()
            r9 = 4801587(0x494433, float:6.728456E-39)
            if (r11 == r9) goto L_0x0050
        L_0x004a:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a9
        L_0x0050:
            r9 = 3
            r6.I(r9)
            int r9 = r6.u()
            int r10 = r9 + 10
            byte[] r11 = r6.f3732a
            int r2 = r11.length
            if (r10 <= r2) goto L_0x0067
            r6.E(r10)
            byte[] r2 = r6.f3732a
            java.lang.System.arraycopy(r11, r7, r2, r7, r4)
        L_0x0067:
            byte[] r2 = r6.f3732a
            r15.r(r2, r4, r9, r7)
            byte[] r2 = r6.f3732a
            D1.h r4 = r1.f6825s0
            M0.H r2 = r4.H(r9, r2)
            if (r2 != 0) goto L_0x0077
            goto L_0x004a
        L_0x0077:
            M0.G[] r2 = r2.f2837U
            int r4 = r2.length
            r9 = 0
        L_0x007b:
            if (r9 >= r4) goto L_0x004a
            r10 = r2[r9]
            boolean r11 = r10 instanceof D1.m
            if (r11 == 0) goto L_0x00a7
            D1.m r10 = (D1.m) r10
            java.lang.String r11 = r10.f1019V
            java.lang.String r3 = "com.apple.streaming.transportStreamTimestamp"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00a7
            byte[] r2 = r6.f3732a
            byte[] r3 = r10.f1020W
            java.lang.System.arraycopy(r3, r7, r2, r7, r8)
            r6.H(r7)
            r6.G(r8)
            long r2 = r6.p()
            r9 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r2 = r2 & r9
            goto L_0x00a9
        L_0x00a7:
            int r9 = r9 + r5
            goto L_0x007b
        L_0x00a9:
            r15.f14410Z = r7
            Z0.b r4 = r1.f6819l0
            if (r4 == 0) goto L_0x0155
            p1.o r0 = r4.f6772a
            p1.o r6 = r0.c()
            boolean r8 = r6 instanceof V1.E
            if (r8 != 0) goto L_0x00c0
            boolean r6 = r6 instanceof J1.k
            if (r6 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r6 = 0
            goto L_0x00c1
        L_0x00c0:
            r6 = 1
        L_0x00c1:
            r6 = r6 ^ r5
            P0.l.j(r6)
            p1.o r6 = r0.c()
            if (r6 != r0) goto L_0x00cd
            r6 = 1
            goto L_0x00ce
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "Can't recreate wrapped extractors. Outer type: "
            r8.<init>(r11)
            java.lang.Class r11 = r0.getClass()
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            P0.l.i(r8, r6)
            boolean r6 = r0 instanceof Z0.t
            if (r6 == 0) goto L_0x00f9
            Z0.t r0 = new Z0.t
            M0.r r6 = r4.f6773b
            java.lang.String r6 = r6.f3028d
            P0.w r8 = r4.f6774c
            K1.i r11 = r4.f6775d
            boolean r9 = r4.e
            r0.<init>(r6, r8, r11, r9)
        L_0x00f6:
            r17 = r0
            goto L_0x0121
        L_0x00f9:
            boolean r6 = r0 instanceof V1.C0345d
            if (r6 == 0) goto L_0x0103
            V1.d r0 = new V1.d
            r0.<init>()
            goto L_0x00f6
        L_0x0103:
            boolean r6 = r0 instanceof V1.C0342a
            if (r6 == 0) goto L_0x010d
            V1.a r0 = new V1.a
            r0.<init>()
            goto L_0x00f6
        L_0x010d:
            boolean r6 = r0 instanceof V1.C0344c
            if (r6 == 0) goto L_0x0117
            V1.c r0 = new V1.c
            r0.<init>()
            goto L_0x00f6
        L_0x0117:
            boolean r6 = r0 instanceof I1.d
            if (r6 == 0) goto L_0x0141
            I1.d r0 = new I1.d
            r0.<init>()
            goto L_0x00f6
        L_0x0121:
            Z0.b r0 = new Z0.b
            K1.i r6 = r4.f6775d
            boolean r8 = r4.e
            M0.r r9 = r4.f6773b
            P0.w r4 = r4.f6774c
            r16 = r0
            r18 = r9
            r19 = r4
            r20 = r6
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r31 = r2
            r28 = r12
            r30 = r14
            r11 = 0
            goto L_0x034c
        L_0x0141:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = "Unexpected extractor type for recreation: "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L_0x0155:
            java.util.Map r4 = r34.j()
            Z0.c r6 = r1.p0
            r6.getClass()
            M0.r r9 = r1.f12662X
            java.lang.String r10 = r9.f3036n
            int r10 = android.support.v4.media.session.b.r(r10)
            java.lang.String r11 = "Content-Type"
            java.lang.Object r4 = r4.get(r11)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x017e
            boolean r16 = r4.isEmpty()
            if (r16 == 0) goto L_0x0177
            goto L_0x017e
        L_0x0177:
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x017f
        L_0x017e:
            r4 = 0
        L_0x017f:
            int r4 = android.support.v4.media.session.b.r(r4)
            android.net.Uri r0 = r0.f4277a
            int r0 = android.support.v4.media.session.b.s(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r8 = 7
            r11.<init>(r8)
            Z0.c.a(r10, r11)
            Z0.c.a(r4, r11)
            Z0.c.a(r0, r11)
            int[] r16 = Z0.c.f6776c
        L_0x019a:
            if (r7 >= r8) goto L_0x01a4
            r8 = r16[r7]
            Z0.c.a(r8, r11)
            int r7 = r7 + r5
            r8 = 7
            goto L_0x019a
        L_0x01a4:
            r7 = 0
            r15.f14410Z = r7
            r7 = 0
            r17 = 0
        L_0x01aa:
            int r8 = r11.size()
            P0.w r5 = r1.f6822o0
            if (r7 >= r8) goto L_0x032f
            java.lang.Object r8 = r11.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r16 = r11
            if (r8 == 0) goto L_0x02dc
            r11 = 1
            if (r8 == r11) goto L_0x02d0
            r11 = 2
            if (r8 == r11) goto L_0x02c4
            r11 = 7
            if (r8 == r11) goto L_0x02b6
            K1.i r19 = M1.j.f3086H
            java.util.List r11 = r1.f6823q0
            r28 = r12
            r12 = 8
            if (r8 == r12) goto L_0x025f
            r13 = 11
            if (r8 == r13) goto L_0x01f4
            r11 = 13
            if (r8 == r11) goto L_0x01e2
            r31 = r2
            r30 = r14
            r2 = 0
            goto L_0x02e7
        L_0x01e2:
            Z0.t r11 = new Z0.t
            K1.i r13 = r6.f6777a
            boolean r12 = r6.f6778b
            r30 = r14
            java.lang.String r14 = r9.f3028d
            r11.<init>(r14, r5, r13, r12)
            r31 = r2
            r2 = r11
            goto L_0x02e7
        L_0x01f4:
            r30 = r14
            K1.i r12 = r6.f6777a
            boolean r13 = r6.f6778b
            if (r11 == 0) goto L_0x0201
            r14 = 48
        L_0x01fe:
            r20 = r12
            goto L_0x021a
        L_0x0201:
            M0.q r11 = new M0.q
            r11.<init>()
            java.lang.String r14 = "application/cea-608"
            java.lang.String r14 = M0.I.o(r14)
            r11.f2999m = r14
            M0.r r14 = new M0.r
            r14.<init>(r11)
            java.util.List r11 = java.util.Collections.singletonList(r14)
            r14 = 16
            goto L_0x01fe
        L_0x021a:
            java.lang.String r12 = r9.f3033k
            boolean r21 = android.text.TextUtils.isEmpty(r12)
            r31 = r2
            if (r21 != 0) goto L_0x023d
            java.lang.String r2 = "audio/mp4a-latm"
            java.lang.String r2 = M0.I.c(r12, r2)
            if (r2 == 0) goto L_0x022e
            r2 = 2
            goto L_0x0230
        L_0x022e:
            r2 = 2
            r14 = r14 | r2
        L_0x0230:
            java.lang.String r3 = "video/avc"
            java.lang.String r3 = M0.I.c(r12, r3)
            if (r3 == 0) goto L_0x023a
        L_0x0238:
            r3 = 4
            goto L_0x023f
        L_0x023a:
            r3 = 4
            r14 = r14 | r3
            goto L_0x023f
        L_0x023d:
            r2 = 2
            goto L_0x0238
        L_0x023f:
            if (r13 != 0) goto L_0x0245
            r25 = r19
        L_0x0243:
            r12 = 1
            goto L_0x0248
        L_0x0245:
            r25 = r20
            goto L_0x0243
        L_0x0248:
            r24 = r13 ^ 1
            V1.E r12 = new V1.E
            V1.f r13 = new V1.f
            r13.<init>(r14, r11)
            r23 = 2
            r22 = r12
            r26 = r5
            r27 = r13
            r22.<init>(r23, r24, r25, r26, r27)
            r2 = r12
            goto L_0x02e7
        L_0x025f:
            r31 = r2
            r30 = r14
            r2 = 2
            r3 = 4
            K1.i r12 = r6.f6777a
            boolean r13 = r6.f6778b
            M0.H r14 = r9.f3034l
            if (r14 != 0) goto L_0x0271
            r20 = r12
        L_0x026f:
            r2 = 0
            goto L_0x028f
        L_0x0271:
            r2 = 0
        L_0x0272:
            M0.G[] r3 = r14.f2837U
            r20 = r12
            int r12 = r3.length
            if (r2 >= r12) goto L_0x026f
            r3 = r3[r2]
            boolean r12 = r3 instanceof Z0.s
            if (r12 == 0) goto L_0x028a
            Z0.s r3 = (Z0.s) r3
            java.util.List r2 = r3.f6937W
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            goto L_0x028f
        L_0x028a:
            r3 = 1
            int r2 = r2 + r3
            r12 = r20
            goto L_0x0272
        L_0x028f:
            if (r2 == 0) goto L_0x0293
            r2 = 4
            goto L_0x0294
        L_0x0293:
            r2 = 0
        L_0x0294:
            if (r13 != 0) goto L_0x029d
            r2 = r2 | 32
            r24 = r2
            r23 = r19
            goto L_0x02a1
        L_0x029d:
            r24 = r2
            r23 = r20
        L_0x02a1:
            J1.k r2 = new J1.k
            if (r11 == 0) goto L_0x02a8
            r26 = r11
            goto L_0x02ac
        L_0x02a8:
            H3.i0 r3 = H3.i0.f2073Y
            r26 = r3
        L_0x02ac:
            r27 = 0
            r22 = r2
            r25 = r5
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x02e7
        L_0x02b6:
            r31 = r2
            r28 = r12
            r30 = r14
            I1.d r2 = new I1.d
            r11 = 0
            r2.<init>(r11)
            goto L_0x02e7
        L_0x02c4:
            r31 = r2
            r28 = r12
            r30 = r14
            V1.d r2 = new V1.d
            r2.<init>()
            goto L_0x02e7
        L_0x02d0:
            r31 = r2
            r28 = r12
            r30 = r14
            V1.c r2 = new V1.c
            r2.<init>()
            goto L_0x02e7
        L_0x02dc:
            r31 = r2
            r28 = r12
            r30 = r14
            V1.a r2 = new V1.a
            r2.<init>()
        L_0x02e7:
            r2.getClass()
            boolean r3 = r2.h(r15)     // Catch:{ EOFException -> 0x02f8, all -> 0x02f2 }
            r11 = 0
            r15.f14410Z = r11
            goto L_0x02fc
        L_0x02f2:
            r0 = move-exception
            r11 = 0
            r2 = r0
            r15.f14410Z = r11
            throw r2
        L_0x02f8:
            r11 = 0
            r15.f14410Z = r11
            r3 = 0
        L_0x02fc:
            if (r3 == 0) goto L_0x0314
            Z0.b r0 = new Z0.b
            K1.i r3 = r6.f6777a
            boolean r4 = r6.f6778b
            r16 = r0
            r17 = r2
            r18 = r9
            r19 = r5
            r20 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x034c
        L_0x0314:
            if (r17 != 0) goto L_0x0322
            if (r8 == r10) goto L_0x0320
            if (r8 == r4) goto L_0x0320
            if (r8 == r0) goto L_0x0320
            r3 = 11
            if (r8 != r3) goto L_0x0322
        L_0x0320:
            r17 = r2
        L_0x0322:
            r2 = 1
            int r7 = r7 + r2
            r11 = r16
            r12 = r28
            r14 = r30
            r2 = r31
            r5 = 1
            goto L_0x01aa
        L_0x032f:
            r31 = r2
            r28 = r12
            r30 = r14
            r11 = 0
            Z0.b r0 = new Z0.b
            r17.getClass()
            K1.i r2 = r6.f6777a
            boolean r3 = r6.f6778b
            r16 = r0
            r18 = r9
            r19 = r5
            r20 = r2
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x034c:
            r1.f6829w0 = r0
            p1.o r0 = r0.f6772a
            p1.o r0 = r0.c()
            boolean r2 = r0 instanceof V1.C0345d
            if (r2 != 0) goto L_0x0367
            boolean r2 = r0 instanceof V1.C0342a
            if (r2 != 0) goto L_0x0367
            boolean r2 = r0 instanceof V1.C0344c
            if (r2 != 0) goto L_0x0367
            boolean r0 = r0 instanceof I1.d
            if (r0 == 0) goto L_0x0365
            goto L_0x0367
        L_0x0365:
            r7 = 0
            goto L_0x0368
        L_0x0367:
            r7 = 1
        L_0x0368:
            if (r7 == 0) goto L_0x039f
            Z0.q r0 = r1.f6830x0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r31 > r2 ? 1 : (r31 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x037e
            r2 = r30
            r3 = r31
            long r12 = r2.b(r3)
            goto L_0x0380
        L_0x037e:
            r12 = r28
        L_0x0380:
            long r2 = r0.f6895P0
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x03c2
            r0.f6895P0 = r12
            Z0.p[] r0 = r0.p0
            int r2 = r0.length
            r7 = 0
        L_0x038c:
            if (r7 >= r2) goto L_0x03c2
            r3 = r0[r7]
            long r4 = r3.f12405F
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x039c
            r3.f12405F = r12
            r4 = 1
            r3.z = r4
            goto L_0x039d
        L_0x039c:
            r4 = 1
        L_0x039d:
            int r7 = r7 + r4
            goto L_0x038c
        L_0x039f:
            Z0.q r0 = r1.f6830x0
            long r2 = r0.f6895P0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x03c2
            r0.f6895P0 = r4
            Z0.p[] r0 = r0.p0
            int r2 = r0.length
            r7 = 0
        L_0x03af:
            if (r7 >= r2) goto L_0x03c2
            r3 = r0[r7]
            long r8 = r3.f12405F
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x03bf
            r3.f12405F = r4
            r6 = 1
            r3.z = r6
            goto L_0x03c0
        L_0x03bf:
            r6 = 1
        L_0x03c0:
            int r7 = r7 + r6
            goto L_0x03af
        L_0x03c2:
            Z0.q r0 = r1.f6830x0
            java.util.HashSet r0 = r0.f6920r0
            r0.clear()
            Z0.b r0 = r1.f6829w0
            Z0.q r2 = r1.f6830x0
            p1.o r0 = r0.f6772a
            r0.l(r2)
            goto L_0x03d4
        L_0x03d3:
            r11 = 0
        L_0x03d4:
            Z0.q r0 = r1.f6830x0
            M0.n r2 = r0.f6896Q0
            int r3 = P0.z.f3748a
            M0.n r3 = r1.f6824r0
            boolean r2 = j$.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L_0x03fb
            r0.f6896Q0 = r3
            r7 = 0
        L_0x03e5:
            Z0.p[] r2 = r0.p0
            int r4 = r2.length
            if (r7 >= r4) goto L_0x03fb
            boolean[] r4 = r0.f6888I0
            boolean r4 = r4[r7]
            if (r4 == 0) goto L_0x03f8
            r2 = r2[r7]
            r2.f6878I = r3
            r4 = 1
            r2.z = r4
            goto L_0x03f9
        L_0x03f8:
            r4 = 1
        L_0x03f9:
            int r7 = r7 + r4
            goto L_0x03e5
        L_0x03fb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.j.h(R0.h, R0.l, boolean):p1.l");
    }
}
