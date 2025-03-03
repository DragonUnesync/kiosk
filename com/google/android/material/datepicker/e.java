package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public final class e extends BaseAdapter {

    /* renamed from: X  reason: collision with root package name */
    public static final int f9278X;

    /* renamed from: U  reason: collision with root package name */
    public final Calendar f9279U;

    /* renamed from: V  reason: collision with root package name */
    public final int f9280V;

    /* renamed from: W  reason: collision with root package name */
    public final int f9281W;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f9278X = i;
    }

    public e() {
        Calendar c8 = w.c((Calendar) null);
        this.f9279U = c8;
        this.f9280V = c8.getMaximum(7);
        this.f9281W = c8.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f9280V;
    }

    public final Object getItem(int i) {
        int i8 = this.f9280V;
        if (i >= i8) {
            return null;
        }
        int i9 = i + this.f9281W;
        if (i9 > i8) {
            i9 -= i8;
        }
        return Integer.valueOf(i9);
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r6 != 0) goto L_0x0018
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r1 = 2131558535(0x7f0d0087, float:1.8742389E38)
            android.view.View r6 = r6.inflate(r1, r7, r0)
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0018:
            int r6 = r4.f9281W
            int r5 = r5 + r6
            int r6 = r4.f9280V
            if (r5 <= r6) goto L_0x0020
            int r5 = r5 - r6
        L_0x0020:
            java.util.Calendar r6 = r4.f9279U
            r2 = 7
            r6.set(r2, r5)
            android.content.res.Resources r5 = r1.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            int r3 = f9278X
            java.lang.String r5 = r6.getDisplayName(r2, r3, r5)
            r1.setText(r5)
            android.content.Context r5 = r7.getContext()
            r7 = 2131951882(0x7f13010a, float:1.9540191E38)
            java.lang.String r5 = r5.getString(r7)
            r7 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r1.setContentDescription(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public e(int i) {
        Calendar c8 = w.c((Calendar) null);
        this.f9279U = c8;
        this.f9280V = c8.getMaximum(7);
        this.f9281W = i;
    }
}
