package M;

import B.C0009j;
import B.t0;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import u0.C1486a;

public final /* synthetic */ class b implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f2715a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f2716b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f2717c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Surface f2718d;

    public /* synthetic */ b(c cVar, t0 t0Var, SurfaceTexture surfaceTexture, Surface surface) {
        this.f2715a = cVar;
        this.f2716b = t0Var;
        this.f2717c = surfaceTexture;
        this.f2718d = surface;
    }

    public final void accept(Object obj) {
        c cVar = this.f2715a;
        t0 t0Var = this.f2716b;
        SurfaceTexture surfaceTexture = this.f2717c;
        Surface surface = this.f2718d;
        C0009j jVar = (C0009j) obj;
        cVar.getClass();
        synchronized (t0Var.f306a) {
            t0Var.f316m = null;
            t0Var.f317n = null;
        }
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        surface.release();
        cVar.f2727c0--;
        cVar.a();
    }
}
