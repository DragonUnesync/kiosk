package D;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.internal.sessionprocessor.a;

/* renamed from: D.t  reason: case insensitive filesystem */
public interface C0065t extends t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0036c f950a = new C0036c("camerax.core.camera.useCaseConfigFactory", O0.class, (CaptureRequest.Key) null);

    /* renamed from: b  reason: collision with root package name */
    public static final C0036c f951b = new C0036c("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, (CaptureRequest.Key) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C0036c f952c = new C0036c("camerax.core.camera.SessionProcessor", a.class, (CaptureRequest.Key) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C0036c f953d;
    public static final C0036c e;

    static {
        Class<Boolean> cls = Boolean.class;
        f953d = new C0036c("camerax.core.camera.isPostviewSupported", cls, (CaptureRequest.Key) null);
        e = new C0036c("camerax.core.camera.isCaptureProcessProgressSupported", cls, (CaptureRequest.Key) null);
    }
}
