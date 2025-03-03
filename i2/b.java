package I2;

import H2.q;
import H2.r;
import H2.w;
import N5.f;
import S3.a;
import Y.i;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import d4.k;
import h.C1000A;
import java.io.File;
import n.t;
import o0.C1308a;

public abstract class b implements r {

    /* renamed from: U  reason: collision with root package name */
    public Object f2257U;

    /* renamed from: V  reason: collision with root package name */
    public Object f2258V;

    public b(Context context) {
        this.f2257U = context;
    }

    public void c() {
        f fVar = (f) this.f2257U;
        if (fVar != null) {
            try {
                ((C1000A) this.f2258V).f12078e0.unregisterReceiver(fVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f2257U = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof C1308a)) {
            return menuItem;
        }
        C1308a aVar = (C1308a) menuItem;
        if (((i) this.f2258V) == null) {
            this.f2258V = new i((Object) null);
        }
        MenuItem menuItem2 = (MenuItem) ((i) this.f2258V).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        t tVar = new t((Context) this.f2257U, aVar);
        ((i) this.f2258V).put(aVar, tVar);
        return tVar;
    }

    public abstract void g();

    public abstract String h();

    public void i() {
        c();
        IntentFilter d8 = d();
        if (d8.countActions() != 0) {
            if (((f) this.f2257U) == null) {
                this.f2257U = new f(11, this);
            }
            ((C1000A) this.f2258V).f12078e0.registerReceiver((f) this.f2257U, d8);
        }
    }

    public q m0(w wVar) {
        Class cls = (Class) this.f2258V;
        return new e((Context) this.f2257U, wVar.b(File.class, cls), wVar.b(Uri.class, cls), cls);
    }

    public b(a aVar) {
        this.f2257U = aVar;
        this.f2258V = new k(aVar);
    }

    public b(Context context, Class cls) {
        this.f2257U = context;
        this.f2258V = cls;
    }

    public b(C1000A a8) {
        this.f2258V = a8;
    }
}
