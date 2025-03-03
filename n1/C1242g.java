package n1;

import P0.z;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* renamed from: n1.g  reason: case insensitive filesystem */
public final class C1242g extends Surface {

    /* renamed from: X  reason: collision with root package name */
    public static int f13621X;

    /* renamed from: Y  reason: collision with root package name */
    public static boolean f13622Y;

    /* renamed from: U  reason: collision with root package name */
    public final boolean f13623U;

    /* renamed from: V  reason: collision with root package name */
    public final C1241f f13624V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f13625W;

    public C1242g(C1241f fVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f13624V = fVar;
        this.f13623U = z;
    }

    public static synchronized boolean k(Context context) {
        boolean z;
        int i;
        boolean z6;
        synchronized (C1242g.class) {
            try {
                z = true;
                if (!f13622Y) {
                    int i8 = z.f3748a;
                    if (i8 >= 24) {
                        if (i8 < 26) {
                            if (!"samsung".equals(z.f3750c)) {
                                if ("XT1650".equals(z.f3751d)) {
                                }
                            }
                        }
                        if (i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                                String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                                if (eglQueryString2 == null || !eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                f13621X = i;
                                f13622Y = true;
                            }
                        }
                    }
                    i = 0;
                    f13621X = i;
                    f13622Y = true;
                }
                if (f13621X == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f13624V) {
            try {
                if (!this.f13625W) {
                    C1241f fVar = this.f13624V;
                    fVar.f13617V.getClass();
                    fVar.f13617V.sendEmptyMessage(2);
                    this.f13625W = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
