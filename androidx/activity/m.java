package androidx.activity;

import D6.i;
import D6.o;
import O6.l;
import P6.f;
import P6.g;
import android.util.Log;
import androidx.fragment.app.C0462m;
import androidx.fragment.app.D;
import androidx.fragment.app.K;
import androidx.fragment.app.L;
import androidx.fragment.app.V;
import androidx.fragment.app.W;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class m extends g implements l {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7308U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ u f7309V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(u uVar, int i) {
        super(1);
        this.f7308U = i;
        this.f7309V = uVar;
    }

    public final Object a(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f7308U) {
            case 0:
                f.e((b) obj, "backEvent");
                u uVar = this.f7309V;
                D6.g gVar = uVar.f7350b;
                gVar.getClass();
                ListIterator listIterator = gVar.listIterator(gVar.f1265W);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((D) obj2).f7838a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                D d8 = (D) obj2;
                uVar.f7351c = d8;
                if (d8 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                    L l8 = d8.f7841d;
                    if (isLoggable) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + l8);
                    }
                    l8.w();
                    l8.x(new K(l8), false);
                }
                return C6.g.f721c;
            default:
                b bVar = (b) obj;
                f.e(bVar, "backEvent");
                u uVar2 = this.f7309V;
                D d9 = uVar2.f7351c;
                if (d9 == null) {
                    D6.g gVar2 = uVar2.f7350b;
                    gVar2.getClass();
                    ListIterator listIterator2 = gVar2.listIterator(gVar2.f1265W);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((D) obj3).f7838a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    d9 = (D) obj3;
                }
                if (d9 != null) {
                    boolean isLoggable2 = Log.isLoggable("FragmentManager", 2);
                    L l9 = d9.f7841d;
                    if (isLoggable2) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + l9);
                    }
                    if (l9.f7879h != null) {
                        Iterator it = l9.f(new ArrayList(Collections.singletonList(l9.f7879h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            C0462m mVar = (C0462m) it.next();
                            mVar.getClass();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.f7275c);
                            }
                            ArrayList arrayList = mVar.f8010c;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                o.N(arrayList2, ((W) it2.next()).f7952k);
                            }
                            List U8 = i.U(i.W(arrayList2));
                            int size = U8.size();
                            for (int i = 0; i < size; i++) {
                                ((V) U8.get(i)).c(bVar, mVar.f8008a);
                            }
                        }
                        Iterator it3 = l9.f7884n.iterator();
                        if (it3.hasNext()) {
                            throw Q0.g.k(it3);
                        }
                    }
                }
                return C6.g.f721c;
        }
    }
}
