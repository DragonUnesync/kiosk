package x4;

import T5.K;
import j$.util.function.Consumer;
import java.util.function.Consumer;

/* renamed from: x4.a  reason: case insensitive filesystem */
public final /* synthetic */ class C1605a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16271a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f16272b;

    public /* synthetic */ C1605a(b bVar, int i) {
        this.f16271a = i;
        this.f16272b = bVar;
    }

    public final void accept(Object obj) {
        K k8 = (K) obj;
        switch (this.f16271a) {
            case 0:
                this.f16272b.d(k8);
                return;
            default:
                this.f16272b.c(k8);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.f16271a;
        return Consumer.-CC.$default$andThen(this, consumer);
    }
}
