package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

public final class u extends t {
    public final Set e() {
        try {
            return ((CameraManager) this.f15852V).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        }
    }
}
