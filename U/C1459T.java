package u;

import D.C0032a;
import D.C0036c;
import D.C0050j;
import D.C0052k;
import D.F0;
import D.L0;
import E.c;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import com.bumptech.glide.manager.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k2.C1160q;
import n2.a;
import q4.k;
import y.C1609a;
import y.C1611c;

/* renamed from: u.T  reason: case insensitive filesystem */
public final class C1459T {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15537a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15538b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f15539c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f15540d = new ArrayList();
    public final HashMap e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f15541f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15542g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f15543h = new ArrayList();
    public final String i;

    /* renamed from: j  reason: collision with root package name */
    public final k f15544j;

    /* renamed from: k  reason: collision with root package name */
    public final v.k f15545k;

    /* renamed from: l  reason: collision with root package name */
    public final C1609a f15546l;

    /* renamed from: m  reason: collision with root package name */
    public final int f15547m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f15548n = false;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f15549o = false;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f15550p = false;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f15551q = false;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f15552r = false;

    /* renamed from: s  reason: collision with root package name */
    public C0052k f15553s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f15554t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final C1450J f15555u;

    /* renamed from: v  reason: collision with root package name */
    public final k f15556v = new k(29);

    /* renamed from: w  reason: collision with root package name */
    public final C1611c f15557w = new C1611c(1);

