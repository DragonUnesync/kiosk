package c7;

import N.e;
import P6.f;
import Y6.a;
import Z6.b;
import b7.C0596b;
import b7.C0597c;
import b7.C0598d;
import g7.n;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final long f8953a;

    /* renamed from: b  reason: collision with root package name */
    public final C0597c f8954b;

    /* renamed from: c  reason: collision with root package name */
    public final C0596b f8955c = new C0596b(this, e.A(new StringBuilder(), b.f6986f, " ConnectionPool"));

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentLinkedQueue f8956d = new ConcurrentLinkedQueue();

    public k(C0598d dVar, TimeUnit timeUnit) {
        f.e(dVar, "taskRunner");
        this.f8953a = timeUnit.toNanos(5);
        this.f8954b = dVar.e();
    }

    public final boolean a(a aVar, h hVar, List list, boolean z) {
        f.e(hVar, "call");
        Iterator it = this.f8956d.iterator();
        while (true) {
            boolean z6 = false;
            if (!it.hasNext()) {
                return false;
            }
            j jVar = (j) it.next();
            f.d(jVar, "connection");
            synchronized (jVar) {
                if (z) {
                    if (jVar.f8943g != null) {
                        z6 = true;
                    }
                    if (!z6) {
                        continue;
                    }
                }
                if (jVar.i(aVar, list)) {
                    hVar.a(jVar);
                    return true;
                }
            }
        }
    }

    public final int b(j jVar, long j7) {
        byte[] bArr = b.f6982a;
        ArrayList arrayList = jVar.f8951p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                n nVar = n.f12045a;
                n.f12045a.j(((f) reference).f8921a, "A connection to " + jVar.f8939b.f6755a.f6596h + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                jVar.f8945j = true;
                if (arrayList.isEmpty()) {
                    jVar.f8952q = j7 - this.f8953a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
