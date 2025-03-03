package n1;

import K1.k;
import P0.e;
import P0.l;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class m implements GLSurfaceView.Renderer {

    /* renamed from: b0  reason: collision with root package name */
    public static final String[] f13654b0 = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: c0  reason: collision with root package name */
    public static final FloatBuffer f13655c0 = l.m(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: U  reason: collision with root package name */
    public final n f13656U;

    /* renamed from: V  reason: collision with root package name */
    public final int[] f13657V = new int[3];

    /* renamed from: W  reason: collision with root package name */
    public final int[] f13658W = new int[3];

    /* renamed from: X  reason: collision with root package name */
    public final int[] f13659X = new int[3];

    /* renamed from: Y  reason: collision with root package name */
    public final int[] f13660Y = new int[3];

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicReference f13661Z = new AtomicReference();

    /* renamed from: a0  reason: collision with root package name */
    public k f13662a0;

    public m(n nVar) {
        this.f13656U = nVar;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.f13659X;
            this.f13660Y[i] = -1;
            iArr[i] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f13657V;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i = 0; i < 3; i++) {
                k kVar = this.f13662a0;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(kVar.f2580U, f13654b0[i]), i);
                GLES20.glActiveTexture(33984 + i);
                l.b(3553, iArr[i]);
            }
            l.e();
        } catch (e e) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.f13661Z.getAndSet((Object) null) != null) {
            throw new ClassCastException();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i8) {
        GLES20.glViewport(0, 0, i, i8);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f13658W;
        try {
            k kVar = new k("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f13662a0 = kVar;
            GLES20.glVertexAttribPointer(kVar.d("in_pos"), 2, 5126, false, 0, f13655c0);
            iArr[0] = this.f13662a0.d("in_tc_y");
            iArr[1] = this.f13662a0.d("in_tc_u");
            iArr[2] = this.f13662a0.d("in_tc_v");
            GLES20.glGetUniformLocation(this.f13662a0.f2580U, "mColorConversion");
            l.e();
            a();
            l.e();
        } catch (e e) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
        }
    }
}
