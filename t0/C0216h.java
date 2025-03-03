package T0;

/* renamed from: T0.h  reason: case insensitive filesystem */
public final class C0216h {

    /* renamed from: a  reason: collision with root package name */
    public final long f4841a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4842b;

    /* renamed from: c  reason: collision with root package name */
    public long f4843c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public long f4844d = -9223372036854775807L;
    public long e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f4845f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f4846g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f4847h = -9223372036854775807L;
    public float i = 1.03f;

    /* renamed from: j  reason: collision with root package name */
    public float f4848j = 0.97f;

    /* renamed from: k  reason: collision with root package name */
    public float f4849k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public long f4850l = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    public long f4851m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public long f4852n = -9223372036854775807L;

    public C0216h(long j7, long j8) {
        this.f4841a = j7;
        this.f4842b = j8;
    }

    public final void a() {
        long j7;
        long j8 = this.f4843c;
        if (j8 != -9223372036854775807L) {
            j7 = this.f4844d;
            if (j7 == -9223372036854775807L) {
                long j9 = this.f4845f;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j7 = this.f4846g;
                if (j7 == -9223372036854775807L || j8 <= j7) {
                    j7 = j8;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.e != j7) {
            this.e = j7;
            this.f4847h = j7;
            this.f4851m = -9223372036854775807L;
            this.f4852n = -9223372036854775807L;
            this.f4850l = -9223372036854775807L;
        }
    }
}
