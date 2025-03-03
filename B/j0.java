package B;

import A.g;
import D.C0036c;
import D.C0041e0;
import D.C0045g0;
import D.C0053k0;
import D.C0054l;
import D.C0064s;
import D.H0;
import D.I;
import D.K;
import D.Y;
import D.Z;
import Z1.c;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.ArrayMap;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import d4.k;
import de.ozerov.fully.C0720j3;
import de.ozerov.fully.C0736m1;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.O2;
import de.ozerov.fully.P;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import n2.a;

public final class j0 implements Z {

    /* renamed from: U  reason: collision with root package name */
    public int f264U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f265V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f266W;

    /* renamed from: X  reason: collision with root package name */
    public Object f267X;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f268Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f269Z;

    /* renamed from: a0  reason: collision with root package name */
    public Object f270a0;

    public j0(Z z) {
        this.f266W = new Object();
        this.f264U = 0;
        this.f265V = false;
        this.f270a0 = new M(1, this);
        this.f267X = z;
        this.f268Y = z.j();
    }

    public void C() {
        synchronized (this.f266W) {
            ((Z) this.f267X).C();
        }
    }

    public int D() {
        int D8;
        synchronized (this.f266W) {
            D8 = ((Z) this.f267X).D();
        }
        return D8;
    }

    public void E(Y y8, Executor executor) {
        synchronized (this.f266W) {
            ((Z) this.f267X).E(new g(this, 2, y8), executor);
        }
    }

