package o1;

import C3.r;
import K1.k;
import P0.e;
import android.opengl.GLES20;
import android.util.Log;

/* renamed from: o1.g  reason: case insensitive filesystem */
public final class C1315g {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f14153j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final float[] f14154k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public int f14155a;

    /* renamed from: b  reason: collision with root package name */
    public r f14156b;

    /* renamed from: c  reason: collision with root package name */
    public k f14157c;

    /* renamed from: d  reason: collision with root package name */
    public int f14158d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f14159f;

    /* renamed from: g  reason: collision with root package name */
    public int f14160g;

    /* renamed from: h  reason: collision with root package name */
    public int f14161h;

    public static boolean b(C1314f fVar) {
        r[] rVarArr = fVar.f14149a.f14148a;
        if (rVarArr.length != 1 || rVarArr[0].f615a != 0) {
            return false;
        }
        r[] rVarArr2 = fVar.f14150b.f14148a;
        if (rVarArr2.length == 1 && rVarArr2[0].f615a == 0) {
            return true;
        }
        return false;
    }

    public final void a() {
        try {
            k kVar = new k("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f14157c = kVar;
            this.f14158d = GLES20.glGetUniformLocation(kVar.f2580U, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.f14157c.f2580U, "uTexMatrix");
            this.f14159f = this.f14157c.d("aPosition");
            this.f14160g = this.f14157c.d("aTexCoords");
            this.f14161h = GLES20.glGetUniformLocation(this.f14157c.f2580U, "uTexture");
        } catch (e e8) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e8);
        }
    }
}
