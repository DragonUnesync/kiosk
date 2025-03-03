package X0;

import java.util.List;

public final class o extends n {

    /* renamed from: j  reason: collision with root package name */
    public final List f6267j;

    public o(j jVar, long j7, long j8, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
        super(jVar, j7, j8, j9, j10, list, j11, j12, j13);
        this.f6267j = list2;
    }

    public final long d(long j7) {
        return (long) this.f6267j.size();
    }

    public final j h(k kVar, long j7) {
        return (j) this.f6267j.get((int) (j7 - this.f6263d));
    }

    public final boolean i() {
        return true;
    }
}
