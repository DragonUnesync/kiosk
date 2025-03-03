package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import w.v;

public final class o extends n {
    public final void c(v vVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) vVar.f16176a.a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f15852V).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        }
    }
}
