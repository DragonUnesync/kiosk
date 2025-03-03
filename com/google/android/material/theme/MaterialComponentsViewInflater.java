package com.google.android.material.theme;

import C3.z;
import E3.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import f3.C0899a;
import h.C1003D;
import n3.c;
import o.C1249B;
import o.C1260b0;
import o.C1285o;
import o.C1287p;
import o.C1289q;
import t3.k;

public class MaterialComponentsViewInflater extends C1003D {
    public final C1285o a(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    public final C1287p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final C1289q c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.B, android.widget.CompoundButton, v3.a, android.view.View] */
    public final C1249B d(Context context, AttributeSet attributeSet) {
        ? b8 = new C1249B(a.a(context, attributeSet, 2130969499, 2132018258), attributeSet);
        Context context2 = b8.getContext();
        TypedArray f8 = k.f(context2, attributeSet, C0899a.f11661o, 2130969499, 2132018258, new int[0]);
        if (f8.hasValue(0)) {
            b8.setButtonTintList(com.bumptech.glide.c.j(context2, f8, 0));
        }
        b8.f16082c0 = f8.getBoolean(1, false);
        f8.recycle();
        return b8;
    }

    public final C1260b0 e(Context context, AttributeSet attributeSet) {
        C1260b0 b0Var = new C1260b0(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = b0Var.getContext();
        if (b.C(context2, 2130969715, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C0899a.f11664r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int h5 = D3.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h5 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, C0899a.f11663q);
                    int h8 = D3.a.h(b0Var.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h8 >= 0) {
                        b0Var.setLineHeight(h8);
                    }
                }
            }
        }
        return b0Var;
    }
}
