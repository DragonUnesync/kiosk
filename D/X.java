package D;

import B.C0003d;
import P.b;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

public interface X extends t0 {
    public static final C0036c i = new C0036c("camerax.core.imageOutput.targetAspectRatio", C0003d.class, (CaptureRequest.Key) null);

    /* renamed from: j  reason: collision with root package name */
    public static final C0036c f867j;

    /* renamed from: k  reason: collision with root package name */
    public static final C0036c f868k;

    /* renamed from: l  reason: collision with root package name */
    public static final C0036c f869l;

    /* renamed from: m  reason: collision with root package name */
    public static final C0036c f870m;

    /* renamed from: n  reason: collision with root package name */
    public static final C0036c f871n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0036c f872o;

    /* renamed from: p  reason: collision with root package name */
    public static final C0036c f873p;

    /* renamed from: q  reason: collision with root package name */
    public static final C0036c f874q = new C0036c("camerax.core.imageOutput.resolutionSelector", b.class, (CaptureRequest.Key) null);

    /* renamed from: r  reason: collision with root package name */
    public static final C0036c f875r;

    static {
        Class cls = Integer.TYPE;
        f867j = new C0036c("camerax.core.imageOutput.targetRotation", cls, (CaptureRequest.Key) null);
        f868k = new C0036c("camerax.core.imageOutput.appTargetRotation", cls, (CaptureRequest.Key) null);
        f869l = new C0036c("camerax.core.imageOutput.mirrorMode", cls, (CaptureRequest.Key) null);
        Class<Size> cls2 = Size.class;
        f870m = new C0036c("camerax.core.imageOutput.targetResolution", cls2, (CaptureRequest.Key) null);
        f871n = new C0036c("camerax.core.imageOutput.defaultResolution", cls2, (CaptureRequest.Key) null);
        f872o = new C0036c("camerax.core.imageOutput.maxResolution", cls2, (CaptureRequest.Key) null);
        Class<List> cls3 = List.class;
        f873p = new C0036c("camerax.core.imageOutput.supportedResolutions", cls3, (CaptureRequest.Key) null);
        f875r = new C0036c("camerax.core.imageOutput.customOrderedResolutions", cls3, (CaptureRequest.Key) null);
    }

    int G();

    ArrayList S();

    b T();

    Size c0();

    Size g0();

    int h0(int i8);

    Size i();

    int p0();

    boolean r();

    List u();

    int v();

    b w();
}
