package de.ozerov.fully;

import B.C0004e;
import B.C0005f;
import D.C0062p;
import D.C0063q;
import D.C0064s;
import D.C0070y;
import D.D;
import D.H0;
import G.c;
import H3.L;
import H3.O;
import H3.i0;
import I2.b;
import M0.C0120h;
import M0.C0129q;
import M0.J;
import P5.E;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.x;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.samsung.android.knox.EnterpriseDeviceManager;
import e1.C0827a;
import f1.C0882A;
import f1.C0884C;
import f1.C0889b;
import f1.C0891d;
import f1.C0892e;
import f1.C0897j;
import f1.l;
import f1.n;
import f1.p;
import f1.z;
import f4.C0901b;
import g4.C0961a;
import h.C1000A;
import h1.C1048n;
import h1.X;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.C1160q;
import l1.r;
import m.C1182a;
import m.C1186e;
import m0.C1197c;
import m4.C1213a;
import m4.C1214b;
import n.C1221B;
import n.m;
import n1.v;
import n2.a;
import p1.G;
import p1.q;
import r0.C1372f;
import r2.C1387f;
import u.C1459T;
import u.C1479t;
import u2.C1490a;
import u2.C1491b;
import u2.d;
import u2.e;
import u2.f;
import u2.g;
import u2.h;
import u2.i;
import u2.j;
import u2.k;
import u2.o;
import u2.s;
import u2.t;
import u2.u;
import v0.C1510H;
import v0.C1514L;
import v0.C1542o;
import v0.C1551x;
import v0.g0;
import v0.j0;
import y2.C1627b;

public class K2 implements r, q, C1542o, C0064s, c {

    /* renamed from: X  reason: collision with root package name */
    public static final /* synthetic */ int f10047X = 0;

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ int f10048Y = 0;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10049U;

    /* renamed from: V  reason: collision with root package name */
    public Object f10050V;

    /* renamed from: W  reason: collision with root package name */
    public Object f10051W;

    public /* synthetic */ K2(int i) {
        this.f10049U = i;
    }

    public static void k(C1387f fVar, C1490a aVar) {
        if (aVar instanceof u2.c) {
            C1491b bVar = ((u2.c) aVar).f15746U;
            int length = bVar.f16371V.length;
            for (int i = 0; i < length; i++) {
                k(fVar, (C1490a) bVar.e(i));
            }
            return;
        }
        fVar.a(aVar);
    }

