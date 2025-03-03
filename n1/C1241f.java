package n1;

import P0.d;
import P0.e;
import P0.l;
import P0.z;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* renamed from: n1.f  reason: case insensitive filesystem */
public final class C1241f extends HandlerThread implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public d f13616U;

    /* renamed from: V  reason: collision with root package name */
    public Handler f13617V;

    /* renamed from: W  reason: collision with root package name */
    public Error f13618W;

    /* renamed from: X  reason: collision with root package name */
    public RuntimeException f13619X;

    /* renamed from: Y  reason: collision with root package name */
    public C1242g f13620Y;

    public final void a(int i) {
        boolean z;
        boolean z6;
        boolean z8;
        EGLSurface eGLSurface;
        boolean z9;
        int i8 = i;
        boolean z10 = true;
        this.f13616U.getClass();
        d dVar = this.f13616U;
        dVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z = true;
        } else {
            z = false;
        }
        l.f("eglGetDisplay failed", z);
        int[] iArr = new int[2];
        l.f("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        dVar.f3698W = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = iArr2;
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, d.f3695a0, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!eglChooseConfig || iArr3[0] <= 0 || eGLConfigArr[0] == null) {
            z6 = false;
        } else {
            z6 = true;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i9 = z.f3748a;
        l.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z6);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(dVar.f3698W, eGLConfig, EGL14.EGL_NO_CONTEXT, i8 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        l.f("eglCreateContext failed", z8);
        dVar.f3699X = eglCreateContext;
        EGLDisplay eGLDisplay = dVar.f3698W;
        if (i8 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i8 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            l.f("eglCreatePbufferSurface failed", z9);
        }
        l.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext));
        dVar.f3700Y = eGLSurface;
        int[] iArr4 = dVar.f3697V;
        GLES20.glGenTextures(1, iArr4, 0);
        l.e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr4[0]);
        dVar.f3701Z = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(dVar);
        SurfaceTexture surfaceTexture2 = this.f13616U.f3701Z;
        surfaceTexture2.getClass();
        if (i8 == 0) {
            z10 = false;
        }
        this.f13620Y = new C1242g(this, surfaceTexture2, z10);
    }

    public final void b() {
        this.f13616U.getClass();
        d dVar = this.f13616U;
        dVar.f3696U.removeCallbacks(dVar);
        try {
            SurfaceTexture surfaceTexture = dVar.f3701Z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, dVar.f3697V, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = dVar.f3698W;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = dVar.f3698W;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = dVar.f3700Y;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(dVar.f3698W, dVar.f3700Y);
            }
            EGLContext eGLContext = dVar.f3699X;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(dVar.f3698W, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = dVar.f3698W;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(dVar.f3698W);
            }
            dVar.f3698W = null;
            dVar.f3699X = null;
            dVar.f3700Y = null;
            dVar.f3701Z = null;
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                l.p("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.f13619X = e;
                synchronized (this) {
                    notify();
                }
            } catch (e e8) {
                l.p("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                this.f13619X = new IllegalStateException(e8);
                synchronized (this) {
                    notify();
                }
            } catch (Error e9) {
                try {
                    l.p("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f13618W = e9;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                b();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
