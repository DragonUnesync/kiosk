package J4;

import O4.a;
import T5.Z0;
import f6.C0911a;
import g7.C0996d;
import java.util.concurrent.TimeUnit;
import m4.f;
import m5.C1217b;

public final class c implements C1217b {

    /* renamed from: U  reason: collision with root package name */
    public final Z0 f2508U;

    /* renamed from: V  reason: collision with root package name */
    public final int f2509V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f2510W = false;

    /* renamed from: X  reason: collision with root package name */
    public long f2511X = TimeUnit.MILLISECONDS.toNanos(0);

    /* renamed from: Y  reason: collision with root package name */
    public final f f2512Y;

    /* renamed from: Z  reason: collision with root package name */
    public final a f2513Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2514a0;

    public c(Z0 z02, int i, a aVar, f fVar) {
        this.f2508U = z02;
        this.f2509V = i;
        this.f2513Z = aVar;
        this.f2512Y = fVar;
    }

    public final int H() {
        a();
        return this.f2509V;
    }

    public final void a() {
        if (!((C0911a) this.f2508U).inEventLoop()) {
            throw new IllegalStateException("MqttClientReconnector must be called from the eventLoop.");
        }
    }

    public final C1217b k0(long j7, TimeUnit timeUnit) {
        a();
        if (!this.f2514a0) {
            C0996d.r(timeUnit, "Time unit");
            this.f2511X = timeUnit.toNanos(j7);
            return this;
        }
        throw new UnsupportedOperationException("delay must only be called in onDisconnected.");
    }

    public final C1217b l0(boolean z) {
        a();
        this.f2510W = z;
        return this;
    }
}
