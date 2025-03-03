package M3;

public final class i extends f {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3145c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3146d;
    public final int e;

    public i(byte[] bArr, int i, int i8, int i9, int i10) {
        super(i9, i10);
        if (i9 > i || i10 > i8) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f3145c = bArr;
        this.f3146d = i;
        this.e = i8;
    }

    public final byte[] a() {
        byte[] bArr = this.f3145c;
        int i = this.f3146d;
        int i8 = this.f3139a;
        int i9 = this.f3140b;
        if (i8 == i && i9 == this.e) {
            return bArr;
        }
        int i10 = i8 * i9;
        byte[] bArr2 = new byte[i10];
        if (i8 == i) {
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            return bArr2;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            System.arraycopy(bArr, i11, bArr2, i12 * i8, i8);
            i11 += i;
        }
        return bArr2;
    }

    public final byte[] b(int i, byte[] bArr) {
        if (i < 0 || i >= this.f3140b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int i8 = this.f3139a;
        if (bArr == null || bArr.length < i8) {
            bArr = new byte[i8];
        }
        System.arraycopy(this.f3145c, i * this.f3146d, bArr, 0, i8);
        return bArr;
    }
}
