package N5;

import android.hardware.Camera;
import android.util.Log;

public final /* synthetic */ class d implements Camera.ErrorCallback {
    public final void onError(int i, Camera camera) {
        if (i == 100 || i == 2) {
            Log.e("j", "Camera server died or evicted");
        }
    }
}
