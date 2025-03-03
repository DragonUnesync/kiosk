package K1;

import K.b;
import P0.r;
import T3.a;
import java.util.Arrays;
import k2.C1160q;

public final class l extends j {

    /* renamed from: n  reason: collision with root package name */
    public k f2585n;

    /* renamed from: o  reason: collision with root package name */
    public int f2586o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2587p;

    /* renamed from: q  reason: collision with root package name */
    public a f2588q;

    /* renamed from: r  reason: collision with root package name */
    public C1160q f2589r;

    public final void a(long j7) {
        boolean z;
        this.f2574g = j7;
        int i = 0;
        if (j7 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2587p = z;
        a aVar = this.f2588q;
        if (aVar != null) {
            i = aVar.e;
        }
        this.f2586o = i;
    }

    public final long b(r rVar) {
        int i;
        int i8 = 0;
        byte b8 = rVar.f3732a[0];
        if ((b8 & 1) == 1) {
            return -1;
        }
        k kVar = this.f2585n;
        P0.l.k(kVar);
        boolean z = ((b[]) kVar.f2584Y)[(b8 >> 1) & (255 >>> (8 - kVar.f2580U))].f2535a;
        a aVar = (a) kVar.f2581V;
        if (!z) {
            i = aVar.e;
        } else {
            i = aVar.f5003f;
        }
        if (this.f2587p) {
            i8 = (this.f2586o + i) / 4;
        }
        long j7 = (long) i8;
        byte[] bArr = rVar.f3732a;
        int length = bArr.length;
        int i9 = rVar.f3734c + 4;
        if (length < i9) {
            byte[] copyOf = Arrays.copyOf(bArr, i9);
            rVar.F(copyOf.length, copyOf);
        } else {
            rVar.G(i9);
        }
        byte[] bArr2 = rVar.f3732a;
        int i10 = rVar.f3734c;
        bArr2[i10 - 4] = (byte) ((int) (j7 & 255));
        bArr2[i10 - 3] = (byte) ((int) ((j7 >>> 8) & 255));
        bArr2[i10 - 2] = (byte) ((int) ((j7 >>> 16) & 255));
        bArr2[i10 - 1] = (byte) ((int) ((j7 >>> 24) & 255));
        this.f2587p = true;
        this.f2586o = i;
        return j7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: K.b[]} */
    /* JADX WARNING: type inference failed for: r13v2, types: [java.lang.Object, K.b] */
    /* JADX WARNING: type inference failed for: r8v8, types: [T3.a, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0395 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0396  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(P0.r r20, long r21, A1.d r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r23
            K1.k r3 = r0.f2585n
            r4 = 0
            if (r3 == 0) goto L_0x0013
            java.lang.Object r1 = r2.f35V
            M0.r r1 = (M0.r) r1
            r1.getClass()
            return r4
        L_0x0013:
            T3.a r6 = r0.f2588q
            r3 = 1
            r5 = 4
            if (r6 != 0) goto L_0x0076
            p1.C1332b.y(r3, r1, r4)
            r20.n()
            int r4 = r20.v()
            int r6 = r20.n()
            int r9 = r20.k()
            if (r9 > 0) goto L_0x002e
            r9 = -1
        L_0x002e:
            int r10 = r20.k()
            if (r10 > 0) goto L_0x0036
            r7 = -1
            goto L_0x0037
        L_0x0036:
            r7 = r10
        L_0x0037:
            r20.k()
            int r10 = r20.v()
            r11 = r10 & 15
            double r11 = (double) r11
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = java.lang.Math.pow(r13, r11)
            int r11 = (int) r11
            r10 = r10 & 240(0xf0, float:3.36E-43)
            int r5 = r10 >> 4
            r10 = r9
            double r8 = (double) r5
            double r8 = java.lang.Math.pow(r13, r8)
            int r5 = (int) r8
            r20.v()
            byte[] r8 = r1.f3732a
            int r1 = r1.f3734c
            byte[] r1 = java.util.Arrays.copyOf(r8, r1)
            T3.a r8 = new T3.a
            r8.<init>()
            r8.f4999a = r4
            r8.f5000b = r6
            r8.f5001c = r10
            r8.f5002d = r7
            r8.e = r11
            r8.f5003f = r5
            r8.f5004g = r1
            r0.f2588q = r8
        L_0x0073:
            r8 = 0
            goto L_0x0391
        L_0x0076:
            k2.q r8 = r0.f2589r
            if (r8 != 0) goto L_0x0081
            k2.q r1 = p1.C1332b.w(r1, r3, r3)
            r0.f2589r = r1
            goto L_0x0073
        L_0x0081:
            int r9 = r1.f3734c
            byte[] r10 = new byte[r9]
            byte[] r11 = r1.f3732a
            java.lang.System.arraycopy(r11, r4, r10, r4, r9)
            r9 = 5
            p1.C1332b.y(r9, r1, r4)
            int r11 = r20.v()
            int r11 = r11 + r3
            N1.f r12 = new N1.f
            byte[] r13 = r1.f3732a
            r12.<init>(r13)
            int r1 = r1.f3733b
            r13 = 8
            int r1 = r1 * 8
            r12.u(r1)
            r1 = 0
        L_0x00a4:
            r14 = 24
            r15 = 2
            r4 = 16
            if (r1 >= r11) goto L_0x017a
            int r7 = r12.i(r14)
            r13 = 5653314(0x564342, float:7.92198E-39)
            if (r7 != r13) goto L_0x015d
            int r4 = r12.i(r4)
            int r7 = r12.i(r14)
            boolean r13 = r12.h()
            if (r13 != 0) goto L_0x00db
            boolean r13 = r12.h()
            r14 = 0
        L_0x00c7:
            if (r14 >= r7) goto L_0x00ed
            if (r13 == 0) goto L_0x00d5
            boolean r17 = r12.h()
            if (r17 == 0) goto L_0x00d8
            r12.u(r9)
            goto L_0x00d8
        L_0x00d5:
            r12.u(r9)
        L_0x00d8:
            int r14 = r14 + 1
            goto L_0x00c7
        L_0x00db:
            r12.u(r9)
            r13 = 0
        L_0x00df:
            if (r13 >= r7) goto L_0x00ed
            int r14 = r7 - r13
            int r14 = p1.C1332b.m(r14)
            int r14 = r12.i(r14)
            int r13 = r13 + r14
            goto L_0x00df
        L_0x00ed:
            int r13 = r12.i(r5)
            if (r13 > r15) goto L_0x0149
            if (r13 == r3) goto L_0x00fd
            if (r13 != r15) goto L_0x00f8
            goto L_0x00fd
        L_0x00f8:
            r17 = r6
            r18 = r10
            goto L_0x013c
        L_0x00fd:
            r14 = 32
            r12.u(r14)
            r12.u(r14)
            int r14 = r12.i(r5)
            int r14 = r14 + r3
            r12.u(r3)
            if (r13 != r3) goto L_0x012d
            if (r4 == 0) goto L_0x0126
            r17 = r6
            long r5 = (long) r7
            r18 = r10
            long r9 = (long) r4
            double r4 = (double) r5
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = (double) r9
            double r6 = r6 / r9
            double r4 = java.lang.Math.pow(r4, r6)
            double r4 = java.lang.Math.floor(r4)
            long r4 = (long) r4
            goto L_0x0135
        L_0x0126:
            r17 = r6
            r18 = r10
            r4 = 0
            goto L_0x0135
        L_0x012d:
            r17 = r6
            r18 = r10
            long r5 = (long) r7
            long r9 = (long) r4
            long r4 = r5 * r9
        L_0x0135:
            long r6 = (long) r14
            long r4 = r4 * r6
            int r5 = (int) r4
            r12.u(r5)
        L_0x013c:
            int r1 = r1 + 1
            r6 = r17
            r10 = r18
            r4 = 0
            r5 = 4
            r9 = 5
            r13 = 8
            goto L_0x00a4
        L_0x0149:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x015d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r1.<init>(r2)
            int r2 = r12.f3346d
            r3 = 8
            int r2 = r2 * 8
            int r3 = r12.e
            int r2 = r2 + r3
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x017a:
            r17 = r6
            r18 = r10
            r1 = 6
            int r5 = r12.i(r1)
            int r5 = r5 + r3
            r6 = 0
        L_0x0185:
            if (r6 >= r5) goto L_0x0198
            int r7 = r12.i(r4)
            if (r7 != 0) goto L_0x0190
            int r6 = r6 + 1
            goto L_0x0185
        L_0x0190:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0198:
            int r5 = r12.i(r1)
            int r5 = r5 + r3
            r6 = 0
        L_0x019e:
            r7 = 3
            if (r6 >= r5) goto L_0x0252
            int r9 = r12.i(r4)
            if (r9 == 0) goto L_0x0223
            if (r9 != r3) goto L_0x020f
            r10 = 5
            int r9 = r12.i(r10)
            int[] r10 = new int[r9]
            r11 = 0
            r13 = -1
        L_0x01b2:
            if (r11 >= r9) goto L_0x01c4
            r14 = 4
            int r1 = r12.i(r14)
            r10[r11] = r1
            if (r1 <= r13) goto L_0x01be
            r13 = r1
        L_0x01be:
            int r11 = r11 + 1
            r1 = 6
            r14 = 24
            goto L_0x01b2
        L_0x01c4:
            int r13 = r13 + 1
            int[] r1 = new int[r13]
            r11 = 0
        L_0x01c9:
            if (r11 >= r13) goto L_0x01f1
            int r14 = r12.i(r7)
            int r14 = r14 + r3
            r1[r11] = r14
            int r14 = r12.i(r15)
            r7 = 8
            if (r14 <= 0) goto L_0x01dd
            r12.u(r7)
        L_0x01dd:
            r4 = 0
        L_0x01de:
            int r15 = r3 << r14
            if (r4 >= r15) goto L_0x01ea
            r12.u(r7)
            int r4 = r4 + 1
            r7 = 8
            goto L_0x01de
        L_0x01ea:
            int r11 = r11 + 1
            r4 = 16
            r7 = 3
            r15 = 2
            goto L_0x01c9
        L_0x01f1:
            r4 = 2
            r12.u(r4)
            r4 = 4
            int r7 = r12.i(r4)
            r4 = 0
            r11 = 0
            r13 = 0
        L_0x01fd:
            if (r4 >= r9) goto L_0x0248
            r14 = r10[r4]
            r14 = r1[r14]
            int r11 = r11 + r14
        L_0x0204:
            if (r13 >= r11) goto L_0x020c
            r12.u(r7)
            int r13 = r13 + 1
            goto L_0x0204
        L_0x020c:
            int r4 = r4 + 1
            goto L_0x01fd
        L_0x020f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0223:
            r1 = 8
            r12.u(r1)
            r4 = 16
            r12.u(r4)
            r12.u(r4)
            r4 = 6
            r12.u(r4)
            r12.u(r1)
            r4 = 4
            int r7 = r12.i(r4)
            int r7 = r7 + r3
            r4 = 0
        L_0x023e:
            if (r4 >= r7) goto L_0x0248
            r12.u(r1)
            int r4 = r4 + 1
            r1 = 8
            goto L_0x023e
        L_0x0248:
            int r6 = r6 + 1
            r1 = 6
            r4 = 16
            r14 = 24
            r15 = 2
            goto L_0x019e
        L_0x0252:
            int r4 = r12.i(r1)
            int r4 = r4 + r3
            r5 = 0
        L_0x0258:
            if (r5 >= r4) goto L_0x02c1
            r6 = 16
            int r7 = r12.i(r6)
            r6 = 2
            if (r7 > r6) goto L_0x02b9
            r6 = 24
            r12.u(r6)
            r12.u(r6)
            r12.u(r6)
            int r7 = r12.i(r1)
            int r7 = r7 + r3
            r1 = 8
            r12.u(r1)
            int[] r9 = new int[r7]
            r10 = 0
        L_0x027b:
            if (r10 >= r7) goto L_0x0298
            r11 = 3
            int r13 = r12.i(r11)
            boolean r14 = r12.h()
            if (r14 == 0) goto L_0x028e
            r14 = 5
            int r15 = r12.i(r14)
            goto L_0x0290
        L_0x028e:
            r14 = 5
            r15 = 0
        L_0x0290:
            int r15 = r15 * 8
            int r15 = r15 + r13
            r9[r10] = r15
            int r10 = r10 + 1
            goto L_0x027b
        L_0x0298:
            r11 = 3
            r14 = 5
            r10 = 0
        L_0x029b:
            if (r10 >= r7) goto L_0x02b5
            r13 = 0
        L_0x029e:
            if (r13 >= r1) goto L_0x02b0
            r15 = r9[r10]
            int r16 = r3 << r13
            r15 = r15 & r16
            if (r15 == 0) goto L_0x02ab
            r12.u(r1)
        L_0x02ab:
            int r13 = r13 + 1
            r1 = 8
            goto L_0x029e
        L_0x02b0:
            int r10 = r10 + 1
            r1 = 8
            goto L_0x029b
        L_0x02b5:
            int r5 = r5 + 1
            r1 = 6
            goto L_0x0258
        L_0x02b9:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x02c1:
            int r4 = r12.i(r1)
            int r4 = r4 + r3
            r1 = 0
        L_0x02c7:
            if (r1 >= r4) goto L_0x0351
            r5 = 16
            int r6 = r12.i(r5)
            if (r6 == 0) goto L_0x02e9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "mapping type other than 0 not supported: "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "VorbisUtil"
            P0.l.o(r6, r5)
            r7 = r17
            r5 = 2
            r11 = 4
            goto L_0x0343
        L_0x02e9:
            boolean r5 = r12.h()
            if (r5 == 0) goto L_0x02f6
            r5 = 4
            int r6 = r12.i(r5)
            int r6 = r6 + r3
            goto L_0x02f7
        L_0x02f6:
            r6 = 1
        L_0x02f7:
            boolean r5 = r12.h()
            r7 = r17
            int r9 = r7.f4999a
            if (r5 == 0) goto L_0x031e
            r5 = 8
            int r10 = r12.i(r5)
            int r10 = r10 + r3
            r5 = 0
        L_0x0309:
            if (r5 >= r10) goto L_0x031e
            int r11 = r9 + -1
            int r13 = p1.C1332b.m(r11)
            r12.u(r13)
            int r11 = p1.C1332b.m(r11)
            r12.u(r11)
            int r5 = r5 + 1
            goto L_0x0309
        L_0x031e:
            r5 = 2
            int r10 = r12.i(r5)
            if (r10 != 0) goto L_0x0349
            if (r6 <= r3) goto L_0x0331
            r10 = 0
        L_0x0328:
            if (r10 >= r9) goto L_0x0331
            r11 = 4
            r12.u(r11)
            int r10 = r10 + 1
            goto L_0x0328
        L_0x0331:
            r11 = 4
            r9 = 0
        L_0x0333:
            if (r9 >= r6) goto L_0x0343
            r10 = 8
            r12.u(r10)
            r12.u(r10)
            r12.u(r10)
            int r9 = r9 + 1
            goto L_0x0333
        L_0x0343:
            int r1 = r1 + 1
            r17 = r7
            goto L_0x02c7
        L_0x0349:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0351:
            r7 = r17
            r1 = 6
            int r1 = r12.i(r1)
            int r4 = r1 + 1
            K.b[] r9 = new K.b[r4]
            r5 = 0
        L_0x035d:
            if (r5 >= r4) goto L_0x037c
            boolean r6 = r12.h()
            r10 = 16
            r12.i(r10)
            r12.i(r10)
            r11 = 8
            r12.i(r11)
            K.b r13 = new K.b
            r13.<init>()
            r13.f2535a = r6
            r9[r5] = r13
            int r5 = r5 + 1
            goto L_0x035d
        L_0x037c:
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x03e6
            int r10 = p1.C1332b.m(r1)
            K1.k r1 = new K1.k
            r5 = r1
            r6 = r7
            r7 = r8
            r8 = r18
            r5.<init>(r6, r7, r8, r9, r10)
            r8 = r1
        L_0x0391:
            r0.f2585n = r8
            if (r8 != 0) goto L_0x0396
            return r3
        L_0x0396:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r4 = r8.f2581V
            T3.a r4 = (T3.a) r4
            java.lang.Object r5 = r4.f5004g
            byte[] r5 = (byte[]) r5
            r1.add(r5)
            java.lang.Cloneable r5 = r8.f2583X
            byte[] r5 = (byte[]) r5
            r1.add(r5)
            java.lang.Object r5 = r8.f2582W
            k2.q r5 = (k2.C1160q) r5
            java.lang.Object r5 = r5.f13026V
            java.lang.String[] r5 = (java.lang.String[]) r5
            H3.i0 r5 = H3.O.n(r5)
            M0.H r5 = p1.C1332b.t(r5)
            M0.q r6 = new M0.q
            r6.<init>()
            java.lang.String r7 = "audio/vorbis"
            java.lang.String r7 = M0.I.o(r7)
            r6.f2999m = r7
            int r7 = r4.f5002d
            r6.f2995h = r7
            int r7 = r4.f5001c
            r6.i = r7
            int r7 = r4.f4999a
            r6.f2979B = r7
            int r4 = r4.f5000b
            r6.f2980C = r4
            r6.f3002p = r1
            r6.f2997k = r5
            M0.r r1 = new M0.r
            r1.<init>(r6)
            r2.f35V = r1
            return r3
        L_0x03e6:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.l.c(P0.r, long, A1.d):boolean");
    }

    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.f2585n = null;
            this.f2588q = null;
            this.f2589r = null;
        }
        this.f2586o = 0;
        this.f2587p = false;
    }
}
