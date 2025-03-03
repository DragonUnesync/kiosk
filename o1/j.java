package o1;

import a1.C0412c;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class j implements GLSurfaceView.Renderer, C1311c {

    /* renamed from: U  reason: collision with root package name */
    public final i f14176U;

    /* renamed from: V  reason: collision with root package name */
    public final float[] f14177V = new float[16];

    /* renamed from: W  reason: collision with root package name */
    public final float[] f14178W = new float[16];

    /* renamed from: X  reason: collision with root package name */
    public final float[] f14179X;

    /* renamed from: Y  reason: collision with root package name */
    public final float[] f14180Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float[] f14181Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f14182a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f14183b0;

    /* renamed from: c0  reason: collision with root package name */
    public final float[] f14184c0;

    /* renamed from: d0  reason: collision with root package name */
    public final float[] f14185d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ k f14186e0;

    public j(k kVar, i iVar) {
        this.f14186e0 = kVar;
        float[] fArr = new float[16];
        this.f14179X = fArr;
        float[] fArr2 = new float[16];
        this.f14180Y = fArr2;
        float[] fArr3 = new float[16];
        this.f14181Z = fArr3;
        this.f14184c0 = new float[16];
        this.f14185d0 = new float[16];
        this.f14176U = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f14183b0 = 3.1415927f;
    }

    public final synchronized void a(float[] fArr, float f8) {
        float[] fArr2 = this.f14179X;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f9 = -f8;
        this.f14183b0 = f9;
        Matrix.setRotateM(this.f14180Y, 0, -this.f14182a0, (float) Math.cos((double) f9), (float) Math.sin((double) this.f14183b0), 0.0f);
    }

    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f14185d0, 0, this.f14179X, 0, this.f14181Z, 0);
            Matrix.multiplyMM(this.f14184c0, 0, this.f14180Y, 0, this.f14185d0, 0);
        }
        Matrix.multiplyMM(this.f14178W, 0, this.f14177V, 0, this.f14184c0, 0);
        this.f14176U.b(this.f14178W);
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i8) {
        float f8;
        GLES20.glViewport(0, 0, i, i8);
        float f9 = ((float) i) / ((float) i8);
        if (f9 > 1.0f) {
            f8 = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f9))) * 2.0d);
        } else {
            f8 = 90.0f;
        }
        Matrix.perspectiveM(this.f14177V, 0, f8, f9, 0.1f, 100.0f);
    }

    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.f14186e0;
        kVar.f14192b0.post(new C0412c((Object) kVar, 14, (Object) this.f14176U.e()));
    }
}
