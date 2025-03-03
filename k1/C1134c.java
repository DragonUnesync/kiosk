package k1;

import D.C0051j0;
import M0.Y;
import M0.r;
import P0.l;
import P0.z;
import android.os.SystemClock;
import i1.C1092e;
import java.util.Arrays;
import java.util.List;

/* renamed from: k1.c  reason: case insensitive filesystem */
public abstract class C1134c implements r {

    /* renamed from: a  reason: collision with root package name */
    public final Y f12920a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12921b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f12922c;

    /* renamed from: d  reason: collision with root package name */
    public final r[] f12923d;
    public final long[] e;

    /* renamed from: f  reason: collision with root package name */
    public int f12924f;

    public C1134c(Y y8, int[] iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        y8.getClass();
        this.f12920a = y8;
        int length = iArr.length;
        this.f12921b = length;
        this.f12923d = new r[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f12923d[i8] = y8.f2888d[iArr[i8]];
        }
        Arrays.sort(this.f12923d, new C0051j0(16));
        this.f12922c = new int[this.f12921b];
        while (true) {
            int i9 = this.f12921b;
            if (i < i9) {
                this.f12922c[i] = y8.b(this.f12923d[i]);
                i++;
            } else {
                this.e = new long[i9];
                return;
            }
        }
    }

    public final int a(r rVar) {
        for (int i = 0; i < this.f12921b; i++) {
            if (this.f12923d[i] == rVar) {
                return i;
            }
        }
        return -1;
    }

    public final void c(boolean z) {
    }

    public final boolean d(int i, long j7) {
        if (this.e[i] > j7) {
            return true;
        }
        return false;
    }

    public final r e(int i) {
        return this.f12923d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1134c cVar = (C1134c) obj;
        if (!this.f12920a.equals(cVar.f12920a) || !Arrays.equals(this.f12922c, cVar.f12922c)) {
            return false;
        }
        return true;
    }

    public void f() {
    }

    public final int g(int i) {
        return this.f12922c[i];
    }

    public int h(long j7, List list) {
        return list.size();
    }

    public final int hashCode() {
        if (this.f12924f == 0) {
            this.f12924f = Arrays.hashCode(this.f12922c) + (System.identityHashCode(this.f12920a) * 31);
        }
        return this.f12924f;
    }

    public final /* synthetic */ boolean i(long j7, C1092e eVar, List list) {
        return false;
    }

    public void j() {
    }

    public final int k() {
        return this.f12922c[o()];
    }

    public final Y l() {
        return this.f12920a;
    }

    public final int length() {
        return this.f12922c.length;
    }

    public final r m() {
        return this.f12923d[o()];
    }

    public final boolean p(int i, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean d8 = d(i, elapsedRealtime);
        for (int i8 = 0; i8 < this.f12921b && !d8; i8++) {
            if (i8 == i || d(i8, elapsedRealtime)) {
                d8 = false;
            } else {
                d8 = true;
            }
        }
        if (!d8) {
            return false;
        }
        long[] jArr = this.e;
        long j8 = jArr[i];
        int i9 = z.f3748a;
        long j9 = elapsedRealtime + j7;
        if (((j7 ^ j9) & (elapsedRealtime ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j8, j9);
        return true;
    }

    public void q(float f8) {
    }

    public final /* synthetic */ void s() {
    }

    public final /* synthetic */ void t() {
    }

    public final int u(int i) {
        for (int i8 = 0; i8 < this.f12921b; i8++) {
            if (this.f12922c[i8] == i) {
                return i8;
            }
        }
        return -1;
    }
}
