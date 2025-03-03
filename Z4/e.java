package z4;

import A4.h;
import C7.d;
import D2.o;
import H3.P;
import O4.a;
import T5.Z0;
import com.bumptech.glide.c;
import d4.k;
import f5.C0907e;
import f6.C0916f;
import g7.C0996d;
import g7.l;
import j5.b;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l4.C1175a;
import l4.C1176b;
import l6.g;
import m4.C1214b;
import m5.C1216a;
import o.s1;
import o6.C1326b;
import u4.C1493b;
import v.i;

public final class e extends c {

    /* renamed from: W  reason: collision with root package name */
    public static final C1175a f16548W = C1176b.a(e.class);

    /* renamed from: U  reason: collision with root package name */
    public final C1214b f16549U;

    /* renamed from: V  reason: collision with root package name */
    public final a f16550V;

    public e(C1214b bVar, a aVar) {
        M4.c cVar;
        M4.c cVar2;
        this.f16549U = bVar;
        M4.c cVar3 = (M4.c) bVar.f13358c.f13355a;
        if (cVar3 != null && (cVar = aVar.f3652h) == null) {
            if (cVar == null) {
                cVar2 = cVar3;
            } else {
                cVar2 = cVar;
            }
            aVar = new a(aVar.f3649d, aVar.e, aVar.f3650f, aVar.f3651g, cVar2, (C1493b) aVar.f2711c);
        }
        this.f16550V = aVar;
    }

    public static void A(C1214b bVar, a aVar, b bVar2, Z0 z02) {
        C1214b bVar3 = bVar;
        if (bVar2.f16536b.f16534U) {
            bVar.c();
            bVar3.f13363j.set(b.f12890U);
            return;
        }
        s1 s1Var = bVar3.f13360f;
        s1Var.getClass();
        aVar.getClass();
        M5.b a8 = M5.b.a(aVar);
        M5.b a9 = M5.b.a(bVar2);
        I4.b bVar4 = (I4.b) s1Var.f14075g;
        B6.a b8 = M5.a.b(new H4.e(M5.a.b(new I4.a((M5.b) s1Var.f14070a, bVar4.f2302l, bVar4.f2311u, 2)), 1));
        M5.b bVar5 = a8;
        M5.b bVar6 = a9;
        B6.a b9 = M5.a.b(new d(bVar5, bVar6, (M5.b) s1Var.f14070a, (B6.a) s1Var.f14074f, M5.a.b(new k(M5.a.b(new I4.a((M5.b) s1Var.f14070a, bVar4.f2283F, bVar4.f2291N, 1)), (M5.b) s1Var.f14070a, a8, 8))));
        B6.a b10 = M5.a.b(new h((M5.b) s1Var.f14070a, (B6.a) s1Var.f14074f, 0));
        B6.a b11 = M5.a.b(new I4.a(a8, M5.a.b(new i((M5.b) s1Var.f14070a, 6, a8)), bVar4.f2292O, 0));
        B6.a b12 = M5.a.b(new H4.e(bVar4.f2293P, 0));
        R5.h hVar = (R5.h) ((R5.h) new R5.h().channelFactory(C0907e.f11689d.f11692c)).handler((x4.b) M5.a.b(new x4.c((M5.b) s1Var.f14070a, a8, a9, b8, b9, b10, b11, b12)).get());
        if (hVar != null) {
            ((R5.h) hVar.group(z02)).connect(bVar3.f13365l.f13380a, (SocketAddress) null).addListener(new A4.c(z02, bVar, aVar, bVar2, 2));
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, i5.p] */
    public static void B(C1214b bVar, int i, Throwable th, a aVar, int i8, b bVar2, Z0 z02) {
        g gVar;
        J4.c cVar = new J4.c(z02, i8, aVar, bVar.f13365l);
        o oVar = new o(i, 5, (Object) l.j(th), (Object) new P((Object) cVar));
        i5.o it = bVar.e.iterator();
        while (it.hasNext()) {
            try {
                ((C1216a) it.next()).a(oVar);
            } catch (Throwable th2) {
                f16548W.error("Unexpected exception thrown by disconnected listener.", th2);
            }
        }
        cVar.a();
        boolean z = cVar.f2510W;
        AtomicReference atomicReference = bVar.f13363j;
        if (z) {
            atomicReference.set(b.f12893X);
            B7.e eVar = new B7.e(cVar, bVar, bVar2, z02, 11);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            cVar.a();
            C0996d.r(timeUnit, "Time unit");
            ((C0916f) z02).schedule((Runnable) eVar, timeUnit.convert(cVar.f2511X, timeUnit), timeUnit);
            cVar.a();
            bVar.f13367n = true;
            cVar.a();
            cVar.f2514a0 = true;
            return;
        }
        atomicReference.set(b.f12890U);
        bVar.c();
        if (bVar2 != null && (gVar = bVar2.f16535a) != null) {
            gVar.a(th);
        }
    }

    public static void C(C1214b bVar, int i, Throwable th, a aVar, b bVar2, Z0 z02) {
        if (!bVar2.f16538d) {
            bVar2.f16538d = true;
            B(bVar, i, th, aVar, bVar2.f16537c + 1, bVar2, z02);
        }
    }

    public final void y(g gVar) {
        C1214b bVar = this.f16549U;
        AtomicReference atomicReference = bVar.f13363j;
        b bVar2 = b.f12890U;
        b bVar3 = b.f12891V;
        while (!atomicReference.compareAndSet(bVar2, bVar3)) {
            if (atomicReference.get() != bVar2) {
                com.bumptech.glide.g gVar2 = new com.bumptech.glide.g("MQTT client is already connected or connecting.", (Throwable) null);
                gVar.c(C1326b.f14277U);
                gVar.a(gVar2);
                return;
            }
        }
        b bVar4 = new b(gVar);
        gVar.c(bVar4.f16536b);
        A(bVar, this.f16550V, bVar4, bVar.a());
    }
}
