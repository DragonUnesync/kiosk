package B;

import A.g;
import D.C0048i;
import D.C0071z;
import D7.b;
import F.a;
import G.h;
import G.i;
import M.f;
import a0.j;
import a0.m;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bumptech.glide.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import u0.C1486a;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f306a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Size f307b;

    /* renamed from: c  reason: collision with root package name */
    public final C0022x f308c;

    /* renamed from: d  reason: collision with root package name */
    public final C0071z f309d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final m f310f;

    /* renamed from: g  reason: collision with root package name */
    public final j f311g;

    /* renamed from: h  reason: collision with root package name */
    public final m f312h;
    public final j i;

    /* renamed from: j  reason: collision with root package name */
    public final j f313j;

    /* renamed from: k  reason: collision with root package name */
    public final p0 f314k;

    /* renamed from: l  reason: collision with root package name */
    public C0010k f315l;

    /* renamed from: m  reason: collision with root package name */
    public s0 f316m;

    /* renamed from: n  reason: collision with root package name */
    public Executor f317n;

    static {
        Range range = C0048i.f903f;
    }

    public t0(Size size, C0071z zVar, boolean z, C0022x xVar, f fVar) {
        this.f307b = size;
        this.f309d = zVar;
        this.e = z;
        this.f308c = xVar;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        m i8 = d.i(new m0(atomicReference, str, 0));
        j jVar = (j) atomicReference.get();
        jVar.getClass();
        this.f313j = jVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        m i9 = d.i(new m0(atomicReference2, str, 1));
        this.f312h = i9;
        i9.d(new h(i9, 0, new A1.d(jVar, 2, i8)), b.l());
        j jVar2 = (j) atomicReference2.get();
        jVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        m i10 = d.i(new m0(atomicReference3, str, 2));
        this.f310f = i10;
        j jVar3 = (j) atomicReference3.get();
        jVar3.getClass();
        this.f311g = jVar3;
        p0 p0Var = new p0(this, size);
        this.f314k = p0Var;
        L3.b d8 = i.d(p0Var.e);
        i10.d(new h(i10, 0, new q0((Object) d8, (Object) jVar2, (Object) str, 0)), b.l());
        d8.d(new n0(this, 0), b.l());
        a l8 = b.l();
        AtomicReference atomicReference4 = new AtomicReference((Object) null);
        m i11 = d.i(new g(this, 3, atomicReference4));
        i11.d(new h(i11, 0, new A.f(5, (Object) fVar)), l8);
        j jVar4 = (j) atomicReference4.get();
        jVar4.getClass();
        this.i = jVar4;
    }

    public final void a(Surface surface, Executor executor, C1486a aVar) {
        if (!this.f311g.a(surface)) {
            m mVar = this.f310f;
            if (!mVar.isCancelled()) {
                n2.a.m((String) null, mVar.f7017V.isDone());
                try {
                    mVar.get();
                    executor.execute(new o0(aVar, surface, 0));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new o0(aVar, surface, 1));
                    return;
                }
            }
        }
        A1.d dVar = new A1.d(aVar, 3, surface);
        m mVar2 = this.f312h;
        mVar2.d(new h(mVar2, 0, dVar), executor);
    }

    public final void b(Executor executor, s0 s0Var) {
        C0010k kVar;
        synchronized (this.f306a) {
            this.f316m = s0Var;
            this.f317n = executor;
            kVar = this.f315l;
        }
        if (kVar != null) {
            executor.execute(new l0(s0Var, kVar, 1));
        }
    }

    public final void c() {
        this.f311g.b(new Exception("Surface request will not complete."));
    }
}
