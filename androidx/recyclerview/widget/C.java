package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import v0.C1510H;

public final class C implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f8268U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f8269V;

    public /* synthetic */ C(RecyclerView recyclerView, int i) {
        this.f8268U = i;
        this.f8269V = recyclerView;
    }

    public final void run() {
        long j7;
        RecyclerView recyclerView = this.f8269V;
        switch (this.f8268U) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.mLayoutSuppressed) {
                        recyclerView.mLayoutWasDefered = true;
                        return;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                        return;
                    }
                } else {
                    return;
                }
            default:
                M m8 = recyclerView.mItemAnimator;
                if (m8 != null) {
                    C0499j jVar = (C0499j) m8;
                    ArrayList arrayList = jVar.f8429h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = jVar.f8430j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = jVar.f8431k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = jVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j8 = jVar.f8300d;
                            if (hasNext) {
                                j0 j0Var = (j0) it.next();
                                View view = j0Var.itemView;
                                ViewPropertyAnimator animate = view.animate();
                                jVar.f8437q.add(j0Var);
                                animate.setDuration(j8).alpha(0.0f).setListener(new C0494e(jVar, j0Var, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    jVar.f8433m.add(arrayList5);
                                    arrayList2.clear();
                                    C0493d dVar = new C0493d(jVar, arrayList5, 0);
                                    if (!isEmpty) {
                                        View view2 = ((C0498i) arrayList5.get(0)).f8416a.itemView;
                                        WeakHashMap weakHashMap = C1510H.f15874a;
                                        view2.postOnAnimationDelayed(dVar, j8);
                                    } else {
                                        dVar.run();
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    jVar.f8434n.add(arrayList6);
                                    arrayList3.clear();
                                    C0493d dVar2 = new C0493d(jVar, arrayList6, 1);
                                    if (!isEmpty) {
                                        View view3 = ((C0497h) arrayList6.get(0)).f8411a.itemView;
                                        WeakHashMap weakHashMap2 = C1510H.f15874a;
                                        view3.postOnAnimationDelayed(dVar2, j8);
                                    } else {
                                        dVar2.run();
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    jVar.f8432l.add(arrayList7);
                                    arrayList4.clear();
                                    C0493d dVar3 = new C0493d(jVar, arrayList7, 2);
                                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                                        long j9 = 0;
                                        if (isEmpty) {
                                            j8 = 0;
                                        }
                                        if (!isEmpty2) {
                                            j7 = jVar.e;
                                        } else {
                                            j7 = 0;
                                        }
                                        if (!isEmpty3) {
                                            j9 = jVar.f8301f;
                                        }
                                        long max = Math.max(j7, j9) + j8;
                                        View view4 = ((j0) arrayList7.get(0)).itemView;
                                        WeakHashMap weakHashMap3 = C1510H.f15874a;
                                        view4.postOnAnimationDelayed(dVar3, max);
                                    } else {
                                        dVar3.run();
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.mPostedAnimatorRunner = false;
                return;
        }
    }
}
