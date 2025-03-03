package androidx.fragment.app;

import C0.e;
import F.h;
import J0.c;
import P6.f;
import U.p;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0481h;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import b2.C0526e;
import b2.C0527f;
import com.bumptech.glide.manager.q;
import h.C1022j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.fragment.app.v  reason: case insensitive filesystem */
public abstract class C0470v implements ComponentCallbacks, View.OnCreateContextMenuListener, r, P, C0481h, C0527f {

    /* renamed from: O0  reason: collision with root package name */
    public static final Object f8044O0 = new Object();

    /* renamed from: A0  reason: collision with root package name */
    public View f8045A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f8046B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f8047C0 = true;

    /* renamed from: D0  reason: collision with root package name */
    public C0469u f8048D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f8049E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f8050F0;

    /* renamed from: G0  reason: collision with root package name */
    public String f8051G0;

    /* renamed from: H0  reason: collision with root package name */
    public C0486m f8052H0;

    /* renamed from: I0  reason: collision with root package name */
    public t f8053I0;

    /* renamed from: J0  reason: collision with root package name */
    public T f8054J0;

    /* renamed from: K0  reason: collision with root package name */
    public final z f8055K0;

    /* renamed from: L0  reason: collision with root package name */
    public q f8056L0;

    /* renamed from: M0  reason: collision with root package name */
    public final ArrayList f8057M0;

    /* renamed from: N0  reason: collision with root package name */
    public final C0467s f8058N0;

    /* renamed from: U  reason: collision with root package name */
    public int f8059U = -1;

    /* renamed from: V  reason: collision with root package name */
    public Bundle f8060V;

    /* renamed from: W  reason: collision with root package name */
    public SparseArray f8061W;

    /* renamed from: X  reason: collision with root package name */
    public Bundle f8062X;

    /* renamed from: Y  reason: collision with root package name */
    public String f8063Y = UUID.randomUUID().toString();

    /* renamed from: Z  reason: collision with root package name */
    public Bundle f8064Z;

    /* renamed from: a0  reason: collision with root package name */
    public C0470v f8065a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f8066b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public int f8067c0;

    /* renamed from: d0  reason: collision with root package name */
    public Boolean f8068d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8069e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f8070f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f8071g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f8072h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f8073i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f8074j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8075k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8076l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f8077m0;

    /* renamed from: n0  reason: collision with root package name */
    public L f8078n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0472x f8079o0;
    public L p0 = new L();

    /* renamed from: q0  reason: collision with root package name */
    public C0470v f8080q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f8081r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f8082s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f8083t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f8084u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f8085v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f8086w0;

    /* renamed from: x0  reason: collision with root package name */
    public final boolean f8087x0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f8088y0;

    /* renamed from: z0  reason: collision with root package name */
    public ViewGroup f8089z0;

    /* JADX WARNING: type inference failed for: r0v8, types: [androidx.lifecycle.x, androidx.lifecycle.z] */
    public C0470v() {
        new e(13, this);
        this.f8052H0 = C0486m.f8149Y;
        this.f8055K0 = new x();
        new AtomicInteger();
        this.f8057M0 = new ArrayList();
        this.f8058N0 = new C0467s(this);
        n();
    }

    public void A() {
        this.f8088y0 = true;
    }

