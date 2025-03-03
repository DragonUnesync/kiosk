package u;

import B.C0022x;
import D.C0;
import D.C0044g;
import D.C0054l;
import D.N;
import D.O;
import D.s0;
import D2.G;
import F.h;
import G.d;
import G.k;
import K.b;
import a0.j;
import a0.m;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import de.ozerov.fully.M2;
import g7.l;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k2.C1160q;
import n2.a;
import w.C1571a;
import w.i;
import w.r;
import y.C1610b;

/* renamed from: u.I  reason: case insensitive filesystem */
public final class C1449I {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15498a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15499b;

    /* renamed from: c  reason: collision with root package name */
    public final C1448H f15500c;

    /* renamed from: d  reason: collision with root package name */
    public Y f15501d;
    public Y e;

    /* renamed from: f  reason: collision with root package name */
    public C0 f15502f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f15503g;

    /* renamed from: h  reason: collision with root package name */
    public List f15504h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public m f15505j;

    /* renamed from: k  reason: collision with root package name */
    public j f15506k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap f15507l;

    /* renamed from: m  reason: collision with root package name */
    public final b f15508m;

    /* renamed from: n  reason: collision with root package name */
    public final b f15509n;

    /* renamed from: o  reason: collision with root package name */
    public final G f15510o;

    /* renamed from: p  reason: collision with root package name */
    public final C1160q f15511p;

    /* renamed from: q  reason: collision with root package name */
    public final C1610b f15512q;

    public C1449I(C1160q qVar, s0 s0Var) {
        this.f15498a = new Object();
        this.f15499b = new ArrayList();
        this.f15503g = new HashMap();
        this.f15504h = Collections.emptyList();
        this.i = 1;
        this.f15507l = new HashMap();
        this.f15508m = new b(4);
        this.f15509n = new b(5);
        this.i = 2;
        this.f15511p = qVar;
        this.f15500c = new C1448H(this);
        this.f15510o = new G(s0Var.h(CaptureNoResponseQuirk.class));
        this.f15512q = new C1610b(s0Var, 1);
    }

