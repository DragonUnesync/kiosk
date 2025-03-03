package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import w.h;
import w.u;
import w.v;

public class n extends m {
    public void c(v vVar) {
        CameraDevice cameraDevice = (CameraDevice) this.f15852V;
        i.b(cameraDevice, vVar);
        u uVar = vVar.f16176a;
        f fVar = new f(uVar.f(), uVar.c());
        List d8 = uVar.d();
        h hVar = (h) this.f15853W;
        hVar.getClass();
        h e = uVar.e();
        Handler handler = hVar.f15850a;
        if (e != null) {
            try {
                InputConfiguration inputConfiguration = e.f16152a.f16151a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, v.a(d8), fVar, handler);
            } catch (CameraAccessException e8) {
                throw new C1502a(e8);
            }
        } else if (uVar.b() == 1) {
            cameraDevice.createConstrainedHighSpeedCaptureSession(i.j(d8), fVar, handler);
        } else {
            cameraDevice.createCaptureSessionByOutputConfigurations(v.a(d8), fVar, handler);
        }
    }
}
