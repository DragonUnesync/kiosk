package v;

import F.i;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

public final class g extends i {
    public final int a(ArrayList arrayList, i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f15852V).captureBurstRequests(arrayList, iVar, captureCallback);
    }

    public final int i(CaptureRequest captureRequest, i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f15852V).setSingleRepeatingRequest(captureRequest, iVar, captureCallback);
    }
}
