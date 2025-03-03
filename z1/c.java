package Z1;

import B3.f;
import D2.A;
import H3.C0103u;
import H3.C0107y;
import H3.I;
import H3.O;
import H3.P;
import H3.i0;
import J1.d;
import K1.i;
import P0.z;
import S0.b;
import W1.e;
import Z6.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0472x;
import androidx.profileinstaller.ProfileInstallReceiver;
import c1.l;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.A4;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.K2;
import f1.C0891d;
import f1.o;
import f1.p;
import f1.r;
import f1.u;
import f1.w;
import g4.C0961a;
import h0.C1029d;
import h1.W;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j1.C1118c;
import java.io.IOException;
import java.io.Serializable;
import java.net.BindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l1.k;
import l1.m;
import v0.C1510H;
import v0.C1542o;
import v0.g0;
import v0.j0;
import w0.C1586o;

public final class c implements d, b1.c, l, A4, k, W, C1542o, C1586o, C1118c {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6954U;

    /* renamed from: V  reason: collision with root package name */
    public Object f6955V;

    public /* synthetic */ c(int i, Object obj) {
        this.f6954U = i;
        this.f6955V = obj;
    }

    public static d w(d dVar, int i) {
        d dVar2 = (d) dVar.f2353W;
        if (i == dVar.f2351U - 1) {
            dVar.f2351U = i;
            return null;
        }
        int i8 = dVar.f2352V;
        if (i < i8) {
            throw new IllegalStateException("The id was already returned. This must not happen and is a bug.");
        } else if (i == i8) {
            if (dVar2 != null) {
                int i9 = i8 + 1;
                dVar.f2352V = i9;
                if (i9 == dVar2.f2351U) {
                    dVar.f2352V = dVar2.f2352V;
                    dVar.f2353W = (d) dVar2.f2353W;
                }
                return null;
            }
            throw new IllegalStateException("The id is greater than maxId. This must not happen and is a bug.");
        } else if (dVar2 != null) {
            return dVar2;
        } else {
            throw new IllegalStateException("The id is greater than maxId. This must not happen and is a bug.");
        }
    }

    public /* bridge */ /* synthetic */ void A(m mVar, long j7, long j8, boolean z) {
        switch (this.f6954U) {
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                C0891d dVar = (C0891d) mVar;
                return;
            default:
                u uVar = (u) mVar;
                return;
        }
    }

    public void a() {
    }

    public boolean b(View view) {
        int i;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f6955V;
        boolean z = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i8 = swipeDismissBehavior.e;
        if ((i8 != 0 || !z) && (i8 != 1 || z)) {
            i = view.getWidth();
        } else {
            i = -view.getWidth();
        }
        C1510H.j(view, i);
        view.setAlpha(0.0f);
        f fVar = swipeDismissBehavior.f9157b;
        if (fVar != null) {
            fVar.a(view);
        }
        return true;
    }

    public void c(int i, int i8, int i9, long j7) {
        ((MediaCodec) this.f6955V).queueInputBuffer(i, 0, i8, j7, i9);
    }

    public void d(int i, b bVar, long j7, int i8) {
        ((MediaCodec) this.f6955V).queueSecureInputBuffer(i, 0, bVar.i, j7, i8);
    }

    public void e(String str, String str2) {
        String b8 = f1.l.b(str.trim());
        String trim = str2.trim();
        P p3 = (P) this.f6955V;
        p3.getClass();
        C0103u.d(b8, trim);
        C0107y yVar = (C0107y) p3.f2027U;
        if (yVar == null) {
            yVar = C0107y.a();
            p3.f2027U = yVar;
        }
        I i = (I) yVar.get(b8);
        if (i == null) {
            i = O.l(4);
            C0107y yVar2 = (C0107y) p3.f2027U;
            if (yVar2 == null) {
                yVar2 = C0107y.a();
                p3.f2027U = yVar2;
            }
            yVar2.put(b8, i);
        }
        i.b(trim);
    }

