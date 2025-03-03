package C3;

import E3.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.bumptech.glide.c;
import com.google.android.material.textfield.TextInputLayout;
import f3.C0899a;
import java.util.List;
import java.util.Locale;
import o.C1285o;
import o.G0;
import t3.k;
import z3.g;

public final class z extends C1285o {

    /* renamed from: b0  reason: collision with root package name */
    public final G0 f679b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AccessibilityManager f680c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Rect f681d0 = new Rect();

    /* renamed from: e0  reason: collision with root package name */
    public final int f682e0;

    /* renamed from: f0  reason: collision with root package name */
    public final float f683f0;

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f684g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f685h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f686i0;

    public z(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130968641, 0), attributeSet);
        Context context2 = getContext();
        TypedArray f8 = k.f(context2, attributeSet, C0899a.i, 2130968641, 2132017965, new int[0]);
        if (f8.hasValue(0) && f8.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f682e0 = f8.getResourceId(3, 2131558533);
        this.f683f0 = (float) f8.getDimensionPixelOffset(1, 2131165901);
        if (f8.hasValue(2)) {
            this.f684g0 = ColorStateList.valueOf(f8.getColor(2, 0));
        }
        this.f685h0 = f8.getColor(4, 0);
        this.f686i0 = c.j(context2, f8, 5);
        this.f680c0 = (AccessibilityManager) context2.getSystemService("accessibility");
        G0 g02 = new G0(context2, (AttributeSet) null, 2130969295);
        this.f679b0 = g02;
        g02.f13840s0 = true;
        g02.f13841t0.setFocusable(true);
        g02.f13831i0 = this;
        g02.f13841t0.setInputMethodMode(2);
        g02.o(getAdapter());
        g02.f13832j0 = new x(0, this);
        if (f8.hasValue(6)) {
            setSimpleItems(f8.getResourceId(6, 0));
        }
        f8.recycle();
    }

    public static void a(z zVar, Object obj) {
        zVar.setText(zVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f680c0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null)) {
                for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                    if (next.getSettingsActivityName() == null || !next.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void dismissDropDown() {
        if (c()) {
            this.f679b0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f684g0;
    }

    public CharSequence getHint() {
        TextInputLayout b8 = b();
        if (b8 == null || !b8.f9397B0) {
            return super.getHint();
        }
        return b8.getHint();
    }

    public float getPopupElevation() {
        return this.f683f0;
    }

    public int getSimpleItemSelectedColor() {
        return this.f685h0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f686i0;
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b8 = b();
        if (b8 != null && b8.f9397B0 && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f679b0.dismiss();
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        super.onMeasure(i, i8);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b8 = b();
            int i10 = 0;
            if (!(adapter == null || b8 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                G0 g02 = this.f679b0;
                if (!g02.f13841t0.isShowing()) {
                    i9 = -1;
                } else {
                    i9 = g02.f13819W.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i9) + 15);
                View view = null;
                int i11 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i10) {
                        view = null;
                        i10 = itemViewType;
                    }
                    view = adapter.getView(max, view, b8);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i11 = Math.max(i11, view.getMeasuredWidth());
                }
                Drawable background = g02.f13841t0.getBackground();
                if (background != null) {
                    Rect rect = this.f681d0;
                    background.getPadding(rect);
                    i11 += rect.left + rect.right;
                }
                i10 = b8.getEndIconView().getMeasuredWidth() + i11;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i10), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (!c()) {
            super.onWindowFocusChanged(z);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f679b0.o(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        G0 g02 = this.f679b0;
        if (g02 != null) {
            g02.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f684g0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).j(this.f684g0);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f679b0.f13833k0 = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b8 = b();
        if (b8 != null) {
            b8.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f685h0 = i;
        if (getAdapter() instanceof y) {
            ((y) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f686i0 = colorStateList;
        if (getAdapter() instanceof y) {
            ((y) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final void showDropDown() {
        if (c()) {
            this.f679b0.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new y(this, getContext(), this.f682e0, strArr));
    }
}
