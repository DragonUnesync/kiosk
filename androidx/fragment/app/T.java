package androidx.fragment.app;

import J0.c;
import U.p;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0481h;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.t;
import b2.C0526e;
import b2.C0527f;
import com.bumptech.glide.manager.q;
import java.util.LinkedHashMap;

public final class T implements C0481h, C0527f, P {

    /* renamed from: U  reason: collision with root package name */
    public final C0470v f7935U;

    /* renamed from: V  reason: collision with root package name */
    public final O f7936V;

    /* renamed from: W  reason: collision with root package name */
    public final p f7937W;

    /* renamed from: X  reason: collision with root package name */
    public t f7938X = null;

    /* renamed from: Y  reason: collision with root package name */
    public q f7939Y = null;

    public T(C0470v vVar, O o2, p pVar) {
        this.f7935U = vVar;
        this.f7936V = o2;
        this.f7937W = pVar;
    }

    public final C0526e a() {
        f();
        return (C0526e) this.f7939Y.f9082X;
    }

    public final void b(C0485l lVar) {
        this.f7938X.d(lVar);
    }

    public final c c() {
        Application application;
        C0470v vVar = this.f7935U;
        Context applicationContext = vVar.K().getApplicationContext();
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
        c cVar = new c();
        LinkedHashMap linkedHashMap = cVar.f2338a;
        if (application != null) {
            linkedHashMap.put(N.f8129a, application);
        }
        linkedHashMap.put(J.f8119a, vVar);
        linkedHashMap.put(J.f8120b, this);
        Bundle bundle = vVar.f8064Z;
        if (bundle != null) {
            linkedHashMap.put(J.f8121c, bundle);
        }
        return cVar;
    }

    public final O d() {
        f();
        return this.f7936V;
    }

    public final t e() {
        f();
        return this.f7938X;
    }

    public final void f() {
        if (this.f7938X == null) {
            this.f7938X = new t(this);
            q qVar = new q((C0527f) this);
            this.f7939Y = qVar;
            qVar.h();
            this.f7937W.run();
        }
    }
}
