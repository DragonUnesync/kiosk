package O7;

import sun.misc.Unsafe;

public final class d {
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
            throw new IllegalStateException("Unknown pointer size");
        }
        REF_ARRAY_BASE = (long) unsafe.arrayBaseOffset(cls);
    }

    public static long calcElementOffset(long j7) {
        return REF_ARRAY_BASE + (j7 << REF_ELEMENT_SHIFT);
    }

    public static <E> E lpElement(E[] eArr, long j7) {
        return c.UNSAFE.getObject(eArr, j7);
    }

    public static <E> E lvElement(E[] eArr, long j7) {
        return c.UNSAFE.getObjectVolatile(eArr, j7);
    }

    public static <E> void soElement(E[] eArr, long j7, E e) {
        c.UNSAFE.putOrderedObject(eArr, j7, e);
    }

    public static <E> void spElement(E[] eArr, long j7, E e) {
        c.UNSAFE.putObject(eArr, j7, e);
    }
}
