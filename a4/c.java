package A4;

import O4.a;
import T5.K;
import T5.Z0;
import W5.e;
import com.bumptech.glide.g;
import f6.C0909B;
import f6.C0910C;
import f6.C0911a;
import f6.d0;
import g5.C0962a;
import m4.C1214b;
import z4.b;
import z4.d;

public final /* synthetic */ class c implements C0910C {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f96U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f97V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f98W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f99X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f100Y;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f96U = i;
        this.f97V = obj;
        this.f98W = obj2;
        this.f99X = obj3;
        this.f100Y = obj4;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Throwable, com.bumptech.glide.g, l5.a] */
    public final void operationComplete(C0909B b8) {
        switch (this.f96U) {
            case 0:
                g gVar = (g) this.f97V;
                gVar.getClass();
                boolean isSuccess = b8.isSuccess();
                K k8 = (K) this.f98W;
                a aVar = (a) this.f99X;
                if (isSuccess) {
                    gVar.f116X = new f(k8, aVar);
                    return;
                }
                gVar.d(k8, (b) this.f100Y);
                C0962a aVar2 = aVar.f93c;
                aVar2.f12019U.a(new g(b8.cause()));
                return;
            case 1:
                g gVar2 = (g) this.f97V;
                gVar2.getClass();
                boolean isSuccess2 = b8.isSuccess();
                K k9 = (K) this.f98W;
                a aVar3 = (a) this.f99X;
                b bVar = (b) this.f100Y;
                if (isSuccess2) {
                    ((e) ((V5.g) k9)).shutdownOutput().addListener(new c(gVar2, k9, aVar3, bVar, 0));
                    return;
                }
                gVar2.d(k9, bVar);
                C0962a aVar4 = aVar3.f93c;
                aVar4.f12019U.a(new g(b8.cause()));
                return;
            default:
                Throwable cause = b8.cause();
                if (cause != null) {
                    ? gVar3 = new g(cause);
                    Z0 z02 = (Z0) this.f97V;
                    boolean inEventLoop = ((C0911a) z02).inEventLoop();
                    b bVar2 = (b) this.f100Y;
                    C1214b bVar3 = (C1214b) this.f98W;
                    a aVar5 = (a) this.f99X;
                    if (inEventLoop) {
                        z4.e.C(bVar3, 2, gVar3, aVar5, bVar2, z02);
                        return;
                    }
                    ((d0) z02).execute(new d(bVar3, gVar3, aVar5, bVar2, z02));
                    return;
                }
                return;
        }
    }
}
