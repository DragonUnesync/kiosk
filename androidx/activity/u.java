package androidx.activity;

import D6.g;
import P6.f;
import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0450a;
import androidx.fragment.app.C0462m;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.D;
import androidx.fragment.app.L;
import androidx.fragment.app.S;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f7349a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7350b = new g();

    /* renamed from: c  reason: collision with root package name */
    public D f7351c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f7352d;
    public OnBackInvokedDispatcher e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7353f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7354g;

    public u(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f7349a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallback = r.f7319a.a(new m(this, 0), new m(this, 1), new n(this, 0), new n(this, 1));
            } else {
                onBackInvokedCallback = p.f7314a.a(new n(this, 2));
            }
            this.f7352d = onBackInvokedCallback;
        }
    }

    public final void a(r rVar, D d8) {
        f.e(d8, "onBackPressedCallback");
        t e8 = rVar.e();
        if (e8.f8156c != C0486m.f8145U) {
            d8.f7839b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, e8, d8));
            d();
            d8.f7840c = new t(0, this);
        }
    }

    public final void b() {
        Object obj;
        D d8 = this.f7351c;
        if (d8 == null) {
            g gVar = this.f7350b;
            gVar.getClass();
            ListIterator listIterator = gVar.listIterator(gVar.f1265W);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((D) obj).f7838a) {
                    break;
                }
            }
            d8 = (D) obj;
        }
        this.f7351c = null;
        if (d8 != null) {
            boolean isLoggable = Log.isLoggable("FragmentManager", 3);
            L l8 = d8.f7841d;
            if (isLoggable) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + l8);
            }
            l8.i = true;
            l8.z(true);
            l8.i = false;
            C0450a aVar = l8.f7879h;
            D d9 = l8.f7880j;
            if (aVar != null) {
                ArrayList arrayList = l8.f7884n;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(L.E(l8.f7879h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                C0470v vVar = (C0470v) it2.next();
                                throw null;
                            }
                        } else {
                            throw new ClassCastException();
                        }
                    }
                }
                Iterator it3 = l8.f7879h.f7955a.iterator();
                while (it3.hasNext()) {
                    C0470v vVar2 = ((S) it3.next()).f7929b;
                    if (vVar2 != null) {
                        vVar2.f8071g0 = false;
                    }
                }
                Iterator it4 = l8.f(new ArrayList(Collections.singletonList(l8.f7879h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    C0462m mVar = (C0462m) it4.next();
                    mVar.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    ArrayList arrayList2 = mVar.f8010c;
                    mVar.l(arrayList2);
                    mVar.c(arrayList2);
                }
                Iterator it5 = l8.f7879h.f7955a.iterator();
                while (it5.hasNext()) {
                    C0470v vVar3 = ((S) it5.next()).f7929b;
                    if (vVar3 != null && vVar3.f8089z0 == null) {
                        l8.g(vVar3).k();
                    }
                }
                l8.f7879h = null;
                l8.g0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + d9.f7838a + " for  FragmentManager " + l8);
                }
            } else if (d9.f7838a) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                l8.R();
            } else {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                l8.f7878g.b();
            }
        } else {
            this.f7349a.run();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.f7352d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            p pVar = p.f7314a;
            if (z && !this.f7353f) {
                pVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f7353f = true;
            } else if (!z && this.f7353f) {
                pVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f7353f = false;
            }
        }
    }

    public final void d() {
        boolean z = this.f7354g;
        g gVar = this.f7350b;
        boolean z6 = false;
        if (!(gVar instanceof Collection) || !gVar.isEmpty()) {
            Iterator it = gVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((D) it.next()).f7838a) {
                        z6 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f7354g = z6;
        if (z6 != z && Build.VERSION.SDK_INT >= 33) {
            c(z6);
        }
    }
}
