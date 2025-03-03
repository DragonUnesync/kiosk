package k1;

import H3.E;
import H3.g0;
import H3.h0;
import H3.p0;
import M0.r;
import android.text.TextUtils;
import j$.util.Objects;

/* renamed from: k1.f  reason: case insensitive filesystem */
public final class C1137f extends n implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f12930Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f12931Z;

    /* renamed from: a0  reason: collision with root package name */
    public final String f12932a0;

    /* renamed from: b0  reason: collision with root package name */
    public final C1141j f12933b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f12934c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f12935d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f12936e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f12937f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f12938g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f12939h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f12940i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f12941j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f12942k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f12943l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f12944m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f12945n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f12946o0;
    public final boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f12947q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f12948r0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1137f(int r7, M0.Y r8, int r9, k1.C1141j r10, int r11, boolean r12, k1.C1136e r13, int r14) {
        /*
            r6 = this;
            r14 = 2
            r0 = -1
            r1 = 0
            r2 = 1
            r6.<init>(r7, r8, r9)
            r6.f12933b0 = r10
            boolean r7 = r10.f12966v
            if (r7 == 0) goto L_0x0010
            r7 = 24
            goto L_0x0012
        L_0x0010:
            r7 = 16
        L_0x0012:
            r6.f12938g0 = r1
            M0.r r8 = r6.f12983X
            java.lang.String r8 = r8.f3028d
            java.lang.String r8 = k1.p.g(r8)
            r6.f12932a0 = r8
            boolean r8 = Q0.g.i(r11, r1)
            r6.f12934c0 = r8
            r8 = 0
        L_0x0025:
            H3.i0 r9 = r10.i
            int r3 = r9.size()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r8 >= r3) goto L_0x0041
            M0.r r3 = r6.f12983X
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = k1.p.d(r3, r9, r1)
            if (r9 <= 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            int r8 = r8 + r2
            goto L_0x0025
        L_0x0041:
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 0
        L_0x0045:
            r6.f12936e0 = r8
            r6.f12935d0 = r9
            M0.r r8 = r6.f12983X
            int r8 = r8.f3029f
            int r8 = k1.p.b(r8, r1)
            r6.f12937f0 = r8
            M0.r r8 = r6.f12983X
            int r9 = r8.f3029f
            if (r9 == 0) goto L_0x005f
            r9 = r9 & r2
            if (r9 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r9 = 0
            goto L_0x0060
        L_0x005f:
            r9 = 1
        L_0x0060:
            r6.f12939h0 = r9
            int r9 = r8.e
            r9 = r9 & r2
            if (r9 == 0) goto L_0x0069
            r9 = 1
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            r6.f12942k0 = r9
            java.lang.String r8 = r8.f3036n
            if (r8 != 0) goto L_0x0072
        L_0x0070:
            r8 = 0
            goto L_0x00a0
        L_0x0072:
            int r9 = r8.hashCode()
            switch(r9) {
                case -2123537834: goto L_0x0091;
                case 187078297: goto L_0x0086;
                case 1504698186: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            r8 = -1
            goto L_0x009b
        L_0x007b:
            java.lang.String r9 = "audio/iamf"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0084
            goto L_0x0079
        L_0x0084:
            r8 = 2
            goto L_0x009b
        L_0x0086:
            java.lang.String r9 = "audio/ac4"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x008f
            goto L_0x0079
        L_0x008f:
            r8 = 1
            goto L_0x009b
        L_0x0091:
            java.lang.String r9 = "audio/eac3-joc"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x009a
            goto L_0x0079
        L_0x009a:
            r8 = 0
        L_0x009b:
            switch(r8) {
                case 0: goto L_0x009f;
                case 1: goto L_0x009f;
                case 2: goto L_0x009f;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x0070
        L_0x009f:
            r8 = 1
        L_0x00a0:
            r6.f12948r0 = r8
            M0.r r8 = r6.f12983X
            int r9 = r8.f3014C
            r6.f12943l0 = r9
            int r3 = r8.f3015D
            r6.f12944m0 = r3
            int r3 = r8.f3032j
            r6.f12945n0 = r3
            if (r3 == r0) goto L_0x00b6
            int r5 = r10.f2926k
            if (r3 > r5) goto L_0x00c4
        L_0x00b6:
            if (r9 == r0) goto L_0x00bc
            int r3 = r10.f2925j
            if (r9 > r3) goto L_0x00c4
        L_0x00bc:
            boolean r8 = r13.apply(r8)
            if (r8 == 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            r6.f12931Z = r8
            java.lang.String[] r8 = P0.z.D()
            r9 = 0
        L_0x00cc:
            int r13 = r8.length
            if (r9 >= r13) goto L_0x00dc
            M0.r r13 = r6.f12983X
            r3 = r8[r9]
            int r13 = k1.p.d(r13, r3, r1)
            if (r13 <= 0) goto L_0x00da
            goto L_0x00e0
        L_0x00da:
            int r9 = r9 + r2
            goto L_0x00cc
        L_0x00dc:
            r9 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
        L_0x00e0:
            r6.f12940i0 = r9
            r6.f12941j0 = r13
            r8 = 0
        L_0x00e5:
            H3.i0 r9 = r10.f2927l
            int r13 = r9.size()
            if (r8 >= r13) goto L_0x0101
            M0.r r13 = r6.f12983X
            java.lang.String r13 = r13.f3036n
            if (r13 == 0) goto L_0x00ff
            java.lang.Object r9 = r9.get(r8)
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x00ff
            r4 = r8
            goto L_0x0101
        L_0x00ff:
            int r8 = r8 + r2
            goto L_0x00e5
        L_0x0101:
            r6.f12946o0 = r4
            int r8 = Q0.g.f(r11)
            r9 = 128(0x80, float:1.794E-43)
            if (r8 != r9) goto L_0x010d
            r8 = 1
            goto L_0x010e
        L_0x010d:
            r8 = 0
        L_0x010e:
            r6.p0 = r8
            int r8 = Q0.g.g(r11)
            r9 = 64
            if (r8 != r9) goto L_0x011a
            r8 = 1
            goto L_0x011b
        L_0x011a:
            r8 = 0
        L_0x011b:
            r6.f12947q0 = r8
            k1.j r8 = r6.f12933b0
            boolean r9 = r8.f12968x
            boolean r9 = Q0.g.i(r11, r9)
            if (r9 != 0) goto L_0x0128
            goto L_0x0150
        L_0x0128:
            boolean r9 = r6.f12931Z
            if (r9 != 0) goto L_0x0131
            boolean r10 = r8.f12965u
            if (r10 != 0) goto L_0x0131
            goto L_0x0150
        L_0x0131:
            M0.a0 r10 = r8.f2928m
            r10.getClass()
            boolean r10 = Q0.g.i(r11, r1)
            if (r10 == 0) goto L_0x014e
            if (r9 == 0) goto L_0x014e
            M0.r r9 = r6.f12983X
            int r9 = r9.f3032j
            if (r9 == r0) goto L_0x014e
            boolean r8 = r8.f12969y
            if (r8 != 0) goto L_0x014a
            if (r12 != 0) goto L_0x014e
        L_0x014a:
            r7 = r7 & r11
            if (r7 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r14 = 1
        L_0x014f:
            r1 = r14
        L_0x0150:
            r6.f12930Y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1137f.<init>(int, M0.Y, int, k1.j, int, boolean, k1.e, int):void");
    }

    public final int a() {
        return this.f12930Y;
    }

    public final boolean b(n nVar) {
        int i;
        String str;
        C1137f fVar = (C1137f) nVar;
        this.f12933b0.getClass();
        r rVar = this.f12983X;
        int i8 = rVar.f3014C;
        if (i8 != -1) {
            r rVar2 = fVar.f12983X;
            if (i8 == rVar2.f3014C && ((this.f12938g0 || ((str = rVar.f3036n) != null && TextUtils.equals(str, rVar2.f3036n))) && (i = rVar.f3015D) != -1 && i == rVar2.f3015D && this.p0 == fVar.p0 && this.f12947q0 == fVar.f12947q0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public final int compareTo(C1137f fVar) {
        h0 h0Var;
        boolean z = this.f12934c0;
        boolean z6 = this.f12931Z;
        if (!z6 || !z) {
            h0Var = p.f12999j.a();
        } else {
            h0Var = p.f12999j;
        }
        E c8 = E.f2008a.c(z, fVar.f12934c0);
        Integer valueOf = Integer.valueOf(this.f12936e0);
        Integer valueOf2 = Integer.valueOf(fVar.f12936e0);
        g0.f2070U.getClass();
        p0 p0Var = p0.f2110U;
        E b8 = c8.b(valueOf, valueOf2, p0Var).a(this.f12935d0, fVar.f12935d0).a(this.f12937f0, fVar.f12937f0).c(this.f12942k0, fVar.f12942k0).c(this.f12939h0, fVar.f12939h0).b(Integer.valueOf(this.f12940i0), Integer.valueOf(fVar.f12940i0), p0Var).a(this.f12941j0, fVar.f12941j0).c(z6, fVar.f12931Z).b(Integer.valueOf(this.f12946o0), Integer.valueOf(fVar.f12946o0), p0Var);
        this.f12933b0.getClass();
        E b9 = b8.c(this.p0, fVar.p0).c(this.f12947q0, fVar.f12947q0).c(this.f12948r0, fVar.f12948r0).b(Integer.valueOf(this.f12943l0), Integer.valueOf(fVar.f12943l0), h0Var).b(Integer.valueOf(this.f12944m0), Integer.valueOf(fVar.f12944m0), h0Var);
        if (Objects.equals(this.f12932a0, fVar.f12932a0)) {
            b9 = b9.b(Integer.valueOf(this.f12945n0), Integer.valueOf(fVar.f12945n0), h0Var);
        }
        return b9.e();
    }
}
