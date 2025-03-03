package i6;

import k6.d;

public abstract class n {
    public static int length(Object[] objArr) {
        return objArr.length;
    }

    public static long modifiedCalcCircularRefElementOffset(long j7, long j8) {
        return d.REF_ARRAY_BASE + ((j7 & j8) << (d.REF_ELEMENT_SHIFT - 1));
    }
}
