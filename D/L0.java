package D;

import H.l;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import u.C1484y;
import u.C1485z;

public interface L0 extends l, V {

    /* renamed from: A  reason: collision with root package name */
    public static final C0036c f807A = new C0036c("camerax.core.useCase.captureType", N0.class, (CaptureRequest.Key) null);

    /* renamed from: B  reason: collision with root package name */
    public static final C0036c f808B;

    /* renamed from: C  reason: collision with root package name */
    public static final C0036c f809C;

    /* renamed from: s  reason: collision with root package name */
    public static final C0036c f810s = new C0036c("camerax.core.useCase.defaultSessionConfig", C0.class, (CaptureRequest.Key) null);

    /* renamed from: t  reason: collision with root package name */
    public static final C0036c f811t = new C0036c("camerax.core.useCase.defaultCaptureConfig", I.class, (CaptureRequest.Key) null);

    /* renamed from: u  reason: collision with root package name */
    public static final C0036c f812u = new C0036c("camerax.core.useCase.sessionConfigUnpacker", C1485z.class, (CaptureRequest.Key) null);

    /* renamed from: v  reason: collision with root package name */
    public static final C0036c f813v = new C0036c("camerax.core.useCase.captureConfigUnpacker", C1484y.class, (CaptureRequest.Key) null);

    /* renamed from: w  reason: collision with root package name */
    public static final C0036c f814w;

    /* renamed from: x  reason: collision with root package name */
    public static final C0036c f815x = new C0036c("camerax.core.useCase.targetFrameRate", Range.class, (CaptureRequest.Key) null);

    /* renamed from: y  reason: collision with root package name */
    public static final C0036c f816y;
    public static final C0036c z;

    static {
        Class cls = Integer.TYPE;
        f814w = new C0036c("camerax.core.useCase.surfaceOccupancyPriority", cls, (CaptureRequest.Key) null);
        Class cls2 = Boolean.TYPE;
        f816y = new C0036c("camerax.core.useCase.zslDisabled", cls2, (CaptureRequest.Key) null);
        z = new C0036c("camerax.core.useCase.highResolutionDisabled", cls2, (CaptureRequest.Key) null);
        f808B = new C0036c("camerax.core.useCase.previewStabilizationMode", cls, (CaptureRequest.Key) null);
        f809C = new C0036c("camerax.core.useCase.videoStabilizationMode", cls, (CaptureRequest.Key) null);
    }

    int B();

    C0 M();

    int N();

    C1485z P();

    boolean R();

    C0 a0();

    boolean e0();

    N0 k();

    int l();

    Range y();
}
