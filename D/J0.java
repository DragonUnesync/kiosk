package D;

import java.util.List;

public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0 f800a;

    /* renamed from: b  reason: collision with root package name */
    public final L0 f801b;

    /* renamed from: c  reason: collision with root package name */
    public final C0048i f802c;

    /* renamed from: d  reason: collision with root package name */
    public final List f803d;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f804f = false;

    public J0(C0 c02, L0 l02, C0048i iVar, List list) {
        this.f800a = c02;
        this.f801b = l02;
        this.f802c = iVar;
        this.f803d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.f800a + ", mUseCaseConfig=" + this.f801b + ", mStreamSpec=" + this.f802c + ", mCaptureTypes=" + this.f803d + ", mAttached=" + this.e + ", mActive=" + this.f804f + '}';
    }
}
