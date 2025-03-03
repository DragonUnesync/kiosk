package androidx.activity;

import D2.p;
import J0.c;
import O6.a;
import P6.f;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.E;
import androidx.lifecycle.C0481h;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.t;
import b2.C0526e;
import b2.C0527f;
import com.bumptech.glide.manager.q;
import d.C0626a;
import g7.C0996d;
import h.C1022j;
import j0.h;
import j0.i;
import j0.m;
import j0.n;
import j0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import k0.d;
import k0.e;
import u0.C1486a;
import v0.C1537j;

public abstract class k extends h implements P, C0481h, C0527f, v, androidx.activity.result.h, d, e, m, n, C1537j {

    /* renamed from: V  reason: collision with root package name */
    public final p f7288V = new p();

    /* renamed from: W  reason: collision with root package name */
    public final d4.k f7289W;

    /* renamed from: X  reason: collision with root package name */
    public final t f7290X;

    /* renamed from: Y  reason: collision with root package name */
    public final q f7291Y;

    /* renamed from: Z  reason: collision with root package name */
    public O f7292Z;

    /* renamed from: a0  reason: collision with root package name */
    public u f7293a0;

    /* renamed from: b0  reason: collision with root package name */
    public final j f7294b0;

    /* renamed from: c0  reason: collision with root package name */
    public final q f7295c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AtomicInteger f7296d0;

    /* renamed from: e0  reason: collision with root package name */
    public final g f7297e0;

    /* renamed from: f0  reason: collision with root package name */
    public final CopyOnWriteArrayList f7298f0;

    /* renamed from: g0  reason: collision with root package name */
    public final CopyOnWriteArrayList f7299g0;

    /* renamed from: h0  reason: collision with root package name */
    public final CopyOnWriteArrayList f7300h0;

    /* renamed from: i0  reason: collision with root package name */
    public final CopyOnWriteArrayList f7301i0;

    /* renamed from: j0  reason: collision with root package name */
    public final CopyOnWriteArrayList f7302j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7303k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7304l0;

    /* JADX WARNING: type inference failed for: r3v14, types: [androidx.activity.ImmLeaksCleaner, androidx.lifecycle.q, java.lang.Object] */
    public k() {
        C1022j jVar = (C1022j) this;
        this.f7289W = new d4.k((Runnable) new U.p(7, (Object) jVar));
        t tVar = new t(this);
        this.f7290X = tVar;
        q qVar = new q((C0527f) this);
        this.f7291Y = qVar;
        this.f7293a0 = null;
        j jVar2 = new j(jVar);
        this.f7294b0 = jVar2;
        this.f7295c0 = new q(jVar2, new d(jVar));
        this.f7296d0 = new AtomicInteger();
        this.f7297e0 = new g(jVar);
        this.f7298f0 = new CopyOnWriteArrayList();
        this.f7299g0 = new CopyOnWriteArrayList();
        this.f7300h0 = new CopyOnWriteArrayList();
        this.f7301i0 = new CopyOnWriteArrayList();
        this.f7302j0 = new CopyOnWriteArrayList();
        this.f7303k0 = false;
        this.f7304l0 = false;
        int i = Build.VERSION.SDK_INT;
        tVar.a(new ComponentActivity$2(jVar));
        tVar.a(new ComponentActivity$3(jVar));
        tVar.a(new ComponentActivity$4(jVar));
        qVar.h();
        J.a(this);
        if (i <= 23) {
            ? obj = new Object();
            obj.f7267U = this;
            tVar.a(obj);
        }
        ((C0526e) qVar.f9082X).e("android:support:activity-result", new e(0, jVar));
        h(new f(jVar, 0));
    }

    public final C0526e a() {
        return (C0526e) this.f7291Y.f9082X;
    }

    public final c c() {
        c cVar = new c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2338a;
        if (application != null) {
            linkedHashMap.put(N.f8129a, getApplication());
        }
        linkedHashMap.put(J.f8119a, this);
        linkedHashMap.put(J.f8120b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            linkedHashMap.put(J.f8121c, getIntent().getExtras());
        }
        return cVar;
    }

