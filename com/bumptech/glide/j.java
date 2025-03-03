package com.bumptech.glide;

import D2.p;
import F.h;
import M0.C0117e;
import M0.r;
import M3.d;
import P0.z;
import S3.b;
import W2.g;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.opengl.Matrix;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.n;
import d4.k;
import de.ozerov.fully.C0726k3;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.O4;
import j$.util.Objects;
import j4.C1125b;
import j4.C1126c;
import j4.f;
import java.io.File;
import java.util.List;
import n2.a;
import u.C1477r;
import z2.c;

public final class j implements g, m {

    /* renamed from: U  reason: collision with root package name */
    public boolean f9007U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f9008V;

    /* renamed from: W  reason: collision with root package name */
    public Object f9009W;

    /* renamed from: X  reason: collision with root package name */
    public Object f9010X;

    public j(FullyActivity fullyActivity) {
        this.f9007U = true;
        this.f9008V = fullyActivity;
        this.f9009W = fullyActivity.f9961z0;
    }

    public static void f(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f8 = fArr2[10];
        float f9 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) + (f8 * f8)));
        float f10 = fArr2[10] / sqrt;
        fArr[0] = f10;
        float f11 = fArr2[8];
        fArr[2] = f11 / sqrt;
        fArr[8] = (-f11) / sqrt;
        fArr[10] = f10;
    }

    public void a() {
        ((ConnectivityManager) ((p) this.f9009W).get()).unregisterNetworkCallback((n) this.f9010X);
    }

    public boolean b() {
        boolean z;
        p pVar = (p) this.f9009W;
        if (((ConnectivityManager) pVar.get()).getActiveNetwork() != null) {
            z = true;
        } else {
            z = false;
        }
        this.f9007U = z;
        try {
            ((ConnectivityManager) pVar.get()).registerDefaultNetworkCallback((n) this.f9010X);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }

    public void c() {
        c.k((c) this.f9010X, this, false);
    }

    public boolean d(C0117e eVar, r rVar) {
        boolean equals = Objects.equals(rVar.f3036n, "audio/eac3-joc");
        int i = rVar.f3014C;
        if (!equals) {
            String str = rVar.f3036n;
            if (Objects.equals(str, "audio/iamf")) {
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
                i = 24;
            }
        } else if (i == 16) {
            i = 12;
        }
        int r8 = z.r(i);
        if (r8 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(r8);
        int i8 = rVar.f3015D;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        return ((Spatializer) this.f9008V).canBeSpatialized((AudioAttributes) eVar.a().f2027U, channelMask.build());
    }

    public void e(View view) {
        TextView textView = (TextView) view.findViewById(2131362599);
        TextView textView2 = (TextView) view.findViewById(2131362600);
        FullyActivity fullyActivity = (FullyActivity) this.f9008V;
        if (textView == null || textView2 == null || textView.getText().hashCode() != fullyActivity.getResources().getInteger(2131427398) || textView2.getText().hashCode() != fullyActivity.getResources().getInteger(2131427397)) {
            fullyActivity.f9919H0.d(true);
        }
    }

    public int g(int i, int i8, int i9) {
        boolean z;
        boolean z6 = this.f9007U;
        b bVar = (b) this.f9008V;
        if (z6) {
            z = bVar.b(i8, i);
        } else {
            z = bVar.b(i, i8);
        }
        if (z) {
            return (i9 << 1) | 1;
        }
        return i9 << 1;
    }

    public Object get() {
        if (!this.f9007U) {
            Trace.beginSection(h.H("Glide registry"));
            this.f9007U = true;
            try {
                return a.t((b) this.f9008V, (List) this.f9009W, (h) this.f9010X);
            } finally {
                this.f9007U = false;
                Trace.endSection();
            }
        } else {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }

    public File h() {
        File file;
        synchronized (((c) this.f9010X)) {
            try {
                z2.b bVar = (z2.b) this.f9008V;
                if (bVar.f16426f == this) {
                    if (!bVar.e) {
                        ((boolean[]) this.f9009W)[0] = true;
                    }
                    file = bVar.f16425d[0];
                    ((c) this.f9010X).f16428U.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public boolean i() {
        k kVar = (k) this.f9009W;
        if (!kVar.c0().booleanValue() && !kVar.s1().booleanValue() && !kVar.t1().booleanValue() && !kVar.B2().booleanValue() && !kVar.u2().booleanValue() && !kVar.Q().booleanValue() && !kVar.s().booleanValue() && !kVar.w2().booleanValue() && !kVar.p().booleanValue()) {
            Z1.c cVar = (Z1.c) kVar.f9767W;
            if (cVar.r("forceOpenByAppUrl", "").isEmpty() && kVar.r2() <= 0 && kVar.s2() <= 0 && kVar.q2() <= 0 && kVar.o2() <= 0 && kVar.n2() <= 0 && cVar.r("injectJsCode", "").isEmpty() && kVar.t().isEmpty() && kVar.N2(cVar.r("removeXframeOptionsUrl", "")).isEmpty() && !kVar.D1().booleanValue() && !cVar.n("webcamAccess", false) && !cVar.n("geoLocationAccess", false) && cVar.r("sleepTime", "").isEmpty() && cVar.r("wakeupTime", "").isEmpty() && kVar.N().isEmpty() && kVar.A2().isEmpty()) {
                FullyActivity fullyActivity = (FullyActivity) this.f9008V;
                if (!C0726k3.a(fullyActivity).isEmpty() || kVar.J1().booleanValue() || cVar.n("enablePopups", false) || cVar.n("microphoneAccess", false) || cVar.n("swipeNavigation", false) || cVar.n("swipeTabs", false) || kVar.C1().booleanValue() || !kVar.F2().isEmpty() || kVar.F1().booleanValue() || !kVar.M1().equals("0") || !kVar.i1().equals("0") || kVar.y1().booleanValue() || kVar.r() > 0 || kVar.A().booleanValue() || kVar.t2() > 0 || kVar.q2() > 0 || kVar.n2() > 0 || kVar.p2() > 0 || kVar.L().booleanValue() || cVar.n("addXffHeader", false) || cVar.n("addDntHeader", false) || cVar.n("webHostFilter", false) || C0794w0.Z(fullyActivity) || ((kVar.v2().equals("custom") && !cVar.r("customUserAgent", "").isEmpty()) || !kVar.h1().isEmpty() || !cVar.r("appLocale", "").isEmpty() || !cVar.r("volumeLevels", "").isEmpty() || kVar.N1().booleanValue() || kVar.Q1().booleanValue() || kVar.z1().booleanValue() || !O4.a(fullyActivity, "mainWebAutomation").isEmpty() || !kVar.q().isEmpty() || !cVar.r("barcodeScanBroadcastAction", "").isEmpty() || cVar.n("barcodeScanListenKeys", false) || cVar.n("environmentSensorsEnabled", false) || cVar.n("phoneSpeaker", false) || cVar.n("proximityScreenOff", false) || ((cVar.n("sleepOnPowerConnect", false) && cVar.n("movementStopsSleepOnPowerDisconnect", false)) || kVar.l() != 100 || !cVar.r("appToRunOnStart", "").isEmpty() || !cVar.r("appToRunInForegroundOnStart", "").isEmpty() || cVar.n("resetWifiOnDisconnection", false) || kVar.c1().booleanValue()))) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public void j(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(2131362599);
            TextView textView2 = (TextView) view.findViewById(2131362600);
            if (textView != null && textView2 != null) {
                int q7 = ((Z1.c) ((k) this.f9009W).f9767W).q("hourCounter", 0) / 24;
                int i = 127;
                if (q7 <= 127) {
                    i = q7;
                }
                int i8 = i + 128;
                textView.setTextColor(Color.argb(i8, i8, 80, 80));
                textView2.setTextColor(Color.argb(i8, i8, 80, 80));
                if (q7 > 500) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(1500);
                    alphaAnimation.setStartOffset(20);
                    alphaAnimation.setRepeatMode(2);
                    alphaAnimation.setRepeatCount(-1);
                    textView.startAnimation(alphaAnimation);
                    textView2.startAnimation(alphaAnimation);
                }
            }
        }
    }

    public C1126c k() {
        C1126c cVar = (C1126c) this.f9010X;
        if (cVar != null) {
            return cVar;
        }
        int i = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < 6; i9++) {
            i8 = g(i9, 8, i8);
        }
        int g8 = g(8, 7, g(8, 8, g(7, 8, i8)));
        for (int i10 = 5; i10 >= 0; i10--) {
            g8 = g(8, i10, g8);
        }
        int i11 = ((b) this.f9008V).f4506V;
        int i12 = i11 - 7;
        for (int i13 = i11 - 1; i13 >= i12; i13--) {
            i = g(8, i13, i);
        }
        for (int i14 = i11 - 8; i14 < i11; i14++) {
            i = g(i14, 8, i);
        }
        C1126c a8 = C1126c.a(g8, i);
        if (a8 == null) {
            a8 = C1126c.a(g8 ^ 21522, i ^ 21522);
        }
        this.f9010X = a8;
        if (a8 != null) {
            return a8;
        }
        throw d.a();
    }

    public f l() {
        f fVar = (f) this.f9009W;
        if (fVar != null) {
            return fVar;
        }
        int i = ((b) this.f9008V).f4506V;
        int i8 = (i - 17) / 4;
        if (i8 <= 6) {
            return f.c(i8);
        }
        int i9 = i - 11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i - 9; i13 >= i9; i13--) {
                i11 = g(i13, i12, i11);
            }
        }
        f b8 = f.b(i11);
        if (b8 == null || (b8.f12885a * 4) + 17 != i) {
            for (int i14 = 5; i14 >= 0; i14--) {
                for (int i15 = i - 9; i15 >= i9; i15--) {
                    i10 = g(i14, i15, i10);
                }
            }
            f b9 = f.b(i10);
            if (b9 == null || (b9.f12885a * 4) + 17 != i) {
                throw d.a();
            }
            this.f9009W = b9;
            return b9;
        }
        this.f9009W = b8;
        return b8;
    }

    public void m() {
        if (((C1126c) this.f9010X) != null) {
            int i = C1477r.k(8)[((C1126c) this.f9010X).f12871b];
            b bVar = (b) this.f9008V;
            int i8 = 0;
            while (true) {
                int i9 = bVar.f4506V;
                if (i8 < i9) {
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (C1125b.a(i, i8, i10)) {
                            bVar.a(i10, i8);
                        }
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public void n() {
        FrameLayout frameLayout = (FrameLayout) ((FullyActivity) this.f9008V).findViewById(2131362385);
        if (!i() || Q.h.f4003X) {
            C0767r3 r3Var = (C0767r3) this.f9010X;
            if (r3Var != null) {
                r3Var.e();
            }
            frameLayout.setVisibility(8);
            return;
        }
        FullyActivity fullyActivity = (FullyActivity) this.f9008V;
        if (!fullyActivity.f9921J0.f8654b || !fullyActivity.f10981v0 || ((FullyActivity) this.f9008V).isFinishing() || !this.f9007U || (a.y0() && !Settings.canDrawOverlays((FullyActivity) this.f9008V))) {
            C0767r3 r3Var2 = (C0767r3) this.f9010X;
            if (r3Var2 != null) {
                r3Var2.e();
            }
        } else {
            if (((C0767r3) this.f9010X) == null) {
                C0767r3 r3Var3 = new C0767r3((FullyActivity) this.f9008V);
                this.f9010X = r3Var3;
                r3Var3.g(2131558580);
                C0767r3 r3Var4 = (C0767r3) this.f9010X;
                r3Var4.f10916d = true;
                r3Var4.e = true;
                r3Var4.f10921k = true;
                r3Var4.f10926p = "plusAnnounce";
            }
            ((C0767r3) this.f9010X).j();
            e(((C0767r3) this.f9010X).f10915c);
            j(((C0767r3) this.f9010X).f10915c);
        }
        frameLayout.setVisibility(0);
        e(frameLayout);
        j(frameLayout);
    }

    public j(b bVar) {
        int i = bVar.f4506V;
        if (i < 21 || (i & 3) != 1) {
            throw d.a();
        }
        this.f9008V = bVar;
    }

    public j() {
        this.f9008V = new float[16];
        this.f9009W = new float[16];
        this.f9010X = new C3.r();
    }

    public j(b bVar, List list, h hVar) {
        this.f9008V = bVar;
        this.f9009W = list;
        this.f9010X = hVar;
    }

    public j(p pVar, l lVar) {
        this.f9010X = new n(this);
        this.f9009W = pVar;
        this.f9008V = lVar;
    }

    public j(c cVar, z2.b bVar) {
        boolean[] zArr;
        this.f9010X = cVar;
        this.f9008V = bVar;
        if (bVar.e) {
            zArr = null;
        } else {
            zArr = new boolean[cVar.f16434a0];
        }
        this.f9009W = zArr;
    }

    public j(Spatializer spatializer) {
        this.f9008V = spatializer;
        this.f9007U = spatializer.getImmersiveAudioLevel() != 0;
    }
}
