package p2;

import y2.C1628c;

public final class d extends C1628c implements Comparable {

    /* renamed from: W  reason: collision with root package name */
    public static final d f14458W = new C1628c(0);

    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        if (this == dVar) {
            return 0;
        }
        int length = this.f16371V.length;
        int length2 = dVar.f16371V.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            int a8 = ((C1341c) e(i)).compareTo((C1341c) dVar.e(i));
            if (a8 != 0) {
                return a8;
            }
        }
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        return 0;
    }
}
