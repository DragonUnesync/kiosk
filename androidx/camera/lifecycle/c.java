package androidx.camera.lifecycle;

import B.W;
import D.Y;
import D.Z;
import F.h;
import G5.t;
import H3.L;
import H3.O;
import H3.i0;
import M0.r;
import O6.l;
import P0.z;
import P6.f;
import Z2.a;
import a0.j;
import a0.k;
import a1.C0412c;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.b;
import c1.u;
import c1.v;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0676c1;
import de.ozerov.fully.C0717j0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.C0799x;
import de.ozerov.fully.C2;
import de.ozerov.fully.D;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.J3;
import de.ozerov.fully.P;
import de.ozerov.fully.Q2;
import de.ozerov.fully.Q4;
import de.ozerov.fully.T;
import de.ozerov.fully.T0;
import de.ozerov.fully.U0;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import k1.C1138g;
import k1.C1141j;
import k1.m;
import k2.C1160q;
import o.C1296u;
import o.s1;
import org.json.JSONObject;
import p1.C1337g;
import r.C1366a;
import r7.n;
import u.C1465f;
import u.C1467h;
import u.g0;
import v0.C1510H;
import v0.C1531d;
import x0.C1600f;

public final /* synthetic */ class c implements C1366a, u, a, C2, D, b, C0799x, m, l, k, Y, C1337g {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7668U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f7669V;

    public /* synthetic */ c(int i, Object obj) {
        this.f7668U = i;
        this.f7669V = obj;
    }

    public Object a(Object obj) {
        n nVar = (n) obj;
        f.e(nVar, "it");
        String optString = nVar.optString("timestamp");
        f.b(optString);
        Calendar calendar = null;
        if (optString.length() <= 0) {
            optString = null;
        }
        if (optString != null) {
            try {
                Calendar instance = Calendar.getInstance();
                Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.ENGLISH).parse(optString);
                f.b(parse);
                instance.setTime(parse);
                calendar = instance;
            } catch (ParseException unused) {
            }
        }
        return Boolean.valueOf(((Calendar) this.f7669V).after(calendar));
    }

    public Object apply(Object obj) {
        return (d) ((D6.a) this.f7669V).a(obj);
    }

    public void b(Object obj) {
        t tVar = (t) obj;
        s1 s1Var = (s1) this.f7669V;
        FullyActivity fullyActivity = (FullyActivity) s1Var.f14070a;
        if (tVar != null) {
            String str = tVar.f1727a;
            if (str == null) {
                Z1.c cVar = (Z1.c) s1Var.e;
                if (cVar != null) {
                    ((C0717j0) cVar.f6955V).f10731P0.f9941d1.e = null;
                } else {
                    U0.e("onQrScanCancelled", (HashMap) null);
                    fullyActivity.f9935X0.b0("onQrScanCancelled", (JSONObject) null);
                }
            } else {
                Z1.c cVar2 = (Z1.c) s1Var.e;
                if (cVar2 != null) {
                    boolean I8 = P.I(str);
                    C0717j0 j0Var = (C0717j0) cVar2.f6955V;
                    if (!I8 || !str.toLowerCase().endsWith("fek")) {
                        n2.a.b1(j0Var.j(), "Unknown URL");
                    } else {
                        j0Var.Q(str);
                        j0Var.P();
                    }
                    j0Var.f10731P0.f9941d1.e = null;
                } else {
                    s1Var.a(str, (String) null, (String) s1Var.f14073d);
                }
            }
        } else {
            n2.a.b1(fullyActivity, "QR Empty Result");
            Log.e("s1", "QR Empty Result");
            U0.e("onQrScanCancelled", (HashMap) null);
            fullyActivity.f9935X0.b0("onQrScanCancelled", (JSONObject) null);
        }
        s1Var.f14073d = null;
    }

    public i0 c(int i, M0.Y y8, int[] iArr) {
        L j7 = O.j();
        for (int i8 = 0; i8 < y8.f2885a; i8++) {
            int i9 = i;
            M0.Y y9 = y8;
            int i10 = i8;
            j7.a(new C1138g(i9, y9, i10, (C1141j) this.f7669V, iArr[i8]));
        }
        return j7.g();
    }

    public void d(String[] strArr) {
        Object obj = this.f7669V;
        switch (this.f7668U) {
            case 3:
                C0717j0 j0Var = (C0717j0) obj;
                j0Var.getClass();
                if (strArr.length > 0) {
                    j0Var.Q(Uri.fromFile(new File(strArr[0])).toString());
                    j0Var.P();
                    return;
                }
                return;
            default:
                R2.c cVar = (R2.c) obj;
                if (strArr.length > 0) {
                    FullyActivity fullyActivity = (FullyActivity) cVar.f4336V;
                    fullyActivity.f9921J0.c();
                    fullyActivity.f9917F0.n(Uri.fromFile(new File(strArr[0])).toString(), false);
                    return;
                }
                return;
        }
    }

    public void e(Z z) {
        g0 g0Var = (g0) this.f7669V;
        g0Var.getClass();
        try {
            W o2 = z.o();
            if (o2 != null) {
                g0Var.f15617V.p(o2);
            }
        } catch (IllegalStateException e) {
            h.l("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    public long f(long j7) {
        p1.t tVar = (p1.t) this.f7669V;
        return z.j((j7 * ((long) tVar.e)) / 1000000, 0, tVar.f14430j - 1);
    }

    public int g(Object obj) {
        boolean z;
        c1.n nVar = (c1.n) obj;
        nVar.getClass();
        r rVar = (r) this.f7669V;
        String str = rVar.f3036n;
        String str2 = nVar.f8798b;
        if (str2.equals(str) || str2.equals(v.b(rVar))) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !nVar.c(rVar, false)) {
            return 0;
        }
        return 1;
    }

    public Object h(j jVar) {
        switch (this.f7668U) {
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                C1467h hVar = (C1467h) this.f7669V;
                hVar.getClass();
                hVar.f15626V.execute(new C0412c((Object) hVar, 18, (Object) jVar));
                return "updateSessionConfigAsync";
            default:
                C1465f fVar = (C1465f) this.f7669V;
                fVar.f15615c = jVar;
                return "RequestCompleteListener[" + fVar + "]";
        }
    }

    public void i(String str) {
        switch (this.f7668U) {
            case 6:
                C0676c1.b((C0676c1) this.f7669V);
                return;
            case 9:
                Q2.c((Q2) this.f7669V);
                return;
            default:
                Q4.a((Q4) this.f7669V);
                return;
        }
    }

    public void j(String str) {
        U0 u02 = ((T0) this.f7669V).f10357W;
        if (str != null) {
            n2.a.b1(u02.f10414a, str);
            return;
        }
        u02.f10414a.f9952o1.b();
        u02.f10414a.f9951n1.getClass();
    }

    public void k(ArrayList arrayList) {
        J3 j32 = (J3) this.f7669V;
        j32.getClass();
        if (arrayList.size() == 1) {
            Intent intent = new Intent();
            intent.setComponent(C0794w0.p(j32.f10027P0, ((T) arrayList.get(0)).f10349b));
            j32.O(n2.a.o0(intent));
            j32.f10028Q0.V2("singleAppIntent", n2.a.o0(intent));
            d4.k kVar = j32.f10028Q0;
            kVar.getClass();
            kVar.R2("kioskTestMode", true);
        }
    }

    public boolean l(C1160q qVar, int i, Bundle bundle) {
        C1160q qVar2;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i & 1) != 0) {
            try {
                ((C1600f) qVar.f13026V).c();
                Parcelable parcelable = (Parcelable) ((C1600f) qVar.f13026V).a();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription description = ((C1600f) qVar.f13026V).getDescription();
        C1600f fVar = (C1600f) qVar.f13026V;
        ClipData clipData = new ClipData(description, new ClipData.Item(fVar.b()));
        if (i8 >= 31) {
            qVar2 = new C1160q(clipData, 2);
        } else {
            C1531d dVar = new C1531d();
            dVar.f15931V = clipData;
            dVar.f15932W = 2;
            qVar2 = dVar;
        }
        qVar2.w(fVar.d());
        qVar2.i(bundle);
        if (C1510H.l((C1296u) this.f7669V, qVar2.d()) == null) {
            return true;
        }
        return false;
    }
}
