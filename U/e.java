package U;

import E.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.bumptech.glide.c;
import n2.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Size f5262a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f5263b;

    /* renamed from: c  reason: collision with root package name */
    public int f5264c;

    /* renamed from: d  reason: collision with root package name */
    public Matrix f5265d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5266f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5267g;

    /* renamed from: h  reason: collision with root package name */
    public i f5268h;

    public final void a(Size size, int i, Rect rect) {
        Matrix matrix;
        if (f()) {
            Matrix matrix2 = new Matrix();
            if (!f()) {
                matrix = null;
            } else {
                Matrix matrix3 = new Matrix(this.f5265d);
                matrix3.postConcat(c(size, i));
                matrix = matrix3;
            }
            matrix.invert(matrix2);
            Matrix matrix4 = new Matrix();
            matrix4.setRectToRect(new RectF(0.0f, 0.0f, (float) rect.width(), (float) rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix2.postConcat(matrix4);
        }
    }

    public final Size b() {
        if (f.b(this.f5264c)) {
            return new Size(this.f5263b.height(), this.f5263b.width());
        }
        return new Size(this.f5263b.width(), this.f5263b.height());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix c(android.util.Size r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.f()
            r1 = 0
            n2.a.m(r1, r0)
            android.util.Size r0 = r7.b()
            r1 = 1
            boolean r0 = E.f.c(r8, r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0025
            android.graphics.RectF r9 = new android.graphics.RectF
            int r0 = r8.getWidth()
            float r0 = (float) r0
            int r8 = r8.getHeight()
            float r8 = (float) r8
            r9.<init>(r2, r2, r0, r8)
            goto L_0x00b7
        L_0x0025:
            android.graphics.RectF r0 = new android.graphics.RectF
            int r3 = r8.getWidth()
            float r3 = (float) r3
            int r4 = r8.getHeight()
            float r4 = (float) r4
            r0.<init>(r2, r2, r3, r4)
            android.util.Size r3 = r7.b()
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r3.getWidth()
            float r5 = (float) r5
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4.<init>(r2, r2, r5, r3)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            U.i r3 = r7.f5268h
            int r5 = r3.ordinal()
            if (r5 == 0) goto L_0x007e
            if (r5 == r1) goto L_0x007b
            r6 = 2
            if (r5 == r6) goto L_0x0078
            r6 = 3
            if (r5 == r6) goto L_0x007e
            r6 = 4
            if (r5 == r6) goto L_0x007b
            r6 = 5
            if (r5 == r6) goto L_0x0078
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected crop rect: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "PreviewTransform"
            F.h.l(r6, r5)
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.FILL
            goto L_0x0080
        L_0x0078:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.END
            goto L_0x0080
        L_0x007b:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            goto L_0x0080
        L_0x007e:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.START
        L_0x0080:
            U.i r6 = U.i.FIT_CENTER
            if (r3 == r6) goto L_0x0094
            U.i r6 = U.i.FIT_START
            if (r3 == r6) goto L_0x0094
            U.i r6 = U.i.FIT_END
            if (r3 != r6) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r2.setRectToRect(r0, r4, r5)
            r2.invert(r2)
            goto L_0x0097
        L_0x0094:
            r2.setRectToRect(r4, r0, r5)
        L_0x0097:
            r2.mapRect(r4)
            if (r9 != r1) goto L_0x00b6
            int r8 = r8.getWidth()
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            android.graphics.RectF r9 = new android.graphics.RectF
            float r8 = r8 + r8
            float r0 = r4.right
            float r0 = r8 - r0
            float r1 = r4.top
            float r2 = r4.left
            float r8 = r8 - r2
            float r2 = r4.bottom
            r9.<init>(r0, r1, r8, r2)
            goto L_0x00b7
        L_0x00b6:
            r9 = r4
        L_0x00b7:
            android.graphics.RectF r8 = new android.graphics.RectF
            android.graphics.Rect r0 = r7.f5263b
            r8.<init>(r0)
            int r0 = r7.f5264c
            r1 = 0
            android.graphics.Matrix r8 = E.f.a(r8, r9, r0, r1)
            boolean r9 = r7.f5266f
            if (r9 == 0) goto L_0x00fc
            boolean r9 = r7.f5267g
            if (r9 == 0) goto L_0x00fc
            int r9 = r7.f5264c
            boolean r9 = E.f.b(r9)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x00eb
            android.graphics.Rect r9 = r7.f5263b
            int r9 = r9.centerX()
            float r9 = (float) r9
            android.graphics.Rect r2 = r7.f5263b
            int r2 = r2.centerY()
            float r2 = (float) r2
            r8.preScale(r1, r0, r9, r2)
            goto L_0x00fc
        L_0x00eb:
            android.graphics.Rect r9 = r7.f5263b
            int r9 = r9.centerX()
            float r9 = (float) r9
            android.graphics.Rect r2 = r7.f5263b
            int r2 = r2.centerY()
            float r2 = (float) r2
            r8.preScale(r0, r1, r9, r2)
        L_0x00fc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.c(android.util.Size, int):android.graphics.Matrix");
    }

    public final Matrix d() {
        int i;
        a.m((String) null, f());
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f5262a.getWidth(), (float) this.f5262a.getHeight());
        if (!this.f5267g) {
            i = this.f5264c;
        } else {
            i = -c.z(this.e);
        }
        return f.a(rectF, rectF, i, false);
    }

    public final RectF e(Size size, int i) {
        a.m((String) null, f());
        Matrix c8 = c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f5262a.getWidth(), (float) this.f5262a.getHeight());
        c8.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        boolean z;
        if (!this.f5267g || this.e != -1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f5263b == null || this.f5262a == null || !z) {
            return false;
        }
        return true;
    }
}
