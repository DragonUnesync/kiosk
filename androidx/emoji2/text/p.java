package androidx.emoji2.text;

import B.C0003d;
import P0.y;
import V1.C0347f;
import a1.C0410a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n2.a;
import r0.C1369c;
import r0.C1370d;
import r0.C1374h;
import u.C1477r;

public final class p implements i {

    /* renamed from: U  reason: collision with root package name */
    public final Context f7808U;

    /* renamed from: V  reason: collision with root package name */
    public final C1370d f7809V;

    /* renamed from: W  reason: collision with root package name */
    public final C0410a f7810W;

    /* renamed from: X  reason: collision with root package name */
    public final Object f7811X = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public Handler f7812Y;

    /* renamed from: Z  reason: collision with root package name */
    public ThreadPoolExecutor f7813Z;

    /* renamed from: a0  reason: collision with root package name */
    public ThreadPoolExecutor f7814a0;

    /* renamed from: b0  reason: collision with root package name */
    public C0003d f7815b0;

    public p(Context context, C1370d dVar) {
        C0410a aVar = q.f7816d;
        a.l(context, "Context cannot be null");
        this.f7808U = context.getApplicationContext();
        this.f7809V = dVar;
        this.f7810W = aVar;
    }

    public final void a(C0003d dVar) {
        synchronized (this.f7811X) {
            this.f7815b0 = dVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f7811X) {
            try {
                this.f7815b0 = null;
                Handler handler = this.f7812Y;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f7812Y = null;
                ThreadPoolExecutor threadPoolExecutor = this.f7814a0;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f7813Z = null;
                this.f7814a0 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f7811X) {
            try {
                if (this.f7815b0 != null) {
                    if (this.f7813Z == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new y("emojiCompat", 1));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f7814a0 = threadPoolExecutor;
                        this.f7813Z = threadPoolExecutor;
                    }
                    this.f7813Z.execute(new U.p(10, (Object) this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1374h d() {
        try {
            C0410a aVar = this.f7810W;
            Context context = this.f7808U;
            C1370d dVar = this.f7809V;
            aVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0347f a8 = C1369c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i = a8.f5768b;
            if (i == 0) {
                C1374h[] hVarArr = (C1374h[]) a8.f5767a.get(0);
                if (hVarArr != null && hVarArr.length != 0) {
                    return hVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(C1477r.c(i, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
