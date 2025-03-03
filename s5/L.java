package S5;

import java.util.Arrays;

public final class L {
    private int[] array = new int[9];
    private int size;

    private void lift(int i) {
        while (i > 1) {
            int i8 = i >> 1;
            if (subord(i8, i)) {
                swap(i, i8);
                i = i8;
            } else {
                return;
            }
        }
    }

    private void sink(int i) {
        while (true) {
            int i8 = i << 1;
            int i9 = this.size;
            if (i8 <= i9) {
                if (i8 < i9) {
                    int i10 = i8 + 1;
                    if (subord(i8, i10)) {
                        i8 = i10;
                    }
                }
                if (subord(i, i8)) {
                    swap(i, i8);
                    i = i8;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private boolean subord(int i, int i8) {
        int[] iArr = this.array;
        if (iArr[i] > iArr[i8]) {
            return true;
        }
        return false;
    }

    private void swap(int i, int i8) {
        int[] iArr = this.array;
        int i9 = iArr[i];
        iArr[i] = iArr[i8];
        iArr[i8] = i9;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public void offer(int i) {
        if (i != -1) {
            int i8 = this.size + 1;
            this.size = i8;
            int[] iArr = this.array;
            if (i8 == iArr.length) {
                this.array = Arrays.copyOf(iArr, ((iArr.length - 1) * 2) + 1);
            }
            int[] iArr2 = this.array;
            int i9 = this.size;
            iArr2[i9] = i;
            lift(i9);
            return;
        }
        throw new IllegalArgumentException("The NO_VALUE (-1) cannot be added to the queue.");
    }

    public int poll() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int[] iArr = this.array;
        int i8 = iArr[1];
        iArr[1] = iArr[i];
        iArr[i] = 0;
        this.size = i - 1;
        sink(1);
        return i8;
    }

    public void remove(int i) {
        int i8 = 1;
        while (true) {
            int i9 = this.size;
            if (i8 <= i9) {
                int[] iArr = this.array;
                if (iArr[i8] == i) {
                    this.size = i9 - 1;
                    iArr[i8] = iArr[i9];
                    lift(i8);
                    sink(i8);
                    return;
                }
                i8++;
            } else {
                return;
            }
        }
    }
}
