package k6;

import Q0.g;
import sun.misc.Unsafe;

public abstract class d {
    public static final long REF_ARRAY_BASE;
    public static final int REF_ELEMENT_SHIFT;

    static {
        Unsafe unsafe = c.UNSAFE;
        Class<Object[]> cls = Object[].class;
        int arrayIndexScale = unsafe.arrayIndexScale(cls);
        if (4 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else if (8 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = 3;
        } else {
            throw new IllegalStateException(g.m(arrayIndexScale, "Unknown pointer size: "));
        }
        REF_ARRAY_BASE = (long) unsafe.arrayBaseOffset(cls);
    }

    public static <E> E[] allocateRefArray(int i) {
        return new Object[i];
    }

    public static long calcCircularRefElementOffset(long j7, long j8) {
        return REF_ARRAY_BASE + ((j7 & j8) << REF_ELEMENT_SHIFT);
    }

    public static long calcRefElementOffset(long j7) {
        return REF_ARRAY_BASE + (j7 << REF_ELEMENT_SHIFT);
    }

    public static <E> E lvRefElement(E[] eArr, long j7) {
        return c.UNSAFE.getObjectVolatile(eArr, j7);
    }

    public static <E> void soRefElement(E[] eArr, long j7, E e) {
        c.UNSAFE.putOrderedObject(eArr, j7, e);
    }

    public static <E> void spRefElement(E[] eArr, long j7, E e) {
        c.UNSAFE.putObject(eArr, j7, e);
    }
}
