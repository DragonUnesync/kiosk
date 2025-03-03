package androidx.appcompat.widget;

import B.C0003d;
import O7.b;
import Y1.K;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g.C0940a;
import m.C1182a;
import n.C1220A;
import n.m;
import o.C1257a;
import o.C1269g;
import o.C1277k;
import o.w1;
import v0.C1510H;
import v0.C1514L;

public class ActionBarContextView extends ViewGroup {

    /* renamed from: U  reason: collision with root package name */
    public final C1257a f7396U = new C1257a(this);

    /* renamed from: V  reason: collision with root package name */
    public final Context f7397V;

    /* renamed from: W  reason: collision with root package name */
    public ActionMenuView f7398W;

    /* renamed from: a0  reason: collision with root package name */
    public C1277k f7399a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f7400b0;

    /* renamed from: c0  reason: collision with root package name */
    public C1514L f7401c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f7402d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7403e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f7404f0;

    /* renamed from: g0  reason: collision with root package name */
    public CharSequence f7405g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f7406h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f7407i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f7408j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout f7409k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f7410l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f7411m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f7412n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f7413o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f7414q0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968604);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968578, typedValue, true) || typedValue.resourceId == 0) {
            this.f7397V = context;
        } else {
            this.f7397V = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11817d, 2130968604, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = C0003d.r(context, resourceId);
        }
        setBackground(drawable);
        this.f7412n0 = obtainStyledAttributes.getResourceId(5, 0);
        this.f7413o0 = obtainStyledAttributes.getResourceId(4, 0);
        this.f7400b0 = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f7414q0 = obtainStyledAttributes.getResourceId(2, 2131558405);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i8);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i8, int i9, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z) {
            view.layout(i - measuredWidth, i10, i, measuredHeight + i10);
        } else {
            view.layout(i, i10, i + measuredWidth, measuredHeight + i10);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(C1182a aVar) {
        View view = this.f7406h0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f7414q0, this, false);
            this.f7406h0 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f7406h0);
        }
        View findViewById = this.f7406h0.findViewById(2131361862);
        this.f7407i0 = findViewById;
        findViewById.setOnClickListener(new K(3, aVar));
        m c8 = aVar.c();
        C1277k kVar = this.f7399a0;
        if (kVar != null) {
            kVar.c();
            C1269g gVar = kVar.f13997n0;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
        C1277k kVar2 = new C1277k(getContext());
        this.f7399a0 = kVar2;
        kVar2.f13989f0 = true;
        kVar2.f13990g0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c8.b(this.f7399a0, this.f7397V);
        C1277k kVar3 = this.f7399a0;
        C1220A a8 = kVar3.f13985b0;
        if (a8 == null) {
            C1220A a9 = (C1220A) kVar3.f13981X.inflate(kVar3.f13983Z, this, false);
            kVar3.f13985b0 = a9;
            a9.c(kVar3.f13980W);
            kVar3.d();
        }
        C1220A a10 = kVar3.f13985b0;
        if (a8 != a10) {
            ((ActionMenuView) a10).setPresenter(kVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a10;
        this.f7398W = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.f7398W, layoutParams);
    }

    public final void d() {
        int i;
        if (this.f7409k0 == null) {
            LayoutInflater.from(getContext()).inflate(2131558400, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f7409k0 = linearLayout;
            this.f7410l0 = (TextView) linearLayout.findViewById(2131361853);
            this.f7411m0 = (TextView) this.f7409k0.findViewById(2131361852);
            int i8 = this.f7412n0;
            if (i8 != 0) {
                this.f7410l0.setTextAppearance(getContext(), i8);
            }
            int i9 = this.f7413o0;
            if (i9 != 0) {
                this.f7411m0.setTextAppearance(getContext(), i9);
            }
        }
        this.f7410l0.setText(this.f7404f0);
        this.f7411m0.setText(this.f7405g0);
        boolean isEmpty = TextUtils.isEmpty(this.f7404f0);
        boolean isEmpty2 = TextUtils.isEmpty(this.f7405g0);
        TextView textView = this.f7411m0;
        int i10 = 8;
        if (!isEmpty2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f7409k0;
        if (!isEmpty || !isEmpty2) {
            i10 = 0;
        }
        linearLayout2.setVisibility(i10);
        if (this.f7409k0.getParent() == null) {
            addView(this.f7409k0);
        }
    }

    public final void e() {
        removeAllViews();
        this.f7408j0 = null;
        this.f7398W = null;
        this.f7399a0 = null;
        View view = this.f7407i0;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f7401c0 != null) {
            return this.f7396U.f13910b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f7400b0;
    }

    public CharSequence getSubtitle() {
        return this.f7405g0;
    }

    public CharSequence getTitle() {
        return this.f7404f0;
    }

    /* renamed from: h */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C1514L l8 = this.f7401c0;
            if (l8 != null) {
                l8.b();
            }
            super.setVisibility(i);
        }
    }

    public final C1514L i(int i, long j7) {
        C1514L l8 = this.f7401c0;
        if (l8 != null) {
            l8.b();
        }
        C1257a aVar = this.f7396U;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1514L a8 = C1510H.a(this);
            a8.a(1.0f);
            a8.c(j7);
            aVar.f13911c.f7401c0 = a8;
            aVar.f13910b = i;
            a8.d(aVar);
            return a8;
        }
        C1514L a9 = C1510H.a(this);
        a9.a(0.0f);
        a9.c(j7);
        aVar.f13911c.f7401c0 = a9;
        aVar.f13910b = i;
        a9.d(aVar);
        return a9;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0940a.f11814a, 2130968581, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1277k kVar = this.f7399a0;
        if (kVar != null) {
            Configuration configuration2 = kVar.f13979V.getResources().getConfiguration();
            int i8 = configuration2.screenWidthDp;
            int i9 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
                i = 5;
            } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
                i = 4;
            } else if (i8 >= 360) {
                i = 3;
            } else {
                i = 2;
            }
            kVar.f13993j0 = i;
            m mVar = kVar.f13980W;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1277k kVar = this.f7399a0;
        if (kVar != null) {
            kVar.c();
            C1269g gVar = this.f7399a0.f13997n0;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7403e0 = false;
        }
        if (!this.f7403e0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f7403e0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7403e0 = false;
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        boolean z6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8 = w1.f14104a;
        if (getLayoutDirection() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            i11 = (i9 - i) - getPaddingRight();
        } else {
            i11 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f7406h0;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7406h0.getLayoutParams();
            if (z6) {
                i13 = marginLayoutParams.rightMargin;
            } else {
                i13 = marginLayoutParams.leftMargin;
            }
            if (z6) {
                i14 = marginLayoutParams.leftMargin;
            } else {
                i14 = marginLayoutParams.rightMargin;
            }
            if (z6) {
                i15 = i11 - i13;
            } else {
                i15 = i11 + i13;
            }
            int g8 = g(this.f7406h0, i15, paddingTop, paddingTop2, z6) + i15;
            if (z6) {
                i16 = g8 - i14;
            } else {
                i16 = g8 + i14;
            }
            i11 = i16;
        }
        LinearLayout linearLayout = this.f7409k0;
        if (!(linearLayout == null || this.f7408j0 != null || linearLayout.getVisibility() == 8)) {
            i11 += g(this.f7409k0, i11, paddingTop, paddingTop2, z6);
        }
        View view2 = this.f7408j0;
        if (view2 != null) {
            g(view2, i11, paddingTop, paddingTop2, z6);
        }
        if (z6) {
            i12 = getPaddingLeft();
        } else {
            i12 = (i9 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f7398W;
        if (actionMenuView != null) {
            g(actionMenuView, i12, paddingTop, paddingTop2, !z6);
        }
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        boolean z;
        int i10;
        int mode = View.MeasureSpec.getMode(i);
        int i11 = b.MAX_POW2;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i8) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i12 = this.f7400b0;
            if (i12 <= 0) {
                i12 = View.MeasureSpec.getSize(i8);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i13 = i12 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, RecyclerView.UNDEFINED_DURATION);
            View view = this.f7406h0;
            if (view != null) {
                int f8 = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7406h0.getLayoutParams();
                paddingLeft = f8 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f7398W;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.f7398W, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f7409k0;
            if (linearLayout != null && this.f7408j0 == null) {
                if (this.p0) {
                    this.f7409k0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f7409k0.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f7409k0;
                    if (z) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    linearLayout2.setVisibility(i10);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f7408j0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i14 = layoutParams.width;
                if (i14 != -2) {
                    i9 = b.MAX_POW2;
                } else {
                    i9 = RecyclerView.UNDEFINED_DURATION;
                }
                if (i14 >= 0) {
                    paddingLeft = Math.min(i14, paddingLeft);
                }
                int i15 = layoutParams.height;
                if (i15 == -2) {
                    i11 = RecyclerView.UNDEFINED_DURATION;
                }
                if (i15 >= 0) {
                    i13 = Math.min(i15, i13);
                }
                this.f7408j0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i13, i11));
            }
            if (this.f7400b0 <= 0) {
                int childCount = getChildCount();
                int i16 = 0;
                for (int i17 = 0; i17 < childCount; i17++) {
                    int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i16) {
                        i16 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i16);
                return;
            }
            setMeasuredDimension(size, i12);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7402d0 = false;
        }
        if (!this.f7402d0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f7402d0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7402d0 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f7400b0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f7408j0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f7408j0 = view;
        if (!(view == null || (linearLayout = this.f7409k0) == null)) {
            removeView(linearLayout);
            this.f7409k0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f7405g0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f7404f0 = charSequence;
        d();
        C1510H.q(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.p0) {
            requestLayout();
        }
        this.p0 = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
