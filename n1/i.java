package N1;

import B.B;
import H3.P;
import M1.c;
import M1.e;
import P0.l;
import P0.z;
import S0.f;
import java.util.ArrayDeque;

public abstract class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f3357a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f3358b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f3359c;

    /* renamed from: d  reason: collision with root package name */
    public h f3360d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f3361f;

    /* renamed from: g  reason: collision with root package name */
    public long f3362g;

    public i() {
        for (int i = 0; i < 10; i++) {
            this.f3357a.add(new f(1));
        }
        this.f3358b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f3358b;
            B b8 = new B(11, this);
            c cVar = new c();
            cVar.f3074b0 = b8;
            arrayDeque.add(cVar);
        }
        this.f3359c = new ArrayDeque();
        this.f3362g = -9223372036854775807L;
    }

    public final void a(long j7) {
        this.f3362g = j7;
    }

    public final void b(long j7) {
        this.e = j7;
    }

    public final Object d() {
        boolean z;
        if (this.f3360d == null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        ArrayDeque arrayDeque = this.f3357a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f3360d = hVar;
        return hVar;
    }

    public final void e(M1.i iVar) {
        boolean z;
        if (iVar == this.f3360d) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        h hVar = (h) iVar;
        long j7 = hVar.f4388a0;
        if (j7 != Long.MIN_VALUE) {
            long j8 = this.f3362g;
            if (j8 != -9223372036854775807L && j7 < j8) {
                hVar.r();
                this.f3357a.add(hVar);
                this.f3360d = null;
            }
        }
        long j9 = this.f3361f;
        this.f3361f = 1 + j9;
        hVar.f3356e0 = j9;
        this.f3359c.add(hVar);
        this.f3360d = null;
    }

    public abstract P f();

    public void flush() {
        ArrayDeque arrayDeque;
        this.f3361f = 0;
        this.e = 0;
        while (true) {
            ArrayDeque arrayDeque2 = this.f3359c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f3357a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            int i = z.f3748a;
            hVar.r();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f3360d;
        if (hVar2 != null) {
            hVar2.r();
            arrayDeque.add(hVar2);
            this.f3360d = null;
        }
    }

    public abstract void g(h hVar);

    /* renamed from: h */
    public c c() {
        ArrayDeque arrayDeque = this.f3358b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f3359c;
            if (arrayDeque2.isEmpty()) {
                break;
            }
            int i = z.f3748a;
            if (((h) arrayDeque2.peek()).f4388a0 > this.e) {
                break;
            }
            h hVar = (h) arrayDeque2.poll();
            boolean d8 = hVar.d(4);
            ArrayDeque arrayDeque3 = this.f3357a;
            if (d8) {
                c cVar = (c) arrayDeque.pollFirst();
                cVar.a(4);
                hVar.r();
                arrayDeque3.add(hVar);
                return cVar;
            }
            g(hVar);
            if (i()) {
                P f8 = f();
                c cVar2 = (c) arrayDeque.pollFirst();
                long j7 = hVar.f4388a0;
                cVar2.f4391W = j7;
                cVar2.f3071Y = f8;
                cVar2.f3072Z = j7;
                hVar.r();
                arrayDeque3.add(hVar);
                return cVar2;
            }
            hVar.r();
            arrayDeque3.add(hVar);
        }
        return null;
    }

    public abstract boolean i();

    public void release() {
    }
}
