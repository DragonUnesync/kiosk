package C0;

import R.e;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import v0.C1510H;

public final class f {

    /* renamed from: v  reason: collision with root package name */
    public static final d f510v = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public int f511a;

    /* renamed from: b  reason: collision with root package name */
    public final int f512b;

    /* renamed from: c  reason: collision with root package name */
    public int f513c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f514d;
    public float[] e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f515f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f516g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f517h;
    public int[] i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f518j;

    /* renamed from: k  reason: collision with root package name */
    public int f519k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f520l;

    /* renamed from: m  reason: collision with root package name */
    public final float f521m;

    /* renamed from: n  reason: collision with root package name */
    public final float f522n;

    /* renamed from: o  reason: collision with root package name */
    public final int f523o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f524p;

    /* renamed from: q  reason: collision with root package name */
    public final e f525q;

    /* renamed from: r  reason: collision with root package name */
    public View f526r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f527s;

    /* renamed from: t  reason: collision with root package name */
    public final CoordinatorLayout f528t;

    /* renamed from: u  reason: collision with root package name */
    public final e f529u = new e(0, this);

    public f(Context context, CoordinatorLayout coordinatorLayout, e eVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (eVar != null) {
            this.f528t = coordinatorLayout;
            this.f525q = eVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f523o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f512b = viewConfiguration.getScaledTouchSlop();
            this.f521m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f522n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f524p = new OverScroller(context, f510v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f513c = -1;
        float[] fArr = this.f514d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f515f, 0.0f);
            Arrays.fill(this.f516g, 0.0f);
            Arrays.fill(this.f517h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f518j, 0);
            this.f519k = 0;
        }
        VelocityTracker velocityTracker = this.f520l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f520l = null;
        }
    }

    public final void b(View view, int i8) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f528t;
        if (parent == coordinatorLayout) {
            this.f526r = view;
            this.f513c = i8;
            this.f525q.o(view, i8);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    public final boolean c(View view, float f8, float f9) {
        boolean z;
        boolean z6;
        if (view == null) {
            return false;
        }
        e eVar = this.f525q;
        if (eVar.j(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (eVar.k() > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z && z6) {
            float f10 = f9 * f9;
            int i8 = this.f512b;
            if (f10 + (f8 * f8) > ((float) (i8 * i8))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f8) > ((float) this.f512b)) {
                return true;
            }
            return false;
        } else if (!z6 || Math.abs(f9) <= ((float) this.f512b)) {
            return false;
        } else {
            return true;
        }
    }

    public final void d(int i8) {
        float[] fArr = this.f514d;
        if (fArr != null) {
            int i9 = this.f519k;
            int i10 = 1 << i8;
            if ((i9 & i10) != 0) {
                fArr[i8] = 0.0f;
                this.e[i8] = 0.0f;
                this.f515f[i8] = 0.0f;
                this.f516g[i8] = 0.0f;
                this.f517h[i8] = 0;
                this.i[i8] = 0;
                this.f518j[i8] = 0;
                this.f519k = (~i10) & i9;
            }
        }
    }

    public final int e(int i8, int i9, int i10) {
        int i11;
        if (i8 == 0) {
            return 0;
        }
        int width = this.f528t.getWidth();
        float f8 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i8)) / ((float) width)) - 0.5f) * 0.47123894f))) * f8) + f8;
        int abs = Math.abs(i9);
        if (abs > 0) {
            i11 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i11 = (int) (((((float) Math.abs(i8)) / ((float) i10)) + 1.0f) * 256.0f);
        }
        return Math.min(i11, 600);
    }

    public final boolean f() {
        if (this.f511a == 2) {
            OverScroller overScroller = this.f524p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f526r.getLeft();
            int top = currY - this.f526r.getTop();
            if (left != 0) {
                C1510H.j(this.f526r, left);
            }
            if (top != 0) {
                C1510H.k(this.f526r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f525q.q(this.f526r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f528t.post(this.f529u);
            }
        }
        if (this.f511a == 2) {
            return true;
        }
        return false;
    }

    public final View g(int i8, int i9) {
        CoordinatorLayout coordinatorLayout = this.f528t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f525q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        float f10;
        float f11;
        int left = this.f526r.getLeft();
        int top = this.f526r.getTop();
        int i12 = i8 - left;
        int i13 = i9 - top;
        OverScroller overScroller = this.f524p;
        if (i12 == 0 && i13 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f526r;
        int i14 = (int) this.f522n;
        int i15 = (int) this.f521m;
        int abs = Math.abs(i10);
        if (abs < i14) {
            i10 = 0;
        } else if (abs > i15) {
            if (i10 > 0) {
                i10 = i15;
            } else {
                i10 = -i15;
            }
        }
        int abs2 = Math.abs(i11);
        if (abs2 < i14) {
            i11 = 0;
        } else if (abs2 > i15) {
            if (i11 > 0) {
                i11 = i15;
            } else {
                i11 = -i15;
            }
        }
        int abs3 = Math.abs(i12);
        int abs4 = Math.abs(i13);
        int abs5 = Math.abs(i10);
        int abs6 = Math.abs(i11);
        int i16 = abs5 + abs6;
        int i17 = abs3 + abs4;
        if (i10 != 0) {
            f8 = (float) abs5;
            f9 = (float) i16;
        } else {
            f8 = (float) abs3;
            f9 = (float) i17;
        }
        float f12 = f8 / f9;
        if (i11 != 0) {
            f10 = (float) abs6;
            f11 = (float) i16;
        } else {
            f10 = (float) abs4;
            f11 = (float) i17;
        }
        float f13 = f10 / f11;
        e eVar = this.f525q;
        overScroller.startScroll(left, top, i12, i13, (int) ((((float) e(i13, i11, eVar.k())) * f13) + (((float) e(i12, i10, eVar.j(view))) * f12)));
        n(2);
        return true;
    }

    public final boolean i(int i8) {
        if ((this.f519k & (1 << i8)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i8 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f520l == null) {
            this.f520l = VelocityTracker.obtain();
        }
        this.f520l.addMovement(motionEvent);
        int i9 = 0;
        if (actionMasked == 0) {
            float x8 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g8 = g((int) x8, (int) y8);
            l(pointerId, x8, y8);
            q(g8, pointerId);
            int i10 = this.f517h[pointerId];
        } else if (actionMasked != 1) {
            e eVar = this.f525q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f511a == 1) {
                        this.f527s = true;
                        eVar.r(this.f526r, 0.0f, 0.0f);
                        this.f527s = false;
                        if (this.f511a == 1) {
                            n(0);
                        }
                    }
                    a();
                } else if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x9 = motionEvent.getX(actionIndex);
                    float y9 = motionEvent.getY(actionIndex);
                    l(pointerId2, x9, y9);
                    if (this.f511a == 0) {
                        q(g((int) x9, (int) y9), pointerId2);
                        int i11 = this.f517h[pointerId2];
                        return;
                    }
                    int i12 = (int) x9;
                    int i13 = (int) y9;
                    View view = this.f526r;
                    if (view != null && i12 >= view.getLeft() && i12 < view.getRight() && i13 >= view.getTop() && i13 < view.getBottom()) {
                        i9 = 1;
                    }
                    if (i9 != 0) {
                        q(this.f526r, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f511a == 1 && pointerId3 == this.f513c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i9 >= pointerCount) {
                                i8 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i9);
                            if (pointerId4 != this.f513c) {
                                View g9 = g((int) motionEvent.getX(i9), (int) motionEvent.getY(i9));
                                View view2 = this.f526r;
                                if (g9 == view2 && q(view2, pointerId4)) {
                                    i8 = this.f513c;
                                    break;
                                }
                            }
                            i9++;
                        }
                        if (i8 == -1) {
                            k();
                        }
                    }
                    d(pointerId3);
                }
            } else if (this.f511a != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i9 < pointerCount2) {
                    int pointerId5 = motionEvent.getPointerId(i9);
                    if (i(pointerId5)) {
                        float x10 = motionEvent.getX(i9);
                        float y10 = motionEvent.getY(i9);
                        float f8 = x10 - this.f514d[pointerId5];
                        float f9 = y10 - this.e[pointerId5];
                        Math.abs(f8);
                        Math.abs(f9);
                        int i14 = this.f517h[pointerId5];
                        Math.abs(f9);
                        Math.abs(f8);
                        int i15 = this.f517h[pointerId5];
                        Math.abs(f8);
                        Math.abs(f9);
                        int i16 = this.f517h[pointerId5];
                        Math.abs(f9);
                        Math.abs(f8);
                        int i17 = this.f517h[pointerId5];
                        if (this.f511a != 1) {
                            View g10 = g((int) x10, (int) y10);
                            if (c(g10, f8, f9) && q(g10, pointerId5)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i9++;
                }
                m(motionEvent);
            } else if (i(this.f513c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f513c);
                float x11 = motionEvent.getX(findPointerIndex);
                float y11 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f515f;
                int i18 = this.f513c;
                int i19 = (int) (x11 - fArr[i18]);
                int i20 = (int) (y11 - this.f516g[i18]);
                int left = this.f526r.getLeft() + i19;
                int top = this.f526r.getTop() + i20;
                int left2 = this.f526r.getLeft();
                int top2 = this.f526r.getTop();
                if (i19 != 0) {
                    left = eVar.b(this.f526r, left);
                    C1510H.j(this.f526r, left - left2);
                }
                if (i20 != 0) {
                    top = eVar.c(this.f526r, top);
                    C1510H.k(this.f526r, top - top2);
                }
                if (!(i19 == 0 && i20 == 0)) {
                    eVar.q(this.f526r, left, top);
                }
                m(motionEvent);
            }
        } else {
            if (this.f511a == 1) {
                k();
            }
            a();
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f520l;
        float f8 = this.f521m;
        velocityTracker.computeCurrentVelocity(1000, f8);
        float xVelocity = this.f520l.getXVelocity(this.f513c);
        float f9 = this.f522n;
        float abs = Math.abs(xVelocity);
        float f10 = 0.0f;
        if (abs < f9) {
            xVelocity = 0.0f;
        } else if (abs > f8) {
            if (xVelocity > 0.0f) {
                xVelocity = f8;
            } else {
                xVelocity = -f8;
            }
        }
        float yVelocity = this.f520l.getYVelocity(this.f513c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f9) {
            if (abs2 > f8) {
                if (yVelocity <= 0.0f) {
                    f8 = -f8;
                }
                f10 = f8;
            } else {
                f10 = yVelocity;
            }
        }
        this.f527s = true;
        this.f525q.r(this.f526r, xVelocity, f10);
        this.f527s = false;
        if (this.f511a == 1) {
            n(0);
        }
    }

    public final void l(int i8, float f8, float f9) {
        float[] fArr = this.f514d;
        int i9 = 0;
        if (fArr == null || fArr.length <= i8) {
            int i10 = i8 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f515f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f516g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f517h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f518j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f514d = fArr2;
            this.e = fArr3;
            this.f515f = fArr4;
            this.f516g = fArr5;
            this.f517h = iArr;
            this.i = iArr2;
            this.f518j = iArr3;
        }
        float[] fArr9 = this.f514d;
        this.f515f[i8] = f8;
        fArr9[i8] = f8;
        float[] fArr10 = this.e;
        this.f516g[i8] = f9;
        fArr10[i8] = f9;
        int[] iArr7 = this.f517h;
        int i11 = (int) f8;
        int i12 = (int) f9;
        CoordinatorLayout coordinatorLayout = this.f528t;
        int left = coordinatorLayout.getLeft();
        int i13 = this.f523o;
        if (i11 < left + i13) {
            i9 = 1;
        }
        if (i12 < coordinatorLayout.getTop() + i13) {
            i9 |= 4;
        }
        if (i11 > coordinatorLayout.getRight() - i13) {
            i9 |= 2;
        }
        if (i12 > coordinatorLayout.getBottom() - i13) {
            i9 |= 8;
        }
        iArr7[i8] = i9;
        this.f519k = (1 << i8) | this.f519k;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (i(pointerId)) {
                float x8 = motionEvent.getX(i8);
                float y8 = motionEvent.getY(i8);
                this.f515f[pointerId] = x8;
                this.f516g[pointerId] = y8;
            }
        }
    }

    public final void n(int i8) {
        this.f528t.removeCallbacks(this.f529u);
        if (this.f511a != i8) {
            this.f511a = i8;
            this.f525q.p(i8);
            if (this.f511a == 0) {
                this.f526r = null;
            }
        }
    }

    public final boolean o(int i8, int i9) {
        if (this.f527s) {
            return h(i8, i9, (int) this.f520l.getXVelocity(this.f513c), (int) this.f520l.getYVelocity(this.f513c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r12 != r11) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            int r3 = r18.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r17.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f520l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f520l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f520l
            r4.addMovement(r1)
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0118
            if (r2 == r4) goto L_0x0114
            if (r2 == r5) goto L_0x0067
            r7 = 3
            if (r2 == r7) goto L_0x0114
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r5 = 6
            if (r2 == r5) goto L_0x0034
            goto L_0x013c
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.d(r1)
            goto L_0x013c
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.l(r2, r7, r1)
            int r3 = r0.f511a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.f517h
            r1 = r1[r2]
            goto L_0x013c
        L_0x0056:
            if (r3 != r5) goto L_0x013c
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.g(r3, r1)
            android.view.View r3 = r0.f526r
            if (r1 != r3) goto L_0x013c
            r0.q(r1, r2)
            goto L_0x013c
        L_0x0067:
            float[] r2 = r0.f514d
            if (r2 == 0) goto L_0x013c
            float[] r2 = r0.e
            if (r2 != 0) goto L_0x0071
            goto L_0x013c
        L_0x0071:
            int r2 = r18.getPointerCount()
            r3 = 0
        L_0x0076:
            if (r3 >= r2) goto L_0x0110
            int r5 = r1.getPointerId(r3)
            boolean r7 = r0.i(r5)
            if (r7 != 0) goto L_0x0084
            goto L_0x010c
        L_0x0084:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f514d
            r9 = r9[r5]
            float r9 = r7 - r9
            float[] r10 = r0.e
            r10 = r10[r5]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.g(r7, r8)
            if (r7 == 0) goto L_0x00a8
            boolean r8 = r0.c(r7, r9, r10)
            if (r8 == 0) goto L_0x00a8
            r8 = 1
            goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            if (r8 == 0) goto L_0x00d6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            R.e r13 = r0.f525q
            int r12 = r13.b(r7, r12)
            int r14 = r7.getTop()
            int r15 = (int) r10
            int r15 = r15 + r14
            int r15 = r13.c(r7, r15)
            int r16 = r13.j(r7)
            int r13 = r13.k()
            if (r16 == 0) goto L_0x00cf
            if (r16 <= 0) goto L_0x00d6
            if (r12 != r11) goto L_0x00d6
        L_0x00cf:
            if (r13 == 0) goto L_0x0110
            if (r13 <= 0) goto L_0x00d6
            if (r15 != r14) goto L_0x00d6
            goto L_0x0110
        L_0x00d6:
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.f517h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r11 = r0.f517h
            r11 = r11[r5]
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.f517h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r9 = r0.f517h
            r9 = r9[r5]
            int r9 = r0.f511a
            if (r9 != r4) goto L_0x0103
            goto L_0x0110
        L_0x0103:
            if (r8 == 0) goto L_0x010c
            boolean r5 = r0.q(r7, r5)
            if (r5 == 0) goto L_0x010c
            goto L_0x0110
        L_0x010c:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x0110:
            r17.m(r18)
            goto L_0x013c
        L_0x0114:
            r17.a()
            goto L_0x013c
        L_0x0118:
            float r2 = r18.getX()
            float r3 = r18.getY()
            int r1 = r1.getPointerId(r6)
            r0.l(r1, r2, r3)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.g(r2, r3)
            android.view.View r3 = r0.f526r
            if (r2 != r3) goto L_0x0138
            int r3 = r0.f511a
            if (r3 != r5) goto L_0x0138
            r0.q(r2, r1)
        L_0x0138:
            int[] r2 = r0.f517h
            r1 = r2[r1]
        L_0x013c:
            int r1 = r0.f511a
            if (r1 != r4) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r4 = 0
        L_0x0142:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.f.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i8) {
        if (view == this.f526r && this.f513c == i8) {
            return true;
        }
        if (view == null || !this.f525q.w(view, i8)) {
            return false;
        }
        this.f513c = i8;
        b(view, i8);
        return true;
    }
}
