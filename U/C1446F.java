package u;

import D.C0054l;
import android.hardware.camera2.CameraCaptureSession;

/* renamed from: u.F  reason: case insensitive filesystem */
public final class C1446F extends C0054l {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f15494a;

    public C1446F(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f15494a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
