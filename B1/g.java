package b1;

import D.A;
import M0.r;
import P0.l;
import S0.f;
import T0.C0213e;
import Z1.c;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

public final class g extends C0213e {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f8627A0;

    /* renamed from: B0  reason: collision with root package name */
    public A f8628B0;

    /* renamed from: C0  reason: collision with root package name */
    public A f8629C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f8630D0;

    /* renamed from: l0  reason: collision with root package name */
    public final c f8631l0;

    /* renamed from: m0  reason: collision with root package name */
    public final f f8632m0 = new f(0);

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayDeque f8633n0 = new ArrayDeque();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8634o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public f f8635q0 = f.f8624c;

    /* renamed from: r0  reason: collision with root package name */
    public long f8636r0 = -9223372036854775807L;

    /* renamed from: s0  reason: collision with root package name */
    public long f8637s0 = -9223372036854775807L;

    /* renamed from: t0  reason: collision with root package name */
    public int f8638t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public int f8639u0 = 1;

    /* renamed from: v0  reason: collision with root package name */
    public r f8640v0;

    /* renamed from: w0  reason: collision with root package name */
    public C0521b f8641w0;

    /* renamed from: x0  reason: collision with root package name */
    public f f8642x0;

    /* renamed from: y0  reason: collision with root package name */
    public ImageOutput f8643y0 = ImageOutput.f8203a;

    /* renamed from: z0  reason: collision with root package name */
    public Bitmap f8644z0;

