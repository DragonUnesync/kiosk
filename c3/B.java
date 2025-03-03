package C3;

import N7.a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.k;
import java.util.WeakHashMap;
import o.C1260b0;
import v0.C1510H;
import x3.c;
import x3.d;

public final class B extends LinearLayout {

    /* renamed from: U  reason: collision with root package name */
    public final TextInputLayout f556U;

    /* renamed from: V  reason: collision with root package name */
    public final C1260b0 f557V;

    /* renamed from: W  reason: collision with root package name */
    public CharSequence f558W;

    /* renamed from: a0  reason: collision with root package name */
    public final CheckableImageButton f559a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f560b0;

    /* renamed from: c0  reason: collision with root package name */
    public PorterDuff.Mode f561c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f562d0;

    /* renamed from: e0  reason: collision with root package name */
    public ImageView.ScaleType f563e0;

    /* renamed from: f0  reason: collision with root package name */
    public View.OnLongClickListener f564f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f565g0;

    public B(TextInputLayout textInputLayout, k kVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f556U = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131558457, this, false);
        this.f559a0 = checkableImageButton;
        if (Build.VERSION.SDK_INT <= 22) {
            int[] iArr = d.f16269a;
            checkableImageButton.setBackground(c.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, (float) 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        CharSequence charSequence = null;
        C1260b0 b0Var = new C1260b0(getContext(), (AttributeSet) null);
        this.f557V = b0Var;
        if (com.bumptech.glide.c.r(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f564f0;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
        this.f564f0 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        com.bumptech.glide.d.s(checkableImageButton, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) kVar.f9767W;
        if (typedArray.hasValue(69)) {
            this.f560b0 = com.bumptech.glide.c.l(getContext(), kVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f561c0 = t3.k.g(typedArray.getInt(70, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(66)) {
            b(kVar.I(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(2131165932));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f562d0) {
                this.f562d0 = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType d8 = com.bumptech.glide.d.d(typedArray.getInt(68, -1));
                this.f563e0 = d8;
                checkableImageButton.setScaleType(d8);
            }
            b0Var.setVisibility(8);
            b0Var.setId(2131362572);
            b0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = C1510H.f15874a;
            b0Var.setAccessibilityLiveRegion(1);
            a.v(b0Var, typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                b0Var.setTextColor(kVar.v(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f558W = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            b0Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(b0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f559a0;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        return this.f557V.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f559a0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f560b0;
            PorterDuff.Mode mode = this.f561c0;
            TextInputLayout textInputLayout = this.f556U;
            com.bumptech.glide.d.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            com.bumptech.glide.d.q(textInputLayout, checkableImageButton, this.f560b0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f564f0;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        com.bumptech.glide.d.s(checkableImageButton, onLongClickListener);
        this.f564f0 = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        com.bumptech.glide.d.s(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z) {
        boolean z6;
        CheckableImageButton checkableImageButton = this.f559a0;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        int i;
        EditText editText = this.f556U.f9425a0;
        if (editText != null) {
            if (this.f559a0.getVisibility() == 0) {
                i = 0;
            } else {
                WeakHashMap weakHashMap = C1510H.f15874a;
                i = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165802);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = C1510H.f15874a;
            this.f557V.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i;
        int i8 = 8;
        if (this.f558W == null || this.f565g0) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f559a0.getVisibility() == 0 || i == 0) {
            i8 = 0;
        }
        setVisibility(i8);
        this.f557V.setVisibility(i);
        this.f556U.q();
    }

    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        d();
    }
}
