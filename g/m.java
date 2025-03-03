package G;

import A.f;
import C0.e;
import F.a;
import L3.b;
import a0.j;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class m implements b {

    /* renamed from: U  reason: collision with root package name */
    public ArrayList f1619U;

    /* renamed from: V  reason: collision with root package name */
    public ArrayList f1620V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f1621W;

    /* renamed from: X  reason: collision with root package name */
    public final AtomicInteger f1622X;

    /* renamed from: Y  reason: collision with root package name */
    public final a0.m f1623Y = d.i(new f(21, (Object) this));

    /* renamed from: Z  reason: collision with root package name */
    public j f1624Z;

    public m(ArrayList arrayList, boolean z, a aVar) {
        this.f1619U = arrayList;
        this.f1620V = new ArrayList(arrayList.size());
        this.f1621W = z;
        this.f1622X = new AtomicInteger(arrayList.size());
        d(new e(6, this), D7.b.l());
        if (this.f1619U.isEmpty()) {
            this.f1624Z.a(new ArrayList(this.f1620V));
            return;
        }
        for (int i = 0; i < this.f1619U.size(); i++) {
            this.f1620V.add((Object) null);
        }
        ArrayList arrayList2 = this.f1619U;
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            b bVar = (b) arrayList2.get(i8);
            bVar.d(new l((Object) this, i8, (Object) bVar, 0), aVar);
        }
    }

    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.f1619U;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).cancel(z);
            }
        }
        return this.f1623Y.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.f1623Y.f7017V.d(runnable, executor);
    }

    public final Object get(long j7, TimeUnit timeUnit) {
        return (List) this.f1623Y.f7017V.get(j7, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f1623Y.isCancelled();
    }

    public final boolean isDone() {
        return this.f1623Y.f7017V.isDone();
    }

    public final Object get() {
        ArrayList arrayList = this.f1619U;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0:
            while (it.hasNext()) {
                b bVar = (b) it.next();
                while (true) {
                    if (!bVar.isDone()) {
                        try {
                            bVar.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e8) {
                            throw e8;
                        } catch (Throwable unused) {
                            if (this.f1621W) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        return (List) this.f1623Y.f7017V.get();
    }
}
