package S5;

import java.lang.reflect.Array;

public abstract class B0 {
    protected final int chunkSize;
    protected final int directMemoryCacheAlignment;
    final int lookupMaxSize;
    final int nPSizes;
    final int nSizes;
    final int nSubpages;
    private final int[] pageIdx2sizeTab;
    protected final int pageShifts;
    protected final int pageSize;
    private final int[] size2idxTab;
    private final int[] sizeIdx2sizeTab;
    final int smallMaxSizeIdx;

    public B0(int i, int i8, int i9, int i10) {
        int i11 = i8;
        int i12 = i9;
        int i13 = i10;
        int[] iArr = new int[2];
        iArr[1] = 7;
        iArr[0] = (C0168e0.log2(i9) - 5) << 2;
        short[][] sArr = (short[][]) Array.newInstance(Short.TYPE, iArr);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < 4) {
            short[] newSizeClass = newSizeClass(i15, 4, 4, i14, i11);
            sArr[i15] = newSizeClass;
            i16 = sizeOf(newSizeClass, i13);
            i14++;
            i15++;
        }
        int i17 = 6;
        int i18 = 4;
        while (i16 < i12) {
            int i19 = 1;
            while (i19 <= 4 && i16 < i12) {
                short[] newSizeClass2 = newSizeClass(i15, i17, i18, i19, i11);
                sArr[i15] = newSizeClass2;
                i16 = sizeOf(newSizeClass2, i13);
                i19++;
                i15++;
            }
            i17++;
            i18++;
        }
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        for (int i24 = 0; i24 < i15; i24++) {
            short[] sArr2 = sArr[i24];
            i22 = sArr2[4] == 1 ? i22 + 1 : i22;
            if (sArr2[5] == 1) {
                i23++;
                i20 = i24;
            }
            if (sArr2[6] != 0) {
                i21 = sizeOf(sArr2, i13);
            }
        }
        this.smallMaxSizeIdx = i20;
        this.lookupMaxSize = i21;
        this.nPSizes = i22;
        this.nSubpages = i23;
        this.nSizes = i15;
        this.pageSize = i;
        this.pageShifts = i11;
        this.chunkSize = i12;
        this.directMemoryCacheAlignment = i13;
        this.sizeIdx2sizeTab = newIdx2SizeTab(sArr, i15, i13);
        this.pageIdx2sizeTab = newPageIdx2sizeTab(sArr, i15, i22, i13);
        this.size2idxTab = newSize2idxTab(i21, sArr);
    }

    private static int alignSizeIfNeeded(int i, int i8) {
        int i9;
        if (i8 > 0 && (i9 = (i8 - 1) & i) != 0) {
            return (i + i8) - i9;
        }
        return i;
    }

    private static int calculateSize(int i, int i8, int i9) {
        return (1 << i) + (i8 << i9);
    }

    private static int[] newIdx2SizeTab(short[][] sArr, int i, int i8) {
        int[] iArr = new int[i];
        for (int i9 = 0; i9 < i; i9++) {
            iArr[i9] = sizeOf(sArr[i9], i8);
        }
        return iArr;
    }

    private static int[] newPageIdx2sizeTab(short[][] sArr, int i, int i8, int i9) {
        int[] iArr = new int[i8];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            short[] sArr2 = sArr[i11];
            if (sArr2[4] == 1) {
                iArr[i10] = sizeOf(sArr2, i9);
                i10++;
            }
        }
        return iArr;
    }

    private static int[] newSize2idxTab(int i, short[][] sArr) {
        int[] iArr = new int[(i >> 4)];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 <= i) {
            int i11 = 1 << (sArr[i9][2] - 4);
            while (i8 <= i) {
                int i12 = i11 - 1;
                if (i11 <= 0) {
                    break;
                }
                iArr[i10] = i9;
                i11 = i12;
                int i13 = (i10 + 2) << 4;
                i10++;
                i8 = i13;
            }
            i9++;
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static short[] newSizeClass(int r7, int r8, int r9, int r10, int r11) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            if (r9 < r11) goto L_0x0007
        L_0x0005:
            r3 = 1
            goto L_0x0015
        L_0x0007:
            int r3 = r2 << r11
            int r4 = calculateSize(r8, r10, r9)
            int r5 = r4 / r3
            int r5 = r5 * r3
            if (r4 != r5) goto L_0x0014
            goto L_0x0005
        L_0x0014:
            r3 = 0
        L_0x0015:
            if (r10 != 0) goto L_0x0019
            r4 = 0
            goto L_0x001d
        L_0x0019:
            int r4 = S5.C0168e0.log2(r10)
        L_0x001d:
            int r5 = r2 << r4
            if (r5 >= r10) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            int r4 = r4 + r9
            if (r4 != r8) goto L_0x002a
            int r4 = r8 + 1
            goto L_0x002b
        L_0x002a:
            r4 = r8
        L_0x002b:
            if (r4 != r8) goto L_0x002e
            r5 = 1
        L_0x002e:
            int r11 = r11 + r0
            if (r4 >= r11) goto L_0x0033
            r11 = 1
            goto L_0x0034
        L_0x0033:
            r11 = 0
        L_0x0034:
            r6 = 12
            if (r4 < r6) goto L_0x003f
            if (r4 != r6) goto L_0x003d
            if (r5 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r4 = 0
            goto L_0x0040
        L_0x003f:
            r4 = r9
        L_0x0040:
            short r7 = (short) r7
            short r8 = (short) r8
            short r9 = (short) r9
            short r10 = (short) r10
            short r4 = (short) r4
            r5 = 7
            short[] r5 = new short[r5]
            r5[r1] = r7
            r5[r2] = r8
            r5[r0] = r9
            r7 = 3
            r5[r7] = r10
            r7 = 4
            r5[r7] = r3
            r7 = 5
            r5[r7] = r11
            r7 = 6
            r5[r7] = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.B0.newSizeClass(int, int, int, int, int):short[]");
    }

    private static int normalizeSizeCompute(int i) {
        int i8;
        int log2 = C0168e0.log2((i << 1) - 1);
        if (log2 < 7) {
            i8 = 4;
        } else {
            i8 = log2 - 3;
        }
        int i9 = (1 << i8) - 1;
        return (i + i9) & (~i9);
    }

    private int pages2pageIdxCompute(int i, boolean z) {
        int i8;
        int i9;
        int i10 = i << this.pageShifts;
        if (i10 > this.chunkSize) {
            return this.nPSizes;
        }
        int log2 = C0168e0.log2((i10 << 1) - 1);
        int i11 = this.pageShifts;
        if (log2 < i11 + 2) {
            i8 = 0;
        } else {
            i8 = log2 - (i11 + 2);
        }
        int i12 = i8 << 2;
        if (log2 < i11 + 3) {
            i9 = i11;
        } else {
            i9 = log2 - 3;
        }
        int i13 = i12 + (((i10 - 1) >> i9) & 3);
        if (!z || this.pageIdx2sizeTab[i13] <= (i << i11)) {
            return i13;
        }
        return i13 - 1;
    }

    private static int sizeOf(short[] sArr, int i) {
        return alignSizeIfNeeded(calculateSize(sArr[1], sArr[3], sArr[2]), i);
    }

    public int normalizeSize(int i) {
        if (i == 0) {
            return this.sizeIdx2sizeTab[0];
        }
        int alignSizeIfNeeded = alignSizeIfNeeded(i, this.directMemoryCacheAlignment);
        if (alignSizeIfNeeded <= this.lookupMaxSize) {
            return this.sizeIdx2sizeTab[this.size2idxTab[(alignSizeIfNeeded - 1) >> 4]];
        }
        return normalizeSizeCompute(alignSizeIfNeeded);
    }

    public int pages2pageIdx(int i) {
        return pages2pageIdxCompute(i, false);
    }

    public int pages2pageIdxFloor(int i) {
        return pages2pageIdxCompute(i, true);
    }

    public int size2SizeIdx(int i) {
        int i8 = 0;
        if (i == 0) {
            return 0;
        }
        if (i > this.chunkSize) {
            return this.nSizes;
        }
        int alignSizeIfNeeded = alignSizeIfNeeded(i, this.directMemoryCacheAlignment);
        int i9 = 4;
        if (alignSizeIfNeeded <= this.lookupMaxSize) {
            return this.size2idxTab[(alignSizeIfNeeded - 1) >> 4];
        }
        int log2 = C0168e0.log2((alignSizeIfNeeded << 1) - 1);
        if (log2 >= 7) {
            i8 = log2 - 6;
        }
        int i10 = i8 << 2;
        if (log2 >= 7) {
            i9 = log2 - 3;
        }
        return i10 + (((alignSizeIfNeeded - 1) >> i9) & 3);
    }

    public int sizeIdx2size(int i) {
        return this.sizeIdx2sizeTab[i];
    }
}
