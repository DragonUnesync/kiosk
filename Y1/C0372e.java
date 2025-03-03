package Y1;

import C3.j;
import E2.a;
import M0.Q;
import M0.X;
import P0.l;
import P0.z;
import T0.C0232y;
import U.p;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: Y1.e  reason: case insensitive filesystem */
public final class C0372e extends View implements I {

    /* renamed from: A0  reason: collision with root package name */
    public Rect f6391A0;

    /* renamed from: B0  reason: collision with root package name */
    public final ValueAnimator f6392B0;

    /* renamed from: C0  reason: collision with root package name */
    public float f6393C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f6394D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f6395E0;

    /* renamed from: F0  reason: collision with root package name */
    public long f6396F0;

    /* renamed from: G0  reason: collision with root package name */
    public long f6397G0;

    /* renamed from: H0  reason: collision with root package name */
    public long f6398H0;

    /* renamed from: I0  reason: collision with root package name */
    public long f6399I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f6400J0;

    /* renamed from: K0  reason: collision with root package name */
    public long[] f6401K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean[] f6402L0;

    /* renamed from: U  reason: collision with root package name */
    public final Rect f6403U = new Rect();

    /* renamed from: V  reason: collision with root package name */
    public final Rect f6404V = new Rect();

    /* renamed from: W  reason: collision with root package name */
    public final Rect f6405W = new Rect();

    /* renamed from: a0  reason: collision with root package name */
    public final Rect f6406a0 = new Rect();

    /* renamed from: b0  reason: collision with root package name */
    public final Paint f6407b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Paint f6408c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Paint f6409d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Paint f6410e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Paint f6411f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Paint f6412g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Drawable f6413h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f6414i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f6415j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f6416k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f6417l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f6418m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f6419n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f6420o0;
    public final int p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f6421q0;

    /* renamed from: r0  reason: collision with root package name */
    public final StringBuilder f6422r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Formatter f6423s0;

    /* renamed from: t0  reason: collision with root package name */
    public final p f6424t0;

    /* renamed from: u0  reason: collision with root package name */
    public final CopyOnWriteArraySet f6425u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Point f6426v0;