    public W F() {
        N n4;
        synchronized (this.f266W) {
            W F8 = ((Z) this.f267X).F();
            if (F8 != null) {
                this.f264U++;
                n4 = new N(F8);
                n4.k((M) this.f270a0);
            } else {
                n4 = null;
            }
        }
        return n4;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((C0054l) it.next());
        }
    }

    public int b() {
        int b8;
        synchronized (this.f266W) {
            b8 = ((Z) this.f267X).b();
        }
        return b8;
    }

    public int c() {
        int c8;
        synchronized (this.f266W) {
            c8 = ((Z) this.f267X).c();
        }
        return c8;
    }

    public void close() {
        synchronized (this.f266W) {
            try {
                Surface surface = (Surface) this.f268Y;
                if (surface != null) {
                    surface.release();
                }
                ((Z) this.f267X).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(C0054l lVar) {
        ArrayList arrayList = (ArrayList) this.f268Y;
        if (!arrayList.contains(lVar)) {
            arrayList.add(lVar);
        }
    }

    public void e(K k8) {
        for (C0036c cVar : k8.J()) {
            C0041e0 e0Var = (C0041e0) this.f267X;
            e0Var.getClass();
            try {
                e0Var.b0(cVar);
            } catch (IllegalArgumentException unused) {
            }
            ((C0041e0) this.f267X).d(cVar, k8.m(cVar), k8.b0(cVar));
        }
    }

    public I f() {
        ArrayList arrayList = new ArrayList((HashSet) this.f266W);
        C0053k0 a8 = C0053k0.a((C0041e0) this.f267X);
        int i = this.f264U;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f268Y);
        boolean z = this.f265V;
        H0 h02 = H0.f784b;
        ArrayMap arrayMap = new ArrayMap();
        C0045g0 g0Var = (C0045g0) this.f269Z;
        for (String str : g0Var.f785a.keySet()) {
            arrayMap.put(str, g0Var.f785a.get(str));
        }
        return new I(arrayList, a8, i, arrayList2, z, new H0(arrayMap), (C0064s) this.f270a0);
    }

    public void g(String str) {
        k kVar = (k) this.f267X;
        String y8 = kVar.y();
        if (!y8.contains(str)) {
            if (!y8.isEmpty()) {
                y8 = y8.concat(",");
            }
            kVar.V2("deniedPermissions", y8 + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021f, code lost:
        if (((Z1.c) r14.f9767W).n("killScreenshots", false) != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023f, code lost:
        if (r14.L1().equals("2") != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024b, code lost:
        if (r7.getApplicationContext().getApplicationInfo().targetSdkVersion < 30) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0257, code lost:
        if (((Z1.c) r14.f9767W).n("forceManageExternalStoragePermission", false) == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (n2.a.B0() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03c4, code lost:
        if (r14.N2(r11.r("actionBarQrScanButtonUrl", "")).isEmpty() != false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (n2.a.p0() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04f1, code lost:
        if (r13.n("disableIncomingCalls", false) == false) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0503, code lost:
        if (r13.n("disableOutgoingCalls", r2) != false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0565, code lost:
        if (r2.n("disableOutgoingCalls", false) == false) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x056b, code lost:
        if (n2.a.r0() == false) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0793, code lost:
        if (n2.a.p0() == false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x079d, code lost:
        if (r14.B2().booleanValue() == false) goto L_0x07a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0984, code lost:
        if (r14.m() < 598) goto L_0x0989;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0997, code lost:
        if (r14.m() >= r2) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013f, code lost:
        if (r14.c1().booleanValue() == false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x097e  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0987  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0993  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList h(boolean r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r3 = "screenOnOnMotion"
            r4 = 1
            java.lang.String r5 = "android.permission.PACKAGE_USAGE_STATS"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r0 = r1.f266W
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r8 = "power"
            java.lang.Object r0 = r0.getSystemService(r8)
            r8 = r0
            android.os.PowerManager r8 = (android.os.PowerManager) r8
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r7.getSystemService(r0)
            r9 = r0
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            r7.getPackageManager()
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            boolean r10 = de.ozerov.fully.C0794w0.Z(r7)
            r11 = 13
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "suppressAdminPermissionDialog"
            r13 = 0
            java.lang.Object r14 = r1.f267X
            d4.k r14 = (d4.k) r14
            if (r10 != 0) goto L_0x00a4
            boolean r10 = de.ozerov.fully.C0794w0.Y(r7)
            if (r10 != 0) goto L_0x00a4
            boolean r10 = de.ozerov.fully.P.y(r7)
            if (r10 != 0) goto L_0x00a4
            boolean r10 = de.ozerov.fully.P.z()
            if (r10 != 0) goto L_0x00a4
            java.lang.Object r10 = r14.f9767W
            Z1.c r10 = (Z1.c) r10
            boolean r10 = r10.n(r12, r13)
            if (r10 != 0) goto L_0x00a4
            if (r27 != 0) goto L_0x006b
            java.lang.String r10 = "android.permission.ADMIN2"
            boolean r10 = r1.i(r10)
            if (r10 != 0) goto L_0x00a4
        L_0x006b:
            if (r27 != 0) goto L_0x00a1
            java.lang.String r10 = "lockSafeMode"
            java.lang.Object r15 = r14.f9767W
            Z1.c r15 = (Z1.c) r15
            boolean r10 = r15.n(r10, r13)
            if (r10 == 0) goto L_0x0089
            java.lang.Boolean r10 = r14.c0()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0089
            boolean r10 = n2.a.B0()
            if (r10 == 0) goto L_0x00a1
        L_0x0089:
            java.lang.String r10 = "disableCamera"
            boolean r10 = r15.n(r10, r13)
            if (r10 == 0) goto L_0x00a4
            java.lang.Boolean r10 = r14.c0()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00a4
            boolean r10 = n2.a.p0()
            if (r10 != 0) goto L_0x00a4
        L_0x00a1:
            r6.add(r11)
        L_0x00a4:
            boolean r10 = de.ozerov.fully.C0794w0.Z(r7)
            java.lang.String r15 = ""
            if (r10 != 0) goto L_0x0148
            boolean r10 = de.ozerov.fully.C0794w0.X(r7)
            if (r10 != 0) goto L_0x0148
            boolean r10 = de.ozerov.fully.C0794w0.Y(r7)
            if (r10 != 0) goto L_0x0148
            if (r27 != 0) goto L_0x00c0
            boolean r10 = de.ozerov.fully.P.y(r7)
            if (r10 != 0) goto L_0x0148
        L_0x00c0:
            boolean r10 = de.ozerov.fully.P.z()
            if (r10 != 0) goto L_0x0148
            java.lang.Object r10 = r14.f9767W
            Z1.c r10 = (Z1.c) r10
            boolean r10 = r10.n(r12, r13)
            if (r10 != 0) goto L_0x0148
            if (r27 != 0) goto L_0x00da
            java.lang.String r10 = "android.permission.ADMIN"
            boolean r10 = r1.i(r10)
            if (r10 != 0) goto L_0x0148
        L_0x00da:
            boolean r10 = r6.contains(r11)
            if (r10 != 0) goto L_0x0148
            if (r27 != 0) goto L_0x0141
            java.lang.Boolean r10 = r14.B2()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0141
        L_0x00ed:
            java.lang.String r10 = "sleepTime"
            java.lang.Object r11 = r14.f9767W
            Z1.c r11 = (Z1.c) r11
            java.lang.String r10 = r11.r(r10, r15)
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x0141
            java.util.ArrayList r10 = de.ozerov.fully.C0726k3.a(r7)
            int r10 = r10.size()
            if (r10 > 0) goto L_0x0141
            int r10 = r14.r2()
            if (r10 > 0) goto L_0x0141
            java.lang.Boolean r10 = r14.J1()
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0141
            java.lang.String r10 = "screenOffInDarkness"
            boolean r10 = r11.n(r10, r13)
            if (r10 != 0) goto L_0x0141
            java.lang.String r10 = "sleepOnPowerConnect"
            boolean r10 = r11.n(r10, r13)
            if (r10 != 0) goto L_0x0141
            java.lang.String r10 = "sleepOnPowerDisconnect"
            boolean r10 = r11.n(r10, r13)
            if (r10 != 0) goto L_0x0141
            java.lang.String r10 = "forceDeviceAdmin"
            boolean r10 = r11.n(r10, r13)
            if (r10 != 0) goto L_0x0141
            java.lang.Boolean r10 = r14.c1()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0148
        L_0x0141:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r6.add(r10)
        L_0x0148:
            boolean r10 = n2.a.y0()
            java.lang.String r12 = "3"
            r2 = 3
            if (r10 == 0) goto L_0x080e
            java.lang.String r10 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r16 = n2.a.i0(r7, r10)
            r17 = 20
            r4 = 30
            if (r16 == 0) goto L_0x0260
            boolean r16 = n2.a.q0()
            if (r16 == 0) goto L_0x0260
            boolean r16 = android.os.Environment.isExternalStorageManager()
            if (r16 != 0) goto L_0x0260
            if (r27 != 0) goto L_0x0171
            boolean r10 = r1.i(r10)
            if (r10 != 0) goto L_0x0260
        L_0x0171:
            if (r27 == 0) goto L_0x017f
            android.content.Context r10 = r7.getApplicationContext()
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()
            int r10 = r10.targetSdkVersion
            if (r10 >= r4) goto L_0x0259
        L_0x017f:
            boolean r10 = r26.p()
            if (r10 != 0) goto L_0x0241
            java.lang.String r10 = r14.h2()
            java.lang.String r11 = "file://"
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x019b
            java.lang.String r10 = r14.h2()
            boolean r10 = n2.a.G0(r7, r10)
            if (r10 != 0) goto L_0x0241
        L_0x019b:
            java.lang.String r10 = r14.V1()
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x01af
            java.lang.String r10 = r14.V1()
            boolean r10 = n2.a.G0(r7, r10)
            if (r10 != 0) goto L_0x0241
        L_0x01af:
            java.lang.String r10 = r14.N()
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x01c3
            java.lang.String r10 = r14.N()
            boolean r10 = n2.a.G0(r7, r10)
            if (r10 != 0) goto L_0x0241
        L_0x01c3:
            java.lang.String r10 = r14.A2()
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x01d7
            java.lang.String r10 = r14.A2()
            boolean r10 = n2.a.G0(r7, r10)
            if (r10 != 0) goto L_0x0241
        L_0x01d7:
            java.lang.String r10 = r14.k()
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x01eb
            java.lang.String r10 = r14.k()
            boolean r10 = n2.a.G0(r7, r10)
            if (r10 != 0) goto L_0x0241
        L_0x01eb:
            java.lang.String r10 = r14.t()
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x01ff
            java.lang.String r10 = r14.t()
            boolean r10 = n2.a.G0(r7, r10)
            if (r10 != 0) goto L_0x0241
        L_0x01ff:
            r14.Q()
            r14.s()
            r14.w2()
            r14.p()
            java.lang.Boolean r10 = r14.c0()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0221
            java.lang.String r10 = "killScreenshots"
            java.lang.Object r11 = r14.f9767W
            Z1.c r11 = (Z1.c) r11
            boolean r10 = r11.n(r10, r13)
            if (r10 != 0) goto L_0x0241
        L_0x0221:
            java.lang.String r10 = r14.M1()
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0241
            java.lang.String r10 = r14.i1()
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0241
            java.lang.String r10 = r14.L1()
            java.lang.String r11 = "2"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x024d
        L_0x0241:
            android.content.Context r10 = r7.getApplicationContext()
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()
            int r10 = r10.targetSdkVersion
            if (r10 >= r4) goto L_0x0259
        L_0x024d:
            java.lang.String r10 = "forceManageExternalStoragePermission"
            java.lang.Object r11 = r14.f9767W
            Z1.c r11 = (Z1.c) r11
            boolean r10 = r11.n(r10, r13)
            if (r10 == 0) goto L_0x0260
        L_0x0259:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            r6.add(r10)
        L_0x0260:
            r10 = 33
            if (r27 != 0) goto L_0x026a
            boolean r11 = r26.k()
            if (r11 == 0) goto L_0x0306
        L_0x026a:
            if (r27 != 0) goto L_0x0278
            boolean r11 = n2.a.q0()
            if (r11 == 0) goto L_0x0278
            boolean r11 = android.os.Environment.isExternalStorageManager()
            if (r11 != 0) goto L_0x0306
        L_0x0278:
            if (r27 != 0) goto L_0x0284
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            boolean r11 = r6.contains(r11)
            if (r11 != 0) goto L_0x0306
        L_0x0284:
            boolean r11 = n2.a.E0()
            if (r11 == 0) goto L_0x02ee
            android.content.Context r11 = r7.getApplicationContext()
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()
            int r11 = r11.targetSdkVersion
            if (r11 < r10) goto L_0x02ee
            java.lang.String r11 = "android.permission.READ_MEDIA_IMAGES"
            boolean r18 = n2.a.i0(r7, r11)
            if (r18 == 0) goto L_0x02b5
            int r18 = r7.checkSelfPermission("android.permission.READ_MEDIA_IMAGES")
            if (r18 == 0) goto L_0x02b5
            if (r27 != 0) goto L_0x02ac
            boolean r11 = r1.i(r11)
            if (r11 != 0) goto L_0x02b5
        L_0x02ac:
            r11 = 22
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.add(r11)
        L_0x02b5:
            java.lang.String r11 = "android.permission.READ_MEDIA_VIDEO"
            boolean r18 = n2.a.i0(r7, r11)
            if (r18 == 0) goto L_0x02d4
            int r18 = r7.checkSelfPermission("android.permission.READ_MEDIA_VIDEO")
            if (r18 == 0) goto L_0x02d4
            if (r27 != 0) goto L_0x02cb
            boolean r11 = r1.i(r11)
            if (r11 != 0) goto L_0x02d4
        L_0x02cb:
            r11 = 23
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.add(r11)
        L_0x02d4:
            int r11 = r7.checkSelfPermission("android.permission.READ_MEDIA_AUDIO")
            if (r11 == 0) goto L_0x0306
            if (r27 != 0) goto L_0x02e4
            java.lang.String r11 = "android.permission.READ_MEDIA_AUDIO"
            boolean r11 = r1.i(r11)
            if (r11 != 0) goto L_0x0306
        L_0x02e4:
            r11 = 24
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.add(r11)
            goto L_0x0306
        L_0x02ee:
            int r11 = r7.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE")
            if (r11 == 0) goto L_0x0306
            if (r27 != 0) goto L_0x02fe
            java.lang.String r11 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r11 = r1.i(r11)
            if (r11 != 0) goto L_0x0306
        L_0x02fe:
            r11 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.add(r11)
        L_0x0306:
            int r11 = r7.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")
            if (r11 == 0) goto L_0x0351
            if (r27 != 0) goto L_0x0316
            java.lang.String r11 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r11 = r1.i(r11)
            if (r11 != 0) goto L_0x0351
        L_0x0316:
            if (r27 != 0) goto L_0x031e
            boolean r11 = r26.l()
            if (r11 == 0) goto L_0x0351
        L_0x031e:
            if (r27 != 0) goto L_0x032c
            boolean r11 = n2.a.q0()
            if (r11 == 0) goto L_0x032c
            boolean r11 = android.os.Environment.isExternalStorageManager()
            if (r11 != 0) goto L_0x0351
        L_0x032c:
            if (r27 != 0) goto L_0x0338
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            boolean r11 = r6.contains(r11)
            if (r11 != 0) goto L_0x0351
        L_0x0338:
            android.content.Context r11 = r7.getApplicationContext()
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo()
            int r11 = r11.targetSdkVersion
            if (r11 < r4) goto L_0x034a
            boolean r4 = n2.a.q0()
            if (r4 != 0) goto L_0x0351
        L_0x034a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6.add(r4)
        L_0x0351:
            int r4 = r7.checkSelfPermission("android.permission.CAMERA")
            if (r4 == 0) goto L_0x03ce
            if (r27 != 0) goto L_0x0361
            java.lang.String r4 = "android.permission.CAMERA"
            boolean r4 = r1.i(r4)
            if (r4 != 0) goto L_0x03ce
        L_0x0361:
            if (r27 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.s()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.w2()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.s1()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.B2()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x038c
            goto L_0x03c6
        L_0x038c:
            java.lang.String r4 = "webcamAccess"
            java.lang.Object r11 = r14.f9767W
            Z1.c r11 = (Z1.c) r11
            boolean r4 = r11.n(r4, r13)
            if (r4 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.M()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.J1()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03c6
            java.lang.Boolean r4 = r14.W1()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x03ce
            java.lang.String r4 = "actionBarQrScanButtonUrl"
            java.lang.String r4 = r11.r(r4, r15)
            java.lang.String r4 = r14.N2(r4)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x03ce
        L_0x03c6:
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.add(r4)
        L_0x03ce:
            int r4 = r7.checkSelfPermission("android.permission.RECORD_AUDIO")
            if (r4 == 0) goto L_0x0412
            if (r27 != 0) goto L_0x03de
            java.lang.String r4 = "android.permission.RECORD_AUDIO"
            boolean r4 = r1.i(r4)
            if (r4 != 0) goto L_0x0412
        L_0x03de:
            if (r27 != 0) goto L_0x040a
            java.lang.Boolean r4 = r14.p()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x040a
            java.lang.String r4 = "microphoneAccess"
            java.lang.Object r11 = r14.f9767W
            Z1.c r11 = (Z1.c) r11
            boolean r4 = r11.n(r4, r13)
            if (r4 != 0) goto L_0x040a
            java.lang.Boolean r4 = r14.t1()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x040a
            java.lang.Boolean r4 = r14.J1()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0412
        L_0x040a:
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.add(r4)
        L_0x0412:
            int r4 = r7.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION")
            java.lang.String r11 = "movementBeaconList"
            java.lang.String r2 = "1"
            if (r4 == 0) goto L_0x047e
            if (r27 != 0) goto L_0x0426
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = r1.i(r4)
            if (r4 != 0) goto L_0x047e
        L_0x0426:
            if (r27 != 0) goto L_0x0476
            java.lang.Object r4 = r14.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r10 = "geoLocationAccess"
            boolean r4 = r4.n(r10, r13)
            if (r4 != 0) goto L_0x0476
            java.lang.Boolean r4 = r14.J1()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0476
            java.lang.Boolean r4 = r14.A()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0476
            java.lang.String r4 = r14.e0()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0458
            boolean r4 = n2.a.p0()
            if (r4 != 0) goto L_0x0476
        L_0x0458:
            java.lang.String r4 = r14.F2()
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0468
            boolean r4 = n2.a.p0()
            if (r4 != 0) goto L_0x0476
        L_0x0468:
            java.lang.Object r4 = r14.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r4 = r4.r(r11, r15)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x047e
        L_0x0476:
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.add(r4)
        L_0x047e:
            int r4 = r7.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION")
            if (r4 == 0) goto L_0x04c2
            if (r27 != 0) goto L_0x048e
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r4 = r1.i(r4)
            if (r4 != 0) goto L_0x04c2
        L_0x048e:
            if (r27 != 0) goto L_0x04ba
            java.lang.String r4 = r14.F2()
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x04a0
            boolean r4 = n2.a.p0()
            if (r4 == 0) goto L_0x04ba
        L_0x04a0:
            java.lang.String r4 = r14.e0()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x04b0
            boolean r2 = n2.a.p0()
            if (r2 == 0) goto L_0x04ba
        L_0x04b0:
            java.lang.Boolean r2 = r14.J1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x04c2
        L_0x04ba:
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.add(r2)
        L_0x04c2:
            boolean r2 = n2.a.C0()
            java.lang.String r4 = "disableOutgoingCalls"
            java.lang.String r10 = "disableIncomingCalls"
            if (r2 == 0) goto L_0x050e
            int r2 = r7.checkSelfPermission("android.permission.ANSWER_PHONE_CALLS")
            if (r2 == 0) goto L_0x050e
            if (r27 != 0) goto L_0x04dc
            java.lang.String r2 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r2 = r1.i(r2)
            if (r2 != 0) goto L_0x050e
        L_0x04dc:
            if (r27 != 0) goto L_0x0505
            java.lang.Boolean r2 = r14.c0()
            boolean r2 = r2.booleanValue()
            java.lang.Object r13 = r14.f9767W
            Z1.c r13 = (Z1.c) r13
            if (r2 == 0) goto L_0x04f4
            r2 = 0
            boolean r19 = r13.n(r10, r2)
            if (r19 != 0) goto L_0x0505
            goto L_0x04f5
        L_0x04f4:
            r2 = 0
        L_0x04f5:
            java.lang.Boolean r19 = r14.c0()
            boolean r19 = r19.booleanValue()
            if (r19 == 0) goto L_0x050e
            boolean r13 = r13.n(r4, r2)
            if (r13 == 0) goto L_0x050e
        L_0x0505:
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.add(r2)
        L_0x050e:
            int r2 = r7.checkSelfPermission("android.permission.READ_PHONE_STATE")
            if (r2 == 0) goto L_0x0576
            if (r27 != 0) goto L_0x051e
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r2 = r1.i(r2)
            if (r2 != 0) goto L_0x0576
        L_0x051e:
            if (r27 != 0) goto L_0x056d
            java.lang.Boolean r2 = r14.B2()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0536
            boolean r2 = n2.a.p0()
            if (r2 == 0) goto L_0x056d
            boolean r2 = de.ozerov.fully.C0794w0.Z(r7)
            if (r2 != 0) goto L_0x056d
        L_0x0536:
            java.lang.Boolean r2 = r14.J1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x054c
            boolean r2 = n2.a.p0()
            if (r2 == 0) goto L_0x056d
            boolean r2 = de.ozerov.fully.C0794w0.Z(r7)
            if (r2 != 0) goto L_0x056d
        L_0x054c:
            java.lang.Boolean r2 = r14.c0()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0576
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r13 = 0
            boolean r10 = r2.n(r10, r13)
            if (r10 != 0) goto L_0x0567
            boolean r2 = r2.n(r4, r13)
            if (r2 == 0) goto L_0x0576
        L_0x0567:
            boolean r2 = n2.a.r0()
            if (r2 == 0) goto L_0x0576
        L_0x056d:
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.add(r2)
        L_0x0576:
            int r2 = r7.checkSelfPermission("android.permission.BLUETOOTH_CONNECT")
            if (r2 == 0) goto L_0x05d5
            if (r27 != 0) goto L_0x0586
            java.lang.String r2 = "android.permission.BLUETOOTH_CONNECT"
            boolean r2 = r1.i(r2)
            if (r2 != 0) goto L_0x05d5
        L_0x0586:
            boolean r2 = n2.a.r0()
            if (r2 == 0) goto L_0x05d5
            if (r27 != 0) goto L_0x05cc
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r4 = "bluetoothMode"
            java.lang.String r10 = "0"
            java.lang.String r2 = r2.r(r4, r10)
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x05cc
            java.lang.String r2 = r14.B()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x05cc
            java.lang.Boolean r2 = r14.B2()
            boolean r2 = r2.booleanValue()
            r4 = 1031(0x407, float:1.445E-42)
            if (r2 == 0) goto L_0x05bc
            int r2 = r14.m()
            if (r2 >= r4) goto L_0x05cc
        L_0x05bc:
            java.lang.Boolean r2 = r14.J1()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05d5
            int r2 = r14.m()
            if (r2 < r4) goto L_0x05d5
        L_0x05cc:
            r2 = 21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.add(r2)
        L_0x05d5:
            boolean r2 = n2.a.r0()
            if (r2 == 0) goto L_0x061b
            int r2 = r7.checkSelfPermission("android.permission.BLUETOOTH_SCAN")
            if (r2 == 0) goto L_0x061b
            if (r27 != 0) goto L_0x05eb
            java.lang.String r2 = "android.permission.BLUETOOTH_SCAN"
            boolean r2 = r1.i(r2)
            if (r2 != 0) goto L_0x061b
        L_0x05eb:
            if (r27 != 0) goto L_0x0602
            java.lang.Boolean r2 = r14.A()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0605
            java.lang.Boolean r2 = r14.B2()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0602
            goto L_0x0605
        L_0x0602:
            r2 = 26
            goto L_0x0614
        L_0x0605:
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r2 = r2.r(r11, r15)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x061b
            goto L_0x0602
        L_0x0614:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6.add(r4)
        L_0x061b:
            boolean r2 = n2.a.E0()
            if (r2 == 0) goto L_0x066e
            android.content.Context r2 = r7.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r4 = 33
            if (r2 < r4) goto L_0x066e
            int r2 = r7.checkSelfPermission("android.permission.POST_NOTIFICATIONS")
            if (r2 == 0) goto L_0x066e
            if (r27 != 0) goto L_0x063f
            java.lang.String r2 = "android.permission.POST_NOTIFICATIONS"
            boolean r2 = r1.i(r2)
            if (r2 != 0) goto L_0x066e
        L_0x063f:
            if (r27 != 0) goto L_0x0665
            java.lang.Boolean r2 = r14.B2()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0665
            java.lang.Boolean r2 = r14.J1()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0665
            java.lang.Boolean r2 = r14.c0()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x066e
            boolean r2 = de.ozerov.fully.ForegroundService.f(r7)
            if (r2 == 0) goto L_0x066e
        L_0x0665:
            r2 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.add(r2)
        L_0x066e:
            boolean r2 = n2.a.r0()
            if (r2 == 0) goto L_0x06d5
            android.content.Context r2 = r7.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r4 = 34
            if (r2 < r4) goto L_0x06d5
            boolean r0 = r0.canScheduleExactAlarms()
            if (r0 != 0) goto L_0x06d5
            if (r27 != 0) goto L_0x0692
            java.lang.String r0 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x06d5
        L_0x0692:
            if (r27 != 0) goto L_0x06cc
            java.lang.Boolean r0 = r14.B2()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x06cc
            java.lang.Boolean r0 = r14.J1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x06cc
            java.lang.Boolean r0 = r14.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x06bc
            java.lang.Boolean r0 = r14.P1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x06cc
        L_0x06bc:
            java.lang.String r0 = "sleepSchedule"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r0 = r2.r(r0, r15)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06d5
        L_0x06cc:
            r0 = 27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x06d5:
            boolean r0 = android.provider.Settings.canDrawOverlays(r7)
            java.lang.String r2 = "forceScreenOrientationGlobal"
            if (r0 != 0) goto L_0x07a8
            if (r27 != 0) goto L_0x06e7
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x07a8
        L_0x06e7:
            if (r27 != 0) goto L_0x06ef
            boolean r0 = de.ozerov.fully.P.y(r7)
            if (r0 != 0) goto L_0x07a8
        L_0x06ef:
            boolean r0 = de.ozerov.fully.P.x(r7)
            if (r0 == 0) goto L_0x06fb
            boolean r0 = n2.a.p0()
            if (r0 != 0) goto L_0x07a8
        L_0x06fb:
            if (r27 != 0) goto L_0x079f
            java.lang.Boolean r0 = r14.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0711
            java.lang.Boolean r0 = r14.F()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x079f
        L_0x0711:
            java.lang.Boolean r0 = r14.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0721
            boolean r0 = n2.a.p0()
            if (r0 != 0) goto L_0x079f
        L_0x0721:
            java.lang.Boolean r0 = r14.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0735
            java.lang.Boolean r0 = r14.g2()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x079f
        L_0x0735:
            int r0 = r14.q2()
            if (r0 > 0) goto L_0x079f
            int r0 = r14.o2()
            if (r0 > 0) goto L_0x079f
            int r0 = r14.p1()
            if (r0 > 0) goto L_0x079f
            java.lang.String r0 = "touchesOtherAppsBreakIdle"
            java.lang.Object r4 = r14.f9767W
            Z1.c r4 = (Z1.c) r4
            r10 = 0
            boolean r0 = r4.n(r0, r10)
            if (r0 != 0) goto L_0x079f
            java.lang.String r0 = r14.A2()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x079f
            java.lang.Boolean r0 = r14.J1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x079f
            java.lang.Boolean r0 = r14.s1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x079f
            int r0 = r14.r()
            if (r0 > 0) goto L_0x079f
            java.lang.String r0 = "forceImmersive"
            r10 = 0
            boolean r0 = r4.n(r0, r10)
            if (r0 != 0) goto L_0x079f
            boolean r0 = r4.n(r2, r10)
            if (r0 != 0) goto L_0x079f
            java.lang.String r0 = "launchOnBoot"
            boolean r0 = r4.n(r0, r10)
            if (r0 == 0) goto L_0x0795
            boolean r0 = n2.a.p0()
            if (r0 != 0) goto L_0x079f
        L_0x0795:
            java.lang.Boolean r0 = r14.B2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x07a8
        L_0x079f:
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x07a8:
            boolean r0 = android.provider.Settings.System.canWrite(r7)
            if (r0 != 0) goto L_0x080e
            if (r27 != 0) goto L_0x07b8
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x080e
        L_0x07b8:
            if (r27 != 0) goto L_0x07c0
            boolean r0 = de.ozerov.fully.P.y(r7)
            if (r0 != 0) goto L_0x080e
        L_0x07c0:
            if (r27 != 0) goto L_0x0805
            java.lang.Boolean r0 = r14.J1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0805
            int r0 = r14.R1()
            r4 = -1
            if (r0 != r4) goto L_0x0805
            java.lang.Boolean r0 = r14.a0()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0805
            int r0 = r14.S1()
            if (r0 != r4) goto L_0x0805
            java.lang.Object r0 = r14.f9767W
            Z1.c r0 = (Z1.c) r0
            r4 = 0
            boolean r0 = r0.n(r2, r4)
            if (r0 != 0) goto L_0x0805
            java.lang.Boolean r0 = r14.B2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x07f9
            goto L_0x0805
        L_0x07f9:
            java.lang.String r0 = r14.V1()
            java.lang.String r2 = "dim:"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x080e
        L_0x0805:
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x080e:
            java.lang.String r0 = "usagestats"
            java.lang.Object r0 = r7.getSystemService(r0)
            r20 = r0
            android.app.usage.UsageStatsManager r20 = (android.app.usage.UsageStatsManager) r20
            long r24 = java.lang.System.currentTimeMillis()
            r10 = 10000(0x2710, double:4.9407E-320)
            long r22 = r24 - r10
            r21 = 0
            java.util.List r0 = r20.queryUsageStats(r21, r22, r24)     // Catch:{ Exception -> 0x0833 }
            if (r0 == 0) goto L_0x0835
            boolean r2 = r0.isEmpty()     // Catch:{ Exception -> 0x0833 }
            if (r2 != 0) goto L_0x0835
            r0.size()     // Catch:{ Exception -> 0x0833 }
            goto L_0x08e0
        L_0x0833:
            r0 = move-exception
            goto L_0x0860
        L_0x0835:
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r7.getSystemService(r0)     // Catch:{ Exception -> 0x0833 }
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch:{ Exception -> 0x0833 }
            java.lang.String r2 = "android:get_usage_stats"
            int r4 = android.os.Process.myUid()     // Catch:{ Exception -> 0x0833 }
            java.lang.String r10 = r7.getPackageName()     // Catch:{ Exception -> 0x0833 }
            int r0 = r0.checkOpNoThrow(r2, r4, r10)     // Catch:{ Exception -> 0x0833 }
            r2 = 3
            if (r0 != r2) goto L_0x085c
            boolean r2 = n2.a.y0()     // Catch:{ Exception -> 0x0833 }
            if (r2 == 0) goto L_0x085c
            int r0 = r7.checkCallingOrSelfPermission(r5)     // Catch:{ Exception -> 0x0833 }
            if (r0 != 0) goto L_0x086c
            goto L_0x08e0
        L_0x085c:
            if (r0 != 0) goto L_0x086c
            goto L_0x08e0
        L_0x0860:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed checking usage stats permission due to "
            r2.<init>(r4)
            java.lang.String r4 = "w0"
            Q0.g.x(r0, r2, r4)
        L_0x086c:
            java.lang.String r0 = "deviceSupportsUsageAccess"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r4 = 1
            boolean r0 = r2.n(r0, r4)
            if (r0 == 0) goto L_0x08e0
            if (r27 != 0) goto L_0x0881
            boolean r0 = r1.i(r5)
            if (r0 != 0) goto L_0x08e0
        L_0x0881:
            if (r27 != 0) goto L_0x0889
            boolean r0 = de.ozerov.fully.P.y(r7)
            if (r0 != 0) goto L_0x08e0
        L_0x0889:
            if (r27 != 0) goto L_0x08d7
            boolean r0 = N5.k.e(r7)
            if (r0 != 0) goto L_0x08d7
            java.lang.Boolean r0 = r14.J1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x08d7
            java.lang.Boolean r0 = r14.B2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x08a6
            goto L_0x08d7
        L_0x08a6:
            java.lang.String r0 = "pauseMotionInBackground"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r4 = 0
            boolean r0 = r2.n(r0, r4)
            if (r0 != 0) goto L_0x08d7
            java.lang.Boolean r0 = r14.T1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x08d7
            int r0 = r14.q2()
            if (r0 > 0) goto L_0x08d7
            java.lang.String r0 = r14.M1()
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x08d7
            java.lang.String r0 = r14.i1()
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x08e0
        L_0x08d7:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x08e0:
            boolean r0 = n2.a.y0()
            if (r0 == 0) goto L_0x09a2
            if (r8 == 0) goto L_0x09a2
            java.lang.String r0 = r7.getPackageName()
            boolean r0 = r8.isIgnoringBatteryOptimizations(r0)
            if (r0 != 0) goto L_0x09a2
            if (r27 != 0) goto L_0x08fc
            java.lang.String r0 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x09a2
        L_0x08fc:
            if (r27 != 0) goto L_0x0904
            boolean r0 = de.ozerov.fully.P.y(r7)
            if (r0 != 0) goto L_0x09a2
        L_0x0904:
            boolean r0 = de.ozerov.fully.P.D(r7)
            if (r0 == 0) goto L_0x0910
            boolean r0 = n2.a.C0()
            if (r0 == 0) goto L_0x09a2
        L_0x0910:
            if (r27 != 0) goto L_0x0999
            java.lang.Boolean r0 = r14.E1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0999
            java.util.ArrayList r0 = de.ozerov.fully.C0726k3.a(r7)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x092e
            int r0 = r14.m()
            r2 = 1195(0x4ab, float:1.675E-42)
            if (r0 >= r2) goto L_0x0999
        L_0x092e:
            java.lang.Boolean r0 = r14.s1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0951
            int r0 = r14.r2()
            if (r0 <= 0) goto L_0x0951
            java.lang.Object r0 = r14.f9767W
            Z1.c r0 = (Z1.c) r0
            r2 = 1
            boolean r0 = r0.n(r3, r2)
            if (r0 == 0) goto L_0x0951
            int r0 = r14.m()
            r2 = 550(0x226, float:7.71E-43)
            if (r0 >= r2) goto L_0x0999
        L_0x0951:
            java.lang.Boolean r0 = r14.t1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0974
            int r0 = r14.r2()
            if (r0 <= 0) goto L_0x0974
            java.lang.Object r0 = r14.f9767W
            Z1.c r0 = (Z1.c) r0
            r2 = 1
            boolean r0 = r0.n(r3, r2)
            if (r0 == 0) goto L_0x0974
            int r0 = r14.m()
            r2 = 947(0x3b3, float:1.327E-42)
            if (r0 >= r2) goto L_0x0999
        L_0x0974:
            java.lang.Boolean r0 = r14.J1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0987
            int r0 = r14.m()
            r2 = 598(0x256, float:8.38E-43)
            if (r0 >= r2) goto L_0x0999
            goto L_0x0989
        L_0x0987:
            r2 = 598(0x256, float:8.38E-43)
        L_0x0989:
            java.lang.Boolean r0 = r14.B2()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x09a2
            int r0 = r14.m()
            if (r0 < r2) goto L_0x09a2
        L_0x0999:
            r0 = 15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x09a2:
            boolean r0 = n2.a.z0()
            if (r0 == 0) goto L_0x09fb
            if (r9 == 0) goto L_0x09fb
            boolean r0 = r9.isNotificationPolicyAccessGranted()
            if (r0 != 0) goto L_0x09fb
            if (r27 != 0) goto L_0x09ba
            java.lang.String r0 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x09fb
        L_0x09ba:
            if (r27 != 0) goto L_0x09c2
            boolean r0 = de.ozerov.fully.P.y(r7)
            if (r0 != 0) goto L_0x09fb
        L_0x09c2:
            if (r27 != 0) goto L_0x09f2
            java.lang.Boolean r0 = r14.y1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x09db
            java.lang.String r0 = "playAlarmSoundOnMovement"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r3 = 1
            boolean r0 = r2.n(r0, r3)
            if (r0 != 0) goto L_0x09f2
        L_0x09db:
            java.lang.String r0 = "forceDndInKioskMode"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r3 = 0
            boolean r0 = r2.n(r0, r3)
            if (r0 == 0) goto L_0x09fb
            java.lang.Boolean r0 = r14.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x09fb
        L_0x09f2:
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x09fb:
            boolean r0 = n2.a.B0()
            if (r0 == 0) goto L_0x0a5f
            int r0 = n2.a.b0(r7)
            r2 = 26
            if (r0 < r2) goto L_0x0a5f
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            boolean r0 = r0.canRequestPackageInstalls()
            if (r0 != 0) goto L_0x0a5f
            if (r27 != 0) goto L_0x0a1d
            java.lang.String r0 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x0a5f
        L_0x0a1d:
            boolean r0 = de.ozerov.fully.C0794w0.Z(r7)
            if (r0 == 0) goto L_0x0a30
            java.lang.String r0 = "mdmDisableAppsFromUnknownSources"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r3 = 1
            boolean r0 = r2.n(r0, r3)
            if (r0 != 0) goto L_0x0a5f
        L_0x0a30:
            if (r27 != 0) goto L_0x0a56
            java.lang.Boolean r0 = r14.J1()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0a56
            java.lang.Boolean r0 = r14.B2()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0a56
            java.lang.String r0 = "mdmApkToInstall"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            java.lang.String r0 = r2.r(r0, r15)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a5f
        L_0x0a56:
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x0a5f:
            java.util.Set r0 = j0.l.a(r7)
            java.lang.String r2 = r7.getPackageName()
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0a9b
            if (r27 != 0) goto L_0x0a79
            java.lang.String r0 = "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
            boolean r0 = r1.i(r0)
            if (r0 != 0) goto L_0x0a9b
        L_0x0a79:
            if (r27 != 0) goto L_0x0a92
            java.lang.Object r0 = r14.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r2 = "disableNotifications"
            r3 = 0
            boolean r0 = r0.n(r2, r3)
            if (r0 == 0) goto L_0x0a9b
            java.lang.Boolean r0 = r14.c0()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0a9b
        L_0x0a92:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x0a9b:
            boolean r0 = n2.a.z0()
            if (r0 == 0) goto L_0x0ad3
            java.lang.String r0 = "enableWriteSdCard"
            java.lang.Object r2 = r14.f9767W
            Z1.c r2 = (Z1.c) r2
            r3 = 0
            boolean r0 = r2.n(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0ad3
            java.io.File r0 = n2.a.J(r7)
            if (r0 == 0) goto L_0x0ad3
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.util.List r0 = r0.getPersistedUriPermissions()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0ad3
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
        L_0x0ad3:
            r6.size()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B.j0.h(boolean):java.util.ArrayList");
    }

    public boolean i(String str) {
        return ((k) this.f267X).y().contains(str);
    }

    public Surface j() {
        Surface j7;
        synchronized (this.f266W) {
            j7 = ((Z) this.f267X).j();
        }
        return j7;
    }

    public boolean k() {
        if (p()) {
            return true;
        }
        k kVar = (k) this.f267X;
        if (kVar.J1().booleanValue() || kVar.B2().booleanValue()) {
            return true;
        }
        boolean contains = kVar.h2().contains("file://");
        Activity activity = (Activity) this.f266W;
        if (contains && a.G0(activity, kVar.h2())) {
            return true;
        }
        if (kVar.V1().startsWith("file://") && a.G0(activity, kVar.V1())) {
            return true;
        }
        if (kVar.N().startsWith("file://") && a.G0(activity, kVar.N())) {
            return true;
        }
        if (kVar.A2().startsWith("file://") && a.G0(activity, kVar.A2())) {
            return true;
        }
        if (kVar.k().startsWith("file://") && a.G0(activity, kVar.k())) {
            return true;
        }
        if (kVar.t().startsWith("file://") && a.G0(activity, kVar.t())) {
            return true;
        }
        kVar.Q();
        kVar.s();
        kVar.w2();
        kVar.p();
        boolean booleanValue = kVar.c0().booleanValue();
        c cVar = (c) kVar.f9767W;
        if (booleanValue && cVar.n("killScreenshots", false)) {
            return true;
        }
        if (kVar.c0().booleanValue() && a.u0() && cVar.n("autoImportSettings", true) && kVar.m() >= 550) {
            return true;
        }
        if ((!kVar.h1().isEmpty() && a.u0()) || kVar.L().booleanValue()) {
            return true;
        }
        if (kVar.M1().equals("1") && a.u0()) {
            return true;
        }
        if (kVar.M1().equals("3") && a.u0()) {
            return true;
        }
        if (kVar.M1().equals("5") && a.u0()) {
            return true;
        }
        if (kVar.M1().equals("6") && a.u0()) {
            return true;
        }
        if (kVar.i1().equals("1") && a.u0()) {
            return true;
        }
        if (kVar.i1().equals("3") && a.u0()) {
            return true;
        }
        if (kVar.i1().equals("4") && a.u0()) {
            return true;
        }
        if (kVar.L1().equals("2") && a.u0()) {
            return true;
        }
        if (kVar.L1().equals("5") && a.u0()) {
            return true;
        }
        if (!kVar.L1().equals("6") || !a.u0()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        k kVar = (k) this.f267X;
        if (!kVar.J1().booleanValue() && !kVar.B2().booleanValue()) {
            kVar.Q();
            kVar.s();
            kVar.w2();
            kVar.p();
            boolean booleanValue = kVar.c0().booleanValue();
            c cVar = (c) kVar.f9767W;
            if ((!booleanValue || !cVar.n("killScreenshots", false)) && ((kVar.h1().isEmpty() || !a.u0()) && ((cVar.r("mdmApkToInstall", "").isEmpty() || !a.u0()) && ((!kVar.M1().equals("1") || !a.u0()) && ((!kVar.M1().equals("3") || !a.u0()) && ((!kVar.M1().equals("5") || !a.u0()) && ((!kVar.M1().equals("6") || !a.u0()) && ((!kVar.i1().equals("1") || !a.u0()) && ((!kVar.i1().equals("3") || !a.u0()) && ((!kVar.i1().equals("4") || !a.u0()) && ((!kVar.L1().equals("2") || !a.u0()) && ((!kVar.L1().equals("5") || !a.u0()) && (!kVar.L1().equals("6") || !a.u0()))))))))))))) {
                return false;
            }
        }
        return true;
    }

    public boolean m() {
        return !h(false).isEmpty();
    }

    public void n(boolean z, boolean z6, Runnable runnable) {
        String str;
        ArrayList h5 = h(z6);
        boolean isEmpty = h5.isEmpty();
        Activity activity = (Activity) this.f266W;
        if (!isEmpty) {
            int i = this.f264U + 1;
            this.f264U = i;
            if (!z && i <= 4) {
                q(h5);
            } else if (((AlertDialog) this.f270a0) == null || !this.f265V) {
                ArrayList arrayList = new ArrayList();
                Iterator it = h5.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    HashMap hashMap = (HashMap) this.f268Y;
                    if (hashMap.containsKey(num)) {
                        arrayList.add((String) hashMap.get(num));
                    }
                }
                View inflate = activity.getLayoutInflater().inflate(2131558574, (ViewGroup) null);
                ((ListView) inflate.findViewById(2131362371)).setAdapter(new ArrayAdapter(activity, 2131558575, arrayList));
                ((TextView) inflate.findViewById(2131362369)).setText("Fully requires some additional permissions in order to make its job properly:");
                TextView textView = (TextView) inflate.findViewById(2131362370);
                StringBuilder sb = new StringBuilder("Please press OK");
                if (C0794w0.g0(activity)) {
                    str = ", unlock device";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(" and grant permissions in subsequent dialogs.");
                textView.setText(sb.toString());
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setTitle("Permissions required");
                builder.setView(inflate);
                builder.setCancelable(false);
                if (this.f264U > 4 || (P.D(activity) && h5.size() == 1 && ((Integer) h5.get(0)).intValue() == 5)) {
                    if (this.f264U > 4) {
                        textView.append("\n\nSome permissions are still missing.");
                    } else {
                        textView.append("\n\nIn Fire OS 7 the granted microphone permission gets lost sometimes. This is a Fire OS issue and nothing we can fix.");
                    }
                    textView.append(" You can press the IGNORE button to stop us asking for these permissions. However some features might work not correctly after that.");
                    builder.setNeutralButton("Ignore", new C0720j3(this, h5, runnable));
                }
                builder.setPositiveButton("OK", new C0736m1(this, 2, h5));
                builder.setNegativeButton("Cancel", new C0736m1(this, 3, runnable));
                AlertDialog create = builder.create();
                this.f270a0 = create;
                a.Z0(create);
                this.f265V = true;
            }
        } else if (z6) {
            a.a1(1, activity, "All permissions already granted");
        }
    }

    public W o() {
        N n4;
        synchronized (this.f266W) {
            W o2 = ((Z) this.f267X).o();
            if (o2 != null) {
                this.f264U++;
                n4 = new N(o2);
                n4.k((M) this.f270a0);
            } else {
                n4 = null;
            }
        }
        return n4;
    }

    public boolean p() {
        Activity activity = (Activity) this.f266W;
        Iterator it = O2.b(activity, "screensaverPlaylist").iterator();
        while (it.hasNext()) {
            O2 o2 = (O2) it.next();
            int i = o2.f10216b;
            if ((i == 2 || i == 3) && a.w0(activity, new File(o2.f10215a))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x032a A[SYNTHETIC, Splitter:B:84:0x032a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(java.util.ArrayList r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r0)
            java.lang.Object r4 = r1.f269Z
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r5 = r1.f268Y
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r6 = "Failed to get permission for "
            java.lang.String r7 = "j0"
            java.lang.Object r9 = r1.f266W
            android.app.Activity r9 = (android.app.Activity) r9
            java.lang.String r10 = "package:"
            if (r3 == 0) goto L_0x006d
            boolean r3 = n2.a.B0()
            if (r3 == 0) goto L_0x006d
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x004a }
            java.lang.String r12 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            java.lang.String r13 = r9.getPackageName()     // Catch:{ Exception -> 0x004a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004a }
            r14.<init>(r10)     // Catch:{ Exception -> 0x004a }
            r14.append(r13)     // Catch:{ Exception -> 0x004a }
            java.lang.String r13 = r14.toString()     // Catch:{ Exception -> 0x004a }
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x004a }
            r3.<init>(r12, r13)     // Catch:{ Exception -> 0x004a }
            r12 = 1016(0x3f8, float:1.424E-42)
            r9.startActivityForResult(r3, r12)     // Catch:{ Exception -> 0x004a }
            r0 = 1
            goto L_0x006e
        L_0x004a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            java.lang.Object r12 = r5.get(r0)
            java.lang.String r12 = (java.lang.String) r12
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            n2.a.b1(r9, r3)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "Package install permission failed and denied permanently"
            android.util.Log.e(r7, r0)
        L_0x006d:
            r0 = 0
        L_0x006e:
            r3 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x00cd
            boolean r12 = n2.a.y0()
            if (r12 == 0) goto L_0x00cd
            android.content.Intent r12 = new android.content.Intent
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r10)
            java.lang.String r14 = r9.getPackageName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r14 = "android.settings.action.MANAGE_WRITE_SETTINGS"
            r12.<init>(r14, r13)
            r13 = 1002(0x3ea, float:1.404E-42)
            r9.startActivityForResult(r12, r13)     // Catch:{ Exception -> 0x00a2 }
            r3 = 1
            goto L_0x00ce
        L_0x00a2:
            java.lang.String r12 = "Write settings permission failed and denied permanently"
            android.util.Log.e(r7, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Object r13 = r5.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            n2.a.b1(r9, r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.g(r3)
        L_0x00cd:
            r3 = r0
        L_0x00ce:
            r12 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0157
            boolean r0 = de.ozerov.fully.P.D(r9)
            java.lang.String r13 = "deviceSupportsUsageAccess"
            java.lang.Object r14 = r1.f267X
            d4.k r14 = (d4.k) r14
            r15 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r8 = "android.settings.USAGE_ACCESS_SETTINGS"
            if (r0 == 0) goto L_0x011d
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0100 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0100 }
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ Exception -> 0x0100 }
            java.lang.String r12 = "com.android.settings"
            java.lang.String r11 = "com.android.settings.Settings$UsageAccessSettingsActivity"
            r8.<init>(r12, r11)     // Catch:{ Exception -> 0x0100 }
            r0.setComponent(r8)     // Catch:{ Exception -> 0x0100 }
            r9.startActivityForResult(r0, r15)     // Catch:{ Exception -> 0x0100 }
        L_0x00fe:
            r3 = 1
            goto L_0x0157
        L_0x0100:
            r0 = move-exception
            java.lang.String r8 = "Usage permission failed (2) and denied permanently"
            android.util.Log.e(r7, r8)
            r0.printStackTrace()
            r8 = 0
            r14.R2(r13, r8)
            r8 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            goto L_0x0157
        L_0x011d:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0126 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0126 }
            r9.startActivityForResult(r0, r15)     // Catch:{ Exception -> 0x0126 }
            goto L_0x00fe
        L_0x0126:
            java.lang.String r0 = "Usage permission failed (1) and denied permanently"
            android.util.Log.e(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r8 = 11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            n2.a.b1(r9, r0)
            r11 = 0
            r14.R2(r13, r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
        L_0x0157:
            r0 = 9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x01b6
            boolean r8 = n2.a.y0()
            if (r8 == 0) goto L_0x01b6
            android.content.Intent r8 = new android.content.Intent
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r12 = r9.getPackageName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r12 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r8.<init>(r12, r11)
            r11 = 1001(0x3e9, float:1.403E-42)
            r9.startActivityForResult(r8, r11)     // Catch:{ Exception -> 0x018b }
            r3 = 1
            goto L_0x01b6
        L_0x018b:
            java.lang.String r8 = "Overlay permission failed"
            android.util.Log.e(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
        L_0x01b6:
            r0 = 12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x0201
            boolean r8 = n2.a.z0()
            if (r8 == 0) goto L_0x0201
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r11 = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"
            r8.<init>(r11)     // Catch:{ Exception -> 0x01d6 }
            r11 = 1004(0x3ec, float:1.407E-42)
            r9.startActivityForResult(r8, r11)     // Catch:{ Exception -> 0x01d6 }
            r3 = 1
            goto L_0x0201
        L_0x01d6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "DND change permission intent failed and denied permanently"
            android.util.Log.e(r7, r0)
        L_0x0201:
            r0 = 27
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x0260
            boolean r8 = n2.a.r0()
            if (r8 == 0) goto L_0x0260
            android.content.Intent r8 = new android.content.Intent
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r12 = r9.getPackageName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r12 = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"
            r8.<init>(r12, r11)
            r11 = 1027(0x403, float:1.439E-42)
            r9.startActivityForResult(r8, r11)     // Catch:{ Exception -> 0x0235 }
            r3 = 1
            goto L_0x0260
        L_0x0235:
            java.lang.String r8 = "Schedule exact alarm permission failed and denied permanently"
            android.util.Log.e(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
        L_0x0260:
            r0 = 19
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x02bf
            boolean r8 = n2.a.q0()
            if (r8 == 0) goto L_0x02bf
            android.content.Intent r8 = new android.content.Intent
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r12 = r9.getPackageName()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r12 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r8.<init>(r12, r11)
            r11 = 1020(0x3fc, float:1.43E-42)
            r9.startActivityForResult(r8, r11)     // Catch:{ Exception -> 0x0294 }
            r3 = 1
            goto L_0x02bf
        L_0x0294:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "Disable permission auto-reset failed and denied permanently"
            android.util.Log.e(r7, r0)
        L_0x02bf:
            r0 = 20
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x031e
            boolean r8 = n2.a.q0()
            if (r8 == 0) goto L_0x031e
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r11 = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02f3 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r13 = r9.getPackageName()     // Catch:{ Exception -> 0x02f3 }
            r12.append(r13)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x02f3 }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x02f3 }
            r8.<init>(r11, r12)     // Catch:{ Exception -> 0x02f3 }
            r11 = 1021(0x3fd, float:1.431E-42)
            r9.startActivityForResult(r8, r11)     // Catch:{ Exception -> 0x02f3 }
            r3 = 1
            goto L_0x031e
        L_0x02f3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "Manage storage permission failed and denied permanently"
            android.util.Log.e(r7, r0)
        L_0x031e:
            r0 = 16
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x03b6
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x038b }
            r8.<init>()     // Catch:{ Exception -> 0x038b }
            boolean r11 = n2.a.q0()     // Catch:{ Exception -> 0x038b }
            java.lang.Class<de.ozerov.fully.NotificationService> r12 = de.ozerov.fully.NotificationService.class
            if (r11 == 0) goto L_0x0351
            int r11 = de.ozerov.fully.NotificationService.f10166V     // Catch:{ Exception -> 0x038b }
            android.content.ComponentName r11 = new android.content.ComponentName     // Catch:{ Exception -> 0x038b }
            android.content.Context r13 = r9.getApplicationContext()     // Catch:{ Exception -> 0x038b }
            r11.<init>(r13, r12)     // Catch:{ Exception -> 0x038b }
            java.lang.String r12 = "android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS"
            r8.setAction(r12)     // Catch:{ Exception -> 0x038b }
            java.lang.String r12 = "android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME"
            java.lang.String r11 = r11.flattenToString()     // Catch:{ Exception -> 0x038b }
            r8.putExtra(r12, r11)     // Catch:{ Exception -> 0x038b }
            goto L_0x0384
        L_0x0351:
            java.lang.String r11 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            r8.setAction(r11)     // Catch:{ Exception -> 0x038b }
            java.lang.String r11 = ":settings:fragment_args_key"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x038b }
            r13.<init>()     // Catch:{ Exception -> 0x038b }
            java.lang.String r14 = r9.getPackageName()     // Catch:{ Exception -> 0x038b }
            r13.append(r14)     // Catch:{ Exception -> 0x038b }
            java.lang.String r14 = "/"
            r13.append(r14)     // Catch:{ Exception -> 0x038b }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x038b }
            r13.append(r12)     // Catch:{ Exception -> 0x038b }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x038b }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ Exception -> 0x038b }
            r13.<init>()     // Catch:{ Exception -> 0x038b }
            r13.putString(r11, r12)     // Catch:{ Exception -> 0x038b }
            r8.putExtra(r11, r12)     // Catch:{ Exception -> 0x038b }
            java.lang.String r11 = ":settings:show_fragment_args"
            r8.putExtra(r11, r13)     // Catch:{ Exception -> 0x038b }
        L_0x0384:
            r11 = 1018(0x3fa, float:1.427E-42)
            r9.startActivityForResult(r8, r11)     // Catch:{ Exception -> 0x038b }
            r3 = 1
            goto L_0x03b6
        L_0x038b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r5.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
            java.lang.String r0 = "Notification access permission failed and denied permanently"
            android.util.Log.e(r7, r0)
        L_0x03b6:
            r0 = 17
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            java.lang.String r11 = "Write SD Card permission failed"
            r12 = 1019(0x3fb, float:1.428E-42)
            if (r8 == 0) goto L_0x0411
            boolean r8 = n2.a.z0()
            if (r8 == 0) goto L_0x0411
            boolean r8 = n2.a.p0()
            if (r8 != 0) goto L_0x0411
            java.lang.String r8 = "storage"
            java.lang.Object r8 = r9.getSystemService(r8)
            android.os.storage.StorageManager r8 = (android.os.storage.StorageManager) r8
            java.io.File r13 = n2.a.J(r9)
            if (r13 == 0) goto L_0x0411
            if (r8 == 0) goto L_0x0411
            java.io.File r13 = n2.a.J(r9)
            android.os.storage.StorageVolume r8 = r8.getStorageVolume(r13)
            if (r8 == 0) goto L_0x0411
            android.content.Intent r8 = r8.createAccessIntent((java.lang.String) null)
            r9.startActivityForResult(r8, r12)     // Catch:{ ActivityNotFoundException -> 0x03f5 }
            r3 = 1
            goto L_0x0411
        L_0x03f5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Object r13 = r5.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            n2.a.b1(r9, r8)
            android.util.Log.e(r7, r11)
        L_0x0411:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x0432
            boolean r8 = n2.a.p0()
            if (r8 == 0) goto L_0x0432
            java.io.File r8 = n2.a.J(r9)
            if (r8 == 0) goto L_0x0432
            android.content.Intent r8 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0434 }
            java.lang.String r13 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r8.<init>(r13)     // Catch:{ ActivityNotFoundException -> 0x0434 }
            r9.startActivityForResult(r8, r12)     // Catch:{ ActivityNotFoundException -> 0x0434 }
            r3 = 1
        L_0x0432:
            r8 = 1
            goto L_0x0451
        L_0x0434:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            n2.a.b1(r9, r0)
            android.util.Log.e(r7, r11)
            goto L_0x0432
        L_0x0451:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0470
            int r0 = de.ozerov.fully.MyDeviceAdmin.f10113a
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r3 = r9.getApplicationContext()
            java.lang.Class<de.ozerov.fully.MyDeviceAdmin> r8 = de.ozerov.fully.MyDeviceAdmin.class
            r0.<init>(r3, r8)
            java.lang.String r3 = "Please enable Fully as device administrator in order to switch screen off automatically and use KNOX features"
            r8 = 1009(0x3f1, float:1.414E-42)
            de.ozerov.fully.C0794w0.l(r9, r0, r3, r8)
            r3 = 1
        L_0x0470:
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0488
            android.content.ComponentName r0 = de.ozerov.fully.MyDeviceAdmin2.a(r9)
            java.lang.String r3 = "Please enable Fully as device administrator in order to switch screen off automatically, lock the safe mode and camera"
            r8 = 1010(0x3f2, float:1.415E-42)
            de.ozerov.fully.C0794w0.l(r9, r0, r3, r8)
            r3 = 1
        L_0x0488:
            r0 = 15
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x04e7
            boolean r8 = n2.a.y0()
            if (r8 == 0) goto L_0x04e7
            android.content.Intent r8 = new android.content.Intent
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = r9.getPackageName()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.net.Uri r10 = android.net.Uri.parse(r10)
            java.lang.String r11 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            r8.<init>(r11, r10)
            r10 = 1017(0x3f9, float:1.425E-42)
            r9.startActivityForResult(r8, r10)     // Catch:{ Exception -> 0x04bc }
            r8 = 1
            goto L_0x04e8
        L_0x04bc:
            java.lang.String r8 = "Battery optimization permission failed and denied permanently"
            android.util.Log.e(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            n2.a.b1(r9, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.g(r0)
        L_0x04e7:
            r8 = r3
        L_0x04e8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x04fe
            java.lang.String r3 = "android.permission.BLUETOOTH_CONNECT"
            r0.add(r3)
        L_0x04fe:
            r3 = 26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x050f
            java.lang.String r3 = "android.permission.BLUETOOTH_SCAN"
            r0.add(r3)
        L_0x050f:
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x051f
            java.lang.String r3 = "android.permission.CAMERA"
            r0.add(r3)
        L_0x051f:
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x052f
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            r0.add(r3)
        L_0x052f:
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x053f
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            r0.add(r3)
        L_0x053f:
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x054f
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            r0.add(r3)
        L_0x054f:
            r3 = 18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x0566
            boolean r3 = n2.a.C0()
            if (r3 == 0) goto L_0x0566
            java.lang.String r3 = "android.permission.ANSWER_PHONE_CALLS"
            r0.add(r3)
        L_0x0566:
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x0577
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            r0.add(r3)
        L_0x0577:
            r3 = 25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            java.lang.String r4 = "Please give "
            if (r3 == 0) goto L_0x05af
            boolean r3 = n2.a.E0()
            if (r3 == 0) goto L_0x05af
            boolean r3 = r9.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")
            if (r3 == 0) goto L_0x05aa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r5 = n2.a.G(r9)
            r3.append(r5)
            java.lang.String r5 = " permission to show notifications"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 1
            n2.a.a1(r5, r9, r3)
        L_0x05aa:
            java.lang.String r3 = "android.permission.POST_NOTIFICATIONS"
            r0.add(r3)
        L_0x05af:
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x05e4
            boolean r3 = n2.a.y0()
            if (r3 == 0) goto L_0x05e4
            boolean r3 = r9.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE")
            if (r3 == 0) goto L_0x05df
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r5 = n2.a.G(r9)
            r3.append(r5)
            java.lang.String r5 = " permission to access local files"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 1
            n2.a.a1(r5, r9, r3)
        L_0x05df:
            java.lang.String r3 = "android.permission.READ_EXTERNAL_STORAGE"
            r0.add(r3)
        L_0x05e4:
            r3 = 22
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L_0x061a
            boolean r5 = n2.a.E0()
            if (r5 == 0) goto L_0x061a
            boolean r5 = r9.shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_IMAGES")
            if (r5 == 0) goto L_0x0615
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r6 = n2.a.G(r9)
            r5.append(r6)
            java.lang.String r6 = " permission to access local image files"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 1
            n2.a.a1(r6, r9, r5)
        L_0x0615:
            java.lang.String r5 = "android.permission.READ_MEDIA_IMAGES"
            r0.add(r5)
        L_0x061a:
            r5 = 23
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L_0x0650
            boolean r6 = n2.a.E0()
            if (r6 == 0) goto L_0x0650
            boolean r6 = r9.shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_VIDEO")
            if (r6 == 0) goto L_0x064b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r7 = n2.a.G(r9)
            r6.append(r7)
            java.lang.String r7 = " permission to access local video files"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 1
            n2.a.a1(r7, r9, r6)
        L_0x064b:
            java.lang.String r6 = "android.permission.READ_MEDIA_VIDEO"
            r0.add(r6)
        L_0x0650:
            boolean r6 = n2.a.F0()
            if (r6 == 0) goto L_0x0677
            int r6 = n2.a.b0(r9)
            r7 = 34
            if (r6 < r7) goto L_0x0677
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0672
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x0677
        L_0x0672:
            java.lang.String r3 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
            r0.add(r3)
        L_0x0677:
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x06ad
            boolean r3 = n2.a.E0()
            if (r3 == 0) goto L_0x06ad
            boolean r3 = r9.shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_AUDIO")
            if (r3 == 0) goto L_0x06a8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r5 = n2.a.G(r9)
            r3.append(r5)
            java.lang.String r5 = " permission to access local audio files"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 1
            n2.a.a1(r5, r9, r3)
        L_0x06a8:
            java.lang.String r3 = "android.permission.READ_MEDIA_AUDIO"
            r0.add(r3)
        L_0x06ad:
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x06e2
            boolean r2 = n2.a.y0()
            if (r2 == 0) goto L_0x06e2
            boolean r2 = r9.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")
            if (r2 == 0) goto L_0x06dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.String r3 = n2.a.G(r9)
            r2.append(r3)
            java.lang.String r3 = " permission to write local files"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 1
            n2.a.a1(r3, r9, r2)
        L_0x06dd:
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r0.add(r2)
        L_0x06e2:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0707
            boolean r2 = n2.a.y0()
            if (r2 == 0) goto L_0x0707
            int r2 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.toArray(r2)
            boolean r0 = r9 instanceof de.ozerov.fully.FullyActivity
            if (r0 == 0) goto L_0x0703
            r0 = r9
            de.ozerov.fully.FullyActivity r0 = (de.ozerov.fully.FullyActivity) r0
            com.bumptech.glide.j r0 = r0.f9926O0
            r3 = 0
            r0.f9007U = r3
        L_0x0703:
            r9.requestPermissions(r2, 1008)
            r8 = 1
        L_0x0707:
            if (r8 == 0) goto L_0x0724
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Give "
            r0.<init>(r2)
            java.lang.String r2 = n2.a.G(r9)
            r0.append(r2)
            java.lang.String r2 = " the permissions and press back button"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 1
            n2.a.a1(r2, r9, r0)
        L_0x0724:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.j0.q(java.util.ArrayList):void");
    }

    public void r() {
        synchronized (this.f266W) {
            try {
                this.f265V = true;
                ((Z) this.f267X).C();
                if (this.f264U == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int t() {
        int t8;
        synchronized (this.f266W) {
            t8 = ((Z) this.f267X).t();
        }
        return t8;
    }

    public j0(Activity activity) {
        Activity activity2 = activity;
        HashMap hashMap = new HashMap();
        this.f268Y = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f269Z = hashMap2;
        this.f264U = 0;
        this.f266W = activity2;
        this.f267X = new k((Context) activity2, 1);
        hashMap.put(1, "Device Administrator for Screen Lock, Sleep and KNOX features");
        hashMap.put(13, "Device Administrator for Screen Lock/Sleep, Safe Mode or Camera Lock");
        hashMap.put(2, "Read Device Storage");
        hashMap.put(3, "Write Device Storage");
        hashMap.put(17, "Write SD Card Storage");
        hashMap.put(4, "Camera Access");
        hashMap.put(5, "Microphone Access");
        hashMap.put(6, "Coarse Location Access");
        hashMap.put(7, "Fine Location Access");
        hashMap.put(8, "Phone State Access");
        hashMap.put(9, "Drawing Over Other Apps");
        hashMap.put(10, "Modify System Settings");
        hashMap.put(11, "Usage Data Access");
        hashMap.put(12, "Change Do Not Disturb Mode");
        hashMap.put(14, "Install Apps from APK Files");
        hashMap.put(15, "Prevent Device from Sleep");
        hashMap.put(16, "Access Notifications");
        hashMap.put(18, "Manage Phone Calls");
        hashMap.put(19, "Disable Auto-Reset");
        hashMap.put(20, "Manage Device Storage");
        hashMap.put(21, "Connect to Bluetooth");
        hashMap.put(22, "Read Images on Device Storage");
        hashMap.put(23, "Read Videos on Device Storage");
        hashMap.put(24, "Read Audio Files on Device Storage");
        hashMap.put(25, "Post Notifications");
        hashMap.put(26, "Bluetooth Scan");
        hashMap.put(27, "Schedule Exact Alarms");
        hashMap2.put(1, "android.permission.ADMIN");
        hashMap2.put(13, "android.permission.ADMIN2");
        hashMap2.put(2, "android.permission.READ_EXTERNAL_STORAGE");
        hashMap2.put(3, "android.permission.WRITE_EXTERNAL_STORAGE");
        hashMap2.put(17, "android.permission.WRITE_SD_CARD");
        hashMap2.put(4, "android.permission.CAMERA");
        hashMap2.put(5, "android.permission.RECORD_AUDIO");
        hashMap2.put(6, "android.permission.ACCESS_COARSE_LOCATION");
        hashMap2.put(7, "android.permission.ACCESS_FINE_LOCATION");
        hashMap2.put(8, "android.permission.READ_PHONE_STATE");
        hashMap2.put(9, "android.permission.SYSTEM_ALERT_WINDOW");
        hashMap2.put(10, "android.permission.WRITE_SETTINGS");
        hashMap2.put(11, "android.permission.PACKAGE_USAGE_STATS");
        hashMap2.put(12, "android.permission.ACCESS_NOTIFICATION_POLICY");
        hashMap2.put(14, "android.permission.REQUEST_INSTALL_PACKAGES");
        hashMap2.put(15, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        hashMap2.put(16, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE");
        hashMap2.put(18, "android.permission.ANSWER_PHONE_CALLS");
        hashMap2.put(19, "android.permission.DISABLE_AUTO_RESET");
        hashMap2.put(20, "android.permission.MANAGE_EXTERNAL_STORAGE");
        hashMap2.put(22, "android.permission.READ_MEDIA_IMAGES");
        hashMap2.put(23, "android.permission.READ_MEDIA_VIDEO");
        hashMap2.put(24, "android.permission.READ_MEDIA_AUDIO");
        hashMap2.put(25, "android.permission.POST_NOTIFICATIONS");
        hashMap2.put(26, "android.permission.BLUETOOTH_SCAN");
        hashMap2.put(27, "android.permission.SCHEDULE_EXACT_ALARM");
    }

    public j0() {
        this.f266W = new HashSet();
        this.f267X = C0041e0.b();
        this.f264U = -1;
        this.f268Y = new ArrayList();
        this.f265V = false;
        this.f269Z = C0045g0.a();
    }

    public j0(I i) {
        HashSet hashSet = new HashSet();
        this.f266W = hashSet;
        this.f267X = C0041e0.b();
        this.f264U = -1;
        ArrayList arrayList = new ArrayList();
        this.f268Y = arrayList;
        this.f265V = false;
        this.f269Z = C0045g0.a();
        hashSet.addAll(i.f788a);
        this.f267X = C0041e0.c(i.f789b);
        this.f264U = i.f790c;
        arrayList.addAll(i.f791d);
        this.f265V = i.e;
        ArrayMap arrayMap = new ArrayMap();
        H0 h02 = i.f792f;
        for (String str : h02.f785a.keySet()) {
            arrayMap.put(str, h02.f785a.get(str));
        }
        this.f269Z = new H0(arrayMap);
    }
}
