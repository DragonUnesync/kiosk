package X5;

import g6.C0984q;

/* renamed from: X5.j  reason: case insensitive filesystem */
public final class C0359j implements C0358i {
    private int count;
    private int currentIdx;
    private final C0360k[] elements;
    private final int mask;

    public C0359j(int i) {
        this.elements = new C0360k[C0984q.safeFindNextPositivePowerOfTwo(i)];
        int i8 = 0;
        while (true) {
            C0360k[] kVarArr = this.elements;
            if (i8 < kVarArr.length) {
                kVarArr[i8] = new C0360k(this, 16, (C0356g) null);
                i8++;
            } else {
                this.count = kVarArr.length;
                this.currentIdx = kVarArr.length;
                this.mask = kVarArr.length - 1;
                return;
            }
        }
    }

    public C0360k getOrCreate() {
        int i = this.count;
        if (i == 0) {
            return new C0360k(C0360k.NOOP_RECYCLER, 4, (C0356g) null);
        }
        this.count = i - 1;
        int i8 = (this.currentIdx - 1) & this.mask;
        C0360k kVar = this.elements[i8];
        this.currentIdx = i8;
        return kVar;
    }

    public void recycle(C0360k kVar) {
        int i = this.currentIdx;
        this.elements[i] = kVar;
        this.currentIdx = this.mask & (i + 1);
        this.count++;
    }
}
