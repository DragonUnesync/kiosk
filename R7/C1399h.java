package r7;

import A7.d;
import P6.f;
import java.util.List;
import java.util.Map;
import org.acra.security.TLS;
import org.acra.sender.HttpSender$Method;

/* renamed from: r7.h  reason: case insensitive filesystem */
public final class C1399h implements C1392a {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f15008U;

    /* renamed from: V  reason: collision with root package name */
    public final String f15009V;

    /* renamed from: W  reason: collision with root package name */
    public final String f15010W;

    /* renamed from: X  reason: collision with root package name */
    public final String f15011X;

    /* renamed from: Y  reason: collision with root package name */
    public final HttpSender$Method f15012Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f15013Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f15014a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f15015b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Class f15016c0;

    /* renamed from: d0  reason: collision with root package name */
    public final String f15017d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Integer f15018e0;

    /* renamed from: f0  reason: collision with root package name */
    public final String f15019f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f15020g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f15021h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f15022i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15023j0;

    public C1399h(boolean z, String str, String str2, String str3, HttpSender$Method httpSender$Method, int i, int i8, boolean z6, Class<? extends d> cls, String str4, Integer num, String str5, boolean z8, boolean z9, List<? extends TLS> list, Map<String, String> map) {
        Class<? extends d> cls2 = cls;
        String str6 = str5;
        List<? extends TLS> list2 = list;
        Map<String, String> map2 = map;
        f.e(str, "uri");
        f.e(httpSender$Method, "httpMethod");
        f.e(cls2, "keyStoreFactoryClass");
        f.e(str6, "certificateType");
        f.e(list2, "tlsProtocols");
        f.e(map2, "httpHeaders");
        this.f15008U = z;
        this.f15009V = str;
        this.f15010W = str2;
        this.f15011X = str3;
        this.f15012Y = httpSender$Method;
        this.f15013Z = i;
        this.f15014a0 = i8;
        this.f15015b0 = z6;
        this.f15016c0 = cls2;
        this.f15017d0 = str4;
        this.f15018e0 = num;
        this.f15019f0 = str6;
        this.f15020g0 = z8;
        this.f15021h0 = z9;
        this.f15022i0 = list2;
        this.f15023j0 = map2;
    }

    public final boolean k() {
        return this.f15008U;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1399h(boolean r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, org.acra.sender.HttpSender$Method r27, int r28, int r29, boolean r30, java.lang.Class r31, java.lang.String r32, java.lang.Integer r33, java.lang.String r34, boolean r35, boolean r36, java.util.List r37, java.util.Map r38, int r39, P6.e r40) {
        /*
            r22 = this;
            r0 = r39
            r1 = 0
            r2 = 4
            r3 = 1
            r4 = r0 & 1
            if (r4 == 0) goto L_0x000b
            r6 = 1
            goto L_0x000d
        L_0x000b:
            r6 = r23
        L_0x000d:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0014
            r8 = r5
            goto L_0x0016
        L_0x0014:
            r8 = r25
        L_0x0016:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x001c
            r9 = r5
            goto L_0x001e
        L_0x001c:
            r9 = r26
        L_0x001e:
            r4 = r0 & 16
            if (r4 == 0) goto L_0x0026
            org.acra.sender.HttpSender$Method r4 = org.acra.sender.HttpSender$Method.POST
            r10 = r4
            goto L_0x0028
        L_0x0026:
            r10 = r27
        L_0x0028:
            r4 = r0 & 32
            if (r4 == 0) goto L_0x0031
            r4 = 5000(0x1388, float:7.006E-42)
            r11 = 5000(0x1388, float:7.006E-42)
            goto L_0x0033
        L_0x0031:
            r11 = r28
        L_0x0033:
            r4 = r0 & 64
            if (r4 == 0) goto L_0x003c
            r4 = 20000(0x4e20, float:2.8026E-41)
            r12 = 20000(0x4e20, float:2.8026E-41)
            goto L_0x003e
        L_0x003c:
            r12 = r29
        L_0x003e:
            r4 = r0 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0044
            r13 = 0
            goto L_0x0046
        L_0x0044:
            r13 = r30
        L_0x0046:
            r4 = r0 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x004e
            java.lang.Class<A7.e> r4 = A7.e.class
            r14 = r4
            goto L_0x0050
        L_0x004e:
            r14 = r31
        L_0x0050:
            r4 = r0 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0056
            r15 = r5
            goto L_0x0058
        L_0x0056:
            r15 = r32
        L_0x0058:
            r4 = r0 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x005f
            r16 = r5
            goto L_0x0061
        L_0x005f:
            r16 = r33
        L_0x0061:
            r4 = r0 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x006a
            java.lang.String r4 = "X.509"
            r17 = r4
            goto L_0x006c
        L_0x006a:
            r17 = r34
        L_0x006c:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0073
            r18 = 0
            goto L_0x0075
        L_0x0073:
            r18 = r35
        L_0x0075:
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x007c
            r19 = 0
            goto L_0x007e
        L_0x007c:
            r19 = r36
        L_0x007e:
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x009d
            org.acra.security.TLS[] r2 = new org.acra.security.TLS[r2]
            org.acra.security.TLS r4 = org.acra.security.TLS.V1_3
            r2[r1] = r4
            org.acra.security.TLS r1 = org.acra.security.TLS.V1_2
            r2[r3] = r1
            org.acra.security.TLS r1 = org.acra.security.TLS.V1_1
            r3 = 2
            r2[r3] = r1
            org.acra.security.TLS r1 = org.acra.security.TLS.V1
            r3 = 3
            r2[r3] = r1
            java.util.List r1 = D6.j.L(r2)
            r20 = r1
            goto L_0x009f
        L_0x009d:
            r20 = r37
        L_0x009f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00aa
            D6.s r0 = D6.s.f1270U
            r21 = r0
            goto L_0x00ac
        L_0x00aa:
            r21 = r38
        L_0x00ac:
            r5 = r22
            r7 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C1399h.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, org.acra.sender.HttpSender$Method, int, int, boolean, java.lang.Class, java.lang.String, java.lang.Integer, java.lang.String, boolean, boolean, java.util.List, java.util.Map, int, P6.e):void");
    }
}
