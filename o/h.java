package O;

import android.opengl.GLES20;

public final class h extends g {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3485f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3486g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(B.C0022x r3, O.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sTexture"
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x000b
            java.lang.String r3 = O.i.f3490d
            goto L_0x000d
        L_0x000b:
            java.lang.String r3 = O.i.f3489c
        L_0x000d:
            java.lang.String r1 = "vTextureCoord"
            int r4 = r4.f3476a     // Catch:{ all -> 0x005d }
            switch(r4) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0019;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x005d }
        L_0x0014:
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}"
            goto L_0x0022
        L_0x0019:
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}"
            goto L_0x0022
        L_0x001e:
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n"
        L_0x0022:
            boolean r1 = r4.contains(r1)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x005f
            boolean r1 = r4.contains(r0)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x005f
            r2.<init>(r3, r4)
            r3 = -1
            r2.e = r3
            r2.f3485f = r3
            r2.f3486g = r3
            r2.a()
            int r3 = r2.f3481a
            int r4 = android.opengl.GLES20.glGetUniformLocation(r3, r0)
            r2.e = r4
            O.i.e(r4, r0)
            java.lang.String r4 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r2.f3486g = r0
            O.i.e(r0, r4)
            java.lang.String r4 = "uTexMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r2.f3485f = r3
            O.i.e(r3, r4)
            return
        L_0x005d:
            r3 = move-exception
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "Invalid fragment shader"
            r3.<init>(r4)     // Catch:{ all -> 0x005d }
            throw r3     // Catch:{ all -> 0x005d }
        L_0x0067:
            boolean r4 = r3 instanceof java.lang.IllegalArgumentException
            if (r4 == 0) goto L_0x006c
            throw r3
        L_0x006c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable retrieve fragment shader source"
            r4.<init>(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O.h.<init>(B.x, O.d):void");
    }

    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.f3486g);
        i.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3486g, 2, 5126, false, 0, i.i);
        i.b("glVertexAttribPointer");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(B.C0022x r4, O.f r5) {
        /*
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0028
            O.f r0 = O.f.f3477U
            if (r5 == r0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No default sampler shader available for"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            n2.a.h(r1, r0)
            O.f r0 = O.f.f3479W
            if (r5 != r0) goto L_0x0025
            O.d r5 = O.i.f3492g
            goto L_0x002a
        L_0x0025:
            O.d r5 = O.i.f3491f
            goto L_0x002a
        L_0x0028:
            O.d r5 = O.i.e
        L_0x002a:
            r3.<init>((B.C0022x) r4, (O.d) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.h.<init>(B.x, O.f):void");
    }
}
