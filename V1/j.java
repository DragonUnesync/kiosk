package V1;

import java.util.Arrays;

public final class j {
    public static final byte[] e = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f5789a;

    /* renamed from: b  reason: collision with root package name */
    public int f5790b;

    /* renamed from: c  reason: collision with root package name */
    public int f5791c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5792d;

    public final void a(byte[] bArr, int i, int i8) {
        if (this.f5789a) {
            int i9 = i8 - i;
            byte[] bArr2 = this.f5792d;
            int length = bArr2.length;
            int i10 = this.f5790b + i9;
            if (length < i10) {
                this.f5792d = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, this.f5792d, this.f5790b, i9);
            this.f5790b += i9;
        }
    }
}
