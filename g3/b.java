package G3;

public final class b extends a {

    /* renamed from: U  reason: collision with root package name */
    public final char f1637U;

    public b(char c8) {
        this.f1637U = c8;
    }

    public final boolean a(char c8) {
        if (c8 == this.f1637U) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c8 = this.f1637U;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c8 & 15);
            c8 = (char) (c8 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
