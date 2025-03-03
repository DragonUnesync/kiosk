package k1;

import H3.E;
import H3.g0;
import H3.p0;
import j$.util.Objects;

public final class o extends n {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f12984Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1141j f12985Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f12986a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f12987b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f12988c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f12989d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f12990e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f12991f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f12992g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f12993h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f12994i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f12995j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f12996k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f12997l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f12998m0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(int r8, M0.Y r9, int r10, k1.C1141j r11, int r12, int r13, boolean r14) {
        /*
            r7 = this;
            r13 = 4
            r0 = 3
            r1 = -1
            r2 = 2
            r3 = 0
            r4 = 1
            r7.<init>(r8, r9, r10)
            r7.f12985Z = r11
            boolean r8 = r11.f12964t
            if (r8 == 0) goto L_0x0012
            r8 = 24
            goto L_0x0014
        L_0x0012:
            r8 = 16
        L_0x0014:
            r7.f12994i0 = r3
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r14 == 0) goto L_0x0043
            M0.r r10 = r7.f12983X
            int r5 = r10.f3043u
            if (r5 == r1) goto L_0x0024
            int r6 = r11.f2918a
            if (r5 > r6) goto L_0x0043
        L_0x0024:
            int r5 = r10.f3044v
            if (r5 == r1) goto L_0x002c
            int r6 = r11.f2919b
            if (r5 > r6) goto L_0x0043
        L_0x002c:
            float r5 = r10.f3045w
            int r6 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0039
            int r6 = r11.f2920c
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0043
        L_0x0039:
            int r10 = r10.f3032j
            if (r10 == r1) goto L_0x0041
            int r5 = r11.f2921d
            if (r10 > r5) goto L_0x0043
        L_0x0041:
            r10 = 1
            goto L_0x0044
        L_0x0043:
            r10 = 0
        L_0x0044:
            r7.f12984Y = r10
            if (r14 == 0) goto L_0x0069
            M0.r r10 = r7.f12983X
            int r14 = r10.f3043u
            if (r14 == r1) goto L_0x0050
            if (r14 < 0) goto L_0x0069
        L_0x0050:
            int r14 = r10.f3044v
            if (r14 == r1) goto L_0x0056
            if (r14 < 0) goto L_0x0069
        L_0x0056:
            float r14 = r10.f3045w
            int r5 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0061
            float r5 = (float) r3
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 < 0) goto L_0x0069
        L_0x0061:
            int r10 = r10.f3032j
            if (r10 == r1) goto L_0x0067
            if (r10 < 0) goto L_0x0069
        L_0x0067:
            r10 = 1
            goto L_0x006a
        L_0x0069:
            r10 = 0
        L_0x006a:
            r7.f12986a0 = r10
            boolean r10 = Q0.g.i(r12, r3)
            r7.f12987b0 = r10
            M0.r r10 = r7.f12983X
            float r14 = r10.f3045w
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0082
            r9 = 1092616192(0x41200000, float:10.0)
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0082
            r9 = 1
            goto L_0x0083
        L_0x0082:
            r9 = 0
        L_0x0083:
            r7.f12988c0 = r9
            int r9 = r10.f3032j
            r7.f12989d0 = r9
            int r9 = r10.b()
            r7.f12990e0 = r9
            M0.r r9 = r7.f12983X
            int r9 = r9.f3029f
            int r9 = k1.p.b(r9, r3)
            r7.f12992g0 = r9
            M0.r r9 = r7.f12983X
            int r9 = r9.f3029f
            if (r9 == 0) goto L_0x00a5
            r9 = r9 & r4
            if (r9 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r9 = 0
            goto L_0x00a6
        L_0x00a5:
            r9 = 1
        L_0x00a6:
            r7.f12993h0 = r9
            r9 = 0
        L_0x00a9:
            H3.i0 r10 = r11.f2924h
            int r14 = r10.size()
            if (r9 >= r14) goto L_0x00c4
            M0.r r14 = r7.f12983X
            java.lang.String r14 = r14.f3036n
            if (r14 == 0) goto L_0x00c2
            java.lang.Object r10 = r10.get(r9)
            boolean r10 = r14.equals(r10)
            if (r10 == 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            int r9 = r9 + r4
            goto L_0x00a9
        L_0x00c4:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x00c7:
            r7.f12991f0 = r9
            int r9 = Q0.g.f(r12)
            r10 = 128(0x80, float:1.794E-43)
            if (r9 != r10) goto L_0x00d3
            r9 = 1
            goto L_0x00d4
        L_0x00d3:
            r9 = 0
        L_0x00d4:
            r7.f12996k0 = r9
            int r9 = Q0.g.g(r12)
            r10 = 64
            if (r9 != r10) goto L_0x00e0
            r9 = 1
            goto L_0x00e1
        L_0x00e0:
            r9 = 0
        L_0x00e1:
            r7.f12997l0 = r9
            M0.r r9 = r7.f12983X
            java.lang.String r9 = r9.f3036n
            if (r9 != 0) goto L_0x00eb
        L_0x00e9:
            r13 = 0
            goto L_0x0135
        L_0x00eb:
            int r10 = r9.hashCode()
            switch(r10) {
                case -1851077871: goto L_0x0120;
                case -1662735862: goto L_0x0115;
                case -1662541442: goto L_0x010a;
                case 1331836730: goto L_0x00ff;
                case 1599127257: goto L_0x00f4;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r9 = -1
            goto L_0x012a
        L_0x00f4:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00fd
            goto L_0x00f2
        L_0x00fd:
            r9 = 4
            goto L_0x012a
        L_0x00ff:
            java.lang.String r10 = "video/avc"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0108
            goto L_0x00f2
        L_0x0108:
            r9 = 3
            goto L_0x012a
        L_0x010a:
            java.lang.String r10 = "video/hevc"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0113
            goto L_0x00f2
        L_0x0113:
            r9 = 2
            goto L_0x012a
        L_0x0115:
            java.lang.String r10 = "video/av01"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x011e
            goto L_0x00f2
        L_0x011e:
            r9 = 1
            goto L_0x012a
        L_0x0120:
            java.lang.String r10 = "video/dolby-vision"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0129
            goto L_0x00f2
        L_0x0129:
            r9 = 0
        L_0x012a:
            switch(r9) {
                case 0: goto L_0x0134;
                case 1: goto L_0x0135;
                case 2: goto L_0x0132;
                case 3: goto L_0x0130;
                case 4: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x00e9
        L_0x012e:
            r13 = 2
            goto L_0x0135
        L_0x0130:
            r13 = 1
            goto L_0x0135
        L_0x0132:
            r13 = 3
            goto L_0x0135
        L_0x0134:
            r13 = 5
        L_0x0135:
            r7.f12998m0 = r13
            M0.r r9 = r7.f12983X
            int r10 = r9.f3029f
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0140
            goto L_0x016a
        L_0x0140:
            k1.j r10 = r7.f12985Z
            boolean r11 = r10.f12968x
            boolean r11 = Q0.g.i(r12, r11)
            if (r11 != 0) goto L_0x014b
            goto L_0x016a
        L_0x014b:
            boolean r11 = r7.f12984Y
            if (r11 != 0) goto L_0x0154
            boolean r10 = r10.f12963s
            if (r10 != 0) goto L_0x0154
            goto L_0x016a
        L_0x0154:
            boolean r10 = Q0.g.i(r12, r3)
            if (r10 == 0) goto L_0x0168
            boolean r10 = r7.f12986a0
            if (r10 == 0) goto L_0x0168
            if (r11 == 0) goto L_0x0168
            int r9 = r9.f3032j
            if (r9 == r1) goto L_0x0168
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r2 = 1
        L_0x0169:
            r3 = r2
        L_0x016a:
            r7.f12995j0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.o.<init>(int, M0.Y, int, k1.j, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        E c8 = E.f2008a.c(oVar.f12987b0, oVar2.f12987b0).a(oVar.f12992g0, oVar2.f12992g0).c(oVar.f12993h0, oVar2.f12993h0).c(oVar.f12988c0, oVar2.f12988c0).c(oVar.f12984Y, oVar2.f12984Y).c(oVar.f12986a0, oVar2.f12986a0);
        Integer valueOf = Integer.valueOf(oVar.f12991f0);
        Integer valueOf2 = Integer.valueOf(oVar2.f12991f0);
        g0.f2070U.getClass();
        E b8 = c8.b(valueOf, valueOf2, p0.f2110U);
        boolean z = oVar2.f12996k0;
        boolean z6 = oVar.f12996k0;
        E c9 = b8.c(z6, z);
        boolean z8 = oVar2.f12997l0;
        boolean z9 = oVar.f12997l0;
        E c10 = c9.c(z9, z8);
        if (z6 && z9) {
            c10 = c10.a(oVar.f12998m0, oVar2.f12998m0);
        }
        return c10.e();
    }

    public final int a() {
        return this.f12995j0;
    }

    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f12994i0 || Objects.equals(this.f12983X.f3036n, oVar.f12983X.f3036n)) {
            this.f12985Z.getClass();
            if (this.f12996k0 == oVar.f12996k0 && this.f12997l0 == oVar.f12997l0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
