package e5;

import R.e;
import W4.a;
import de.ozerov.fully.F1;
import de.ozerov.fully.K2;
import g5.C0964c;
import g7.C0996d;
import j$.util.function.Function;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import l6.f;
import m4.C1213a;
import m4.C1214b;
import p6.C1345a;
import t6.C1432a;

public final /* synthetic */ class b implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K2 f11264a;

    public /* synthetic */ b(K2 k22) {
        this.f11264a = k22;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [l6.g, g5.c, g5.b] */
    public final Object apply(Object obj) {
        a aVar = (a) obj;
        K2 k22 = this.f11264a;
        k22.getClass();
        C0996d.p(aVar, a.class, "Publish");
        CompletableFuture i = F1.i();
        V4.a aVar2 = aVar.f6190b;
        C0996d.p(aVar2, V4.a.class, "Publish");
        C1214b bVar = (C1214b) ((C1213a) ((C1213a) k22.f10050V).f13355a).f13355a;
        D4.b bVar2 = new D4.b(bVar, aVar2);
        f fVar = bVar.f13357b.f13376b;
        C1345a.a(fVar, "scheduler is null");
        ? cVar = new C0964c();
        try {
            bVar2.x(new C1432a(cVar, fVar));
            cVar.whenComplete(new C0840a(i, 1));
            return i;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            e.v(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function.-CC.$default$compose(this, function);
    }
}
