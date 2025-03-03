package Y6;

import Z6.b;
import java.io.Closeable;
import l7.f;
import l7.h;
import l7.q;

public final class v implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6752U;

    /* renamed from: V  reason: collision with root package name */
    public final long f6753V;

    /* renamed from: W  reason: collision with root package name */
    public final h f6754W;

    public /* synthetic */ v(long j7, h hVar, int i) {
        this.f6752U = i;
        this.f6753V = j7;
        this.f6754W = hVar;
    }

    public final void close() {
        b.c(l());
    }

    public final long k() {
        switch (this.f6752U) {
            case 0:
                return this.f6753V;
            default:
                return this.f6753V;
        }
    }

    public final h l() {
        switch (this.f6752U) {
            case 0:
                return (f) this.f6754W;
            default:
                return (q) this.f6754W;
        }
    }
}