    /* renamed from: w0  reason: collision with root package name */
    public final float f6427w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6428x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f6429y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f6430z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0372e(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 0);
        AttributeSet attributeSet2 = attributeSet;
        Paint paint = new Paint();
        this.f6407b0 = paint;
        Paint paint2 = new Paint();
        this.f6408c0 = paint2;
        Paint paint3 = new Paint();
        this.f6409d0 = paint3;
        Paint paint4 = new Paint();
        this.f6410e0 = paint4;
        Paint paint5 = new Paint();
        this.f6411f0 = paint5;
        Paint paint6 = new Paint();
        this.f6412g0 = paint6;
        paint6.setAntiAlias(true);
        this.f6425u0 = new CopyOnWriteArraySet();
        this.f6426v0 = new Point();
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f6427w0 = f8;
        this.f6421q0 = a(-50, f8);
        int a8 = a(4, f8);
        int a9 = a(26, f8);
        int a10 = a(4, f8);
        int a11 = a(12, f8);
        int a12 = a(0, f8);
        int a13 = a(16, f8);
        if (attributeSet2 != null) {
            Paint paint7 = paint5;
            Paint paint8 = paint4;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C.f6322b, 0, 2132017487);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f6413h0 = drawable;
                if (drawable != null) {
                    int i = z.f3748a;
                    if (i >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || !drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    a9 = Math.max(drawable.getMinimumHeight(), a9);
                }
                this.f6414i0 = obtainStyledAttributes.getDimensionPixelSize(3, a8);
                this.f6415j0 = obtainStyledAttributes.getDimensionPixelSize(12, a9);
                this.f6416k0 = obtainStyledAttributes.getInt(2, 0);
                this.f6417l0 = obtainStyledAttributes.getDimensionPixelSize(1, a10);
                this.f6418m0 = obtainStyledAttributes.getDimensionPixelSize(11, a11);
                this.f6419n0 = obtainStyledAttributes.getDimensionPixelSize(8, a12);
                this.f6420o0 = obtainStyledAttributes.getDimensionPixelSize(9, a13);
                int i8 = obtainStyledAttributes.getInt(6, -1);
                int i9 = obtainStyledAttributes.getInt(7, -1);
                int i10 = obtainStyledAttributes.getInt(4, -855638017);
                int i11 = obtainStyledAttributes.getInt(13, 872415231);
                int i12 = obtainStyledAttributes.getInt(0, -1291845888);
                int i13 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i8);
                paint6.setColor(i9);
                paint2.setColor(i10);
                paint3.setColor(i11);
                paint8.setColor(i12);
                paint7.setColor(i13);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f6414i0 = a8;
            this.f6415j0 = a9;
            this.f6416k0 = 0;
            this.f6417l0 = a10;
            this.f6418m0 = a11;
            this.f6419n0 = a12;
            this.f6420o0 = a13;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f6413h0 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f6422r0 = sb;
        this.f6423s0 = new Formatter(sb, Locale.getDefault());
        this.f6424t0 = new p(3, (Object) this);
        Drawable drawable2 = this.f6413h0;
        if (drawable2 != null) {
            this.p0 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.p0 = (Math.max(this.f6419n0, Math.max(this.f6418m0, this.f6420o0)) + 1) / 2;
        }
        this.f6393C0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6392B0 = valueAnimator;
        valueAnimator.addUpdateListener(new j(1, this));
        this.f6397G0 = -9223372036854775807L;
        this.f6429y0 = -9223372036854775807L;
        this.f6428x0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i, float f8) {
        return (int) ((((float) i) * f8) + 0.5f);
    }

    private long getPositionIncrement() {
        long j7 = this.f6429y0;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j8 = this.f6397G0;
        if (j8 == -9223372036854775807L) {
            return 0;
        }
        return j8 / ((long) this.f6428x0);
    }

    private String getProgressText() {
        return z.C(this.f6422r0, this.f6423s0, this.f6398H0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f6404V;
        if (rect.width() <= 0 || this.f6397G0 == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f6406a0.width()) * this.f6397G0) / ((long) rect.width());
    }

    public final boolean b(long j7) {
        long j8;
        long j9 = this.f6397G0;
        if (j9 <= 0) {
            return false;
        }
        if (this.f6395E0) {
            j8 = this.f6396F0;
        } else {
            j8 = this.f6398H0;
        }
        long j10 = j8;
        long j11 = z.j(j10 + j7, 0, j9);
        if (j11 == j10) {
            return false;
        }
        if (!this.f6395E0) {
            c(j11);
        } else {
            f(j11);
        }
        e();
        return true;
    }

    public final void c(long j7) {
        this.f6396F0 = j7;
        this.f6395E0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f6425u0.iterator();
        while (it.hasNext()) {
            r rVar = ((C0374g) it.next()).f6435U;
            rVar.f6510k1 = true;
            TextView textView = rVar.f6460A0;
            if (textView != null) {
                textView.setText(z.C(rVar.f6462C0, rVar.f6463D0, j7));
            }
            rVar.f6480U.f();
        }
    }

    public final void d(boolean z) {
        Q q7;
        removeCallbacks(this.f6424t0);
        this.f6395E0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f6425u0.iterator();
        while (it.hasNext()) {
            long j7 = this.f6396F0;
            r rVar = ((C0374g) it.next()).f6435U;
            rVar.f6510k1 = false;
            if (!z && (q7 = rVar.f6496d1) != null) {
                if (rVar.f6508j1) {
                    a aVar = (a) q7;
                    if (aVar.e(17) && aVar.e(10)) {
                        X z6 = ((C0232y) aVar).z();
                        int o2 = z6.o();
                        int i = 0;
                        while (true) {
                            long c02 = z.c0(z6.m(i, rVar.f6465F0, 0).f2880m);
                            if (j7 < c02) {
                                break;
                            } else if (i == o2 - 1) {
                                j7 = c02;
                                break;
                            } else {
                                j7 -= c02;
                                i++;
                            }
                        }
                        aVar.k(j7, i, false);
                    }
                } else {
                    a aVar2 = (a) q7;
                    if (aVar2.e(5)) {
                        aVar2.k(j7, ((C0232y) aVar2).v(), false);
                    }
                }
                rVar.o();
            }
            rVar.f6480U.g();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6413h0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        long j7;
        Rect rect = this.f6405W;
        Rect rect2 = this.f6404V;
        rect.set(rect2);
        Rect rect3 = this.f6406a0;
        rect3.set(rect2);
        if (this.f6395E0) {
            j7 = this.f6396F0;
        } else {
            j7 = this.f6398H0;
        }
        if (this.f6397G0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f6399I0) / this.f6397G0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j7) / this.f6397G0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f6403U);
    }

    public final void f(long j7) {
        if (this.f6396F0 != j7) {
            this.f6396F0 = j7;
            Iterator it = this.f6425u0.iterator();
            while (it.hasNext()) {
                r rVar = ((C0374g) it.next()).f6435U;
                TextView textView = rVar.f6460A0;
                if (textView != null) {
                    textView.setText(z.C(rVar.f6462C0, rVar.f6463D0, j7));
                }
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (((float) this.f6404V.width()) / this.f6427w0);
        if (width != 0) {
            long j7 = this.f6397G0;
            if (!(j7 == 0 || j7 == -9223372036854775807L)) {
                return j7 / ((long) width);
            }
        }
        return Long.MAX_VALUE;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6413h0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        Paint paint;
        Canvas canvas2 = canvas;
        canvas.save();
        Rect rect = this.f6404V;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i8 = centerY + height;
        long j7 = this.f6397G0;
        Paint paint2 = this.f6409d0;
        Rect rect2 = this.f6406a0;
        if (j7 <= 0) {
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i8, paint2);
        } else {
            Rect rect3 = this.f6405W;
            int i9 = rect3.left;
            int i10 = rect3.right;
            int max = Math.max(Math.max(rect.left, i10), rect2.right);
            int i11 = rect.right;
            if (max < i11) {
                canvas.drawRect((float) max, (float) centerY, (float) i11, (float) i8, paint2);
            }
            int max2 = Math.max(i9, rect2.right);
            if (i10 > max2) {
                canvas.drawRect((float) max2, (float) centerY, (float) i10, (float) i8, this.f6408c0);
            }
            if (rect2.width() > 0) {
                canvas.drawRect((float) rect2.left, (float) centerY, (float) rect2.right, (float) i8, this.f6407b0);
            }
            if (this.f6400J0 != 0) {
                long[] jArr = this.f6401K0;
                jArr.getClass();
                boolean[] zArr = this.f6402L0;
                zArr.getClass();
                int i12 = this.f6417l0;
                int i13 = i12 / 2;
                int i14 = 0;
                int i15 = 0;
                while (i15 < this.f6400J0) {
                    long j8 = z.j(jArr[i15], 0, this.f6397G0);
                    int min = Math.min(rect.width() - i12, Math.max(i14, ((int) ((((long) rect.width()) * j8) / this.f6397G0)) - i13)) + rect.left;
                    if (zArr[i15]) {
                        paint = this.f6411f0;
                    } else {
                        paint = this.f6410e0;
                    }
                    float f8 = (float) (min + i12);
                    float f9 = (float) i8;
                    canvas.drawRect((float) min, (float) centerY, f8, f9, paint);
                    i15++;
                    i12 = i12;
                    i14 = 0;
                }
            }
        }
        if (this.f6397G0 > 0) {
            int i16 = z.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f6413h0;
            if (drawable == null) {
                if (this.f6395E0 || isFocused()) {
                    i = this.f6420o0;
                } else if (isEnabled()) {
                    i = this.f6418m0;
                } else {
                    i = this.f6419n0;
                }
                canvas2.drawCircle((float) i16, (float) centerY2, (float) ((int) ((((float) i) * this.f6393C0) / 2.0f)), this.f6412g0);
            } else {
                int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f6393C0)) / 2;
                int intrinsicHeight = ((int) (((float) drawable.getIntrinsicHeight()) * this.f6393C0)) / 2;
                drawable.setBounds(i16 - intrinsicWidth, centerY2 - intrinsicHeight, i16 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas.restore();
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f6395E0 && !z) {
            d(false);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f6397G0 > 0) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (b(r0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = r4.f6424t0;
        removeCallbacks(r5);
        postDelayed(r5, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x002e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0025
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0025;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x002e
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L_0x002e
            U.p r5 = r4.f6424t0
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0025:
            boolean r0 = r4.f6395E0
            if (r0 == 0) goto L_0x002e
            r5 = 0
            r4.d(r5)
            return r3
        L_0x002e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.C0372e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        Rect rect;
        int i14 = i9 - i;
        int i15 = i10 - i8;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        if (this.f6394D0) {
            i11 = 0;
        } else {
            i11 = this.p0;
        }
        int i16 = this.f6416k0;
        int i17 = this.f6414i0;
        int i18 = this.f6415j0;
        if (i16 == 1) {
            i13 = (i15 - getPaddingBottom()) - i18;
            i12 = ((i15 - getPaddingBottom()) - i17) - Math.max(i11 - (i17 / 2), 0);
        } else {
            i13 = (i15 - i18) / 2;
            i12 = (i15 - i17) / 2;
        }
        Rect rect2 = this.f6403U;
        rect2.set(paddingLeft, i13, paddingRight, i18 + i13);
        this.f6404V.set(rect2.left + i11, i12, rect2.right - i11, i17 + i12);
        if (z.f3748a >= 29 && !((rect = this.f6391A0) != null && rect.width() == i14 && this.f6391A0.height() == i15)) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.f6391A0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    public final void onMeasure(int i, int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int i9 = this.f6415j0;
        if (mode == 0) {
            size = i9;
        } else if (mode != 1073741824) {
            size = Math.min(i9, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f6413h0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f6413h0;
        if (drawable != null && z.f3748a >= 23 && drawable.setLayoutDirection(i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r3 != 3) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x00a1
            long r2 = r9.f6397G0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            goto L_0x00a1
        L_0x0011:
            android.graphics.Point r0 = r9.f6426v0
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f6406a0
            android.graphics.Rect r5 = r9.f6404V
            r6 = 1
            if (r3 == 0) goto L_0x007d
            r7 = 3
            if (r3 == r6) goto L_0x006e
            r8 = 2
            if (r3 == r8) goto L_0x0038
            if (r3 == r7) goto L_0x006e
            goto L_0x00a1
        L_0x0038:
            boolean r10 = r9.f6395E0
            if (r10 == 0) goto L_0x00a1
            int r10 = r9.f6421q0
            if (r0 >= r10) goto L_0x0052
            int r10 = r9.f6430z0
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = P0.z.i(r10, r0, r1)
            r4.right = r10
            goto L_0x0060
        L_0x0052:
            r9.f6430z0 = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = P0.z.i(r10, r0, r1)
            r4.right = r10
        L_0x0060:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L_0x006e:
            boolean r0 = r9.f6395E0
            if (r0 == 0) goto L_0x00a1
            int r10 = r10.getAction()
            if (r10 != r7) goto L_0x0079
            r1 = 1
        L_0x0079:
            r9.d(r1)
            return r6
        L_0x007d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f6403U
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto L_0x00a1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = P0.z.i(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        L_0x00a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.C0372e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f6397G0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f6410e0.setColor(i);
        invalidate(this.f6403U);
    }

    public void setBufferedColor(int i) {
        this.f6408c0.setColor(i);
        invalidate(this.f6403U);
    }

    public void setBufferedPosition(long j7) {
        if (this.f6399I0 != j7) {
            this.f6399I0 = j7;
            e();
        }
    }

    public void setDuration(long j7) {
        if (this.f6397G0 != j7) {
            this.f6397G0 = j7;
            if (this.f6395E0 && j7 == -9223372036854775807L) {
                d(true);
            }
            e();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f6395E0 && !z) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f6428x0 = i;
        this.f6429y0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j7) {
        boolean z;
        if (j7 > 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f6428x0 = -1;
        this.f6429y0 = j7;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f6411f0.setColor(i);
        invalidate(this.f6403U);
    }

    public void setPlayedColor(int i) {
        this.f6407b0.setColor(i);
        invalidate(this.f6403U);
    }

    public void setPosition(long j7) {
        if (this.f6398H0 != j7) {
            this.f6398H0 = j7;
            setContentDescription(getProgressText());
            e();
        }
    }

    public void setScrubberColor(int i) {
        this.f6412g0.setColor(i);
        invalidate(this.f6403U);
    }

    public void setUnplayedColor(int i) {
        this.f6409d0.setColor(i);
        invalidate(this.f6403U);
    }
}
