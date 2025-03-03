package W2;

import android.os.SystemClock;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final double f6164a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6165b = 0;

    public static double a(long j7) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j7)) * f6164a;
    }
}
