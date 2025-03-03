package e5;

import V4.e;
import W4.a;
import g7.l;
import j$.util.function.BiConsumer;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/* renamed from: e5.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0840a implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CompletableFuture f11263b;

    public /* synthetic */ C0840a(CompletableFuture completableFuture, int i) {
        this.f11262a = i;
        this.f11263b = completableFuture;
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f11262a) {
            case 0:
                CompletableFuture completableFuture = this.f11263b;
                Void voidR = (Void) obj;
                Throwable th = (Throwable) obj2;
                if (th != null) {
                    completableFuture.completeExceptionally(l.j(th));
                    return;
                } else {
                    completableFuture.complete((Object) null);
                    return;
                }
            case 1:
                CompletableFuture completableFuture2 = this.f11263b;
                e eVar = (e) obj;
                Throwable th2 = (Throwable) obj2;
                if (th2 != null) {
                    completableFuture2.completeExceptionally(l.j(th2));
                    return;
                } else {
                    completableFuture2.complete(new a(eVar.c()));
                    return;
                }
            default:
                CompletableFuture completableFuture3 = this.f11263b;
                P4.a aVar = (P4.a) obj;
                Throwable th3 = (Throwable) obj2;
                if (th3 != null) {
                    completableFuture3.completeExceptionally(l.j(th3));
                    return;
                } else {
                    completableFuture3.complete(new Q4.a(aVar));
                    return;
                }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.f11262a;
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
