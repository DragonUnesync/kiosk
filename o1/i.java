package o1;

import C3.r;
import P0.e;
import P0.l;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.bumptech.glide.j;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.p;

public final class i implements p, C1309a {

    /* renamed from: U  reason: collision with root package name */
    public final AtomicBoolean f14163U = new AtomicBoolean();

    /* renamed from: V  reason: collision with root package name */
    public final AtomicBoolean f14164V = new AtomicBoolean(true);

    /* renamed from: W  reason: collision with root package name */
    public final C1315g f14165W = new Object();

    /* renamed from: X  reason: collision with root package name */
    public final j f14166X = new j();

    /* renamed from: Y  reason: collision with root package name */
    public final r f14167Y = new r();

    /* renamed from: Z  reason: collision with root package name */
    public final r f14168Z = new r();

    /* renamed from: a0  reason: collision with root package name */
    public final float[] f14169a0 = new float[16];

    /* renamed from: b0  reason: collision with root package name */
    public final float[] f14170b0 = new float[16];

    /* renamed from: c0  reason: collision with root package name */
    public int f14171c0;

    /* renamed from: d0  reason: collision with root package name */
    public SurfaceTexture f14172d0;

    /* renamed from: e0  reason: collision with root package name */
    public volatile int f14173e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public int f14174f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public byte[] f14175g0;

    public final void a(long j7, float[] fArr) {
        ((r) this.f14166X.f9010X).a(fArr, j7);
    }

