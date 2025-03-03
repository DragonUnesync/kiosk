package v;

import android.hardware.camera2.CameraCaptureSession;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15845U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ f f15846V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f15847W;

    public /* synthetic */ e(f fVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f15845U = i;
        this.f15846V = fVar;
        this.f15847W = cameraCaptureSession;
    }

    public final void run() {
        switch (this.f15845U) {
            case 0:
                this.f15846V.f15848a.onActive(this.f15847W);
                return;
            case 1:
                this.f15846V.f15848a.onClosed(this.f15847W);
                return;
            case 2:
                this.f15846V.f15848a.onCaptureQueueEmpty(this.f15847W);
                return;
            case 3:
                this.f15846V.f15848a.onConfigured(this.f15847W);
                return;
            case 4:
                this.f15846V.f15848a.onReady(this.f15847W);
                return;
            default:
                this.f15846V.f15848a.onConfigureFailed(this.f15847W);
                return;
        }
    }
}
