package D2;

import W2.f;

public final class w implements D {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f1185U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f1186V;

    /* renamed from: W  reason: collision with root package name */
    public final D f1187W;

    /* renamed from: X  reason: collision with root package name */
    public final q f1188X;

    /* renamed from: Y  reason: collision with root package name */
    public final v f1189Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1190Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1191a0;

    public w(D d8, boolean z, boolean z6, v vVar, q qVar) {
        f.c(d8, "Argument must not be null");
        this.f1187W = d8;
        this.f1185U = z;
        this.f1186V = z6;
        this.f1189Y = vVar;
        f.c(qVar, "Argument must not be null");
        this.f1188X = qVar;
    }

    public final synchronized void a() {
        if (!this.f1191a0) {
            this.f1190Z++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final void b() {
        boolean z;
        synchronized (this) {
            int i = this.f1190Z;
            if (i > 0) {
                z = true;
                int i8 = i - 1;
                this.f1190Z = i8;
                if (i8 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f1188X.f(this.f1189Y, this);
        }
    }

    public final int c() {
        return this.f1187W.c();
    }

    public final Class d() {
        return this.f1187W.d();
    }

    public final synchronized void e() {
        if (this.f1190Z > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f1191a0) {
            this.f1191a0 = true;
            if (this.f1186V) {
                this.f1187W.e();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final Object get() {
        return this.f1187W.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f1185U + ", listener=" + this.f1188X + ", key=" + this.f1189Y + ", acquired=" + this.f1190Z + ", isRecycled=" + this.f1191a0 + ", resource=" + this.f1187W + '}';
    }
}
