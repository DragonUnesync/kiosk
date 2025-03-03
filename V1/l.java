package V1;

import java.util.Arrays;

public final class l {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f5808f = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f5809a;

    /* renamed from: b  reason: collision with root package name */
    public int f5810b;

    /* renamed from: c  reason: collision with root package name */
    public int f5811c;

    /* renamed from: d  reason: collision with root package name */
    public int f5812d;
    public byte[] e;

    public final void a(byte[] bArr, int i, int i8) {
        if (this.f5809a) {
            int i9 = i8 - i;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i10 = this.f5811c + i9;
            if (length < i10) {
                this.e = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, this.e, this.f5811c, i9);
            this.f5811c += i9;
        }
    }
}
