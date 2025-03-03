package o;

import B.C0003d;
import Q0.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import de.ozerov.fully.C0714i3;
import n.C1228d;

public final class P extends Spinner {

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f13872f0 = {16843505};

    /* renamed from: U  reason: collision with root package name */
    public final t f13873U;

    /* renamed from: V  reason: collision with root package name */
    public final Context f13874V;

    /* renamed from: W  reason: collision with root package name */
    public final C1254G f13875W;

    /* renamed from: a0  reason: collision with root package name */
    public SpinnerAdapter f13876a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f13877b0;

    /* renamed from: c0  reason: collision with root package name */
    public final O f13878c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f13879d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f13880e0 = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r7 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public P(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969607(0x7f040407, float:1.75479E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f13880e0 = r1
            android.content.Context r1 = r12.getContext()
            o.d1.a(r12, r1)
            int[] r1 = g.C0940a.f11833v
            d4.k r2 = d4.k.K2(r13, r14, r1, r0)
            Q0.t r3 = new Q0.t
            r3.<init>((android.view.View) r12)
            r12.f13873U = r3
            java.lang.Object r3 = r2.f9767W
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L_0x0035
            m.c r6 = new m.c
            r6.<init>(r13, r4)
            r12.f13874V = r6
            goto L_0x0037
        L_0x0035:
            r12.f13874V = r13
        L_0x0037:
            r4 = -1
            r6 = 0
            int[] r7 = f13872f0     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            boolean r8 = r7.hasValue(r5)     // Catch:{ Exception -> 0x004e }
            if (r8 == 0) goto L_0x0050
            int r4 = r7.getInt(r5, r5)     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x004a:
            r13 = move-exception
            r6 = r7
            goto L_0x00d5
        L_0x004e:
            r8 = move-exception
            goto L_0x0059
        L_0x0050:
            r7.recycle()
            goto L_0x0063
        L_0x0054:
            r13 = move-exception
            goto L_0x00d5
        L_0x0057:
            r8 = move-exception
            r7 = r6
        L_0x0059:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x0063
            goto L_0x0050
        L_0x0063:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x009d
            if (r4 == r8) goto L_0x006a
            goto L_0x00aa
        L_0x006a:
            o.L r4 = new o.L
            android.content.Context r9 = r12.f13874V
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f13874V
            d4.k r1 = d4.k.K2(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f9767W
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f13879d0 = r9
            android.graphics.drawable.Drawable r9 = r1.I(r8)
            r4.g(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f13856x0 = r7
            r1.M2()
            r12.f13878c0 = r4
            o.G r1 = new o.G
            r1.<init>(r12, r12, r4)
            r12.f13875W = r1
            goto L_0x00aa
        L_0x009d:
            o.I r1 = new o.I
            r1.<init>(r12)
            r12.f13878c0 = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f13844W = r4
        L_0x00aa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto L_0x00c1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131558594(0x7f0d00c2, float:1.8742508E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00c1:
            r2.M2()
            r12.f13877b0 = r8
            android.widget.SpinnerAdapter r13 = r12.f13876a0
            if (r13 == 0) goto L_0x00cf
            r12.setAdapter((android.widget.SpinnerAdapter) r13)
            r12.f13876a0 = r6
        L_0x00cf:
            Q0.t r13 = r12.f13873U
            r13.g(r14, r0)
            return
        L_0x00d5:
            if (r6 == 0) goto L_0x00da
            r6.recycle()
        L_0x00da:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.P.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i8 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = Math.max(i8, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i8;
        }
        Rect rect = this.f13880e0;
        drawable.getPadding(rect);
        return i8 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f13873U;
        if (tVar != null) {
            tVar.c();
        }
    }

    public int getDropDownHorizontalOffset() {
        O o2 = this.f13878c0;
        if (o2 != null) {
            return o2.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        O o2 = this.f13878c0;
        if (o2 != null) {
            return o2.m();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f13878c0 != null) {
            return this.f13879d0;
        }
        return super.getDropDownWidth();
    }

    public final O getInternalPopup() {
        return this.f13878c0;
    }

    public Drawable getPopupBackground() {
        O o2 = this.f13878c0;
        if (o2 != null) {
            return o2.d();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f13874V;
    }

    public CharSequence getPrompt() {
        O o2 = this.f13878c0;
        if (o2 != null) {
            return o2.n();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f13873U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f13873U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O o2 = this.f13878c0;
        if (o2 != null && o2.b()) {
            o2.dismiss();
        }
    }

    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        if (this.f13878c0 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        N n4 = (N) parcelable;
        super.onRestoreInstanceState(n4.getSuperState());
        if (n4.f13862U && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C1228d(2, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, o.N] */
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        O o2 = this.f13878c0;
        if (o2 == null || !o2.b()) {
            z = false;
        } else {
            z = true;
        }
        baseSavedState.f13862U = z;
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1254G g8 = this.f13875W;
        if (g8 == null || !g8.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        O o2 = this.f13878c0;
        if (o2 == null) {
            return super.performClick();
        }
        if (o2.b()) {
            return true;
        }
        this.f13878c0.k(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f13873U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f13873U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        O o2 = this.f13878c0;
        if (o2 != null) {
            o2.i(i);
            o2.j(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        O o2 = this.f13878c0;
        if (o2 != null) {
            o2.h(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f13878c0 != null) {
            this.f13879d0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        O o2 = this.f13878c0;
        if (o2 != null) {
            o2.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0003d.r(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        O o2 = this.f13878c0;
        if (o2 != null) {
            o2.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f13873U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f13873U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ListAdapter, java.lang.Object, o.J] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f13877b0) {
            this.f13876a0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        O o2 = this.f13878c0;
        if (o2 != null) {
            Context context = this.f13874V;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.f13846U = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f13847V = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && C0714i3.q(spinnerAdapter)) {
                C1255H.a(C0714i3.g(spinnerAdapter), theme);
            }
            o2.o(obj);
        }
    }
}
