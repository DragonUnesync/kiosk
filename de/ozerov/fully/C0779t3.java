package de.ozerov.fully;

import L0.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.C0470v;
import d4.k;

/* renamed from: de.ozerov.fully.t3  reason: case insensitive filesystem */
public class C0779t3 extends C0470v {

    /* renamed from: P0  reason: collision with root package name */
    public FrameLayout f10969P0;

    /* renamed from: Q0  reason: collision with root package name */
    public FrameLayout f10970Q0;

    /* renamed from: R0  reason: collision with root package name */
    public C0780t4 f10971R0;

    /* renamed from: S0  reason: collision with root package name */
    public V4 f10972S0;

    /* renamed from: T0  reason: collision with root package name */
    public k f10973T0;

    /* renamed from: U0  reason: collision with root package name */
    public C0803x3 f10974U0;

    /* renamed from: V0  reason: collision with root package name */
    public C0740n f10975V0;

    /* renamed from: W0  reason: collision with root package name */
    public i5 f10976W0;

    /* renamed from: X0  reason: collision with root package name */
    public final Handler f10977X0 = new Handler();

    public final void A() {
        C0740n nVar;
        i5 i5Var = this.f10976W0;
        if (i5Var != null) {
            i5Var.d();
        }
        C0740n nVar2 = this.f10975V0;
        if (nVar2 != null) {
            nVar2.b();
        }
        if (this.f10973T0.V1().startsWith("dim") || this.f10973T0.S1() != -1) {
            C0794w0.C0(this.f10971R0, this.f10973T0.R1());
        }
        V4 v4 = this.f10972S0;
        if (!(v4 == null || (nVar = v4.f10445c) == null)) {
            nVar.b();
        }
        C0803x3 x3Var = this.f10974U0;
        if (x3Var != null) {
            x3Var.f11095v = null;
            x3Var.b();
        }
        this.f8088y0 = true;
        c.a(this.f10971R0).c(new Intent("com.fullykiosk.singleapp.event.screensaver_stop"));
        C0780t4 t4Var = this.f10971R0;
        if ((t4Var instanceof ScreensaverActivity) && !t4Var.isFinishing()) {
            ScreensaverActivity screensaverActivity = (ScreensaverActivity) this.f10971R0;
            if (!screensaverActivity.isFinishing()) {
                screensaverActivity.finish();
            }
        }
    }

    public final void C() {
        this.f8088y0 = true;
        i5 i5Var = this.f10976W0;
        if (i5Var != null) {
            i5Var.o();
        }
        C0803x3 x3Var = this.f10974U0;
        if (x3Var != null) {
            synchronized (x3Var) {
                try {
                    if (x3Var.f11082h != null && !x3Var.f11094u && !x3Var.f11093t) {
                        x3Var.f11094u = true;
                        if (x3Var.f11082h.a()) {
                            x3Var.f11079d.o();
                        } else {
                            x3Var.e.q();
                        }
                        x3Var.a(true, true);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void D() {
        this.f8088y0 = true;
        i5 i5Var = this.f10976W0;
        if (i5Var != null) {
            i5Var.q();
        }
        Handler handler = this.f10977X0;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(new C0773s3(this, 0), (long) (this.f10973T0.P() + 200));
        C0794w0.V(this.f10971R0);
    }

    public final void E(Bundle bundle) {
    }

    public final void H(View view, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131362442);
        this.f10969P0 = (FrameLayout) view.findViewById(2131362440);
        this.f10970Q0 = (FrameLayout) view.findViewById(2131362446);
        k kVar = this.f10973T0;
        String N2 = kVar.N2(((Z1.c) kVar.f9767W).r("screensaverWallpaperURL", ""));
        V4 v4 = new V4(this.f10971R0);
        this.f10972S0 = v4;
        v4.a();
        this.f10974U0 = new C0803x3(this.f10971R0, this.f10972S0);
        if (this.f10973T0.S1() != -1) {
            C0794w0.C0(this.f10971R0, this.f10973T0.S1());
        }
        frameLayout.setOnTouchListener(new C3.k(4, this));
        if ((N2.startsWith("rtsp:") || N2.endsWith(".mp4") || N2.endsWith(".webm") || N2.endsWith(".mkv")) && this.f10973T0.D1().booleanValue()) {
            if (this.f10975V0 == null) {
                this.f10975V0 = new C0740n(this.f10971R0, 2131362443, this.f10973T0.x2());
            }
            C0740n nVar = this.f10975V0;
            nVar.f10830n = N2;
            nVar.f10833q = true;
            nVar.f10834r = false;
            nVar.f10835s = true;
            nVar.f10837u = false;
            nVar.f10811A = -16777216;
            nVar.f10812B = this.f10973T0.U();
            C0740n nVar2 = this.f10975V0;
            nVar2.z = 20;
            nVar2.f10815E = new C0773s3(this, 1);
            nVar2.f10817G = new C0773s3(this, 2);
            nVar2.f10820b.setVisibility(0);
            this.f10975V0.n();
            return;
        }
        if (!N2.isEmpty()) {
            i5 i5Var = new i5(this.f10971R0, this.f10972S0, 2131362446);
            this.f10976W0 = i5Var;
            i5Var.f10726u = new C0773s3(this, 3);
            boolean z = i5Var.f10714h;
            FrameLayout frameLayout2 = i5Var.e;
            if (z) {
                frameLayout2.setVisibility(0);
            } else {
                frameLayout2.setVisibility(4);
            }
            i5 i5Var2 = this.f10976W0;
            i5Var2.i = false;
            i5Var2.f10715j = false;
            i5Var2.y(false);
            this.f10976W0.n(N2, false);
            this.f10969P0.setVisibility(0);
            new Handler().postDelayed(new C0773s3(this, 4), 1000);
        }
        if (!((Z1.c) this.f10973T0.f9767W).r("screensaverPlaylist", "").isEmpty()) {
            new Handler().postDelayed(new C0773s3(this, 5), 1000);
        }
    }

    public final void v(Activity activity) {
        this.f8088y0 = true;
        if (h() instanceof C0780t4) {
            this.f10971R0 = (C0780t4) h();
            this.f10973T0 = new k((Context) activity, 1);
            c.a(this.f10971R0).c(new Intent("com.fullykiosk.singleapp.event.screensaver_start"));
            return;
        }
        throw new IllegalStateException("Can't attach to non UniversalActivity");
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return layoutInflater.inflate(2131558488, viewGroup, false);
        } catch (Exception unused) {
            Log.e("t3", "Failed to create the screensaver view, probably missing Android Webview");
            this.f10971R0.C();
            return null;
        }
    }
}
