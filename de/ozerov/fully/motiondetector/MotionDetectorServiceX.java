package de.ozerov.fully.motiondetector;

import A.g;
import B.C0020v;
import G.b;
import G.i;
import L0.c;
import N5.p;
import P6.f;
import a0.m;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.IBinder;
import android.provider.Settings;
import androidx.camera.lifecycle.d;
import d4.k;
import de.ozerov.fully.I;
import n2.a;

public class MotionDetectorServiceX extends I {

    /* renamed from: V  reason: collision with root package name */
    public p f10809V = null;

    public final void a() {
        m mVar;
        if (this.f10809V == null) {
            p pVar = new p(this);
            this.f10809V = pVar;
            pVar.e();
            if (!a.y0() || (pVar.f3440a.checkSelfPermission("android.permission.CAMERA") == 0 && Settings.canDrawOverlays(pVar.f3440a))) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.fullykiosk.singleapp.event.screensaver_start");
                intentFilter.addAction("com.fullykiosk.singleapp.event.screensaver_stop");
                c.a(pVar.f3440a).b(pVar.f3437H, intentFilter);
                Service service = pVar.f3440a;
                d dVar = d.f7670g;
                f.e(service, "context");
                d dVar2 = d.f7670g;
                synchronized (dVar2.f7671a) {
                    mVar = dVar2.f7672b;
                    if (mVar == null) {
                        mVar = com.bumptech.glide.d.i(new g(dVar2, 10, new C0020v(service)));
                        dVar2.f7672b = mVar;
                    }
                }
                androidx.camera.lifecycle.c cVar = new androidx.camera.lifecycle.c(0, new D6.a(2, service));
                b f8 = i.f(mVar, new A.f(20, (Object) cVar), D7.b.l());
                pVar.f3457t = f8;
                f8.d(new A.d(25, pVar), j0.f.d(pVar.f3440a));
                return;
            }
            if (pVar.f3441b.y().contains("android.permission.CAMERA")) {
                a.a1(1, pVar.f3440a, "Camera permission denied permanently, can't use the cam");
            }
            if (pVar.f3441b.y().contains("android.permission.SYSTEM_ALERT_WINDOW")) {
                a.a1(1, pVar.f3440a, "Overlay permission denied permanently, can't use the cam");
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        new k((Context) this, 1);
        a();
        return this.f10005U;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p pVar = this.f10809V;
        if (pVar != null) {
            pVar.getClass();
        }
    }

    public final boolean onUnbind(Intent intent) {
        p pVar = this.f10809V;
        if (pVar != null) {
            pVar.f();
            this.f10809V = null;
        }
        return super.onUnbind(intent);
    }
}
