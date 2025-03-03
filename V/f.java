package v;

import A4.d;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

public final class f extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.StateCallback f15848a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15849b;

    public f(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f15849b = executor;
        this.f15848a = stateCallback;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f15849b.execute(new e(this, cameraCaptureSession, 0));
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f15849b.execute(new e(this, cameraCaptureSession, 2));
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f15849b.execute(new e(this, cameraCaptureSession, 1));
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f15849b.execute(new e(this, cameraCaptureSession, 5));
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f15849b.execute(new e(this, cameraCaptureSession, 3));
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f15849b.execute(new e(this, cameraCaptureSession, 4));
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f15849b.execute(new d(this, cameraCaptureSession, surface, 15));
    }
}
