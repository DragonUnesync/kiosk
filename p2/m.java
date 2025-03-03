package p2;

import t2.k;

public final class m implements Comparable {
    public m(int i, int i8, k kVar) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        } else if (i8 != 0) {
            try {
                kVar.getClass();
                throw new NullPointerException("spec.getLocalItem() == null");
            } catch (NullPointerException unused) {
                throw new NullPointerException("spec == null");
            }
        } else {
            throw new NullPointerException("disposition == null");
        }
    }

    public final int compareTo(Object obj) {
        ((m) obj).getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        ((m) obj).getClass();
        throw null;
    }

    public final String toString() {
        return Integer.toHexString(0) + " null null";
    }
}
