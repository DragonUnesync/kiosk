package androidx.fragment.app;

import B3.q;
import H0.a;
import H0.d;
import N.e;
import R2.c;
import Y.j;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import h.C1022j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.C1477r;
import v0.C1510H;
import v0.C1551x;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final c f7924a;

    /* renamed from: b  reason: collision with root package name */
    public final q f7925b;

    /* renamed from: c  reason: collision with root package name */
    public final C0470v f7926c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7927d = false;
    public int e = -1;

    public Q(c cVar, q qVar, C0470v vVar) {
        this.f7924a = cVar;
        this.f7925b = qVar;
        this.f7926c = vVar;
    }

    public final void a() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + vVar);
        }
        Bundle bundle2 = vVar.f8060V;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        vVar.p0.Q();
        vVar.f8059U = 3;
        vVar.f8088y0 = false;
        vVar.t();
        if (vVar.f8088y0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + vVar);
            }
            if (vVar.f8045A0 != null) {
                Bundle bundle3 = vVar.f8060V;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray sparseArray = vVar.f8061W;
                if (sparseArray != null) {
                    vVar.f8045A0.restoreHierarchyState(sparseArray);
                    vVar.f8061W = null;
                }
                vVar.f8088y0 = false;
                vVar.I(bundle);
                if (!vVar.f8088y0) {
                    throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onViewStateRestored()");
                } else if (vVar.f8045A0 != null) {
                    vVar.f8054J0.b(C0485l.ON_CREATE);
                }
            }
            vVar.f8060V = null;
            L l8 = vVar.p0;
            l8.f7864H = false;
            l8.f7865I = false;
            l8.f7871O.f7908f = false;
            l8.u(4);
            this.f7924a.M(vVar, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        C0470v vVar;
        View view;
        View view2;
        C0470v vVar2;
        int i = -1;
        C0470v vVar3 = this.f7926c;
        View view3 = vVar3.f8089z0;
        while (true) {
            vVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(2131362118);
            if (tag instanceof C0470v) {
                vVar2 = (C0470v) tag;
            } else {
                vVar2 = null;
            }
            if (vVar2 != null) {
                vVar = vVar2;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        C0470v vVar4 = vVar3.f8080q0;
        if (vVar != null && !vVar.equals(vVar4)) {
            int i8 = vVar3.f8082s0;
            H0.c cVar = d.f1812a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(vVar3);
            sb.append(" within the view of parent fragment ");
            sb.append(vVar);
            sb.append(" via container with ID ");
            d.b(new a(vVar3, e.z(sb, i8, " without using parent's childFragmentManager")));
            d.a(vVar3).getClass();
        }
        q qVar = this.f7925b;
        qVar.getClass();
        ViewGroup viewGroup = vVar3.f8089z0;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) qVar.f449U;
            int indexOf = arrayList.indexOf(vVar3);
            int i9 = indexOf - 1;
            while (true) {
                if (i9 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        C0470v vVar5 = (C0470v) arrayList.get(indexOf);
                        if (vVar5.f8089z0 == viewGroup && (view = vVar5.f8045A0) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    C0470v vVar6 = (C0470v) arrayList.get(i9);
                    if (vVar6.f8089z0 == viewGroup && (view2 = vVar6.f8045A0) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i9--;
                }
            }
        }
        vVar3.f8089z0.addView(vVar3.f8045A0, i);
    }

    public final void c() {
        Q q7;
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + vVar);
        }
        C0470v vVar2 = vVar.f8065a0;
        q qVar = this.f7925b;
        if (vVar2 != null) {
            q7 = (Q) ((HashMap) qVar.f450V).get(vVar2.f8063Y);
            if (q7 != null) {
                vVar.f8066b0 = vVar.f8065a0.f8063Y;
                vVar.f8065a0 = null;
            } else {
                throw new IllegalStateException("Fragment " + vVar + " declared target fragment " + vVar.f8065a0 + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = vVar.f8066b0;
            if (str != null) {
                q7 = (Q) ((HashMap) qVar.f450V).get(str);
                if (q7 == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(vVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(e.A(sb, vVar.f8066b0, " that does not belong to this FragmentManager!"));
                }
            } else {
                q7 = null;
            }
        }
        if (q7 != null) {
            q7.k();
        }
        L l8 = vVar.f8078n0;
        vVar.f8079o0 = l8.f7893w;
        vVar.f8080q0 = l8.f7895y;
        c cVar = this.f7924a;
        cVar.S(vVar, false);
        ArrayList arrayList = vVar.f8057M0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0470v vVar3 = ((C0467s) it.next()).f8033a;
            vVar3.f8056L0.h();
            J.a(vVar3);
            Bundle bundle2 = vVar3.f8060V;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            vVar3.f8056L0.i(bundle);
        }
        arrayList.clear();
        vVar.p0.b(vVar.f8079o0, vVar.f(), vVar);
        vVar.f8059U = 0;
        vVar.f8088y0 = false;
        vVar.w(vVar.f8079o0.f8093e0);
        if (vVar.f8088y0) {
            Iterator it2 = vVar.f8078n0.f7886p.iterator();
            while (it2.hasNext()) {
                ((O) it2.next()).b();
            }
            L l9 = vVar.p0;
            l9.f7864H = false;
            l9.f7865I = false;
            l9.f7871O.f7908f = false;
            l9.u(0);
            cVar.N(vVar, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onAttach()");
    }

    public final int d() {
        int i;
        int i8;
        C0470v vVar = this.f7926c;
        if (vVar.f8078n0 == null) {
            return vVar.f8059U;
        }
        int i9 = this.e;
        int ordinal = vVar.f8052H0.ordinal();
        int i10 = 0;
        if (ordinal == 1) {
            i9 = Math.min(i9, 0);
        } else if (ordinal == 2) {
            i9 = Math.min(i9, 1);
        } else if (ordinal == 3) {
            i9 = Math.min(i9, 5);
        } else if (ordinal != 4) {
            i9 = Math.min(i9, -1);
        }
        if (vVar.f8072h0) {
            if (vVar.f8073i0) {
                i9 = Math.max(this.e, 2);
                View view = vVar.f8045A0;
                if (view != null && view.getParent() == null) {
                    i9 = Math.min(i9, 2);
                }
            } else {
                i9 = this.e < 4 ? Math.min(i9, vVar.f8059U) : Math.min(i9, 1);
            }
        }
        if (vVar.f8074j0 && vVar.f8089z0 == null) {
            i9 = Math.min(i9, 4);
        }
        if (!vVar.f8069e0) {
            i9 = Math.min(i9, 1);
        }
        ViewGroup viewGroup = vVar.f8089z0;
        if (viewGroup != null) {
            C0462m j7 = C0462m.j(viewGroup, vVar.l());
            j7.getClass();
            W g8 = j7.g(vVar);
            if (g8 != null) {
                i = g8.f7945b;
            } else {
                i = 0;
            }
            W h5 = j7.h(vVar);
            if (h5 != null) {
                i10 = h5.f7945b;
            }
            if (i == 0) {
                i8 = -1;
            } else {
                i8 = X.f7954a[C1477r.h(i)];
            }
            if (!(i8 == -1 || i8 == 1)) {
                i10 = i;
            }
        }
        if (i10 == 2) {
            i9 = Math.min(i9, 6);
        } else if (i10 == 3) {
            i9 = Math.max(i9, 3);
        } else if (vVar.f8070f0) {
            if (vVar.r()) {
                i9 = Math.min(i9, 1);
            } else {
                i9 = Math.min(i9, -1);
            }
        }
        if (vVar.f8046B0 && vVar.f8059U < 5) {
            i9 = Math.min(i9, 4);
        }
        if (vVar.f8071g0) {
            i9 = Math.max(i9, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i9 + " for " + vVar);
        }
        return i9;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + vVar);
        }
        Bundle bundle3 = vVar.f8060V;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!vVar.f8050F0) {
            c cVar = this.f7924a;
            cVar.T(vVar, false);
            vVar.p0.Q();
            vVar.f8059U = 1;
            vVar.f8088y0 = false;
            vVar.f8053I0.a(new Fragment$6(vVar));
            vVar.x(bundle);
            vVar.f8050F0 = true;
            if (vVar.f8088y0) {
                vVar.f8053I0.d(C0485l.ON_CREATE);
                cVar.O(vVar, false);
                return;
            }
            throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onCreate()");
        }
        vVar.f8059U = 1;
        Bundle bundle4 = vVar.f8060V;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            vVar.p0.W(bundle2);
            L l8 = vVar.p0;
            l8.f7864H = false;
            l8.f7865I = false;
            l8.f7871O.f7908f = false;
            l8.u(1);
        }
    }

    public final void f() {
        Bundle bundle;
        String str;
        C0470v vVar = this.f7926c;
        if (!vVar.f8072h0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + vVar);
            }
            Bundle bundle2 = vVar.f8060V;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater B8 = vVar.B(bundle);
            ViewGroup viewGroup = vVar.f8089z0;
            if (viewGroup == null) {
                int i = vVar.f8082s0;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) vVar.f8078n0.f7894x.y(i);
                    if (viewGroup == null) {
                        if (!vVar.f8075k0 && !vVar.f8074j0) {
                            try {
                                str = vVar.m().getResourceName(vVar.f8082s0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(vVar.f8082s0) + " (" + str + ") for fragment " + vVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        H0.c cVar = d.f1812a;
                        d.b(new a(vVar, "Attempting to add fragment " + vVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        d.a(vVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + vVar + " for a container view with no id");
                }
            }
            vVar.f8089z0 = viewGroup;
            vVar.J(B8, viewGroup, bundle);
            if (vVar.f8045A0 != null) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "moveto VIEW_CREATED: " + vVar);
                }
                vVar.f8045A0.setSaveFromParentEnabled(false);
                vVar.f8045A0.setTag(2131362118, vVar);
                if (viewGroup != null) {
                    b();
                }
                if (vVar.f8084u0) {
                    vVar.f8045A0.setVisibility(8);
                }
                if (vVar.f8045A0.isAttachedToWindow()) {
                    View view = vVar.f8045A0;
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1551x.c(view);
                } else {
                    View view2 = vVar.f8045A0;
                    view2.addOnAttachStateChangeListener(new C3.q(1, view2));
                }
                Bundle bundle4 = vVar.f8060V;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                vVar.H(vVar.f8045A0, bundle3);
                vVar.p0.u(2);
                this.f7924a.Y(vVar, vVar.f8045A0, false);
                int visibility = vVar.f8045A0.getVisibility();
                vVar.g().f8042j = vVar.f8045A0.getAlpha();
                if (vVar.f8089z0 != null && visibility == 0) {
                    View findFocus = vVar.f8045A0.findFocus();
                    if (findFocus != null) {
                        vVar.g().f8043k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + vVar);
                        }
                    }
                    vVar.f8045A0.setAlpha(0.0f);
                }
            }
            vVar.f8059U = 2;
        }
    }

    public final void g() {
        boolean z;
        boolean z6;
        boolean z8;
        C0470v A8;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + vVar);
        }
        if (!vVar.f8070f0 || vVar.r()) {
            z = false;
        } else {
            z = true;
        }
        q qVar = this.f7925b;
        if (z) {
            qVar.m0(vVar.f8063Y, (Bundle) null);
        }
        if (!z) {
            N n4 = (N) qVar.f452X;
            if (n4.f7904a.containsKey(vVar.f8063Y) && n4.f7907d) {
                z8 = n4.e;
            } else {
                z8 = true;
            }
            if (!z8) {
                String str = vVar.f8066b0;
                if (!(str == null || (A8 = qVar.A(str)) == null || !A8.f8086w0)) {
                    vVar.f8065a0 = A8;
                }
                vVar.f8059U = 0;
                return;
            }
        }
        C0472x xVar = vVar.f8079o0;
        if (xVar instanceof P) {
            z6 = ((N) qVar.f452X).e;
        } else {
            C1022j jVar = xVar.f8093e0;
            if (jVar instanceof Activity) {
                z6 = !jVar.isChangingConfigurations();
            } else {
                z6 = true;
            }
        }
        if (z || z6) {
            ((N) qVar.f452X).b(vVar, false);
        }
        vVar.p0.l();
        vVar.f8053I0.d(C0485l.ON_DESTROY);
        vVar.f8059U = 0;
        vVar.f8050F0 = false;
        vVar.f8088y0 = true;
        this.f7924a.P(vVar, false);
        Iterator it = qVar.G().iterator();
        while (it.hasNext()) {
            Q q7 = (Q) it.next();
            if (q7 != null) {
                String str2 = vVar.f8063Y;
                C0470v vVar2 = q7.f7926c;
                if (str2.equals(vVar2.f8066b0)) {
                    vVar2.f8065a0 = vVar;
                    vVar2.f8066b0 = null;
                }
            }
        }
        String str3 = vVar.f8066b0;
        if (str3 != null) {
            vVar.f8065a0 = qVar.A(str3);
        }
        qVar.T(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + vVar);
        }
        ViewGroup viewGroup = vVar.f8089z0;
        if (!(viewGroup == null || (view = vVar.f8045A0) == null)) {
            viewGroup.removeView(view);
        }
        vVar.p0.u(1);
        if (vVar.f8045A0 != null) {
            T t8 = vVar.f8054J0;
            t8.f();
            if (t8.f7938X.f8156c.compareTo(C0486m.f8147W) >= 0) {
                vVar.f8054J0.b(C0485l.ON_DESTROY);
            }
        }
        vVar.f8059U = 1;
        vVar.f8088y0 = false;
        vVar.z();
        if (vVar.f8088y0) {
            j jVar = ((K0.a) new A1.d((r) vVar, vVar.d()).f36W).f2536a;
            if (jVar.f6311W <= 0) {
                vVar.f8076l0 = false;
                this.f7924a.Z(vVar, false);
                vVar.f8089z0 = null;
                vVar.f8045A0 = null;
                vVar.f8054J0 = null;
                vVar.f8055K0.j((Object) null);
                vVar.f8073i0 = false;
                return;
            }
            jVar.f6310V[0].getClass();
            throw new ClassCastException();
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + vVar);
        }
        vVar.f8059U = -1;
        vVar.f8088y0 = false;
        vVar.A();
        if (vVar.f8088y0) {
            L l8 = vVar.p0;
            if (!l8.f7866J) {
                l8.l();
                vVar.p0 = new L();
            }
            this.f7924a.Q(vVar, false);
            vVar.f8059U = -1;
            vVar.f8079o0 = null;
            vVar.f8080q0 = null;
            vVar.f8078n0 = null;
            if (!vVar.f8070f0 || vVar.r()) {
                N n4 = (N) this.f7925b.f452X;
                boolean z = true;
                if (n4.f7904a.containsKey(vVar.f8063Y) && n4.f7907d) {
                    z = n4.e;
                }
                if (!z) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "initState called for fragment: " + vVar);
            }
            vVar.o();
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onDetach()");
    }

    public final void j() {
        Bundle bundle;
        C0470v vVar = this.f7926c;
        if (vVar.f8072h0 && vVar.f8073i0 && !vVar.f8076l0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + vVar);
            }
            Bundle bundle2 = vVar.f8060V;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            vVar.J(vVar.B(bundle), (ViewGroup) null, bundle);
            View view = vVar.f8045A0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                vVar.f8045A0.setTag(2131362118, vVar);
                if (vVar.f8084u0) {
                    vVar.f8045A0.setVisibility(8);
                }
                Bundle bundle4 = vVar.f8060V;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                vVar.H(vVar.f8045A0, bundle3);
                vVar.p0.u(2);
                this.f7924a.Y(vVar, vVar.f8045A0, false);
                vVar.f8059U = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        q qVar = this.f7925b;
        boolean z = this.f7927d;
        C0470v vVar = this.f7926c;
        if (!z) {
            try {
                this.f7927d = true;
                boolean z6 = false;
                while (true) {
                    int d8 = d();
                    int i = vVar.f8059U;
                    int i8 = 3;
                    if (d8 != i) {
                        if (d8 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    vVar.f8059U = 1;
                                    break;
                                case 2:
                                    vVar.f8073i0 = false;
                                    vVar.f8059U = 2;
                                    break;
                                case 3:
                                    if (Log.isLoggable("FragmentManager", 3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + vVar);
                                    }
                                    if (vVar.f8045A0 != null && vVar.f8061W == null) {
                                        o();
                                    }
                                    if (!(vVar.f8045A0 == null || (viewGroup2 = vVar.f8089z0) == null)) {
                                        C0462m j7 = C0462m.j(viewGroup2, vVar.l());
                                        j7.getClass();
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + vVar);
                                        }
                                        j7.d(1, 3, this);
                                    }
                                    vVar.f8059U = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    vVar.f8059U = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(vVar.f8045A0 == null || (viewGroup3 = vVar.f8089z0) == null)) {
                                        C0462m j8 = C0462m.j(viewGroup3, vVar.l());
                                        int visibility = vVar.f8045A0.getVisibility();
                                        if (visibility == 0) {
                                            i8 = 2;
                                        } else if (visibility == 4) {
                                            i8 = 4;
                                        } else if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        j8.e(i8, this);
                                    }
                                    vVar.f8059U = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    vVar.f8059U = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z6 = true;
                    } else {
                        if (!z6 && i == -1 && vVar.f8070f0 && !vVar.r()) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + vVar);
                            }
                            ((N) qVar.f452X).b(vVar, true);
                            qVar.T(this);
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + vVar);
                            }
                            vVar.o();
                        }
                        if (vVar.f8049E0) {
                            if (!(vVar.f8045A0 == null || (viewGroup = vVar.f8089z0) == null)) {
                                C0462m j9 = C0462m.j(viewGroup, vVar.l());
                                if (vVar.f8084u0) {
                                    j9.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + vVar);
                                    }
                                    j9.d(3, 1, this);
                                } else {
                                    j9.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + vVar);
                                    }
                                    j9.d(2, 1, this);
                                }
                            }
                            L l8 = vVar.f8078n0;
                            if (l8 != null && vVar.f8069e0 && L.L(vVar)) {
                                l8.f7863G = true;
                            }
                            vVar.f8049E0 = false;
                            vVar.p0.o();
                        }
                        this.f7927d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f7927d = false;
                throw th;
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + vVar);
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + vVar);
        }
        vVar.p0.u(5);
        if (vVar.f8045A0 != null) {
            vVar.f8054J0.b(C0485l.ON_PAUSE);
        }
        vVar.f8053I0.d(C0485l.ON_PAUSE);
        vVar.f8059U = 6;
        vVar.f8088y0 = false;
        vVar.C();
        if (vVar.f8088y0) {
            this.f7924a.R(vVar, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onPause()");
    }

    public final void m(ClassLoader classLoader) {
        C0470v vVar = this.f7926c;
        Bundle bundle = vVar.f8060V;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (vVar.f8060V.getBundle("savedInstanceState") == null) {
                vVar.f8060V.putBundle("savedInstanceState", new Bundle());
            }
            try {
                vVar.f8061W = vVar.f8060V.getSparseParcelableArray("viewState");
                vVar.f8062X = vVar.f8060V.getBundle("viewRegistryState");
                P p3 = (P) vVar.f8060V.getParcelable("state");
                if (p3 != null) {
                    vVar.f8066b0 = p3.f7921g0;
                    vVar.f8067c0 = p3.f7922h0;
                    vVar.f8047C0 = p3.f7923i0;
                }
                if (!vVar.f8047C0) {
                    vVar.f8046B0 = true;
                }
            } catch (BadParcelableException e8) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + vVar, e8);
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + vVar);
        }
        C0469u uVar = vVar.f8048D0;
        if (uVar == null) {
            view = null;
        } else {
            view = uVar.f8043k;
        }
        if (view != null) {
            if (view != vVar.f8045A0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == vVar.f8045A0) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(vVar);
                sb.append(" resulting in focused view ");
                sb.append(vVar.f8045A0.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        vVar.g().f8043k = null;
        vVar.p0.Q();
        vVar.p0.z(true);
        vVar.f8059U = 7;
        vVar.f8088y0 = false;
        vVar.D();
        if (vVar.f8088y0) {
            t tVar = vVar.f8053I0;
            C0485l lVar = C0485l.ON_RESUME;
            tVar.d(lVar);
            if (vVar.f8045A0 != null) {
                vVar.f8054J0.f7938X.d(lVar);
            }
            L l8 = vVar.p0;
            l8.f7864H = false;
            l8.f7865I = false;
            l8.f7871O.f7908f = false;
            l8.u(7);
            this.f7924a.U(vVar, false);
            this.f7925b.m0(vVar.f8063Y, (Bundle) null);
            vVar.f8060V = null;
            vVar.f8061W = null;
            vVar.f8062X = null;
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onResume()");
    }

    public final void o() {
        C0470v vVar = this.f7926c;
        if (vVar.f8045A0 != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + vVar + " with view " + vVar.f8045A0);
            }
            SparseArray sparseArray = new SparseArray();
            vVar.f8045A0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                vVar.f8061W = sparseArray;
            }
            Bundle bundle = new Bundle();
            vVar.f8054J0.f7939Y.k(bundle);
            if (!bundle.isEmpty()) {
                vVar.f8062X = bundle;
            }
        }
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + vVar);
        }
        vVar.p0.Q();
        vVar.p0.z(true);
        vVar.f8059U = 5;
        vVar.f8088y0 = false;
        vVar.F();
        if (vVar.f8088y0) {
            t tVar = vVar.f8053I0;
            C0485l lVar = C0485l.ON_START;
            tVar.d(lVar);
            if (vVar.f8045A0 != null) {
                vVar.f8054J0.f7938X.d(lVar);
            }
            L l8 = vVar.p0;
            l8.f7864H = false;
            l8.f7865I = false;
            l8.f7871O.f7908f = false;
            l8.u(5);
            this.f7924a.W(vVar, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onStart()");
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0470v vVar = this.f7926c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + vVar);
        }
        L l8 = vVar.p0;
        l8.f7865I = true;
        l8.f7871O.f7908f = true;
        l8.u(4);
        if (vVar.f8045A0 != null) {
            vVar.f8054J0.b(C0485l.ON_STOP);
        }
        vVar.f8053I0.d(C0485l.ON_STOP);
        vVar.f8059U = 4;
        vVar.f8088y0 = false;
        vVar.G();
        if (vVar.f8088y0) {
            this.f7924a.X(vVar, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + vVar + " did not call through to super.onStop()");
    }

    public Q(c cVar, q qVar, ClassLoader classLoader, F f8, Bundle bundle) {
        this.f7924a = cVar;
        this.f7925b = qVar;
        P p3 = (P) bundle.getParcelable("state");
        C0470v a8 = f8.a(p3.f7909U);
        a8.f8063Y = p3.f7910V;
        a8.f8072h0 = p3.f7911W;
        a8.f8074j0 = p3.f7912X;
        a8.f8075k0 = true;
        a8.f8081r0 = p3.f7913Y;
        a8.f8082s0 = p3.f7914Z;
        a8.f8083t0 = p3.f7915a0;
        a8.f8086w0 = p3.f7916b0;
        a8.f8070f0 = p3.f7917c0;
        a8.f8085v0 = p3.f7918d0;
        a8.f8084u0 = p3.f7919e0;
        a8.f8052H0 = C0486m.values()[p3.f7920f0];
        a8.f8066b0 = p3.f7921g0;
        a8.f8067c0 = p3.f7922h0;
        a8.f8047C0 = p3.f7923i0;
        this.f7926c = a8;
        a8.f8060V = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a8.N(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a8);
        }
    }

    public Q(c cVar, q qVar, C0470v vVar, Bundle bundle) {
        this.f7924a = cVar;
        this.f7925b = qVar;
        this.f7926c = vVar;
        vVar.f8061W = null;
        vVar.f8062X = null;
        vVar.f8077m0 = 0;
        vVar.f8073i0 = false;
        vVar.f8069e0 = false;
        C0470v vVar2 = vVar.f8065a0;
        vVar.f8066b0 = vVar2 != null ? vVar2.f8063Y : null;
        vVar.f8065a0 = null;
        vVar.f8060V = bundle;
        vVar.f8064Z = bundle.getBundle("arguments");
    }
}
