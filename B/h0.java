package B;

import n2.a;

public final class h0 {

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f255d = new h0(0, false, false);
    public static final h0 e = new h0(500, true, false);

    /* renamed from: f  reason: collision with root package name */
    public static final h0 f256f = new h0(0, false, true);

    /* renamed from: a  reason: collision with root package name */
    public final long f257a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f258b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f259c;

    static {
        new h0(100, true, false);
    }

    public h0(long j7, boolean z, boolean z6) {
        this.f258b = z;
        this.f257a = j7;
        if (z6) {
            a.h("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.f259c = z6;
    }
}
