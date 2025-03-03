package l7;

import P6.f;
import java.nio.ByteBuffer;

public final class o implements g {

    /* renamed from: U  reason: collision with root package name */
    public final u f13232U;

    /* renamed from: V  reason: collision with root package name */
    public final f f13233V = new Object();

    /* renamed from: W  reason: collision with root package name */
    public boolean f13234W;

    /* JADX WARNING: type inference failed for: r2v1, types: [l7.f, java.lang.Object] */
    public o(u uVar) {
        f.e(uVar, "sink");
        this.f13232U = uVar;
    }

    public final y a() {
        return this.f13232U.a();
    }

    public final void close() {
        u uVar = this.f13232U;
        if (!this.f13234W) {
            try {
                f fVar = this.f13233V;
                long j7 = fVar.f13216V;
                if (j7 > 0) {
                    uVar.h(fVar, j7);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                uVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f13234W = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.f13234W) {
            f fVar = this.f13233V;
            long j7 = fVar.f13216V;
            u uVar = this.f13232U;
            if (j7 > 0) {
                uVar.h(fVar, j7);
            }
            uVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void h(f fVar, long j7) {
        f.e(fVar, "source");
        if (!this.f13234W) {
            this.f13233V.h(fVar, j7);
            k();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final g i(String str) {
        f.e(str, "string");
        if (!this.f13234W) {
            this.f13233V.D(str);
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f13234W;
    }

    public final g k() {
        if (!this.f13234W) {
            f fVar = this.f13233V;
            long j7 = fVar.f13216V;
            if (j7 == 0) {
                j7 = 0;
            } else {
                r rVar = fVar.f13215U;
                f.b(rVar);
                r rVar2 = rVar.f13244g;
                f.b(rVar2);
                int i = rVar2.f13241c;
                if (i < 8192 && rVar2.e) {
                    j7 -= (long) (i - rVar2.f13240b);
                }
            }
            if (j7 > 0) {
                this.f13232U.h(fVar, j7);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final g l(int i) {
        if (!this.f13234W) {
            this.f13233V.z(i);
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final g m(int i) {
        if (!this.f13234W) {
            this.f13233V.B(i);
            k();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f13232U + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        f.e(byteBuffer, "source");
        if (!this.f13234W) {
            int write = this.f13233V.write(byteBuffer);
            k();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