    public final O d() {
        if (getApplication() != null) {
            if (this.f7292Z == null) {
                i iVar = (i) getLastNonConfigurationInstance();
                if (iVar != null) {
                    this.f7292Z = iVar.f7283a;
                }
                if (this.f7292Z == null) {
                    this.f7292Z = new O();
                }
            }
            return this.f7292Z;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final t e() {
        return this.f7290X;
    }

    public final void g(C1486a aVar) {
        this.f7298f0.add(aVar);
    }

    public final void h(C0626a aVar) {
        p pVar = this.f7288V;
        pVar.getClass();
        if (((k) pVar.f1140U) != null) {
            aVar.a();
        }
        ((CopyOnWriteArraySet) pVar.f1141V).add(aVar);
    }

    public final u i() {
        if (this.f7293a0 == null) {
            this.f7293a0 = new u(new C0.e(11, this));
            this.f7290X.a(new ComponentActivity$6(this));
        }
        return this.f7293a0;
    }

    public void onActivityResult(int i, int i8, Intent intent) {
        if (!this.f7297e0.a(i, i8, intent)) {
            super.onActivityResult(i, i8, intent);
        }
    }

    public void onBackPressed() {
        i().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f7298f0.iterator();
        while (it.hasNext()) {
            ((C1486a) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f7291Y.i(bundle);
        p pVar = this.f7288V;
        pVar.getClass();
        pVar.f1140U = this;
        Iterator it = ((CopyOnWriteArraySet) pVar.f1141V).iterator();
        while (it.hasNext()) {
            ((C0626a) it.next()).a();
        }
        super.onCreate(bundle);
        int i = H.f8116V;
        F.b(this);
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f7289W.f9767W).iterator();
        while (it.hasNext()) {
            ((E) it.next()).f7842a.k();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7289W.f9767W).iterator();
        while (it.hasNext()) {
            if (((E) it.next()).f7842a.p()) {
                return true;
            }
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.f7303k0) {
            Iterator it = this.f7301i0.iterator();
            while (it.hasNext()) {
                ((C1486a) it.next()).accept(new i(z));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f7300h0.iterator();
        while (it.hasNext()) {
            ((C1486a) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f7289W.f9767W).iterator();
        while (it.hasNext()) {
            ((E) it.next()).f7842a.q();
        }
        super.onPanelClosed(i, menu);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        if (!this.f7304l0) {
            Iterator it = this.f7302j0.iterator();
            while (it.hasNext()) {
                ((C1486a) it.next()).accept(new o(z));
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f7289W.f9767W).iterator();
        while (it.hasNext()) {
            ((E) it.next()).f7842a.t();
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f7297e0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, androidx.activity.i] */
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        O o2 = this.f7292Z;
        if (o2 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            o2 = iVar.f7283a;
        }
        if (o2 == null) {
            return null;
        }
        ? obj = new Object();
        obj.f7283a = o2;
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
        t tVar = this.f7290X;
        if (tVar instanceof t) {
            C0486m mVar = C0486m.f8147W;
            tVar.c("setCurrentState");
            tVar.e(mVar);
        }
        super.onSaveInstanceState(bundle);
        this.f7291Y.k(bundle);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f7299g0.iterator();
        while (it.hasNext()) {
            ((C1486a) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (F.h.t()) {
                Trace.beginSection(F.h.H("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            q qVar = this.f7295c0;
            synchronized (qVar.f9081W) {
                qVar.f9080V = true;
                Iterator it = ((ArrayList) qVar.f9082X).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).invoke();
                }
                ((ArrayList) qVar.f9082X).clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        J.b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        f.e(decorView, "<this>");
        decorView.setTag(2131362626, this);
        R.e.t(getWindow().getDecorView(), this);
        C0996d.y(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        f.e(decorView2, "<this>");
        decorView2.setTag(2131362414, this);
        View decorView3 = getWindow().getDecorView();
        j jVar = this.f7294b0;
        if (!jVar.f7286W) {
            jVar.f7286W = true;
            decorView3.getViewTreeObserver().addOnDrawListener(jVar);
        }
        super.setContentView(view);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f7303k0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f7303k0 = false;
            Iterator it = this.f7301i0.iterator();
            while (it.hasNext()) {
                f.e(configuration, "newConfig");
                ((C1486a) it.next()).accept(new i(z));
            }
        } catch (Throwable th) {
            this.f7303k0 = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f7304l0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f7304l0 = false;
            Iterator it = this.f7302j0.iterator();
            while (it.hasNext()) {
                f.e(configuration, "newConfig");
                ((C1486a) it.next()).accept(new o(z));
            }
        } catch (Throwable th) {
            this.f7304l0 = false;
            throw th;
        }
    }
}
