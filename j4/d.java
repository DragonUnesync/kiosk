package j4;

public enum d {
    TERMINATOR(new int[]{0, 0, 0}),
    NUMERIC(new int[]{10, 12, 14}),
    ALPHANUMERIC(new int[]{9, 11, 13}),
    STRUCTURED_APPEND(new int[]{0, 0, 0}),
    BYTE(new int[]{8, 16, 16}),
    ECI(new int[]{0, 0, 0}),
    KANJI(new int[]{8, 10, 12}),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}),
    HANZI(new int[]{8, 10, 12});
    

    /* renamed from: U  reason: collision with root package name */
    public final int[] f12883U;

    /* access modifiers changed from: public */
    d(int[] iArr) {
        this.f12883U = iArr;
    }
}
