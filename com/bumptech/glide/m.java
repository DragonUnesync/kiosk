package com.bumptech.glide;

import S2.c;
import T2.d;
import T2.g;
import W2.f;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

public final class m implements g {

    /* renamed from: U  reason: collision with root package name */
    public final d f9050U;

    /* renamed from: V  reason: collision with root package name */
    public final View f9051V;

    public m(View view) {
        f.c(view, "Argument must not be null");
        this.f9051V = view;
        this.f9050U = new d(view);
    }

    public final void a(c cVar) {
        this.f9051V.setTag(2131362129, cVar);
    }

    public final void b(Drawable drawable) {
    }

    public final void c() {
    }

    public final void d(S2.f fVar) {
        this.f9050U.f4991b.remove(fVar);
    }

    public final void e(Drawable drawable) {
    }

    public final c f() {
        Object tag = this.f9051V.getTag(2131362129);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public final void g(Drawable drawable) {
        d dVar = this.f9050U;
        ViewTreeObserver viewTreeObserver = dVar.f4990a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(dVar.f4992c);
        }
        dVar.f4992c = null;
        dVar.f4991b.clear();
    }

    public final void h(T2.f fVar) {
        int i;
        d dVar = this.f9050U;
        View view = dVar.f4990a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i8 = 0;
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int a8 = dVar.a(view.getWidth(), i, paddingRight);
        View view2 = dVar.f4990a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            i8 = layoutParams2.height;
        }
        int a9 = dVar.a(view2.getHeight(), i8, paddingBottom);
        if ((a8 > 0 || a8 == Integer.MIN_VALUE) && (a9 > 0 || a9 == Integer.MIN_VALUE)) {
            fVar.b(a8, a9);
            return;
        }
        ArrayList arrayList = dVar.f4991b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (dVar.f4992c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            T2.c cVar = new T2.c(dVar);
            dVar.f4992c = cVar;
            viewTreeObserver.addOnPreDrawListener(cVar);
        }
    }

    public final void i(Object obj) {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final String toString() {
        return "Target for: " + this.f9051V;
    }
}
