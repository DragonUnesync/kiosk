package i1;

import java.util.NoSuchElementException;

/* renamed from: i1.b  reason: case insensitive filesystem */
public abstract class C1089b implements k {

    /* renamed from: U  reason: collision with root package name */
    public final long f12640U;

    /* renamed from: V  reason: collision with root package name */
    public final long f12641V;

    /* renamed from: W  reason: collision with root package name */
    public long f12642W;

    public C1089b(long j7, long j8) {
        this.f12640U = j7;
        this.f12641V = j8;
        this.f12642W = j7 - 1;
    }

    public final void a() {
        long j7 = this.f12642W;
        if (j7 < this.f12640U || j7 > this.f12641V) {
            throw new NoSuchElementException();
        }
    }

    public final boolean next() {
        boolean z;
        long j7 = this.f12642W + 1;
        this.f12642W = j7;
        if (j7 > this.f12641V) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
