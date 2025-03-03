package P0;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final t f3711a;

    /* renamed from: b  reason: collision with root package name */
    public final v f3712b;

    /* renamed from: c  reason: collision with root package name */
    public final i f3713c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArraySet f3714d;
    public final ArrayDeque e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f3715f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f3716g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3717h;
    public final boolean i;

    public k(Looper looper, t tVar, i iVar) {
        this(new CopyOnWriteArraySet(), looper, tVar, iVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f3716g) {
            try {
                if (!this.f3717h) {
                    this.f3714d.add(new j(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f3715f;
        if (!arrayDeque.isEmpty()) {
            v vVar = this.f3712b;
            if (!vVar.f3741a.hasMessages(1)) {
                vVar.getClass();
                u b8 = v.b();
                b8.f3739a = vVar.f3741a.obtainMessage(1);
                vVar.getClass();
                Message message = b8.f3739a;
                message.getClass();
                vVar.f3741a.sendMessageAtFrontOfQueue(message);
                b8.a();
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i8, h hVar) {
        f();
        this.f3715f.add(new g((Object) new CopyOnWriteArraySet(this.f3714d), i8, (Object) hVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.f3716g) {
            this.f3717h = true;
        }
        Iterator it = this.f3714d.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            i iVar = this.f3713c;
            jVar.f3710d = true;
            if (jVar.f3709c) {
                jVar.f3709c = false;
                iVar.b(jVar.f3707a, jVar.f3708b.d());
            }
        }
        this.f3714d.clear();
    }

    public final void e(int i8, h hVar) {
        c(i8, hVar);
        b();
    }

    public final void f() {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.f3712b.f3741a.getLooper().getThread()) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
        }
    }

    public k(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, t tVar, i iVar, boolean z) {
        this.f3711a = tVar;
        this.f3714d = copyOnWriteArraySet;
        this.f3713c = iVar;
        this.f3716g = new Object();
        this.e = new ArrayDeque();
        this.f3715f = new ArrayDeque();
        this.f3712b = tVar.a(looper, new f(this));
        this.i = z;
    }
}
