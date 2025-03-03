package com.google.android.material.datepicker;

import B.C0003d;
import C3.C0025a;
import E.d;
import F.h;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.r;
import com.google.android.material.internal.CheckableImageButton;
import f3.C0899a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.C1195a;
import q3.C1363a;
import q4.k;
import v0.C1510H;
import v0.C1529b;
import v0.C1553z;
import v0.k0;
import v0.n0;
import z3.g;

public final class m<S> extends r {

    /* renamed from: A1  reason: collision with root package name */
    public CharSequence f9306A1;

    /* renamed from: B1  reason: collision with root package name */
    public CharSequence f9307B1;

    /* renamed from: e1  reason: collision with root package name */
    public final LinkedHashSet f9308e1 = new LinkedHashSet();

    /* renamed from: f1  reason: collision with root package name */
    public final LinkedHashSet f9309f1 = new LinkedHashSet();

    /* renamed from: g1  reason: collision with root package name */
    public int f9310g1;

    /* renamed from: h1  reason: collision with root package name */
    public t f9311h1;

    /* renamed from: i1  reason: collision with root package name */
    public b f9312i1;

    /* renamed from: j1  reason: collision with root package name */
    public k f9313j1;

    /* renamed from: k1  reason: collision with root package name */
    public int f9314k1;

    /* renamed from: l1  reason: collision with root package name */
    public CharSequence f9315l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f9316m1;

    /* renamed from: n1  reason: collision with root package name */
    public int f9317n1;

    /* renamed from: o1  reason: collision with root package name */
    public int f9318o1;

    /* renamed from: p1  reason: collision with root package name */
    public CharSequence f9319p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f9320q1;

    /* renamed from: r1  reason: collision with root package name */
    public CharSequence f9321r1;
    public int s1;
    public CharSequence t1;

    /* renamed from: u1  reason: collision with root package name */
    public int f9322u1;

    /* renamed from: v1  reason: collision with root package name */
    public CharSequence f9323v1;
    public TextView w1;

    /* renamed from: x1  reason: collision with root package name */
    public CheckableImageButton f9324x1;

    /* renamed from: y1  reason: collision with root package name */
    public g f9325y1;

