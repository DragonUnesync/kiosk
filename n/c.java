package N;

import B.C0022x;
import B.Z;
import F.h;
import M.e;
import M.l;
import O.a;
import O.g;
import O.i;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

public final class c extends e {

    /* renamed from: n  reason: collision with root package name */
    public int f3205n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f3206o = -1;

    /* renamed from: p  reason: collision with root package name */
    public final Z f3207p;

    /* renamed from: q  reason: collision with root package name */
    public final Z f3208q;

    public c(Z z, Z z6) {
        this.f3207p = z;
        this.f3208q = z6;
    }

    public final a e(C0022x xVar, Map map) {
        a e = super.e(xVar, map);
        this.f3205n = i.h();
        this.f3206o = i.h();
        return e;
    }

    public final void l(long j7, Surface surface, l lVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        i.d(this.f2732a, true);
        i.c(this.f2734c);
        HashMap hashMap = this.f2733b;
        n2.a.m("The surface is not registered.", hashMap.containsKey(surface));
        O.c cVar = (O.c) hashMap.get(surface);
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
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        O.c cVar2 = cVar;
        l lVar2 = lVar;
        SurfaceTexture surfaceTexture3 = surfaceTexture;
        m(cVar2, lVar2, surfaceTexture3, this.f3207p, this.f3205n);
        SurfaceTexture surfaceTexture4 = surfaceTexture2;
        m(cVar2, lVar2, surfaceTexture4, this.f3208q, this.f3206o);
        EGLExt.eglPresentationTimeANDROID(this.f2735d, eGLSurface, j7);
        if (!EGL14.eglSwapBuffers(this.f2735d, eGLSurface)) {
            h.I("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            i(surface, false);
        }
    }

    public final void m(O.c cVar, l lVar, SurfaceTexture surfaceTexture, Z z, int i) {
        O.c cVar2 = cVar;
        k(i);
        int i8 = cVar2.f3474b;
        int i9 = cVar2.f3475c;
        GLES20.glViewport(0, 0, i8, i9);
        GLES20.glScissor(0, 0, i8, i9);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, lVar.f2776Y, 0);
        g gVar = this.f2740k;
        gVar.getClass();
        if (gVar instanceof O.h) {
            GLES20.glUniformMatrix4fv(((O.h) gVar).f3485f, 1, false, fArr2, 0);
            i.b("glUniformMatrix4fv");
        }
        z.getClass();
        Size size = new Size((int) (((float) i8) * 1.0f), (int) (((float) i9) * 1.0f));
        Size size2 = new Size(i8, i9);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, ((float) size.getWidth()) / ((float) size2.getWidth()), ((float) size.getHeight()) / ((float) size2.getHeight()), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(gVar.f3482b, 1, false, fArr5, 0);
        i.b("glUniformMatrix4fv");
        GLES20.glUniform1f(gVar.f3483c, 1.0f);
        i.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        i.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
