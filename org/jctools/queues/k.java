package org.jctools.queues;

import O7.d;

public final class k {
    private k() {
    }

    public static int length(Object[] objArr) {
        return objArr.length;
    }

    public static long modifiedCalcElementOffset(long j7, long j8) {
        return d.REF_ARRAY_BASE + ((j7 & j8) << (d.REF_ELEMENT_SHIFT - 1));
    }

    public static long nextArrayOffset(Object[] objArr) {
        return d.REF_ARRAY_BASE + (((long) (length(objArr) - 1)) << d.REF_ELEMENT_SHIFT);
    }
}