    public void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6955V).setResultCode(i);
    }

    public void flush() {
    }

    public void g(Bundle bundle) {
        ((MediaCodec) this.f6955V).setParameters(bundle);
    }

    public void h(List list) {
        for (int i = 0; i < list.size(); i++) {
            int i8 = z.f3748a;
            String[] split = ((String) list.get(i)).split(":\\s?", 2);
            if (split.length == 2) {
                e(split[0], split[1]);
            }
        }
    }

    public j0 i(View view, j0 j0Var) {
        boolean z;
        boolean z6;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f6955V;
        if (!Objects.equals(coordinatorLayout.f7723k0, j0Var)) {
            coordinatorLayout.f7723k0 = j0Var;
            if (j0Var.d() > 0) {
                z = true;
            } else {
                z = false;
            }
            coordinatorLayout.f7724l0 = z;
            if (z || coordinatorLayout.getBackground() != null) {
                z6 = false;
            } else {
                z6 = true;
            }
            coordinatorLayout.setWillNotDraw(z6);
            g0 g0Var = j0Var.f15952a;
            if (!g0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    if (childAt.getFitsSystemWindows() && ((C1029d) childAt.getLayoutParams()).f12261a != null && g0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return j0Var;
    }

    public f1.l j() {
        return new f1.l(this);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.IOException, B2.c] */
    public e k(m mVar, long j7, long j8, IOException iOException, int i) {
        switch (this.f6954U) {
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                C0891d dVar = (C0891d) mVar;
                p pVar = (p) this.f6955V;
                if (!pVar.f11603m0) {
                    pVar.f11595e0 = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i8 = pVar.f11605o0;
                    pVar.f11605o0 = i8 + 1;
                    if (i8 < 3) {
                        return l1.p.f13147X;
                    }
                } else {
                    pVar.f11596f0 = new IOException(dVar.f11511V.f11616b.toString(), iOException);
                }
                return l1.p.f13148Y;
            default:
                u uVar = (u) mVar;
                if (!((w) this.f6955V).f11631Z) {
                    K2 k22 = ((w) this.f6955V).f11626U;
                }
                return l1.p.f13148Y;
        }
    }

    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public synchronized void m(Y6.w wVar) {
        P6.f.e(wVar, "route");
        ((LinkedHashSet) this.f6955V).remove(wVar);
    }

    public boolean n(String str, boolean z) {
        try {
            return ((SharedPreferences) this.f6955V).getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public void o() {
        p pVar = (p) this.f6955V;
        pVar.f11586V.post(new f1.m(pVar, 1));
    }

    public void p(m mVar, long j7, long j8) {
        switch (this.f6954U) {
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                C0891d dVar = (C0891d) mVar;
                p pVar = (p) this.f6955V;
                if (pVar.n() != 0) {
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = pVar.f11589Y;
                        if (i < arrayList.size()) {
                            o oVar = (o) arrayList.get(i);
                            if (oVar.f11580a.f11577b == dVar) {
                                oVar.a();
                            } else {
                                i++;
                            }
                        }
                    }
                    pVar.f11588X.f11568i0 = 1;
                    return;
                } else if (!pVar.p0) {
                    p.y(pVar);
                    return;
                } else {
                    return;
                }
            default:
                u uVar = (u) mVar;
                return;
        }
    }

    public int q(String str, int i) {
        try {
            return ((SharedPreferences) this.f6955V).getInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public String r(String str, String str2) {
        try {
            return ((SharedPreferences) this.f6955V).getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public void s() {
        ((C0472x) this.f6955V).f8095g0.Q();
    }

    public void shutdown() {
    }

    public void start() {
    }

    public void t(B2.c cVar) {
        boolean z = cVar instanceof r;
        p pVar = (p) this.f6955V;
        if (!z || pVar.p0) {
            pVar.f11596f0 = cVar;
        } else {
            p.y(pVar);
        }
    }

    public void u(String str, IOException iOException) {
        IOException iOException2;
        if (iOException == null) {
            iOException2 = new IOException(str);
        } else {
            iOException2 = new IOException(str, iOException);
        }
        ((p) this.f6955V).f11595e0 = iOException2;
    }

    public void v(int i) {
        d dVar = (d) this.f6955V;
        while (dVar.f2352V <= i) {
            d dVar2 = (d) dVar.f2353W;
            if (dVar2 == null) {
                dVar.f2352V = i + 1;
                return;
            }
            dVar = dVar2;
        }
        int i8 = i + 1;
        int i9 = dVar.f2351U - i8;
        if (i9 < 0) {
            i9 = 0;
        }
        while (true) {
            d dVar3 = (d) dVar.f2353W;
            if (dVar3 == null) {
                break;
            }
            i9 += dVar3.f2351U - dVar.f2352V;
            dVar = dVar3;
        }
        if (i9 == 0) {
            dVar.f2352V = i8;
        }
    }

    public void x(int i) {
        d dVar = (d) this.f6955V;
        if (i < dVar.f2351U - 1) {
            this.f6955V = new d(i, i + 1, dVar);
            return;
        }
        d w2 = w(dVar, i);
        while (true) {
            d dVar2 = w2;
            d dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                return;
            }
            if (i < dVar.f2351U - 1) {
                dVar3.f2353W = new d(i, i + 1, dVar);
                return;
            }
            w2 = w(dVar, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r2 >= 26) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r2 >= 34) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return Q0.g.e(1, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return Q0.g.e(4, 0, 0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int y(M0.r r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f3036n
            r3 = 0
            if (r2 == 0) goto L_0x0084
            boolean r2 = M0.I.l(r2)
            if (r2 != 0) goto L_0x000f
            goto L_0x0084
        L_0x000f:
            int r2 = P0.z.f3748a
            java.lang.String r7 = r7.f3036n
            r7.getClass()
            int r2 = P0.z.f3748a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L_0x0063;
                case -1487464693: goto L_0x0058;
                case -1487464690: goto L_0x004d;
                case -1487394660: goto L_0x0042;
                case -1487018032: goto L_0x0037;
                case -879272239: goto L_0x002c;
                case -879258763: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x006d
        L_0x0021:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x002a
            goto L_0x006d
        L_0x002a:
            r4 = 6
            goto L_0x006d
        L_0x002c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0035
            goto L_0x006d
        L_0x0035:
            r4 = 5
            goto L_0x006d
        L_0x0037:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0040
            goto L_0x006d
        L_0x0040:
            r4 = 4
            goto L_0x006d
        L_0x0042:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x004b
            goto L_0x006d
        L_0x004b:
            r4 = 3
            goto L_0x006d
        L_0x004d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0056
            goto L_0x006d
        L_0x0056:
            r4 = 2
            goto L_0x006d
        L_0x0058:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            r4 = 1
            goto L_0x006d
        L_0x0063:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            switch(r4) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0071;
                case 2: goto L_0x0071;
                case 3: goto L_0x007a;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x007a;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x007f
        L_0x0071:
            r7 = 26
            if (r2 < r7) goto L_0x007f
            goto L_0x007a
        L_0x0076:
            r7 = 34
            if (r2 < r7) goto L_0x007f
        L_0x007a:
            int r7 = Q0.g.e(r0, r3, r3, r3)
            goto L_0x0083
        L_0x007f:
            int r7 = Q0.g.e(r1, r3, r3, r3)
        L_0x0083:
            return r7
        L_0x0084:
            int r7 = Q0.g.e(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.c.y(M0.r):int");
    }

    public c(Context context) {
        this.f6954U = 14;
        this.f6955V = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public c(FullyActivity fullyActivity, int i) {
        this.f6954U = i;
        switch (i) {
            case 13:
                this.f6955V = new C0767r3(fullyActivity);
                return;
            default:
                this.f6955V = new d4.k((Context) fullyActivity, 1);
                NsdManager nsdManager = (NsdManager) fullyActivity.getApplicationContext().getSystemService("servicediscovery");
                return;
        }
    }

    public c(A a8) {
        this.f6954U = 8;
        this.f6955V = DesugarCollections.unmodifiableMap(new HashMap(a8.f1025a));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, J1.d] */
    public c(int i, int i8) {
        this.f6954U = 27;
        ? obj = new Object();
        obj.f2351U = i;
        obj.f2352V = i8 + 1;
        this.f6955V = obj;
    }

    public c(i0 i0Var) {
        this.f6954U = 22;
        this.f6955V = O.m(i0Var);
    }

    public c(int i) {
        this.f6954U = i;
        switch (i) {
            case 7:
                this.f6955V = new LinkedHashSet();
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                this.f6955V = new Object();
                return;
            case 24:
                this.f6955V = C0961a.e;
                return;
            case 29:
                this.f6955V = new i(9);
                return;
            default:
                this.f6955V = new U0.c(11);
                return;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(int i, String str, String str2) {
        this(18);
        this.f6954U = 18;
        e("User-Agent", str);
        e("CSeq", String.valueOf(i));
        if (str2 != null) {
            e("Session", str2);
        }
    }

    public c(a aVar) {
        this.f6954U = 4;
        this.f6955V = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
