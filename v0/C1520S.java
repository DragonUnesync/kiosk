package v0;

import H.j;
import P0.o;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m0.C1197c;

/* renamed from: v0.S  reason: case insensitive filesystem */
public final class C1520S extends WindowInsetsAnimation.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final j f15896a;

    /* renamed from: b  reason: collision with root package name */
    public List f15897b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f15898c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f15899d = new HashMap();

    public C1520S(j jVar) {
        super(0);
        this.f15896a = jVar;
    }

    public final C1523V a(WindowInsetsAnimation windowInsetsAnimation) {
        C1523V v4 = (C1523V) this.f15899d.get(windowInsetsAnimation);
        if (v4 == null) {
            v4 = new C1523V(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                v4.f15904a = new C1521T(windowInsetsAnimation);
            }
            this.f15899d.put(windowInsetsAnimation, v4);
        }
        return v4;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        j jVar = this.f15896a;
        a(windowInsetsAnimation);
        ((View) jVar.f1797d).setTranslationY(0.0f);
        this.f15899d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        j jVar = this.f15896a;
        a(windowInsetsAnimation);
        int[] iArr = (int[]) jVar.e;
        ((View) jVar.f1797d).getLocationOnScreen(iArr);
        jVar.f1794a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f15898c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f15898c = arrayList2;
            this.f15897b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l8 = o.l(list.get(size));
            C1523V a8 = a(l8);
            a8.f15904a.d(l8.getFraction());
            this.f15898c.add(a8);
        }
        j jVar = this.f15896a;
        j0 g8 = j0.g((View) null, windowInsets);
        jVar.e(g8, this.f15897b);
        return g8.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        j jVar = this.f15896a;
        a(windowInsetsAnimation);
        C1197c c8 = C1197c.c(bounds.getLowerBound());
        C1197c c9 = C1197c.c(bounds.getUpperBound());
        View view = (View) jVar.f1797d;
        int[] iArr = (int[]) jVar.e;
        view.getLocationOnScreen(iArr);
        int i = jVar.f1794a - iArr[1];
        jVar.f1795b = i;
        view.setTranslationY((float) i);
        o.o();
        return o.j(c8.d(), c9.d());
    }
}
