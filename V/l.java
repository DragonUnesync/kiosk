package v;

import android.hardware.camera2.CameraDevice;
import u.C1472m;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15858U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1472m f15859V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f15860W;

    public /* synthetic */ l(C1472m mVar, CameraDevice cameraDevice, int i) {
        this.f15858U = i;
        this.f15859V = mVar;
        this.f15860W = cameraDevice;
    }

    public final void run() {
        switch (this.f15858U) {
            case 0:
                ((CameraDevice.StateCallback) this.f15859V.f15667b).onClosed(this.f15860W);
                return;
            case 1:
                ((CameraDevice.StateCallback) this.f15859V.f15667b).onDisconnected(this.f15860W);
                return;
            default:
                ((CameraDevice.StateCallback) this.f15859V.f15667b).onOpened(this.f15860W);
                return;
        }
    }
}
