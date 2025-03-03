package h1;

import M0.C0115c;
import M0.V;
import M0.W;
import M0.X;
import P0.z;

/* renamed from: h1.e  reason: case insensitive filesystem */
public final class C1039e extends r {

    /* renamed from: c  reason: collision with root package name */
    public final long f12462c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12463d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12464f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1039e(X x8, long j7, long j8) {
        super(x8);
        long j9;
        long j10 = j8;
        boolean z = false;
        if (x8.h() == 1) {
            X x9 = x8;
            W m8 = x8.m(0, new W(), 0);
            long max = Math.max(0, j7);
            if (m8.f2878k || max == 0 || m8.f2876h) {
                if (j10 == Long.MIN_VALUE) {
                    j9 = m8.f2880m;
                } else {
                    j9 = Math.max(0, j10);
                }
                long j11 = m8.f2880m;
                long j12 = -9223372036854775807L;
                int i = (j11 > -9223372036854775807L ? 1 : (j11 == -9223372036854775807L ? 0 : -1));
                if (i != 0) {
                    j9 = j9 > j11 ? j11 : j9;
                    if (max > j9) {
                        throw new C1040f(2, max, j9);
                    }
                }
                this.f12462c = max;
                this.f12463d = j9;
                int i8 = (j9 > -9223372036854775807L ? 1 : (j9 == -9223372036854775807L ? 0 : -1));
                this.e = i8 != 0 ? j9 - max : j12;
                if (m8.i && (i8 == 0 || (i != 0 && j9 == j11))) {
                    z = true;
                }
                this.f12464f = z;
                return;
            }
            throw new C1040f(1);
        }
        throw new C1040f(0);
    }

    public final V f(int i, V v4, boolean z) {
        long j7;
        this.f12507b.f(0, v4, z);
        long j8 = v4.e - this.f12462c;
        long j9 = this.e;
        if (j9 == -9223372036854775807L) {
            j7 = -9223372036854775807L;
        } else {
            j7 = j9 - j8;
        }
        v4.h(v4.f2862a, v4.f2863b, 0, j7, j8, C0115c.f2914c, false);
        return v4;
    }

    public final W m(int i, W w2, long j7) {
        this.f12507b.m(0, w2, 0);
        long j8 = w2.f2883p;
        long j9 = this.f12462c;
        w2.f2883p = j8 + j9;
        w2.f2880m = this.e;
        w2.i = this.f12464f;
        long j10 = w2.f2879l;
        if (j10 != -9223372036854775807L) {
            long max = Math.max(j10, j9);
            w2.f2879l = max;
            long j11 = this.f12463d;
            if (j11 != -9223372036854775807L) {
                max = Math.min(max, j11);
            }
            w2.f2879l = max - j9;
        }
        long c02 = z.c0(j9);
        long j12 = w2.e;
        if (j12 != -9223372036854775807L) {
            w2.e = j12 + c02;
        }
        long j13 = w2.f2874f;
        if (j13 != -9223372036854775807L) {
            w2.f2874f = j13 + c02;
        }
        return w2;
    }
}
