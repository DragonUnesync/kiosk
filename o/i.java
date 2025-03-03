package O;

import B.C0022x;
import F.h;
import N.e;
import Q0.g;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.a;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3487a = {12344};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3488b = {12445, 13632, 12344};

    /* renamed from: c  reason: collision with root package name */
    public static final String f3489c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: d  reason: collision with root package name */
    public static final String f3490d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    public static final d e = new d(0);

    /* renamed from: f  reason: collision with root package name */
    public static final d f3491f = new d(1);

    /* renamed from: g  reason: collision with root package name */
    public static final d f3492g = new d(2);

    /* renamed from: h  reason: collision with root package name */
    public static final FloatBuffer f3493h;
    public static final FloatBuffer i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f3494j = new c(EGL14.EGL_NO_SURFACE, 0, 0);

    static {
        Locale locale = Locale.US;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f3493h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        i = asFloatBuffer2;
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder B8 = e.B(str, ": EGL error: 0x");
            B8.append(Integer.toHexString(eglGetError));
            throw new IllegalStateException(B8.toString());
        }
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder B8 = e.B(str, ": GL error 0x");
            B8.append(Integer.toHexString(glGetError));
            throw new IllegalStateException(B8.toString());
        }
    }

    public static void c(Thread thread) {
        boolean z;
        if (thread == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        a.m("Method call must be called on the GL thread.", z);
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        boolean z6;
        String str;
        if (z == atomicBoolean.get()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        a.m(str, z6);
    }

    public static void e(int i8, String str) {
        if (i8 < 0) {
            throw new IllegalStateException(e.y("Unable to locate '", str, "' in program"));
        }
    }

    public static int[] f(String str, C0022x xVar) {
        int[] iArr = f3487a;
        if (xVar.f364a != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f3488b;
        }
        h.I("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static HashMap g(C0022x xVar, Map map) {
        Object obj;
        f fVar;
        boolean z;
        HashMap hashMap = new HashMap();
        for (f fVar2 : f.values()) {
            d dVar = (d) map.get(fVar2);
            if (dVar != null) {
                obj = new h(xVar, dVar);
            } else if (fVar2 == f.f3479W || fVar2 == (fVar = f.f3478V)) {
                obj = new h(xVar, fVar2);
            } else {
                if (fVar2 == f.f3477U) {
                    z = true;
                } else {
                    z = false;
                }
                a.m("Unhandled input format: " + fVar2, z);
                if (xVar.a()) {
                    obj = new g("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    d dVar2 = (d) map.get(fVar);
                    if (dVar2 != null) {
                        obj = new h(xVar, dVar2);
                    } else {
                        obj = new h(xVar, fVar);
                    }
                }
            }
            Log.d("GLUtils", "Shader program for input format " + fVar2 + " created: " + obj);
            hashMap.put(fVar2, obj);
        }
        return hashMap;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i8 = iArr[0];
        GLES20.glBindTexture(36197, i8);
        b("glBindTexture " + i8);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i8;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return group + "." + group2;
    }

    public static int k(int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        b("glCreateShader type=" + i8);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        h.I("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder p3 = g.p(i8, "Could not compile shader type ", ":");
        p3.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(p3.toString());
    }
}
