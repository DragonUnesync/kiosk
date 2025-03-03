package com.google.android.material.datepicker;

import a1.C0410a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.support.v4.media.session.b;
import f3.C0899a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final C0410a f9275a;

    /* renamed from: b  reason: collision with root package name */
    public final C0410a f9276b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.D(2130969332, context, k.class.getCanonicalName()).data, C0899a.f11658l);
        C0410a.m(context, obtainStyledAttributes.getResourceId(4, 0));
        C0410a.m(context, obtainStyledAttributes.getResourceId(2, 0));
        C0410a.m(context, obtainStyledAttributes.getResourceId(3, 0));
        C0410a.m(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList j7 = com.bumptech.glide.c.j(context, obtainStyledAttributes, 7);
        this.f9275a = C0410a.m(context, obtainStyledAttributes.getResourceId(9, 0));
        C0410a.m(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f9276b = C0410a.m(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(j7.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
