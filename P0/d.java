package P0;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

public final class d implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f3695a0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: U  reason: collision with root package name */
    public final Handler f3696U;

    /* renamed from: V  reason: collision with root package name */
    public final int[] f3697V = new int[1];

    /* renamed from: W  reason: collision with root package name */
    public EGLDisplay f3698W;

    /* renamed from: X  reason: collision with root package name */
    public EGLContext f3699X;

    /* renamed from: Y  reason: collision with root package name */
    public EGLSurface f3700Y;

    /* renamed from: Z  reason: collision with root package name */
    public SurfaceTexture f3701Z;

    public d(Handler handler) {
        this.f3696U = handler;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3696U.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f3701Z;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
