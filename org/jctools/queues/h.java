package org.jctools.queues;

import O7.d;

public final class h {
    public static <E> E[] allocate(int i) {
        return new Object[i];
    }

    public static long calcElementOffset(long j7, long j8) {
        return d.REF_ARRAY_BASE + ((j7 & j8) << d.REF_ELEMENT_SHIFT);
    }
}
