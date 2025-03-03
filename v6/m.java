package v6;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m6.a;
import m6.b;

public final class m extends AtomicReferenceArray implements Runnable, Callable, b {

    /* renamed from: V  reason: collision with root package name */
    public static final Object f16128V = new Object();

    /* renamed from: W  reason: collision with root package name */
    public static final Object f16129W = new Object();

    /* renamed from: X  reason: collision with root package name */
    public static final Object f16130X = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final Object f16131Y = new Object();

    /* renamed from: U  reason: collision with root package name */
    public final Object f16132U;

    public m(Runnable runnable, a aVar) {
        super(3);
        this.f16132U = runnable;
        lazySet(0, aVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f16131Y) {
                if (obj == f16129W) {
                    future.cancel(false);
                    return;
                } else if (obj == f16130X) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r8.get(r0)
            java.lang.Object r2 = f16131Y
            r3 = 0
            if (r1 == r2) goto L_0x0031
            java.lang.Object r4 = f16129W
            if (r1 == r4) goto L_0x0031
            java.lang.Object r5 = f16130X
            if (r1 != r5) goto L_0x0013
            goto L_0x0031
        L_0x0013:
            r6 = 2
            java.lang.Object r6 = r8.get(r6)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r6 == r7) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            if (r6 == 0) goto L_0x0024
            r4 = r5
        L_0x0024:
            boolean r0 = r8.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0031
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r6)
        L_0x0031:
            java.lang.Object r0 = r8.get(r3)
            if (r0 == r2) goto L_0x0049
            java.lang.Object r1 = f16128V
            if (r0 == r1) goto L_0x0049
            if (r0 != 0) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            boolean r1 = r8.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0031
            m6.a r0 = (m6.a) r0
            r0.c(r8)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.m.d():void");
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, java.lang.Runnable] */
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f16130X;
        Object obj4 = f16129W;
        Object obj5 = f16128V;
        Object obj6 = f16131Y;
        lazySet(2, Thread.currentThread());
        try {
            this.f16132U.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj7 = get(0);
            if (!(obj7 == obj5 || !compareAndSet(0, obj7, obj6) || obj7 == null)) {
                ((a) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3 || compareAndSet(1, obj2, obj6)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, obj6));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj8 = get(0);
        if (!(obj8 == obj5 || !compareAndSet(0, obj8, obj6) || obj8 == null)) {
            ((a) obj8).c(this);
        }
        do {
            obj = get(1);
            if (obj == obj4 || obj == obj3 || compareAndSet(1, obj, obj6)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, obj6));
    }
}
