package o;

import B.C0003d;
import F.h;
import O7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import d3.e;
import g.C0940a;
import java.lang.reflect.Method;
import n.C1222C;

public class G0 implements C1222C {

    /* renamed from: u0  reason: collision with root package name */
    public static final Method f13814u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final Method f13815v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final Method f13816w0;

    /* renamed from: U  reason: collision with root package name */
    public final Context f13817U;

    /* renamed from: V  reason: collision with root package name */
    public ListAdapter f13818V;

    /* renamed from: W  reason: collision with root package name */
    public C1297u0 f13819W;

    /* renamed from: X  reason: collision with root package name */
    public final int f13820X = -2;

    /* renamed from: Y  reason: collision with root package name */
    public int f13821Y = -2;

    /* renamed from: Z  reason: collision with root package name */
    public int f13822Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f13823a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f13824b0 = 1002;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f13825c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f13826d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f13827e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f13828f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f13829g0 = Integer.MAX_VALUE;

    /* renamed from: h0  reason: collision with root package name */
    public D0 f13830h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f13831i0;

    /* renamed from: j0  reason: collision with root package name */
    public AdapterView.OnItemClickListener f13832j0;

    /* renamed from: k0  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f13833k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C0 f13834l0 = new C0(this, 1);

    /* renamed from: m0  reason: collision with root package name */
    public final F0 f13835m0 = new F0(this);

    /* renamed from: n0  reason: collision with root package name */
    public final E0 f13836n0 = new E0(this);

    /* renamed from: o0  reason: collision with root package name */
    public final C0 f13837o0 = new C0(this, 0);
    public final Handler p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f13838q0 = new Rect();

    /* renamed from: r0  reason: collision with root package name */
    public Rect f13839r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f13840s0;

