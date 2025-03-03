package J4;

import D2.o;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import m5.C1216a;
import m5.C1217b;

public final class a implements C1216a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2505c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f2506a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2507b;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toNanos(1);
        timeUnit.toNanos(120);
    }

    public a(long j7, long j8) {
        this.f2506a = j7;
        this.f2507b = j8;
    }

    public final void a(o oVar) {
        if (oVar.f1137V != 1) {
            C1217b i = oVar.i();
            long min = (long) Math.min(Math.pow(2.0d, (double) i.H()) * ((double) this.f2506a), (double) this.f2507b);
            i.l0(true).k0(min + ((long) (((((double) min) / 4.0d) / 2.147483647E9d) * ((double) ThreadLocalRandom.current().nextInt()))), TimeUnit.NANOSECONDS);
        }
    }
}
