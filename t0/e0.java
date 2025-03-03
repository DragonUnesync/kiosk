package T0;

import P0.l;
import P0.z;

public final class e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f4815c;

    /* renamed from: a  reason: collision with root package name */
    public final long f4816a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4817b;

    static {
        e0 e0Var = new e0(0, 0);
        new e0(Long.MAX_VALUE, Long.MAX_VALUE);
        new e0(Long.MAX_VALUE, 0);
        new e0(0, Long.MAX_VALUE);
        f4815c = e0Var;
    }

    public e0(long j7, long j8) {
        boolean z;
        boolean z6 = false;
        if (j7 >= 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        l.d(j8 >= 0 ? true : z6);
        this.f4816a = j7;
        this.f4817b = j8;
    }

    public final long a(long j7, long j8, long j9) {
        boolean z;
        long j10 = this.f4817b;
        long j11 = this.f4816a;
        if (j11 == 0 && j10 == 0) {
            return j7;
        }
        int i = z.f3748a;
        long j12 = j7 - j11;
        if (((j11 ^ j7) & (j7 ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        long j13 = j7 + j10;
        if (((j10 ^ j13) & (j7 ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z6 = false;
        if (j12 > j8 || j8 > j13) {
            z = false;
        } else {
            z = true;
        }
        if (j12 <= j9 && j9 <= j13) {
            z6 = true;
        }
        if (!z || !z6) {
            if (z) {
                return j8;
            }
            if (z6) {
                return j9;
            }
            return j12;
        } else if (Math.abs(j8 - j7) <= Math.abs(j9 - j7)) {
            return j8;
        } else {
            return j9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f4816a == e0Var.f4816a && this.f4817b == e0Var.f4817b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4816a) * 31) + ((int) this.f4817b);
    }
}
