package androidx.lifecycle;

import N5.m;

public final class y implements A {

    /* renamed from: a  reason: collision with root package name */
    public final z f8176a;

    /* renamed from: b  reason: collision with root package name */
    public final m f8177b;

    /* renamed from: c  reason: collision with root package name */
    public int f8178c = -1;

    public y(z zVar, m mVar) {
        this.f8176a = zVar;
        this.f8177b = mVar;
    }

    public final void a(Object obj) {
        int i = this.f8178c;
        int i8 = this.f8176a.f8173g;
        if (i != i8) {
            this.f8178c = i8;
            this.f8177b.a(obj);
        }
    }

    public final void b() {
        this.f8176a.f(this);
    }
}
