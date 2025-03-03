package de.ozerov.fully;

import B3.q;
import O5.f;
import Q.h;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebStorage;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import d4.k;
import java.util.HashMap;
import java.util.Iterator;
import n2.a;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.c  reason: case insensitive filesystem */
public final class C0674c {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f10572c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10573a;

    /* renamed from: b  reason: collision with root package name */
    public final k f10574b;

    public C0674c(FullyActivity fullyActivity, int i) {
        switch (i) {
            case 1:
                this.f10573a = fullyActivity;
                this.f10574b = new k((Context) fullyActivity, 1);
                return;
            case 2:
                this.f10573a = fullyActivity;
                this.f10574b = new k((Context) fullyActivity, 1);
                return;
            case 3:
                this.f10573a = fullyActivity;
                this.f10574b = fullyActivity.f9961z0;
                return;
            default:
                this.f10573a = fullyActivity;
                this.f10574b = new k((Context) fullyActivity, 1);
                return;
        }
    }

    public void a() {
        StringBuilder sb = new StringBuilder("Load Start URL ");
        k kVar = this.f10574b;
        sb.append(kVar.h2());
        Log.i("c", sb.toString());
        FullyActivity fullyActivity = this.f10573a;
        if (!fullyActivity.y("preferences")) {
            c cVar = (c) kVar.f9767W;
            if (cVar.n("deleteCacheOnReload", false)) {
                fullyActivity.f9917F0.c();
            }
            try {
                if (cVar.n("deleteWebstorageOnReload", false)) {
                    WebStorage.getInstance().deleteAllData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (cVar.n("deleteHistoryOnReload", false)) {
                Iterator it = fullyActivity.f9917F0.f10710c.iterator();
                while (it.hasNext()) {
                    ((g5) it.next()).f10664g.f10123c0 = true;
                }
                Iterator it2 = fullyActivity.f9917F0.f10710c.iterator();
                while (it2.hasNext()) {
                    MyWebView myWebView = ((g5) it2.next()).f10664g;
                    if (myWebView != null) {
                        myWebView.clearFormData();
                    }
                }
            }
            if (!cVar.n("deleteCookiesOnReload", false)) {
                b();
            } else {
                fullyActivity.f9928Q0.b(false, new C0753p0(this, 1));
            }
        }
    }

    public void b() {
        k kVar = this.f10574b;
        boolean n4 = ((c) kVar.f9767W).n("loadCurrentPageOnReload", false);
        FullyActivity fullyActivity = this.f10573a;
        if ((n4 || !((c) kVar.f9767W).n("skipReloadIfStartUrlShowing", false) || fullyActivity.f9917F0.k() == null || !fullyActivity.f9917F0.k().equals(kVar.h2())) && ((c) kVar.f9767W).n("loadCurrentPageOnReload", false)) {
            Iterator it = fullyActivity.f9917F0.f10710c.iterator();
            while (it.hasNext()) {
                ((g5) it.next()).h();
            }
        }
    }

    public boolean c(MenuItem menuItem) {
        MyWebView myWebView;
        MyWebView myWebView2;
        int itemId = menuItem.getItemId();
        k kVar = this.f10574b;
        FullyActivity fullyActivity = this.f10573a;
        switch (itemId) {
            case 0:
                i5 i5Var = fullyActivity.f9917F0;
                g5 g5Var = i5Var.f10711d;
                if (g5Var == null || (myWebView = g5Var.f10664g) == null || !myWebView.canGoBack()) {
                    g5 g5Var2 = i5Var.f10711d;
                    if (g5Var2 != null && g5Var2.f10668l) {
                        i5Var.e(g5Var2);
                    }
                } else {
                    i5Var.f10711d.c();
                }
                return true;
            case 1:
                g5 g5Var3 = fullyActivity.f9917F0.f10711d;
                if (g5Var3 != null) {
                    g5Var3.d();
                }
                return true;
            case 2:
                fullyActivity.f9951n1.getClass();
                return true;
            case 3:
                g5 g5Var4 = fullyActivity.f9917F0.f10711d;
                if (!(g5Var4 == null || (myWebView2 = g5Var4.f10664g) == null)) {
                    myWebView2.d();
                }
                return true;
            case 4:
                if (fullyActivity.f9917F0.k() != null) {
                    g5 g5Var5 = fullyActivity.f9917F0.f10711d;
                    if (g5Var5 != null) {
                        g5Var5.h();
                    }
                } else {
                    fullyActivity.f9951n1.getClass();
                }
                return true;
            case 5:
                fullyActivity.f9917F0.n(kVar.N2(((c) kVar.f9767W).r("actionBarCustomButtonUrl", "")), false);
                return true;
            case 6:
                g5 g5Var6 = fullyActivity.f9917F0.f10711d;
                if (g5Var6 != null) {
                    g5Var6.k();
                }
                return true;
            case 7:
                fullyActivity.f9941d1.b("", kVar.q(), -1, -1, true, false, false, false);
                return true;
            case 8:
                fullyActivity.f9921J0.b();
                return true;
            case 9:
                try {
                    fullyActivity.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            default:
                return false;
        }
    }

    public void d() {
        k kVar = this.f10574b;
        boolean booleanValue = kVar.W1().booleanValue();
        Context context = (Context) kVar.f9768X;
        c cVar = (c) kVar.f9767W;
        FullyActivity fullyActivity = this.f10573a;
        if (booleanValue && kVar.l() == 100) {
            fullyActivity.findViewById(2131361962).setVisibility(8);
            fullyActivity.k().L();
            fullyActivity.k().E(new ColorDrawable(kVar.i()));
            fullyActivity.j().b();
            fullyActivity.k().J(kVar.O2(cVar.r("actionBarTitle", context.getResources().getString(2131951646))));
            Toolbar toolbar = (Toolbar) fullyActivity.findViewById(2131361842);
            if (toolbar != null) {
                toolbar.setTitleTextColor(kVar.j());
                toolbar.setNavigationOnClickListener(new C0662a(this, 0));
            }
            String k8 = kVar.k();
            if (k8.isEmpty()) {
                fullyActivity.k().G(false);
            } else {
                new Thread(new C0709h4(k8, fullyActivity, 1)).start();
            }
            String N2 = kVar.N2(cVar.r("actionBarBgUrl", ""));
            if (!N2.isEmpty()) {
                new Thread(new C0709h4(N2, fullyActivity, 0)).start();
            }
        } else if (!kVar.W1().booleanValue() || kVar.l() == 100) {
            fullyActivity.findViewById(2131361962).setVisibility(8);
            fullyActivity.k().q();
        } else {
            fullyActivity.k().q();
            float l8 = ((float) kVar.l()) / 100.0f;
            Toolbar toolbar2 = (Toolbar) fullyActivity.findViewById(2131361962);
            toolbar2.setVisibility(0);
            toolbar2.getLayoutParams().height = a.p(56.0f * l8, fullyActivity);
            Class<Drawable> cls = Drawable.class;
            if (!kVar.N2(cVar.r("actionBarBgUrl", "")).isEmpty()) {
                A0 Q02 = C0794w0.Q0(fullyActivity);
                C0812z0 z0Var = (C0812z0) ((C0812z0) Q02.l(cls)).G(kVar.N2(cVar.r("actionBarBgUrl", "")));
                z0Var.C(new C0668b(this, toolbar2), z0Var);
            } else {
                toolbar2.setBackground(new ColorDrawable(kVar.i()));
            }
            TextView textView = (TextView) fullyActivity.findViewById(2131361965);
            textView.setText(kVar.O2(cVar.r("actionBarTitle", context.getResources().getString(2131951646))));
            textView.setTextColor(kVar.j());
            textView.setTextSize(18.0f * l8);
            ImageView imageView = (ImageView) fullyActivity.findViewById(2131361963);
            if (!kVar.k().isEmpty()) {
                imageView.setVisibility(0);
                A0 Q03 = C0794w0.Q0(fullyActivity);
                ((C0812z0) ((C0812z0) Q03.l(cls)).G(kVar.k())).p(P.m(fullyActivity)).g().D(imageView);
                imageView.setOnClickListener(new C0662a(this, 1));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                float f8 = 32.0f * l8;
                layoutParams.height = a.p(f8, fullyActivity);
                layoutParams.width = a.p(f8, fullyActivity);
                layoutParams.setMarginEnd(a.p(l8 * 12.0f, fullyActivity));
                imageView.setLayoutParams(layoutParams);
            } else {
                imageView.setVisibility(8);
            }
            fullyActivity.j().b();
        }
    }

    public void e() {
        if (!this.f10574b.y2().isEmpty() && ((this.f10574b.f1().isEmpty() || this.f10574b.f1().equals(P.i(this.f10573a))) && this.f10574b.g1().isEmpty())) {
            k kVar = this.f10574b;
            String y22 = kVar.y2();
            if (y22.length() != 64) {
                y22 = a.j0(y22);
            }
            String i = P.i(this.f10573a);
            new M4(this, 0).execute(new String[]{Uri.parse("https://licensing.fully-kiosk.com/api/register_volume_license2.php").buildUpon().appendQueryParameter("devid", i).appendQueryParameter("vhash", y22).appendQueryParameter("appid", "56").build().toString()});
            String[] strArr = A.f9779a;
            if (((c) kVar.f9767W).r("shadowLicensingServerHost", (String) null) != null) {
                new L4(this, 0).execute(new String[]{Uri.parse(((c) kVar.f9767W).r("shadowLicensingServerHost", (String) null) + "/api/register_shadow_license2.php").buildUpon().appendQueryParameter("devid", i).appendQueryParameter("vhash", y22).appendQueryParameter("appid", "56").build().toString()});
            }
        }
        if (this.f10574b.y2().isEmpty() && !this.f10574b.g1().isEmpty()) {
            h();
        }
        if (!h.f4003X && !this.f10574b.g1().isEmpty() && !this.f10574b.y2().isEmpty()) {
            this.f10573a.f9924M0.i(true, false);
        }
    }

    public void f(String str) {
        k kVar = this.f10574b;
        boolean n4 = ((c) kVar.f9767W).n("screenOnOnMotion", true);
        FullyActivity fullyActivity = this.f10573a;
        if (n4) {
            fullyActivity.f9943f1.b();
            C0794w0.K0(fullyActivity, kVar.Z().booleanValue());
        }
        c cVar = (c) kVar.f9767W;
        if (cVar.n("stopScreensaverOnMotion", true)) {
            fullyActivity.f9943f1.c();
            C0794w0.K0(fullyActivity, kVar.Z().booleanValue());
            C0797w3 w3Var = fullyActivity.f9943f1;
            if (w3Var.f11046f) {
                q.s0(w3Var.f11042a, true, true);
            }
            fullyActivity.f9943f1.f();
        }
        if (cVar.n("stopIdleReloadOnMotion", false)) {
            fullyActivity.f9945h1.d();
        }
        U0.e("onMotion", (HashMap) null);
        if (str != null) {
            fullyActivity.f9935X0.b0("onMotion", a.D("type", str));
        } else {
            fullyActivity.f9935X0.b0("onMotion", (JSONObject) null);
        }
        if (C0794w0.f11017a && C0794w0.f11018b != null) {
            C0794w0.a();
            C0794w0.f11018b.f11060j++;
        }
    }

    public void g(String str) {
        int i;
        f fVar;
        Handler handler;
        FullyActivity fullyActivity = this.f10573a;
        boolean z = false;
        fullyActivity.f9960y1.e(true, false);
        k kVar = this.f10574b;
        if (((c) kVar.f9767W).n("screenOnOnMovement", true)) {
            fullyActivity.f9943f1.b();
            C0794w0.K0(fullyActivity, kVar.Z().booleanValue());
        }
        c cVar = (c) kVar.f9767W;
        if (cVar.n("stopScreensaverOnMovement", true)) {
            fullyActivity.f9943f1.c();
            C0794w0.K0(fullyActivity, kVar.Z().booleanValue());
            C0797w3 w3Var = fullyActivity.f9943f1;
            if (w3Var.f11046f) {
                q.s0(w3Var.f11042a, true, true);
            }
            fullyActivity.f9943f1.f();
        }
        if (cVar.n("movementStopsSleepOnPowerDisconnect", false) && (handler = fVar.f3675c) != null) {
            handler.removeCallbacksAndMessages((Object) null);
            (fVar = fullyActivity.f9920I0.f10179k).f3675c = null;
        }
        if (cVar.n("playAlarmSoundOnMovement", true) && str != null && cVar.r("playAlarmSoundOnMovementFilter", "beacon,accelerometer,compass,unplug").contains(str)) {
            Q3 q32 = fullyActivity.f9913C0;
            String N2 = kVar.N2(cVar.r("alarmSoundFileUrl", ""));
            if (cVar.n("playAlarmSoundUntilPin", false) && fullyActivity.f9921J0.i()) {
                z = true;
            }
            try {
                i = Integer.parseInt(cVar.r("playAlarmSoundStream", ""));
            } catch (Exception unused) {
                i = 4;
            }
            q32.a(N2, z, true, i);
        }
        U0.e("onMovement", (HashMap) null);
        fullyActivity.f9935X0.b0("onMovement", (JSONObject) null);
        if (C0794w0.f11017a && C0794w0.f11018b != null) {
            C0794w0.a();
            C0794w0.f11018b.f11064n++;
        }
    }

    public void h() {
        String str;
        k kVar = this.f10574b;
        String g12 = kVar.g1();
        if (g12.length() != 64) {
            g12 = a.j0(g12);
        }
        if (!kVar.f1().isEmpty()) {
            str = kVar.f1();
        } else {
            str = P.i(this.f10573a);
        }
        Uri.Builder appendQueryParameter = Uri.parse("https://licensing.fully-kiosk.com/api/unregister_volume_license2.php").buildUpon().appendQueryParameter("devid", str).appendQueryParameter("vhash", g12);
        new M4(this, 1).execute(new String[]{appendQueryParameter.appendQueryParameter("token", a.j0(str + g12 + "Fully Unregister Salt")).appendQueryParameter("appid", "56").build().toString()});
        String[] strArr = A.f9779a;
        c cVar = (c) kVar.f9767W;
        if (cVar.r("shadowLicensingServerHost", (String) null) != null) {
            Uri.Builder appendQueryParameter2 = Uri.parse(cVar.r("shadowLicensingServerHost", (String) null) + "/api/unregister_shadow_license2.php").buildUpon().appendQueryParameter("devid", str).appendQueryParameter("vhash", g12);
            new L4(this, 1).execute(new String[]{appendQueryParameter2.appendQueryParameter("token", a.j0(str + g12 + "Fully Unregister Salt")).appendQueryParameter("appid", "56").build().toString()});
        }
    }
}
