package b7;

import P6.f;
import Z6.b;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

/* renamed from: b7.c  reason: case insensitive filesystem */
public final class C0597c {

    /* renamed from: a  reason: collision with root package name */
    public final C0598d f8690a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8691b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8692c;

    /* renamed from: d  reason: collision with root package name */
    public C0595a f8693d;
    public final ArrayList e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f8694f;

    public C0597c(C0598d dVar, String str) {
        f.e(dVar, "taskRunner");
        f.e(str, "name");
        this.f8690a = dVar;
        this.f8691b = str;
    }

    public final void a() {
        byte[] bArr = b.f6982a;
        synchronized (this.f8690a) {
            if (b()) {
                this.f8690a.d(this);
            }
        }
    }

    public final boolean b() {
        C0595a aVar = this.f8693d;
        if (aVar != null && aVar.f8686b) {
            this.f8694f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((C0595a) arrayList.get(size)).f8686b) {
                C0595a aVar2 = (C0595a) arrayList.get(size);
                if (C0598d.i.isLoggable(Level.FINE)) {
                    c.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(b7.C0595a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            P6.f.e(r3, r0)
            b7.d r0 = r2.f8690a
            monitor-enter(r0)
            boolean r1 = r2.f8692c     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0039
            boolean r4 = r3.f8686b     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x0024
            java.util.logging.Logger r4 = b7.C0598d.i     // Catch:{ all -> 0x0020 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0020 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            com.bumptech.glide.c.a(r3, r2, r4)     // Catch:{ all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r3 = move-exception
            goto L_0x0047
        L_0x0022:
            monitor-exit(r0)
            return
        L_0x0024:
            java.util.logging.Logger r4 = b7.C0598d.i     // Catch:{ all -> 0x0020 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0020 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x0033
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            com.bumptech.glide.c.a(r3, r2, r4)     // Catch:{ all -> 0x0020 }
        L_0x0033:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0020 }
            r3.<init>()     // Catch:{ all -> 0x0020 }
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0039:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0045
            b7.d r3 = r2.f8690a     // Catch:{ all -> 0x0020 }
            r3.d(r2)     // Catch:{ all -> 0x0020 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C0597c.c(b7.a, long):void");
    }

    public final boolean d(C0595a aVar, long j7, boolean z) {
        String str;
        f.e(aVar, "task");
        C0597c cVar = aVar.f8687c;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f8687c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues");
            }
        }
        Z1.c cVar2 = this.f8690a.f8696a;
        long nanoTime = System.nanoTime();
        long j8 = nanoTime + j7;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f8688d <= j8) {
                if (C0598d.i.isLoggable(Level.FINE)) {
                    c.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f8688d = j8;
        if (C0598d.i.isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after ".concat(c.h(j8 - nanoTime));
            } else {
                str = "scheduled after ".concat(c.h(j8 - nanoTime));
            }
            c.a(aVar, this, str);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((C0595a) it.next()).f8688d - nanoTime > j7) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = b.f6982a;
        synchronized (this.f8690a) {
            this.f8692c = true;
            if (b()) {
                this.f8690a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f8691b;
    }
}
