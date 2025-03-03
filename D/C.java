package D;

import B.h0;
import B.i0;
import F.h;

public final class C implements i0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f745b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f746c;

    public C(int i, long j7) {
        this.f745b = i;
        switch (i) {
            case 1:
                this.f746c = new I0(j7, new B(j7));
                return;
            default:
                this.f746c = new C(1, j7);
                return;
        }
    }

    public final h0 a(A a8) {
        switch (this.f745b) {
            case 0:
                if (((I0) ((C) this.f746c).f746c).a(a8).f258b) {
                    return h0.e;
                }
                Throwable th = (Throwable) a8.f740c;
                if (th instanceof G) {
                    h.l("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((G) th).f772U > 0) {
                        return h0.f256f;
                    }
                }
                return h0.f255d;
            default:
                return ((I0) this.f746c).a(a8);
        }
    }

    public final long b() {
        switch (this.f745b) {
            case 0:
                return ((I0) ((C) this.f746c).f746c).f794b;
            default:
                return ((I0) this.f746c).f794b;
        }
    }
}
