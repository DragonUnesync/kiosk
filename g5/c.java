package G5;

import F.h;
import U.t;
import a0.j;
import a0.m;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import j0.f;

public final class c implements TextureView.SurfaceTextureListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1662U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f1663V;

    public /* synthetic */ c(int i, Object obj) {
        this.f1662U = i;
        this.f1663V = obj;
    }

    private final void a(SurfaceTexture surfaceTexture) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i8) {
        switch (this.f1662U) {
            case 0:
                onSurfaceTextureSizeChanged(surfaceTexture, i, i8);
                return;
            default:
                h.j("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i8);
                t tVar = (t) this.f1663V;
                tVar.f5308f = surfaceTexture;
                if (tVar.f5309g != null) {
                    tVar.f5310h.getClass();
                    h.j("TextureViewImpl", "Surface invalidated " + tVar.f5310h);
                    tVar.f5310h.f314k.a();
                    return;
                }
                tVar.h();
                return;
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f1662U) {
            case 0:
                return false;
            default:
                t tVar = (t) this.f1663V;
                tVar.f5308f = null;
                m mVar = tVar.f5309g;
                if (mVar != null) {
                    R2.c cVar = new R2.c(this, surfaceTexture);
                    mVar.d(new G.h(mVar, 0, cVar), f.d(tVar.e.getContext()));
                    tVar.f5311j = surfaceTexture;
                    return false;
                }
                h.j("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i8) {
        switch (this.f1662U) {
            case 0:
                v vVar = new v(i, i8);
                f fVar = (f) this.f1663V;
                fVar.f1683m0 = vVar;
                fVar.e();
                return;
            default:
                h.j("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i8);
                return;
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f1662U) {
            case 0:
                return;
            default:
                j jVar = (j) ((t) this.f1663V).f5312k.getAndSet((Object) null);
                if (jVar != null) {
                    jVar.a((Object) null);
                    return;
                }
                return;
        }
    }
}
