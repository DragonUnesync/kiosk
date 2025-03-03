package I1;

import B7.g;
import D2.j;
import H3.M;
import H3.O;
import H3.i0;
import M0.H;
import P0.r;
import P0.z;
import T3.a;
import java.io.EOFException;
import java.util.List;
import p1.C1332b;
import p1.G;
import p1.k;
import p1.l;
import p1.n;
import p1.o;
import p1.p;
import p1.q;
import p1.v;

public final class d implements o {

    /* renamed from: v  reason: collision with root package name */
    public static final g f2225v = new g(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f2226a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2227b;

    /* renamed from: c  reason: collision with root package name */
    public final r f2228c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2229d;
    public final v e;

    /* renamed from: f  reason: collision with root package name */
    public final U1.a f2230f;

    /* renamed from: g  reason: collision with root package name */
    public final n f2231g;

    /* renamed from: h  reason: collision with root package name */
    public q f2232h;
    public G i;

    /* renamed from: j  reason: collision with root package name */
    public G f2233j;

    /* renamed from: k  reason: collision with root package name */
    public int f2234k;

    /* renamed from: l  reason: collision with root package name */
    public H f2235l;

    /* renamed from: m  reason: collision with root package name */
    public long f2236m;

    /* renamed from: n  reason: collision with root package name */
    public long f2237n;

    /* renamed from: o  reason: collision with root package name */
    public long f2238o;

    /* renamed from: p  reason: collision with root package name */
    public long f2239p;

    /* renamed from: q  reason: collision with root package name */
    public int f2240q;

    /* renamed from: r  reason: collision with root package name */
    public f f2241r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2242s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2243t;

    /* renamed from: u  reason: collision with root package name */
    public long f2244u;

    public d() {
        this(-9223372036854775807L);
    }

    public static long b(H h5) {
        if (h5 == null) {
            return -9223372036854775807L;
        }
        for (M0.G g8 : h5.f2837U) {
            if (g8 instanceof D1.n) {
                D1.n nVar = (D1.n) g8;
                if (nVar.f1009U.equals("TLEN")) {
                    return z.O(Long.parseLong((String) nVar.f1022W.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(long j7, long j8) {
        this.f2234k = 0;
        this.f2236m = -9223372036854775807L;
        this.f2237n = 0;
        this.f2240q = 0;
        this.f2244u = j8;
        f fVar = this.f2241r;
        if (fVar instanceof b) {
            j jVar = ((b) fVar).f2221c.f14448b;
            int i8 = jVar.f1093U;
            if (i8 == 0 || j8 - jVar.n(i8 - 1) >= 100000) {
                this.f2243t = true;
                this.f2233j = this.f2231g;
            }
        }
    }

    public final o c() {
        return this;
    }

    public final void d() {
        f fVar = this.f2241r;
        if ((fVar instanceof a) && ((k) fVar).g()) {
            long j7 = this.f2239p;
            if (j7 != -1 && j7 != this.f2241r.d()) {
                a aVar = (a) this.f2241r;
                long j8 = this.f2239p;
                int i8 = aVar.f2216j;
                this.f2241r = new a(j8, aVar.f2215h, aVar.i, i8, aVar.f2217k);
                q qVar = this.f2232h;
                qVar.getClass();
                qVar.l(this.f2241r);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: I1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: I1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: I1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: I1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: I1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: I1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: I1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: I1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: I1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: I1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: I1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: I1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: I1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: I1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: I1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: I1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: I1.g} */
    /* JADX WARNING: type inference failed for: r0v29, types: [p1.s] */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r39v5, types: [I1.a] */
    /* JADX WARNING: type inference failed for: r40v2, types: [I1.h] */
    /* JADX WARNING: type inference failed for: r30v3, types: [I1.h] */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03c1, code lost:
        if (r1 == null) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c4, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r6 != 1231971951) goto L_0x0070;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r51, M0.C0132u r52) {
        /*
            r50 = this;
            r0 = r50
            r1 = r51
            r2 = 2
            r3 = 4
            r4 = 1
            p1.G r5 = r0.i
            P0.l.k(r5)
            int r5 = P0.z.f3748a
            int r5 = r0.f2234k
            r7 = 1000000(0xf4240, double:4.940656E-318)
            T3.a r9 = r0.f2229d
            r10 = 0
            if (r5 != 0) goto L_0x0026
            r5 = r1
            p1.l r5 = (p1.l) r5     // Catch:{ EOFException -> 0x001f }
            r0.i(r5, r10)     // Catch:{ EOFException -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r2 = r0
            r7 = r9
            r0 = -1
            r14 = -1
            goto L_0x057d
        L_0x0026:
            I1.f r5 = r0.f2241r
            P0.r r11 = r0.f2228c
            if (r5 != 0) goto L_0x0454
            P0.r r5 = new P0.r
            int r12 = r9.f5000b
            r5.<init>((int) r12)
            byte[] r12 = r5.f3732a
            int r13 = r9.f5000b
            r14 = r1
            p1.l r14 = (p1.l) r14
            r14.r(r12, r10, r13, r10)
            int r12 = r9.f4999a
            r12 = r12 & r4
            r13 = 36
            if (r12 == 0) goto L_0x004e
            int r12 = r9.f5002d
            if (r12 == r4) goto L_0x004b
            r12 = 36
            goto L_0x0055
        L_0x004b:
            r12 = 21
            goto L_0x0055
        L_0x004e:
            int r12 = r9.f5002d
            if (r12 == r4) goto L_0x0053
            goto L_0x004b
        L_0x0053:
            r12 = 13
        L_0x0055:
            int r15 = r5.f3734c
            int r6 = r12 + 4
            r14 = 1447187017(0x56425249, float:5.3414667E13)
            r3 = 1231971951(0x496e666f, float:976486.94)
            r4 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r15 < r6) goto L_0x0070
            r5.H(r12)
            int r6 = r5.i()
            if (r6 == r4) goto L_0x0084
            if (r6 != r3) goto L_0x0070
            goto L_0x0084
        L_0x0070:
            int r6 = r5.f3734c
            r12 = 40
            if (r6 < r12) goto L_0x0083
            r5.H(r13)
            int r6 = r5.i()
            if (r6 != r14) goto L_0x0083
            r6 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0084
        L_0x0083:
            r6 = 0
        L_0x0084:
            p1.v r12 = r0.e
            r20 = -1
            if (r6 == r3) goto L_0x009d
            if (r6 == r14) goto L_0x00a2
            if (r6 == r4) goto L_0x009d
            r3 = r1
            p1.l r3 = (p1.l) r3
            r3.f14410Z = r10
            r2 = r0
            r0 = r1
            r7 = r9
            r29 = r11
            r24 = r12
            r1 = 0
            goto L_0x030d
        L_0x009d:
            r7 = r9
            r29 = r11
            goto L_0x0181
        L_0x00a2:
            r3 = r1
            p1.l r3 = (p1.l) r3
            long r14 = r3.f14408X
            r4 = 10
            r5.I(r4)
            int r4 = r5.i()
            if (r4 > 0) goto L_0x00b9
            r0 = r3
            r7 = r9
            r29 = r11
        L_0x00b6:
            r1 = 0
            goto L_0x0174
        L_0x00b9:
            int r6 = r9.f5001c
            r29 = r11
            long r10 = (long) r4
            r4 = 32000(0x7d00, float:4.4842E-41)
            if (r6 < r4) goto L_0x00c7
            r4 = 1152(0x480, float:1.614E-42)
        L_0x00c4:
            r30 = r14
            goto L_0x00ca
        L_0x00c7:
            r4 = 576(0x240, float:8.07E-43)
            goto L_0x00c4
        L_0x00ca:
            long r13 = (long) r4
            long r24 = r13 * r7
            long r13 = (long) r6
            java.math.RoundingMode r28 = java.math.RoundingMode.DOWN
            r22 = r10
            r26 = r13
            long r35 = P0.z.W(r22, r24, r26, r28)
            int r4 = r5.B()
            int r6 = r5.B()
            int r10 = r5.B()
            r5.I(r2)
            int r11 = r9.f5000b
            long r13 = (long) r11
            long r14 = r30 + r13
            long[] r11 = new long[r4]
            long[] r13 = new long[r4]
            r18 = r3
            r2 = r30
            r7 = 0
        L_0x00f5:
            if (r7 >= r4) goto L_0x0138
            r24 = r9
            long r8 = (long) r7
            long r8 = r8 * r35
            long r0 = (long) r4
            long r8 = r8 / r0
            r11[r7] = r8
            long r0 = java.lang.Math.max(r2, r14)
            r13[r7] = r0
            r0 = 1
            if (r10 == r0) goto L_0x0126
            r0 = 2
            if (r10 == r0) goto L_0x0121
            r0 = 3
            if (r10 == r0) goto L_0x011c
            r0 = 4
            if (r10 == r0) goto L_0x0117
            r0 = r18
            r7 = r24
            goto L_0x00b6
        L_0x0117:
            int r0 = r5.z()
            goto L_0x012a
        L_0x011c:
            int r0 = r5.y()
            goto L_0x012a
        L_0x0121:
            int r0 = r5.B()
            goto L_0x012a
        L_0x0126:
            int r0 = r5.v()
        L_0x012a:
            long r0 = (long) r0
            long r8 = (long) r6
            long r0 = r0 * r8
            long r2 = r2 + r0
            r0 = 1
            int r7 = r7 + r0
            r0 = r50
            r1 = r51
            r9 = r24
            goto L_0x00f5
        L_0x0138:
            r24 = r9
            r0 = r18
            long r4 = r0.f14407W
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x0161
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0161
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "VBRI data size mismatch: "
            r1.<init>(r6)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "VbriSeeker"
            P0.l.B(r4, r1)
        L_0x0161:
            I1.g r1 = new I1.g
            r7 = r24
            int r4 = r7.e
            r32 = r1
            r33 = r11
            r34 = r13
            r37 = r2
            r39 = r4
            r32.<init>(r33, r34, r35, r37, r39)
        L_0x0174:
            int r2 = r7.f5000b
            r0.m(r2)
            r2 = r50
            r0 = r51
            r24 = r12
            goto L_0x030d
        L_0x0181:
            int r0 = r5.i()
            r1 = 1
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0190
            int r1 = r5.z()
        L_0x018e:
            r2 = 2
            goto L_0x0192
        L_0x0190:
            r1 = -1
            goto L_0x018e
        L_0x0192:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x019e
            long r2 = r5.x()
            r37 = r2
        L_0x019c:
            r2 = 4
            goto L_0x01a1
        L_0x019e:
            r37 = r20
            goto L_0x019c
        L_0x01a1:
            r3 = r0 & 4
            if (r3 != r2) goto L_0x01b9
            r2 = 100
            long[] r3 = new long[r2]
            r9 = 0
        L_0x01aa:
            if (r9 >= r2) goto L_0x01b6
            int r10 = r5.v()
            long r10 = (long) r10
            r3[r9] = r10
            r10 = 1
            int r9 = r9 + r10
            goto L_0x01aa
        L_0x01b6:
            r39 = r3
            goto L_0x01bb
        L_0x01b9:
            r39 = 0
        L_0x01bb:
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01c3
            r0 = 4
            r5.I(r0)
        L_0x01c3:
            int r0 = r5.a()
            r2 = 24
            if (r0 < r2) goto L_0x01dd
            r0 = 21
            r5.I(r0)
            int r0 = r5.y()
            r2 = 16773120(0xfff000, float:2.3504147E-38)
            r2 = r2 & r0
            int r2 = r2 >> 12
            r0 = r0 & 4095(0xfff, float:5.738E-42)
            goto L_0x01df
        L_0x01dd:
            r0 = -1
            r2 = -1
        L_0x01df:
            long r9 = (long) r1
            int r1 = r7.f5000b
            int r3 = r7.f5001c
            int r5 = r7.e
            int r11 = r7.f5003f
            int r13 = r12.f14435a
            r14 = -1
            if (r13 == r14) goto L_0x01f4
            int r13 = r12.f14436b
            if (r13 == r14) goto L_0x01f4
        L_0x01f1:
            r0 = r51
            goto L_0x01fd
        L_0x01f4:
            if (r2 == r14) goto L_0x01f1
            if (r0 == r14) goto L_0x01f1
            r12.f14435a = r2
            r12.f14436b = r0
            goto L_0x01f1
        L_0x01fd:
            r2 = r0
            p1.l r2 = (p1.l) r2
            long r13 = r2.f14408X
            r26 = r9
            long r8 = r2.f14407W
            int r10 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x023b
            int r10 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x023b
            r15 = r5
            long r4 = r13 + r37
            int r18 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x0238
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r24 = r12
            java.lang.String r12 = "Data size mismatch between stream ("
            r10.<init>(r12)
            r10.append(r8)
            java.lang.String r12 = ") and Xing frame ("
            r10.append(r12)
            r10.append(r4)
            java.lang.String r4 = "), using Xing value."
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            java.lang.String r5 = "Mp3Extractor"
            P0.l.s(r5, r4)
            goto L_0x023d
        L_0x0238:
            r24 = r12
            goto L_0x023d
        L_0x023b:
            r15 = r5
            goto L_0x0238
        L_0x023d:
            int r4 = r7.f5000b
            r2.m(r4)
            r4 = 1
            r2 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r6 != r2) goto L_0x02a2
            int r2 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x0264
            r8 = 0
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0254
            goto L_0x0264
        L_0x0254:
            long r8 = (long) r11
            long r9 = r26 * r8
            long r9 = r9 - r4
            long r2 = P0.z.U(r3, r9)
            r44 = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x026e
        L_0x0264:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r44 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x026e:
            int r4 = (r44 > r2 ? 1 : (r44 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0274
        L_0x0272:
            r1 = 0
            goto L_0x029e
        L_0x0274:
            int r2 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x028c
            if (r39 != 0) goto L_0x027b
            goto L_0x028c
        L_0x027b:
            I1.h r2 = new I1.h
            r30 = r2
            r31 = r13
            r33 = r1
            r34 = r44
            r36 = r15
            r30.<init>(r31, r33, r34, r36, r37, r39)
        L_0x028a:
            r1 = r2
            goto L_0x029e
        L_0x028c:
            I1.h r2 = new I1.h
            r47 = -1
            r49 = 0
            r40 = r2
            r41 = r13
            r43 = r1
            r46 = r15
            r40.<init>(r41, r43, r44, r46, r47, r49)
            goto L_0x028a
        L_0x029e:
            r2 = r50
            goto L_0x030d
        L_0x02a2:
            int r2 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x02bd
            r16 = 0
            int r2 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x02ad
            goto L_0x02bd
        L_0x02ad:
            long r10 = (long) r11
            long r10 = r10 * r26
            long r10 = r10 - r4
            long r2 = P0.z.U(r3, r10)
            r34 = r2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02c7
        L_0x02bd:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02c7:
            int r4 = (r34 > r2 ? 1 : (r34 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x02cc
            goto L_0x0272
        L_0x02cc:
            int r2 = (r37 > r20 ? 1 : (r37 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x02da
            long r8 = r13 + r37
            long r2 = (long) r1
            long r37 = r37 - r2
        L_0x02d5:
            r40 = r8
            r2 = r37
            goto L_0x02e4
        L_0x02da:
            int r2 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x0272
            long r2 = r8 - r13
            long r4 = (long) r1
            long r37 = r2 - r4
            goto L_0x02d5
        L_0x02e4:
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            r32 = 8000000(0x7a1200, double:3.952525E-317)
            r30 = r2
            r36 = r4
            long r5 = P0.z.W(r30, r32, r34, r36)
            int r44 = E.e.c(r5)
            r5 = r26
            long r2 = B.C0003d.o(r2, r5, r4)
            int r45 = E.e.c(r2)
            I1.a r2 = new I1.a
            long r3 = (long) r1
            long r42 = r13 + r3
            r46 = 0
            r39 = r2
            r39.<init>(r40, r42, r44, r45, r46)
            goto L_0x028a
        L_0x030d:
            M0.H r3 = r2.f2235l
            r4 = r0
            p1.l r4 = (p1.l) r4
            long r5 = r4.f14408X
            if (r3 == 0) goto L_0x0376
            M0.G[] r8 = r3.f2837U
            int r9 = r8.length
            r10 = 0
        L_0x031a:
            if (r10 >= r9) goto L_0x0376
            r11 = r8[r10]
            boolean r12 = r11 instanceof D1.l
            if (r12 == 0) goto L_0x036f
            D1.l r11 = (D1.l) r11
            long r8 = b(r3)
            int[] r3 = r11.f1017Y
            int r3 = r3.length
            r19 = 1
            int r10 = r3 + 1
            long[] r12 = new long[r10]
            long[] r10 = new long[r10]
            r13 = 0
            r12[r13] = r5
            r14 = 0
            r10[r13] = r14
            r13 = 0
            r15 = 1
        L_0x033d:
            if (r15 > r3) goto L_0x0366
            int r18 = r15 + -1
            r26 = r3
            int[] r3 = r11.f1017Y
            r3 = r3[r18]
            int r0 = r11.f1015W
            int r0 = r0 + r3
            r27 = r4
            long r3 = (long) r0
            long r5 = r5 + r3
            int[] r0 = r11.f1018Z
            r0 = r0[r18]
            int r3 = r11.f1016X
            int r3 = r3 + r0
            long r3 = (long) r3
            long r13 = r13 + r3
            r12[r15] = r5
            r10[r15] = r13
            r0 = 1
            int r15 = r15 + r0
            r0 = r51
            r3 = r26
            r4 = r27
            r19 = 1
            goto L_0x033d
        L_0x0366:
            r27 = r4
            r0 = 1
            I1.c r3 = new I1.c
            r3.<init>(r8, r12, r10)
            goto L_0x0379
        L_0x036f:
            r27 = r4
            r0 = 1
            int r10 = r10 + r0
            r0 = r51
            goto L_0x031a
        L_0x0376:
            r27 = r4
            r3 = 0
        L_0x0379:
            boolean r0 = r2.f2242s
            int r4 = r2.f2226a
            if (r0 == 0) goto L_0x0390
            I1.e r0 = new I1.e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.<init>(r5)
            r3 = r0
            r0 = r27
        L_0x038c:
            r1 = r29
            goto L_0x03ff
        L_0x0390:
            r0 = 4
            r5 = r4 & 4
            if (r5 == 0) goto L_0x03bb
            if (r3 == 0) goto L_0x039d
            long r0 = r3.f2224c
        L_0x0399:
            r9 = r0
        L_0x039a:
            r13 = r20
            goto L_0x03b0
        L_0x039d:
            if (r1 == 0) goto L_0x03a9
            long r5 = r1.k()
            long r20 = r1.d()
            r9 = r5
            goto L_0x039a
        L_0x03a9:
            M0.H r0 = r2.f2235l
            long r0 = b(r0)
            goto L_0x0399
        L_0x03b0:
            I1.b r1 = new I1.b
            r0 = r27
            long r11 = r0.f14408X
            r8 = r1
            r8.<init>(r9, r11, r13)
            goto L_0x03c5
        L_0x03bb:
            r0 = r27
            if (r3 == 0) goto L_0x03c1
            r1 = r3
            goto L_0x03c5
        L_0x03c1:
            if (r1 == 0) goto L_0x03c4
            goto L_0x03c5
        L_0x03c4:
            r1 = 0
        L_0x03c5:
            if (r1 == 0) goto L_0x03d2
            boolean r3 = r1.g()
            if (r3 != 0) goto L_0x03d4
            r3 = 1
            r5 = r4 & 1
            if (r5 == 0) goto L_0x03d4
        L_0x03d2:
            r1 = 2
            goto L_0x03d6
        L_0x03d4:
            r3 = r1
            goto L_0x038c
        L_0x03d6:
            r1 = r1 & r4
            if (r1 == 0) goto L_0x03dd
            r1 = r29
            r15 = 1
            goto L_0x03e0
        L_0x03dd:
            r1 = r29
            r15 = 0
        L_0x03e0:
            byte[] r3 = r1.f3732a
            r5 = 0
            r6 = 4
            r0.r(r3, r5, r6, r5)
            r1.H(r5)
            int r3 = r1.i()
            r7.e(r3)
            I1.a r3 = new I1.a
            long r11 = r0.f14408X
            int r13 = r7.e
            int r14 = r7.f5000b
            long r9 = r0.f14407W
            r8 = r3
            r8.<init>(r9, r11, r13, r14, r15)
        L_0x03ff:
            r2.f2241r = r3
            p1.q r5 = r2.f2232h
            r5.l(r3)
            M0.q r3 = new M0.q
            r3.<init>()
            java.lang.Object r5 = r7.f5004g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = M0.I.o(r5)
            r3.f2999m = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r3.f3000n = r5
            int r5 = r7.f5002d
            r3.f2979B = r5
            int r5 = r7.f5001c
            r3.f2980C = r5
            r5 = r24
            int r6 = r5.f14435a
            r3.f2982E = r6
            int r5 = r5.f14436b
            r3.f2983F = r5
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0431
            r13 = 0
            goto L_0x0433
        L_0x0431:
            M0.H r13 = r2.f2235l
        L_0x0433:
            r3.f2997k = r13
            I1.f r4 = r2.f2241r
            int r4 = r4.j()
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 == r5) goto L_0x0448
            I1.f r4 = r2.f2241r
            int r4 = r4.j()
            r3.f2995h = r4
        L_0x0448:
            p1.G r4 = r2.f2233j
            Q0.g.v(r3, r4)
            long r3 = r0.f14408X
            r2.f2238o = r3
        L_0x0451:
            r0 = r51
            goto L_0x0472
        L_0x0454:
            r2 = r0
            r7 = r9
            r1 = r11
            long r3 = r2.f2238o
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0451
            r0 = r51
            r5 = r0
            p1.l r5 = (p1.l) r5
            long r5 = r5.f14408X
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0472
            long r3 = r3 - r5
            int r4 = (int) r3
            r3 = r0
            p1.l r3 = (p1.l) r3
            r3.m(r4)
        L_0x0472:
            int r3 = r2.f2240q
            if (r3 != 0) goto L_0x0538
            r3 = r0
            p1.l r3 = (p1.l) r3
            r4 = 0
            r3.f14410Z = r4
            r3 = r0
            p1.l r3 = (p1.l) r3
            boolean r5 = r2.g(r3)
            if (r5 == 0) goto L_0x0488
        L_0x0485:
            r10 = -1
            goto L_0x057b
        L_0x0488:
            r1.H(r4)
            int r1 = r1.i()
            int r4 = r2.f2234k
            long r4 = (long) r4
            r6 = -128000(0xfffffffffffe0c00, float:NaN)
            r6 = r6 & r1
            long r8 = (long) r6
            r10 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r4 & r10
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x04a6
            int r4 = p1.C1332b.i(r1)
            r5 = -1
            if (r4 != r5) goto L_0x04aa
        L_0x04a6:
            r1 = 0
            r4 = 1
            goto L_0x053a
        L_0x04aa:
            r7.e(r1)
            long r4 = r2.f2236m
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x04d6
            I1.f r1 = r2.f2241r
            long r4 = r3.f14408X
            long r4 = r1.b(r4)
            r2.f2236m = r4
            long r4 = r2.f2227b
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x04d6
            I1.f r1 = r2.f2241r
            r8 = 0
            long r8 = r1.b(r8)
            long r10 = r2.f2236m
            long r4 = r4 - r8
            long r4 = r4 + r10
            r2.f2236m = r4
        L_0x04d6:
            int r1 = r7.f5000b
            r2.f2240q = r1
            long r3 = r3.f14408X
            long r5 = (long) r1
            long r3 = r3 + r5
            r2.f2239p = r3
            I1.f r1 = r2.f2241r
            boolean r5 = r1 instanceof I1.b
            if (r5 == 0) goto L_0x0538
            I1.b r1 = (I1.b) r1
            long r5 = r2.f2237n
            int r8 = r7.f5003f
            long r8 = (long) r8
            long r5 = r5 + r8
            long r8 = r2.f2236m
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r10
            int r10 = r7.f5001c
            long r10 = (long) r10
            long r5 = r5 / r10
            long r5 = r5 + r8
            p1.x r8 = r1.f2221c
            D2.j r8 = r8.f14448b
            int r9 = r8.f1093U
            r10 = 100000(0x186a0, double:4.94066E-319)
            p1.x r1 = r1.f2221c
            if (r9 != 0) goto L_0x0508
            goto L_0x0515
        L_0x0508:
            r12 = 1
            int r9 = r9 - r12
            long r8 = r8.n(r9)
            long r8 = r5 - r8
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0515
            goto L_0x0518
        L_0x0515:
            r1.a(r5, r3)
        L_0x0518:
            boolean r3 = r2.f2243t
            if (r3 == 0) goto L_0x0538
            long r3 = r2.f2244u
            D2.j r1 = r1.f14448b
            int r5 = r1.f1093U
            if (r5 != 0) goto L_0x0526
        L_0x0524:
            r1 = 0
            goto L_0x0538
        L_0x0526:
            r6 = 1
            int r5 = r5 - r6
            long r5 = r1.n(r5)
            long r3 = r3 - r5
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0524
            r1 = 0
            r2.f2243t = r1
            p1.G r3 = r2.i
            r2.f2233j = r3
        L_0x0538:
            r4 = 1
            goto L_0x0541
        L_0x053a:
            r3.m(r4)
            r2.f2234k = r1
        L_0x053f:
            r10 = 0
            goto L_0x057b
        L_0x0541:
            p1.G r1 = r2.f2233j
            int r3 = r2.f2240q
            int r0 = r1.b(r0, r3, r4)
            r1 = -1
            if (r0 != r1) goto L_0x054e
            goto L_0x0485
        L_0x054e:
            int r1 = r2.f2240q
            int r1 = r1 - r0
            r2.f2240q = r1
            if (r1 <= 0) goto L_0x0556
            goto L_0x053f
        L_0x0556:
            p1.G r8 = r2.f2233j
            long r0 = r2.f2237n
            long r3 = r2.f2236m
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r5
            int r5 = r7.f5001c
            long r5 = (long) r5
            long r0 = r0 / r5
            long r9 = r0 + r3
            int r12 = r7.f5000b
            r13 = 0
            r14 = 0
            r11 = 1
            r8.e(r9, r11, r12, r13, r14)
            long r0 = r2.f2237n
            int r3 = r7.f5003f
            long r3 = (long) r3
            long r0 = r0 + r3
            r2.f2237n = r0
            r0 = 0
            r2.f2240q = r0
            goto L_0x053f
        L_0x057b:
            r14 = r10
            r0 = -1
        L_0x057d:
            if (r14 != r0) goto L_0x05a9
            I1.f r0 = r2.f2241r
            boolean r1 = r0 instanceof I1.b
            if (r1 == 0) goto L_0x05a9
            long r3 = r2.f2237n
            long r5 = r2.f2236m
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r8
            int r1 = r7.f5001c
            long r7 = (long) r1
            long r3 = r3 / r7
            long r3 = r3 + r5
            long r0 = r0.k()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x05a9
            I1.f r0 = r2.f2241r
            r1 = r0
            I1.b r1 = (I1.b) r1
            p1.x r1 = r1.f2221c
            r1.f14449c = r3
            p1.q r1 = r2.f2232h
            r1.l(r0)
        L_0x05a9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.d.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean g(l lVar) {
        f fVar = this.f2241r;
        if (fVar != null) {
            long d8 = fVar.d();
            if (d8 != -1 && lVar.s() > d8 - 4) {
                return true;
            }
        }
        try {
            return !lVar.r(this.f2228c.f3732a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean h(p pVar) {
        return i((l) pVar, true);
    }

    public final boolean i(l lVar, boolean z) {
        int i8;
        int i9;
        int i10;
        int i11;
        g gVar;
        l lVar2 = lVar;
        if (z) {
            i8 = 32768;
        } else {
            i8 = 131072;
        }
        lVar2.f14410Z = 0;
        if (lVar2.f14408X == 0) {
            if ((this.f2226a & 8) == 0) {
                gVar = null;
            } else {
                gVar = f2225v;
            }
            H b8 = this.f2230f.b(lVar2, gVar);
            this.f2235l = b8;
            if (b8 != null) {
                this.e.b(b8);
            }
            i10 = (int) lVar.s();
            if (!z) {
                lVar2.m(i10);
            }
            i9 = 0;
        } else {
            i9 = 0;
            i10 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!g(lVar)) {
                r rVar = this.f2228c;
                rVar.H(0);
                int i14 = rVar.i();
                if ((i9 == 0 || ((long) (-128000 & i14)) == (((long) i9) & -128000)) && (i11 = C1332b.i(i14)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f2229d.e(i14);
                        i9 = i14;
                    }
                    lVar2.b(i11 - 4, false);
                } else {
                    int i15 = i13 + 1;
                    if (i13 != i8) {
                        if (z) {
                            lVar2.f14410Z = 0;
                            lVar2.b(i10 + i15, false);
                        } else {
                            lVar2.m(1);
                        }
                        i13 = i15;
                        i9 = 0;
                        i12 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        d();
                        throw new EOFException();
                    }
                }
            } else if (i12 <= 0) {
                d();
                throw new EOFException();
            }
        }
        if (z) {
            lVar2.m(i10 + i13);
        } else {
            lVar2.f14410Z = 0;
        }
        this.f2234k = i9;
        return true;
    }

    public final void l(q qVar) {
        this.f2232h = qVar;
        G q7 = qVar.q(0, 1);
        this.i = q7;
        this.f2233j = q7;
        this.f2232h.g();
    }

    public final void release() {
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [T3.a, java.lang.Object] */
    public d(long j7) {
        this.f2226a = 0;
        this.f2227b = j7;
        this.f2228c = new r(10);
        this.f2229d = new Object();
        this.e = new v();
        this.f2236m = -9223372036854775807L;
        this.f2230f = new U1.a(1);
        n nVar = new n();
        this.f2231g = nVar;
        this.f2233j = nVar;
        this.f2239p = -1;
    }
}