    public g(c cVar) {
        super(4);
        this.f8631l0 = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
        if (r14.f738a == ((r0.f3022K * r1.f3021J) - 1)) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(long r13) {
        /*
            r12 = this;
            android.graphics.Bitmap r0 = r12.f8644z0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            D.A r2 = r12.f8628B0
            if (r2 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r12.f8639u0
            r3 = 2
            if (r2 != 0) goto L_0x0014
            int r2 = r12.f4805b0
            if (r2 == r3) goto L_0x0014
            return r1
        L_0x0014:
            java.util.ArrayDeque r2 = r12.f8633n0
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x005b
            b1.b r0 = r12.f8641w0
            P0.l.k(r0)
            b1.b r0 = r12.f8641w0
            S0.g r0 = r0.c()
            b1.a r0 = (b1.C0520a) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            r6 = 4
            boolean r6 = r0.d(r6)
            if (r6 == 0) goto L_0x004d
            int r13 = r12.f8638t0
            if (r13 != r4) goto L_0x0041
            r12.E()
            M0.r r13 = r12.f8640v0
            P0.l.k(r13)
            r12.D()
            goto L_0x004c
        L_0x0041:
            r0.t()
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L_0x004c
            r12.p0 = r5
        L_0x004c:
            return r1
        L_0x004d:
            android.graphics.Bitmap r6 = r0.f8608Y
            java.lang.String r7 = "Non-EOS buffer came back from the decoder without bitmap."
            P0.l.l(r6, r7)
            android.graphics.Bitmap r6 = r0.f8608Y
            r12.f8644z0 = r6
            r0.t()
        L_0x005b:
            boolean r0 = r12.f8627A0
            if (r0 == 0) goto L_0x0151
            android.graphics.Bitmap r0 = r12.f8644z0
            if (r0 == 0) goto L_0x0151
            D.A r0 = r12.f8628B0
            if (r0 == 0) goto L_0x0151
            M0.r r0 = r12.f8640v0
            P0.l.k(r0)
            M0.r r0 = r12.f8640v0
            int r6 = r0.f3021J
            int r0 = r0.f3022K
            if (r6 != r5) goto L_0x0076
            if (r0 == r5) goto L_0x007d
        L_0x0076:
            r7 = -1
            if (r6 == r7) goto L_0x007d
            if (r0 == r7) goto L_0x007d
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            D.A r6 = r12.f8628B0
            java.lang.Object r7 = r6.f740c
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L_0x0087
            goto L_0x00c5
        L_0x0087:
            if (r0 == 0) goto L_0x00be
            android.graphics.Bitmap r7 = r12.f8644z0
            P0.l.k(r7)
            android.graphics.Bitmap r7 = r12.f8644z0
            int r7 = r7.getWidth()
            M0.r r8 = r12.f8640v0
            P0.l.k(r8)
            int r8 = r8.f3021J
            int r7 = r7 / r8
            android.graphics.Bitmap r8 = r12.f8644z0
            int r8 = r8.getHeight()
            M0.r r9 = r12.f8640v0
            P0.l.k(r9)
            int r9 = r9.f3022K
            int r8 = r8 / r9
            M0.r r9 = r12.f8640v0
            int r9 = r9.f3021J
            int r10 = r6.f738a
            int r11 = r10 % r9
            int r11 = r11 * r7
            int r10 = r10 / r9
            int r10 = r10 * r8
            android.graphics.Bitmap r9 = r12.f8644z0
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r9, r11, r10, r7, r8)
            goto L_0x00c3
        L_0x00be:
            android.graphics.Bitmap r7 = r12.f8644z0
            P0.l.k(r7)
        L_0x00c3:
            r6.f740c = r7
        L_0x00c5:
            D.A r6 = r12.f8628B0
            java.lang.Object r6 = r6.f740c
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            P0.l.k(r6)
            D.A r7 = r12.f8628B0
            long r7 = r7.f739b
            long r13 = r7 - r13
            int r9 = r12.f4805b0
            if (r9 != r3) goto L_0x00da
            r3 = 1
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            int r9 = r12.f8639u0
            if (r9 == 0) goto L_0x00ec
            if (r9 == r5) goto L_0x00eb
            if (r9 != r4) goto L_0x00e5
            r3 = 0
            goto L_0x00ec
        L_0x00e5:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            throw r13
        L_0x00eb:
            r3 = 1
        L_0x00ec:
            if (r3 != 0) goto L_0x00f7
            r9 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r13 = 0
            goto L_0x0102
        L_0x00f7:
            androidx.media3.exoplayer.image.ImageOutput r13 = r12.f8643y0
            b1.f r14 = r12.f8635q0
            long r9 = r14.f8626b
            long r7 = r7 - r9
            r13.onImageAvailable(r7, r6)
            r13 = 1
        L_0x0102:
            if (r13 != 0) goto L_0x0105
            return r1
        L_0x0105:
            D.A r13 = r12.f8628B0
            P0.l.k(r13)
            long r13 = r13.f739b
            r12.f8636r0 = r13
        L_0x010e:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0129
            java.lang.Object r1 = r2.peek()
            b1.f r1 = (b1.f) r1
            long r6 = r1.f8625a
            int r1 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0129
            java.lang.Object r1 = r2.removeFirst()
            b1.f r1 = (b1.f) r1
            r12.f8635q0 = r1
            goto L_0x010e
        L_0x0129:
            r12.f8639u0 = r4
            r13 = 0
            if (r0 == 0) goto L_0x0148
            D.A r14 = r12.f8628B0
            P0.l.k(r14)
            M0.r r0 = r12.f8640v0
            P0.l.k(r0)
            M0.r r1 = r12.f8640v0
            P0.l.k(r1)
            int r1 = r1.f3021J
            int r0 = r0.f3022K
            int r0 = r0 * r1
            int r0 = r0 - r5
            int r14 = r14.f738a
            if (r14 != r0) goto L_0x014a
        L_0x0148:
            r12.f8644z0 = r13
        L_0x014a:
            D.A r14 = r12.f8629C0
            r12.f8628B0 = r14
            r12.f8629C0 = r13
            return r5
        L_0x0151:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.B(long):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [D.A, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        r15 = r13.f8640v0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0103, code lost:
        if (r2 == false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(long r14) {
        /*
            r13 = this;
            boolean r0 = r13.f8627A0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            D.A r0 = r13.f8628B0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            R2.c r0 = r13.f4800W
            r0.I()
            b1.b r2 = r13.f8641w0
            if (r2 == 0) goto L_0x0148
            int r3 = r13.f8638t0
            r4 = 3
            if (r3 == r4) goto L_0x0148
            boolean r3 = r13.f8634o0
            if (r3 == 0) goto L_0x001e
            goto L_0x0148
        L_0x001e:
            S0.f r3 = r13.f8642x0
            if (r3 != 0) goto L_0x002d
            java.lang.Object r2 = r2.d()
            S0.f r2 = (S0.f) r2
            r13.f8642x0 = r2
            if (r2 != 0) goto L_0x002d
            return r1
        L_0x002d:
            int r2 = r13.f8638t0
            r3 = 2
            r5 = 0
            r6 = 4
            if (r2 != r3) goto L_0x004c
            S0.f r14 = r13.f8642x0
            P0.l.k(r14)
            S0.f r14 = r13.f8642x0
            r14.f4018V = r6
            b1.b r14 = r13.f8641w0
            P0.l.k(r14)
            S0.f r15 = r13.f8642x0
            r14.e(r15)
            r13.f8642x0 = r5
            r13.f8638t0 = r4
            return r1
        L_0x004c:
            S0.f r2 = r13.f8642x0
            int r2 = r13.u(r0, r2, r1)
            r4 = -5
            r7 = 1
            if (r2 == r4) goto L_0x013c
            r0 = -4
            if (r2 == r0) goto L_0x0063
            r14 = -3
            if (r2 != r14) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x0063:
            S0.f r0 = r13.f8642x0
            r0.v()
            S0.f r0 = r13.f8642x0
            java.nio.ByteBuffer r0 = r0.f4386Y
            if (r0 == 0) goto L_0x0074
            int r0 = r0.remaining()
            if (r0 > 0) goto L_0x007f
        L_0x0074:
            S0.f r0 = r13.f8642x0
            P0.l.k(r0)
            boolean r0 = r0.d(r6)
            if (r0 == 0) goto L_0x0081
        L_0x007f:
            r0 = 1
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r0 == 0) goto L_0x0093
            b1.b r2 = r13.f8641w0
            P0.l.k(r2)
            S0.f r3 = r13.f8642x0
            P0.l.k(r3)
            r2.e(r3)
            r13.f8630D0 = r1
        L_0x0093:
            S0.f r2 = r13.f8642x0
            P0.l.k(r2)
            boolean r3 = r2.d(r6)
            if (r3 == 0) goto L_0x00a2
            r13.f8627A0 = r7
            goto L_0x010c
        L_0x00a2:
            D.A r3 = new D.A
            int r4 = r13.f8630D0
            long r8 = r2.f4388a0
            r3.<init>()
            r3.f738a = r4
            r3.f739b = r8
            r13.f8629C0 = r3
            int r2 = r4 + 1
            r13.f8630D0 = r2
            boolean r2 = r13.f8627A0
            if (r2 != 0) goto L_0x0106
            r2 = 30000(0x7530, double:1.4822E-319)
            long r10 = r8 - r2
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x00c8
            long r2 = r2 + r8
            int r10 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x00c8
            r2 = 1
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            D.A r3 = r13.f8628B0
            if (r3 == 0) goto L_0x00d9
            long r10 = r3.f739b
            int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x00d9
            int r3 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d9
            r14 = 1
            goto L_0x00da
        L_0x00d9:
            r14 = 0
        L_0x00da:
            M0.r r15 = r13.f8640v0
            P0.l.k(r15)
            int r15 = r15.f3021J
            r3 = -1
            if (r15 == r3) goto L_0x00f4
            M0.r r15 = r13.f8640v0
            int r8 = r15.f3022K
            if (r8 == r3) goto L_0x00f4
            int r15 = r15.f3021J
            int r8 = r8 * r15
            int r8 = r8 - r7
            if (r4 != r8) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r15 = 0
            goto L_0x00f5
        L_0x00f4:
            r15 = 1
        L_0x00f5:
            if (r2 != 0) goto L_0x00fe
            if (r14 != 0) goto L_0x00fe
            if (r15 == 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r15 = 0
            goto L_0x00ff
        L_0x00fe:
            r15 = 1
        L_0x00ff:
            r13.f8627A0 = r15
            if (r14 == 0) goto L_0x0106
            if (r2 != 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            D.A r14 = r13.f8629C0
            r13.f8628B0 = r14
            r13.f8629C0 = r5
        L_0x010c:
            S0.f r14 = r13.f8642x0
            P0.l.k(r14)
            boolean r14 = r14.d(r6)
            if (r14 == 0) goto L_0x011c
            r13.f8634o0 = r7
            r13.f8642x0 = r5
            return r1
        L_0x011c:
            long r14 = r13.f8637s0
            S0.f r1 = r13.f8642x0
            P0.l.k(r1)
            long r1 = r1.f4388a0
            long r14 = java.lang.Math.max(r14, r1)
            r13.f8637s0 = r14
            if (r0 == 0) goto L_0x0130
            r13.f8642x0 = r5
            goto L_0x0138
        L_0x0130:
            S0.f r14 = r13.f8642x0
            P0.l.k(r14)
            r14.r()
        L_0x0138:
            boolean r14 = r13.f8627A0
            r14 = r14 ^ r7
            return r14
        L_0x013c:
            java.lang.Object r14 = r0.f4337W
            M0.r r14 = (M0.r) r14
            P0.l.k(r14)
            r13.f8640v0 = r14
            r13.f8638t0 = r3
            return r7
        L_0x0148:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.C(long):boolean");
    }

    public final void D() {
        r rVar = this.f8640v0;
        c cVar = this.f8631l0;
        int y8 = cVar.y(rVar);
        if (y8 == Q0.g.e(4, 0, 0, 0) || y8 == Q0.g.e(3, 0, 0, 0)) {
            C0521b bVar = this.f8641w0;
            if (bVar != null) {
                bVar.release();
            }
            this.f8641w0 = new C0521b((U0.c) cVar.f6955V);
            return;
        }
        throw f(new Exception("Provided decoder factory can't create decoder for format."), this.f8640v0, false, 4005);
    }

    public final void E() {
        this.f8642x0 = null;
        this.f8638t0 = 0;
        this.f8637s0 = -9223372036854775807L;
        C0521b bVar = this.f8641w0;
        if (bVar != null) {
            bVar.release();
            this.f8641w0 = null;
        }
    }

    public final void b(int i, Object obj) {
        ImageOutput imageOutput;
        if (i == 15) {
            if (obj instanceof ImageOutput) {
                imageOutput = (ImageOutput) obj;
            } else {
                imageOutput = null;
            }
            if (imageOutput == null) {
                imageOutput = ImageOutput.f8203a;
            }
            this.f8643y0 = imageOutput;
        }
    }

    public final String i() {
        return "ImageRenderer";
    }

    public final boolean k() {
        return this.p0;
    }

    public final boolean l() {
        int i = this.f8639u0;
        if (i == 3 || (i == 0 && this.f8627A0)) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f8640v0 = null;
        this.f8635q0 = f.f8624c;
        this.f8633n0.clear();
        E();
        this.f8643y0.a();
    }

    public final void n(boolean z, boolean z6) {
        this.f8639u0 = z6 ? 1 : 0;
    }

    public final void o(long j7, boolean z) {
        this.f8639u0 = Math.min(this.f8639u0, 1);
        this.p0 = false;
        this.f8634o0 = false;
        this.f8644z0 = null;
        this.f8628B0 = null;
        this.f8629C0 = null;
        this.f8627A0 = false;
        this.f8642x0 = null;
        C0521b bVar = this.f8641w0;
        if (bVar != null) {
            bVar.flush();
        }
        this.f8633n0.clear();
    }

    public final void p() {
        E();
    }

    public final void q() {
        E();
        this.f8639u0 = Math.min(this.f8639u0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r2 >= r6) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(M0.r[] r5, long r6, long r8, h1.C1031B r10) {
        /*
            r4 = this;
            b1.f r5 = r4.f8635q0
            long r5 = r5.f8626b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0031
            java.util.ArrayDeque r5 = r4.f8633n0
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0026
            long r6 = r4.f8637s0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0031
            long r2 = r4.f8636r0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0026
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x0026
            goto L_0x0031
        L_0x0026:
            b1.f r6 = new b1.f
            long r0 = r4.f8637s0
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L_0x0038
        L_0x0031:
            b1.f r5 = new b1.f
            r5.<init>(r0, r8)
            r4.f8635q0 = r5
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.t(M0.r[], long, long, h1.B):void");
    }

    public final void v(long j7, long j8) {
        if (!this.p0) {
            if (this.f8640v0 == null) {
                R2.c cVar = this.f4800W;
                cVar.I();
                f fVar = this.f8632m0;
                fVar.r();
                int u3 = u(cVar, fVar, 2);
                if (u3 == -5) {
                    r rVar = (r) cVar.f4337W;
                    l.k(rVar);
                    this.f8640v0 = rVar;
                    D();
                } else if (u3 == -4) {
                    l.j(fVar.d(4));
                    this.f8634o0 = true;
                    this.p0 = true;
                    return;
                } else {
                    return;
                }
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                while (B(j7)) {
                }
                while (C(j7)) {
                }
                Trace.endSection();
            } catch (d e) {
                throw f(e, (r) null, false, 4003);
            }
        }
    }

    public final int z(r rVar) {
        return this.f8631l0.y(rVar);
    }
}
