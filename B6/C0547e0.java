package b6;

import g6.C0978k;
import java.util.Arrays;

/* renamed from: b6.e0  reason: case insensitive filesystem */
public final class C0547e0 {
    static final C0547e0 NULL_ID = new C0547e0(C0978k.EMPTY_BYTES);
    private final int hashCode;
    private final byte[] id;

    public C0547e0(byte[] bArr) {
        this.id = bArr;
        this.hashCode = Arrays.hashCode(bArr);
    }

    public byte[] cloneBytes() {
        return (byte[]) this.id.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0547e0)) {
            return false;
        }
        return Arrays.equals(this.id, ((C0547e0) obj).id);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return "OpenSslSessionId{id=" + Arrays.toString(this.id) + '}';
    }
}
