package O;

import android.opengl.GLES20;
import android.opengl.Matrix;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f3481a;

    /* renamed from: b  reason: collision with root package name */
    public int f3482b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3483c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3484d = -1;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.f3482b = r2
            r7.f3483c = r2
            r7.f3484d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = O.i.k(r3, r8)     // Catch:{ IllegalStateException -> 0x006f, IllegalArgumentException -> 0x006c }
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = O.i.k(r3, r9)     // Catch:{ IllegalStateException -> 0x006a, IllegalArgumentException -> 0x0067 }
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch:{ IllegalStateException -> 0x0065, IllegalArgumentException -> 0x0062 }
            java.lang.String r4 = "glCreateProgram"
            O.i.b(r4)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            O.i.b(r0)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            O.i.b(r0)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            android.opengl.GLES20.glLinkProgram(r3)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r0 = 1
            int[] r4 = new int[r0]     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r4 = r4[r6]     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            if (r4 != r0) goto L_0x004c
            r7.f3481a = r3     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r7.a()
            return
        L_0x0048:
            r0 = move-exception
            goto L_0x0071
        L_0x004a:
            r0 = move-exception
            goto L_0x0071
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r4.<init>(r1)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r4.append(r1)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            java.lang.String r1 = r4.toString()     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
            throw r0     // Catch:{ IllegalStateException -> 0x004a, IllegalArgumentException -> 0x0048 }
        L_0x0062:
            r0 = move-exception
        L_0x0063:
            r3 = -1
            goto L_0x0071
        L_0x0065:
            r0 = move-exception
            goto L_0x0063
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            r9 = -1
            goto L_0x0063
        L_0x006a:
            r0 = move-exception
            goto L_0x0068
        L_0x006c:
            r0 = move-exception
        L_0x006d:
            r8 = -1
            goto L_0x0068
        L_0x006f:
            r0 = move-exception
            goto L_0x006d
        L_0x0071:
            if (r8 == r2) goto L_0x0076
            android.opengl.GLES20.glDeleteShader(r8)
        L_0x0076:
            if (r9 == r2) goto L_0x007b
            android.opengl.GLES20.glDeleteShader(r9)
        L_0x007b:
            if (r3 == r2) goto L_0x0080
            android.opengl.GLES20.glDeleteProgram(r3)
        L_0x0080:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O.g.<init>(java.lang.String, java.lang.String):void");
    }

    public final void a() {
        int i = this.f3481a;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.f3484d = glGetAttribLocation;
        i.e(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.f3482b = glGetUniformLocation;
        i.e(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.f3483c = glGetUniformLocation2;
        i.e(glGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.f3481a);
        i.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f3484d);
        i.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3484d, 2, 5126, false, 0, i.f3493h);
        i.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f3482b, 1, false, fArr, 0);
        i.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f3483c, 1.0f);
        i.b("glUniform1f");
    }
}
