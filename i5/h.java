package i5;

public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final h f12745a = new Object();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && ((n) obj).size() == 0) {
            return true;
        }
        return false;
    }

    public final int get(int i) {
        throw new IndexOutOfBoundsException("Empty int list");
    }

    public final int hashCode() {
        return 1;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "[]";
    }
}
