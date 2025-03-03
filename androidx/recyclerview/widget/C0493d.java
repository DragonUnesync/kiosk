package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.d  reason: case insensitive filesystem */
public final class C0493d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f8377U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ArrayList f8378V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C0499j f8379W;

    public /* synthetic */ C0493d(C0499j jVar, ArrayList arrayList, int i) {
        this.f8377U = i;
        this.f8379W = jVar;
        this.f8378V = arrayList;
    }

    public final void run() {
        View view;
        View view2;
        Iterator it;
        switch (this.f8377U) {
            case 0:
                ArrayList arrayList = this.f8378V;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0499j jVar = this.f8379W;
                    if (hasNext) {
                        C0498i iVar = (C0498i) it2.next();
                        j0 j0Var = iVar.f8416a;
                        jVar.getClass();
                        View view3 = j0Var.itemView;
                        int i = iVar.f8419d - iVar.f8417b;
                        int i8 = iVar.e - iVar.f8418c;
                        if (i != 0) {
                            view3.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view3.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view3.animate();
                        jVar.f8436p.add(j0Var);
                        animate.setDuration(jVar.e).setListener(new C0495f(jVar, j0Var, i, view3, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        jVar.f8433m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f8378V;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0499j jVar2 = this.f8379W;
                    if (hasNext2) {
                        C0497h hVar = (C0497h) it3.next();
                        jVar2.getClass();
                        j0 j0Var2 = hVar.f8411a;
                        if (j0Var2 == null) {
                            view = null;
                        } else {
                            view = j0Var2.itemView;
                        }
                        j0 j0Var3 = hVar.f8412b;
                        if (j0Var3 != null) {
                            view2 = j0Var3.itemView;
                        } else {
                            view2 = null;
                        }
                        ArrayList arrayList3 = jVar2.f8438r;
                        long j7 = jVar2.f8301f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j7);
                            arrayList3.add(hVar.f8411a);
                            duration.translationX((float) (hVar.e - hVar.f8413c));
                            duration.translationY((float) (hVar.f8415f - hVar.f8414d));
                            C0496g gVar = r4;
                            it = it3;
                            C0496g gVar2 = new C0496g(jVar2, hVar, duration, view, 0);
                            duration.alpha(0.0f).setListener(gVar).start();
                        } else {
                            it = it3;
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator animate2 = view2.animate();
                            arrayList3.add(hVar.f8412b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j7).alpha(1.0f).setListener(new C0496g(jVar2, hVar, animate2, view2, 1)).start();
                        }
                        it3 = it;
                    } else {
                        arrayList2.clear();
                        jVar2.f8434n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f8378V;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0499j jVar3 = this.f8379W;
                    if (hasNext3) {
                        j0 j0Var4 = (j0) it4.next();
                        jVar3.getClass();
                        View view4 = j0Var4.itemView;
                        ViewPropertyAnimator animate3 = view4.animate();
                        jVar3.f8435o.add(j0Var4);
                        animate3.alpha(1.0f).setDuration(jVar3.f8299c).setListener(new C0494e(jVar3, j0Var4, view4, animate3)).start();
                    } else {
                        arrayList4.clear();
                        jVar3.f8432l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
