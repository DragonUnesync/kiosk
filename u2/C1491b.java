package u2;

import y2.C1628c;

/* renamed from: u2.b  reason: case insensitive filesystem */
public final class C1491b extends C1628c implements Comparable {
    /* renamed from: h */
    public final int compareTo(C1491b bVar) {
        int i;
        int length = this.f16371V.length;
        int length2 = bVar.f16371V.length;
        if (length < length2) {
            i = length;
        } else {
            i = length2;
        }
        for (int i8 = 0; i8 < i; i8++) {
            int b8 = ((C1490a) e(i8)).compareTo((C1490a) bVar.e(i8));
            if (b8 != 0) {
                return b8;
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
