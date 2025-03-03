package K1;

import A1.d;
import P0.r;
import p1.G;
import p1.q;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final e f2569a = new e();

    /* renamed from: b  reason: collision with root package name */
    public G f2570b;

    /* renamed from: c  reason: collision with root package name */
    public q f2571c;

    /* renamed from: d  reason: collision with root package name */
    public g f2572d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f2573f;

    /* renamed from: g  reason: collision with root package name */
    public long f2574g;

    /* renamed from: h  reason: collision with root package name */
    public int f2575h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public d f2576j = new d(16, false);

    /* renamed from: k  reason: collision with root package name */
    public long f2577k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2578l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2579m;

    public void a(long j7) {
        this.f2574g = j7;
    }

    public abstract long b(r rVar);

    public abstract boolean c(r rVar, long j7, d dVar);

    public void d(boolean z) {
        if (z) {
            this.f2576j = new d(16, false);
            this.f2573f = 0;
            this.f2575h = 0;
        } else {
            this.f2575h = 1;
        }
        this.e = -1;
        this.f2574g = 0;
    }
}
