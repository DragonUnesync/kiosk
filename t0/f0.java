package T0;

import M0.L;
import P0.t;
import P0.z;
import android.os.SystemClock;

public final class f0 implements J {

    /* renamed from: U  reason: collision with root package name */
    public final t f4828U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f4829V;

    /* renamed from: W  reason: collision with root package name */
    public long f4830W;

    /* renamed from: X  reason: collision with root package name */
    public long f4831X;

    /* renamed from: Y  reason: collision with root package name */
    public L f4832Y = L.f2845d;

    public f0(t tVar) {
        this.f4828U = tVar;
    }

    public final /* synthetic */ boolean a() {
        return false;
    }

    public final void b(long j7) {
        this.f4830W = j7;
        if (this.f4829V) {
            this.f4828U.getClass();
            this.f4831X = SystemClock.elapsedRealtime();
        }
    }

    public final L c() {
        return this.f4832Y;
    }

    public final void d(L l8) {
        if (this.f4829V) {
            b(e());
        }
        this.f4832Y = l8;
    }

    public final long e() {
        long j7;
        long j8 = this.f4830W;
        if (!this.f4829V) {
            return j8;
        }
        this.f4828U.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4831X;
        L l8 = this.f4832Y;
        if (l8.f2846a == 1.0f) {
            j7 = z.O(elapsedRealtime);
        } else {
            j7 = elapsedRealtime * ((long) l8.f2848c);
        }
        return j8 + j7;
    }

    public final void f() {
        if (!this.f4829V) {
            this.f4828U.getClass();
            this.f4831X = SystemClock.elapsedRealtime();
            this.f4829V = true;
        }
    }
}
