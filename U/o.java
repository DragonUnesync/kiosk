package U;

import B.Q;
import F.h;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import g7.l;

public final class o extends View {

    /* renamed from: U  reason: collision with root package name */
    public Window f5294U;

    /* renamed from: V  reason: collision with root package name */
    public n f5295V;

    private float getBrightness() {
        Window window = this.f5294U;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        h.l("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* access modifiers changed from: private */
    public void setBrightness(float f8) {
        if (this.f5294U == null) {
            h.l("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        } else if (Float.isNaN(f8)) {
            h.l("ScreenFlashView", "setBrightness: value is NaN!");
        } else {
            WindowManager.LayoutParams attributes = this.f5294U.getAttributes();
            attributes.screenBrightness = f8;
            this.f5294U.setAttributes(attributes);
            h.j("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
        }
    }

    private void setScreenFlashUiInfo(Q q7) {
        h.j("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public Q getScreenFlash() {
        return this.f5295V;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000;
    }

    public void setController(a aVar) {
        l.a();
    }

    public void setScreenFlashWindow(Window window) {
        n nVar;
        l.a();
        if (this.f5294U != window) {
            if (window == null) {
                nVar = null;
            } else {
                nVar = new n(this);
            }
            this.f5295V = nVar;
        }
        this.f5294U = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
