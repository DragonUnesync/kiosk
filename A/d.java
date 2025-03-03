package A;

import A3.g;
import B.O;
import B.W;
import B.a0;
import B.f0;
import B.p0;
import B.q0;
import B3.q;
import C0.f;
import C3.C0029e;
import C3.n;
import D.N;
import H5.a;
import H5.b;
import M.c;
import M.k;
import M.l;
import N5.e;
import N5.p;
import P5.C0140c;
import a0.j;
import a0.m;
import android.util.Log;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.journeyapps.barcodescanner.BarcodeView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import u.C1474o;
import u.C1475p;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f8U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f9V;

    public /* synthetic */ d(int i, Object obj) {
        this.f8U = i;
        this.f9V = obj;
    }

    public final void run() {
        switch (this.f8U) {
            case 0:
                e eVar = (e) this.f9V;
                j jVar = (j) eVar.f15g;
                if (jVar != null) {
                    jVar.a((Object) null);
                    eVar.f15g = null;
                    return;
                }
                return;
            case 1:
                g gVar = (g) this.f9V;
                gVar.f91c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) gVar.e;
                f fVar = sideSheetBehavior.i;
                if (fVar != null && fVar.f()) {
                    gVar.a(gVar.f90b);
                    return;
                } else if (sideSheetBehavior.f9376h == 2) {
                    sideSheetBehavior.r(gVar.f90b);
                    return;
                } else {
                    return;
                }
            case 2:
                O o2 = (O) this.f9V;
                synchronized (o2.f192o0) {
                    try {
                        o2.f193q0 = null;
                        W w2 = o2.p0;
                        if (w2 != null) {
                            o2.p0 = null;
                            o2.f(w2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                ((f0) this.f9V).n();
                return;
            case 4:
                ((A1.d) ((a0) this.f9V).f212b).getClass();
                return;
            case 5:
                ((C.f) this.f9V).c();
                return;
            case 6:
                ((C0029e) this.f9V).t(true);
                return;
            case 7:
                n nVar = (n) this.f9V;
                boolean isPopupShowing = nVar.f601h.isPopupShowing();
                nVar.t(isPopupShowing);
                nVar.f605m = isPopupShowing;
                return;
            case 8:
                ((TextInputLayout) this.f9V).f9425a0.requestLayout();
                return;
            case 9:
                C1474o oVar = (C1474o) this.f9V;
                if (oVar.f15674c.f15685B0 == 4) {
                    oVar.f15674c.K(false);
                    return;
                }
                return;
            case 10:
                C1475p pVar = (C1475p) this.f9V;
                if (pVar.f15675a.f15685B0 == 9) {
                    pVar.f15675a.C();
                    return;
                }
                return;
            case 11:
                ((m) this.f9V).cancel(true);
                return;
            case 12:
                ((ScheduledFuture) this.f9V).cancel(true);
                return;
            case 13:
                ((j) this.f9V).a((Object) null);
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                G5.f.a((BarcodeView) ((f) this.f9V).f17V);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                b bVar = ((a) this.f9V).f2162a;
                bVar.f2165b = false;
                bVar.a();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                ((l) this.f9V).close();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                c cVar = (c) this.f9V;
                cVar.f2728d0 = true;
                cVar.a();
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                ((p0) this.f9V).a();
                return;
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                ((N) this.f9V).b();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                M.m mVar = (M.m) ((q0) this.f9V).f302X;
                if (mVar != null) {
                    for (k b8 : mVar.values()) {
                        b8.b();
                    }
                    return;
                }
                return;
            case 21:
                N.f fVar2 = (N.f) this.f9V;
                fVar2.f3217Z = true;
                fVar2.a();
                return;
            case 22:
                M.m mVar2 = (M.m) ((C7.d) this.f9V).f735Y;
                if (mVar2 != null) {
                    for (k b9 : mVar2.values()) {
                        b9.b();
                    }
                    return;
                }
                return;
            case 23:
                ((N5.j) this.f9V).f3409m = 2;
                return;
            case 24:
                e eVar2 = (e) this.f9V;
                eVar2.getClass();
                try {
                    if (((Z1.c) ((N5.j) eVar2.f3376W).f3400b.f9767W).n("showVisualMotionDetectionFailure", true)) {
                        n2.a.a1(1, ((N5.j) eVar2.f3376W).f3399a, "Visual Motion Detection failed. Is another process using the cam? Trying to restart...");
                    }
                    N5.j jVar2 = (N5.j) eVar2.f3376W;
                    jVar2.f(jVar2.f3396F);
                    return;
                } catch (Exception unused) {
                    Log.e("j", "Failed to restart cam in the watchdog");
                    return;
                }
            case 25:
                p pVar2 = (p) this.f9V;
                try {
                    pVar2.f3458u = (androidx.camera.lifecycle.d) pVar2.f3457t.get();
                    pVar2.a();
                    return;
                } catch (InterruptedException | ExecutionException unused2) {
                    return;
                }
            case 26:
                ((q) this.f9V).d0();
                return;
            case 27:
                ((O5.c) this.f9V).f3667b.f9949l1.b();
                return;
            case 28:
                ((C0140c) this.f9V).f3879b.f9917F0.c();
                return;
            default:
                ((C0140c) this.f9V).f3879b.f9928Q0.b(true, (Runnable) null);
                return;
        }
    }
}
