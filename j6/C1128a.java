package j6;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: j6.a  reason: case insensitive filesystem */
public abstract class C1128a {
    public static <E> AtomicReferenceArray<E> allocateRefArray(int i) {
        return new AtomicReferenceArray<>(i);
    }

    public static int calcCircularRefElementOffset(long j7, long j8) {
        return (int) (j7 & j8);
    }

    public static int calcRefElementOffset(long j7) {
        return (int) j7;
    }

    public static int length(AtomicReferenceArray<?> atomicReferenceArray) {
        return atomicReferenceArray.length();
    }

    public static <E> E lvRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public static int modifiedCalcCircularRefElementOffset(long j7, long j8) {
        return ((int) (j7 & j8)) >> 1;
    }

    public static void soRefElement(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public static <E> void spRefElement(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }
}
