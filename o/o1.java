package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import d4.k;
import g.C0940a;
import v0.C1510H;

public final class o1 implements C1278k0 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f14023a;

    /* renamed from: b  reason: collision with root package name */
    public int f14024b;

    /* renamed from: c  reason: collision with root package name */
    public final View f14025c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f14026d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f14027f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14028g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f14029h;
    public final CharSequence i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f14030j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f14031k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14032l;

    /* renamed from: m  reason: collision with root package name */
    public C1277k f14033m;

    /* renamed from: n  reason: collision with root package name */
    public final int f14034n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final Drawable f14035o;

    public o1(Toolbar toolbar, boolean z) {
        boolean z6;
        Drawable drawable;
        this.f14023a = toolbar;
        this.f14029h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        if (this.f14029h != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f14028g = z6;
        this.f14027f = toolbar.getNavigationIcon();
        String str = null;
        k K22 = k.K2(toolbar.getContext(), (AttributeSet) null, C0940a.f11814a, 2130968581);
        int i8 = 15;
        this.f14035o = K22.I(15);
        if (z) {
            TypedArray typedArray = (TypedArray) K22.f9767W;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f14028g = true;
                this.f14029h = text;
                if ((this.f14024b & 8) != 0) {
                    Toolbar toolbar2 = this.f14023a;
                    toolbar2.setTitle(text);
                    if (this.f14028g) {
                        C1510H.q(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.f14024b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable I8 = K22.I(20);
            if (I8 != null) {
                this.e = I8;
                c();
            }
            Drawable I9 = K22.I(17);
            if (I9 != null) {
                this.f14026d = I9;
                c();
            }
            if (this.f14027f == null && (drawable = this.f14035o) != null) {
                this.f14027f = drawable;
                int i9 = this.f14024b & 4;
                Toolbar toolbar3 = this.f14023a;
                if (i9 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, toolbar, false);
                View view = this.f14025c;
                if (!(view == null || (this.f14024b & 16) == 0)) {
                    toolbar.removeView(view);
                }
                this.f14025c = inflate;
                if (!(inflate == null || (this.f14024b & 16) == 0)) {
                    toolbar.addView(inflate);
                }
                a(this.f14024b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f7594q0.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f7587i0 = resourceId2;
                C1260b0 b0Var = toolbar.f7577V;
                if (b0Var != null) {
                    b0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f7588j0 = resourceId3;
                C1260b0 b0Var2 = toolbar.f7578W;
                if (b0Var2 != null) {
                    b0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f14035o = toolbar.getNavigationIcon();
            } else {
                i8 = 11;
            }
            this.f14024b = i8;
        }
        K22.M2();
        if (2131951617 != this.f14034n) {
            this.f14034n = 2131951617;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i10 = this.f14034n;
                this.f14030j = i10 != 0 ? toolbar.getContext().getString(i10) : str;
                b();
            }
        }
        this.f14030j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new n1(this));
    }

    public final void a(int i8) {
        View view;
        int i9 = this.f14024b ^ i8;
        this.f14024b = i8;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i8 & 4) != 0) {
                    b();
                }
                int i10 = this.f14024b & 4;
                Toolbar toolbar = this.f14023a;
                if (i10 != 0) {
                    Drawable drawable = this.f14027f;
                    if (drawable == null) {
                        drawable = this.f14035o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i9 & 3) != 0) {
                c();
            }
            int i11 = i9 & 8;
            Toolbar toolbar2 = this.f14023a;
            if (i11 != 0) {
                if ((i8 & 8) != 0) {
                    toolbar2.setTitle(this.f14029h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) != 0 && (view = this.f14025c) != null) {
                if ((i8 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f14024b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f14030j);
            Toolbar toolbar = this.f14023a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f14034n);
            } else {
                toolbar.setNavigationContentDescription(this.f14030j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i8 = this.f14024b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.f14026d;
            }
        } else {
            drawable = this.f14026d;
        }
        this.f14023a.setLogo(drawable);
    }
}
