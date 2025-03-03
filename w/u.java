package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

public interface u {
    Object a();

    int b();

    CameraCaptureSession.StateCallback c();

    List d();

    h e();

    Executor f();

    void g(h hVar);

    void h(CaptureRequest captureRequest);
}
