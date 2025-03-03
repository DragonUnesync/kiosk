package u2;

import W3.a;
import v2.c;

public final class t extends v {

    /* renamed from: U  reason: collision with root package name */
    public final String f15766U;

    /* renamed from: V  reason: collision with root package name */
    public final a f15767V;

    static {
        new t("");
    }

    public t(String str) {
        if (str != null) {
            this.f15766U = str.intern();
            int length = str.length();
            byte[] bArr = new byte[(length * 3)];
            int i = 0;
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = str.charAt(i8);
                if (charAt != 0 && charAt < 128) {
                    bArr[i] = (byte) charAt;
                    i++;
                } else if (charAt < 2048) {
                    bArr[i] = (byte) (((charAt >> 6) & 31) | 192);
                    bArr[i + 1] = (byte) ((charAt & '?') | 128);
                    i += 2;
                } else {
                    bArr[i] = (byte) (((charAt >> 12) & 15) | 224);
                    bArr[i + 1] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i + 2] = (byte) ((charAt & '?') | 128);
                    i += 3;
                }
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            this.f15767V = new a(bArr2);
            return;
        }
        throw new NullPointerException("string == null");
    }

    public final String a() {
        char c8;
        boolean z;
        String str = this.f15766U;
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt < 127) {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    sb.append('\\');
                }
                sb.append(charAt);
            } else if (charAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(charAt >> 12, 16));
                sb.append(Character.forDigit((charAt >> 8) & 15, 16));
                sb.append(Character.forDigit((charAt >> 4) & 15, 16));
                sb.append(Character.forDigit(charAt & 15, 16));
            } else if (charAt == 9) {
                sb.append("\\t");
            } else if (charAt == 10) {
                sb.append("\\n");
            } else if (charAt != 13) {
                if (i < length - 1) {
                    c8 = str.charAt(i + 1);
                } else {
                    c8 = 0;
                }
                if (c8 < '0' || c8 > '7') {
                    z = false;
                } else {
                    z = true;
                }
                sb.append('\\');
                for (int i8 = 6; i8 >= 0; i8 -= 3) {
                    char c9 = (char) (((charAt >> i8) & 7) + 48);
                    if (c9 != '0' || z) {
                        sb.append(c9);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            } else {
                sb.append("\\r");
            }
        }
        return sb.toString();
    }

    public final int d(C1490a aVar) {
        return this.f15766U.compareTo(((t) aVar).f15766U);
    }

    public final String e() {
        return "utf8";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f15766U.equals(((t) obj).f15766U);
    }

    public final String f() {
        return "\"" + a() + '\"';
    }

    public final c getType() {
        return c.p0;
    }

    public final int hashCode() {
        return this.f15766U.hashCode();
    }

    public final String toString() {
        return "string{\"" + a() + "\"}";
    }
}
