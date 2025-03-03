package v;

import android.hardware.camera2.CameraCaptureSession;
import u.C1465f;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1465f f15836U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f15837V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f15838W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ long f15839X;

    public /* synthetic */ c(C1465f fVar, CameraCaptureSession cameraCaptureSession, int i, long j7) {
        this.f15836U = fVar;
        this.f15837V = cameraCaptureSession;
        this.f15838W = i;
        this.f15839X = j7;
    }

    public final void run() {
        ((CameraCaptureSession.CaptureCallback) this.f15836U.f15614b).onCaptureSequenceCompleted(this.f15837V, this.f15838W, this.f15839X);
    }
}
