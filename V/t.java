package v;

import F.i;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

public class t extends s {
    public final CameraCharacteristics d(String str) {
        try {
            return ((CameraManager) this.f15852V).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        }
    }

    public final void f(String str, i iVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f15852V).openCamera(str, iVar, stateCallback);
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        }
    }
}
