package M;

import B.C0022x;
import B3.q;
import F.h;
import O.a;
import O.c;
import O.f;
import O.g;
import O.i;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.C1487b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f2732a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2733b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Thread f2734c;

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f2735d = EGL14.EGL_NO_DISPLAY;
    public EGLContext e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f  reason: collision with root package name */
    public int[] f2736f = i.f3487a;

    /* renamed from: g  reason: collision with root package name */
    public EGLConfig f2737g;

    /* renamed from: h  reason: collision with root package name */
    public EGLSurface f2738h = EGL14.EGL_NO_SURFACE;
    public Surface i;

    /* renamed from: j  reason: collision with root package name */
    public Map f2739j = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    public g f2740k = null;

    /* renamed from: l  reason: collision with root package name */
    public f f2741l = f.f3477U;

    /* renamed from: m  reason: collision with root package name */
    public int f2742m = -1;

    public final void a(C0022x xVar, q qVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        q qVar2 = qVar;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f2735d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i12 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f2735d, iArr, 0, iArr, 1)) {
                if (qVar2 != null) {
                    String str = iArr[0] + "." + iArr[1];
                    if (str != null) {
                        qVar2.f450V = str;
                    } else {
                        throw new NullPointerException("Null eglVersion");
                    }
                }
                if (xVar.a()) {
                    i8 = 10;
                } else {
                    i8 = 8;
                }
                if (xVar.a()) {
                    i9 = 2;
                } else {
                    i9 = 8;
                }
                if (xVar.a()) {
                    i10 = 64;
                } else {
                    i10 = 4;
                }
                if (xVar.a()) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f2735d, new int[]{12324, i8, 12323, i8, 12322, i8, 12321, i9, 12325, 0, 12326, 0, 12352, i10, 12610, i11, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (xVar.a()) {
                        i12 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f2735d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i12, 12344}, 0);
                    i.a("eglCreateContext");
                    this.f2737g = eGLConfig;
                    this.e = eglCreateContext;
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f2735d, eglCreateContext, 12440, iArr2, 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f2735d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public final c b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f2735d;
            EGLConfig eGLConfig = this.f2737g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface i8 = i.i(eGLDisplay, eGLConfig, surface, this.f2736f);
            EGLDisplay eGLDisplay2 = this.f2735d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, i8, 12375, iArr, 0);
            int i9 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, i8, 12374, iArr2, 0);
            Size size = new Size(i9, iArr2[0]);
            return new c(i8, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e8) {
            h.J("OpenGlRenderer", "Failed to create EGL surface: " + e8.getMessage(), e8);
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f2735d;
        EGLConfig eGLConfig = this.f2737g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = i.f3487a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        i.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.f2738h = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public final C1487b d(C0022x xVar) {
        i.d(this.f2732a, false);
        try {
            a(xVar, (q) null);
            c();
            f(this.f2738h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f2735d, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new C1487b(glGetString, eglQueryString);
        } catch (IllegalStateException e8) {
            h.J("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e8.getMessage(), e8);
            return new C1487b("", "");
        } finally {
            h();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, B3.q] */
    public a e(C0022x xVar, Map map) {
        AtomicBoolean atomicBoolean = this.f2732a;
        i.d(atomicBoolean, false);
        ? obj = new Object();
        obj.f449U = "0.0";
        obj.f450V = "0.0";
        String str = "";
        obj.f451W = str;
        obj.f452X = str;
        try {
            if (xVar.a()) {
                C1487b d8 = d(xVar);
                String str2 = (String) d8.f15731a;
                String str3 = (String) d8.f15732b;
                if (!str2.contains("GL_EXT_YUV_target")) {
                    h.I("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    xVar = C0022x.f360d;
                }
                this.f2736f = i.f(str3, xVar);
                obj.f451W = str2;
                obj.f452X = str3;
            }
            a(xVar, obj);
            c();
            f(this.f2738h);
            String j7 = i.j();
            if (j7 != null) {
                obj.f449U = j7;
                this.f2739j = i.g(xVar, map);
                int h5 = i.h();
                this.f2742m = h5;
                k(h5);
                this.f2734c = Thread.currentThread();
                atomicBoolean.set(true);
                if (((String) obj.f449U) == null) {
                    str = " glVersion";
                }
                if (((String) obj.f450V) == null) {
                    str = str.concat(" eglVersion");
                }
                if (str.isEmpty()) {
                    return new a((String) obj.f449U, (String) obj.f450V, (String) obj.f451W, (String) obj.f452X);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            throw new NullPointerException("Null glVersion");
        } catch (IllegalStateException e8) {
            e = e8;
            h();
            throw e;
        } catch (IllegalArgumentException e9) {
            e = e9;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.f2735d.getClass();
        this.e.getClass();
        if (!EGL14.eglMakeCurrent(this.f2735d, eGLSurface, eGLSurface, this.e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void g(Surface surface) {
        i.d(this.f2732a, true);
        i.c(this.f2734c);
        HashMap hashMap = this.f2733b;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, i.f3494j);
        }
    }

    public final void h() {
        for (g gVar : this.f2739j.values()) {
            GLES20.glDeleteProgram(gVar.f3481a);
        }
        this.f2739j = Collections.emptyMap();
        this.f2740k = null;
        if (!Objects.equals(this.f2735d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f2735d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = this.f2733b;
            for (c cVar : hashMap.values()) {
                if (!Objects.equals(cVar.f3473a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f2735d, cVar.f3473a)) {
                    try {
                        i.a("eglDestroySurface");
                    } catch (IllegalStateException e8) {
                        h.m("GLUtils", e8.toString(), e8);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals(this.f2738h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f2735d, this.f2738h);
                this.f2738h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f2735d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f2735d);
            this.f2735d = EGL14.EGL_NO_DISPLAY;
        }
        this.f2737g = null;
        this.f2742m = -1;
        this.f2741l = f.f3477U;
        this.i = null;
        this.f2734c = null;
    }

    public final void i(Surface surface, boolean z) {
        c cVar;
        if (this.i == surface) {
            this.i = null;
            f(this.f2738h);
        }
        HashMap hashMap = this.f2733b;
        if (z) {
            cVar = (c) hashMap.remove(surface);
        } else {
            cVar = (c) hashMap.put(surface, i.f3494j);
        }
        if (cVar != null && cVar != i.f3494j) {
            try {
                EGL14.eglDestroySurface(this.f2735d, cVar.f3473a);
            } catch (RuntimeException e8) {
                h.J("OpenGlRenderer", "Failed to destroy EGL surface: " + e8.getMessage(), e8);
            }
        }
    }

    public final void j(long j7, float[] fArr, Surface surface) {
        i.d(this.f2732a, true);
        i.c(this.f2734c);
        HashMap hashMap = this.f2733b;
        n2.a.m("The surface is not registered.", hashMap.containsKey(surface));
        c cVar = (c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == i.f3494j) {
            cVar = b(surface);
            if (cVar != null) {
                hashMap.put(surface, cVar);
            } else {
                return;
            }
        }
        Surface surface2 = this.i;
        EGLSurface eGLSurface = cVar.f3473a;
        if (surface != surface2) {
            f(eGLSurface);
            this.i = surface;
            int i8 = cVar.f3474b;
            int i9 = cVar.f3475c;
            GLES20.glViewport(0, 0, i8, i9);
            GLES20.glScissor(0, 0, i8, i9);
        }
        g gVar = this.f2740k;
        gVar.getClass();
        if (gVar instanceof O.h) {
            GLES20.glUniformMatrix4fv(((O.h) gVar).f3485f, 1, false, fArr, 0);
            i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        i.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f2735d, eGLSurface, j7);
        if (!EGL14.eglSwapBuffers(this.f2735d, eGLSurface)) {
            h.I("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            i(surface, false);
        }
    }

    public final void k(int i8) {
        g gVar = (g) this.f2739j.get(this.f2741l);
        if (gVar != null) {
            if (this.f2740k != gVar) {
                this.f2740k = gVar;
                gVar.b();
                Log.d("OpenGlRenderer", "Using program for input format " + this.f2741l + ": " + this.f2740k);
            }
            GLES20.glActiveTexture(33984);
            i.b("glActiveTexture");
            GLES20.glBindTexture(36197, i8);
            i.b("glBindTexture");
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + this.f2741l);
    }
}
