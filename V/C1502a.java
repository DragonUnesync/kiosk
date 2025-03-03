package v;

import android.hardware.camera2.CameraAccessException;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: v.a  reason: case insensitive filesystem */
public final class C1502a extends Exception {

    /* renamed from: V  reason: collision with root package name */
    public static final Set f15829V = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));

    /* renamed from: U  reason: collision with root package name */
    public final int f15830U;

    static {
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{10001, 10002})));
    }

    public C1502a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f15830U = 10001;
        if (f15829V.contains(10001)) {
            new CameraAccessException(10001, (String) null, runtimeException);
        }
    }

    public C1502a(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f15830U = cameraAccessException.getReason();
    }

    public C1502a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", new Object[]{"CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str}), assertionError);
        this.f15830U = 10002;
        if (f15829V.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