    /* renamed from: t0  reason: collision with root package name */
    public final C1306z f13841t0;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f13814u0 = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f13816w0 = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f13815v0 = cls.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.widget.PopupWindow, o.z] */
    public G0(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        this.f13817U = context;
        this.p0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11826o, i, 0);
        this.f13822Z = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f13823a0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13825c0 = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0940a.f11830s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            h.C(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(0);
        } else {
            drawable = C0003d.r(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f13841t0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final int a() {
        return this.f13822Z;
    }

    public final boolean b() {
        return this.f13841t0.isShowing();
    }

    public final void c() {
        int i;
        boolean z;
        int i8;
        int i9;
        boolean z6;
        C1297u0 u0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        C1297u0 u0Var2 = this.f13819W;
        C1306z zVar = this.f13841t0;
        Context context = this.f13817U;
        if (u0Var2 == null) {
            C1297u0 p3 = p(context, !this.f13840s0);
            this.f13819W = p3;
            p3.setAdapter(this.f13818V);
            this.f13819W.setOnItemClickListener(this.f13832j0);
            this.f13819W.setFocusable(true);
            this.f13819W.setFocusableInTouchMode(true);
            this.f13819W.setOnItemSelectedListener(new e(2, this));
            this.f13819W.setOnScrollListener(this.f13836n0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f13833k0;
            if (onItemSelectedListener != null) {
                this.f13819W.setOnItemSelectedListener(onItemSelectedListener);
            }
            zVar.setContentView(this.f13819W);
        } else {
            ViewGroup viewGroup = (ViewGroup) zVar.getContentView();
        }
        Drawable background = zVar.getBackground();
        Rect rect = this.f13838q0;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i = rect.bottom + i16;
            if (!this.f13825c0) {
                this.f13823a0 = -i16;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (zVar.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f13831i0;
        int i17 = this.f13823a0;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f13815v0;
            if (method != null) {
                try {
                    i8 = ((Integer) method.invoke(zVar, new Object[]{view, Integer.valueOf(i17), Boolean.valueOf(z)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i8 = zVar.getMaxAvailableHeight(view, i17);
        } else {
            i8 = A0.a(zVar, view, i17, z);
        }
        int i18 = this.f13820X;
        if (i18 == -1) {
            i9 = i8 + i;
        } else {
            int i19 = this.f13821Y;
            if (i19 == -2) {
                i13 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), RecyclerView.UNDEFINED_DURATION);
            } else if (i19 != -1) {
                i13 = View.MeasureSpec.makeMeasureSpec(i19, b.MAX_POW2);
            } else {
                i13 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), b.MAX_POW2);
            }
            int a8 = this.f13819W.a(i13, i8);
            if (a8 > 0) {
                i14 = this.f13819W.getPaddingBottom() + this.f13819W.getPaddingTop() + i;
            } else {
                i14 = 0;
            }
            i9 = a8 + i14;
        }
        if (this.f13841t0.getInputMethodMode() == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        h.D(zVar, this.f13824b0);
        if (!zVar.isShowing()) {
            int i20 = this.f13821Y;
            if (i20 == -1) {
                i20 = -1;
            } else if (i20 == -2) {
                i20 = this.f13831i0.getWidth();
            }
            if (i18 == -1) {
                i18 = -1;
            } else if (i18 == -2) {
                i18 = i9;
            }
            zVar.setWidth(i20);
            zVar.setHeight(i18);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = f13814u0;
                if (method2 != null) {
                    try {
                        method2.invoke(zVar, new Object[]{Boolean.TRUE});
                    } catch (Exception unused2) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                B0.b(zVar, true);
            }
            zVar.setOutsideTouchable(true);
            zVar.setTouchInterceptor(this.f13835m0);
            if (this.f13827e0) {
                h.C(zVar, this.f13826d0);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = f13816w0;
                if (method3 != null) {
                    try {
                        method3.invoke(zVar, new Object[]{this.f13839r0});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                B0.a(zVar, this.f13839r0);
            }
            zVar.showAsDropDown(this.f13831i0, this.f13822Z, this.f13823a0, this.f13828f0);
            this.f13819W.setSelection(-1);
            if ((!this.f13840s0 || this.f13819W.isInTouchMode()) && (u0Var = this.f13819W) != null) {
                u0Var.setListSelectionHidden(true);
                u0Var.requestLayout();
            }
            if (!this.f13840s0) {
                this.p0.post(this.f13837o0);
            }
        } else if (this.f13831i0.isAttachedToWindow()) {
            int i21 = this.f13821Y;
            if (i21 == -1) {
                i21 = -1;
            } else if (i21 == -2) {
                i21 = this.f13831i0.getWidth();
            }
            if (i18 == -1) {
                if (z6) {
                    i18 = i9;
                } else {
                    i18 = -1;
                }
                if (z6) {
                    if (this.f13821Y == -1) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                    zVar.setWidth(i12);
                    zVar.setHeight(0);
                } else {
                    if (this.f13821Y == -1) {
                        i15 = -1;
                    }
                    zVar.setWidth(i15);
                    zVar.setHeight(-1);
                }
            } else if (i18 == -2) {
                i18 = i9;
            }
            zVar.setOutsideTouchable(true);
            View view2 = this.f13831i0;
            int i22 = this.f13822Z;
            int i23 = this.f13823a0;
            if (i21 < 0) {
                i10 = -1;
            } else {
                i10 = i21;
            }
            if (i18 < 0) {
                i11 = -1;
            } else {
                i11 = i18;
            }
            zVar.update(view2, i22, i23, i10, i11);
        }
    }

    public final Drawable d() {
        return this.f13841t0.getBackground();
    }

    public final void dismiss() {
        C1306z zVar = this.f13841t0;
        zVar.dismiss();
        zVar.setContentView((View) null);
        this.f13819W = null;
        this.p0.removeCallbacks(this.f13834l0);
    }

    public final C1297u0 e() {
        return this.f13819W;
    }

    public final void g(Drawable drawable) {
        this.f13841t0.setBackgroundDrawable(drawable);
    }

    public final void h(int i) {
        this.f13823a0 = i;
        this.f13825c0 = true;
    }

    public final void j(int i) {
        this.f13822Z = i;
    }

    public final int m() {
        if (!this.f13825c0) {
            return 0;
        }
        return this.f13823a0;
    }

    public void o(ListAdapter listAdapter) {
        D0 d02 = this.f13830h0;
        if (d02 == null) {
            this.f13830h0 = new D0(0, this);
        } else {
            ListAdapter listAdapter2 = this.f13818V;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f13818V = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13830h0);
        }
        C1297u0 u0Var = this.f13819W;
        if (u0Var != null) {
            u0Var.setAdapter(this.f13818V);
        }
    }

    public C1297u0 p(Context context, boolean z) {
        return new C1297u0(context, z);
    }

    public final void q(int i) {
        Drawable background = this.f13841t0.getBackground();
        if (background != null) {
            Rect rect = this.f13838q0;
            background.getPadding(rect);
            this.f13821Y = rect.left + rect.right + i;
            return;
        }
        this.f13821Y = i;
    }
}
