package l1;

import P0.l;
import W1.e;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import m1.C1206a;

public final class p implements q {

    /* renamed from: X  reason: collision with root package name */
    public static final e f13147X = new e(-9223372036854775807L, 0, false);

    /* renamed from: Y  reason: collision with root package name */
    public static final e f13148Y = new e(-9223372036854775807L, 2, false);

    /* renamed from: Z  reason: collision with root package name */
    public static final e f13149Z = new e(-9223372036854775807L, 3, false);

    /* renamed from: U  reason: collision with root package name */
    public final C1206a f13150U;

    /* renamed from: V  reason: collision with root package name */
    public l f13151V;

    /* renamed from: W  reason: collision with root package name */
    public IOException f13152W;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            java.lang.String r1 = "ExoPlayer:Loader:"
            java.lang.String r3 = u.C1477r.d(r1, r3)
            int r1 = P0.z.f3748a
            P0.y r1 = new P0.y
            r1.<init>(r3, r0)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            l1.j r1 = new l1.j
            r1.<init>(r0)
            m1.a r0 = new m1.a
            r0.<init>(r3, r1)
            r2.<init>((m1.C1206a) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.p.<init>(java.lang.String):void");
    }

    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f13152W;
        if (iOException2 == null) {
            l lVar = this.f13151V;
            if (lVar != null && (iOException = lVar.f13141Y) != null && lVar.f13142Z > lVar.f13137U) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void b() {
        l lVar = this.f13151V;
        l.k(lVar);
        lVar.a(false);
    }

    public final boolean c() {
        if (this.f13152W != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f13151V != null) {
            return true;
        }
        return false;
    }

    public final void e(n nVar) {
        l lVar = this.f13151V;
        if (lVar != null) {
            lVar.a(true);
        }
        C1206a aVar = this.f13150U;
        if (nVar != null) {
            aVar.execute(new C0.e(22, nVar));
        }
        j jVar = aVar.f13342V;
        aVar.f13341U.shutdown();
    }

    public final long f(m mVar, k kVar, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        l.k(myLooper);
        this.f13152W = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l lVar = new l(this, myLooper, mVar, kVar, i, elapsedRealtime);
        if (this.f13151V == null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.f13151V = lVar;
        lVar.b();
        return elapsedRealtime;
    }

    public p(C1206a aVar) {
        this.f13150U = aVar;
    }
}
