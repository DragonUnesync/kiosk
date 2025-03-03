package i5;

import g7.C0996d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

public final class j implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    public static final j f12747a = new Object();

    public final int characteristics() {
        return 17745;
    }

    public final long estimateSize() {
        return 0;
    }

    public final void forEachRemaining(Consumer consumer) {
        C0996d.r(consumer, "Consumer");
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.-CC.$default$getComparator(this);
    }

    public final long getExactSizeIfKnown() {
        return 0;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.-CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        C0996d.r(consumer, "Consumer");
        return false;
    }

    public final Spliterator trySplit() {
        return null;
    }
}
