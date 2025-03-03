package P0;

import D6.h;
import java.util.NoSuchElementException;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public int f3719a;

    /* renamed from: b  reason: collision with root package name */
    public int f3720b;

    /* renamed from: c  reason: collision with root package name */
    public int f3721c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3722d;

    public m() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f3721c = highestOneBit - 1;
        this.f3722d = new int[highestOneBit];
    }

    public void a(int i) {
        int[] iArr = (int[]) this.f3722d;
        int i8 = this.f3720b;
        iArr[i8] = i;
        int i9 = this.f3721c & (i8 + 1);
        this.f3720b = i9;
        int i10 = this.f3719a;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length << 1;
            if (i12 >= 0) {
                int[] iArr2 = new int[i12];
                h.C(0, i10, iArr, iArr2, length);
                h.C(i11, 0, (int[]) this.f3722d, iArr2, this.f3719a);
                this.f3722d = iArr2;
                this.f3719a = 0;
                this.f3720b = length;
                this.f3721c = i12 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public long b() {
        int i = this.f3720b;
        if (i != 0) {
            int i8 = this.f3719a;
            long j7 = ((long[]) this.f3722d)[i8];
            this.f3719a = (i8 + 1) & this.f3721c;
            this.f3720b = i - 1;
            return j7;
        }
        throw new NoSuchElementException();
    }
}
