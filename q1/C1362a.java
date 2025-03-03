package q1;

import D2.j;
import H3.M;
import H3.O;
import H3.i0;
import M0.J;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import p1.G;
import p1.k;
import p1.l;
import p1.n;
import p1.o;
import p1.p;
import p1.q;
import p1.x;
import p1.z;

/* renamed from: q1.a  reason: case insensitive filesystem */
public final class C1362a implements o {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f14709s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f14710t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f14711u;

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f14712v;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14713a = new byte[1];

    /* renamed from: b  reason: collision with root package name */
    public final int f14714b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final n f14715c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14716d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public int f14717f;

    /* renamed from: g  reason: collision with root package name */
    public int f14718g;

    /* renamed from: h  reason: collision with root package name */
    public long f14719h;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f14720j;

    /* renamed from: k  reason: collision with root package name */
    public long f14721k;

    /* renamed from: l  reason: collision with root package name */
    public q f14722l;

    /* renamed from: m  reason: collision with root package name */
    public G f14723m;

    /* renamed from: n  reason: collision with root package name */
    public G f14724n;

    /* renamed from: o  reason: collision with root package name */
    public z f14725o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14726p;

    /* renamed from: q  reason: collision with root package name */
    public long f14727q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14728r;

    static {
        int i8 = P0.z.f3748a;
        Charset charset = StandardCharsets.UTF_8;
        f14711u = "#!AMR\n".getBytes(charset);
        f14712v = "#!AMR-WB\n".getBytes(charset);
    }

    public C1362a() {
        n nVar = new n();
        this.f14715c = nVar;
        this.f14724n = nVar;
    }

    public final void a(long j7, long j8) {
        long j9;
        this.e = 0;
        this.f14717f = 0;
        this.f14718g = 0;
        this.f14727q = j8;
        z zVar = this.f14725o;
        if (zVar instanceof x) {
            x xVar = (x) zVar;
            j jVar = xVar.f14448b;
            if (jVar.f1093U == 0) {
                j9 = -9223372036854775807L;
            } else {
                j9 = jVar.n(P0.z.b(xVar.f14447a, j7));
            }
            this.f14721k = j9;
            if (Math.abs(this.f14727q - j9) >= 20000) {
                this.f14726p = true;
                this.f14724n = this.f14715c;
            }
        } else if (j7 == 0 || !(zVar instanceof k)) {
            this.f14721k = 0;
        } else {
            k kVar = (k) zVar;
            this.f14721k = (Math.max(0, j7 - kVar.f14400b) * 8000000) / ((long) kVar.e);
        }
    }

    public final int b(l lVar) {
        String str;
        boolean z;
        lVar.f14410Z = 0;
        byte[] bArr = this.f14713a;
        lVar.r(bArr, 0, 1, false);
        byte b8 = bArr[0];
        if ((b8 & 131) <= 0) {
            int i8 = (b8 >> 3) & 15;
            if (i8 < 0 || i8 > 15 || ((!(z = this.f14716d) || (i8 >= 10 && i8 <= 13)) && (z || (i8 >= 12 && i8 <= 14)))) {
                StringBuilder sb = new StringBuilder("Illegal AMR ");
                if (this.f14716d) {
                    str = "WB";
                } else {
                    str = "NB";
                }
                sb.append(str);
                sb.append(" frame type ");
                sb.append(i8);
                throw J.a((RuntimeException) null, sb.toString());
            } else if (z) {
                return f14710t[i8];
            } else {
                return f14709s[i8];
            }
        } else {
            throw J.a((RuntimeException) null, "Invalid padding bits for frame header " + b8);
        }
    }

    public final o c() {
        return this;
    }

