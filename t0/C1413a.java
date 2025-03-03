package t0;

/* renamed from: t0.a  reason: case insensitive filesystem */
public final class C1413a {
    public static final byte[] e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f15165a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15166b;

    /* renamed from: c  reason: collision with root package name */
    public int f15167c;

    /* renamed from: d  reason: collision with root package name */
    public char f15168d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public C1413a(CharSequence charSequence) {
        this.f15165a = charSequence;
        this.f15166b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f15165a;
        char charAt = charSequence.charAt(this.f15167c - 1);
        this.f15168d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f15167c);
            this.f15167c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f15167c--;
        char c8 = this.f15168d;
        if (c8 < 1792) {
            return e[c8];
        }
        return Character.getDirectionality(c8);
    }
}
