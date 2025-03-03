package v;

import F.i;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import u.C1474o;

public class s extends i {
    public static boolean l(RuntimeException runtimeException) {
        boolean z;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) {
            z = false;
        } else {
            z = "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        if (z) {
            return true;
        }
        return false;
    }

    public CameraCharacteristics d(String str) {
        try {
            return super.d(str);
        } catch (RuntimeException e) {
            if (l(e)) {
                throw new C1502a(e);
            }
            throw e;
        }
    }

    public void f(String str, i iVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f15852V).openCamera(str, iVar, stateCallback);
        } catch (CameraAccessException e) {
            throw new C1502a(e);
        } catch (IllegalArgumentException | SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (l(e9)) {
                throw new C1502a(e9);
            }
            throw e9;
        }
    }

    public final void g(i iVar, C1474o oVar) {
        ((CameraManager) this.f15852V).registerAvailabilityCallback(iVar, oVar);
    }

    public final void k(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f15852V).unregisterAvailabilityCallback(availabilityCallback);
    }
}
