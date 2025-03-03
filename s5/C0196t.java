package S5;

/* renamed from: S5.t  reason: case insensitive filesystem */
public abstract class C0196t {
    /* access modifiers changed from: private */
    public static long compilePattern(byte b8) {
        return (((long) b8) & 255) * 72340172838076673L;
    }

    /* access modifiers changed from: private */
    public static int firstAnyPattern(long j7, long j8, boolean z) {
        int i;
        long j9 = j7 ^ j8;
        long j10 = ~(j9 | ((j9 & 9187201950435737471L) + 9187201950435737471L) | 9187201950435737471L);
        if (z) {
            i = Long.numberOfLeadingZeros(j10);
        } else {
            i = Long.numberOfTrailingZeros(j10);
        }
        return i >>> 3;
    }
}
