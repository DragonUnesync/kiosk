package i5;

import g7.C0996d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

public final class g implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    public int f12743a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f12744b;

    public g(f fVar) {
        this.f12744b = fVar;
    }

    public final int characteristics() {
        return 17745;
    }

    public final long estimateSize() {
        return (long) this.f12743a;
    }

    public final void forEachRemaining(Consumer consumer) {
        C0996d.r(consumer, "Consumer");
        tryAdvance(consumer);
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.-CC.$default$getComparator(this);
    }

    public final long getExactSizeIfKnown() {
        return (long) this.f12743a;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.-CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        C0996d.r(consumer, "Consumer");
        if (this.f12743a != 1) {
            return false;
        }
        consumer.accept(this.f12744b.f12742V);
        this.f12743a = 0;
        return true;
    }

    public final Spliterator trySplit() {
        return null;
    }
}
