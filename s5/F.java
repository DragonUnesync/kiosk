package S5;

import g6.B;

public abstract class F implements C0189p {
    private final C0185n data;

    public F(C0185n nVar) {
        this.data = (C0185n) B.checkNotNull(nVar, "data");
    }

    public C0185n content() {
        return C0206y.ensureAccessible(this.data);
    }

    public final String contentToString() {
        return this.data.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.data.equals(((F) obj).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public int refCnt() {
        return this.data.refCnt();
    }

    public boolean release() {
        return this.data.release();
    }

    public C0189p touch(Object obj) {
        this.data.touch(obj);
        return this;
    }
}
