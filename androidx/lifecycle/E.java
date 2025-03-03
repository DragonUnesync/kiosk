package androidx.lifecycle;

import P6.f;
import U.p;
import Z1.c;
import android.os.Handler;

public final class E implements r {

    /* renamed from: c0  reason: collision with root package name */
    public static final E f8107c0 = new E();

    /* renamed from: U  reason: collision with root package name */
    public int f8108U;

    /* renamed from: V  reason: collision with root package name */
    public int f8109V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8110W = true;

    /* renamed from: X  reason: collision with root package name */
    public boolean f8111X = true;

    /* renamed from: Y  reason: collision with root package name */
    public Handler f8112Y;

    /* renamed from: Z  reason: collision with root package name */
    public final t f8113Z = new t(this);

    /* renamed from: a0  reason: collision with root package name */
    public final p f8114a0 = new p(13, (Object) this);

    /* renamed from: b0  reason: collision with root package name */
    public final c f8115b0 = new c(2, (Object) this);

    public final void b() {
        int i = this.f8109V + 1;
        this.f8109V = i;
        if (i != 1) {
            return;
        }
        if (this.f8110W) {
            this.f8113Z.d(C0485l.ON_RESUME);
            this.f8110W = false;
            return;
        }
        Handler handler = this.f8112Y;
        f.b(handler);
        handler.removeCallbacks(this.f8114a0);
    }

    public final t e() {
        return this.f8113Z;
    }
}
