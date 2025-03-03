package H2;

import B.q0;
import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class w {
    public static final z e = new z(10);

    /* renamed from: f  reason: collision with root package name */
    public static final A f1990f = new A(2);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1991a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final z f1992b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f1993c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final q0 f1994d;

    public w(q0 q0Var) {
        z zVar = e;
        this.f1994d = q0Var;
        this.f1992b = zVar;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.Class r2, java.lang.Class r3, H2.r r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            H2.v r0 = new H2.v     // Catch:{ all -> 0x0013 }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x0013 }
            java.util.ArrayList r2 = r1.f1991a     // Catch:{ all -> 0x0013 }
            int r3 = r2.size()     // Catch:{ all -> 0x0013 }
            r2.add(r3, r0)     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x0011:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r2
        L_0x0013:
            r2 = move-exception
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.w.a(java.lang.Class, java.lang.Class, H2.r):void");
    }

    public final synchronized q b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f1991a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                v vVar = (v) it.next();
                if (this.f1993c.contains(vVar)) {
                    z = true;
                } else if (vVar.f1987a.isAssignableFrom(cls) && vVar.f1988b.isAssignableFrom(cls2)) {
                    this.f1993c.add(vVar);
                    arrayList.add(vVar.f1989c.m0(this));
                    this.f1993c.remove(vVar);
                }
            }
            if (arrayList.size() > 1) {
                z zVar = this.f1992b;
                q0 q0Var = this.f1994d;
                zVar.getClass();
                return new C0081b(arrayList, 2, q0Var);
            } else if (arrayList.size() == 1) {
                return (q) arrayList.get(0);
            } else if (z) {
                return f1990f;
            } else {
                throw new g("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
            }
        } catch (Throwable th) {
            this.f1993c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f1991a.iterator();
            while (it.hasNext()) {
                v vVar = (v) it.next();
                if (!this.f1993c.contains(vVar)) {
                    if (vVar.f1987a.isAssignableFrom(cls)) {
                        this.f1993c.add(vVar);
                        arrayList.add(vVar.f1989c.m0(this));
                        this.f1993c.remove(vVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f1993c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f1991a.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (!arrayList.contains(vVar.f1988b) && vVar.f1987a.isAssignableFrom(cls)) {
                arrayList.add(vVar.f1988b);
            }
        }
        return arrayList;
    }
}
