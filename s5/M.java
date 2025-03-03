package S5;

public final class M {
    private long[] array = new long[32];
    private final long emptyVal;
    private int mask = 31;
    private int maxProbe;
    private long zeroVal;

    public M(long j7) {
        this.emptyVal = j7;
        this.zeroVal = j7;
        computeMaskAndProbe();
    }

    private void computeMaskAndProbe() {
        int length = this.array.length;
        this.mask = (length - 1) & -2;
        this.maxProbe = (int) Math.log((double) length);
    }

    private void expand() {
        long[] jArr = this.array;
        this.array = new long[(jArr.length * 2)];
        computeMaskAndProbe();
        for (int i = 0; i < jArr.length; i += 2) {
            long j7 = jArr[i];
            if (j7 != 0) {
                put(j7, jArr[i + 1]);
            }
        }
    }

    private int index(long j7) {
        long j8 = (j7 ^ (j7 >>> 33)) * -49064778989728563L;
        long j9 = (j8 ^ (j8 >>> 33)) * -4265267296055464877L;
        return this.mask & ((int) (j9 ^ (j9 >>> 33)));
    }

    public long get(long j7) {
        if (j7 == 0) {
            return this.zeroVal;
        }
        int index = index(j7);
        for (int i = 0; i < this.maxProbe; i++) {
            long[] jArr = this.array;
            if (jArr[index] == j7) {
                return jArr[index + 1];
            }
            index = (index + 2) & this.mask;
        }
        return this.emptyVal;
    }

    public long put(long j7, long j8) {
        int index;
        int i;
        long[] jArr;
        long j9;
        long j10;
        if (j7 == 0) {
            long j11 = this.zeroVal;
            this.zeroVal = j8;
            return j11;
        }
        loop0:
        while (true) {
            index = index(j7);
            i = 0;
            while (i < this.maxProbe) {
                jArr = this.array;
                j9 = jArr[index];
                if (j9 != j7 && j9 != 0) {
                    index = (index + 2) & this.mask;
                    i++;
                }
            }
            expand();
        }
        if (j9 == 0) {
            j10 = this.emptyVal;
        } else {
            j10 = jArr[index + 1];
        }
        jArr[index] = j7;
        jArr[index + 1] = j8;
        while (i < this.maxProbe) {
            index = (index + 2) & this.mask;
            long[] jArr2 = this.array;
            if (jArr2[index] == j7) {
                jArr2[index] = 0;
                return jArr2[index + 1];
            }
            i++;
        }
        return j10;
    }

    public void remove(long j7) {
        if (j7 == 0) {
            this.zeroVal = this.emptyVal;
            return;
        }
        int index = index(j7);
        int i = 0;
        while (i < this.maxProbe) {
            long[] jArr = this.array;
            if (jArr[index] == j7) {
                jArr[index] = 0;
                return;
            } else {
                index = (index + 2) & this.mask;
                i++;
            }
        }
    }
}
