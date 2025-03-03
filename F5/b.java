package F5;

import A.f;
import C0.d;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.M1;
import de.ozerov.fully.N1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import v0.C1546s;

public final class b extends ViewGroup {

    /* renamed from: x0  reason: collision with root package name */
    public static final d f1547x0 = new d(1);

    /* renamed from: U  reason: collision with root package name */
    public View f1548U;

    /* renamed from: V  reason: collision with root package name */
    public int f1549V;

    /* renamed from: W  reason: collision with root package name */
    public Scroller f1550W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1551a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1552b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1553c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1554d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1555e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f1556f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f1557g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f1558h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1559i0;

    /* renamed from: j0  reason: collision with root package name */
    public VelocityTracker f1560j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1561k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f1562l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f1563m0;

    /* renamed from: n0  reason: collision with root package name */
    public c f1564n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1565o0;
    public a p0;

    /* renamed from: q0  reason: collision with root package name */
    public f f1566q0;

    /* renamed from: r0  reason: collision with root package name */
    public g f1567r0;

    /* renamed from: s0  reason: collision with root package name */
    public i f1568s0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList f1569t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1570u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1571v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f1572w0;

    private int getLeftBound() {
        c cVar = this.f1564n0;
        View view = this.f1548U;
        int i = cVar.f1579d0;
        if (i == 0 || i == 2) {
            return view.getLeft() - cVar.getBehindWidth();
        }
        if (i == 1) {
            return view.getLeft();
        }
        return 0;
    }

