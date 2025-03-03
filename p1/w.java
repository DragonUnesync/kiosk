package p1;

import B3.q;
import H3.O;
import M0.J;
import P0.a;
import P0.r;
import Q0.h;
import Q0.i;
import Q0.l;
import Q0.m;
import java.util.Collections;
import java.util.List;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final List f14437a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14438b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14439c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14440d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14441f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14442g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14443h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14444j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14445k;

    /* renamed from: l  reason: collision with root package name */
    public final q f14446l;

    public w(List list, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f8, int i15, String str, q qVar) {
        this.f14437a = list;
        this.f14438b = i8;
        this.f14439c = i9;
        this.f14440d = i10;
        this.e = i11;
        this.f14441f = i12;
        this.f14442g = i13;
        this.f14443h = i14;
        this.i = f8;
        this.f14444j = i15;
        this.f14445k = str;
        this.f14446l = qVar;
    }

    public static w a(r rVar, boolean z, q qVar) {
        List singletonList;
        int i8;
        l f8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        r rVar2 = rVar;
        int i13 = 4;
        if (z) {
            try {
                rVar2.I(4);
            } catch (ArrayIndexOutOfBoundsException e8) {
                if (z) {
                    str = "L-HEVC config";
                } else {
                    str = "HEVC config";
                }
                throw J.a(e8, "Error parsing".concat(str));
            }
        } else {
            rVar2.I(21);
        }
        int v4 = rVar.v() & 3;
        int v8 = rVar.v();
        int c8 = rVar.c();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < v8; i16++) {
            rVar2.I(1);
            int B8 = rVar.B();
            for (int i17 = 0; i17 < B8; i17++) {
                int B9 = rVar.B();
                i15 += B9 + 4;
                rVar2.I(B9);
            }
        }
        rVar2.H(c8);
        byte[] bArr = new byte[i15];
        q qVar2 = qVar;
        String str2 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        float f9 = 1.0f;
        int i26 = -1;
        while (i18 < v8) {
            int v9 = rVar.v() & 63;
            int B10 = rVar.B();
            q qVar3 = qVar2;
            int i27 = 0;
            while (i27 < B10) {
                int B11 = rVar.B();
                int i28 = v8;
                System.arraycopy(Q0.q.f4068a, i14, bArr, i19, i13);
                int i29 = i19 + 4;
                System.arraycopy(rVar2.f3732a, rVar.c(), bArr, i29, B11);
                if (v9 == 32 && i27 == 0) {
                    qVar3 = Q0.q.h(bArr, i29, i29 + B11);
                    i8 = B10;
                } else if (v9 == 33 && i27 == 0) {
                    m g8 = Q0.q.g(bArr, i29, i29 + B11, qVar3);
                    int i30 = g8.f4039b + 8;
                    int i31 = g8.f4040c + 8;
                    int i32 = g8.f4044h;
                    int i33 = g8.i;
                    i22 = i32;
                    int i34 = g8.f4045j;
                    float f10 = g8.f4042f;
                    int i35 = g8.f4043g;
                    i iVar = g8.f4038a;
                    if (iVar != null) {
                        i12 = i35;
                        i11 = i33;
                        i8 = B10;
                        i10 = i30;
                        i9 = i31;
                        str2 = a.b(iVar.f4026a, iVar.f4027b, iVar.f4028c, iVar.f4029d, iVar.e, iVar.f4030f);
                    } else {
                        i12 = i35;
                        i11 = i33;
                        i8 = B10;
                        i10 = i30;
                        i9 = i31;
                    }
                    i20 = i10;
                    i21 = i9;
                    i14 = 0;
                    float f11 = f10;
                    i24 = i34;
                    i23 = i11;
                    i26 = i12;
                    f9 = f11;
                } else {
                    i8 = B10;
                    if (v9 != 39 || i27 != 0 || (f8 = Q0.q.f(bArr, i29, i29 + B11)) == null || qVar3 == null) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        if (f8.f4037U == ((h) ((O) qVar3.f449U).get(0)).f4025b) {
                            i25 = 4;
                        } else {
                            i25 = 5;
                        }
                    }
                }
                i19 = i29 + B11;
                rVar2.I(B11);
                i27++;
                B10 = i8;
                v8 = i28;
                i13 = 4;
            }
            int i36 = v8;
            i18++;
            qVar2 = qVar3;
            i13 = 4;
        }
        if (i15 == 0) {
            singletonList = Collections.emptyList();
        } else {
            singletonList = Collections.singletonList(bArr);
        }
        return new w(singletonList, v4 + 1, i20, i21, i22, i23, i24, i25, f9, i26, str2, qVar2);
    }
}
