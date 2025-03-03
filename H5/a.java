package H5;

import A.d;
import android.hardware.Camera;

public final class a implements Camera.AutoFocusCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2162a;

    public a(b bVar) {
        this.f2162a = bVar;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        this.f2162a.e.post(new d(15, this));
    }
}
