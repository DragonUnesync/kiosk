package U;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

public final class g implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PreviewView f5271a;

    public g(PreviewView previewView) {
        this.f5271a = previewView;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        PreviewView previewView = this.f5271a;
        Display display = previewView.getDisplay();
        if (display != null && display.getDisplayId() == i) {
            previewView.a();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
