package n1;

import android.hardware.display.DisplayManager;

public final class s implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f13676a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f13677b;

    public s(u uVar, DisplayManager displayManager) {
        this.f13677b = uVar;
        this.f13676a = displayManager;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            u.a(this.f13677b, this.f13676a.getDisplay(0));
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
