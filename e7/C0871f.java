package e7;

import l7.f;

/* renamed from: e7.f  reason: case insensitive filesystem */
public final class C0871f extends C0866a {

    /* renamed from: X  reason: collision with root package name */
    public boolean f11289X;

    public final void close() {
        if (!this.f11275V) {
            if (!this.f11289X) {
                k();
            }
            this.f11275V = true;
        }
    }

    public final long f(f fVar, long j7) {
        P6.f.e(fVar, "sink");
        if (this.f11275V) {
            throw new IllegalStateException("closed");
        } else if (this.f11289X) {
            return -1;
        } else {
            long f8 = super.f(fVar, 8192);
            if (f8 != -1) {
                return f8;
            }
            this.f11289X = true;
            k();
            return -1;
        }
    }
}
