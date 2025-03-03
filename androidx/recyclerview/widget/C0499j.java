package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.j  reason: case insensitive filesystem */
public final class C0499j extends M {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f8427s;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8428g = true;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f8429h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f8430j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f8431k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f8432l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f8433m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f8434n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f8435o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f8436p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f8437q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f8438r = new ArrayList();

    public C0499j() {
        this.f8297a = null;
        this.f8298b = new ArrayList();
        this.f8299c = 120;
        this.f8300d = 120;
        this.e = 250;
        this.f8301f = 250;
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((j0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r12v8, types: [androidx.recyclerview.widget.h, java.lang.Object] */
    public final boolean a(j0 j0Var, j0 j0Var2, L l8, L l9) {
        int i8;
        int i9;
        int i10 = l8.f8281a;
        int i11 = l8.f8282b;
        if (j0Var2.shouldIgnore()) {
            int i12 = l8.f8281a;
            i8 = l8.f8282b;
            i9 = i12;
        } else {
            i9 = l9.f8281a;
            i8 = l9.f8282b;
        }
        if (j0Var == j0Var2) {
            return g(j0Var, i10, i11, i9, i8);
        }
        float translationX = j0Var.itemView.getTranslationX();
        float translationY = j0Var.itemView.getTranslationY();
        float alpha = j0Var.itemView.getAlpha();
        l(j0Var);
        j0Var.itemView.setTranslationX(translationX);
        j0Var.itemView.setTranslationY(translationY);
        j0Var.itemView.setAlpha(alpha);
        l(j0Var2);
        j0Var2.itemView.setTranslationX((float) (-((int) (((float) (i9 - i10)) - translationX))));
        j0Var2.itemView.setTranslationY((float) (-((int) (((float) (i8 - i11)) - translationY))));
        j0Var2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f8431k;
        ? obj = new Object();
        obj.f8411a = j0Var;
        obj.f8412b = j0Var2;
        obj.f8413c = i10;
        obj.f8414d = i11;
        obj.e = i9;
        obj.f8415f = i8;
        arrayList.add(obj);
        return true;
    }

    public final void d(j0 j0Var) {
        View view = j0Var.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f8430j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0498i) arrayList.get(size)).f8416a == j0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(j0Var);
                arrayList.remove(size);
            }
        }
        j(this.f8431k, j0Var);
        if (this.f8429h.remove(j0Var)) {
            view.setAlpha(1.0f);
            c(j0Var);
        }
        if (this.i.remove(j0Var)) {
            view.setAlpha(1.0f);
            c(j0Var);
        }
        ArrayList arrayList2 = this.f8434n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, j0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f8433m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0498i) arrayList5.get(size4)).f8416a == j0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(j0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f8432l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(j0Var)) {
                view.setAlpha(1.0f);
                c(j0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f8437q.remove(j0Var);
        this.f8435o.remove(j0Var);
        this.f8438r.remove(j0Var);
        this.f8436p.remove(j0Var);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.f8430j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0498i iVar = (C0498i) arrayList.get(size);
            View view = iVar.f8416a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(iVar.f8416a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f8429h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((j0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            j0 j0Var = (j0) arrayList3.get(size3);
            j0Var.itemView.setAlpha(1.0f);
            c(j0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f8431k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0497h hVar = (C0497h) arrayList4.get(size4);
            j0 j0Var2 = hVar.f8411a;
            if (j0Var2 != null) {
                k(hVar, j0Var2);
            }
            j0 j0Var3 = hVar.f8412b;
            if (j0Var3 != null) {
                k(hVar, j0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f8433m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0498i iVar2 = (C0498i) arrayList6.get(size6);
                    View view2 = iVar2.f8416a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(iVar2.f8416a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f8432l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    j0 j0Var4 = (j0) arrayList8.get(size8);
                    j0Var4.itemView.setAlpha(1.0f);
                    c(j0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f8434n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0497h hVar2 = (C0497h) arrayList10.get(size10);
                    j0 j0Var5 = hVar2.f8411a;
                    if (j0Var5 != null) {
                        k(hVar2, j0Var5);
                    }
                    j0 j0Var6 = hVar2.f8412b;
                    if (j0Var6 != null) {
                        k(hVar2, j0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f8437q);
            h(this.f8436p);
            h(this.f8435o);
            h(this.f8438r);
            ArrayList arrayList11 = this.f8298b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final boolean f() {
        if (!this.i.isEmpty() || !this.f8431k.isEmpty() || !this.f8430j.isEmpty() || !this.f8429h.isEmpty() || !this.f8436p.isEmpty() || !this.f8437q.isEmpty() || !this.f8435o.isEmpty() || !this.f8438r.isEmpty() || !this.f8433m.isEmpty() || !this.f8432l.isEmpty() || !this.f8434n.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.recyclerview.widget.i, java.lang.Object] */
    public final boolean g(j0 j0Var, int i8, int i9, int i10, int i11) {
        View view = j0Var.itemView;
        int translationX = i8 + ((int) view.getTranslationX());
        int translationY = i9 + ((int) j0Var.itemView.getTranslationY());
        l(j0Var);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            c(j0Var);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX((float) (-i12));
        }
        if (i13 != 0) {
            view.setTranslationY((float) (-i13));
        }
        ArrayList arrayList = this.f8430j;
        ? obj = new Object();
        obj.f8416a = j0Var;
        obj.f8417b = translationX;
        obj.f8418c = translationY;
        obj.f8419d = i10;
        obj.e = i11;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f8298b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, j0 j0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0497h hVar = (C0497h) arrayList.get(size);
            if (k(hVar, j0Var) && hVar.f8411a == null && hVar.f8412b == null) {
                arrayList.remove(hVar);
            }
        }
    }

    public final boolean k(C0497h hVar, j0 j0Var) {
        if (hVar.f8412b == j0Var) {
            hVar.f8412b = null;
        } else if (hVar.f8411a != j0Var) {
            return false;
        } else {
            hVar.f8411a = null;
        }
        j0Var.itemView.setAlpha(1.0f);
        j0Var.itemView.setTranslationX(0.0f);
        j0Var.itemView.setTranslationY(0.0f);
        c(j0Var);
        return true;
    }

    public final void l(j0 j0Var) {
        if (f8427s == null) {
            f8427s = new ValueAnimator().getInterpolator();
        }
        j0Var.itemView.animate().setInterpolator(f8427s);
        d(j0Var);
    }
}