    public final boolean d(l lVar) {
        lVar.f14410Z = 0;
        byte[] bArr = f14711u;
        byte[] bArr2 = new byte[bArr.length];
        lVar.r(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f14716d = false;
            lVar.m(bArr.length);
            return true;
        }
        lVar.f14410Z = 0;
        byte[] bArr3 = f14712v;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.r(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f14716d = true;
        lVar.m(bArr3.length);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r25, M0.C0132u r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 0
            r3 = 1
            p1.G r4 = r0.f14723m
            P0.l.k(r4)
            int r4 = P0.z.f3748a
            r4 = r1
            p1.l r4 = (p1.l) r4
            long r4 = r4.f14408X
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002a
            r4 = r1
            p1.l r4 = (p1.l) r4
            boolean r4 = r0.d(r4)
            if (r4 == 0) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            java.lang.String r1 = "Could not find AMR header."
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x002a:
            boolean r4 = r0.f14728r
            if (r4 != 0) goto L_0x0064
            r0.f14728r = r3
            boolean r4 = r0.f14716d
            if (r4 == 0) goto L_0x0037
            java.lang.String r5 = "audio/amr-wb"
            goto L_0x0039
        L_0x0037:
            java.lang.String r5 = "audio/3gpp"
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            r8 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x0040
        L_0x003e:
            r8 = 8000(0x1f40, float:1.121E-41)
        L_0x0040:
            if (r4 == 0) goto L_0x0049
            int[] r4 = f14710t
            r9 = 8
            r4 = r4[r9]
            goto L_0x004e
        L_0x0049:
            int[] r4 = f14709s
            r9 = 7
            r4 = r4[r9]
        L_0x004e:
            p1.G r9 = r0.f14724n
            M0.q r10 = new M0.q
            r10.<init>()
            java.lang.String r5 = M0.I.o(r5)
            r10.f2999m = r5
            r10.f3000n = r4
            r10.f2979B = r3
            r10.f2980C = r8
            Q0.g.v(r10, r9)
        L_0x0064:
            int r4 = r0.f14718g
            r8 = 20000(0x4e20, double:9.8813E-320)
            r5 = -1
            if (r4 != 0) goto L_0x00d2
            r4 = r1
            p1.l r4 = (p1.l) r4     // Catch:{ EOFException -> 0x00d0 }
            int r4 = r0.b(r4)     // Catch:{ EOFException -> 0x00d0 }
            r0.f14717f = r4     // Catch:{ EOFException -> 0x00d0 }
            r0.f14718g = r4
            int r10 = r0.i
            if (r10 != r5) goto L_0x0083
            r10 = r1
            p1.l r10 = (p1.l) r10
            long r10 = r10.f14408X
            r0.f14719h = r10
            r0.i = r4
        L_0x0083:
            int r10 = r0.i
            if (r10 != r4) goto L_0x008c
            int r10 = r0.f14720j
            int r10 = r10 + r3
            r0.f14720j = r10
        L_0x008c:
            p1.z r10 = r0.f14725o
            boolean r11 = r10 instanceof p1.x
            if (r11 == 0) goto L_0x00d2
            p1.x r10 = (p1.x) r10
            long r11 = r0.f14721k
            long r13 = r0.e
            long r11 = r11 + r13
            long r11 = r11 + r8
            r13 = r1
            p1.l r13 = (p1.l) r13
            long r13 = r13.f14408X
            long r6 = (long) r4
            long r13 = r13 + r6
            D2.j r4 = r10.f14448b
            int r6 = r4.f1093U
            if (r6 != 0) goto L_0x00a8
            goto L_0x00b7
        L_0x00a8:
            int r6 = r6 - r3
            long r6 = r4.n(r6)
            long r6 = r11 - r6
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r4 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b7
            goto L_0x00ba
        L_0x00b7:
            r10.a(r11, r13)
        L_0x00ba:
            boolean r4 = r0.f14726p
            if (r4 == 0) goto L_0x00d2
            long r6 = r0.f14727q
            long r6 = r6 - r11
            long r6 = java.lang.Math.abs(r6)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d2
            r0.f14726p = r2
            p1.G r4 = r0.f14723m
            r0.f14724n = r4
            goto L_0x00d2
        L_0x00d0:
            r4 = -1
            goto L_0x0103
        L_0x00d2:
            p1.G r4 = r0.f14724n
            int r6 = r0.f14718g
            int r4 = r4.b(r1, r6, r3)
            if (r4 != r5) goto L_0x00dd
            goto L_0x00d0
        L_0x00dd:
            int r6 = r0.f14718g
            int r6 = r6 - r4
            r0.f14718g = r6
            if (r6 <= 0) goto L_0x00e6
        L_0x00e4:
            r4 = 0
            goto L_0x0103
        L_0x00e6:
            p1.G r4 = r0.f14724n
            long r6 = r0.f14721k
            long r10 = r0.e
            long r18 = r6 + r10
            int r6 = r0.f14717f
            r20 = 1
            r22 = 0
            r23 = 0
            r17 = r4
            r21 = r6
            r17.e(r18, r20, r21, r22, r23)
            long r6 = r0.e
            long r6 = r6 + r8
            r0.e = r6
            goto L_0x00e4
        L_0x0103:
            p1.l r1 = (p1.l) r1
            p1.z r6 = r0.f14725o
            if (r6 == 0) goto L_0x010b
            goto L_0x0172
        L_0x010b:
            int r6 = r0.f14714b
            r7 = r6 & 4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 == 0) goto L_0x012a
            p1.x r1 = new p1.x
            long r6 = r0.f14719h
            long[] r8 = new long[r3]
            r8[r2] = r6
            long[] r3 = new long[r3]
            r6 = 0
            r3[r2] = r6
            r1.<init>(r10, r8, r3)
            r0.f14725o = r1
            goto L_0x0169
        L_0x012a:
            r7 = r6 & 1
            if (r7 == 0) goto L_0x0162
            int r7 = r0.i
            if (r7 == r5) goto L_0x0137
            int r12 = r0.f14717f
            if (r7 == r12) goto L_0x0137
            goto L_0x0162
        L_0x0137:
            int r10 = r0.f14720j
            r11 = 20
            if (r10 >= r11) goto L_0x013f
            if (r4 != r5) goto L_0x0169
        L_0x013f:
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0146
            r19 = 1
            goto L_0x0148
        L_0x0146:
            r19 = 0
        L_0x0148:
            long r2 = (long) r7
            r10 = 8000000(0x7a1200, double:3.952525E-317)
            long r2 = r2 * r10
            long r2 = r2 / r8
            int r3 = (int) r2
            p1.k r2 = new p1.k
            long r8 = r0.f14719h
            long r13 = r1.f14407W
            r12 = r2
            r15 = r8
            r17 = r3
            r18 = r7
            r12.<init>(r13, r15, r17, r18, r19)
            r0.f14725o = r2
            goto L_0x0169
        L_0x0162:
            p1.s r1 = new p1.s
            r1.<init>(r10)
            r0.f14725o = r1
        L_0x0169:
            p1.z r1 = r0.f14725o
            if (r1 == 0) goto L_0x0172
            p1.q r2 = r0.f14722l
            r2.l(r1)
        L_0x0172:
            if (r4 != r5) goto L_0x0189
            p1.z r1 = r0.f14725o
            boolean r2 = r1 instanceof p1.x
            if (r2 == 0) goto L_0x0189
            long r2 = r0.f14721k
            long r5 = r0.e
            long r2 = r2 + r5
            r5 = r1
            p1.x r5 = (p1.x) r5
            r5.f14449c = r2
            p1.q r2 = r0.f14722l
            r2.l(r1)
        L_0x0189:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C1362a.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        return d((l) pVar);
    }

    public final void l(q qVar) {
        this.f14722l = qVar;
        G q7 = qVar.q(0, 1);
        this.f14723m = q7;
        this.f14724n = q7;
        qVar.g();
    }

    public final void release() {
    }
}
