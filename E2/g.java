package E2;

import A1.d;
import W2.f;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final d f1338a = new d(10);

    /* renamed from: b  reason: collision with root package name */
    public final f f1339b = new f(0);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1340c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1341d = new HashMap();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1342f;

    public g(int i) {
        this.e = i;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(Class cls, int i) {
        NavigableMap g8 = g(cls);
        Integer num = (Integer) g8.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            g8.remove(Integer.valueOf(i));
        } else {
            g8.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void c(int i) {
        while (this.f1342f > i) {
            Object I8 = this.f1338a.I();
            f.b(I8);
            c e8 = e(I8.getClass());
            this.f1342f -= e8.b() * e8.a(I8);
            b(I8.getClass(), e8.a(I8));
            if (Log.isLoggable(e8.c(), 2)) {
                Log.v(e8.c(), "evicted: " + e8.a(I8));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.intValue() <= (r5 * 8)) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object d(java.lang.Class r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.NavigableMap r0 = r3.g(r4)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0043
            int r1 = r3.f1342f     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0024
            int r2 = r3.e     // Catch:{ all -> 0x0041 }
            int r2 = r2 / r1
            r1 = 2
            if (r2 < r1) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0041 }
            int r2 = r5 * 8
            if (r1 > r2) goto L_0x0043
        L_0x0024:
            E2.f r5 = r3.f1339b     // Catch:{ all -> 0x0041 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r5.f1328V     // Catch:{ all -> 0x0041 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0041 }
            E2.i r1 = (E2.i) r1     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x003a
            E2.i r1 = r5.p()     // Catch:{ all -> 0x0041 }
        L_0x003a:
            E2.e r1 = (E2.e) r1     // Catch:{ all -> 0x0041 }
            r1.f1335b = r0     // Catch:{ all -> 0x0041 }
            r1.f1336c = r4     // Catch:{ all -> 0x0041 }
            goto L_0x005b
        L_0x0041:
            r4 = move-exception
            goto L_0x0061
        L_0x0043:
            E2.f r0 = r3.f1339b     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r0.f1328V     // Catch:{ all -> 0x0041 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0041 }
            E2.i r1 = (E2.i) r1     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0055
            E2.i r1 = r0.p()     // Catch:{ all -> 0x0041 }
        L_0x0055:
            E2.e r1 = (E2.e) r1     // Catch:{ all -> 0x0041 }
            r1.f1335b = r5     // Catch:{ all -> 0x0041 }
            r1.f1336c = r4     // Catch:{ all -> 0x0041 }
        L_0x005b:
            java.lang.Object r4 = r3.f(r1, r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0061:
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.g.d(java.lang.Class, int):java.lang.Object");
    }

    public final c e(Class cls) {
        HashMap hashMap = this.f1341d;
        c cVar = (c) hashMap.get(cls);
        if (cVar == null) {
            if (cls.equals(int[].class)) {
                cVar = new c(1);
            } else if (cls.equals(byte[].class)) {
                cVar = new c(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, cVar);
        }
        return cVar;
    }

    public final Object f(e eVar, Class cls) {
        Object obj;
        c e8 = e(cls);
        Object t8 = this.f1338a.t(eVar);
        if (t8 != null) {
            this.f1342f -= e8.b() * e8.a(t8);
            b(cls, e8.a(t8));
        }
        if (t8 != null) {
            return t8;
        }
        if (Log.isLoggable(e8.c(), 2)) {
            Log.v(e8.c(), "Allocated " + eVar.f1335b + " bytes");
        }
        int i = eVar.f1335b;
        switch (e8.f1329a) {
            case 0:
                obj = new byte[i];
                break;
            default:
                obj = new int[i];
                break;
        }
        return obj;
    }

    public final NavigableMap g(Class cls) {
        HashMap hashMap = this.f1340c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        c e8 = e(cls);
        int a8 = e8.a(obj);
        int b8 = e8.b() * a8;
        if (b8 <= this.e / 2) {
            f fVar = this.f1339b;
            i iVar = (i) ((ArrayDeque) fVar.f1328V).poll();
            if (iVar == null) {
                iVar = fVar.p();
            }
            e eVar = (e) iVar;
            eVar.f1335b = a8;
            eVar.f1336c = cls;
            this.f1338a.G(eVar, obj);
            NavigableMap g8 = g(cls);
            Integer num = (Integer) g8.get(Integer.valueOf(eVar.f1335b));
            Integer valueOf = Integer.valueOf(eVar.f1335b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            g8.put(valueOf, Integer.valueOf(i));
            this.f1342f += b8;
            c(this.e);
        }
    }

    public final synchronized void i(int i) {
        if (i >= 40) {
            try {
                a();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        } else if (i >= 20 || i == 15) {
            c(this.e / 2);
        }
    }
}
