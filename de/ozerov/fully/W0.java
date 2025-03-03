package de.ozerov.fully;

import android.view.View;
import android.view.ViewGroup;

public final class W0 {

    /* renamed from: a  reason: collision with root package name */
    public final View f10465a;

    /* renamed from: b  reason: collision with root package name */
    public final View f10466b;

    /* renamed from: c  reason: collision with root package name */
    public int f10467c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f10468d = -1;
    public final ViewGroup.LayoutParams e;

    /* renamed from: f  reason: collision with root package name */
    public final FullyActivity f10469f;

    /* renamed from: g  reason: collision with root package name */
    public int f10470g = -1;

    public W0(FullyActivity fullyActivity) {
        this.f10469f = fullyActivity;
        View findViewById = fullyActivity.findViewById(16908290);
        this.f10465a = findViewById;
        this.f10466b = fullyActivity.getWindow().getDecorView();
        this.e = findViewById.getLayoutParams();
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new V0(this));
    }
}
