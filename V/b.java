package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import u.C1465f;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1465f f15831U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f15832V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f15833W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ long f15834X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f15835Y;

    public /* synthetic */ b(C1465f fVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
        this.f15831U = fVar;
        this.f15832V = cameraCaptureSession;
        this.f15833W = captureRequest;
        this.f15834X = j7;
        this.f15835Y = j8;
    }

    public final void run() {
        ((CameraCaptureSession.CaptureCallback) this.f15831U.f15614b).onCaptureStarted(this.f15832V, this.f15833W, this.f15834X, this.f15835Y);
    }
}