    public static int p(C1490a aVar) {
        if (aVar instanceof e) {
            return 0;
        }
        if (aVar instanceof s) {
            return 2;
        }
        if (aVar instanceof f) {
            return 3;
        }
        if (aVar instanceof j) {
            return 4;
        }
        if (aVar instanceof o) {
            return 6;
        }
        if (aVar instanceof i) {
            return 16;
        }
        if (aVar instanceof g) {
            return 17;
        }
        if (aVar instanceof t) {
            return 23;
        }
        if (aVar instanceof u) {
            return 24;
        }
        if (aVar instanceof h) {
            return 25;
        }
        if (aVar instanceof u2.q) {
            return 26;
        }
        if (aVar instanceof u2.c) {
            return 28;
        }
        if (aVar instanceof k) {
            return 30;
        }
        if (aVar instanceof d) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    public int A() {
        return ((int[]) this.f10051W).length - 1;
    }

    public p1.o B(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.f10051W)) {
            if (!((AtomicBoolean) this.f10051W).get()) {
                try {
                    constructor = ((l1.j) this.f10050V).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f10051W).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (p1.o) constructor.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    public n2.d C(n2.i iVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10050V;
        n2.d dVar = (n2.d) linkedHashMap.get(iVar);
        if (dVar != null) {
            return dVar;
        }
        n2.d dVar2 = new n2.d(iVar);
        linkedHashMap.put(iVar, dVar2);
        return dVar2;
    }

    public int D(int i) {
        return i - ((C0901b) this.f10050V).f11679h;
    }

    public boolean E() {
        if (((b) this.f10050V) == null) {
            return true;
        }
        return false;
    }

    public boolean F() {
        if (((int[]) this.f10051W)[0] == 0) {
            return true;
        }
        return false;
    }

    public K2 G(int i) {
        C0961a aVar = (C0961a) this.f10050V;
        if (i == 0) {
            return aVar.f12017c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = (int[]) this.f10051W;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr2[i8] = aVar.c(iArr[i8], i);
        }
        return new K2(aVar, iArr2);
    }

    public K2 H(K2 k22) {
        C0961a aVar = (C0961a) this.f10050V;
        if (!aVar.equals((C0961a) k22.f10050V)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (F() || k22.F()) {
            return aVar.f12017c;
        } else {
            int[] iArr = (int[]) this.f10051W;
            int length = iArr.length;
            int[] iArr2 = (int[]) k22.f10051W;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i8 = iArr[i];
                for (int i9 = 0; i9 < length2; i9++) {
                    int i10 = i + i9;
                    iArr3[i10] = aVar.a(iArr3[i10], aVar.c(i8, iArr2[i9]));
                }
            }
            return new K2(aVar, iArr3);
        }
    }

    public void I(K2 k22) {
        boolean z;
        boolean z6;
        boolean z8;
        z zVar = z.f11643c;
        String str = (String) ((C0884C) k22.f10051W).f11478a.get("range");
        f1.k kVar = (f1.k) this.f10051W;
        if (str != null) {
            try {
                zVar = z.a(str);
            } catch (J e) {
                kVar.f11554U.u("SDP format error.", e);
                return;
            }
        }
        Uri uri = kVar.f11561b0;
        L l8 = new L();
        int i = 0;
        while (true) {
            C0884C c8 = (C0884C) k22.f10051W;
            if (i < c8.f11479b.size()) {
                C0889b bVar = (C0889b) c8.f11479b.get(i);
                String F8 = F.h.F(bVar.f11509j.f11499b);
                F8.getClass();
                char c9 = 65535;
                switch (F8.hashCode()) {
                    case -1922091719:
                        if (F8.equals("MPEG4-GENERIC")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 2412:
                        if (F8.equals("L8")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 64593:
                        if (F8.equals("AC3")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 64934:
                        if (F8.equals("AMR")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 74609:
                        if (F8.equals("L16")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case 85182:
                        if (F8.equals("VP8")) {
                            c9 = 5;
                            break;
                        }
                        break;
                    case 85183:
                        if (F8.equals("VP9")) {
                            c9 = 6;
                            break;
                        }
                        break;
                    case 2194728:
                        if (F8.equals("H264")) {
                            c9 = 7;
                            break;
                        }
                        break;
                    case 2194729:
                        if (F8.equals("H265")) {
                            c9 = 8;
                            break;
                        }
                        break;
                    case 2433087:
                        if (F8.equals("OPUS")) {
                            c9 = 9;
                            break;
                        }
                        break;
                    case 2450119:
                        if (F8.equals("PCMA")) {
                            c9 = 10;
                            break;
                        }
                        break;
                    case 2450139:
                        if (F8.equals("PCMU")) {
                            c9 = 11;
                            break;
                        }
                        break;
                    case 1061166827:
                        if (F8.equals("MP4A-LATM")) {
                            c9 = 12;
                            break;
                        }
                        break;
                    case 1934494802:
                        if (F8.equals("AMR-WB")) {
                            c9 = 13;
                            break;
                        }
                        break;
                    case 1959269366:
                        if (F8.equals("MP4V-ES")) {
                            c9 = 14;
                            break;
                        }
                        break;
                    case 2137188397:
                        if (F8.equals("H263-1998")) {
                            c9 = 15;
                            break;
                        }
                        break;
                    case 2137209252:
                        if (F8.equals("H263-2000")) {
                            c9 = 16;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case EnterpriseDeviceManager.KNOX_2_3:
                    case EnterpriseDeviceManager.KNOX_2_4:
                    case EnterpriseDeviceManager.KNOX_2_4_1:
                        z8 = true;
                        break;
                    default:
                        z8 = false;
                        break;
                }
                if (z8) {
                    l8.c(new f1.t((l) k22.f10050V, bVar, uri));
                }
                i++;
            } else {
                i0 g8 = l8.g();
                boolean isEmpty = g8.isEmpty();
                Z1.c cVar = kVar.f11554U;
                if (isEmpty) {
                    cVar.u("No playable track.", (IOException) null);
                    return;
                }
                cVar.getClass();
                int i8 = 0;
                while (true) {
                    int size = g8.size();
                    p pVar = (p) cVar.f6955V;
                    if (i8 < size) {
                        f1.o oVar = new f1.o(pVar, (f1.t) g8.get(i8), i8, pVar.f11592b0);
                        pVar.f11589Y.add(oVar);
                        oVar.b();
                        i8++;
                    } else {
                        Z1.c o2 = pVar.f11591a0;
                        o2.getClass();
                        long j7 = zVar.f11645a;
                        long j8 = zVar.f11646b;
                        long O8 = P0.z.O(j8 - j7);
                        f1.s sVar = (f1.s) o2.f6955V;
                        sVar.f11610l = O8;
                        if (j8 == -9223372036854775807L) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sVar.f11611m = !z;
                        if (j8 == -9223372036854775807L) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        sVar.f11612n = z6;
                        sVar.f11613o = false;
                        sVar.t();
                        kVar.f11569j0 = true;
                        return;
                    }
                }
            }
        }
    }

    public void J(C1182a aVar) {
        B3.q qVar = (B3.q) this.f10050V;
        ((ActionMode.Callback) qVar.f449U).onDestroyActionMode(qVar.F(aVar));
        C1000A a8 = (C1000A) this.f10051W;
        if (a8.f12089q0 != null) {
            a8.f12079f0.getDecorView().removeCallbacks(a8.f12090r0);
        }
        if (a8.p0 != null) {
            C1514L l8 = a8.f12091s0;
            if (l8 != null) {
                l8.b();
            }
            C1514L a9 = C1510H.a(a8.p0);
            a9.a(0.0f);
            a8.f12091s0 = a9;
            a9.d(new h.r(2, this));
        }
        a8.f12088o0 = null;
        ViewGroup viewGroup = a8.f12093u0;
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1551x.c(viewGroup);
        a8.K();
    }

    public void K(Z1.c cVar) {
        f1.k kVar = (f1.k) this.f10051W;
        if (kVar.f11566g0 == null) {
            O o2 = (O) cVar.f6955V;
            if (o2.isEmpty() || o2.contains(2)) {
                kVar.f11560a0.p(kVar.f11561b0, kVar.f11564e0);
                return;
            }
            kVar.f11554U.u("DESCRIBE not supported.", (IOException) null);
        }
    }

    public void L() {
        boolean z;
        f1.k kVar = (f1.k) this.f10051W;
        if (kVar.f11568i0 == 2) {
            z = true;
        } else {
            z = false;
        }
        P0.l.j(z);
        kVar.f11568i0 = 1;
        kVar.f11571l0 = false;
        long j7 = kVar.f11572m0;
        if (j7 != -9223372036854775807L) {
            kVar.r(P0.z.c0(j7));
        }
    }

    public void M(K2 k22) {
        boolean z;
        p pVar;
        C0891d dVar;
        f1.k kVar = (f1.k) this.f10051W;
        int i = kVar.f11568i0;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        P0.l.j(z);
        kVar.f11568i0 = 2;
        if (kVar.f11566g0 == null) {
            long j7 = kVar.f11565f0 / 2;
            C0897j jVar = new C0897j(kVar, j7);
            kVar.f11566g0 = jVar;
            if (!jVar.f11552W) {
                jVar.f11552W = true;
                jVar.f11550U.postDelayed(jVar, j7);
            }
        }
        kVar.f11572m0 = -9223372036854775807L;
        Z1.c cVar = kVar.f11555V;
        long O8 = P0.z.O(((z) k22.f10050V).f11645a);
        O o2 = (O) k22.f10051W;
        cVar.getClass();
        ArrayList arrayList = new ArrayList(o2.size());
        for (int i8 = 0; i8 < o2.size(); i8++) {
            String path = ((C0882A) o2.get(i8)).f11467c.getPath();
            P0.l.h(path);
            arrayList.add(path);
        }
        int i9 = 0;
        while (true) {
            pVar = (p) cVar.f6955V;
            if (i9 >= pVar.f11590Z.size()) {
                break;
            }
            if (!arrayList.contains(((n) pVar.f11590Z.get(i9)).a().getPath())) {
                f1.s sVar = (f1.s) pVar.f11591a0.f6955V;
                sVar.f11611m = false;
                sVar.t();
                if (p.p(pVar)) {
                    pVar.f11601k0 = true;
                    pVar.f11598h0 = -9223372036854775807L;
                    pVar.f11597g0 = -9223372036854775807L;
                    pVar.f11599i0 = -9223372036854775807L;
                }
            }
            i9++;
        }
        for (int i10 = 0; i10 < o2.size(); i10++) {
            C0882A a8 = (C0882A) o2.get(i10);
            Uri uri = a8.f11467c;
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = pVar.f11589Y;
                if (i11 >= arrayList2.size()) {
                    dVar = null;
                    break;
                }
                if (!((f1.o) arrayList2.get(i11)).f11583d) {
                    n nVar = ((f1.o) arrayList2.get(i11)).f11580a;
                    if (nVar.a().equals(uri)) {
                        dVar = nVar.f11577b;
                        break;
                    }
                }
                i11++;
            }
            if (dVar != null) {
                long j8 = a8.f11465a;
                if (j8 != -9223372036854775807L) {
                    C0892e eVar = dVar.f11517b0;
                    eVar.getClass();
                    if (!eVar.f11528h) {
                        dVar.f11517b0.i = j8;
                    }
                } else {
                    dVar.getClass();
                }
                int i12 = a8.f11466b;
                C0892e eVar2 = dVar.f11517b0;
                eVar2.getClass();
                if (!eVar2.f11528h) {
                    dVar.f11517b0.f11529j = i12;
                }
                if (p.p(pVar) && pVar.f11598h0 == pVar.f11597g0) {
                    dVar.f11520e0 = O8;
                    dVar.f11521f0 = j8;
                }
            }
        }
        if (p.p(pVar)) {
            if (pVar.f11598h0 == pVar.f11597g0) {
                pVar.f11598h0 = -9223372036854775807L;
                pVar.f11597g0 = -9223372036854775807L;
                return;
            }
            pVar.f11598h0 = -9223372036854775807L;
            pVar.s(pVar.f11597g0);
        } else if (pVar.f11599i0 != -9223372036854775807L && pVar.p0) {
            pVar.s(pVar.f11599i0);
            pVar.f11599i0 = -9223372036854775807L;
        }
    }

    public boolean N(C1182a aVar, m mVar) {
        ViewGroup viewGroup = ((C1000A) this.f10051W).f12093u0;
        WeakHashMap weakHashMap = C1510H.f15874a;
        C1551x.c(viewGroup);
        B3.q qVar = (B3.q) this.f10050V;
        C1186e F8 = qVar.F(aVar);
        Y.i iVar = (Y.i) qVar.f452X;
        Menu menu = (Menu) iVar.get(mVar);
        if (menu == null) {
            menu = new C1221B((Context) qVar.f450V, mVar);
            iVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) qVar.f449U).onPrepareActionMode(F8, menu);
    }

    public void O(Z1.c cVar) {
        boolean z;
        f1.k kVar = (f1.k) this.f10051W;
        if (kVar.f11568i0 != -1) {
            z = true;
        } else {
            z = false;
        }
        P0.l.j(z);
        kVar.f11568i0 = 1;
        E e = (E) cVar.f6955V;
        kVar.f11564e0 = (String) e.f3810W;
        kVar.f11565f0 = e.f3809V;
        kVar.o();
    }

    public void P(C1372f fVar) {
        int i = fVar.f14804b;
        F.g gVar = (F.g) this.f10051W;
        C1160q qVar = (C1160q) this.f10050V;
        if (i == 0) {
            gVar.execute(new G.h(qVar, 7, fVar.f14803a));
        } else {
            gVar.execute(new androidx.emoji2.text.h(i, 2, (Object) qVar));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d3, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            r12 = this;
            f0.l r0 = new f0.l
            r0.<init>()
            int r1 = r14.getAttributeCount()
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x01ec
            java.lang.String r4 = r14.getAttributeName(r3)
            java.lang.String r5 = "id"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01e8
            java.lang.String r1 = r14.getAttributeValue(r3)
            java.lang.String r3 = "/"
            boolean r3 = r1.contains(r3)
            r4 = 1
            r6 = -1
            if (r3 == 0) goto L_0x003f
            r3 = 47
            int r3 = r1.indexOf(r3)
            int r3 = r3 + r4
            java.lang.String r3 = r1.substring(r3)
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = r13.getPackageName()
            int r3 = r7.getIdentifier(r3, r5, r8)
            goto L_0x0040
        L_0x003f:
            r3 = -1
        L_0x0040:
            if (r3 != r6) goto L_0x0058
            int r5 = r1.length()
            if (r5 <= r4) goto L_0x0051
            java.lang.String r1 = r1.substring(r4)
            int r3 = java.lang.Integer.parseInt(r1)
            goto L_0x0058
        L_0x0051:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r5 = "error in parsing id"
            android.util.Log.e(r1, r5)
        L_0x0058:
            int r1 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r5 = 0
            r7 = r5
        L_0x005e:
            if (r1 == r4) goto L_0x01e0
            if (r1 == 0) goto L_0x01d0
            java.lang.String r8 = "Constraint"
            r9 = 3
            r10 = 2
            if (r1 == r10) goto L_0x0094
            if (r1 == r9) goto L_0x006c
            goto L_0x01d3
        L_0x006c:
            java.lang.String r1 = r14.getName()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r9 = "ConstraintSet"
            boolean r9 = r9.equals(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r9 == 0) goto L_0x007a
            goto L_0x01e0
        L_0x007a:
            boolean r1 = r1.equalsIgnoreCase(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x01d3
            java.util.HashMap r1 = r0.f11455c     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r8 = r7.f11369a     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r7 = r5
            goto L_0x01d3
        L_0x008e:
            r13 = move-exception
            goto L_0x01d9
        L_0x0091:
            r13 = move-exception
            goto L_0x01dd
        L_0x0094:
            java.lang.String r1 = r14.getName()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r11 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            switch(r11) {
                case -2025855158: goto L_0x00e3;
                case -1984451626: goto L_0x00d9;
                case -1269513683: goto L_0x00d0;
                case -1238332596: goto L_0x00c6;
                case -71750448: goto L_0x00bc;
                case 1331510167: goto L_0x00b2;
                case 1791837707: goto L_0x00a8;
                case 1803088381: goto L_0x00a0;
                default: goto L_0x009f;
            }     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x009f:
            goto L_0x00ed
        L_0x00a0:
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 0
            goto L_0x00ee
        L_0x00a8:
            java.lang.String r8 = "CustomAttribute"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 7
            goto L_0x00ee
        L_0x00b2:
            java.lang.String r8 = "Barrier"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 2
            goto L_0x00ee
        L_0x00bc:
            java.lang.String r8 = "Guideline"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 1
            goto L_0x00ee
        L_0x00c6:
            java.lang.String r8 = "Transform"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 4
            goto L_0x00ee
        L_0x00d0:
            java.lang.String r8 = "PropertySet"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00d9:
            java.lang.String r8 = "Motion"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 6
            goto L_0x00ee
        L_0x00e3:
            java.lang.String r8 = "Layout"
            boolean r1 = r1.equals(r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            if (r1 == 0) goto L_0x00ed
            r9 = 5
            goto L_0x00ee
        L_0x00ed:
            r9 = -1
        L_0x00ee:
            java.lang.String r1 = "XML parser error must be within a Constraint "
            switch(r9) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01ad;
                case 3: goto L_0x0188;
                case 4: goto L_0x0163;
                case 5: goto L_0x013d;
                case 6: goto L_0x0117;
                case 7: goto L_0x00f5;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x01d3
        L_0x00f5:
            if (r7 == 0) goto L_0x00fe
            java.util.HashMap r1 = r7.f11373f     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            f0.C0874b.a(r13, r14, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x00fe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x0117:
            if (r7 == 0) goto L_0x0124
            f0.i r1 = r7.f11371c     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x0124:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x013d:
            if (r7 == 0) goto L_0x014a
            f0.h r1 = r7.f11372d     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x014a:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x0163:
            if (r7 == 0) goto L_0x016f
            f0.k r1 = r7.e     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x016f:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x0188:
            if (r7 == 0) goto L_0x0194
            f0.j r1 = r7.f11370b     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.a(r13, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x0194:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            int r14 = r14.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r2.append(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            java.lang.String r14 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r13.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            throw r13     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x01ad:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            f0.g r7 = f0.l.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            f0.h r1 = r7.f11372d     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.f11406c0 = r4     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x01ba:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            f0.g r7 = f0.l.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            f0.h r1 = r7.f11372d     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            r1.f11401a = r4     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x01c7:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            f0.g r7 = f0.l.d(r13, r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x01d3
        L_0x01d0:
            r14.getName()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
        L_0x01d3:
            int r1 = r14.next()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x008e }
            goto L_0x005e
        L_0x01d9:
            r13.printStackTrace()
            goto L_0x01e0
        L_0x01dd:
            r13.printStackTrace()
        L_0x01e0:
            java.lang.Object r13 = r12.f10051W
            android.util.SparseArray r13 = (android.util.SparseArray) r13
            r13.put(r3, r0)
            goto L_0x01ec
        L_0x01e8:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.K2.Q(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void R(b bVar) {
        b bVar2 = (b) bVar.f2257U;
        b bVar3 = (b) bVar.f2258V;
        if (bVar2 == null) {
            this.f10050V = bVar3;
        } else {
            bVar2.f2258V = bVar3;
        }
        if (bVar3 == null) {
            this.f10051W = bVar2;
        } else {
            bVar3.f2257U = bVar2;
        }
    }

    public float S(int i, int i8, int i9, int i10) {
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z6;
        K2 k22;
        boolean z8;
        int i19 = 1;
        if (Math.abs(i10 - i8) > Math.abs(i9 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i13 = i;
            i14 = i8;
            i11 = i9;
            i12 = i10;
        } else {
            i14 = i;
            i13 = i8;
            i12 = i9;
            i11 = i10;
        }
        int abs = Math.abs(i12 - i14);
        int abs2 = Math.abs(i11 - i13);
        int i20 = (-abs) / 2;
        int i21 = -1;
        if (i14 < i12) {
            i15 = 1;
        } else {
            i15 = -1;
        }
        if (i13 < i11) {
            i21 = 1;
        }
        int i22 = i12 + i15;
        int i23 = i14;
        int i24 = i13;
        int i25 = 0;
        while (true) {
            if (i23 == i22) {
                i16 = i22;
                break;
            }
            if (z) {
                i17 = i24;
            } else {
                i17 = i23;
            }
            if (z) {
                i18 = i23;
            } else {
                i18 = i24;
            }
            if (i25 == i19) {
                k22 = this;
                z6 = z;
                i16 = i22;
                z8 = true;
            } else {
                k22 = this;
                z6 = z;
                i16 = i22;
                z8 = false;
            }
            if (z8 == ((S3.b) k22.f10050V).b(i17, i18)) {
                if (i25 == 2) {
                    return a.z(i23, i24, i14, i13);
                }
                i25++;
            }
            i20 += abs2;
            if (i20 > 0) {
                if (i24 == i11) {
                    break;
                }
                i24 += i21;
                i20 -= abs;
            }
            i23 += i15;
            i22 = i16;
            z = z6;
            i19 = 1;
        }
        if (i25 == 2) {
            return a.z(i16, i11, i14, i13);
        }
        return Float.NaN;
    }

    public float T(int i, int i8, int i9, int i10) {
        float f8;
        float f9;
        float S8 = S(i, i8, i9, i10);
        int i11 = i - (i9 - i);
        S3.b bVar = (S3.b) this.f10050V;
        int i12 = 0;
        if (i11 < 0) {
            f8 = ((float) i) / ((float) (i - i11));
            i11 = 0;
        } else {
            int i13 = bVar.f4505U;
            if (i11 >= i13) {
                int i14 = i13 - 1;
                f8 = ((float) ((i13 - 1) - i)) / ((float) (i11 - i));
                i11 = i14;
            } else {
                f8 = 1.0f;
            }
        }
        float f10 = (float) i8;
        int i15 = (int) (f10 - (((float) (i10 - i8)) * f8));
        if (i15 < 0) {
            f9 = f10 / ((float) (i8 - i15));
        } else {
            int i16 = bVar.f4506V;
            if (i15 >= i16) {
                f9 = ((float) ((i16 - 1) - i8)) / ((float) (i15 - i8));
                i12 = i16 - 1;
            } else {
                i12 = i15;
                f9 = 1.0f;
            }
        }
        return (S(i, i8, (int) ((((float) (i11 - i)) * f9) + ((float) i)), i12) + S8) - 1.0f;
    }

    public void U() {
        PowerManager powerManager = (PowerManager) ((FullyActivity) this.f10050V).getSystemService("power");
        if (powerManager.isWakeLockLevelSupported(32)) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(32, "fully-single-app:ProximityWakelock");
            this.f10051W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            ((PowerManager.WakeLock) this.f10051W).acquire();
            return;
        }
        Log.w("K2", "Proximity wakelock not supported by device");
    }

    public K2 V(K2 k22) {
        if (!((C0961a) this.f10050V).equals((C0961a) k22.f10050V)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (k22.F()) {
            return this;
        } else {
            int[] iArr = (int[]) k22.f10051W;
            int length = iArr.length;
            int[] iArr2 = new int[length];
            int i = 0;
            while (true) {
                C0961a aVar = (C0961a) k22.f10050V;
                if (i >= length) {
                    return j(new K2(aVar, iArr2));
                }
                int i8 = iArr[i];
                aVar.getClass();
                iArr2[i] = (929 - i8) % 929;
                i++;
            }
        }
    }

    public G W(int i) {
        int i8 = 0;
        while (true) {
            int[] iArr = (int[]) this.f10050V;
            if (i8 >= iArr.length) {
                P0.l.o("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new p1.n();
            } else if (i == iArr[i8]) {
                return ((X[]) this.f10051W)[i8];
            } else {
                i8++;
            }
        }
    }

    public void X(C0070y yVar, C0005f fVar) {
        C0004e eVar;
        switch (yVar.ordinal()) {
            case 0:
            case 2:
                eVar = new C0004e(5, fVar);
                break;
            case 1:
            case 4:
                eVar = new C0004e(4, fVar);
                break;
            case 3:
                D.E e = (D.E) this.f10050V;
                synchronized (e.f759b) {
                    Iterator it = e.e.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((D) ((Map.Entry) it.next()).getValue()).f754a == C0070y.f969Z) {
                                eVar = new C0004e(2, (C0005f) null);
                                break;
                            }
                        } else {
                            eVar = new C0004e(1, (C0005f) null);
                            break;
                        }
                    }
                }
            case 5:
                eVar = new C0004e(2, fVar);
                break;
            case 6:
            case 7:
                eVar = new C0004e(3, fVar);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + yVar);
        }
        F.h.j("CameraStateMachine", "New public camera state " + eVar + " from " + yVar + " and " + fVar);
        if (!Objects.equals((C0004e) ((androidx.lifecycle.z) this.f10051W).d(), eVar)) {
            F.h.j("CameraStateMachine", "Publishing new public camera state " + eVar);
            ((androidx.lifecycle.z) this.f10051W).k(eVar);
        }
    }

    public void Y(u2.c cVar, boolean z) {
        boolean z6;
        String str;
        C1627b bVar = (C1627b) this.f10051W;
        if (!z || !bVar.d()) {
            z6 = false;
        } else {
            z6 = true;
        }
        C1491b bVar2 = cVar.f15746U;
        int length = bVar2.f16371V.length;
        if (z6) {
            bVar.c("  size: ".concat(android.support.v4.media.session.b.Q(length)));
        }
        bVar.m(length);
        for (int i = 0; i < length; i++) {
            C1490a aVar = (C1490a) bVar2.e(i);
            if (z6) {
                StringBuilder sb = new StringBuilder("  [");
                sb.append(Integer.toHexString(i));
                sb.append("] ");
                if (p(aVar) == 30) {
                    str = "null";
                } else {
                    str = aVar.e() + ' ' + aVar.a();
                }
                sb.append(str);
                bVar.c(sb.toString());
            }
            int p3 = p(aVar);
            if (!(p3 == 0 || p3 == 6 || p3 == 2)) {
                if (p3 == 3) {
                    R.e.y(bVar, p3, ((u2.n) aVar).h());
                } else if (p3 != 4) {
                    if (p3 == 16) {
                        R.e.x(bVar, p3, ((long) ((i) aVar).f15756U) << 32);
                    } else if (p3 != 17) {
                        C1387f fVar = (C1387f) this.f10050V;
                        switch (p3) {
                            case 21:
                                r2.z zVar = fVar.f14888g;
                                throw new ClassCastException();
                            case 22:
                                fVar.getClass();
                                throw new ClassCastException();
                            case 23:
                                R.e.y(bVar, p3, (long) fVar.e.l((t) aVar));
                                break;
                            case 24:
                                R.e.y(bVar, p3, (long) fVar.f14887f.m((u) aVar));
                                break;
                            case 25:
                                R.e.y(bVar, p3, (long) fVar.f14889h.l((h) aVar));
                                break;
                            case 26:
                                R.e.y(bVar, p3, (long) fVar.i.l((u2.q) aVar));
                                break;
                            case 27:
                                throw new ClassCastException();
                            case 28:
                                bVar.i(p3);
                                Y((u2.c) aVar, false);
                                break;
                            case 29:
                                bVar.i(p3);
                                throw new ClassCastException();
                            case 30:
                                bVar.i(p3);
                                break;
                            case 31:
                                bVar.i((((d) aVar).f15756U << 5) | p3);
                                break;
                            default:
                                throw new RuntimeException("Shouldn't happen");
                        }
                    } else {
                        R.e.x(bVar, p3, ((g) aVar).f15757U);
                    }
                }
            }
            long h5 = ((u2.n) aVar).h();
            int numberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((h5 >> 63) ^ h5)) >> 3;
            bVar.i(p3 | ((numberOfLeadingZeros - 1) << 5));
            while (numberOfLeadingZeros > 0) {
                bVar.i((byte) ((int) h5));
                h5 >>= 8;
                numberOfLeadingZeros--;
            }
        }
        if (z6) {
            bVar.e();
        }
    }

    public H0 a() {
        return (H0) this.f10050V;
    }

    public long b() {
        Long l8 = (Long) ((CaptureResult) this.f10051W).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l8 == null) {
            return -1;
        }
        return l8.longValue();
    }

    public C0062p c() {
        Integer num = (Integer) ((CaptureResult) this.f10051W).get(CaptureResult.CONTROL_AE_STATE);
        C0062p pVar = C0062p.f922U;
        if (num == null) {
            return pVar;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return C0062p.f923V;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return C0062p.f926Y;
            }
            if (intValue == 3) {
                return C0062p.f927Z;
            }
            if (intValue == 4) {
                return C0062p.f925X;
            }
            if (intValue != 5) {
                F.h.l("C2CameraCaptureResult", "Undefined ae state: " + num);
                return pVar;
            }
        }
        return C0062p.f924W;
    }

    public D.r d() {
        Integer num = (Integer) ((CaptureResult) this.f10051W).get(CaptureResult.CONTROL_AWB_STATE);
        D.r rVar = D.r.f943U;
        if (num == null) {
            return rVar;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return D.r.f944V;
        }
        if (intValue == 1) {
            return D.r.f945W;
        }
        if (intValue == 2) {
            return D.r.f946X;
        }
        if (intValue == 3) {
            return D.r.f947Y;
        }
        F.h.l("C2CameraCaptureResult", "Undefined awb state: " + num);
        return rVar;
    }

    public CaptureResult e() {
        return (CaptureResult) this.f10051W;
    }

    public void f(Object obj) {
        Void voidR = (Void) obj;
        ((Surface) this.f10050V).release();
        ((SurfaceTexture) this.f10051W).release();
    }

    public void g() {
        p pVar = (p) this.f10051W;
        pVar.f11586V.post(new f1.m(pVar, 0));
    }

    public C0063q h() {
        Integer num = (Integer) ((CaptureResult) this.f10051W).get(CaptureResult.CONTROL_AF_STATE);
        C0063q qVar = C0063q.f932U;
        if (num == null) {
            return qVar;
        }
        switch (num.intValue()) {
            case 0:
                return C0063q.f933V;
            case 1:
            case 3:
                return C0063q.f934W;
            case 2:
                return C0063q.f935X;
            case 4:
                return C0063q.f937Z;
            case 5:
                return C0063q.f938a0;
            case 6:
                return C0063q.f936Y;
            default:
                F.h.l("C2CameraCaptureResult", "Undefined af state: " + num);
                return qVar;
        }
    }

    public j0 i(View view, j0 j0Var) {
        boolean z;
        int i;
        int i8;
        View view2 = view;
        j0 j0Var2 = j0Var;
        F2.h hVar = (F2.h) this.f10051W;
        int i9 = hVar.f1527a;
        D2.G g8 = (D2.G) this.f10050V;
        g0 g0Var = j0Var2.f15952a;
        C1197c f8 = g0Var.f(7);
        C1197c f9 = g0Var.f(32);
        int i10 = f8.f13317b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) g8.f1052V;
        bottomSheetBehavior.f9213w = i10;
        boolean e = t3.k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z6 = bottomSheetBehavior.f9205o;
        if (z6) {
            int a8 = j0Var.a();
            bottomSheetBehavior.f9212v = a8;
            paddingBottom = a8 + hVar.f1529c;
        }
        int i11 = hVar.f1528b;
        boolean z8 = bottomSheetBehavior.f9206p;
        int i12 = f8.f13316a;
        if (z8) {
            if (e) {
                i8 = i11;
            } else {
                i8 = i9;
            }
            paddingLeft = i8 + i12;
        }
        boolean z9 = bottomSheetBehavior.f9207q;
        int i13 = f8.f13318c;
        if (z9) {
            if (!e) {
                i9 = i11;
            }
            paddingRight = i9 + i13;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z10 = true;
        if (!bottomSheetBehavior.f9209s || marginLayoutParams.leftMargin == i12) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i12;
            z = true;
        }
        if (bottomSheetBehavior.f9210t && marginLayoutParams.rightMargin != i13) {
            marginLayoutParams.rightMargin = i13;
            z = true;
        }
        if (!bottomSheetBehavior.f9211u || marginLayoutParams.topMargin == (i = f8.f13317b)) {
            z10 = z;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z10) {
            view2.setLayoutParams(marginLayoutParams);
        }
        view2.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z11 = g8.f1051U;
        if (z11) {
            bottomSheetBehavior.f9203m = f9.f13319d;
        }
        if (z6 || z11) {
            bottomSheetBehavior.I();
        }
        return j0Var2;
    }

    public K2 j(K2 k22) {
        C0961a aVar = (C0961a) this.f10050V;
        if (!aVar.equals((C0961a) k22.f10050V)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (F()) {
            return k22;
        } else {
            if (k22.F()) {
                return this;
            }
            int[] iArr = (int[]) this.f10051W;
            int length = iArr.length;
            int[] iArr2 = (int[]) k22.f10051W;
            if (length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length2 = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length2);
            for (int i = length2; i < iArr.length; i++) {
                iArr4[i] = aVar.a(iArr2[i - length2], iArr[i]);
            }
            return new K2(aVar, iArr4);
        }
    }

    public void l(p1.z zVar) {
    }

    public float m(k4.c cVar, k4.c cVar2) {
        int i = (int) cVar.f3165b;
        int i8 = (int) cVar2.f3165b;
        float T8 = T((int) cVar.f3164a, i, (int) cVar2.f3164a, i8);
        float T9 = T((int) cVar2.f3164a, i8, (int) cVar.f3164a, i);
        if (Float.isNaN(T8)) {
            return T9 / 7.0f;
        }
        if (Float.isNaN(T9)) {
            return T8 / 7.0f;
        }
        return (T8 + T9) / 14.0f;
    }

    public Object n(Uri uri, R0.j jVar) {
        C0827a aVar = (C0827a) ((r) this.f10050V).n(uri, jVar);
        List list = (List) this.f10051W;
        if (list == null || list.isEmpty()) {
            return aVar;
        }
        return (C0827a) aVar.a(list);
    }

    public void o() {
        d4.k kVar = (d4.k) this.f10050V;
        if (kVar != null) {
            ((AtomicBoolean) kVar.f9767W).set(true);
            ((ScheduledFuture) kVar.f9766V).cancel(true);
        }
        this.f10050V = null;
    }

    public G q(int i, int i8) {
        return (X) this.f10050V;
    }

    public G5.m r(n2.h hVar) {
        int i;
        LinkedHashMap linkedHashMap = C(hVar.f13739a).i;
        if (!linkedHashMap.containsKey(hVar)) {
            String str = hVar.f13741c;
            if (str.equals("<init>") || str.equals("<clinit>")) {
                i = 65537;
            } else {
                i = 1;
            }
            n2.c cVar = new n2.c(hVar, i);
            linkedHashMap.put(hVar, cVar);
            return cVar.f13718c;
        }
        throw new IllegalStateException("already declared: " + hVar);
    }

    public void s(n2.e eVar, int i) {
        LinkedHashMap linkedHashMap = C(eVar.f13726a).f13725h;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new n2.b(eVar, i));
            return;
        }
        throw new IllegalStateException("already declared: " + eVar);
    }

    public int t(int i) {
        if (i == 0) {
            return y(0);
        }
        C0961a aVar = (C0961a) this.f10050V;
        int[] iArr = (int[]) this.f10051W;
        if (i == 1) {
            int i8 = 0;
            for (int a8 : iArr) {
                i8 = aVar.a(i8, a8);
            }
            return i8;
        }
        int i9 = iArr[0];
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            i9 = aVar.a(aVar.c(i, i9), iArr[i10]);
        }
        return i9;
    }

    public String toString() {
        switch (this.f10049U) {
            case 10:
                Formatter formatter = new Formatter();
                try {
                    int i = 0;
                    for (C0120h hVar : (C0120h[]) this.f10051W) {
                        if (hVar == null) {
                            formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                            i++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(hVar.f2951f), Integer.valueOf(hVar.e)});
                            i++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        formatter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 11:
                StringBuilder sb = new StringBuilder(A() * 8);
                for (int A8 = A(); A8 >= 0; A8--) {
                    int y8 = y(A8);
                    if (y8 != 0) {
                        if (y8 < 0) {
                            sb.append(" - ");
                            y8 = -y8;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (A8 == 0 || y8 != 1) {
                            sb.append(y8);
                        }
                        if (A8 != 0) {
                            if (A8 == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(A8);
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public k4.a u(float f8, int i, int i8, float f9) {
        int i9;
        S3.b bVar;
        k4.a b8;
        k4.a b9;
        int i10 = (int) (f9 * f8);
        int max = Math.max(0, i - i10);
        S3.b bVar2 = (S3.b) this.f10050V;
        int min = Math.min(bVar2.f4505U - 1, i + i10) - max;
        float f10 = 3.0f * f8;
        if (((float) min) >= f10) {
            int max2 = Math.max(0, i8 - i10);
            int min2 = Math.min(bVar2.f4506V - 1, i8 + i10) - max2;
            if (((float) min2) >= f10) {
                k4.b bVar3 = new k4.b((S3.b) this.f10050V, max, max2, min, min2, f8, (M3.o) this.f10051W);
                int i11 = bVar3.e;
                int i12 = bVar3.f13035c;
                int i13 = i11 + i12;
                int i14 = bVar3.f13037f;
                int i15 = (i14 / 2) + bVar3.f13036d;
                int[] iArr = new int[3];
                for (int i16 = 0; i16 < i14; i16++) {
                    if ((i16 & 1) == 0) {
                        i9 = (i16 + 1) / 2;
                    } else {
                        i9 = -((i16 + 1) / 2);
                    }
                    int i17 = i9 + i15;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i18 = i12;
                    while (true) {
                        bVar = bVar3.f13033a;
                        if (i18 >= i13 || bVar.b(i18, i17)) {
                            int i19 = 0;
                        } else {
                            i18++;
                        }
                    }
                    int i192 = 0;
                    while (i18 < i13) {
                        if (!bVar.b(i18, i17)) {
                            if (i192 == 1) {
                                i192++;
                            }
                            iArr[i192] = iArr[i192] + 1;
                        } else if (i192 == 1) {
                            iArr[1] = iArr[1] + 1;
                        } else if (i192 != 2) {
                            i192++;
                            iArr[i192] = iArr[i192] + 1;
                        } else if (bVar3.a(iArr) && (b9 = bVar3.b(i17, i18, iArr)) != null) {
                            return b9;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i192 = 1;
                        }
                        i18++;
                    }
                    if (bVar3.a(iArr) && (b8 = bVar3.b(i17, i13, iArr)) != null) {
                        return b8;
                    }
                }
                ArrayList arrayList = bVar3.f13034b;
                if (!arrayList.isEmpty()) {
                    return (k4.a) arrayList.get(0);
                }
                throw M3.h.f3144W;
            }
            throw M3.h.f3144W;
        }
        throw M3.h.f3144W;
    }

    /* JADX WARNING: type inference failed for: r1v38, types: [java.lang.Object, B3.q] */
    /* JADX WARNING: type inference failed for: r7v15, types: [t2.g, y2.f, y2.c] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.ClassLoader v(java.lang.ClassLoader r37, java.io.File r38) {
        /*
            r36 = this;
            r1 = r36
            r0 = r37
            r2 = 10
            r3 = 1
            r5 = 0
            if (r38 != 0) goto L_0x0043
            java.lang.String r6 = "dexmaker.dexcache"
            java.lang.String r6 = java.lang.System.getProperty(r6)
            if (r6 == 0) goto L_0x0019
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            r6 = r7
            goto L_0x0045
        L_0x0019:
            java.lang.Class<n2.a> r6 = n2.a.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            java.lang.String r7 = "dalvik.system.PathClassLoader"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            r7.cast(r6)     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            java.lang.String r6 = n2.a.T(r6, r7)     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            java.io.File[] r6 = n2.a.f0(r6)     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            int r7 = r6.length     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            if (r7 <= 0) goto L_0x0037
            r6 = r6[r5]     // Catch:{ ClassCastException | ClassNotFoundException -> 0x0036 }
            goto L_0x0038
        L_0x0036:
        L_0x0037:
            r6 = 0
        L_0x0038:
            if (r6 == 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            r6 = r38
        L_0x0045:
            java.io.File r7 = new java.io.File
            java.lang.Object r8 = r1.f10050V
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.util.Set r9 = r8.keySet()
            java.util.Iterator r10 = r9.iterator()
            int r9 = r9.size()
            int[] r11 = new int[r9]
            r12 = 0
        L_0x005a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0092
            java.lang.Object r13 = r10.next()
            n2.i r13 = (n2.i) r13
            n2.d r13 = r1.C(r13)
            java.util.LinkedHashMap r14 = r13.i
            java.util.Set r14 = r14.keySet()
            n2.i r15 = r13.f13722d
            if (r15 == 0) goto L_0x005a
            java.lang.String r15 = r15.f13753a
            int r15 = r15.hashCode()
            int r15 = r15 * 31
            n2.j r13 = r13.f13723f
            n2.i[] r13 = r13.f13756a
            int r13 = java.util.Arrays.hashCode(r13)
            int r13 = r13 + r15
            int r15 = r12 + 1
            int r13 = r13 * 31
            int r14 = r14.hashCode()
            int r14 = r14 + r13
            r11[r12] = r14
            r12 = r15
            goto L_0x005a
        L_0x0092:
            java.util.Arrays.sort(r11)
            r10 = 0
            r12 = 1
        L_0x0097:
            if (r10 >= r9) goto L_0x00a0
            r13 = r11[r10]
            int r12 = r12 * 31
            int r12 = r12 + r13
            int r10 = r10 + r3
            goto L_0x0097
        L_0x00a0:
            java.lang.String r9 = "Generated_"
            java.lang.String r10 = ".jar"
            java.lang.String r9 = u.C1477r.c(r12, r9, r10)
            r7.<init>(r6, r9)
            boolean r9 = r7.exists()
            if (r9 == 0) goto L_0x00bf
            boolean r9 = r7.canWrite()
            if (r9 != 0) goto L_0x00bc
            java.lang.ClassLoader r0 = r1.w(r7, r6, r0)
            return r0
        L_0x00bc:
            r7.delete()
        L_0x00bf:
            java.lang.Object r9 = r1.f10051W
            r2.f r9 = (r2.C1387f) r9
            if (r9 != 0) goto L_0x00d1
            h1.n r9 = new h1.n
            r9.<init>(r2)
            r2.f r10 = new r2.f
            r10.<init>(r9)
            r1.f10051W = r10
        L_0x00d1:
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x00d9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x073d
            java.lang.Object r9 = r8.next()
            n2.d r9 = (n2.d) r9
            java.lang.Object r10 = r1.f10051W
            r2.f r10 = (r2.C1387f) r10
            boolean r11 = r9.f13720b
            java.util.LinkedHashMap r12 = r9.i
            java.util.LinkedHashMap r13 = r9.f13725h
            n2.i r14 = r9.f13719a
            if (r11 == 0) goto L_0x070f
            h1.n r11 = new h1.n
            r11.<init>(r2)
            u2.u r14 = r14.f13755c
            r2.c r15 = r9.f13724g
            if (r15 != 0) goto L_0x06bd
            r2.c r15 = new r2.c
            int r4 = r9.f13721c
            n2.i r2 = r9.f13722d
            u2.u r2 = r2.f13755c
            n2.j r5 = r9.f13723f
            v2.b r5 = r5.f13757b
            u2.t r3 = new u2.t
            r38 = r8
            java.lang.String r8 = r9.e
            r3.<init>(r8)
            r8 = r15
            r16 = r14
            r17 = r4
            r18 = r2
            r19 = r5
            r20 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r9.f13724g = r8
            java.util.Collection r2 = r12.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x012b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0668
            java.lang.Object r3 = r2.next()
            n2.c r3 = (n2.c) r3
            int r4 = r3.f13717b
            r5 = r4 & 1024(0x400, float:1.435E-42)
            n2.h r8 = r3.f13716a
            u2.q r8 = r8.e
            if (r5 != 0) goto L_0x0145
            r5 = r4 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x015b
        L_0x0145:
            r16 = r2
            r26 = r3
            r3 = r4
            r17 = r6
            r20 = r7
            r4 = r8
            r25 = r9
            r23 = r10
            r22 = r11
            r24 = r13
            r5 = 1
            r13 = 0
            goto L_0x062d
        L_0x015b:
            d4.k r5 = new d4.k
            G5.m r12 = r3.f13718c
            boolean r14 = r12.f1712b
            if (r14 != 0) goto L_0x0166
            r12.f()
        L_0x0166:
            java.lang.Object r14 = r12.f1714d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.util.Iterator r15 = r14.iterator()
            r16 = r2
            r2 = 0
        L_0x0171:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x01ff
            java.lang.Object r17 = r15.next()
            r0 = r17
            n2.f r0 = (n2.f) r0
            r17 = r6
            java.util.ArrayList r6 = r0.f13729a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0191
            r15.remove()
            r20 = r7
            r18 = r15
            goto L_0x01f5
        L_0x0191:
            r18 = r15
            r6 = 0
        L_0x0194:
            java.util.List r15 = r0.f13732d
            int r15 = r15.size()
            if (r6 >= r15) goto L_0x01c7
        L_0x019c:
            java.util.List r15 = r0.f13732d
            java.lang.Object r15 = r15.get(r6)
            n2.f r15 = (n2.f) r15
            java.util.ArrayList r15 = r15.f13729a
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x01c0
            java.util.List r15 = r0.f13732d
            java.lang.Object r19 = r15.get(r6)
            r20 = r7
            r7 = r19
            n2.f r7 = (n2.f) r7
            n2.f r7 = r7.e
            r15.set(r6, r7)
            r7 = r20
            goto L_0x019c
        L_0x01c0:
            r20 = r7
            r7 = 1
            int r6 = r6 + r7
            r7 = r20
            goto L_0x0194
        L_0x01c7:
            r20 = r7
        L_0x01c9:
            n2.f r6 = r0.e
            if (r6 == 0) goto L_0x01dc
            java.util.ArrayList r6 = r6.f13729a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x01dc
            n2.f r6 = r0.e
            n2.f r6 = r6.e
            r0.e = r6
            goto L_0x01c9
        L_0x01dc:
            n2.f r6 = r0.f13733f
            if (r6 == 0) goto L_0x01ef
            java.util.ArrayList r6 = r6.f13729a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x01ef
            n2.f r6 = r0.f13733f
            n2.f r6 = r6.e
            r0.f13733f = r6
            goto L_0x01dc
        L_0x01ef:
            r6 = 1
            int r7 = r2 + 1
            r0.f13734g = r2
            r2 = r7
        L_0x01f5:
            r0 = r37
            r6 = r17
            r15 = r18
            r7 = r20
            goto L_0x0171
        L_0x01ff:
            r17 = r6
            r20 = r7
            t2.b r0 = new t2.b
            int r2 = r14.size()
            r0.<init>(r2)
            r2 = 0
        L_0x020d:
            int r6 = r14.size()
            if (r2 >= r6) goto L_0x02b3
            java.lang.Object r6 = r14.get(r2)
            n2.f r6 = (n2.f) r6
            t2.g r7 = new t2.g
            java.util.ArrayList r15 = r6.f13729a
            r22 = r14
            int r14 = r15.size()
            r7.<init>(r14)
            r14 = 0
        L_0x0227:
            int r1 = r15.size()
            if (r14 >= r1) goto L_0x0239
            java.lang.Object r1 = r15.get(r14)
            t2.f r1 = (t2.C1424f) r1
            r7.f(r14, r1)
            r1 = 1
            int r14 = r14 + r1
            goto L_0x0227
        L_0x0239:
            r1 = 0
            r7.f16382U = r1
            y2.e r1 = new y2.e
            r14 = 4
            r1.<init>(r14)
            java.util.List r14 = r6.f13732d
            java.util.Iterator r14 = r14.iterator()
        L_0x0248:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x025a
            java.lang.Object r15 = r14.next()
            n2.f r15 = (n2.f) r15
            int r15 = r15.f13734g
            r1.e(r15)
            goto L_0x0248
        L_0x025a:
            n2.f r14 = r6.e
            if (r14 == 0) goto L_0x0264
            int r14 = r14.f13734g
            r1.e(r14)
            goto L_0x0265
        L_0x0264:
            r14 = -1
        L_0x0265:
            n2.f r15 = r6.f13733f
            if (r15 == 0) goto L_0x026e
            int r15 = r15.f13734g
            r1.e(r15)
        L_0x026e:
            r15 = 0
            r1.f16382U = r15
            t2.a r15 = new t2.a
            int r6 = r6.f13734g
            r15.<init>(r6, r7, r1, r14)
            java.lang.Object[] r1 = r0.f16371V
            r1 = r1[r2]
            t2.a r1 = (t2.C1419a) r1
            r0.f(r2, r15)
            y2.e r6 = r0.f15186W
            if (r1 == 0) goto L_0x028c
            int r1 = r1.f15182a
            r7 = -1
            r6.g(r1, r7)
            goto L_0x028d
        L_0x028c:
            r7 = -1
        L_0x028d:
            int r1 = r6.f16380W
            r14 = 0
        L_0x0290:
            int r7 = r15.f15182a
            r19 = r15
            int r15 = r7 - r1
            if (r14 > r15) goto L_0x02a3
            r15 = -1
            r6.e(r15)
            r18 = 1
            int r14 = r14 + 1
            r15 = r19
            goto L_0x0290
        L_0x02a3:
            r15 = -1
            r18 = 1
            r6.g(r7, r2)
            r0.f15187X = r15
            int r2 = r2 + 1
            r1 = r36
            r14 = r22
            goto L_0x020d
        L_0x02b3:
            r5.<init>((t2.C1420b) r0)
            java.lang.Object r0 = r12.f1715f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x02bf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02d5
            java.lang.Object r2 = r0.next()
            n2.g r2 = (n2.g) r2
            n2.i r2 = r2.f13736b
            v2.c r2 = r2.f13754b
            int r2 = r2.d()
            int r1 = r1 + r2
            goto L_0x02bf
        L_0x02d5:
            p2.s r0 = new p2.s
            r0.<init>(r5, r1, r11)
            java.lang.Object r1 = r5.f9766V
            t2.b r1 = (t2.C1420b) r1
            java.lang.Object[] r2 = r1.f16371V
            int r2 = r2.length
            int r6 = r1.h()
            int r6 = r6 + 31
            int r6 = r6 >> 5
            int[] r7 = new int[r6]
            int[] r12 = new int[r6]
            r14 = 0
        L_0x02ee:
            if (r14 >= r2) goto L_0x0309
            java.lang.Object r15 = r1.e(r14)
            t2.a r15 = (t2.C1419a) r15
            int r15 = r15.f15182a
            int r22 = r15 >> 5
            r15 = r15 & 31
            r21 = 1
            int r15 = r21 << r15
            r23 = r7[r22]
            r15 = r23 | r15
            r7[r22] = r15
            int r14 = r14 + 1
            goto L_0x02ee
        L_0x0309:
            int[] r14 = new int[r2]
            r23 = r10
            r22 = r11
            r10 = -1
            r11 = 0
            r15 = 0
        L_0x0312:
            if (r11 == r10) goto L_0x04e0
        L_0x0314:
            java.lang.Object r10 = r5.f9768X
            y2.e r10 = (y2.C1630e) r10
            if (r10 != 0) goto L_0x03d7
            int r10 = r1.h()
            r24 = r13
            y2.e[] r13 = new y2.C1630e[r10]
            r25 = r9
            y2.e r9 = new y2.e
            r26 = r3
            r3 = 10
            r9.<init>(r3)
            java.lang.Object[] r3 = r1.f16371V
            int r3 = r3.length
            r27 = r4
            r4 = 0
        L_0x0333:
            if (r4 >= r3) goto L_0x0389
            java.lang.Object r28 = r1.e(r4)
            r29 = r3
            r3 = r28
            t2.a r3 = (t2.C1419a) r3
            r28 = r8
            y2.e r8 = r3.f15184c
            r30 = r0
            int r0 = r8.f16380W
            int r3 = r3.f15182a
            if (r0 != 0) goto L_0x0354
            r9.e(r3)
            r31 = r2
        L_0x0350:
            r0 = 1
            r8 = 10
            goto L_0x037f
        L_0x0354:
            r31 = r2
            r2 = 0
        L_0x0357:
            if (r2 >= r0) goto L_0x0350
            int r32 = r8.f(r2)
            r33 = r13[r32]
            r34 = r0
            if (r33 != 0) goto L_0x036f
            y2.e r0 = new y2.e
            r35 = r8
            r8 = 10
            r0.<init>(r8)
            r13[r32] = r0
            goto L_0x0375
        L_0x036f:
            r35 = r8
            r8 = 10
            r0 = r33
        L_0x0375:
            r0.e(r3)
            r0 = 1
            int r2 = r2 + r0
            r0 = r34
            r8 = r35
            goto L_0x0357
        L_0x037f:
            int r4 = r4 + r0
            r8 = r28
            r3 = r29
            r0 = r30
            r2 = r31
            goto L_0x0333
        L_0x0389:
            r30 = r0
            r31 = r2
            r28 = r8
            r8 = 10
            r0 = 0
        L_0x0392:
            if (r0 >= r10) goto L_0x03b6
            r2 = r13[r0]
            if (r2 == 0) goto L_0x03b0
            r2.d()
            boolean r3 = r2.f16381X
            if (r3 != 0) goto L_0x03ab
            int[] r3 = r2.f16379V
            int r4 = r2.f16380W
            r8 = 0
            java.util.Arrays.sort(r3, r8, r4)
            r3 = 1
            r2.f16381X = r3
            goto L_0x03ad
        L_0x03ab:
            r3 = 1
            r8 = 0
        L_0x03ad:
            r2.f16382U = r8
            goto L_0x03b2
        L_0x03b0:
            r3 = 1
            r8 = 0
        L_0x03b2:
            int r0 = r0 + r3
            r8 = 10
            goto L_0x0392
        L_0x03b6:
            r3 = 1
            r8 = 0
            r9.d()
            boolean r0 = r9.f16381X
            if (r0 != 0) goto L_0x03c8
            int[] r0 = r9.f16379V
            int r2 = r9.f16380W
            java.util.Arrays.sort(r0, r8, r2)
            r9.f16381X = r3
        L_0x03c8:
            r9.f16382U = r8
            r0 = r13[r8]
            if (r0 != 0) goto L_0x03d2
            y2.e r0 = y2.C1630e.f16378Y
            r13[r8] = r0
        L_0x03d2:
            r5.f9767W = r13
            r5.f9768X = r9
            goto L_0x03e5
        L_0x03d7:
            r30 = r0
            r31 = r2
            r26 = r3
            r27 = r4
            r28 = r8
            r25 = r9
            r24 = r13
        L_0x03e5:
            java.lang.Object r0 = r5.f9767W
            y2.e[] r0 = (y2.C1630e[]) r0
            r0 = r0[r11]
            if (r0 == 0) goto L_0x04d0
            int r2 = r0.f16380W
            r3 = 0
        L_0x03f0:
            if (r3 >= r2) goto L_0x03fc
            int r4 = r0.f(r3)
            boolean r8 = R.e.g(r12, r4)
            if (r8 == 0) goto L_0x03fe
        L_0x03fc:
            r8 = 1
            goto L_0x042d
        L_0x03fe:
            boolean r8 = R.e.g(r7, r4)
            if (r8 != 0) goto L_0x0406
        L_0x0404:
            r8 = 1
            goto L_0x042b
        L_0x0406:
            t2.a r8 = r1.i(r4)
            int r8 = r8.f15185d
            if (r8 != r11) goto L_0x0404
            int r0 = r4 >> 5
            r2 = r4 & 31
            r8 = 1
            int r2 = r8 << r2
            r3 = r12[r0]
            r2 = r2 | r3
            r12[r0] = r2
            r11 = r4
            r13 = r24
            r9 = r25
            r3 = r26
            r4 = r27
            r8 = r28
            r0 = r30
            r2 = r31
            goto L_0x0314
        L_0x042b:
            int r3 = r3 + r8
            goto L_0x03f0
        L_0x042d:
            r0 = -1
        L_0x042e:
            if (r11 == r0) goto L_0x04a3
            int r0 = r11 >> 5
            r2 = r11 & 31
            int r2 = r8 << r2
            r3 = r7[r0]
            int r2 = ~r2
            r3 = r3 & r2
            r7[r0] = r3
            r3 = r12[r0]
            r2 = r2 & r3
            r12[r0] = r2
            r14[r15] = r11
            int r15 = r15 + r8
            t2.a r0 = r1.i(r11)
            y2.e r2 = r0.f15184c
            int r3 = r2.f16380W
            int r0 = r0.f15185d
            if (r3 == 0) goto L_0x0470
            if (r3 == r8) goto L_0x0465
            r3 = -1
            if (r0 == r3) goto L_0x045a
            t2.a r4 = r1.i(r0)
            goto L_0x0472
        L_0x045a:
            r4 = 0
            int r8 = r2.f(r4)
            t2.a r8 = r1.i(r8)
            r4 = r8
            goto L_0x0472
        L_0x0465:
            r3 = -1
            r4 = 0
            int r8 = r2.f(r4)
            t2.a r4 = r1.i(r8)
            goto L_0x0472
        L_0x0470:
            r3 = -1
            r4 = 0
        L_0x0472:
            if (r4 != 0) goto L_0x0475
            goto L_0x04a4
        L_0x0475:
            int r4 = r4.f15182a
            boolean r8 = R.e.g(r7, r4)
            if (r8 == 0) goto L_0x047f
            r11 = r4
            goto L_0x04a0
        L_0x047f:
            if (r0 == r4) goto L_0x048b
            if (r0 < 0) goto L_0x048b
            boolean r4 = R.e.g(r7, r0)
            if (r4 == 0) goto L_0x048b
            r11 = r0
            goto L_0x04a0
        L_0x048b:
            int r0 = r2.f16380W
            r4 = 0
        L_0x048e:
            if (r4 >= r0) goto L_0x049f
            int r8 = r2.f(r4)
            boolean r9 = R.e.g(r7, r8)
            if (r9 == 0) goto L_0x049c
            r11 = r8
            goto L_0x04a0
        L_0x049c:
            r8 = 1
            int r4 = r4 + r8
            goto L_0x048e
        L_0x049f:
            r11 = -1
        L_0x04a0:
            r0 = -1
            r8 = 1
            goto L_0x042e
        L_0x04a3:
            r3 = -1
        L_0x04a4:
            r0 = 0
        L_0x04a5:
            if (r0 >= r6) goto L_0x04be
            r2 = r7[r0]
            if (r2 == 0) goto L_0x04bb
            int r2 = java.lang.Integer.numberOfTrailingZeros(r2)
            r4 = 32
            if (r2 != r4) goto L_0x04b4
            r2 = -1
        L_0x04b4:
            if (r2 < 0) goto L_0x04bb
            int r0 = r0 << 5
            int r0 = r0 + r2
            r11 = r0
            goto L_0x04bf
        L_0x04bb:
            r2 = 1
            int r0 = r0 + r2
            goto L_0x04a5
        L_0x04be:
            r11 = -1
        L_0x04bf:
            r13 = r24
            r9 = r25
            r3 = r26
            r4 = r27
            r8 = r28
            r0 = r30
            r2 = r31
            r10 = -1
            goto L_0x0312
        L_0x04d0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = android.support.v4.media.session.b.P(r11)
            java.lang.String r2 = "no such block: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x04e0:
            r30 = r0
            r0 = r2
            r26 = r3
            r27 = r4
            r28 = r8
            r25 = r9
            r24 = r13
            r3 = -1
            if (r15 != r0) goto L_0x0625
            r2 = r30
            r2.f14636f = r14
            r4 = 0
        L_0x04f5:
            de.ozerov.fully.K2 r6 = r2.f14634c
            d4.k r7 = r2.f14633b
            if (r4 >= r0) goto L_0x05ca
            r8 = 1
            int r9 = r4 + 1
            if (r9 != r0) goto L_0x0502
            r8 = -1
            goto L_0x0504
        L_0x0502:
            r8 = r14[r9]
        L_0x0504:
            r4 = r14[r4]
            t2.a r4 = r1.i(r4)
            r7.getClass()
            java.lang.Object r10 = r7.f9766V
            p2.e[] r10 = (p2.e[]) r10
            int r11 = r4.f15182a
            r12 = r10[r11]
            java.lang.Object r13 = r6.f10050V
            J1.e r13 = (J1.e) r13
            r13.b(r12)
            java.lang.Object r12 = r7.f9767W
            p2.e[] r12 = (p2.e[]) r12
            r12 = r12[r11]
            B3.q r13 = r2.f14635d
            r13.f450V = r4
            r13.f451W = r12
            t2.g r12 = r4.f15183b
            java.lang.Object[] r15 = r12.f16371V
            int r15 = r15.length
            r3 = 0
        L_0x052e:
            if (r3 >= r15) goto L_0x0542
            java.lang.Object r29 = r12.e(r3)
            r31 = r0
            r0 = r29
            t2.f r0 = (t2.C1424f) r0
            r0.b(r13)
            r0 = 1
            int r3 = r3 + r0
            r0 = r31
            goto L_0x052e
        L_0x0542:
            r31 = r0
            java.lang.Object r0 = r7.f9768X
            p2.e[] r0 = (p2.e[]) r0
            r0 = r0[r11]
            java.lang.Object r3 = r6.f10050V
            J1.e r3 = (J1.e) r3
            r3.b(r0)
            t2.f r0 = r12.h()
            int r6 = r4.f15185d
            if (r6 < 0) goto L_0x05c2
            if (r6 == r8) goto L_0x05c2
            t2.n r7 = r0.f15196U
            int r7 = r7.e
            r11 = 4
            if (r7 != r11) goto L_0x05b0
            y2.e r4 = r4.f15184c
            int r7 = r4.f16380W
            r12 = 2
            if (r7 != r12) goto L_0x05a8
            r13 = 0
            int r7 = r4.f(r13)
            if (r7 != r6) goto L_0x0575
            r15 = 1
            int r7 = r4.f(r15)
        L_0x0575:
            if (r7 != r8) goto L_0x05b1
            r0 = r10[r6]
            java.lang.Object r4 = r3.f2358Y
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            int r4 = r4 - r12
            java.lang.Object r6 = r3.f2358Y     // Catch:{ IndexOutOfBoundsException -> 0x05a0, ClassCastException -> 0x0598 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ IndexOutOfBoundsException -> 0x05a0, ClassCastException -> 0x0598 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ IndexOutOfBoundsException -> 0x05a0, ClassCastException -> 0x0598 }
            p2.u r6 = (p2.u) r6     // Catch:{ IndexOutOfBoundsException -> 0x05a0, ClassCastException -> 0x0598 }
            java.lang.Object r3 = r3.f2358Y
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            p2.u r0 = r6.o(r0)
            r3.set(r4, r0)
            goto L_0x05c4
        L_0x0598:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "non-reversible instruction"
            r0.<init>(r1)
            throw r0
        L_0x05a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "too few instructions"
            r0.<init>(r1)
            throw r0
        L_0x05a8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "block doesn't have exactly two successors"
            r0.<init>(r1)
            throw r0
        L_0x05b0:
            r13 = 0
        L_0x05b1:
            p2.u r4 = new p2.u
            p2.i r7 = p2.j.f14494I
            t2.l r8 = t2.l.f15206W
            r6 = r10[r6]
            t2.p r0 = r0.f15197V
            r4.<init>(r7, r0, r8, r6)
            r3.b(r4)
            goto L_0x05c4
        L_0x05c2:
            r11 = 4
            r13 = 0
        L_0x05c4:
            r4 = r9
            r0 = r31
            r3 = -1
            goto L_0x04f5
        L_0x05ca:
            r13 = 0
            d4.k r0 = new d4.k
            int[] r1 = r2.f14636f
            r0.<init>(r5, r1, r7)
            B3.q r1 = new B3.q
            java.lang.Object r2 = r6.f10051W
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x061d
            int r2 = r2.size()
            r3 = 0
        L_0x05df:
            java.lang.Object r4 = r6.f10050V
            J1.e r4 = (J1.e) r4
            if (r3 >= r2) goto L_0x05f5
            java.lang.Object r5 = r6.f10051W
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r3)
            p2.g r5 = (p2.g) r5
            r4.b(r5)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x05df
        L_0x05f5:
            r3 = 0
            r5 = 1
            r6.f10051W = r3
            r1.<init>()
            if (r4 == 0) goto L_0x0615
            r1.f449U = r4
            r1.f450V = r0
            r1.f451W = r3
            r1.f452X = r3
            r2.j r0 = new r2.j
            v2.b r2 = v2.C1559b.f16011W
            r3 = r27
            r4 = r28
            r0.<init>(r4, r3, r1, r2)
            r3 = r26
            r2 = 0
            goto L_0x0637
        L_0x0615:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "unprocessedInsns == null"
            r0.<init>(r1)
            throw r0
        L_0x061d:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "already processed"
            r0.<init>(r1)
            throw r0
        L_0x0625:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "shouldn't happen"
            r0.<init>(r1)
            throw r0
        L_0x062d:
            r2.j r0 = new r2.j
            v2.b r1 = v2.C1559b.f16011W
            r2 = 0
            r0.<init>(r4, r3, r2, r1)
            r3 = r26
        L_0x0637:
            int r1 = r3.f13717b
            r3 = 65546(0x1000a, float:9.185E-41)
            r1 = r1 & r3
            if (r1 == 0) goto L_0x064b
            r9 = r25
            r2.c r1 = r9.f13724g
            r2.b r1 = r1.f14873a0
            java.util.ArrayList r1 = r1.f14864c0
            r1.add(r0)
            goto L_0x0656
        L_0x064b:
            r9 = r25
            r2.c r1 = r9.f13724g
            r2.b r1 = r1.f14873a0
            java.util.ArrayList r1 = r1.f14865d0
            r1.add(r0)
        L_0x0656:
            r1 = r36
            r0 = r37
            r2 = r16
            r6 = r17
            r7 = r20
            r11 = r22
            r10 = r23
            r13 = r24
            goto L_0x012b
        L_0x0668:
            r17 = r6
            r20 = r7
            r23 = r10
            r24 = r13
            r2 = 0
            r5 = 1
            r13 = 0
            java.util.Collection r0 = r24.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x067b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06c8
            java.lang.Object r1 = r0.next()
            n2.b r1 = (n2.b) r1
            r2.h r3 = new r2.h
            n2.e r4 = r1.f13714a
            u2.h r4 = r4.f13728c
            int r1 = r1.f13715b
            r3.<init>(r4, r1)
            r1 = r1 & 8
            if (r1 == 0) goto L_0x06b3
            r2.c r1 = r9.f13724g
            u2.k r4 = u2.k.f15755U
            r2.b r1 = r1.f14873a0
            u2.c r6 = r1.f14866e0
            if (r6 != 0) goto L_0x06ab
            java.util.ArrayList r6 = r1.f14861Z
            r6.add(r3)
            java.util.HashMap r1 = r1.f14862a0
            r1.put(r3, r4)
            goto L_0x067b
        L_0x06ab:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "static fields already sorted"
            r0.<init>(r1)
            throw r0
        L_0x06b3:
            r2.c r1 = r9.f13724g
            r2.b r1 = r1.f14873a0
            java.util.ArrayList r1 = r1.f14863b0
            r1.add(r3)
            goto L_0x067b
        L_0x06bd:
            r17 = r6
            r20 = r7
            r38 = r8
            r23 = r10
            r2 = 0
            r5 = 1
            r13 = 0
        L_0x06c8:
            r2.c r0 = r9.f13724g
            r10 = r23
            r2.d r1 = r10.f14890j
            r1.getClass()
            u2.u r3 = r0.f14868V     // Catch:{ NullPointerException -> 0x0707 }
            v2.c r3 = r3.f15772U     // Catch:{ NullPointerException -> 0x0707 }
            r1.g()
            java.util.TreeMap r1 = r1.f14876f
            java.lang.Object r4 = r1.get(r3)
            if (r4 != 0) goto L_0x06f3
            r1.put(r3, r0)
            r1 = r36
            r0 = r37
            r8 = r38
            r6 = r17
            r7 = r20
            r2 = 10
            r3 = 1
            r5 = 0
            goto L_0x00d9
        L_0x06f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "already added: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0707:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "clazz == null"
            r0.<init>(r1)
            throw r0
        L_0x070f:
            r24 = r13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Undeclared type "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = " declares members: "
            r1.append(r2)
            java.util.Set r2 = r24.keySet()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.util.Set r2 = r12.keySet()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x073d:
            r17 = r6
            r20 = r7
            java.lang.Object r0 = r1.f10051W     // Catch:{ IOException -> 0x078a }
            r2.f r0 = (r2.C1387f) r0     // Catch:{ IOException -> 0x078a }
            byte[] r0 = r0.b()     // Catch:{ IOException -> 0x078a }
            java.util.jar.JarOutputStream r2 = new java.util.jar.JarOutputStream
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r5 = r20
            r4.<init>(r5)
            r3.<init>(r4)
            r2.<init>(r3)
            r5.setReadOnly()
            java.util.jar.JarEntry r3 = new java.util.jar.JarEntry     // Catch:{ all -> 0x077e }
            java.lang.String r4 = "classes.dex"
            r3.<init>(r4)     // Catch:{ all -> 0x077e }
            int r4 = r0.length     // Catch:{ all -> 0x077e }
            long r6 = (long) r4     // Catch:{ all -> 0x077e }
            r3.setSize(r6)     // Catch:{ all -> 0x077e }
            r2.putNextEntry(r3)     // Catch:{ all -> 0x077e }
            r2.write(r0)     // Catch:{ all -> 0x0780 }
            r2.closeEntry()     // Catch:{ all -> 0x077e }
            r2.close()
            r0 = r37
            r6 = r17
            java.lang.ClassLoader r0 = r1.w(r5, r6, r0)
            return r0
        L_0x077e:
            r0 = move-exception
            goto L_0x0786
        L_0x0780:
            r0 = move-exception
            r3 = r0
            r2.closeEntry()     // Catch:{ all -> 0x077e }
            throw r3     // Catch:{ all -> 0x077e }
        L_0x0786:
            r2.close()
            throw r0
        L_0x078a:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.K2.v(java.lang.ClassLoader, java.io.File):java.lang.ClassLoader");
    }

    public ClassLoader w(File file, File file2, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = null;
        }
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
            Class<String> cls = String.class;
            return (ClassLoader) Class.forName("dalvik.system.DexClassLoader").getConstructor(new Class[]{cls, cls, cls, ClassLoader.class}).newInstance(new Object[]{file.getPath(), file2.getAbsolutePath(), null, classLoader});
        } catch (ClassNotFoundException e) {
            throw new UnsupportedOperationException("load() requires a Dalvik VM", e);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8.getCause());
        } catch (InstantiationException unused) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError();
        } catch (IllegalAccessException unused3) {
            throw new AssertionError();
        }
    }

    public C0120h x(int i) {
        C0120h hVar;
        C0120h hVar2;
        C0120h[] hVarArr = (C0120h[]) this.f10051W;
        C0120h hVar3 = hVarArr[D(i)];
        if (hVar3 != null) {
            return hVar3;
        }
        for (int i8 = 1; i8 < 5; i8++) {
            int D8 = D(i) - i8;
            if (D8 >= 0 && (hVar2 = hVarArr[D8]) != null) {
                return hVar2;
            }
            int D9 = D(i) + i8;
            if (D9 < hVarArr.length && (hVar = hVarArr[D9]) != null) {
                return hVar;
            }
        }
        return null;
    }

    public int y(int i) {
        int[] iArr = (int[]) this.f10051W;
        return iArr[(iArr.length - 1) - i];
    }

    public void z(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    public /* synthetic */ K2(int i, Object obj, Object obj2, boolean z) {
        this.f10049U = i;
        this.f10051W = obj;
        this.f10050V = obj2;
    }

    public /* synthetic */ K2(Object obj, int i, Object obj2) {
        this.f10049U = i;
        this.f10050V = obj;
        this.f10051W = obj2;
    }

    public K2(FullyActivity fullyActivity, int i) {
        this.f10049U = i;
        switch (i) {
            case 1:
                this.f10050V = fullyActivity;
                new d4.k((Context) fullyActivity, 1);
                return;
            default:
                this.f10050V = fullyActivity;
                if (!a.r0() || a.b0(fullyActivity) < 31 || fullyActivity.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    try {
                        J2 j22 = new J2(this);
                        this.f10051W = j22;
                        ((TelephonyManager) fullyActivity.getSystemService("phone")).listen(j22, 32);
                        return;
                    } catch (Exception e) {
                        Q0.g.z(e, new StringBuilder("Registering PhoneStateListener failed due to "), "K2");
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public K2(FullyActivity fullyActivity, FullyActivity fullyActivity2) {
        this.f10049U = 2;
        this.f10051W = new C0809y3(this, new Handler());
        this.f10050V = fullyActivity;
    }

    public K2(C0961a aVar, int[] iArr) {
        this.f10049U = 11;
        if (iArr.length != 0) {
            this.f10050V = aVar;
            int length = iArr.length;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.f10051W = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f10051W = new int[]{0};
                return;
            }
            int i8 = length - i;
            int[] iArr2 = new int[i8];
            this.f10051W = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i8);
            return;
        }
        throw new IllegalArgumentException();
    }

    public K2(C0901b bVar) {
        this.f10049U = 10;
        this.f10050V = new C0901b(bVar);
        this.f10051W = new C0120h[((bVar.i - bVar.f11679h) + 1)];
    }

    public K2(n1.r rVar, v vVar) {
        this.f10049U = 17;
        this.f10050V = rVar;
        this.f10051W = vVar;
        new M0.r(new C0129q());
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [androidx.lifecycle.x, java.lang.Object, androidx.lifecycle.z] */
    public K2(D.E e) {
        this.f10049U = 28;
        this.f10050V = e;
        ? xVar = new x();
        this.f10051W = xVar;
        xVar.k(new C0004e(5, (C0005f) null));
    }

    public K2(z zVar, i0 i0Var) {
        this.f10049U = 9;
        this.f10050V = zVar;
        this.f10051W = O.m(i0Var);
    }

    public K2(S3.b bVar) {
        this.f10049U = 15;
        this.f10050V = bVar;
    }

    public K2(C1048n nVar, int i, int i8, int i9, int i10) {
        this.f10049U = 21;
        this.f10050V = new J1.e(nVar, i, i9, i10);
        this.f10051W = new ArrayList(i8);
    }

    public K2(Context context, Object obj, LinkedHashSet linkedHashSet) {
        v.r rVar;
        this.f10049U = 27;
        q4.k kVar = new q4.k(25);
        this.f10050V = new HashMap();
        this.f10051W = kVar;
        if (obj instanceof v.r) {
            rVar = (v.r) obj;
        } else {
            rVar = v.r.a(context, E.e.p());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.f10050V).put(str, new C1459T(context, str, rVar, (q4.k) this.f10051W));
        }
    }

    public K2(C1213a aVar) {
        this.f10049U = 4;
        this.f10050V = aVar;
        this.f10051W = new Z1.c(17, (Object) (C1214b) ((C1213a) aVar.f13355a).f13355a);
    }

    public K2(C1387f fVar, C1627b bVar) {
        this.f10049U = 23;
        if (fVar != null) {
            this.f10050V = fVar;
            this.f10051W = bVar;
            return;
        }
        throw new NullPointerException("file == null");
    }

    public K2() {
        this.f10049U = 18;
        this.f10050V = new LinkedHashMap();
    }

    public K2(ArrayList arrayList, ArrayList arrayList2) {
        this.f10049U = 16;
        int size = arrayList.size();
        this.f10050V = new int[size];
        this.f10051W = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f10050V)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f10051W)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public K2(int i, int i8) {
        this.f10049U = 16;
        this.f10050V = new int[]{i, i8};
        this.f10051W = new float[]{0.0f, 1.0f};
    }

    public K2(int i, int i8, int i9) {
        this.f10049U = 16;
        this.f10050V = new int[]{i, i8, i9};
        this.f10051W = new float[]{0.0f, 0.5f, 1.0f};
    }

    public K2(f1.k kVar) {
        this.f10049U = 6;
        this.f10051W = kVar;
        this.f10050V = P0.z.m((Handler.Callback) null);
    }

    public K2(l1.j jVar) {
        this.f10049U = 19;
        this.f10050V = jVar;
        this.f10051W = new AtomicBoolean(false);
    }

    public K2(C1479t tVar) {
        this.f10049U = 26;
        this.f10051W = tVar;
        this.f10050V = null;
    }
}