    /* renamed from: z1  reason: collision with root package name */
    public boolean f9326z1;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int T(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165855);
        Calendar b8 = w.b();
        b8.set(5, 1);
        Calendar a8 = w.a(b8);
        a8.get(2);
        a8.get(1);
        int maximum = a8.getMaximum(7);
        a8.getActualMaximum(5);
        a8.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165861) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131165875)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean U(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.D(2130969332, context, k.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    public final void E(Bundle bundle) {
        o oVar;
        o oVar2;
        Bundle bundle2 = bundle;
        super.E(bundle);
        bundle2.putInt("OVERRIDE_THEME_RES_ID", this.f9310g1);
        bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        b bVar = this.f9312i1;
        ? obj = new Object();
        int i = a.f9266b;
        int i8 = a.f9266b;
        long j7 = bVar.f9268U.f9334Z;
        long j8 = bVar.f9269V.f9334Z;
        obj.f9267a = Long.valueOf(bVar.f9271X.f9334Z);
        k kVar = this.f9313j1;
        if (kVar == null) {
            oVar = null;
        } else {
            oVar = kVar.f9294S0;
        }
        if (oVar != null) {
            obj.f9267a = Long.valueOf(oVar.f9334Z);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f9270W);
        o v4 = o.v(j7);
        o v8 = o.v(j8);
        d dVar = (d) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l8 = obj.f9267a;
        if (l8 == null) {
            oVar2 = null;
        } else {
            oVar2 = o.v(l8.longValue());
        }
        bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(v4, v8, dVar, oVar2, bVar.f9272Y));
        bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.f9314k1);
        bundle2.putCharSequence("TITLE_TEXT_KEY", this.f9315l1);
        bundle2.putInt("INPUT_MODE_KEY", this.f9317n1);
        bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f9318o1);
        bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f9319p1);
        bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f9320q1);
        bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f9321r1);
        bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.s1);
        bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.t1);
        bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f9322u1);
        bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f9323v1);
    }

    public final void F() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        int i8;
        boolean z6;
        n0 n0Var;
        boolean z8;
        n0 n0Var2;
        super.F();
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f9316m1) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.f9325y1);
                if (!this.f9326z1) {
                    View findViewById = L().findViewById(2131362124);
                    ColorStateList o2 = h.o(findViewById.getBackground());
                    if (o2 != null) {
                        num = Integer.valueOf(o2.getDefaultColor());
                    } else {
                        num = null;
                    }
                    int i9 = Build.VERSION.SDK_INT;
                    if (num == null || num.intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int n4 = D7.b.n(window.getContext(), 16842801, -16777216);
                    if (z) {
                        num = Integer.valueOf(n4);
                    }
                    if (i9 >= 35) {
                        d.f(window, false);
                    } else if (i9 >= 30) {
                        d.e(window, false);
                    } else {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                    }
                    Context context = window.getContext();
                    if (i9 < 23) {
                        i = C1195a.d(D7.b.n(context, 16843857, -16777216), 128);
                    } else {
                        i = 0;
                    }
                    Context context2 = window.getContext();
                    if (i9 < 27) {
                        i8 = C1195a.d(D7.b.n(context2, 16843858, -16777216), 128);
                    } else {
                        i8 = 0;
                    }
                    window.setStatusBarColor(i);
                    window.setNavigationBarColor(i8);
                    boolean A8 = D7.b.A(num.intValue());
                    if (D7.b.A(i) || (i == 0 && A8)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    k kVar = new k(window.getDecorView());
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 35) {
                        n0 n0Var3 = new n0(window.getInsetsController(), kVar);
                        n0Var3.f15959b = window;
                        n0Var = n0Var3;
                    } else if (i10 >= 30) {
                        n0 n0Var4 = new n0(window.getInsetsController(), kVar);
                        n0Var4.f15959b = window;
                        n0Var = n0Var4;
                    } else if (i10 >= 26) {
                        n0Var = new k0(window, kVar);
                    } else if (i10 >= 23) {
                        n0Var = new k0(window, kVar);
                    } else {
                        n0Var = new k0(window, kVar);
                    }
                    n0Var.r(z6);
                    boolean A9 = D7.b.A(n4);
                    if (D7.b.A(i8) || (i8 == 0 && A9)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    k kVar2 = new k(window.getDecorView());
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 35) {
                        n0 n0Var5 = new n0(window.getInsetsController(), kVar2);
                        n0Var5.f15959b = window;
                        n0Var2 = n0Var5;
                    } else if (i11 >= 30) {
                        n0 n0Var6 = new n0(window.getInsetsController(), kVar2);
                        n0Var6.f15959b = window;
                        n0Var2 = n0Var6;
                    } else if (i11 >= 26) {
                        n0Var2 = new k0(window, kVar2);
                    } else if (i11 >= 23) {
                        n0Var2 = new k0(window, kVar2);
                    } else {
                        n0Var2 = new k0(window, kVar2);
                    }
                    n0Var2.q(z8);
                    l lVar = new l(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1553z.m(findViewById, lVar);
                    this.f9326z1 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = m().getDimensionPixelOffset(2131165863);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable(this.f9325y1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView2 = window.getDecorView();
                Dialog dialog2 = this.f8029a1;
                if (dialog2 != null) {
                    decorView2.setOnTouchListener(new C1363a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            K();
            int i12 = this.f9310g1;
            if (i12 != 0) {
                S();
                b bVar = this.f9312i1;
                k kVar3 = new k();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i12);
                bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
                bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f9271X);
                kVar3.N(bundle);
                this.f9313j1 = kVar3;
                t tVar = kVar3;
                if (this.f9317n1 == 1) {
                    S();
                    b bVar2 = this.f9312i1;
                    t nVar = new n();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i12);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                    nVar.N(bundle2);
                    tVar = nVar;
                }
                this.f9311h1 = tVar;
                TextView textView = this.w1;
                if (this.f9317n1 == 1 && m().getConfiguration().orientation == 2) {
                    charSequence = this.f9307B1;
                } else {
                    charSequence = this.f9306A1;
                }
                textView.setText(charSequence);
                S();
                throw null;
            }
            S();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void G() {
        this.f9311h1.f9348P0.clear();
        super.G();
    }

    public final Dialog P(Bundle bundle) {
        Context K4 = K();
        K();
        int i = this.f9310g1;
        if (i != 0) {
            Dialog dialog = new Dialog(K4, i);
            Context context = dialog.getContext();
            this.f9316m1 = U(context, 16843277);
            this.f9325y1 = new g(context, (AttributeSet) null, 2130969332, 2132018266);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0899a.f11658l, 2130969332, 2132018266);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f9325y1.h(context);
            this.f9325y1.j(ColorStateList.valueOf(color));
            g gVar = this.f9325y1;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = C1510H.f15874a;
            gVar.i(C1553z.e(decorView));
            return dialog;
        }
        S();
        throw null;
    }

    public final void S() {
        if (this.f8064Z.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f9308e1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f9309f1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f8045A0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        if (bundle == null) {
            bundle = this.f8064Z;
        }
        this.f9310g1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f9312i1 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f9314k1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f9315l1 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f9317n1 = bundle.getInt("INPUT_MODE_KEY");
                this.f9318o1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f9319p1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f9320q1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f9321r1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.s1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.t1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f9322u1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f9323v1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f9315l1;
                if (charSequence == null) {
                    charSequence = K().getResources().getText(this.f9314k1);
                }
                this.f9306A1 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f9307B1 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        if (this.f9316m1) {
            i = 2131558549;
        } else {
            i = 2131558548;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f9316m1) {
            inflate.findViewById(2131362276).setLayoutParams(new LinearLayout.LayoutParams(T(context), -2));
        } else {
            inflate.findViewById(2131362277).setLayoutParams(new LinearLayout.LayoutParams(T(context), -1));
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        ((TextView) inflate.findViewById(2131362288)).setAccessibilityLiveRegion(1);
        this.f9324x1 = (CheckableImageButton) inflate.findViewById(2131362290);
        this.w1 = (TextView) inflate.findViewById(2131362294);
        this.f9324x1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f9324x1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0003d.r(context, 2131231031));
        boolean z = false;
        stateListDrawable.addState(new int[0], C0003d.r(context, 2131231033));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f9324x1;
        if (this.f9317n1 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        C1510H.p(this.f9324x1, (C1529b) null);
        CheckableImageButton checkableImageButton3 = this.f9324x1;
        if (this.f9317n1 == 1) {
            str = checkableImageButton3.getContext().getString(2131951905);
        } else {
            str = checkableImageButton3.getContext().getString(2131951907);
        }
        this.f9324x1.setContentDescription(str);
        this.f9324x1.setOnClickListener(new C0025a(8, this));
        Button button = (Button) inflate.findViewById(2131361950);
        S();
        throw null;
    }
}
