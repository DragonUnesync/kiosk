package t;

import A.f;
import D.C0036c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* renamed from: t.a  reason: case insensitive filesystem */
public final class C1412a extends f {

    /* renamed from: W  reason: collision with root package name */
    public static final C0036c f15159W = new C0036c("camera2.captureRequest.templateType", Integer.TYPE, (CaptureRequest.Key) null);

    /* renamed from: X  reason: collision with root package name */
    public static final C0036c f15160X = new C0036c("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, (CaptureRequest.Key) null);

    /* renamed from: Y  reason: collision with root package name */
    public static final C0036c f15161Y = new C0036c("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, (CaptureRequest.Key) null);

    /* renamed from: Z  reason: collision with root package name */
    public static final C0036c f15162Z = new C0036c("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, (CaptureRequest.Key) null);

    /* renamed from: a0  reason: collision with root package name */
    public static final C0036c f15163a0 = new C0036c("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, (CaptureRequest.Key) null);

    /* renamed from: b0  reason: collision with root package name */
    public static final C0036c f15164b0 = new C0036c("camera2.cameraCaptureSession.physicalCameraId", String.class, (CaptureRequest.Key) null);

    public static C0036c i0(CaptureRequest.Key key) {
        return new C0036c("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
