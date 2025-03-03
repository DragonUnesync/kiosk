package Y0;

import A.g;
import M0.r;
import P0.c;
import P0.z;
import a1.C0412c;
import h1.C1031B;
import h1.C1033D;
import h1.C1034E;
import h1.C1053t;
import h1.F;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f6315a;

    /* renamed from: b  reason: collision with root package name */
    public final C1031B f6316b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f6317c;

    public /* synthetic */ e(CopyOnWriteArrayList copyOnWriteArrayList, int i, C1031B b8) {
        this.f6317c = copyOnWriteArrayList;
        this.f6315a = i;
        this.f6316b = b8;
    }

    public void a(c cVar) {
        Iterator it = this.f6317c.iterator();
        while (it.hasNext()) {
            F f8 = (F) it.next();
            z.S(f8.f12290a, new C0412c((Object) cVar, 9, f8.f12291b));
        }
    }

    public void b(int i, r rVar, int i8, Object obj, long j7) {
        a(new g(this, 14, new g1.g(1, i, rVar, i8, obj, z.c0(j7), -9223372036854775807L)));
    }

    public void c(C1053t tVar, int i, int i8, r rVar, int i9, Object obj, long j7, long j8) {
        g1.g gVar = new g1.g(i, i8, rVar, i9, obj, z.c0(j7), z.c0(j8));
        C1053t tVar2 = tVar;
        a(new C1033D(this, tVar, gVar, 2));
    }

    public void d(C1053t tVar, int i, int i8, r rVar, int i9, Object obj, long j7, long j8) {
        g1.g gVar = new g1.g(i, i8, rVar, i9, obj, z.c0(j7), z.c0(j8));
        C1053t tVar2 = tVar;
        a(new C1033D(this, tVar, gVar, 1));
    }

    public void e(C1053t tVar, int i, int i8, r rVar, int i9, Object obj, long j7, long j8, IOException iOException, boolean z) {
        a(new C1034E(this, tVar, new g1.g(i, i8, rVar, i9, obj, z.c0(j7), z.c0(j8)), iOException, z));
    }

    public void f(C1053t tVar, int i, IOException iOException, boolean z) {
        e(tVar, i, -1, (r) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void g(C1053t tVar, int i, int i8, r rVar, int i9, Object obj, long j7, long j8) {
        g1.g gVar = new g1.g(i, i8, rVar, i9, obj, z.c0(j7), z.c0(j8));
        C1053t tVar2 = tVar;
        a(new C1033D(this, tVar, gVar, 0));
    }
}
