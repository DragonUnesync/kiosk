package D;

import B.C0002c;
import D7.b;
import F.h;
import G.k;
import a0.j;
import a0.m;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.d;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class N {

    /* renamed from: k  reason: collision with root package name */
    public static final Size f818k = new Size(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f819l = h.s("DeferrableSurface");

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicInteger f820m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicInteger f821n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f822a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f823b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f824c = false;

    /* renamed from: d  reason: collision with root package name */
    public j f825d;
    public final m e;

    /* renamed from: f  reason: collision with root package name */
    public j f826f;

    /* renamed from: g  reason: collision with root package name */
    public final m f827g;

    /* renamed from: h  reason: collision with root package name */
    public final Size f828h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public Class f829j;

    public N(Size size, int i8) {
        this.f828h = size;
        this.i = i8;
        m i9 = d.i(new L(this, 0));
        this.e = i9;
        this.f827g = d.i(new L(this, 1));
        if (h.s("DeferrableSurface")) {
            e(f821n.incrementAndGet(), f820m.get(), "Surface created");
            i9.f7017V.d(new C0002c((Object) this, 5, (Object) Log.getStackTraceString(new Exception())), b.l());
        }
    }

    public void a() {
        j jVar;
        synchronized (this.f822a) {
            try {
                if (!this.f824c) {
                    this.f824c = true;
                    this.f826f.a((Object) null);
                    if (this.f823b == 0) {
                        jVar = this.f825d;
                        this.f825d = null;
                    } else {
                        jVar = null;
                    }
                    if (h.s("DeferrableSurface")) {
                        h.j("DeferrableSurface", "surface closed,  useCount=" + this.f823b + " closed=true " + this);
                    }
                } else {
                    jVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (jVar != null) {
            jVar.a((Object) null);
        }
    }

    public final void b() {
        j jVar;
        synchronized (this.f822a) {
            try {
                int i8 = this.f823b;
                if (i8 != 0) {
                    int i9 = i8 - 1;
                    this.f823b = i9;
                    if (i9 != 0 || !this.f824c) {
                        jVar = null;
                    } else {
                        jVar = this.f825d;
                        this.f825d = null;
                    }
                    if (h.s("DeferrableSurface")) {
                        h.j("DeferrableSurface", "use count-1,  useCount=" + this.f823b + " closed=" + this.f824c + " " + this);
                        if (this.f823b == 0) {
                            e(f821n.get(), f820m.decrementAndGet(), "Surface no longer in use");
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.a((Object) null);
        }
    }

    public final L3.b c() {
        synchronized (this.f822a) {
            try {
                if (this.f824c) {
                    k kVar = new k(1, new M("DeferrableSurface already closed.", this));
                    return kVar;
                }
                L3.b f8 = f();
                return f8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f822a) {
            try {
                int i8 = this.f823b;
                if (i8 == 0) {
                    if (this.f824c) {
                        throw new M("Cannot begin use on a closed surface.", this);
                    }
                }
                this.f823b = i8 + 1;
                if (h.s("DeferrableSurface")) {
                    if (this.f823b == 1) {
                        e(f821n.get(), f820m.incrementAndGet(), "New surface in use");
                    }
                    h.j("DeferrableSurface", "use count+1, useCount=" + this.f823b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i8, int i9, String str) {
        if (!f819l && h.s("DeferrableSurface")) {
            h.j("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        h.j("DeferrableSurface", str + "[total_surfaces=" + i8 + ", used_surfaces=" + i9 + "](" + this + "}");
    }

    public abstract L3.b f();
}