    private int getRightBound() {
        c cVar = this.f1564n0;
        View view = this.f1548U;
        int i = cVar.f1579d0;
        if (i == 0) {
            return view.getLeft();
        }
        if (i != 1 && i != 2) {
            return 0;
        }
        return cVar.getBehindWidth() + view.getLeft();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1551a0 != z) {
            this.f1551a0 = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            if (r0 != r6) goto L_0x0007
            r0 = 0
        L_0x0007:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r6, r0, r7)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L_0x003f
            if (r1 == r0) goto L_0x003f
            if (r7 != r5) goto L_0x0020
            boolean r3 = r1.requestFocus()
            goto L_0x005b
        L_0x0020:
            if (r7 != r4) goto L_0x005b
            if (r0 == 0) goto L_0x003a
            int r4 = r1.getLeft()
            int r0 = r0.getLeft()
            if (r4 > r0) goto L_0x003a
            int r0 = r6.f1549V
            if (r0 >= r2) goto L_0x0037
            int r0 = r0 + r2
            r6.h(r0, r3, r2, r3)
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            r3 = r2
            goto L_0x005b
        L_0x003a:
            boolean r3 = r1.requestFocus()
            goto L_0x005b
        L_0x003f:
            if (r7 == r5) goto L_0x0052
            if (r7 != r2) goto L_0x0044
            goto L_0x0052
        L_0x0044:
            if (r7 == r4) goto L_0x0049
            r0 = 2
            if (r7 != r0) goto L_0x005b
        L_0x0049:
            int r0 = r6.f1549V
            if (r0 >= r2) goto L_0x0037
            int r0 = r0 + r2
            r6.h(r0, r3, r2, r3)
            goto L_0x0038
        L_0x0052:
            int r0 = r6.f1549V
            if (r0 <= 0) goto L_0x0037
            int r0 = r0 - r2
            r6.h(r0, r3, r2, r3)
            goto L_0x0038
        L_0x005b:
            if (r3 == 0) goto L_0x0064
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x0064:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.b.a(int):boolean");
    }

    public final void b() {
        if (this.f1552b0) {
            setScrollingCacheEnabled(false);
            this.f1550W.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f1550W.getCurrX();
            int currY = this.f1550W.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
            if (f()) {
                i iVar = this.f1568s0;
                if (iVar != null) {
                    N1 n12 = ((M1) iVar).f10093a;
                    n12.f10157a.requestFocus();
                    FullyActivity fullyActivity = n12.e;
                    C0794w0.V(fullyActivity);
                    if (fullyActivity.f9921J0.i()) {
                        fullyActivity.f9921J0.b();
                    }
                }
            } else {
                g gVar = this.f1567r0;
                if (gVar != null) {
                    ((M1) gVar).a();
                }
            }
        }
        this.f1552b0 = false;
    }

    public final void c(MotionEvent motionEvent) {
        int i;
        int i8;
        int i9;
        int i10 = this.f1559i0;
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex == -1) {
            this.f1559i0 = -1;
        }
        if (i10 != -1 && findPointerIndex != -1) {
            float x8 = motionEvent.getX(findPointerIndex);
            float f8 = x8 - this.f1557g0;
            float abs = Math.abs(f8);
            float y8 = motionEvent.getY(findPointerIndex);
            float abs2 = Math.abs(y8 - this.f1558h0);
            if (f()) {
                i = this.f1555e0 / 2;
            } else {
                i = this.f1555e0;
            }
            if (abs > ((float) i) && abs > abs2 && (!f() ? !((i8 = this.f1564n0.f1579d0) != 0 ? i8 != 1 ? i8 != 2 : f8 >= 0.0f : f8 <= 0.0f) : !((i9 = this.f1564n0.f1579d0) != 0 ? i9 != 1 ? i9 != 2 : f8 <= 0.0f : f8 >= 0.0f))) {
                this.f1553c0 = true;
                this.f1571v0 = false;
                this.f1557g0 = x8;
                this.f1558h0 = y8;
                setScrollingCacheEnabled(true);
            } else if (abs > ((float) this.f1555e0)) {
                this.f1554d0 = true;
            }
        }
    }

    public final void computeScroll() {
        if (this.f1550W.isFinished() || !this.f1550W.computeScrollOffset()) {
            b();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1550W.getCurrX();
        int currY = this.f1550W.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            int width = getWidth();
            int i = currX / width;
            int i8 = currX % width;
        }
        invalidate();
    }

    public final void d() {
        this.f1571v0 = false;
        this.f1553c0 = false;
        this.f1554d0 = false;
        this.f1559i0 = -1;
        VelocityTracker velocityTracker = this.f1560j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1560j0 = null;
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        int i;
        int right;
        int behindWidth;
        int i8;
        int left;
        int i9;
        super.dispatchDraw(canvas);
        c cVar = this.f1564n0;
        View view = this.f1548U;
        int i10 = 0;
        if (cVar.f1583h0 != null && cVar.f1585j0 > 0) {
            int i11 = cVar.f1579d0;
            if (i11 == 0) {
                left = view.getLeft();
                i9 = cVar.f1585j0;
            } else {
                if (i11 == 1) {
                    i8 = view.getRight();
                } else if (i11 == 2) {
                    if (cVar.f1584i0 != null) {
                        int right2 = view.getRight();
                        cVar.f1584i0.setBounds(right2, 0, cVar.f1585j0 + right2, cVar.getHeight());
                        cVar.f1584i0.draw(canvas);
                    }
                    left = view.getLeft();
                    i9 = cVar.f1585j0;
                } else {
                    i8 = 0;
                }
                cVar.f1583h0.setBounds(i8, 0, cVar.f1585j0 + i8, cVar.getHeight());
                cVar.f1583h0.draw(canvas);
            }
            i8 = left - i9;
            cVar.f1583h0.setBounds(i8, 0, cVar.f1585j0 + i8, cVar.getHeight());
            cVar.f1583h0.draw(canvas);
        }
        c cVar2 = this.f1564n0;
        View view2 = this.f1548U;
        float percentOpen = getPercentOpen();
        if (cVar2.f1580e0) {
            float abs = Math.abs(1.0f - percentOpen);
            Paint paint = cVar2.f1581f0;
            paint.setColor(Color.argb((int) (abs * cVar2.f1586k0 * 255.0f), 0, 0, 0));
            int i12 = cVar2.f1579d0;
            if (i12 == 0) {
                i10 = view2.getLeft() - cVar2.getBehindWidth();
                i = view2.getLeft();
            } else {
                if (i12 == 1) {
                    i10 = view2.getRight();
                    right = view2.getRight();
                    behindWidth = cVar2.getBehindWidth();
                } else if (i12 == 2) {
                    Canvas canvas2 = canvas;
                    canvas2.drawRect((float) (view2.getLeft() - cVar2.getBehindWidth()), 0.0f, (float) view2.getLeft(), (float) cVar2.getHeight(), paint);
                    i10 = view2.getRight();
                    right = view2.getRight();
                    behindWidth = cVar2.getBehindWidth();
                } else {
                    i = 0;
                }
                i = right + behindWidth;
            }
            canvas.drawRect((float) i10, 0.0f, (float) i, (float) cVar2.getHeight(), paint);
        }
        this.f1564n0.a(this.f1548U, canvas, getPercentOpen());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L_0x0049
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0044
            int r0 = r5.getKeyCode()
            r3 = 21
            if (r0 == r3) goto L_0x003d
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x001f
            goto L_0x0044
        L_0x001f:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            r5 = 2
            boolean r5 = r4.a(r5)
            goto L_0x0045
        L_0x002b:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L_0x0044
            boolean r5 = r4.a(r1)
            goto L_0x0045
        L_0x0036:
            r5 = 66
            boolean r5 = r4.a(r5)
            goto L_0x0045
        L_0x003d:
            r5 = 17
            boolean r5 = r4.a(r5)
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            if (r5 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final int e(int i) {
        int left;
        int behindWidth;
        int left2;
        int behindWidth2;
        if (i != 0) {
            if (i == 1) {
                return this.f1548U.getLeft();
            }
            if (i != 2) {
                return 0;
            }
        }
        c cVar = this.f1564n0;
        View view = this.f1548U;
        int i8 = cVar.f1579d0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    if (i == 0) {
                        left = view.getLeft();
                        behindWidth = cVar.getBehindWidth();
                    } else if (i == 2) {
                        left2 = view.getLeft();
                        behindWidth2 = cVar.getBehindWidth();
                    }
                }
                return view.getLeft();
            } else if (i == 0) {
                return view.getLeft();
            } else {
                if (i == 2) {
                    left2 = view.getLeft();
                    behindWidth2 = cVar.getBehindWidth();
                }
                return view.getLeft();
            }
            return left2 + behindWidth2;
        } else if (i != 0) {
            if (i == 2) {
                return view.getLeft();
            }
            return view.getLeft();
        } else {
            left = view.getLeft();
            behindWidth = cVar.getBehindWidth();
        }
        return left - behindWidth;
    }

    public final boolean f() {
        int i = this.f1549V;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    public final void g(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1559i0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f1557g0 = motionEvent.getX(i);
            this.f1559i0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1560j0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public int getBehindWidth() {
        c cVar = this.f1564n0;
        if (cVar == null) {
            return 0;
        }
        return cVar.getBehindWidth();
    }

    public View getContent() {
        return this.f1548U;
    }

    public int getContentLeft() {
        return this.f1548U.getPaddingLeft() + this.f1548U.getLeft();
    }

    public int getCurrentItem() {
        return this.f1549V;
    }

    public float getPercentOpen() {
        return Math.abs(this.f1572w0 - ((float) this.f1548U.getLeft())) / ((float) getBehindWidth());
    }

    public int getTouchMode() {
        return this.f1570u0;
    }

    public final void h(int i, int i8, boolean z, boolean z6) {
        boolean z8;
        int i9;
        f fVar;
        a aVar;
        if (z6 || this.f1549V != i) {
            c cVar = this.f1564n0;
            cVar.getClass();
            int i10 = 2;
            if (i > 1) {
                i = 2;
            } else if (i < 1) {
                i = 0;
            }
            int i11 = cVar.f1579d0;
            if (i11 == 0 && i > 1) {
                i10 = 0;
            } else if (i11 != 1 || i >= 1) {
                i10 = i;
            }
            if (this.f1549V != i10) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f1549V = i10;
            int e = e(i10);
            if (z8 && (aVar = this.p0) != null) {
                aVar.s(i10);
            }
            if (z8 && (fVar = this.f1566q0) != null) {
                fVar.s(i10);
            }
            if (!z) {
                b();
                scrollTo(e, 0);
            } else if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i12 = e - scrollX;
                int i13 = 0 - scrollY;
                if (i12 == 0 && i13 == 0) {
                    b();
                    if (f()) {
                        i iVar = this.f1568s0;
                        if (iVar != null) {
                            N1 n12 = ((M1) iVar).f10093a;
                            n12.f10157a.requestFocus();
                            FullyActivity fullyActivity = n12.e;
                            C0794w0.V(fullyActivity);
                            if (fullyActivity.f9921J0.i()) {
                                fullyActivity.f9921J0.b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    g gVar = this.f1567r0;
                    if (gVar != null) {
                        ((M1) gVar).a();
                        return;
                    }
                    return;
                }
                setScrollingCacheEnabled(true);
                this.f1552b0 = true;
                int behindWidth = getBehindWidth();
                float f8 = (float) (behindWidth / 2);
                float sin = (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (((float) Math.abs(i12)) * 1.0f) / ((float) behindWidth)) - 0.5f)) * 0.4712389167638204d)))) * f8) + f8;
                int abs = Math.abs(i8);
                if (abs > 0) {
                    i9 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                } else {
                    Math.abs(i12);
                    i9 = 600;
                }
                this.f1550W.startScroll(scrollX, scrollY, i12, i13, Math.min(i9, 600));
                invalidate();
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x8 = (int) (motionEvent.getX() + this.f1572w0);
        boolean z = false;
        if (f()) {
            c cVar = this.f1564n0;
            View view = this.f1548U;
            int i = this.f1549V;
            float f8 = (float) x8;
            int i8 = cVar.f1573U;
            if (i8 == 0) {
                return cVar.b(view, i, f8);
            }
            if (i8 != 1) {
                return false;
            }
            return true;
        }
        int i9 = this.f1570u0;
        if (i9 == 0) {
            c cVar2 = this.f1564n0;
            View view2 = this.f1548U;
            cVar2.getClass();
            int left = view2.getLeft();
            int right = view2.getRight();
            int i10 = cVar2.f1579d0;
            if (i10 == 0) {
                if (x8 < left || x8 > cVar2.f1576a0 + left) {
                    return false;
                }
            } else if (i10 == 1) {
                if (x8 > right || x8 < right - cVar2.f1576a0) {
                    return false;
                }
            } else if (i10 != 2) {
                return false;
            } else {
                if ((x8 < left || x8 > cVar2.f1576a0 + left) && (x8 > right || x8 < right - cVar2.f1576a0)) {
                    return false;
                }
            }
            return true;
        } else if (i9 != 1) {
            return false;
        } else {
            Rect rect = new Rect();
            Iterator it = this.f1569t0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ((View) it.next()).getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    z = true;
                    break;
                }
            }
            return !z;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1565o0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1 || (action != 0 && this.f1554d0)) {
            d();
            return false;
        }
        if (action == 0) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            this.f1559i0 = pointerId;
            if (pointerId != -1) {
                float x8 = motionEvent.getX(actionIndex);
                this.f1556f0 = x8;
                this.f1557g0 = x8;
                this.f1558h0 = motionEvent.getY(actionIndex);
                if (i(motionEvent)) {
                    this.f1553c0 = false;
                    this.f1554d0 = false;
                    if (f() && this.f1564n0.b(this.f1548U, this.f1549V, motionEvent.getX() + this.f1572w0)) {
                        this.f1571v0 = true;
                    }
                } else {
                    this.f1554d0 = true;
                }
            }
        } else if (action == 2) {
            c(motionEvent);
        } else if (action == 6) {
            g(motionEvent);
        }
        if (!this.f1553c0) {
            if (this.f1560j0 == null) {
                this.f1560j0 = VelocityTracker.obtain();
            }
            this.f1560j0.addMovement(motionEvent);
        }
        if (this.f1553c0 || this.f1571v0) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        this.f1548U.layout(0, 0, i9 - i, i10 - i8);
    }

    public final void onMeasure(int i, int i8) {
        int defaultSize = View.getDefaultSize(0, i);
        int defaultSize2 = View.getDefaultSize(0, i8);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f1548U.measure(ViewGroup.getChildMeasureSpec(i, 0, defaultSize), ViewGroup.getChildMeasureSpec(i8, 0, defaultSize2));
    }

    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        if (i != i9) {
            b();
            scrollTo(e(this.f1549V), getScrollY());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1565o0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f1553c0 || i(motionEvent)) {
            if (this.f1560j0 == null) {
                this.f1560j0 = VelocityTracker.obtain();
            }
            this.f1560j0.addMovement(motionEvent);
            int i = action & 255;
            if (i == 0) {
                b();
                this.f1559i0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                float x8 = motionEvent.getX();
                this.f1556f0 = x8;
                this.f1557g0 = x8;
            } else if (i != 1) {
                if (i == 2) {
                    if (!this.f1553c0) {
                        c(motionEvent);
                        if (this.f1554d0) {
                            return false;
                        }
                    }
                    if (this.f1553c0) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1559i0);
                        if (findPointerIndex == -1) {
                            this.f1559i0 = -1;
                        }
                        if (this.f1559i0 != -1) {
                            float x9 = motionEvent.getX(findPointerIndex);
                            float f8 = this.f1557g0 - x9;
                            this.f1557g0 = x9;
                            float scrollX = ((float) getScrollX()) + f8;
                            float leftBound = (float) getLeftBound();
                            float rightBound = (float) getRightBound();
                            if (scrollX < leftBound) {
                                scrollX = leftBound;
                            } else if (scrollX > rightBound) {
                                scrollX = rightBound;
                            }
                            int i8 = (int) scrollX;
                            this.f1557g0 = (scrollX - ((float) i8)) + this.f1557g0;
                            scrollTo(i8, getScrollY());
                            int width = getWidth();
                            int i9 = i8 / width;
                            int i10 = i8 % width;
                        }
                    }
                } else if (i != 3) {
                    if (i == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1557g0 = motionEvent.getX(actionIndex);
                        this.f1559i0 = motionEvent.getPointerId(actionIndex);
                    } else if (i == 6) {
                        g(motionEvent);
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f1559i0);
                        if (findPointerIndex2 == -1) {
                            this.f1559i0 = -1;
                        }
                        if (this.f1559i0 != -1) {
                            this.f1557g0 = motionEvent.getX(findPointerIndex2);
                        }
                    }
                } else if (this.f1553c0) {
                    h(this.f1549V, 0, true, true);
                    this.f1559i0 = -1;
                    d();
                }
            } else if (this.f1553c0) {
                VelocityTracker velocityTracker = this.f1560j0;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1562l0);
                int i11 = this.f1559i0;
                Map map = C1546s.f15964a;
                int xVelocity = (int) velocityTracker.getXVelocity(i11);
                float scrollX2 = ((float) (getScrollX() - e(this.f1549V))) / ((float) getBehindWidth());
                int findPointerIndex3 = motionEvent.findPointerIndex(this.f1559i0);
                if (findPointerIndex3 == -1) {
                    this.f1559i0 = -1;
                }
                if (this.f1559i0 != -1) {
                    int x10 = (int) (motionEvent.getX(findPointerIndex3) - this.f1556f0);
                    int i12 = this.f1549V;
                    if (Math.abs(x10) <= this.f1563m0 || Math.abs(xVelocity) <= this.f1561k0) {
                        i12 = Math.round(((float) this.f1549V) + scrollX2);
                    } else if (xVelocity > 0 && x10 > 0) {
                        i12--;
                    } else if (xVelocity < 0 && x10 < 0) {
                        i12++;
                    }
                    h(i12, xVelocity, true, true);
                } else {
                    h(this.f1549V, xVelocity, true, true);
                }
                this.f1559i0 = -1;
                d();
            } else if (this.f1571v0 && this.f1564n0.b(this.f1548U, this.f1549V, motionEvent.getX() + this.f1572w0)) {
                setCurrentItem(1);
                d();
            }
            return true;
        }
        if ((action & 255) == 1 && this.f1571v0) {
            d();
        }
        return false;
    }

    public final void scrollTo(int i, int i8) {
        super.scrollTo(i, i8);
        this.f1572w0 = (float) i;
        this.f1564n0.c(this.f1548U, i, i8);
        getPercentOpen();
        ((SlidingMenu) getParent()).getClass();
    }

    public void setAboveOffset(int i) {
        View view = this.f1548U;
        view.setPadding(i, view.getPaddingTop(), this.f1548U.getPaddingRight(), this.f1548U.getPaddingBottom());
    }

    public void setContent(View view) {
        View view2 = this.f1548U;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1548U = view;
        addView(view);
    }

    public void setCurrentItem(int i) {
        h(i, 0, true, false);
    }

    public void setCustomViewBehind(c cVar) {
        this.f1564n0 = cVar;
    }

    public void setOnClosedListener(g gVar) {
        this.f1567r0 = gVar;
    }

    public void setOnOpenedListener(i iVar) {
        this.f1568s0 = iVar;
    }

    public void setOnPageChangeListener(a aVar) {
        this.p0 = aVar;
    }

    public void setSlidingEnabled(boolean z) {
        this.f1565o0 = z;
    }

    public void setTouchMode(int i) {
        this.f1570u0 = i;
    }
}
