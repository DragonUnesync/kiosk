package I7;

import B7.g;
import j$.util.function.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f2330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f2332c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f2333d;

    public /* synthetic */ b(g gVar, AtomicReference atomicReference, d dVar, AtomicInteger atomicInteger) {
        this.f2330a = gVar;
        this.f2331b = atomicReference;
        this.f2332c = dVar;
        this.f2333d = atomicInteger;
    }

    public final void accept(Object obj) {
        g gVar = this.f2330a;
        AtomicInteger atomicInteger = this.f2333d;
        try {
            gVar.b(obj);
        } catch (IOException e) {
            AtomicReference atomicReference = this.f2331b;
            if (atomicReference.get() == null) {
                atomicReference.set(new ArrayList());
            }
            ((List) atomicReference.get()).add((IOException) this.f2332c.apply(Integer.valueOf(atomicInteger.get()), e));
        }
        atomicInteger.incrementAndGet();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }
}
