package f5;

import I7.d;
import T5.O;
import T5.Z0;
import T5.h1;
import U0.c;
import f6.C0928s;
import f6.f0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import l4.C1176b;

/* renamed from: f5.e  reason: case insensitive filesystem */
public final class C0907e {

    /* renamed from: d  reason: collision with root package name */
    public static final C0907e f11689d;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11690a;

    /* renamed from: b  reason: collision with root package name */
    public final BiFunction f11691b;

    /* renamed from: c  reason: collision with root package name */
    public final O f11692c;

    static {
        C1176b.a(C0907e.class);
        try {
            Class.forName("io.netty.channel.epoll.Epoll");
            f11689d = C0906d.c();
        } catch (ClassNotFoundException unused) {
            f11689d = new C0907e((BiFunction) new d(1), (O) new c(17));
        }
    }

    public /* synthetic */ C0907e(d dVar, c cVar) {
        this((BiFunction) dVar, (O) cVar);
    }

    public static C0907e a() {
        return new C0907e((BiFunction) new d(1), (O) new c(17));
    }

    public final synchronized Z0 b() {
        C0905c cVar;
        try {
            cVar = (C0905c) this.f11690a.get((Object) null);
            if (cVar == null) {
                C0905c cVar2 = new C0905c((h1) this.f11691b.apply(0, new f0(new C0928s("com.hivemq.client.mqtt", 10))));
                this.f11690a.put((Object) null, cVar2);
                cVar = cVar2;
            } else {
                cVar.f11688b++;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return cVar.f11687a.next();
    }

    public final synchronized void c() {
        C0905c cVar = (C0905c) this.f11690a.get((Object) null);
        int i = cVar.f11688b - 1;
        cVar.f11688b = i;
        if (i == 0) {
            this.f11690a.remove((Object) null);
            cVar.f11687a.shutdownGracefully(0, 0, TimeUnit.MILLISECONDS);
        }
    }

    public C0907e(BiFunction biFunction, O o2) {
        this.f11690a = new HashMap();
        this.f11691b = biFunction;
        this.f11692c = o2;
    }
}
