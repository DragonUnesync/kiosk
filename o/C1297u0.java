package o;

import C0.e;
import O7.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import y0.C1618d;

/* renamed from: o.u0  reason: case insensitive filesystem */
public class C1297u0 extends ListView {

    /* renamed from: U  reason: collision with root package name */
    public final Rect f14085U = new Rect();

    /* renamed from: V  reason: collision with root package name */
    public int f14086V = 0;

    /* renamed from: W  reason: collision with root package name */
    public int f14087W = 0;

    /* renamed from: a0  reason: collision with root package name */
    public int f14088a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public int f14089b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public int f14090c0;

    /* renamed from: d0  reason: collision with root package name */
    public C1293s0 f14091d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f14092e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f14093f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f14094g0;

    /* renamed from: h0  reason: collision with root package name */
    public C1618d f14095h0;

    /* renamed from: i0  reason: collision with root package name */
    public e f14096i0;

    public C1297u0(Context context, boolean z) {
        super(context, (AttributeSet) null, 2130968981);
        this.f14093f0 = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i8) {
        int i9;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i11 = 0;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            if (i13 > 0) {
                i9 = View.MeasureSpec.makeMeasureSpec(i13, b.MAX_POW2);
            } else {
                i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i9);
            view.forceLayout();
            if (i12 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i8) {
                return i8;
            }
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = 1
            goto L_0x0146
        L_0x0015:
            r0 = 0
            goto L_0x0146
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            r5 = 1
            goto L_0x0146
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f14094g0 = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            o.C1288p0.a(r1, r7, r6)
            boolean r11 = r16.isPressed()
            if (r11 != 0) goto L_0x0052
            r1.setPressed(r4)
        L_0x0052:
            r16.layoutChildren()
            int r11 = r1.f14090c0
            if (r11 == r9) goto L_0x006f
            int r12 = r16.getFirstVisiblePosition()
            int r11 = r11 - r12
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L_0x006f
            if (r11 == r10) goto L_0x006f
            boolean r12 = r11.isPressed()
            if (r12 == 0) goto L_0x006f
            r11.setPressed(r5)
        L_0x006f:
            r1.f14090c0 = r8
            int r11 = r10.getLeft()
            float r11 = (float) r11
            float r11 = r7 - r11
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            o.C1288p0.a(r10, r11, r12)
            boolean r11 = r10.isPressed()
            if (r11 != 0) goto L_0x008b
            r10.setPressed(r4)
        L_0x008b:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0095
            if (r8 == r9) goto L_0x0095
            r12 = 1
            goto L_0x0096
        L_0x0095:
            r12 = 0
        L_0x0096:
            if (r12 == 0) goto L_0x009b
            r11.setVisible(r5, r5)
        L_0x009b:
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            android.graphics.Rect r9 = r1.f14085U
            r9.set(r13, r14, r15, r5)
            int r5 = r9.left
            int r13 = r1.f14086V
            int r5 = r5 - r13
            r9.left = r5
            int r5 = r9.top
            int r13 = r1.f14087W
            int r5 = r5 - r13
            r9.top = r5
            int r5 = r9.right
            int r13 = r1.f14088a0
            int r5 = r5 + r13
            r9.right = r5
            int r5 = r9.bottom
            int r13 = r1.f14089b0
            int r5 = r5 + r13
            r9.bottom = r5
            r5 = 33
            if (r0 < r5) goto L_0x00d5
            boolean r0 = o.C1291r0.a(r16)
            goto L_0x00e4
        L_0x00d5:
            java.lang.reflect.Field r0 = o.C1295t0.f14077a
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x010a
            r0 = r0 ^ r4
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r5) goto L_0x00f4
            o.C1291r0.b(r1, r0)
        L_0x00f2:
            r5 = -1
            goto L_0x0105
        L_0x00f4:
            java.lang.reflect.Field r5 = o.C1295t0.f14077a
            if (r5 == 0) goto L_0x00f2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x00f2
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00f2
        L_0x0105:
            if (r8 == r5) goto L_0x010a
            r16.refreshDrawableState()
        L_0x010a:
            if (r12 == 0) goto L_0x0125
            float r0 = r9.exactCenterX()
            float r5 = r9.exactCenterY()
            int r9 = r16.getVisibility()
            if (r9 != 0) goto L_0x011d
            r9 = 1
        L_0x011b:
            r12 = 0
            goto L_0x011f
        L_0x011d:
            r9 = 0
            goto L_0x011b
        L_0x011f:
            r11.setVisible(r9, r12)
            r11.setHotspot(r0, r5)
        L_0x0125:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0131
            r5 = -1
            if (r8 == r5) goto L_0x0131
            r0.setHotspot(r7, r6)
        L_0x0131:
            o.s0 r0 = r1.f14091d0
            if (r0 == 0) goto L_0x0138
            r5 = 0
            r0.f14069V = r5
        L_0x0138:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0144
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0144:
            r0 = 1
            r5 = 0
        L_0x0146:
            if (r0 == 0) goto L_0x014a
            if (r5 == 0) goto L_0x0163
        L_0x014a:
            r3 = 0
            r1.f14094g0 = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.f14090c0
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0163
            r5.setPressed(r3)
        L_0x0163:
            if (r0 == 0) goto L_0x017a
            y0.d r3 = r1.f14095h0
            if (r3 != 0) goto L_0x0170
            y0.d r3 = new y0.d
            r3.<init>(r1)
            r1.f14095h0 = r3
        L_0x0170:
            y0.d r3 = r1.f14095h0
            boolean r5 = r3.f16356j0
            r3.f16356j0 = r4
            r3.onTouch(r1, r2)
            goto L_0x0188
        L_0x017a:
            y0.d r2 = r1.f14095h0
            if (r2 == 0) goto L_0x0188
            boolean r3 = r2.f16356j0
            if (r3 == 0) goto L_0x0185
            r2.d()
        L_0x0185:
            r3 = 0
            r2.f16356j0 = r3
        L_0x0188:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1297u0.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f14085U;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f14096i0 == null) {
            super.drawableStateChanged();
            C1293s0 s0Var = this.f14091d0;
            if (s0Var != null) {
                s0Var.f14069V = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f14094g0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.f14093f0 || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.f14093f0 || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.f14093f0 || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.f14093f0 || !this.f14092e0) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public final void onDetachedFromWindow() {
        this.f14096i0 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14096i0 == null) {
            e eVar = new e(23, this);
            this.f14096i0 = eVar;
            post(eVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C1290q0.f14046d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            C1290q0.f14043a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            C1290q0.f14044b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            C1290q0.f14045c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e8) {
                            e8.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f14094g0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14090c0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        e eVar = this.f14096i0;
        if (eVar != null) {
            C1297u0 u0Var = (C1297u0) eVar.f509V;
            u0Var.f14096i0 = null;
            u0Var.removeCallbacks(eVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f14092e0 = z;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, o.s0] */
    public void setSelector(Drawable drawable) {
        C1293s0 s0Var = null;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f14068U;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            drawable2.f14068U = drawable;
            drawable.setCallback(drawable2);
            drawable2.f14069V = true;
            s0Var = drawable2;
        }
        this.f14091d0 = s0Var;
        super.setSelector(s0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f14086V = rect.left;
        this.f14087W = rect.top;
        this.f14088a0 = rect.right;
        this.f14089b0 = rect.bottom;
    }
}
