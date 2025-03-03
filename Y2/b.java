package Y2;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public final class b implements WindowManager {

    /* renamed from: U  reason: collision with root package name */
    public final WindowManager f6572U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ c f6573V;

    public b(c cVar, WindowManager windowManager) {
        this.f6573V = cVar;
        this.f6572U = windowManager;
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            Log.d("WindowManagerWrapper", "WindowManager's addView(view, params) has been hooked.");
            this.f6572U.addView(view, layoutParams);
        } catch (WindowManager.BadTokenException e) {
            Log.i("WindowManagerWrapper", e.getMessage());
            int i = c.f6574a;
            this.f6573V.getClass();
        } catch (Throwable th) {
            Log.e("WindowManagerWrapper", "[addView]", th);
        }
    }

    public final Display getDefaultDisplay() {
        return this.f6572U.getDefaultDisplay();
    }

    public final void removeView(View view) {
        this.f6572U.removeView(view);
    }

    public final void removeViewImmediate(View view) {
        this.f6572U.removeViewImmediate(view);
    }

    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        this.f6572U.updateViewLayout(view, layoutParams);
    }
}