    public static C1482w b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0054l lVar = (C0054l) it.next();
            if (lVar == null) {
                obj = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                l.q(lVar, arrayList2);
                if (arrayList2.size() == 1) {
                    obj = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    obj = new C1482w((List) arrayList2);
                }
            }
            arrayList.add(obj);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C1482w((List) arrayList);
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!arrayList2.contains(iVar.f16153a.e())) {
                arrayList2.add(iVar.f16153a.e());
                arrayList3.add(iVar);
            }
        }
        return arrayList3;
    }

    public final void a() {
        synchronized (this.f15498a) {
            try {
                int h5 = C1477r.h(this.i);
                if (h5 != 0) {
                    if (h5 != 1) {
                        if (h5 == 2) {
                            a.l(this.f15501d, "The Opener shouldn't null in state:".concat(C1477r.j(this.i)));
                            this.f15501d.u();
                        } else if (h5 == 3 || h5 == 4) {
                            a.l(this.f15501d, "The Opener shouldn't null in state:".concat(C1477r.j(this.i)));
                            this.f15501d.u();
                            this.i = 6;
                            this.f15510o.l();
                            this.f15502f = null;
                        }
                    }
                    this.i = 8;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(C1477r.j(this.i)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.i == 8) {
            h.j("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.i = 8;
        this.e = null;
        j jVar = this.f15506k;
        if (jVar != null) {
            jVar.a((Object) null);
            this.f15506k = null;
        }
    }

    public final List d() {
        List unmodifiableList;
        synchronized (this.f15498a) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.f15499b);
        }
        return unmodifiableList;
    }

    public final i e(C0044g gVar, HashMap hashMap, String str) {
        long j7;
        Surface surface = (Surface) hashMap.get(gVar.f899a);
        a.l(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        i iVar = new i(gVar.f902d, surface);
        r rVar = iVar.f16153a;
        if (str != null) {
            rVar.i(str);
        } else {
            rVar.i((String) null);
        }
        boolean z = true;
        int i8 = gVar.f901c;
        if (i8 == 0) {
            rVar.h(1);
        } else if (i8 == 1) {
            rVar.h(2);
        }
        List<N> list = gVar.f900b;
        if (!list.isEmpty()) {
            rVar.b();
            for (N n4 : list) {
                Surface surface2 = (Surface) hashMap.get(n4);
                a.l(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                rVar.a(surface2);
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            C1160q qVar = this.f15511p;
            qVar.getClass();
            if (i9 < 33) {
                z = false;
            }
            a.m("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z);
            DynamicRangeProfiles a8 = ((w.b) qVar.f13026V).a();
            if (a8 != null) {
                C0022x xVar = gVar.e;
                Long a9 = C1571a.a(xVar, a8);
                if (a9 == null) {
                    h.l("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + xVar);
                } else {
                    j7 = a9.longValue();
                    rVar.g(j7);
                    return iVar;
                }
            }
        }
        j7 = 1;
        rVar.g(j7);
        return iVar;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.f15498a) {
            int i8 = this.i;
            if (i8 != 5) {
                if (i8 != 4) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r6.f790c != 2) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r7 = new B.j0(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r6.f790c != 5) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        r8 = r6.f793g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r8 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r7.f270a0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r8 = r11.f15502f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r8 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r7.e(r8.f752g.f789b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        r7.e(r6.f789b);
        r7 = r7.f();
        r8 = r11.e;
        r8.f15573g.getClass();
        r7 = android.support.v4.media.session.b.d(r7, ((android.hardware.camera2.CameraCaptureSession) ((v.i) r8.f15573g.f13026V).f15852V).getDevice(), r11.f15503g, false, r11.f15512q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        if (r7 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        F.h.j("CaptureSession", "Skipping issuing request without surface.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r8 = new java.util.ArrayList();
        r6 = r6.f791d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        if (r6.hasNext() == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        g7.l.q((D.C0054l) r6.next(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f9, code lost:
        r1.a(r7, r8);
        r3.add(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.util.ArrayList r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f15498a
            monitor-enter(r0)
            int r1 = r11.i     // Catch:{ all -> 0x0011 }
            r2 = 5
            if (r1 == r2) goto L_0x0014
            java.lang.String r12 = "CaptureSession"
            java.lang.String r1 = "Skipping issueBurstCaptureRequest due to session closed"
            F.h.j(r12, r1)     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r12 = move-exception
            goto L_0x0168
        L_0x0014:
            boolean r1 = r12.isEmpty()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x001c:
            u.f r1 = new u.f     // Catch:{ CameraAccessException -> 0x0055 }
            r3 = 1
            r1.<init>((int) r3)     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0055 }
            r3.<init>()     // Catch:{ CameraAccessException -> 0x0055 }
            java.lang.String r4 = "CaptureSession"
            java.lang.String r5 = "Issuing capture request."
            F.h.j(r4, r5)     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ CameraAccessException -> 0x0055 }
            r4 = 0
            r5 = 0
        L_0x0034:
            boolean r6 = r12.hasNext()     // Catch:{ CameraAccessException -> 0x0055 }
            r7 = 1
            if (r6 == 0) goto L_0x0101
            java.lang.Object r6 = r12.next()     // Catch:{ CameraAccessException -> 0x0055 }
            D.I r6 = (D.I) r6     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.ArrayList r8 = r6.f788a     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.List r8 = j$.util.DesugarCollections.unmodifiableList(r8)     // Catch:{ CameraAccessException -> 0x0055 }
            boolean r8 = r8.isEmpty()     // Catch:{ CameraAccessException -> 0x0055 }
            if (r8 == 0) goto L_0x0058
            java.lang.String r6 = "CaptureSession"
            java.lang.String r7 = "Skipping issuing empty capture request."
            F.h.j(r6, r7)     // Catch:{ CameraAccessException -> 0x0055 }
            goto L_0x0034
        L_0x0055:
            r12 = move-exception
            goto L_0x0149
        L_0x0058:
            java.util.ArrayList r8 = r6.f788a     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.List r8 = j$.util.DesugarCollections.unmodifiableList(r8)     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CameraAccessException -> 0x0055 }
        L_0x0062:
            boolean r9 = r8.hasNext()     // Catch:{ CameraAccessException -> 0x0055 }
            if (r9 == 0) goto L_0x008d
            java.lang.Object r9 = r8.next()     // Catch:{ CameraAccessException -> 0x0055 }
            D.N r9 = (D.N) r9     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.HashMap r10 = r11.f15503g     // Catch:{ CameraAccessException -> 0x0055 }
            boolean r10 = r10.containsKey(r9)     // Catch:{ CameraAccessException -> 0x0055 }
            if (r10 != 0) goto L_0x0062
            java.lang.String r6 = "CaptureSession"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0055 }
            r7.<init>()     // Catch:{ CameraAccessException -> 0x0055 }
            java.lang.String r8 = "Skipping capture request with invalid surface: "
            r7.append(r8)     // Catch:{ CameraAccessException -> 0x0055 }
            r7.append(r9)     // Catch:{ CameraAccessException -> 0x0055 }
            java.lang.String r7 = r7.toString()     // Catch:{ CameraAccessException -> 0x0055 }
            F.h.j(r6, r7)     // Catch:{ CameraAccessException -> 0x0055 }
            goto L_0x0034
        L_0x008d:
            int r8 = r6.f790c     // Catch:{ CameraAccessException -> 0x0055 }
            r9 = 2
            if (r8 != r9) goto L_0x0093
            r5 = 1
        L_0x0093:
            B.j0 r7 = new B.j0     // Catch:{ CameraAccessException -> 0x0055 }
            r7.<init>((D.I) r6)     // Catch:{ CameraAccessException -> 0x0055 }
            int r8 = r6.f790c     // Catch:{ CameraAccessException -> 0x0055 }
            if (r8 != r2) goto L_0x00a2
            D.s r8 = r6.f793g     // Catch:{ CameraAccessException -> 0x0055 }
            if (r8 == 0) goto L_0x00a2
            r7.f270a0 = r8     // Catch:{ CameraAccessException -> 0x0055 }
        L_0x00a2:
            D.C0 r8 = r11.f15502f     // Catch:{ CameraAccessException -> 0x0055 }
            if (r8 == 0) goto L_0x00ad
            D.I r8 = r8.f752g     // Catch:{ CameraAccessException -> 0x0055 }
            D.k0 r8 = r8.f789b     // Catch:{ CameraAccessException -> 0x0055 }
            r7.e(r8)     // Catch:{ CameraAccessException -> 0x0055 }
        L_0x00ad:
            D.k0 r8 = r6.f789b     // Catch:{ CameraAccessException -> 0x0055 }
            r7.e(r8)     // Catch:{ CameraAccessException -> 0x0055 }
            D.I r7 = r7.f()     // Catch:{ CameraAccessException -> 0x0055 }
            u.Y r8 = r11.e     // Catch:{ CameraAccessException -> 0x0055 }
            k2.q r9 = r8.f15573g     // Catch:{ CameraAccessException -> 0x0055 }
            r9.getClass()     // Catch:{ CameraAccessException -> 0x0055 }
            k2.q r8 = r8.f15573g     // Catch:{ CameraAccessException -> 0x0055 }
            java.lang.Object r8 = r8.f13026V     // Catch:{ CameraAccessException -> 0x0055 }
            v.i r8 = (v.i) r8     // Catch:{ CameraAccessException -> 0x0055 }
            java.lang.Object r8 = r8.f15852V     // Catch:{ CameraAccessException -> 0x0055 }
            android.hardware.camera2.CameraCaptureSession r8 = (android.hardware.camera2.CameraCaptureSession) r8     // Catch:{ CameraAccessException -> 0x0055 }
            android.hardware.camera2.CameraDevice r8 = r8.getDevice()     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.HashMap r9 = r11.f15503g     // Catch:{ CameraAccessException -> 0x0055 }
            y.b r10 = r11.f15512q     // Catch:{ CameraAccessException -> 0x0055 }
            android.hardware.camera2.CaptureRequest r7 = android.support.v4.media.session.b.d(r7, r8, r9, r4, r10)     // Catch:{ CameraAccessException -> 0x0055 }
            if (r7 != 0) goto L_0x00de
            java.lang.String r12 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing request without surface."
            F.h.j(r12, r1)     // Catch:{ CameraAccessException -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x00de:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0055 }
            r8.<init>()     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.List r6 = r6.f791d     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CameraAccessException -> 0x0055 }
        L_0x00e9:
            boolean r9 = r6.hasNext()     // Catch:{ CameraAccessException -> 0x0055 }
            if (r9 == 0) goto L_0x00f9
            java.lang.Object r9 = r6.next()     // Catch:{ CameraAccessException -> 0x0055 }
            D.l r9 = (D.C0054l) r9     // Catch:{ CameraAccessException -> 0x0055 }
            g7.l.q(r9, r8)     // Catch:{ CameraAccessException -> 0x0055 }
            goto L_0x00e9
        L_0x00f9:
            r1.a(r7, r8)     // Catch:{ CameraAccessException -> 0x0055 }
            r3.add(r7)     // Catch:{ CameraAccessException -> 0x0055 }
            goto L_0x0034
        L_0x0101:
            boolean r12 = r3.isEmpty()     // Catch:{ CameraAccessException -> 0x0055 }
            if (r12 != 0) goto L_0x0141
            K.b r12 = r11.f15508m     // Catch:{ CameraAccessException -> 0x0055 }
            boolean r12 = r12.f(r3, r5)     // Catch:{ CameraAccessException -> 0x0055 }
            if (r12 == 0) goto L_0x011b
            u.Y r12 = r11.e     // Catch:{ CameraAccessException -> 0x0055 }
            r12.w()     // Catch:{ CameraAccessException -> 0x0055 }
            u.G r12 = new u.G     // Catch:{ CameraAccessException -> 0x0055 }
            r12.<init>(r11)     // Catch:{ CameraAccessException -> 0x0055 }
            r1.f15615c = r12     // Catch:{ CameraAccessException -> 0x0055 }
        L_0x011b:
            K.b r12 = r11.f15509n     // Catch:{ CameraAccessException -> 0x0055 }
            boolean r12 = r12.d(r3, r5)     // Catch:{ CameraAccessException -> 0x0055 }
            if (r12 == 0) goto L_0x013a
            int r12 = r3.size()     // Catch:{ CameraAccessException -> 0x0055 }
            int r12 = r12 - r7
            java.lang.Object r12 = r3.get(r12)     // Catch:{ CameraAccessException -> 0x0055 }
            android.hardware.camera2.CaptureRequest r12 = (android.hardware.camera2.CaptureRequest) r12     // Catch:{ CameraAccessException -> 0x0055 }
            u.w r2 = new u.w     // Catch:{ CameraAccessException -> 0x0055 }
            r2.<init>((u.C1449I) r11)     // Catch:{ CameraAccessException -> 0x0055 }
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ CameraAccessException -> 0x0055 }
            r1.a(r12, r2)     // Catch:{ CameraAccessException -> 0x0055 }
        L_0x013a:
            u.Y r12 = r11.e     // Catch:{ CameraAccessException -> 0x0055 }
            r12.i(r3, r1)     // Catch:{ CameraAccessException -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0141:
            java.lang.String r12 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing burst request due to no valid request elements"
            F.h.j(r12, r1)     // Catch:{ CameraAccessException -> 0x0055 }
            goto L_0x0166
        L_0x0149:
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0011 }
            r2.<init>()     // Catch:{ all -> 0x0011 }
            java.lang.String r3 = "Unable to access camera: "
            r2.append(r3)     // Catch:{ all -> 0x0011 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0011 }
            r2.append(r12)     // Catch:{ all -> 0x0011 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0011 }
            F.h.l(r1, r12)     // Catch:{ all -> 0x0011 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0011 }
        L_0x0166:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0168:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1449I.h(java.util.ArrayList):void");
    }

    public final void i(List list) {
        synchronized (this.f15498a) {
            try {
                switch (C1477r.h(this.i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(C1477r.j(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f15499b.addAll(list);
                        break;
                    case 4:
                        this.f15499b.addAll(list);
                        this.f15510o.g().d(new M2(16, (Object) this), D7.b.l());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        F.h.l("CaptureSession", "Unable to access camera: " + r7.getMessage());
        java.lang.Thread.dumpStack();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000d, B:18:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(D.C0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Unable to access camera: "
            java.lang.String r1 = "Unable to access camera: "
            java.lang.Object r2 = r6.f15498a
            monitor-enter(r2)
            if (r7 != 0) goto L_0x0015
            java.lang.String r7 = "CaptureSession"
            java.lang.String r0 = "Skipping issueRepeatingCaptureRequests for no configuration case."
            F.h.j(r7, r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r7 = move-exception
            goto L_0x00bb
        L_0x0015:
            int r3 = r6.i     // Catch:{ all -> 0x0012 }
            r4 = 5
            if (r3 == r4) goto L_0x0023
            java.lang.String r7 = "CaptureSession"
            java.lang.String r0 = "Skipping issueRepeatingCaptureRequests due to session closed"
            F.h.j(r7, r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x0023:
            D.I r7 = r7.f752g     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r3 = r7.f788a     // Catch:{ all -> 0x0012 }
            java.util.List r3 = j$.util.DesugarCollections.unmodifiableList(r3)     // Catch:{ all -> 0x0012 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r3 == 0) goto L_0x0059
            java.lang.String r7 = "CaptureSession"
            java.lang.String r0 = "Skipping issueRepeatingCaptureRequests for no surface."
            F.h.j(r7, r0)     // Catch:{ all -> 0x0012 }
            u.Y r7 = r6.e     // Catch:{ CameraAccessException -> 0x003e }
            r7.w()     // Catch:{ CameraAccessException -> 0x003e }
            goto L_0x0057
        L_0x003e:
            r7 = move-exception
            java.lang.String r0 = "CaptureSession"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r3.<init>(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0012 }
            r3.append(r7)     // Catch:{ all -> 0x0012 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0012 }
            F.h.l(r0, r7)     // Catch:{ all -> 0x0012 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0012 }
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x0059:
            java.lang.String r1 = "CaptureSession"
            java.lang.String r3 = "Issuing request for session."
            F.h.j(r1, r3)     // Catch:{ CameraAccessException -> 0x0089 }
            u.Y r1 = r6.e     // Catch:{ CameraAccessException -> 0x0089 }
            k2.q r3 = r1.f15573g     // Catch:{ CameraAccessException -> 0x0089 }
            r3.getClass()     // Catch:{ CameraAccessException -> 0x0089 }
            k2.q r1 = r1.f15573g     // Catch:{ CameraAccessException -> 0x0089 }
            java.lang.Object r1 = r1.f13026V     // Catch:{ CameraAccessException -> 0x0089 }
            v.i r1 = (v.i) r1     // Catch:{ CameraAccessException -> 0x0089 }
            java.lang.Object r1 = r1.f15852V     // Catch:{ CameraAccessException -> 0x0089 }
            android.hardware.camera2.CameraCaptureSession r1 = (android.hardware.camera2.CameraCaptureSession) r1     // Catch:{ CameraAccessException -> 0x0089 }
            android.hardware.camera2.CameraDevice r1 = r1.getDevice()     // Catch:{ CameraAccessException -> 0x0089 }
            java.util.HashMap r3 = r6.f15503g     // Catch:{ CameraAccessException -> 0x0089 }
            y.b r4 = r6.f15512q     // Catch:{ CameraAccessException -> 0x0089 }
            r5 = 1
            android.hardware.camera2.CaptureRequest r1 = android.support.v4.media.session.b.d(r7, r1, r3, r5, r4)     // Catch:{ CameraAccessException -> 0x0089 }
            if (r1 != 0) goto L_0x008b
            java.lang.String r7 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing empty request for session."
            F.h.j(r7, r1)     // Catch:{ CameraAccessException -> 0x0089 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x0089:
            r7 = move-exception
            goto L_0x00a1
        L_0x008b:
            D2.G r3 = r6.f15510o     // Catch:{ CameraAccessException -> 0x0089 }
            java.util.List r7 = r7.f791d     // Catch:{ CameraAccessException -> 0x0089 }
            r4 = 0
            android.hardware.camera2.CameraCaptureSession$CaptureCallback[] r4 = new android.hardware.camera2.CameraCaptureSession.CaptureCallback[r4]     // Catch:{ CameraAccessException -> 0x0089 }
            u.w r7 = b(r7, r4)     // Catch:{ CameraAccessException -> 0x0089 }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r7 = r3.e(r7)     // Catch:{ CameraAccessException -> 0x0089 }
            u.Y r3 = r6.e     // Catch:{ CameraAccessException -> 0x0089 }
            r3.r(r1, r7)     // Catch:{ CameraAccessException -> 0x0089 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x00a1:
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r3.<init>(r0)     // Catch:{ all -> 0x0012 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0012 }
            r3.append(r7)     // Catch:{ all -> 0x0012 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0012 }
            F.h.l(r1, r7)     // Catch:{ all -> 0x0012 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1449I.j(D.C0):void");
    }

    public final L3.b k(C0 c02, CameraDevice cameraDevice, Y y8) {
        synchronized (this.f15498a) {
            try {
                if (C1477r.h(this.i) != 1) {
                    h.l("CaptureSession", "Open not allowed in state: ".concat(C1477r.j(this.i)));
                    k kVar = new k(1, new IllegalStateException("open() should not allow the state: ".concat(C1477r.j(this.i))));
                    return kVar;
                }
                this.i = 3;
                ArrayList arrayList = new ArrayList(c02.b());
                this.f15504h = arrayList;
                this.f15501d = y8;
                d a8 = d.a(y8.s(arrayList));
                O o2 = new O(this, c02, cameraDevice, 9);
                F.i iVar = this.f15501d.f15571d;
                a8.getClass();
                G.b f8 = G.i.f(a8, o2, iVar);
                C1160q qVar = new C1160q(17, (Object) this);
                f8.d(new G.h(f8, 0, qVar), this.f15501d.f15571d);
                L3.b d8 = G.i.d(f8);
                return d8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r5.i = 7;
        r5.f15510o.l();
        n2.a.l(r5.f15501d, "The Opener shouldn't null in state:".concat(u.C1477r.j(r5.i)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r5.f15501d.u() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r5.f15505j != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r5.f15505j = com.bumptech.glide.d.i(new u.C1447G(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r0 = r5.f15505j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r5.i = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        return G.k.f1612W;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final L3.b l() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f15498a
            monitor-enter(r3)
            int r4 = r5.i     // Catch:{ all -> 0x001b }
            int r4 = u.C1477r.h(r4)     // Catch:{ all -> 0x001b }
            switch(r4) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0067;
                case 2: goto L_0x0053;
                case 3: goto L_0x001d;
                case 4: goto L_0x0013;
                case 5: goto L_0x0013;
                case 6: goto L_0x0040;
                default: goto L_0x0012;
            }     // Catch:{ all -> 0x001b }
        L_0x0012:
            goto L_0x006b
        L_0x0013:
            u.Y r0 = r5.e     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001d
            r0.j()     // Catch:{ all -> 0x001b }
            goto L_0x001d
        L_0x001b:
            r0 = move-exception
            goto L_0x007f
        L_0x001d:
            r0 = 7
            r5.i = r0     // Catch:{ all -> 0x001b }
            D2.G r0 = r5.f15510o     // Catch:{ all -> 0x001b }
            r0.l()     // Catch:{ all -> 0x001b }
            u.Y r0 = r5.f15501d     // Catch:{ all -> 0x001b }
            int r1 = r5.i     // Catch:{ all -> 0x001b }
            java.lang.String r1 = u.C1477r.j(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x001b }
            n2.a.l(r0, r1)     // Catch:{ all -> 0x001b }
            u.Y r0 = r5.f15501d     // Catch:{ all -> 0x001b }
            boolean r0 = r0.u()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0040
            r5.c()     // Catch:{ all -> 0x001b }
            goto L_0x006b
        L_0x0040:
            a0.m r0 = r5.f15505j     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x004f
            u.G r0 = new u.G     // Catch:{ all -> 0x001b }
            r0.<init>(r5)     // Catch:{ all -> 0x001b }
            a0.m r0 = com.bumptech.glide.d.i(r0)     // Catch:{ all -> 0x001b }
            r5.f15505j = r0     // Catch:{ all -> 0x001b }
        L_0x004f:
            a0.m r0 = r5.f15505j     // Catch:{ all -> 0x001b }
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r0
        L_0x0053:
            u.Y r0 = r5.f15501d     // Catch:{ all -> 0x001b }
            int r2 = r5.i     // Catch:{ all -> 0x001b }
            java.lang.String r2 = u.C1477r.j(r2)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x001b }
            n2.a.l(r0, r1)     // Catch:{ all -> 0x001b }
            u.Y r0 = r5.f15501d     // Catch:{ all -> 0x001b }
            r0.u()     // Catch:{ all -> 0x001b }
        L_0x0067:
            r0 = 8
            r5.i = r0     // Catch:{ all -> 0x001b }
        L_0x006b:
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            G.k r0 = G.k.f1612W
            return r0
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001b }
            int r2 = r5.i     // Catch:{ all -> 0x001b }
            java.lang.String r2 = u.C1477r.j(r2)     // Catch:{ all -> 0x001b }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x001b }
            r1.<init>(r0)     // Catch:{ all -> 0x001b }
            throw r1     // Catch:{ all -> 0x001b }
        L_0x007f:
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1449I.l():L3.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(D.C0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "setSessionConfig() should not be possible in state: "
            java.lang.Object r1 = r3.f15498a
            monitor-enter(r1)
            int r2 = r3.i     // Catch:{ all -> 0x0017 }
            int r2 = u.C1477r.h(r2)     // Catch:{ all -> 0x0017 }
            switch(r2) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0045;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                case 4: goto L_0x0019;
                case 5: goto L_0x000f;
                case 6: goto L_0x000f;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0017 }
        L_0x000e:
            goto L_0x0047
        L_0x000f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r0)     // Catch:{ all -> 0x0017 }
            throw r4     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r4 = move-exception
            goto L_0x0059
        L_0x0019:
            r3.f15502f = r4     // Catch:{ all -> 0x0017 }
            if (r4 != 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x001f:
            java.util.HashMap r0 = r3.f15503g     // Catch:{ all -> 0x0017 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0017 }
            java.util.List r4 = r4.b()     // Catch:{ all -> 0x0017 }
            boolean r4 = r0.containsAll(r4)     // Catch:{ all -> 0x0017 }
            if (r4 != 0) goto L_0x0038
            java.lang.String r4 = "CaptureSession"
            java.lang.String r0 = "Does not have the proper configured lists"
            F.h.l(r4, r0)     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x0038:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r0 = "Attempting to submit CaptureRequest after setting"
            F.h.j(r4, r0)     // Catch:{ all -> 0x0017 }
            D.C0 r4 = r3.f15502f     // Catch:{ all -> 0x0017 }
            r3.j(r4)     // Catch:{ all -> 0x0017 }
            goto L_0x0047
        L_0x0045:
            r3.f15502f = r4     // Catch:{ all -> 0x0017 }
        L_0x0047:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return
        L_0x0049:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            int r2 = r3.i     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = u.C1477r.j(r2)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0017 }
            r4.<init>(r0)     // Catch:{ all -> 0x0017 }
            throw r4     // Catch:{ all -> 0x0017 }
        L_0x0059:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1449I.m(D.C0):void");
    }
}
