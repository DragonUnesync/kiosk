package y0;

import C0.e;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import o.C1297u0;

/* renamed from: y0.d  reason: case insensitive filesystem */
public final class C1618d implements View.OnTouchListener {

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16340l0 = ViewConfiguration.getTapTimeout();

    /* renamed from: U  reason: collision with root package name */
    public final C1615a f16341U;

    /* renamed from: V  reason: collision with root package name */
    public final AccelerateInterpolator f16342V = new AccelerateInterpolator();

    /* renamed from: W  reason: collision with root package name */
    public final ListView f16343W;

    /* renamed from: X  reason: collision with root package name */
    public e f16344X;

    /* renamed from: Y  reason: collision with root package name */
    public final float[] f16345Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float[] f16346Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f16347a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f16348b0;

    /* renamed from: c0  reason: collision with root package name */
    public final float[] f16349c0;

    /* renamed from: d0  reason: collision with root package name */
    public final float[] f16350d0;

    /* renamed from: e0  reason: collision with root package name */
    public final float[] f16351e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f16352f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f16353g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f16354h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f16355i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f16356j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1297u0 f16357k0;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, y0.a] */
    public C1618d(C1297u0 u0Var) {
        ? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.f16338g = -1;
        obj.f16337f = 0;
        this.f16341U = obj;
        float[] fArr = {0.0f, 0.0f};
        this.f16345Y = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f16346Z = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f16349c0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f16350d0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f16351e0 = fArr5;
        this.f16343W = u0Var;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = ((float) ((int) ((1575.0f * f8) + 0.5f))) / 1000.0f;
        fArr5[0] = f9;
        fArr5[1] = f9;
        float f10 = ((float) ((int) ((f8 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f16347a0 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f16348b0 = f16340l0;
        obj.f16333a = 500;
        obj.f16334b = 500;
        this.f16357k0 = u0Var;
    }

    public static float b(float f8, float f9, float f10) {
        if (f8 > f10) {
            return f10;
        }
        if (f8 < f9) {
            return f9;
        }
        return f8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f16345Y
            r0 = r0[r7]
            float[] r1 = r3.f16346Z
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            android.view.animation.AccelerateInterpolator r5 = r3.f16342V
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002e
        L_0x0026:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            float r4 = r5.getInterpolation(r4)
        L_0x002e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            return r2
        L_0x003d:
            float[] r0 = r3.f16349c0
            r0 = r0[r7]
            float[] r1 = r3.f16350d0
            r1 = r1[r7]
            float[] r2 = r3.f16351e0
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0054
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L_0x0054:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C1618d.a(float, float, float, int):float");
    }

    public final float c(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i = this.f16347a0;
        if (i == 0 || i == 1) {
            if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (!this.f16355i0 || i != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i == 2 && f8 < 0.0f) {
            return f8 / (-f9);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f16353g0) {
            this.f16355i0 = false;
            return;
        }
        C1615a aVar = this.f16341U;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i8 = (int) (currentAnimationTimeMillis - aVar.e);
        int i9 = aVar.f16334b;
        if (i8 > i9) {
            i = i9;
        } else if (i8 >= 0) {
            i = i8;
        }
        aVar.i = i;
        aVar.f16339h = aVar.a(currentAnimationTimeMillis);
        aVar.f16338g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r8.f16357k0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
            y0.a r0 = r8.f16341U
            float r1 = r0.f16336d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f16335c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            o.u0 r2 = r8.f16357k0
            int r3 = r2.getCount()
            if (r3 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L_0x003a
            if (r6 < r3) goto L_0x0049
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r5 > 0) goto L_0x0049
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C1618d.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f16356j0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r8 = 3
            if (r0 == r8) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r7.d()
            goto L_0x007d
        L_0x001a:
            r7.f16354h0 = r2
            r7.f16352f0 = r1
        L_0x001e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f16343W
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            y0.a r9 = r7.f16341U
            r9.f16335c = r0
            r9.f16336d = r8
            boolean r8 = r7.f16355i0
            if (r8 != 0) goto L_0x007d
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007d
            C0.e r8 = r7.f16344X
            if (r8 != 0) goto L_0x0061
            C0.e r8 = new C0.e
            r9 = 25
            r8.<init>(r9, r7)
            r7.f16344X = r8
        L_0x0061:
            r7.f16355i0 = r2
            r7.f16353g0 = r2
            boolean r8 = r7.f16352f0
            if (r8 != 0) goto L_0x0076
            int r8 = r7.f16348b0
            if (r8 <= 0) goto L_0x0076
            C0.e r9 = r7.f16344X
            long r5 = (long) r8
            java.util.WeakHashMap r8 = v0.C1510H.f15874a
            r4.postOnAnimationDelayed(r9, r5)
            goto L_0x007b
        L_0x0076:
            C0.e r8 = r7.f16344X
            r8.run()
        L_0x007b:
            r7.f16352f0 = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C1618d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
