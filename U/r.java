package U;

import B.t0;
import C.d;
import D.O;
import F.h;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import j$.util.Objects;
import j0.f;

public final class r implements SurfaceHolder.Callback {

    /* renamed from: U  reason: collision with root package name */
    public Size f5299U;

    /* renamed from: V  reason: collision with root package name */
    public t0 f5300V;

    /* renamed from: W  reason: collision with root package name */
    public t0 f5301W;

    /* renamed from: X  reason: collision with root package name */
    public O f5302X;

    /* renamed from: Y  reason: collision with root package name */
    public Size f5303Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f5304Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5305a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ s f5306b0;

    public r(s sVar) {
        this.f5306b0 = sVar;
    }

    public final void a() {
        if (this.f5300V != null) {
            h.j("SurfaceViewImpl", "Request canceled: " + this.f5300V);
            this.f5300V.c();
        }
    }

    public final boolean b() {
        s sVar = this.f5306b0;
        Surface surface = sVar.e.getHolder().getSurface();
        if (this.f5304Z || this.f5300V == null || !Objects.equals(this.f5299U, this.f5303Y)) {
            return false;
        }
        h.j("SurfaceViewImpl", "Surface set on Preview.");
        O o2 = this.f5302X;
        t0 t0Var = this.f5300V;
        Objects.requireNonNull(t0Var);
        t0Var.a(surface, f.d(sVar.e.getContext()), new d(2, o2));
        this.f5304Z = true;
        sVar.f5288d = true;
        sVar.f();
        return true;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i8, int i9) {
        h.j("SurfaceViewImpl", "Surface changed. Size: " + i8 + "x" + i9);
        this.f5303Y = new Size(i8, i9);
        b();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        t0 t0Var;
        h.j("SurfaceViewImpl", "Surface created.");
        if (this.f5305a0 && (t0Var = this.f5301W) != null) {
            t0Var.c();
            t0Var.i.a((Object) null);
            this.f5301W = null;
            this.f5305a0 = false;
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h.j("SurfaceViewImpl", "Surface destroyed.");
        if (!this.f5304Z) {
            a();
        } else if (this.f5300V != null) {
            h.j("SurfaceViewImpl", "Surface closed " + this.f5300V);
            this.f5300V.f314k.a();
        }
        this.f5305a0 = true;
        t0 t0Var = this.f5300V;
        if (t0Var != null) {
            this.f5301W = t0Var;
        }
        this.f5304Z = false;
        this.f5300V = null;
        this.f5302X = null;
        this.f5303Y = null;
        this.f5299U = null;
    }
}
