package W3;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f6176a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6177b;

    public /* synthetic */ a(int i, byte[] bArr) {
        this.f6176a = i;
        this.f6177b = bArr;
    }

    public a(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException("end < start");
        } else if (length <= bArr.length) {
            this.f6177b = bArr;
            this.f6176a = length;
        } else {
            throw new IllegalArgumentException("end > bytes.length");
        }
    }
}
