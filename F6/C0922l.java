package f6;

import java.util.Arrays;

/* renamed from: f6.l  reason: case insensitive filesystem */
public final class C0922l {
    private C0910C[] listeners;
    private int size = 2;

    public C0922l(C0910C c8, C0910C c9) {
        C0910C[] cArr = new C0910C[2];
        this.listeners = cArr;
        cArr[0] = c8;
        cArr[1] = c9;
    }

    public void add(C0910C c8) {
        C0910C[] cArr = this.listeners;
        int i = this.size;
        if (i == cArr.length) {
            cArr = (C0910C[]) Arrays.copyOf(cArr, i << 1);
            this.listeners = cArr;
        }
        cArr[i] = c8;
        this.size = i + 1;
    }

    public C0910C[] listeners() {
        return this.listeners;
    }

    public void remove(C0910C c8) {
        C0910C[] cArr = this.listeners;
        int i = this.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (cArr[i8] == c8) {
                int i9 = (i - i8) - 1;
                if (i9 > 0) {
                    System.arraycopy(cArr, i8 + 1, cArr, i8, i9);
                }
                int i10 = i - 1;
                cArr[i10] = null;
                this.size = i10;
                return;
            }
        }
    }

    public int size() {
        return this.size;
    }
}