    public LayoutInflater B(Bundle bundle) {
        C0472x xVar = this.f8079o0;
        if (xVar != null) {
            C1022j jVar = xVar.f8096h0;
            LayoutInflater cloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
            cloneInContext.setFactory2(this.p0.f7877f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void C() {
        this.f8088y0 = true;
    }

    public void D() {
        this.f8088y0 = true;
    }

    public void E(Bundle bundle) {
    }

    public void F() {
        this.f8088y0 = true;
    }

    public void G() {
        this.f8088y0 = true;
    }

    public void H(View view, Bundle bundle) {
    }

    public void I(Bundle bundle) {
        this.f8088y0 = true;
    }

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p0.Q();
        this.f8076l0 = true;
        this.f8054J0 = new T(this, d(), new p(11, (Object) this));
        View y8 = y(layoutInflater, viewGroup, bundle);
        this.f8045A0 = y8;
        if (y8 != null) {
            this.f8054J0.f();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f8045A0 + " for Fragment " + this);
            }
            J.b(this.f8045A0, this.f8054J0);
            View view = this.f8045A0;
            T t8 = this.f8054J0;
            f.e(view, "<this>");
            view.setTag(2131362626, t8);
            R.e.t(this.f8045A0, this.f8054J0);
            this.f8055K0.j(this.f8054J0);
        } else if (this.f8054J0.f7938X == null) {
            this.f8054J0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final Context K() {
        Context j7 = j();
        if (j7 != null) {
            return j7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View L() {
        View view = this.f8045A0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void M(int i, int i8, int i9, int i10) {
        if (this.f8048D0 != null || i != 0 || i8 != 0 || i9 != 0 || i10 != 0) {
            g().f8036b = i;
            g().f8037c = i8;
            g().f8038d = i9;
            g().e = i10;
        }
    }

    public final void N(Bundle bundle) {
        L l8 = this.f8078n0;
        if (l8 == null || (!l8.f7864H && !l8.f7865I)) {
            this.f8064Z = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final C0526e a() {
        return (C0526e) this.f8056L0.f9082X;
    }

    public final c c() {
        Application application;
        Context applicationContext = K().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        c cVar = new c();
        LinkedHashMap linkedHashMap = cVar.f2338a;
        if (application != null) {
            linkedHashMap.put(N.f8129a, application);
        }
        linkedHashMap.put(J.f8119a, this);
        linkedHashMap.put(J.f8120b, this);
        Bundle bundle = this.f8064Z;
        if (bundle != null) {
            linkedHashMap.put(J.f8121c, bundle);
        }
        return cVar;
    }

    public final O d() {
        if (this.f8078n0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (k() != 1) {
            HashMap hashMap = this.f8078n0.f7871O.f7906c;
            O o2 = (O) hashMap.get(this.f8063Y);
            if (o2 != null) {
                return o2;
            }
            O o8 = new O();
            hashMap.put(this.f8063Y, o8);
            return o8;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final t e() {
        return this.f8053I0;
    }

    public h f() {
        return new C0468t(this);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.u, java.lang.Object] */
    public final C0469u g() {
        if (this.f8048D0 == null) {
            ? obj = new Object();
            Object obj2 = f8044O0;
            obj.f8040g = obj2;
            obj.f8041h = obj2;
            obj.i = obj2;
            obj.f8042j = 1.0f;
            obj.f8043k = null;
            this.f8048D0 = obj;
        }
        return this.f8048D0;
    }

    public final C1022j h() {
        C0472x xVar = this.f8079o0;
        if (xVar == null) {
            return null;
        }
        return xVar.f8092d0;
    }

    public final L i() {
        if (this.f8079o0 != null) {
            return this.p0;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context j() {
        C0472x xVar = this.f8079o0;
        if (xVar == null) {
            return null;
        }
        return xVar.f8093e0;
    }

    public final int k() {
        C0486m mVar = this.f8052H0;
        if (mVar == C0486m.f8146V || this.f8080q0 == null) {
            return mVar.ordinal();
        }
        return Math.min(mVar.ordinal(), this.f8080q0.k());
    }

    public final L l() {
        L l8 = this.f8078n0;
        if (l8 != null) {
            return l8;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Resources m() {
        return K().getResources();
    }

    public final void n() {
        Bundle bundle;
        this.f8053I0 = new t(this);
        this.f8056L0 = new q((C0527f) this);
        ArrayList arrayList = this.f8057M0;
        C0467s sVar = this.f8058N0;
        if (arrayList.contains(sVar)) {
            return;
        }
        if (this.f8059U >= 0) {
            C0470v vVar = sVar.f8033a;
            vVar.f8056L0.h();
            J.a(vVar);
            Bundle bundle2 = vVar.f8060V;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            vVar.f8056L0.i(bundle);
            return;
        }
        arrayList.add(sVar);
    }

    public final void o() {
        n();
        this.f8051G0 = this.f8063Y;
        this.f8063Y = UUID.randomUUID().toString();
        this.f8069e0 = false;
        this.f8070f0 = false;
        this.f8072h0 = false;
        this.f8073i0 = false;
        this.f8075k0 = false;
        this.f8077m0 = 0;
        this.f8078n0 = null;
        this.p0 = new L();
        this.f8079o0 = null;
        this.f8081r0 = 0;
        this.f8082s0 = 0;
        this.f8083t0 = null;
        this.f8084u0 = false;
        this.f8085v0 = false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f8088y0 = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C1022j h5 = h();
        if (h5 != null) {
            h5.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final void onLowMemory() {
        this.f8088y0 = true;
    }

    public final boolean p() {
        if (this.f8079o0 == null || !this.f8069e0) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        boolean z;
        if (!this.f8084u0) {
            L l8 = this.f8078n0;
            if (l8 == null) {
                return false;
            }
            C0470v vVar = this.f8080q0;
            l8.getClass();
            if (vVar == null) {
                z = false;
            } else {
                z = vVar.q();
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean r() {
        if (this.f8077m0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        View view;
        if (!p() || q() || (view = this.f8045A0) == null || view.getWindowToken() == null || this.f8045A0.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void t() {
        this.f8088y0 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f8063Y);
        if (this.f8081r0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8081r0));
        }
        if (this.f8083t0 != null) {
            sb.append(" tag=");
            sb.append(this.f8083t0);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u(int i, int i8, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i8 + " data: " + intent);
        }
    }

    public void v(Activity activity) {
        this.f8088y0 = true;
    }

    public void w(C1022j jVar) {
        C1022j jVar2;
        this.f8088y0 = true;
        C0472x xVar = this.f8079o0;
        if (xVar == null) {
            jVar2 = null;
        } else {
            jVar2 = xVar.f8092d0;
        }
        if (jVar2 != null) {
            this.f8088y0 = false;
            v(jVar2);
        }
    }

    public void x(Bundle bundle) {
        Bundle bundle2;
        this.f8088y0 = true;
        Bundle bundle3 = this.f8060V;
        if (!(bundle3 == null || (bundle2 = bundle3.getBundle("childFragmentManager")) == null)) {
            this.p0.W(bundle2);
            L l8 = this.p0;
            l8.f7864H = false;
            l8.f7865I = false;
            l8.f7871O.f7908f = false;
            l8.u(1);
        }
        L l9 = this.p0;
        if (l9.f7892v < 1) {
            l9.f7864H = false;
            l9.f7865I = false;
            l9.f7871O.f7908f = false;
            l9.u(1);
        }
    }

    public View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void z() {
        this.f8088y0 = true;
    }
}