    /* renamed from: x  reason: collision with root package name */
    public final q f15558x;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1459T(android.content.Context r18, java.lang.String r19, v.r r20, q4.k r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = 2
            r3 = 1
            r17.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15537a = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15538b = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15539c = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15540d = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1.e = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15541f = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15542g = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.f15543h = r4
            r4 = 0
            r1.f15548n = r4
            r1.f15549o = r4
            r1.f15550p = r4
            r1.f15551q = r4
            r1.f15552r = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.f15554t = r5
            q4.k r5 = new q4.k
            r6 = 29
            r5.<init>((int) r6)
            r1.f15556v = r5
            y.c r5 = new y.c
            r5.<init>(r3)
            r1.f15557w = r5
            r19.getClass()
            r1.i = r0
            r21.getClass()
            r5 = r21
            r1.f15544j = r5
            y.a r5 = new y.a
            r5.<init>((int) r2)
            r1.f15546l = r5
            u.J r5 = u.C1450J.b(r18)
            r1.f15555u = r5
            r5 = r20
            v.k r0 = r5.b(r0)     // Catch:{ a -> 0x0093 }
            r1.f15545k = r0     // Catch:{ a -> 0x0093 }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ a -> 0x0093 }
            java.lang.Object r5 = r0.a(r5)     // Catch:{ a -> 0x0093 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ a -> 0x0093 }
            if (r5 == 0) goto L_0x0096
            int r5 = r5.intValue()     // Catch:{ a -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            goto L_0x086a
        L_0x0096:
            r5 = 2
        L_0x0097:
            r1.f15547m = r5     // Catch:{ a -> 0x0093 }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r0 = r0.a(r5)
            int[] r0 = (int[]) r0
            r5 = 3
            if (r0 == 0) goto L_0x00c3
            int r6 = r0.length
            r7 = 0
        L_0x00a6:
            if (r7 >= r6) goto L_0x00c3
            r8 = r0[r7]
            if (r8 != r5) goto L_0x00af
            r1.f15548n = r3
            goto L_0x00c1
        L_0x00af:
            r9 = 6
            if (r8 != r9) goto L_0x00b5
            r1.f15549o = r3
            goto L_0x00c1
        L_0x00b5:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r9 < r10) goto L_0x00c1
            r9 = 16
            if (r8 != r9) goto L_0x00c1
            r1.f15552r = r3
        L_0x00c1:
            int r7 = r7 + r3
            goto L_0x00a6
        L_0x00c3:
            com.bumptech.glide.manager.q r0 = new com.bumptech.glide.manager.q
            v.k r6 = r1.f15545k
            r0.<init>((v.k) r6)
            r1.f15558x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            D.F0 r7 = new D.F0
            r7.<init>()
            D.G0 r8 = D.G0.MAXIMUM
            r9 = 0
            u.C1477r.f(r3, r8, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            u.C1477r.f(r5, r8, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            u.C1477r.f(r2, r8, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            D.G0 r11 = D.G0.PREVIEW
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r7.a(r12)
            u.C1477r.f(r5, r8, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            D.j r12 = new D.j
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            u.C1477r.f(r5, r8, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r7.a(r12)
            u.C1477r.f(r3, r11, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r7.a(r12)
            u.C1477r.f(r2, r11, r9, r7)
            D.F0 r7 = u.C1477r.b(r6, r7)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r7.a(r12)
            D.j r12 = new D.j
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            u.C1477r.f(r5, r8, r9, r7)
            r6.add(r7)
            r0.addAll(r6)
            int r6 = r1.f15547m
            D.G0 r7 = D.G0.RECORD
            if (r6 == 0) goto L_0x0155
            if (r6 == r3) goto L_0x0155
            if (r6 != r5) goto L_0x01d3
        L_0x0155:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            D.F0 r13 = new D.F0
            r13.<init>()
            D.j r14 = new D.j
            r14.<init>(r3, r11, r9)
            r13.a(r14)
            u.C1477r.f(r3, r7, r9, r13)
            D.F0 r13 = u.C1477r.b(r12, r13)
            D.j r14 = new D.j
            r14.<init>(r3, r11, r9)
            r13.a(r14)
            u.C1477r.f(r2, r7, r9, r13)
            D.F0 r13 = u.C1477r.b(r12, r13)
            D.j r14 = new D.j
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            u.C1477r.f(r2, r7, r9, r13)
            D.F0 r13 = u.C1477r.b(r12, r13)
            D.j r14 = new D.j
            r14.<init>(r3, r11, r9)
            r13.a(r14)
            D.j r14 = new D.j
            r14.<init>(r3, r7, r9)
            r13.a(r14)
            u.C1477r.f(r5, r7, r9, r13)
            D.F0 r13 = u.C1477r.b(r12, r13)
            D.j r14 = new D.j
            r14.<init>(r3, r11, r9)
            r13.a(r14)
            D.j r14 = new D.j
            r14.<init>(r2, r7, r9)
            r13.a(r14)
            u.C1477r.f(r5, r7, r9, r13)
            D.F0 r13 = u.C1477r.b(r12, r13)
            D.j r14 = new D.j
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            D.j r14 = new D.j
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            u.C1477r.f(r5, r8, r9, r13)
            r12.add(r13)
            r0.addAll(r12)
        L_0x01d3:
            D.G0 r12 = D.G0.VGA
            if (r6 == r3) goto L_0x01d9
            if (r6 != r5) goto L_0x0257
        L_0x01d9:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            D.F0 r14 = new D.F0
            r14.<init>()
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r14.a(r15)
            u.C1477r.f(r3, r8, r9, r14)
            D.F0 r14 = u.C1477r.b(r13, r14)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r14.a(r15)
            u.C1477r.f(r2, r8, r9, r14)
            D.F0 r14 = u.C1477r.b(r13, r14)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            u.C1477r.f(r2, r8, r9, r14)
            D.F0 r14 = u.C1477r.b(r13, r14)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r14.a(r15)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r14.a(r15)
            u.C1477r.f(r5, r8, r9, r14)
            D.F0 r14 = u.C1477r.b(r13, r14)
            D.j r15 = new D.j
            r15.<init>(r2, r12, r9)
            r14.a(r15)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r14.a(r15)
            u.C1477r.f(r2, r8, r9, r14)
            D.F0 r14 = u.C1477r.b(r13, r14)
            D.j r15 = new D.j
            r15.<init>(r2, r12, r9)
            r14.a(r15)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            u.C1477r.f(r2, r8, r9, r14)
            r13.add(r14)
            r0.addAll(r13)
        L_0x0257:
            boolean r13 = r1.f15548n
            r14 = 5
            if (r13 == 0) goto L_0x0300
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            D.F0 r15 = new D.F0
            r15.<init>()
            u.C1477r.f(r14, r8, r9, r15)
            D.F0 r15 = u.C1477r.b(r13, r15)
            D.j r4 = new D.j
            r4.<init>(r3, r11, r9)
            r15.a(r4)
            u.C1477r.f(r14, r8, r9, r15)
            D.F0 r4 = u.C1477r.b(r13, r15)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r4.a(r15)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r13, r4)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r4.a(r15)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r4.a(r15)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r13, r4)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r4.a(r15)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r4.a(r15)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r13, r4)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r4.a(r15)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r4.a(r15)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r13, r4)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r4.a(r15)
            D.j r15 = new D.j
            r15.<init>(r5, r8, r9)
            r4.a(r15)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r13, r4)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r4.a(r15)
            D.j r15 = new D.j
            r15.<init>(r5, r8, r9)
            r4.a(r15)
            u.C1477r.f(r14, r8, r9, r4)
            r13.add(r4)
            r0.addAll(r13)
        L_0x0300:
            boolean r4 = r1.f15549o
            if (r4 == 0) goto L_0x033f
            if (r6 != 0) goto L_0x033f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            D.F0 r13 = new D.F0
            r13.<init>()
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r13.a(r15)
            u.C1477r.f(r3, r8, r9, r13)
            D.F0 r13 = u.C1477r.b(r4, r13)
            D.j r15 = new D.j
            r15.<init>(r3, r11, r9)
            r13.a(r15)
            u.C1477r.f(r2, r8, r9, r13)
            D.F0 r13 = u.C1477r.b(r4, r13)
            D.j r15 = new D.j
            r15.<init>(r2, r11, r9)
            r13.a(r15)
            u.C1477r.f(r2, r8, r9, r13)
            r4.add(r13)
            r0.addAll(r4)
        L_0x033f:
            if (r6 != r5) goto L_0x038b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            D.F0 r6 = new D.F0
            r6.<init>()
            D.j r13 = new D.j
            r13.<init>(r3, r11, r9)
            r6.a(r13)
            D.j r13 = new D.j
            r13.<init>(r3, r12, r9)
            r6.a(r13)
            D.j r13 = new D.j
            r13.<init>(r2, r8, r9)
            r6.a(r13)
            u.C1477r.f(r14, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r4, r6)
            D.j r13 = new D.j
            r13.<init>(r3, r11, r9)
            r6.a(r13)
            D.j r13 = new D.j
            r13.<init>(r3, r12, r9)
            r6.a(r13)
            D.j r12 = new D.j
            r12.<init>(r5, r8, r9)
            r6.a(r12)
            u.C1477r.f(r14, r8, r9, r6)
            r4.add(r6)
            r0.addAll(r4)
        L_0x038b:
            java.util.ArrayList r4 = r1.f15537a
            r4.addAll(r0)
            y.a r0 = r1.f15546l
            java.lang.Object r0 = r0.f16325a
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) r0
            if (r0 != 0) goto L_0x039e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x03f6
        L_0x039e:
            D.F0 r0 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.f7615a
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r6 = "heroqltevzw"
            boolean r6 = r6.equalsIgnoreCase(r0)
            if (r6 != 0) goto L_0x03e2
            java.lang.String r6 = "heroqltetmo"
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x03b3
            goto L_0x03e2
        L_0x03b3:
            java.lang.String r0 = "google"
            java.lang.String r6 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x03bf
            r0 = 0
            goto L_0x03cd
        L_0x03bf:
            java.lang.String r0 = android.os.Build.MODEL
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r6)
            java.util.HashSet r6 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.f7617c
            boolean r0 = r6.contains(r0)
        L_0x03cd:
            if (r0 != 0) goto L_0x03db
            boolean r0 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.b()
            if (r0 == 0) goto L_0x03d6
            goto L_0x03db
        L_0x03d6:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x03f6
        L_0x03db:
            D.F0 r0 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.f7616b
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x03f6
        L_0x03e2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r6 = "1"
            java.lang.String r12 = r1.i
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L_0x03f6
            D.F0 r6 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.f7615a
            r0.add(r6)
        L_0x03f6:
            r4.addAll(r0)
            boolean r0 = r1.f15552r
            if (r0 == 0) goto L_0x0521
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            D.F0 r4 = new D.F0
            r4.<init>()
            D.G0 r6 = D.G0.ULTRA_MAXIMUM
            D.j r12 = new D.j
            r12.<init>(r2, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r3, r7, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r5, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r3, r7, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r14, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r3, r7, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r2, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r5, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r5, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r5, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r14, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r5, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r2, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r2, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r5, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r2, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r14, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r2, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r2, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r5, r6, r9)
            r4.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r4.a(r12)
            u.C1477r.f(r14, r8, r9, r4)
            D.F0 r4 = u.C1477r.b(r0, r4)
            D.j r12 = new D.j
            r12.<init>(r14, r6, r9)
            r4.a(r12)
            D.j r6 = new D.j
            r6.<init>(r3, r11, r9)
            r4.a(r6)
            u.C1477r.f(r14, r8, r9, r4)
            r0.add(r4)
            java.util.ArrayList r4 = r1.f15538b
            r4.addAll(r0)
        L_0x0521:
            android.content.pm.PackageManager r0 = r18.getPackageManager()
            java.lang.String r4 = "android.hardware.camera.concurrent"
            boolean r0 = r0.hasSystemFeature(r4)
            r1.f15550p = r0
            D.G0 r4 = D.G0.s1440p
            if (r0 == 0) goto L_0x05b0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            D.F0 r6 = new D.F0
            r6.<init>()
            u.C1477r.f(r2, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            u.C1477r.f(r3, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            u.C1477r.f(r5, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.G0 r12 = D.G0.s720p
            D.j r13 = new D.j
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            u.C1477r.f(r5, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r13 = new D.j
            r13.<init>(r3, r12, r9)
            r6.a(r13)
            u.C1477r.f(r5, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r13 = new D.j
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            u.C1477r.f(r2, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r13 = new D.j
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            u.C1477r.f(r3, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r13 = new D.j
            r13.<init>(r3, r12, r9)
            r6.a(r13)
            u.C1477r.f(r2, r4, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r13 = new D.j
            r13.<init>(r3, r12, r9)
            r6.a(r13)
            u.C1477r.f(r3, r4, r9, r6)
            r0.add(r6)
            java.util.ArrayList r6 = r1.f15539c
            r6.addAll(r0)
        L_0x05b0:
            com.bumptech.glide.manager.q r0 = r1.f15558x
            boolean r0 = r0.f9080V
            if (r0 == 0) goto L_0x063c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            D.F0 r6 = new D.F0
            r6.<init>()
            u.C1477r.f(r3, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            u.C1477r.f(r2, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r6.a(r12)
            u.C1477r.f(r5, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r6.a(r12)
            u.C1477r.f(r2, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r12 = new D.j
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            u.C1477r.f(r2, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r6.a(r12)
            u.C1477r.f(r3, r7, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r6.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r7, r9)
            r6.a(r12)
            u.C1477r.f(r2, r7, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r12 = new D.j
            r12.<init>(r3, r11, r9)
            r6.a(r12)
            D.j r12 = new D.j
            r12.<init>(r3, r7, r9)
            r6.a(r12)
            u.C1477r.f(r5, r7, r9, r6)
            r0.add(r6)
            java.util.ArrayList r6 = r1.f15541f
            r6.addAll(r0)
        L_0x063c:
            v.k r0 = r1.f15545k
            d4.k r0 = r0.b()
            java.lang.Object r0 = r0.f9766V
            k2.q r0 = (k2.C1160q) r0
            r0.getClass()
            r6 = 0
            java.lang.Object r0 = r0.f13026V     // Catch:{ NullPointerException -> 0x0655, IllegalArgumentException -> 0x0653 }
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0     // Catch:{ NullPointerException -> 0x0655, IllegalArgumentException -> 0x0653 }
            int[] r0 = r0.getOutputFormats()     // Catch:{ NullPointerException -> 0x0655, IllegalArgumentException -> 0x0653 }
            goto L_0x065e
        L_0x0653:
            r0 = move-exception
            goto L_0x0656
        L_0x0655:
            r0 = move-exception
        L_0x0656:
            java.lang.String r12 = "StreamConfigurationMapCompatBaseImpl"
            java.lang.String r13 = "Failed to get output formats from StreamConfigurationMap"
            F.h.J(r12, r13, r0)
            r0 = r6
        L_0x065e:
            if (r0 != 0) goto L_0x0661
            goto L_0x0668
        L_0x0661:
            java.lang.Object r0 = r0.clone()
            r6 = r0
            int[] r6 = (int[]) r6
        L_0x0668:
            if (r6 != 0) goto L_0x066b
            goto L_0x069d
        L_0x066b:
            int r0 = r6.length
            r12 = 0
        L_0x066d:
            if (r12 >= r0) goto L_0x069d
            r13 = r6[r12]
            r14 = 4101(0x1005, float:5.747E-42)
            if (r13 != r14) goto L_0x069b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            D.F0 r6 = new D.F0
            r6.<init>()
            r12 = 4
            u.C1477r.f(r12, r8, r9, r6)
            D.F0 r6 = u.C1477r.b(r0, r6)
            D.j r13 = new D.j
            r13.<init>(r3, r11, r9)
            r6.a(r13)
            u.C1477r.f(r12, r8, r9, r6)
            r0.add(r6)
            java.util.ArrayList r6 = r1.f15542g
            r6.addAll(r0)
            goto L_0x069d
        L_0x069b:
            int r12 = r12 + r3
            goto L_0x066d
        L_0x069d:
            v.k r0 = r1.f15545k
            D.c r6 = u.C1457Q.f15534a
            int r6 = android.os.Build.VERSION.SDK_INT
            r12 = 33
            if (r6 >= r12) goto L_0x06a9
        L_0x06a7:
            r0 = 0
            goto L_0x06ba
        L_0x06a9:
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r13)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x06a7
            int r0 = r0.length
            if (r0 != 0) goto L_0x06b9
            goto L_0x06a7
        L_0x06b9:
            r0 = 1
        L_0x06ba:
            r1.f15551q = r0
            if (r0 == 0) goto L_0x07a1
            if (r6 < r12) goto L_0x07a1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            D.F0 r13 = new D.F0
            r13.<init>()
            r14 = 4
            u.C1477r.f(r3, r4, r14, r13)
            D.F0 r13 = u.C1477r.b(r0, r13)
            u.C1477r.f(r2, r4, r14, r13)
            D.F0 r13 = u.C1477r.b(r0, r13)
            r14 = 3
            u.C1477r.f(r3, r7, r14, r13)
            D.F0 r13 = u.C1477r.b(r0, r13)
            u.C1477r.f(r2, r7, r14, r13)
            D.F0 r13 = u.C1477r.b(r0, r13)
            r9 = 2
            u.C1477r.f(r5, r8, r9, r13)
            D.F0 r13 = u.C1477r.b(r0, r13)
            u.C1477r.f(r2, r8, r9, r13)
            D.F0 r13 = u.C1477r.b(r0, r13)
            D.j r12 = new D.j
            r14 = 1
            r12.<init>(r3, r11, r14)
            r13.a(r12)
            u.C1477r.f(r5, r8, r9, r13)
            D.F0 r12 = u.C1477r.b(r0, r13)
            D.j r13 = new D.j
            r13.<init>(r3, r11, r14)
            r12.a(r13)
            u.C1477r.f(r2, r8, r9, r12)
            D.F0 r12 = u.C1477r.b(r0, r12)
            D.j r13 = new D.j
            r13.<init>(r3, r11, r14)
            r12.a(r13)
            r13 = r6
            r5 = 3
            u.C1477r.f(r3, r7, r5, r12)
            D.F0 r12 = u.C1477r.b(r0, r12)
            D.j r9 = new D.j
            r9.<init>(r3, r11, r14)
            r12.a(r9)
            u.C1477r.f(r2, r7, r5, r12)
            D.F0 r5 = u.C1477r.b(r0, r12)
            D.j r6 = new D.j
            r6.<init>(r3, r11, r14)
            r5.a(r6)
            u.C1477r.f(r2, r11, r14, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r6 = new D.j
            r6.<init>(r3, r11, r14)
            r5.a(r6)
            D.j r6 = new D.j
            r9 = 3
            r6.<init>(r3, r7, r9)
            r5.a(r6)
            r6 = 3
            r9 = 2
            u.C1477r.f(r6, r7, r9, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r6 = new D.j
            r6.<init>(r3, r11, r14)
            r5.a(r6)
            D.j r6 = new D.j
            r9 = 3
            r6.<init>(r2, r7, r9)
            r5.a(r6)
            r6 = 3
            r9 = 2
            u.C1477r.f(r6, r7, r9, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r6 = new D.j
            r6.<init>(r3, r11, r14)
            r5.a(r6)
            D.j r6 = new D.j
            r6.<init>(r2, r11, r14)
            r5.a(r6)
            r6 = 3
            r9 = 2
            u.C1477r.f(r6, r8, r9, r5)
            r0.add(r5)
            java.util.ArrayList r5 = r1.f15543h
            r5.addAll(r0)
            goto L_0x07a2
        L_0x07a1:
            r13 = r6
        L_0x07a2:
            v.k r0 = r1.f15545k
            r5 = r13
            r6 = 33
            if (r5 >= r6) goto L_0x07ac
        L_0x07a9:
            r16 = 0
            goto L_0x07c7
        L_0x07ac:
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            java.lang.Object r0 = r0.a(r5)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x07a9
            int r5 = r0.length
            if (r5 != 0) goto L_0x07ba
            goto L_0x07a9
        L_0x07ba:
            int r5 = r0.length
            r6 = 0
        L_0x07bc:
            if (r6 >= r5) goto L_0x07a9
            r7 = r0[r6]
            if (r7 != r2) goto L_0x07c5
            r16 = 1
            goto L_0x07c7
        L_0x07c5:
            int r6 = r6 + r3
            goto L_0x07bc
        L_0x07c7:
            if (r16 == 0) goto L_0x0866
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r0 < r5) goto L_0x0866
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            D.F0 r5 = new D.F0
            r5.<init>()
            r6 = 0
            u.C1477r.f(r3, r4, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            u.C1477r.f(r2, r4, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r9 = new D.j
            r9.<init>(r3, r4, r6)
            r5.a(r9)
            r9 = 3
            u.C1477r.f(r9, r8, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r10 = new D.j
            r10.<init>(r2, r4, r6)
            r5.a(r10)
            u.C1477r.f(r9, r8, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r9 = new D.j
            r9.<init>(r3, r4, r6)
            r5.a(r9)
            u.C1477r.f(r2, r8, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r9 = new D.j
            r9.<init>(r2, r4, r6)
            r5.a(r9)
            u.C1477r.f(r2, r8, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r8 = new D.j
            r8.<init>(r3, r11, r6)
            r5.a(r8)
            u.C1477r.f(r3, r4, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r8 = new D.j
            r8.<init>(r2, r11, r6)
            r5.a(r8)
            u.C1477r.f(r3, r4, r6, r5)
            D.F0 r5 = u.C1477r.b(r0, r5)
            D.j r8 = new D.j
            r8.<init>(r3, r11, r6)
            r5.a(r8)
            u.C1477r.f(r2, r4, r6, r5)
            D.F0 r3 = u.C1477r.b(r0, r5)
            D.j r5 = new D.j
            r5.<init>(r2, r11, r6)
            r3.a(r5)
            u.C1477r.f(r2, r4, r6, r3)
            r0.add(r3)
            java.util.ArrayList r2 = r1.f15540d
            r2.addAll(r0)
        L_0x0866:
            r17.b()
            return
        L_0x086a:
            B.t r2 = new B.t
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1459T.<init>(android.content.Context, java.lang.String, v.r, q4.k):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Size c(android.hardware.camera2.params.StreamConfigurationMap r6, int r7, boolean r8) {
        /*
            r0 = 0
            r1 = 34
            if (r7 != r1) goto L_0x000c
            java.lang.Class<android.graphics.SurfaceTexture> r1 = android.graphics.SurfaceTexture.class
            android.util.Size[] r1 = r6.getOutputSizes(r1)
            goto L_0x0010
        L_0x000c:
            android.util.Size[] r1 = r6.getOutputSizes(r7)
        L_0x0010:
            if (r1 == 0) goto L_0x0056
            int r2 = r1.length
            if (r2 != 0) goto L_0x0016
            goto L_0x0056
        L_0x0016:
            E.c r2 = new E.c
            r2.<init>(r0)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.Object r1 = java.util.Collections.max(r1, r2)
            android.util.Size r1 = (android.util.Size) r1
            android.util.Size r3 = L.a.f2673a
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0043
            if (r8 == 0) goto L_0x0043
            android.util.Size[] r6 = I.a.g(r6, r7)
            if (r6 == 0) goto L_0x0043
            int r7 = r6.length
            if (r7 <= 0) goto L_0x0043
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.Object r6 = java.util.Collections.max(r6, r2)
            r3 = r6
            android.util.Size r3 = (android.util.Size) r3
        L_0x0043:
            r6 = 2
            android.util.Size[] r6 = new android.util.Size[r6]
            r6[r0] = r1
            r7 = 1
            r6[r7] = r3
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.Object r6 = java.util.Collections.max(r6, r2)
            android.util.Size r6 = (android.util.Size) r6
            return r6
        L_0x0056:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1459T.c(android.hardware.camera2.params.StreamConfigurationMap, int, boolean):android.util.Size");
    }

    public static int e(Range range, Range range2) {
        boolean z;
        if (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) {
            z = false;
        } else {
            z = true;
        }
        a.m("Ranges must not intersect", z);
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(C1462c cVar, List list) {
        List<F0> list2;
        HashMap hashMap = this.e;
        if (hashMap.containsKey(cVar)) {
            list2 = (List) hashMap.get(cVar);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = cVar.f15604d;
            int i8 = cVar.f15601a;
            if (!z) {
                int i9 = cVar.f15602b;
                if (i9 == 8) {
                    if (i8 != 1) {
                        ArrayList arrayList2 = this.f15537a;
                        if (i8 != 2) {
                            if (cVar.f15603c) {
                                arrayList2 = this.f15540d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f15538b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f15539c;
                    }
                } else if (i9 == 10 && i8 == 0) {
                    arrayList.addAll(this.f15541f);
                }
            } else if (i8 == 0) {
                arrayList.addAll(this.f15542g);
            }
            hashMap.put(cVar, arrayList);
            list2 = arrayList;
        }
        boolean z6 = false;
        for (F0 c8 : list2) {
            if (c8.c(list) != null) {
                z6 = true;
                continue;
            } else {
                z6 = false;
                continue;
            }
            if (z6) {
                break;
            }
        }
        return z6;
    }

    public final void b() {
        Size size;
        Size size2;
        CamcorderProfile camcorderProfile;
        Size e8 = this.f15555u.e();
        try {
            int parseInt = Integer.parseInt(this.i);
            k kVar = this.f15544j;
            CamcorderProfile camcorderProfile2 = null;
            if (kVar.e(parseInt, 1)) {
                camcorderProfile = kVar.d(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                this.f15553s = new C0052k(L.a.f2674b, new HashMap(), e8, new HashMap(), size, new HashMap(), new HashMap());
            }
            size2 = L.a.f2675c;
            if (kVar.e(parseInt, 10)) {
                camcorderProfile2 = kVar.d(parseInt, 10);
            } else if (kVar.e(parseInt, 8)) {
                camcorderProfile2 = kVar.d(parseInt, 8);
            } else if (kVar.e(parseInt, 12)) {
                camcorderProfile2 = kVar.d(parseInt, 12);
            } else if (kVar.e(parseInt, 6)) {
                camcorderProfile2 = kVar.d(parseInt, 6);
            } else if (kVar.e(parseInt, 5)) {
                camcorderProfile2 = kVar.d(parseInt, 5);
            } else if (kVar.e(parseInt, 4)) {
                camcorderProfile2 = kVar.d(parseInt, 4);
            }
            if (camcorderProfile2 != null) {
                size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            }
            size = size2;
            this.f15553s = new C0052k(L.a.f2674b, new HashMap(), e8, new HashMap(), size, new HashMap(), new HashMap());
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((C1160q) this.f15545k.b().f9766V).f13026V).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new c(true));
                int length = outputSizes.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        size2 = L.a.f2675c;
                        break;
                    }
                    Size size3 = outputSizes[i8];
                    int width = size3.getWidth();
                    Size size4 = L.a.e;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size2 = size3;
                        break;
                    }
                    i8++;
                }
            } else {
                size2 = L.a.f2675c;
            }
        }
    }

    public final List d(C1462c cVar, List list) {
        C0036c cVar2 = C1457Q.f15534a;
        if (cVar.f15601a == 0 && cVar.f15602b == 8) {
            Iterator it = this.f15543h.iterator();
            while (it.hasNext()) {
                List c8 = ((F0) it.next()).c(list);
                if (c8 != null) {
                    return c8;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0354, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0870, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0b0f, code lost:
        if (r5 < r0) goto L_0x0b3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0bb6, code lost:
        if (f(r14) < f(r2)) goto L_0x0b6e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0b82  */
    /* JADX WARNING: Removed duplicated region for block: B:537:0x0db8  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0e03  */
    /* JADX WARNING: Removed duplicated region for block: B:646:0x02ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair g(int r41, java.util.ArrayList r42, java.util.HashMap r43, boolean r44, boolean r45) {
        /*
            r40 = this;
            r9 = r40
            r10 = r41
            r11 = r42
            r0 = r43
            u.J r1 = r9.f15555u
            android.util.Size r2 = r1.a()
            r1.f15517b = r2
            D.k r1 = r9.f15553s
            if (r1 != 0) goto L_0x0018
            r40.b()
            goto L_0x003e
        L_0x0018:
            u.J r1 = r9.f15555u
            android.util.Size r17 = r1.e()
            D.k r1 = r9.f15553s
            android.util.Size r15 = r1.f912a
            java.util.HashMap r2 = r1.f913b
            java.util.HashMap r3 = r1.f915d
            android.util.Size r4 = r1.e
            java.util.HashMap r5 = r1.f916f
            java.util.HashMap r1 = r1.f917g
            D.k r6 = new D.k
            r14 = r6
            r16 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r9.f15553s = r6
        L_0x003e:
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.Set r1 = r43.keySet()
            r14.<init>(r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r14.iterator()
        L_0x0055:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.next()
            D.L0 r3 = (D.L0) r3
            int r3 = r3.N()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x0055
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L_0x0055
        L_0x0077:
            java.util.Collections.sort(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Iterator r3 = r14.iterator()
        L_0x0095:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            D.L0 r4 = (D.L0) r4
            int r5 = r4.N()
            if (r2 != r5) goto L_0x0095
            int r4 = r14.indexOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.add(r4)
            goto L_0x0095
        L_0x00b3:
            com.bumptech.glide.manager.q r1 = r9.f15558x
            r1.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r3 = r42.iterator()
        L_0x00c1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00d3
            java.lang.Object r4 = r3.next()
            D.a r4 = (D.C0032a) r4
            B.x r4 = r4.f879d
            r2.add(r4)
            goto L_0x00c1
        L_0x00d3:
            java.lang.Object r3 = r1.f9082X
            k2.q r3 = (k2.C1160q) r3
            java.lang.Object r4 = r3.f13026V
            w.b r4 = (w.b) r4
            java.util.Set r4 = r4.b()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r4)
            java.util.Iterator r6 = r2.iterator()
        L_0x00e8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00f8
            java.lang.Object r7 = r6.next()
            B.x r7 = (B.C0022x) r7
            com.bumptech.glide.manager.q.m(r5, r7, r3)
            goto L_0x00e8
        L_0x00f8:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r16 = r15.iterator()
        L_0x010b:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0151
            java.lang.Object r17 = r16.next()
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r13 = r17.intValue()
            java.lang.Object r13 = r14.get(r13)
            D.L0 r13 = (D.L0) r13
            B.x r12 = r13.n()
            B.x r11 = B.C0022x.f359c
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0133
            r8.add(r13)
            r19 = r14
            goto L_0x014c
        L_0x0133:
            int r11 = r12.f364a
            r19 = r14
            r14 = 2
            if (r11 == r14) goto L_0x0149
            int r12 = r12.f365b
            if (r11 == 0) goto L_0x0140
            if (r12 == 0) goto L_0x0149
        L_0x0140:
            if (r11 != 0) goto L_0x0145
            if (r12 == 0) goto L_0x0145
            goto L_0x0149
        L_0x0145:
            r6.add(r13)
            goto L_0x014c
        L_0x0149:
            r7.add(r13)
        L_0x014c:
            r11 = r42
            r14 = r19
            goto L_0x010b
        L_0x0151:
            r19 = r14
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r6)
            r13.addAll(r7)
            r13.addAll(r8)
            java.util.Iterator r6 = r13.iterator()
        L_0x016f:
            boolean r7 = r6.hasNext()
            B.x r13 = B.C0022x.f360d
            r16 = 0
            if (r7 == 0) goto L_0x033b
            java.lang.Object r7 = r6.next()
            D.L0 r7 = (D.L0) r7
            B.x r14 = r7.n()
            java.lang.String r8 = r7.p()
            boolean r22 = r14.b()
            if (r22 == 0) goto L_0x01a6
            boolean r8 = r5.contains(r14)
            if (r8 == 0) goto L_0x019c
            r24 = r4
            r22 = r6
            r13 = r14
            r23 = r15
            goto L_0x02e0
        L_0x019c:
            r24 = r4
            r22 = r6
            r23 = r15
        L_0x01a2:
            r13 = r16
            goto L_0x02e0
        L_0x01a6:
            r22 = r6
            int r6 = r14.f364a
            r23 = r15
            int r15 = r14.f365b
            r0 = 1
            if (r6 != r0) goto L_0x01c0
            if (r15 != 0) goto L_0x01c0
            boolean r0 = r5.contains(r13)
            if (r0 == 0) goto L_0x01bd
            r24 = r4
            goto L_0x02e0
        L_0x01bd:
            r24 = r4
            goto L_0x01a2
        L_0x01c0:
            B.x r0 = com.bumptech.glide.manager.q.f(r14, r2, r5)
            java.lang.String r10 = "\n->\n"
            java.lang.String r9 = "Resolved dynamic range for use case "
            r24 = r4
            java.lang.String r4 = "DynamicRangeResolver"
            if (r0 == 0) goto L_0x01ee
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r9)
            r6.append(r8)
            java.lang.String r8 = " from existing attached surface.\n"
            r6.append(r8)
            r6.append(r14)
            r6.append(r10)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            F.h.j(r4, r6)
        L_0x01eb:
            r13 = r0
            goto L_0x02e0
        L_0x01ee:
            B.x r0 = com.bumptech.glide.manager.q.f(r14, r12, r5)
            if (r0 == 0) goto L_0x0212
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r9)
            r6.append(r8)
            java.lang.String r8 = " from concurrently bound use case.\n"
            r6.append(r8)
            r6.append(r14)
            r6.append(r10)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            F.h.j(r4, r6)
            goto L_0x01eb
        L_0x0212:
            boolean r0 = com.bumptech.glide.manager.q.d(r14, r13, r5)
            if (r0 == 0) goto L_0x0237
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r8)
            java.lang.String r6 = " to no compatible HDR dynamic ranges.\n"
            r0.append(r6)
            r0.append(r14)
            r0.append(r10)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            F.h.j(r4, r0)
            goto L_0x02e0
        L_0x0237:
            r0 = 2
            if (r6 != r0) goto L_0x0298
            r0 = 10
            if (r15 == r0) goto L_0x0240
            if (r15 != 0) goto L_0x0298
        L_0x0240:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r6 = android.os.Build.VERSION.SDK_INT
            r15 = 33
            if (r6 < r15) goto L_0x0259
            java.lang.Object r6 = r1.f9081W
            v.k r6 = (v.k) r6
            B.x r6 = u.C1451K.a(r6)
            if (r6 == 0) goto L_0x025b
            r0.add(r6)
            goto L_0x025b
        L_0x0259:
            r6 = r16
        L_0x025b:
            B.x r15 = B.C0022x.e
            r0.add(r15)
            B.x r0 = com.bumptech.glide.manager.q.f(r14, r0, r5)
            if (r0 == 0) goto L_0x0298
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x026f
            java.lang.String r6 = "recommended"
            goto L_0x0271
        L_0x026f:
            java.lang.String r6 = "required"
        L_0x0271:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r9)
            r13.append(r8)
            java.lang.String r8 = " from "
            r13.append(r8)
            r13.append(r6)
            java.lang.String r6 = " 10-bit supported dynamic range.\n"
            r13.append(r6)
            r13.append(r14)
            r13.append(r10)
            r13.append(r0)
            java.lang.String r6 = r13.toString()
            F.h.j(r4, r6)
            goto L_0x01eb
        L_0x0298:
            java.util.Iterator r0 = r5.iterator()
        L_0x029c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01a2
            java.lang.Object r6 = r0.next()
            B.x r6 = (B.C0022x) r6
            boolean r15 = r6.b()
            r20 = r0
            java.lang.String r0 = "Candidate dynamic range must be fully specified."
            n2.a.m(r0, r15)
            boolean r0 = r6.equals(r13)
            if (r0 == 0) goto L_0x02bc
        L_0x02b9:
            r0 = r20
            goto L_0x029c
        L_0x02bc:
            boolean r0 = com.bumptech.glide.manager.q.a(r14, r6)
            if (r0 == 0) goto L_0x02b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r8)
            java.lang.String r8 = " from validated dynamic range constraints or supported HDR dynamic ranges.\n"
            r0.append(r8)
            r0.append(r14)
            r0.append(r10)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            F.h.j(r4, r0)
            r13 = r6
        L_0x02e0:
            if (r13 == 0) goto L_0x02ff
            com.bumptech.glide.manager.q.m(r5, r13, r3)
            r11.put(r7, r13)
            boolean r0 = r2.contains(r13)
            if (r0 != 0) goto L_0x02f1
            r12.add(r13)
        L_0x02f1:
            r9 = r40
            r10 = r41
            r0 = r43
            r6 = r22
            r15 = r23
            r4 = r24
            goto L_0x016f
        L_0x02ff:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.p()
            java.lang.String r2 = "\n  "
            r3 = r24
            java.lang.String r3 = android.text.TextUtils.join(r2, r3)
            java.lang.String r2 = android.text.TextUtils.join(r2, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = "\nRequested dynamic range:\n  "
            r4.append(r1)
            r4.append(r14)
            java.lang.String r1 = "\nSupported dynamic ranges:\n  "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = "\nConstrained set of concurrent dynamic ranges:\n  "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x033b:
            r23 = r15
            java.util.Iterator r0 = r42.iterator()
        L_0x0341:
            boolean r1 = r0.hasNext()
            r9 = 0
            r2 = 4101(0x1005, float:5.747E-42)
            if (r1 == 0) goto L_0x0356
            java.lang.Object r1 = r0.next()
            D.a r1 = (D.C0032a) r1
            int r1 = r1.f877b
            if (r1 != r2) goto L_0x0341
        L_0x0354:
            r0 = 1
            goto L_0x0372
        L_0x0356:
            java.util.Set r0 = r43.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x035e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0371
            java.lang.Object r1 = r0.next()
            D.L0 r1 = (D.L0) r1
            int r1 = r1.A()
            if (r1 != r2) goto L_0x035e
            goto L_0x0354
        L_0x0371:
            r0 = 0
        L_0x0372:
            java.util.Collection r1 = r11.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x037a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0391
            java.lang.Object r2 = r1.next()
            B.x r2 = (B.C0022x) r2
            int r2 = r2.f365b
            r3 = 10
            if (r2 != r3) goto L_0x037a
            r1 = 10
        L_0x038e:
            r10 = r40
            goto L_0x0394
        L_0x0391:
            r1 = 8
            goto L_0x038e
        L_0x0394:
            java.lang.String r2 = r10.i
            java.lang.String r3 = "CONCURRENT_CAMERA"
            java.lang.String r4 = "ULTRA_HIGH_RESOLUTION_CAMERA"
            java.lang.String r5 = "DEFAULT"
            java.lang.String r6 = " camera mode."
            java.lang.String r7 = "Camera device id is "
            r12 = r41
            if (r12 == 0) goto L_0x03cd
            if (r0 != 0) goto L_0x03a7
            goto L_0x03cd
        L_0x03a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r12 == r1) goto L_0x03b2
            r1 = 2
            if (r12 == r1) goto L_0x03b1
            r3 = r5
            goto L_0x03b2
        L_0x03b1:
            r3 = r4
        L_0x03b2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r2)
            java.lang.String r2 = ". Ultra HDR is not currently supported in "
            r1.append(r2)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03cd:
            if (r12 == 0) goto L_0x03fa
            r8 = 10
            if (r1 == r8) goto L_0x03d4
            goto L_0x03fa
        L_0x03d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r12 == r1) goto L_0x03df
            r1 = 2
            if (r12 == r1) goto L_0x03de
            r3 = r5
            goto L_0x03df
        L_0x03de:
            r3 = r4
        L_0x03df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r2)
            java.lang.String r2 = ". 10 bit dynamic range is not currently supported in "
            r1.append(r2)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03fa:
            u.c r14 = new u.c
            r2 = r44
            r14.<init>(r12, r1, r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r42.iterator()
        L_0x040a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x041c
            java.lang.Object r2 = r1.next()
            D.a r2 = (D.C0032a) r2
            D.j r2 = r2.f876a
            r0.add(r2)
            goto L_0x040a
        L_0x041c:
            E.c r1 = new E.c
            r1.<init>(r9)
            java.util.Set r2 = r43.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0429:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0476
            java.lang.Object r3 = r2.next()
            D.L0 r3 = (D.L0) r3
            r4 = r43
            java.lang.Object r5 = r4.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0447
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0447
            r6 = 1
            goto L_0x0448
        L_0x0447:
            r6 = 0
        L_0x0448:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "No available output size is found for "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r8 = "."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            n2.a.h(r7, r6)
            java.lang.Object r5 = java.util.Collections.min(r5, r1)
            android.util.Size r5 = (android.util.Size) r5
            int r3 = r3.A()
            int r6 = r14.f15601a
            D.k r7 = r10.i(r3)
            D.j r3 = D.C0050j.b(r6, r3, r5, r7)
            r0.add(r3)
            goto L_0x0429
        L_0x0476:
            r4 = r43
            boolean r15 = r10.a(r14, r0)
            java.lang.String r8 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            java.lang.String r7 = " New configs: "
            java.lang.String r6 = "No supported surface combination is found for camera device - Id : "
            if (r15 == 0) goto L_0x0fb8
            java.util.Iterator r0 = r42.iterator()
            r1 = r16
        L_0x048a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04a5
            java.lang.Object r2 = r0.next()
            D.a r2 = (D.C0032a) r2
            android.util.Range r2 = r2.f881g
            if (r1 != 0) goto L_0x049c
            r1 = r2
            goto L_0x048a
        L_0x049c:
            if (r2 == 0) goto L_0x048a
            android.util.Range r1 = r1.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x04a3 }
            goto L_0x048a
        L_0x04a3:
            goto L_0x048a
        L_0x04a5:
            java.util.Iterator r0 = r23.iterator()
            r5 = r1
        L_0x04aa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04d5
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r19
            java.lang.Object r1 = r3.get(r1)
            D.L0 r1 = (D.L0) r1
            android.util.Range r1 = r1.y()
            if (r5 != 0) goto L_0x04ca
        L_0x04c8:
            r5 = r1
            goto L_0x04d2
        L_0x04ca:
            if (r1 == 0) goto L_0x04d2
            android.util.Range r1 = r5.intersect(r1)     // Catch:{ IllegalArgumentException -> 0x04d1 }
            goto L_0x04c8
        L_0x04d1:
        L_0x04d2:
            r19 = r3
            goto L_0x04aa
        L_0x04d5:
            r3 = r19
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r43.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x04e4:
            boolean r2 = r1.hasNext()
            r21 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            if (r2 == 0) goto L_0x058f
            java.lang.Object r2 = r1.next()
            D.L0 r2 = (D.L0) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r24 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Object r25 = r4.get(r2)
            java.util.List r25 = (java.util.List) r25
            java.util.Iterator r25 = r25.iterator()
        L_0x050b:
            boolean r26 = r25.hasNext()
            if (r26 == 0) goto L_0x057d
            java.lang.Object r26 = r25.next()
            r4 = r26
            android.util.Size r4 = (android.util.Size) r4
            r26 = r6
            int r6 = r2.A()
            r27 = r7
            int r7 = r14.f15601a
            r28 = r8
            D.k r8 = r10.i(r6)
            D.j r7 = D.C0050j.b(r7, r6, r4, r8)
            if (r5 == 0) goto L_0x0547
            v.k r8 = r10.f15545k
            r29 = r5
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x0544 }
            java.lang.Object r5 = r8.a(r5)     // Catch:{ Exception -> 0x0544 }
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5     // Catch:{ Exception -> 0x0544 }
            long r5 = r5.getOutputMinFrameDuration(r6, r4)     // Catch:{ Exception -> 0x0544 }
            double r5 = (double) r5
            double r5 = r21 / r5
            int r5 = (int) r5
            goto L_0x054c
        L_0x0544:
            r5 = 0
            goto L_0x054c
        L_0x0547:
            r29 = r5
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x054c:
            D.G0 r6 = r7.f909b
            java.lang.Object r7 = r1.get(r6)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L_0x055e
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r1.put(r6, r7)
        L_0x055e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x0572
            r9.add(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7.add(r4)
        L_0x0572:
            r4 = r43
            r6 = r26
            r7 = r27
            r8 = r28
            r5 = r29
            goto L_0x050b
        L_0x057d:
            r29 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r0.put(r2, r9)
            r4 = r43
            r1 = r24
            r9 = 0
            goto L_0x04e4
        L_0x058f:
            r29 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r23.iterator()
        L_0x05a0:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x067f
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r3.get(r4)
            D.L0 r4 = (D.L0) r4
            java.lang.Object r5 = r0.get(r4)
            java.util.List r5 = (java.util.List) r5
            int r4 = r4.A()
            q4.k r6 = r10.f15556v
            v.k r7 = r10.f15545k
            r6.getClass()
            D.s0 r6 = x.C1594a.f16229a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            D.o0 r6 = r6.j(r8)
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) r6
            if (r6 == 0) goto L_0x05d5
        L_0x05d3:
            r6 = 2
            goto L_0x05e5
        L_0x05d5:
            D.s0 r6 = B.C0003d.q(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r7 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            D.o0 r6 = r6.j(r7)
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r6 = (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk) r6
            if (r6 == 0) goto L_0x05e4
            goto L_0x05d3
        L_0x05e4:
            r6 = 3
        L_0x05e5:
            if (r6 == 0) goto L_0x0613
            r7 = 1
            if (r6 == r7) goto L_0x0610
            r7 = 2
            if (r6 == r7) goto L_0x05f0
            r7 = r16
            goto L_0x0615
        L_0x05f0:
            r6 = 256(0x100, float:3.59E-43)
            D.k r7 = r10.i(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r7 = r7.f916f
            java.lang.Object r6 = r7.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            android.util.Rational r7 = new android.util.Rational
            int r8 = r6.getWidth()
            int r6 = r6.getHeight()
            r7.<init>(r8, r6)
            goto L_0x0615
        L_0x0610:
            android.util.Rational r7 = E.b.f1284c
            goto L_0x0615
        L_0x0613:
            android.util.Rational r7 = E.b.f1282a
        L_0x0615:
            if (r7 != 0) goto L_0x0618
            goto L_0x0645
        L_0x0618:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0626:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0640
            java.lang.Object r9 = r5.next()
            android.util.Size r9 = (android.util.Size) r9
            boolean r24 = E.b.a(r7, r9)
            if (r24 == 0) goto L_0x063c
            r6.add(r9)
            goto L_0x0626
        L_0x063c:
            r8.add(r9)
            goto L_0x0626
        L_0x0640:
            r9 = 0
            r8.addAll(r9, r6)
            r5 = r8
        L_0x0645:
            y.c r6 = r10.f15557w
            int r4 = D.C0050j.a(r4)
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r6 = r6.f16328a
            if (r6 != 0) goto L_0x0650
            goto L_0x067a
        L_0x0650:
            android.util.Size r4 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.b(r4)
            if (r4 != 0) goto L_0x0657
            goto L_0x067a
        L_0x0657:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x0663:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0679
            java.lang.Object r7 = r5.next()
            android.util.Size r7 = (android.util.Size) r7
            boolean r8 = r7.equals(r4)
            if (r8 != 0) goto L_0x0663
            r6.add(r7)
            goto L_0x0663
        L_0x0679:
            r5 = r6
        L_0x067a:
            r1.add(r5)
            goto L_0x05a0
        L_0x067f:
            java.util.Iterator r0 = r1.iterator()
            r2 = 1
        L_0x0684:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0697
            java.lang.Object r4 = r0.next()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r2 = r2 * r4
            goto L_0x0684
        L_0x0697:
            if (r2 == 0) goto L_0x0faf
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = 0
        L_0x069f:
            if (r0 >= r2) goto L_0x06ac
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9.add(r4)
            r4 = 1
            int r0 = r0 + r4
            goto L_0x069f
        L_0x06ac:
            r0 = 0
            java.lang.Object r4 = r1.get(r0)
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            int r0 = r2 / r0
            r5 = r2
            r4 = 0
        L_0x06bb:
            int r6 = r1.size()
            if (r4 >= r6) goto L_0x0705
            java.lang.Object r6 = r1.get(r4)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L_0x06c8:
            if (r7 >= r2) goto L_0x06e4
            java.lang.Object r8 = r9.get(r7)
            java.util.List r8 = (java.util.List) r8
            int r24 = r7 % r5
            r43 = r2
            int r2 = r24 / r0
            java.lang.Object r2 = r6.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            r8.add(r2)
            r2 = 1
            int r7 = r7 + r2
            r2 = r43
            goto L_0x06c8
        L_0x06e4:
            r43 = r2
            r2 = 1
            int r6 = r1.size()
            int r6 = r6 - r2
            if (r4 >= r6) goto L_0x0701
            int r5 = r4 + 1
            java.lang.Object r5 = r1.get(r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r5 = r0 / r5
            r39 = r5
            r5 = r0
            r0 = r39
        L_0x0701:
            int r4 = r4 + r2
            r2 = r43
            goto L_0x06bb
        L_0x0705:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            D.c r0 = u.C1457Q.f15534a
            java.util.Iterator r0 = r42.iterator()
        L_0x071f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x073e
            java.lang.Object r1 = r0.next()
            D.a r1 = (D.C0032a) r1
            java.util.List r2 = r1.e
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            D.N0 r2 = (D.N0) r2
            t.a r1 = r1.f880f
            boolean r1 = u.C1457Q.c(r1, r2)
            if (r1 == 0) goto L_0x071f
        L_0x073c:
            r0 = 1
            goto L_0x075a
        L_0x073e:
            java.util.Iterator r0 = r3.iterator()
        L_0x0742:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0759
            java.lang.Object r1 = r0.next()
            D.L0 r1 = (D.L0) r1
            D.N0 r2 = r1.k()
            boolean r1 = u.C1457Q.c(r1, r2)
            if (r1 == 0) goto L_0x0742
            goto L_0x073c
        L_0x0759:
            r0 = 0
        L_0x075a:
            java.util.Iterator r1 = r42.iterator()
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0761:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0796
            java.lang.Object r2 = r1.next()
            D.a r2 = (D.C0032a) r2
            r43 = r1
            int r1 = r2.f877b
            android.util.Size r2 = r2.f878c
            r24 = r3
            v.k r3 = r10.f15545k
            r25 = r5
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x078a }
            java.lang.Object r3 = r3.a(r5)     // Catch:{ Exception -> 0x078a }
            android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3     // Catch:{ Exception -> 0x078a }
            long r1 = r3.getOutputMinFrameDuration(r1, r2)     // Catch:{ Exception -> 0x078a }
            double r1 = (double) r1
            double r1 = r21 / r1
            int r1 = (int) r1
            goto L_0x078b
        L_0x078a:
            r1 = 0
        L_0x078b:
            int r4 = java.lang.Math.min(r4, r1)
            r1 = r43
            r3 = r24
            r5 = r25
            goto L_0x0761
        L_0x0796:
            r24 = r3
            r25 = r5
            boolean r1 = r10.f15551q
            java.lang.String r5 = "SurfaceConfig does not map to any use case"
            if (r1 == 0) goto L_0x0945
            if (r0 != 0) goto L_0x0945
            java.util.Iterator r21 = r9.iterator()
            r0 = r16
        L_0x07a8:
            boolean r1 = r21.hasNext()
            if (r1 == 0) goto L_0x08fc
            java.lang.Object r0 = r21.next()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r40
            r1 = r41
            r2 = r42
            r43 = r24
            r22 = r4
            r4 = r43
            r24 = r11
            r12 = r29
            r11 = r5
            r5 = r23
            r29 = r13
            r13 = r26
            r26 = r6
            r6 = r22
            r31 = r7
            r30 = r12
            r12 = r27
            r7 = r26
            r32 = r8
            r27 = r9
            r9 = r28
            r8 = r25
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.first
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = r10.d(r14, r0)
            if (r0 == 0) goto L_0x0882
            r1 = 0
        L_0x07ef:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0882
            java.lang.Object r2 = r0.get(r1)
            D.j r2 = (D.C0050j) r2
            long r2 = r2.f910c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r8 = r26
            boolean r4 = r8.containsKey(r4)
            D.N0 r5 = D.N0.f834Y
            if (r4 == 0) goto L_0x0838
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r8.get(r4)
            D.a r4 = (D.C0032a) r4
            java.util.List r6 = r4.e
            int r6 = r6.size()
            java.util.List r4 = r4.e
            r7 = 1
            if (r6 != r7) goto L_0x0828
            r7 = 0
            java.lang.Object r5 = r4.get(r7)
            D.N0 r5 = (D.N0) r5
            goto L_0x0829
        L_0x0828:
            r7 = 0
        L_0x0829:
            boolean r2 = u.C1457Q.b(r5, r2, r4)
            if (r2 != 0) goto L_0x0832
            r6 = r25
            goto L_0x0870
        L_0x0832:
            r6 = r25
            r25 = r0
        L_0x0836:
            r0 = 1
            goto L_0x0873
        L_0x0838:
            r7 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = r25
            boolean r4 = r6.containsKey(r4)
            if (r4 == 0) goto L_0x087c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r6.get(r4)
            D.L0 r4 = (D.L0) r4
            D.N0 r7 = r4.k()
            r25 = r0
            D.N0 r0 = r4.k()
            if (r0 != r5) goto L_0x0866
            Q.e r4 = (Q.e) r4
            D.c r0 = Q.e.f3985V
            java.lang.Object r0 = N.e.p(r4, r0)
            java.util.List r0 = (java.util.List) r0
            goto L_0x086a
        L_0x0866:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x086a:
            boolean r0 = u.C1457Q.b(r7, r2, r0)
            if (r0 != 0) goto L_0x0836
        L_0x0870:
            r0 = r16
            goto L_0x088a
        L_0x0873:
            int r1 = r1 + r0
            r26 = r8
            r0 = r25
            r25 = r6
            goto L_0x07ef
        L_0x087c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r11)
            throw r0
        L_0x0882:
            r6 = r25
            r8 = r26
            r25 = r0
            r0 = r25
        L_0x088a:
            if (r0 == 0) goto L_0x08d8
            v.k r1 = r10.f15545k
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto L_0x0895
            goto L_0x08d6
        L_0x0895:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r1 = r1.a(r2)
            long[] r1 = (long[]) r1
            if (r1 == 0) goto L_0x08d6
            int r2 = r1.length
            if (r2 != 0) goto L_0x08a5
            goto L_0x08d6
        L_0x08a5:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        L_0x08ac:
            if (r4 >= r3) goto L_0x08ba
            r25 = r1[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r25)
            r2.add(r5)
            r5 = 1
            int r4 = r4 + r5
            goto L_0x08ac
        L_0x08ba:
            java.util.Iterator r1 = r0.iterator()
        L_0x08be:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0916
            java.lang.Object r3 = r1.next()
            D.j r3 = (D.C0050j) r3
            long r3 = r3.f910c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x08be
        L_0x08d6:
            r0 = r16
        L_0x08d8:
            r8.clear()
            r6.clear()
            r25 = r6
            r6 = r8
            r28 = r9
            r5 = r11
            r26 = r13
            r4 = r22
            r11 = r24
            r9 = r27
            r13 = r29
            r29 = r30
            r7 = r31
            r8 = r32
            r24 = r43
            r27 = r12
            r12 = r41
            goto L_0x07a8
        L_0x08fc:
            r22 = r4
            r31 = r7
            r32 = r8
            r43 = r24
            r12 = r27
            r30 = r29
            r8 = r6
            r27 = r9
            r24 = r11
            r29 = r13
            r6 = r25
            r13 = r26
            r9 = r28
            r11 = r5
        L_0x0916:
            if (r0 != 0) goto L_0x091a
            if (r15 == 0) goto L_0x091f
        L_0x091a:
            r15 = r42
            r9 = r43
            goto L_0x0943
        L_0x091f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            java.lang.String r2 = r10.i
            r1.append(r2)
            r1.append(r9)
            r15 = r42
            r1.append(r15)
            r1.append(r12)
            r9 = r43
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0943:
            r7 = r0
            goto L_0x0961
        L_0x0945:
            r15 = r42
            r22 = r4
            r31 = r7
            r32 = r8
            r12 = r27
            r30 = r29
            r8 = r6
            r27 = r9
            r29 = r13
            r9 = r24
            r6 = r25
            r13 = r26
            r24 = r11
            r11 = r5
            r7 = r16
        L_0x0961:
            java.util.Iterator r21 = r27.iterator()
            r27 = r16
            r28 = r27
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r25 = 0
            r26 = 0
        L_0x0973:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0a2b
            java.lang.Object r0 = r21.next()
            r33 = r0
            java.util.List r33 = (java.util.List) r33
            r34 = 0
            r35 = 0
            r0 = r40
            r1 = r41
            r2 = r42
            r3 = r33
            r36 = r4
            r4 = r9
            r37 = r5
            r5 = r23
            r38 = r6
            r6 = r22
            r43 = r12
            r19 = 0
            r12 = r7
            r7 = r34
            r15 = r8
            r8 = r35
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            r4 = r22
            if (r30 == 0) goto L_0x09c6
            if (r4 <= r5) goto L_0x09c6
            java.lang.Comparable r0 = r30.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r5 >= r0) goto L_0x09c6
            r0 = 0
            goto L_0x09c7
        L_0x09c6:
            r0 = 1
        L_0x09c7:
            if (r25 != 0) goto L_0x09ee
            boolean r2 = r10.a(r14, r1)
            if (r2 == 0) goto L_0x09ee
            r3 = r37
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x09d7
            goto L_0x09d9
        L_0x09d7:
            if (r3 >= r5) goto L_0x09dc
        L_0x09d9:
            r3 = r5
            r27 = r33
        L_0x09dc:
            if (r0 == 0) goto L_0x09f0
            if (r26 == 0) goto L_0x09e8
            r1 = r28
            r0 = r33
            r4 = r36
            goto L_0x0a39
        L_0x09e8:
            r3 = r5
            r27 = r33
            r25 = 1
            goto L_0x09f0
        L_0x09ee:
            r3 = r37
        L_0x09f0:
            if (r12 == 0) goto L_0x0a18
            if (r26 != 0) goto L_0x0a18
            java.util.List r1 = r10.d(r14, r1)
            if (r1 == 0) goto L_0x0a18
            r2 = r36
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0a02
            goto L_0x0a04
        L_0x0a02:
            if (r2 >= r5) goto L_0x0a07
        L_0x0a04:
            r2 = r5
            r28 = r33
        L_0x0a07:
            if (r0 == 0) goto L_0x0a1d
            if (r25 == 0) goto L_0x0a12
            r4 = r5
            r0 = r27
            r1 = r33
            r5 = r3
            goto L_0x0a39
        L_0x0a12:
            r2 = r5
            r28 = r33
            r26 = 1
            goto L_0x0a1d
        L_0x0a18:
            r2 = r36
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0a1d:
            r5 = r3
            r22 = r4
            r7 = r12
            r8 = r15
            r6 = r38
            r15 = r42
            r12 = r43
            r4 = r2
            goto L_0x0973
        L_0x0a2b:
            r2 = r4
            r3 = r5
            r38 = r6
            r15 = r8
            r43 = r12
            r19 = 0
            r12 = r7
            r0 = r27
            r1 = r28
        L_0x0a39:
            if (r0 == 0) goto L_0x0f7e
            if (r30 == 0) goto L_0x0bee
            android.util.Range r2 = D.C0048i.f903f
            r3 = r30
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L_0x0a4f
        L_0x0a47:
            r44 = r0
            r28 = r1
            r16 = r2
            goto L_0x0bf2
        L_0x0a4f:
            v.k r6 = r10.f15545k
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r6 = r6.a(r7)
            android.util.Range[] r6 = (android.util.Range[]) r6
            if (r6 != 0) goto L_0x0a5c
            goto L_0x0a47
        L_0x0a5c:
            android.util.Range r7 = new android.util.Range
            java.lang.Comparable r8 = r3.getLower()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = java.lang.Math.min(r8, r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = java.lang.Math.min(r3, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.<init>(r8, r3)
            int r3 = r6.length
            r8 = 0
            r13 = 0
        L_0x0a88:
            if (r8 >= r3) goto L_0x0bdd
            r14 = r6[r8]
            java.lang.Comparable r16 = r14.getLower()
            java.lang.Integer r16 = (java.lang.Integer) r16
            r21 = r3
            int r3 = r16.intValue()
            if (r5 < r3) goto L_0x0bb9
            android.util.Range r3 = D.C0048i.f903f
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0aa3
            r2 = r14
        L_0x0aa3:
            boolean r3 = r14.equals(r7)
            if (r3 == 0) goto L_0x0ab8
            r44 = r0
            r28 = r1
            r25 = r4
            r26 = r5
            r22 = r11
            r2 = r14
        L_0x0ab4:
            r27 = r15
            goto L_0x0be9
        L_0x0ab8:
            android.util.Range r3 = r14.intersect(r7)     // Catch:{ IllegalArgumentException -> 0x0b71 }
            int r3 = f(r3)     // Catch:{ IllegalArgumentException -> 0x0b71 }
            if (r13 != 0) goto L_0x0ad3
            r44 = r0
            r28 = r1
            r13 = r3
            r25 = r4
            r26 = r5
            r41 = r6
            r22 = r11
            r27 = r15
            goto L_0x0b6e
        L_0x0ad3:
            if (r3 < r13) goto L_0x0b5f
            android.util.Range r3 = r2.intersect(r7)     // Catch:{ IllegalArgumentException -> 0x0b71 }
            int r3 = f(r3)     // Catch:{ IllegalArgumentException -> 0x0b71 }
            r22 = r11
            double r10 = (double) r3
            android.util.Range r3 = r14.intersect(r7)     // Catch:{ IllegalArgumentException -> 0x0b54 }
            int r3 = f(r3)     // Catch:{ IllegalArgumentException -> 0x0b54 }
            r25 = r4
            double r3 = (double) r3
            r41 = r6
            int r6 = f(r14)     // Catch:{ IllegalArgumentException -> 0x0b4d }
            r26 = r5
            double r5 = (double) r6
            double r5 = r3 / r5
            r27 = r15
            int r15 = f(r2)     // Catch:{ IllegalArgumentException -> 0x0b48 }
            r44 = r0
            r28 = r1
            double r0 = (double) r15
            double r0 = r10 / r0
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r30 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r30 <= 0) goto L_0x0b13
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0b11
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0b3c
        L_0x0b11:
            r2 = r14
            goto L_0x0b3c
        L_0x0b13:
            if (r30 != 0) goto L_0x0b33
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b1a
            goto L_0x0b11
        L_0x0b1a:
            if (r3 != 0) goto L_0x0b3c
            java.lang.Comparable r0 = r14.getLower()     // Catch:{ IllegalArgumentException -> 0x0b46 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalArgumentException -> 0x0b46 }
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0b46 }
            java.lang.Comparable r1 = r2.getLower()     // Catch:{ IllegalArgumentException -> 0x0b46 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalArgumentException -> 0x0b46 }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0b46 }
            if (r0 <= r1) goto L_0x0b3c
            goto L_0x0b11
        L_0x0b33:
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0b3c
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b3c
            goto L_0x0b11
        L_0x0b3c:
            android.util.Range r0 = r7.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x0b46 }
            int r13 = f(r0)     // Catch:{ IllegalArgumentException -> 0x0b46 }
        L_0x0b44:
            r14 = r2
            goto L_0x0b6e
        L_0x0b46:
            goto L_0x0b80
        L_0x0b48:
            r44 = r0
            r28 = r1
            goto L_0x0b46
        L_0x0b4d:
            r44 = r0
            r28 = r1
            r26 = r5
            goto L_0x0b7d
        L_0x0b54:
            r44 = r0
            r28 = r1
            r25 = r4
            r26 = r5
            r41 = r6
            goto L_0x0b7d
        L_0x0b5f:
            r44 = r0
            r28 = r1
            r25 = r4
            r26 = r5
            r41 = r6
            r22 = r11
            r27 = r15
            goto L_0x0b44
        L_0x0b6e:
            r2 = r14
        L_0x0b6f:
            r0 = 1
            goto L_0x0bc8
        L_0x0b71:
            r44 = r0
            r28 = r1
            r25 = r4
            r26 = r5
            r41 = r6
            r22 = r11
        L_0x0b7d:
            r27 = r15
            goto L_0x0b46
        L_0x0b80:
            if (r13 != 0) goto L_0x0b6f
            int r0 = e(r14, r7)
            int r1 = e(r2, r7)
            if (r0 >= r1) goto L_0x0b8d
            goto L_0x0bb8
        L_0x0b8d:
            int r0 = e(r14, r7)
            int r1 = e(r2, r7)
            if (r0 != r1) goto L_0x0b6f
            java.lang.Comparable r0 = r14.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Comparable r1 = r2.getUpper()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 <= r1) goto L_0x0bae
            goto L_0x0bb8
        L_0x0bae:
            int r0 = f(r14)
            int r1 = f(r2)
            if (r0 >= r1) goto L_0x0b6f
        L_0x0bb8:
            goto L_0x0b6e
        L_0x0bb9:
            r44 = r0
            r28 = r1
            r25 = r4
            r26 = r5
            r41 = r6
            r22 = r11
            r27 = r15
            goto L_0x0b6f
        L_0x0bc8:
            int r8 = r8 + r0
            r10 = r40
            r6 = r41
            r0 = r44
            r3 = r21
            r11 = r22
            r4 = r25
            r5 = r26
            r15 = r27
            r1 = r28
            goto L_0x0a88
        L_0x0bdd:
            r44 = r0
            r28 = r1
            r25 = r4
            r26 = r5
            r22 = r11
            goto L_0x0ab4
        L_0x0be9:
            r16 = r2
        L_0x0beb:
            r0 = r16
            goto L_0x0bfb
        L_0x0bee:
            r44 = r0
            r28 = r1
        L_0x0bf2:
            r25 = r4
            r26 = r5
            r22 = r11
            r27 = r15
            goto L_0x0beb
        L_0x0bfb:
            java.util.Iterator r1 = r9.iterator()
        L_0x0bff:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "Null resolution"
            java.lang.String r4 = "Null expectedFrameRateRange"
            if (r2 == 0) goto L_0x0cc5
            java.lang.Object r2 = r1.next()
            D.L0 r2 = (D.L0) r2
            int r5 = r9.indexOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = r23
            int r5 = r6.indexOf(r5)
            r7 = r44
            java.lang.Object r5 = r7.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            android.util.Range r8 = D.C0048i.f903f
            C7.d r8 = new C7.d
            r10 = 2
            r8.<init>((int) r10)
            if (r5 == 0) goto L_0x0cbf
            r8.f732V = r5
            android.util.Range r3 = D.C0048i.f903f
            if (r3 == 0) goto L_0x0cb9
            r8.f734X = r3
            r5 = r29
            r8.f733W = r5
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r8.f736Z = r3
            r3 = r24
            java.lang.Object r4 = r3.get(r2)
            B.x r4 = (B.C0022x) r4
            r4.getClass()
            r8.f733W = r4
            D.e0 r4 = D.C0041e0.b()
            D.c r10 = t.C1412a.f15160X
            boolean r11 = r2.q0(r10)
            if (r11 == 0) goto L_0x0c61
            java.lang.Object r11 = r2.b0(r10)
            java.lang.Long r11 = (java.lang.Long) r11
            r4.e(r10, r11)
        L_0x0c61:
            D.c r10 = D.L0.f816y
            boolean r11 = r2.q0(r10)
            if (r11 == 0) goto L_0x0c72
            java.lang.Object r11 = r2.b0(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r4.e(r10, r11)
        L_0x0c72:
            D.c r10 = D.U.f854V
            boolean r11 = r2.q0(r10)
            if (r11 == 0) goto L_0x0c83
            java.lang.Object r11 = r2.b0(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r4.e(r10, r11)
        L_0x0c83:
            D.c r10 = D.V.f864g
            boolean r11 = r2.q0(r10)
            if (r11 == 0) goto L_0x0c94
            java.lang.Object r11 = r2.b0(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r4.e(r10, r11)
        L_0x0c94:
            t.a r10 = new t.a
            r11 = 1
            r10.<init>((int) r11, (java.lang.Object) r4)
            r8.f735Y = r10
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r45)
            r8.f736Z = r4
            if (r0 == 0) goto L_0x0ca6
            r8.f734X = r0
        L_0x0ca6:
            D.i r4 = r8.d()
            r8 = r31
            r8.put(r2, r4)
            r24 = r3
            r29 = r5
            r23 = r6
            r44 = r7
            goto L_0x0bff
        L_0x0cb9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0cbf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x0cc5:
            r7 = r44
            r5 = r29
            r8 = r31
            if (r12 == 0) goto L_0x0cf6
            r2 = r25
            r0 = r26
            if (r0 != r2) goto L_0x0cf6
            int r0 = r7.size()
            int r1 = r28.size()
            if (r0 != r1) goto L_0x0cf6
            r9 = 0
        L_0x0cde:
            int r0 = r7.size()
            if (r9 >= r0) goto L_0x0d01
            java.lang.Object r0 = r7.get(r9)
            android.util.Size r0 = (android.util.Size) r0
            r1 = r28
            java.lang.Object r2 = r1.get(r9)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0cfc
        L_0x0cf6:
            r0 = r40
            r10 = r32
            goto L_0x0f78
        L_0x0cfc:
            r0 = 1
            int r9 = r9 + r0
            r28 = r1
            goto L_0x0cde
        L_0x0d01:
            r0 = r40
            v.k r1 = r0.f15545k
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "Null dynamicRange"
            r7 = 33
            if (r2 >= r7) goto L_0x0d11
        L_0x0d0d:
            r10 = r32
            goto L_0x0ec2
        L_0x0d11:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r7 = r8.keySet()
            r2.<init>(r7)
            java.util.Iterator r7 = r42.iterator()
        L_0x0d1e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0d30
            java.lang.Object r9 = r7.next()
            D.a r9 = (D.C0032a) r9
            t.a r9 = r9.f880f
            r9.getClass()
            goto L_0x0d1e
        L_0x0d30:
            java.util.Iterator r7 = r2.iterator()
        L_0x0d34:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0d4f
            java.lang.Object r9 = r7.next()
            D.L0 r9 = (D.L0) r9
            java.lang.Object r9 = r8.get(r9)
            D.i r9 = (D.C0048i) r9
            r9.getClass()
            t.a r9 = r9.f907d
            r9.getClass()
            goto L_0x0d34
        L_0x0d4f:
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r1 = r1.a(r7)
            long[] r1 = (long[]) r1
            if (r1 == 0) goto L_0x0d0d
            int r7 = r1.length
            if (r7 != 0) goto L_0x0d5f
            goto L_0x0d0d
        L_0x0d5f:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            int r9 = r1.length
            r10 = 0
        L_0x0d66:
            if (r10 >= r9) goto L_0x0d74
            r13 = r1[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r7.add(r11)
            r11 = 1
            int r10 = r10 + r11
            goto L_0x0d66
        L_0x0d74:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r9 = r42.iterator()
            boolean r10 = r9.hasNext()
            r13 = 0
            if (r10 == 0) goto L_0x0dac
            java.lang.Object r9 = r9.next()
            D.a r9 = (D.C0032a) r9
            t.a r10 = r9.f880f
            D.c r11 = t.C1412a.f15160X
            boolean r10 = r10.q0(r11)
            if (r10 != 0) goto L_0x0d98
        L_0x0d95:
            r9 = 0
            r10 = 1
            goto L_0x0dae
        L_0x0d98:
            t.a r9 = r9.f880f
            java.lang.Object r9 = r9.b0(r11)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0da9
            goto L_0x0d95
        L_0x0da9:
            r9 = 1
        L_0x0daa:
            r10 = 0
            goto L_0x0dae
        L_0x0dac:
            r9 = 0
            goto L_0x0daa
        L_0x0dae:
            java.util.Iterator r11 = r2.iterator()
        L_0x0db2:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0e01
            java.lang.Object r15 = r11.next()
            D.L0 r15 = (D.L0) r15
            D.c r13 = t.C1412a.f15160X
            boolean r14 = r15.q0(r13)
            r41 = r11
            java.lang.String r11 = "Either all use cases must have non-default stream use case assigned or none should have it"
            if (r14 != 0) goto L_0x0dd6
            if (r9 != 0) goto L_0x0dd0
            r10 = 1
            r20 = 0
            goto L_0x0df6
        L_0x0dd0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r11)
            throw r1
        L_0x0dd6:
            java.lang.Object r13 = r15.b0(r13)
            java.lang.Long r13 = (java.lang.Long) r13
            long r14 = r13.longValue()
            r20 = 0
            int r16 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r16 != 0) goto L_0x0df0
            if (r9 != 0) goto L_0x0dea
            r10 = 1
            goto L_0x0df6
        L_0x0dea:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r11)
            throw r1
        L_0x0df0:
            if (r10 != 0) goto L_0x0dfb
            r1.add(r13)
            r9 = 1
        L_0x0df6:
            r11 = r41
            r13 = r20
            goto L_0x0db2
        L_0x0dfb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r11)
            throw r1
        L_0x0e01:
            if (r10 != 0) goto L_0x0d0d
            java.util.Iterator r1 = r1.iterator()
        L_0x0e07:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0e1b
            java.lang.Object r9 = r1.next()
            java.lang.Long r9 = (java.lang.Long) r9
            boolean r9 = r7.contains(r9)
            if (r9 != 0) goto L_0x0e07
            goto L_0x0d0d
        L_0x0e1b:
            java.util.Iterator r1 = r42.iterator()
        L_0x0e1f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0e88
            java.lang.Object r7 = r1.next()
            D.a r7 = (D.C0032a) r7
            t.a r9 = r7.f880f
            D.c r10 = t.C1412a.f15160X
            java.lang.Object r10 = r9.b0(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            t.a r9 = u.C1457Q.a(r9, r10)
            if (r9 == 0) goto L_0x0e83
            android.util.Range r10 = D.C0048i.f903f
            C7.d r10 = new C7.d
            r11 = 2
            r10.<init>((int) r11)
            android.util.Size r11 = r7.f878c
            if (r11 == 0) goto L_0x0e7d
            r10.f732V = r11
            android.util.Range r11 = D.C0048i.f903f
            if (r11 == 0) goto L_0x0e77
            r10.f734X = r11
            r10.f733W = r5
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.f736Z = r11
            B.x r11 = r7.f879d
            if (r11 == 0) goto L_0x0e71
            r10.f733W = r11
            r10.f735Y = r9
            android.util.Range r9 = r7.f881g
            if (r9 == 0) goto L_0x0e67
            r10.f734X = r9
        L_0x0e67:
            D.i r9 = r10.d()
            r10 = r32
            r10.put(r7, r9)
            goto L_0x0e85
        L_0x0e71:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0e77:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r4)
            throw r1
        L_0x0e7d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r3)
            throw r1
        L_0x0e83:
            r10 = r32
        L_0x0e85:
            r32 = r10
            goto L_0x0e1f
        L_0x0e88:
            r10 = r32
            java.util.Iterator r1 = r2.iterator()
        L_0x0e8e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0f78
            java.lang.Object r2 = r1.next()
            D.L0 r2 = (D.L0) r2
            java.lang.Object r3 = r8.get(r2)
            D.i r3 = (D.C0048i) r3
            t.a r4 = r3.f907d
            D.c r5 = t.C1412a.f15160X
            java.lang.Object r5 = r4.b0(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            t.a r4 = u.C1457Q.a(r4, r5)
            if (r4 == 0) goto L_0x0e8e
            C7.d r3 = r3.a()
            r3.f735Y = r4
            D.i r3 = r3.d()
            r8.put(r2, r3)
            goto L_0x0e8e
        L_0x0ec2:
            r9 = 0
        L_0x0ec3:
            int r1 = r12.size()
            if (r9 >= r1) goto L_0x0f78
            java.lang.Object r1 = r12.get(r9)
            D.j r1 = (D.C0050j) r1
            long r1 = r1.f910c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r11 = r27
            boolean r7 = r11.containsKey(r7)
            if (r7 == 0) goto L_0x0f36
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r11.get(r7)
            D.a r7 = (D.C0032a) r7
            t.a r13 = r7.f880f
            t.a r1 = u.C1457Q.a(r13, r1)
            if (r1 == 0) goto L_0x0f31
            android.util.Range r2 = D.C0048i.f903f
            C7.d r2 = new C7.d
            r13 = 2
            r2.<init>((int) r13)
            android.util.Size r14 = r7.f878c
            if (r14 == 0) goto L_0x0f2b
            r2.f732V = r14
            android.util.Range r14 = D.C0048i.f903f
            if (r14 == 0) goto L_0x0f25
            r2.f734X = r14
            r2.f733W = r5
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r2.f736Z = r14
            B.x r14 = r7.f879d
            if (r14 == 0) goto L_0x0f1f
            r2.f733W = r14
            r2.f735Y = r1
            android.util.Range r1 = r7.f881g
            if (r1 == 0) goto L_0x0f17
            r2.f734X = r1
        L_0x0f17:
            D.i r1 = r2.d()
            r10.put(r7, r1)
            goto L_0x0f32
        L_0x0f1f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r6)
            throw r1
        L_0x0f25:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r4)
            throw r1
        L_0x0f2b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r3)
            throw r1
        L_0x0f31:
            r13 = 2
        L_0x0f32:
            r14 = r38
        L_0x0f34:
            r1 = 1
            goto L_0x0f69
        L_0x0f36:
            r13 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r14 = r38
            boolean r7 = r14.containsKey(r7)
            if (r7 == 0) goto L_0x0f70
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r14.get(r7)
            D.L0 r7 = (D.L0) r7
            java.lang.Object r15 = r8.get(r7)
            D.i r15 = (D.C0048i) r15
            t.a r13 = r15.f907d
            t.a r1 = u.C1457Q.a(r13, r1)
            if (r1 == 0) goto L_0x0f34
            C7.d r2 = r15.a()
            r2.f735Y = r1
            D.i r1 = r2.d()
            r8.put(r7, r1)
            goto L_0x0f34
        L_0x0f69:
            int r9 = r9 + r1
            r27 = r11
            r38 = r14
            goto L_0x0ec3
        L_0x0f70:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r2 = r22
            r1.<init>(r2)
            throw r1
        L_0x0f78:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r8, r10)
            return r1
        L_0x0f7e:
            r0 = r10
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            java.lang.String r3 = r0.i
            r2.append(r3)
            java.lang.String r3 = " and Hardware level: "
            r2.append(r3)
            int r3 = r0.f15547m
            r2.append(r3)
            java.lang.String r3 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r2.append(r3)
            r3 = r42
            r2.append(r3)
            r4 = r43
            r2.append(r4)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0faf:
            r0 = r10
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to find supported resolutions."
            r1.<init>(r2)
            throw r1
        L_0x0fb8:
            r3 = r42
            r13 = r6
            r4 = r7
            r9 = r8
            r0 = r10
            r1 = r19
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            java.lang.String r6 = r0.i
            r5.append(r6)
            r5.append(r9)
            r5.append(r3)
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1459T.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i8, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i9, HashMap hashMap, HashMap hashMap2) {
        int i10;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0032a aVar = (C0032a) it.next();
            arrayList4.add(aVar.f876a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), aVar);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size = (Size) list.get(i11);
            L0 l02 = (L0) arrayList2.get(((Integer) arrayList3.get(i11)).intValue());
            int A8 = l02.A();
            arrayList4.add(C0050j.b(i8, A8, size, i(A8)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), l02);
            }
            try {
                i10 = (int) (1.0E9d / ((double) ((StreamConfigurationMap) this.f15545k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(l02.A(), size)));
            } catch (Exception unused) {
                i10 = 0;
            }
            i9 = Math.min(i9, i10);
        }
        return new Pair(arrayList4, Integer.valueOf(i9));
    }

    public final C0052k i(int i8) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.f15554t;
        if (!arrayList.contains(Integer.valueOf(i8))) {
            j(this.f15553s.f913b, L.a.f2676d, i8);
            j(this.f15553s.f915d, L.a.f2677f, i8);
            HashMap hashMap = this.f15553s.f916f;
            v.k kVar = this.f15545k;
            Size c8 = c((StreamConfigurationMap) ((C1160q) kVar.b().f9766V).f13026V, i8, true);
            if (c8 != null) {
                hashMap.put(Integer.valueOf(i8), c8);
            }
            HashMap hashMap2 = this.f15553s.f917g;
            if (Build.VERSION.SDK_INT >= 31 && this.f15552r && (streamConfigurationMap = (StreamConfigurationMap) kVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                hashMap2.put(Integer.valueOf(i8), c(streamConfigurationMap, i8, true));
            }
            arrayList.add(Integer.valueOf(i8));
        }
        return this.f15553s;
    }

    public final void j(HashMap hashMap, Size size, int i8) {
        if (this.f15550p) {
            Size c8 = c((StreamConfigurationMap) ((C1160q) this.f15545k.b().f9766V).f13026V, i8, false);
            Integer valueOf = Integer.valueOf(i8);
            if (c8 != null) {
                size = (Size) Collections.min(Arrays.asList(new Size[]{size, c8}), new c(false));
            }
            hashMap.put(valueOf, size);
        }
    }
}
