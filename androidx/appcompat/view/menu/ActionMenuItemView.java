package androidx.appcompat.view.menu;

import O7.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.bumptech.glide.c;
import g.C0940a;
import n.C1226b;
import n.C1227c;
import n.l;
import n.m;
import n.o;
import n.z;
import o.C1260b0;
import o.C1279l;

public class ActionMenuItemView extends C1260b0 implements z, View.OnClickListener, C1279l {

    /* renamed from: e0  reason: collision with root package name */
    public o f7357e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f7358f0;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f7359g0;

    /* renamed from: h0  reason: collision with root package name */
    public l f7360h0;

    /* renamed from: i0  reason: collision with root package name */
    public C1226b f7361i0;

    /* renamed from: j0  reason: collision with root package name */
    public C1227c f7362j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7363k0 = h();

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7364l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f7365m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f7366n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f7367o0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11816c, 0, 0);
        this.f7365m0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f7367o0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f7366n0 = -1;
        setSaveEnabled(false);
    }

    public final void a(o oVar) {
        int i;
        this.f7357e0 = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f13504U);
        if (oVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f7361i0 == null) {
            this.f7361i0 = new C1226b(this);
        }
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean c() {
        if (TextUtils.isEmpty(getText()) || this.f7357e0.getIcon() != null) {
            return false;
        }
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public o getItemData() {
        return this.f7357e0;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i8 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    public final void i() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z6 = !TextUtils.isEmpty(this.f7358f0);
        if (this.f7359g0 != null && ((this.f7357e0.f13527s0 & 4) != 4 || (!this.f7363k0 && !this.f7364l0))) {
            z = false;
        }
        boolean z8 = z6 & z;
        CharSequence charSequence3 = null;
        if (z8) {
            charSequence = this.f7358f0;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f7357e0.f13520k0;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z8) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f7357e0.f13508Y;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f7357e0.f13521l0;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z8) {
                charSequence3 = this.f7357e0.f13508Y;
            }
            c.w(this, charSequence3);
            return;
        }
        c.w(this, charSequence5);
    }

    public final void onClick(View view) {
        l lVar = this.f7360h0;
        if (lVar != null) {
            lVar.d(this.f7357e0);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7363k0 = h();
        i();
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i10 = this.f7366n0) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i8);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f7365m0;
        if (mode == Integer.MIN_VALUE) {
            i9 = Math.min(size, i11);
        } else {
            i9 = i11;
        }
        if (mode != 1073741824 && i11 > 0 && measuredWidth < i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, b.MAX_POW2), i8);
        }
        if (isEmpty && this.f7359g0 != null) {
            super.setPadding((getMeasuredWidth() - this.f7359g0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1226b bVar;
        if (!this.f7357e0.hasSubMenu() || (bVar = this.f7361i0) == null || !bVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f7364l0 != z) {
            this.f7364l0 = z;
            o oVar = this.f7357e0;
            if (oVar != null) {
                m mVar = oVar.f13517h0;
                mVar.f13488e0 = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7359g0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f7367o0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        i();
    }

    public void setItemInvoker(l lVar) {
        this.f7360h0 = lVar;
    }

    public final void setPadding(int i, int i8, int i9, int i10) {
        this.f7366n0 = i;
        super.setPadding(i, i8, i9, i10);
    }

    public void setPopupCallback(C1227c cVar) {
        this.f7362j0 = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7358f0 = charSequence;
        i();
    }
}
