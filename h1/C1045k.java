package h1;

import M0.X;
import P0.l;
import R0.A;
import U0.j;
import Y0.e;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: h1.k  reason: case insensitive filesystem */
public abstract class C1045k extends C1035a {

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f12490h = new HashMap();
    public Handler i;

    /* renamed from: j  reason: collision with root package name */
    public A f12491j;

    public final void d() {
        for (C1044j jVar : this.f12490h.values()) {
            jVar.f12487a.c(jVar.f12488b);
        }
    }

    public final void f() {
        for (C1044j jVar : this.f12490h.values()) {
            jVar.f12487a.e(jVar.f12488b);
        }
    }

    public void j() {
        for (C1044j jVar : this.f12490h.values()) {
            jVar.f12487a.j();
        }
    }

    public void p() {
        HashMap hashMap = this.f12490h;
        for (C1044j jVar : hashMap.values()) {
            jVar.f12487a.o(jVar.f12488b);
            C1043i iVar = jVar.f12489c;
            C1035a aVar = jVar.f12487a;
            aVar.r(iVar);
            aVar.q(iVar);
        }
        hashMap.clear();
    }

    public abstract C1031B t(Object obj, C1031B b8);

    public long u(Object obj, long j7) {
        return j7;
    }

    public int v(int i8, Object obj) {
        return i8;
    }

    public abstract void w(Object obj, C1035a aVar, X x8);

    /* JADX WARNING: type inference failed for: r3v1, types: [h1.F, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [Y0.d, java.lang.Object] */
    public final void x(Object obj, C1035a aVar) {
        HashMap hashMap = this.f12490h;
        l.d(!hashMap.containsKey(obj));
        C1042h hVar = new C1042h(this, obj);
        C1043i iVar = new C1043i(this, obj);
        hashMap.put(obj, new C1044j(aVar, hVar, iVar));
        Handler handler = this.i;
        handler.getClass();
        aVar.getClass();
        e eVar = aVar.f12432c;
        eVar.getClass();
        ? obj2 = new Object();
        obj2.f12290a = handler;
        obj2.f12291b = iVar;
        eVar.f6317c.add(obj2);
        this.i.getClass();
        e eVar2 = aVar.f12433d;
        eVar2.getClass();
        ? obj3 = new Object();
        obj3.f6314a = iVar;
        eVar2.f6317c.add(obj3);
        A a8 = this.f12491j;
        j jVar = this.f12435g;
        l.k(jVar);
        aVar.k(hVar, a8, jVar);
        if (this.f12431b.isEmpty()) {
            aVar.c(hVar);
        }
    }
}