    public final void b(float[] fArr) {
        float[] fArr2;
        Object d8;
        GLES20.glClear(16384);
        try {
            l.e();
        } catch (e e) {
            l.p("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f14163U.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f14172d0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                l.e();
            } catch (e e8) {
                l.p("SceneRenderer", "Failed to draw a frame", e8);
            }
            if (this.f14164V.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f14169a0, 0);
            }
            long timestamp = this.f14172d0.getTimestamp();
            r rVar = this.f14167Y;
            synchronized (rVar) {
                d8 = rVar.d(timestamp, false);
            }
            Long l8 = (Long) d8;
            if (l8 != null) {
                j jVar = this.f14166X;
                float[] fArr3 = this.f14169a0;
                float[] fArr4 = (float[]) ((r) jVar.f9010X).f(l8.longValue());
                if (fArr4 != null) {
                    float f8 = fArr4[0];
                    float f9 = -fArr4[1];
                    float f10 = -fArr4[2];
                    float length = Matrix.length(f8, f9, f10);
                    float[] fArr5 = (float[]) jVar.f9009W;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees((double) length), f8 / length, f9 / length, f10 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!jVar.f9007U) {
                        j.f((float[]) jVar.f9008V, (float[]) jVar.f9009W);
                        jVar.f9007U = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) jVar.f9008V, 0, (float[]) jVar.f9009W, 0);
                }
            }
            C1314f fVar = (C1314f) this.f14168Z.f(timestamp);
            if (fVar != null) {
                C1315g gVar = this.f14165W;
                gVar.getClass();
                if (C1315g.b(fVar)) {
                    gVar.f14155a = fVar.f14151c;
                    gVar.f14156b = new r(fVar.f14149a.f14148a[0]);
                    if (!fVar.f14152d) {
                        new r(fVar.f14150b.f14148a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f14170b0, 0, fArr, 0, this.f14169a0, 0);
        C1315g gVar2 = this.f14165W;
        int i = this.f14171c0;
        float[] fArr6 = this.f14170b0;
        r rVar2 = gVar2.f14156b;
        if (rVar2 != null) {
            int i8 = gVar2.f14155a;
            if (i8 == 1) {
                fArr2 = C1315g.f14153j;
            } else if (i8 == 2) {
                fArr2 = C1315g.f14154k;
            } else {
                fArr2 = C1315g.i;
            }
            GLES20.glUniformMatrix3fv(gVar2.e, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(gVar2.f14158d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(gVar2.f14161h, 0);
            try {
                l.e();
            } catch (e e9) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e9);
            }
            GLES20.glVertexAttribPointer(gVar2.f14159f, 3, 5126, false, 12, (FloatBuffer) rVar2.f617c);
            try {
                l.e();
            } catch (e e10) {
                Log.e("ProjectionRenderer", "Failed to load position data", e10);
            }
            GLES20.glVertexAttribPointer(gVar2.f14160g, 2, 5126, false, 8, (FloatBuffer) rVar2.f618d);
            try {
                l.e();
            } catch (e e11) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e11);
            }
            GLES20.glDrawArrays(rVar2.f616b, 0, rVar2.f615a);
            try {
                l.e();
            } catch (e e12) {
                Log.e("ProjectionRenderer", "Failed to render", e12);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r11.G(r13);
        r3 = com.bumptech.glide.d.p(r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(long r32, long r34, M0.r r36, android.media.MediaFormat r37) {
        /*
            r31 = this;
            r0 = r31
            r1 = r34
            r3 = r36
            r5 = 4
            r6 = 0
            r7 = 2
            r8 = 1
            C3.r r9 = r0.f14167Y
            java.lang.Long r10 = java.lang.Long.valueOf(r32)
            r9.a(r10, r1)
            byte[] r9 = r3.z
            int r3 = r3.f3012A
            byte[] r10 = r0.f14175g0
            int r11 = r0.f14174f0
            r0.f14175g0 = r9
            r9 = -1
            if (r3 != r9) goto L_0x0022
            int r3 = r0.f14173e0
        L_0x0022:
            r0.f14174f0 = r3
            if (r11 != r3) goto L_0x0030
            byte[] r3 = r0.f14175g0
            boolean r3 = java.util.Arrays.equals(r10, r3)
            if (r3 == 0) goto L_0x0030
            goto L_0x0204
        L_0x0030:
            byte[] r3 = r0.f14175g0
            r9 = 0
            if (r3 == 0) goto L_0x00ac
            int r10 = r0.f14174f0
            P0.r r11 = new P0.r
            r11.<init>((byte[]) r3)
            r11.I(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r3 = r11.i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r11.H(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r12 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r12) goto L_0x007c
            r3 = 8
            r11.I(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r3 = r11.f3733b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r12 = r11.f3734c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
        L_0x0054:
            if (r3 >= r12) goto L_0x0082
            int r13 = r11.i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            int r13 = r13 + r3
            if (r13 <= r3) goto L_0x0082
            if (r13 <= r12) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            int r3 = r11.i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r14 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r3 == r14) goto L_0x0074
            r14 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r3 != r14) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r11.H(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            r3 = r13
            goto L_0x0054
        L_0x0074:
            r11.G(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            java.util.ArrayList r3 = com.bumptech.glide.d.p(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            goto L_0x0083
        L_0x007c:
            java.util.ArrayList r3 = com.bumptech.glide.d.p(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0081 }
            goto L_0x0083
        L_0x0081:
        L_0x0082:
            r3 = r9
        L_0x0083:
            if (r3 != 0) goto L_0x0086
            goto L_0x00ac
        L_0x0086:
            int r11 = r3.size()
            if (r11 == r8) goto L_0x00a1
            if (r11 == r7) goto L_0x008f
            goto L_0x00ac
        L_0x008f:
            o1.f r9 = new o1.f
            java.lang.Object r11 = r3.get(r6)
            o1.e r11 = (o1.C1313e) r11
            java.lang.Object r3 = r3.get(r8)
            o1.e r3 = (o1.C1313e) r3
            r9.<init>(r11, r3, r10)
            goto L_0x00ac
        L_0x00a1:
            o1.f r9 = new o1.f
            java.lang.Object r3 = r3.get(r6)
            o1.e r3 = (o1.C1313e) r3
            r9.<init>(r3, r3, r10)
        L_0x00ac:
            if (r9 == 0) goto L_0x00b6
            boolean r3 = o1.C1315g.b(r9)
            if (r3 == 0) goto L_0x00b6
            goto L_0x01fd
        L_0x00b6:
            int r3 = r0.f14174f0
            r9 = 1127481344(0x43340000, float:180.0)
            double r9 = (double) r9
            double r9 = java.lang.Math.toRadians(r9)
            float r9 = (float) r9
            r10 = 1135869952(0x43b40000, float:360.0)
            double r10 = (double) r10
            double r10 = java.lang.Math.toRadians(r10)
            float r10 = (float) r10
            r11 = 36
            float r12 = (float) r11
            float r12 = r9 / r12
            r13 = 72
            float r14 = (float) r13
            float r14 = r10 / r14
            r15 = 15984(0x3e70, float:2.2398E-41)
            float[] r15 = new float[r15]
            r6 = 10656(0x29a0, float:1.4932E-41)
            float[] r6 = new float[r6]
            r5 = 0
            r16 = 0
            r17 = 0
        L_0x00df:
            if (r5 >= r11) goto L_0x01e4
            float r11 = (float) r5
            float r11 = r11 * r12
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r9 / r18
            float r11 = r11 - r19
            int r13 = r5 + 1
            float r4 = (float) r13
            float r4 = r4 * r12
            float r4 = r4 - r19
            r8 = 0
        L_0x00f2:
            r7 = 73
            if (r8 >= r7) goto L_0x01d6
            r36 = r4
            r20 = r11
            r21 = r13
            r7 = r16
            r4 = r17
            r11 = 0
            r13 = 2
        L_0x0102:
            if (r11 >= r13) goto L_0x01ad
            if (r11 != 0) goto L_0x0109
            r13 = r20
            goto L_0x010b
        L_0x0109:
            r13 = r36
        L_0x010b:
            float r1 = (float) r8
            float r1 = r1 * r14
            r2 = 1078530011(0x40490fdb, float:3.1415927)
            float r2 = r2 + r1
            float r16 = r10 / r18
            float r2 = r2 - r16
            r16 = 1
            int r17 = r7 + 1
            r22 = r14
            r14 = 1112014848(0x42480000, float:50.0)
            r24 = r8
            r23 = r9
            double r8 = (double) r14
            r14 = r3
            double r2 = (double) r2
            double r25 = java.lang.Math.sin(r2)
            double r25 = r25 * r8
            r27 = r14
            double r13 = (double) r13
            double r28 = java.lang.Math.cos(r13)
            r16 = r11
            r30 = r12
            double r11 = r28 * r25
            float r11 = (float) r11
            float r11 = -r11
            r15[r7] = r11
            r11 = 2
            int r12 = r7 + 2
            double r25 = java.lang.Math.sin(r13)
            r28 = r5
            r11 = r6
            double r5 = r25 * r8
            float r5 = (float) r5
            r15[r17] = r5
            r5 = 3
            int r6 = r7 + 3
            double r2 = java.lang.Math.cos(r2)
            double r2 = r2 * r8
            double r8 = java.lang.Math.cos(r13)
            double r8 = r8 * r2
            float r2 = (float) r8
            r15[r12] = r2
            r2 = 1
            int r8 = r4 + 1
            float r1 = r1 / r10
            r11[r4] = r1
            r1 = 2
            int r2 = r4 + 2
            int r5 = r28 + r16
            float r1 = (float) r5
            float r1 = r1 * r30
            float r1 = r1 / r23
            r11[r8] = r1
            if (r24 != 0) goto L_0x0173
            if (r16 == 0) goto L_0x0178
        L_0x0173:
            r3 = r24
            r1 = 72
            goto L_0x0181
        L_0x0178:
            r5 = r16
            r3 = r24
            r1 = 72
            r8 = 1
            r9 = 3
            goto L_0x0189
        L_0x0181:
            r5 = r16
            r8 = 1
            r9 = 3
            if (r3 != r1) goto L_0x0195
            if (r5 != r8) goto L_0x0195
        L_0x0189:
            java.lang.System.arraycopy(r15, r7, r15, r6, r9)
            int r7 = r7 + 6
            r12 = 2
            java.lang.System.arraycopy(r11, r4, r11, r2, r12)
            r13 = 4
            int r4 = r4 + r13
            goto L_0x0199
        L_0x0195:
            r12 = 2
            r13 = 4
            r4 = r2
            r7 = r6
        L_0x0199:
            int r2 = r5 + 1
            r8 = r3
            r6 = r11
            r14 = r22
            r9 = r23
            r3 = r27
            r5 = r28
            r12 = r30
            r13 = 2
            r11 = r2
            r1 = r34
            goto L_0x0102
        L_0x01ad:
            r27 = r3
            r28 = r5
            r11 = r6
            r3 = r8
            r23 = r9
            r30 = r12
            r22 = r14
            r1 = 72
            r8 = 1
            r9 = 3
            r12 = 2
            r13 = 4
            int r2 = r3 + 1
            r8 = r2
            r17 = r4
            r16 = r7
            r11 = r20
            r13 = r21
            r9 = r23
            r3 = r27
            r12 = r30
            r1 = r34
            r4 = r36
            goto L_0x00f2
        L_0x01d6:
            r21 = r13
            r1 = r34
            r5 = r21
            r7 = 2
            r8 = 1
            r11 = 36
            r13 = 72
            goto L_0x00df
        L_0x01e4:
            r27 = r3
            r11 = r6
            C3.r r1 = new C3.r
            r2 = 0
            r1.<init>(r2, r15, r11, r8)
            o1.f r9 = new o1.f
            o1.e r3 = new o1.e
            C3.r[] r4 = new C3.r[r8]
            r4[r2] = r1
            r3.<init>(r4)
            r1 = r27
            r9.<init>(r3, r3, r1)
        L_0x01fd:
            C3.r r1 = r0.f14168Z
            r2 = r34
            r1.a(r9, r2)
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.i.c(long, long, M0.r, android.media.MediaFormat):void");
    }

    public final void d() {
        this.f14167Y.b();
        j jVar = this.f14166X;
        ((r) jVar.f9010X).b();
        jVar.f9007U = false;
        this.f14164V.set(true);
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            l.e();
            this.f14165W.a();
            l.e();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            l.e();
            int i = iArr[0];
            l.b(36197, i);
            this.f14171c0 = i;
        } catch (e e) {
            l.p("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f14171c0);
        this.f14172d0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C1316h(this));
        return this.f14172d0;
    }
}
