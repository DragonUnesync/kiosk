package z4;

import T5.Z0;
import j$.util.function.BiConsumer;
import j5.b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import l6.g;
import m4.C1214b;
import m4.f;

public final /* synthetic */ class c implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J4.c f16539a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1214b f16540b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16541c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Z0 f16542d;

    public /* synthetic */ c(J4.c cVar, C1214b bVar, b bVar2, Z0 z02) {
        this.f16539a = cVar;
        this.f16540b = bVar;
        this.f16541c = bVar2;
        this.f16542d = z02;
    }

    public final void accept(Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        J4.c cVar = this.f16539a;
        cVar.a();
        boolean z = cVar.f2510W;
        C1214b bVar = this.f16540b;
        b bVar2 = this.f16541c;
        if (z) {
            AtomicReference atomicReference = bVar.f13363j;
            b bVar3 = b.f12893X;
            b bVar4 = b.f12894Y;
            while (!atomicReference.compareAndSet(bVar3, bVar4)) {
                if (atomicReference.get() != bVar3) {
                    return;
                }
            }
            cVar.a();
            f fVar = bVar.f13365l;
            f fVar2 = cVar.f2512Y;
            if (!fVar.equals(fVar2)) {
                bVar.f13365l = fVar2;
                bVar.f13366m = null;
            }
            cVar.a();
            e.A(bVar, cVar.f2513Z, new b(bVar2), this.f16542d);
            return;
        }
        AtomicReference atomicReference2 = bVar.f13363j;
        b bVar5 = b.f12893X;
        b bVar6 = b.f12890U;
        while (!atomicReference2.compareAndSet(bVar5, bVar6)) {
            if (atomicReference2.get() != bVar5) {
                return;
            }
        }
        bVar.c();
        if (bVar2 != null) {
            g gVar = bVar2.f16535a;
            if (th == null) {
                com.bumptech.glide.g gVar2 = new com.bumptech.glide.g("Reconnect was cancelled.", (Throwable) null);
                if (gVar != null) {
                    gVar.a(gVar2);
                    return;
                }
                return;
            }
            com.bumptech.glide.g gVar3 = new com.bumptech.glide.g(th);
            if (gVar != null) {
                gVar.a(gVar3);
            }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
