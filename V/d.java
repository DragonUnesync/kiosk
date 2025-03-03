package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import u.C1465f;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1465f f15840U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f15841V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f15842W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Surface f15843X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f15844Y;

    public /* synthetic */ d(C1465f fVar, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
        this.f15840U = fVar;
        this.f15841V = cameraCaptureSession;
        this.f15842W = captureRequest;
        this.f15843X = surface;
        this.f15844Y = j7;
    }

    public final void run() {
        ((CameraCaptureSession.CaptureCallback) this.f15840U.f15614b).onCaptureBufferLost(this.f15841V, this.f15842W, this.f15843X, this.f15844Y);
    }
}
