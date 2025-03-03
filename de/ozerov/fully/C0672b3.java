package de.ozerov.fully;

import Z1.c;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import n2.a;

/* renamed from: de.ozerov.fully.b3  reason: case insensitive filesystem */
public final /* synthetic */ class C0672b3 implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10564a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10565b;

    public /* synthetic */ C0672b3(int i, Object obj) {
        this.f10564a = i;
        this.f10565b = obj;
    }

    public final void onSystemUiVisibilityChange(int i) {
        switch (this.f10564a) {
            case 0:
                ProvisioningActivity provisioningActivity = (ProvisioningActivity) this.f10565b;
                provisioningActivity.getWindow().getDecorView().getSystemUiVisibility();
                if ((i & 4) == 0) {
                    Handler handler = provisioningActivity.f10279j0;
                    handler.removeCallbacksAndMessages((Object) null);
                    handler.postDelayed(new C0678c3(provisioningActivity, 1), 2000);
                    return;
                }
                return;
            case 1:
                ScreensaverActivity screensaverActivity = (ScreensaverActivity) this.f10565b;
                if ((screensaverActivity.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0 && !((c) screensaverActivity.f10344y0.f9767W).n("forceImmersive", false) && !screensaverActivity.isFinishing()) {
                    screensaverActivity.finish();
                    return;
                }
                return;
            default:
                W3 w32 = ((E3) this.f10565b).f9881a.f9922K0;
                FullyActivity fullyActivity = w32.f10477b;
                int systemUiVisibility = fullyActivity.getWindow().getDecorView().getSystemUiVisibility();
                w32.f10479d = i;
                if (!a.B0()) {
                    int i8 = i & 4;
                    Handler handler2 = w32.f10485l;
                    if (i8 != 0 && (systemUiVisibility & 4) != 0) {
                        handler2.postDelayed(new T3(w32, 6), 2000);
                        return;
                    } else if (i8 == 0) {
                        w32.f10481g = true;
                        w32.j();
                        handler2.removeCallbacksAndMessages((Object) null);
                        w32.f10486m.postDelayed(new T3(w32, 7), 2000);
                        if (!a.z0()) {
                            C0797w3 w3Var = fullyActivity.f9943f1;
                            if (w3Var.f11044c) {
                                L0.c.a(w3Var.f11042a).c(new Intent("com.fullykiosk.singleapp.action.stop_screensaver"));
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
