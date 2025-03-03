package T0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: T0.v  reason: case insensitive filesystem */
public final class C0229v implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0232y f4905U;

    public C0229v(C0232y yVar) {
        this.f4905U = yVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i8) {
        C0232y yVar = this.f4905U;
        yVar.getClass();
        Surface surface = new Surface(surfaceTexture);
        yVar.S(surface);
        yVar.f4923L0 = surface;
        yVar.J(i, i8);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0232y yVar = this.f4905U;
        yVar.S((Object) null);
        yVar.J(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i8) {
        this.f4905U.J(i, i8);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i8, int i9) {
        this.f4905U.J(i8, i9);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0232y yVar = this.f4905U;
        if (yVar.f4926O0) {
            yVar.S(surfaceHolder.getSurface());
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0232y yVar = this.f4905U;
        if (yVar.f4926O0) {
            yVar.S((Object) null);
        }
        yVar.J(0, 0);
    }
}
