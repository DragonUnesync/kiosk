package e6;

import N.e;
import Q0.g;
import g6.C0984q;
import g6.Y;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

/* renamed from: e6.f  reason: case insensitive filesystem */
public final class C0847f implements CharSequence, Comparable {
    public static final C0858q CASE_INSENSITIVE_HASHER = new C0845d();
    public static final C0858q CASE_SENSITIVE_HASHER = new C0846e();
    public static final C0847f EMPTY_STRING = cached("");
    private int hash;
    private final int length;
    private final int offset;
    private String string;
    private final byte[] value;

    public C0847f(byte[] bArr, int i, int i8, boolean z) {
        if (z) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i, bArr2, 0, i8);
            this.value = bArr2;
            this.offset = 0;
        } else if (!C0984q.isOutOfBounds(i, i8, bArr.length)) {
            this.value = bArr;
            this.offset = i;
        } else {
            StringBuilder e = C1477r.e("expected: 0 <= start(", i, ") <= start + length(", i8, ") <= value.length(");
            e.append(bArr.length);
            e.append(')');
            throw new IndexOutOfBoundsException(e.toString());
        }
        this.length = i8;
    }

    public static char b2c(byte b8) {
        return (char) (b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE);
    }

    public static byte c2b(char c8) {
        if (c8 > 255) {
            c8 = '?';
        }
        return (byte) c8;
    }

    private static byte c2b0(char c8) {
        return (byte) c8;
    }

    public static C0847f cached(String str) {
        C0847f fVar = new C0847f(str);
        fVar.string = str;
        return fVar;
    }

    private static boolean equalsIgnoreCase(byte b8, byte b9) {
        return b8 == b9 || toLowerCase(b8) == toLowerCase(b9);
    }

    public static boolean isUpperCase(byte b8) {
        return b8 >= 65 && b8 <= 90;
    }

    public static C0847f of(CharSequence charSequence) {
        if (charSequence instanceof C0847f) {
            return (C0847f) charSequence;
        }
        return new C0847f(charSequence);
    }

    private static byte toLowerCase(byte b8) {
        return isUpperCase(b8) ? (byte) (b8 + 32) : b8;
    }

    public static CharSequence trim(CharSequence charSequence) {
        if (charSequence instanceof C0847f) {
            return ((C0847f) charSequence).trim();
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).trim();
        }
        int length2 = charSequence.length() - 1;
        int i = 0;
        while (i <= length2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        int i8 = length2;
        while (i8 >= i && charSequence.charAt(i8) <= ' ') {
            i8--;
        }
        if (i == 0 && i8 == length2) {
            return charSequence;
        }
        return charSequence.subSequence(i, i8);
    }

    public byte[] array() {
        return this.value;
    }

    public int arrayOffset() {
        return this.offset;
    }

    public byte byteAt(int i) {
        if (i < 0 || i >= this.length) {
            throw new IndexOutOfBoundsException(e.z(g.p(i, "index: ", " must be in the range [0,"), this.length, ")"));
        } else if (Y.hasUnsafe()) {
            return Y.getByte(this.value, i + this.offset);
        } else {
            return this.value[i + this.offset];
        }
    }

    public char charAt(int i) {
        return b2c(byteAt(i));
    }

    public boolean contentEquals(CharSequence charSequence) {
        if (this == charSequence) {
            return true;
        }
        if (charSequence == null || charSequence.length() != length()) {
            return false;
        }
        if (charSequence instanceof C0847f) {
            return equals(charSequence);
        }
        int arrayOffset = arrayOffset();
        for (int i = 0; i < charSequence.length(); i++) {
            if (b2c(this.value[arrayOffset]) != charSequence.charAt(i)) {
                return false;
            }
            arrayOffset++;
        }
        return true;
    }

    public boolean contentEqualsIgnoreCase(CharSequence charSequence) {
        if (this == charSequence) {
            return true;
        }
        if (charSequence == null || charSequence.length() != length()) {
            return false;
        }
        if (charSequence instanceof C0847f) {
            C0847f fVar = (C0847f) charSequence;
            int arrayOffset = arrayOffset();
            int arrayOffset2 = fVar.arrayOffset();
            int length2 = length() + arrayOffset;
            while (arrayOffset < length2) {
                if (!equalsIgnoreCase(this.value[arrayOffset], fVar.value[arrayOffset2])) {
                    return false;
                }
                arrayOffset++;
                arrayOffset2++;
            }
            return true;
        }
        int arrayOffset3 = arrayOffset();
        int length3 = length();
        for (int i = 0; i < length3; i++) {
            if (!equalsIgnoreCase(b2c(this.value[arrayOffset3]), charSequence.charAt(i))) {
                return false;
            }
            arrayOffset3++;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C0847f.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0847f fVar = (C0847f) obj;
        if (length() == fVar.length() && hashCode() == fVar.hashCode() && Y.equals(array(), arrayOffset(), fVar.array(), fVar.arrayOffset(), length())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.hash;
        if (i != 0) {
            return i;
        }
        int hashCodeAscii = Y.hashCodeAscii(this.value, this.offset, this.length);
        this.hash = hashCodeAscii;
        return hashCodeAscii;
    }

    public int indexOf(char c8, int i) {
        if (c8 > 255) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        byte c2b0 = c2b0(c8);
        int i8 = this.offset;
        int i9 = this.length + i8;
        for (int i10 = i + i8; i10 < i9; i10++) {
            if (this.value[i10] == c2b0) {
                return i10 - this.offset;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    public int length() {
        return this.length;
    }

    public String toString() {
        String str = this.string;
        if (str != null) {
            return str;
        }
        String fVar = toString(0);
        this.string = fVar;
        return fVar;
    }

    private static boolean equalsIgnoreCase(char c8, char c9) {
        return c8 == c9 || toLowerCase(c8) == toLowerCase(c9);
    }

    public static boolean isUpperCase(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    public static char toLowerCase(char c8) {
        return isUpperCase(c8) ? (char) (c8 + ' ') : c8;
    }

    public int compareTo(CharSequence charSequence) {
        int i = 0;
        if (this == charSequence) {
            return 0;
        }
        int length2 = length();
        int length3 = charSequence.length();
        int min = Math.min(length2, length3);
        int arrayOffset = arrayOffset();
        while (i < min) {
            int b2c = b2c(this.value[arrayOffset]) - charSequence.charAt(i);
            if (b2c != 0) {
                return b2c;
            }
            i++;
            arrayOffset++;
        }
        return length2 - length3;
    }

    public C0847f subSequence(int i, int i8) {
        return subSequence(i, i8, true);
    }

    public C0847f subSequence(int i, int i8, boolean z) {
        int i9 = i8 - i;
        if (C0984q.isOutOfBounds(i, i9, length())) {
            StringBuilder e = C1477r.e("expected: 0 <= start(", i, ") <= end (", i8, ") <= length(");
            e.append(length());
            e.append(')');
            throw new IndexOutOfBoundsException(e.toString());
        } else if (i == 0 && i8 == length()) {
            return this;
        } else {
            if (i8 == i) {
                return EMPTY_STRING;
            }
            return new C0847f(this.value, i + this.offset, i9, z);
        }
    }

    public static int hashCode(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        if (charSequence instanceof C0847f) {
            return charSequence.hashCode();
        }
        return Y.hashCodeAscii(charSequence);
    }

    public String toString(int i) {
        return toString(i, length());
    }

    public static int indexOf(CharSequence charSequence, char c8, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c8, i);
        }
        if (charSequence instanceof C0847f) {
            return ((C0847f) charSequence).indexOf(c8, i);
        }
        if (charSequence == null) {
            return -1;
        }
        int length2 = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        while (i < length2) {
            if (charSequence.charAt(i) == c8) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String toString(int i, int i8) {
        int i9 = i8 - i;
        if (i9 == 0) {
            return "";
        }
        if (!C0984q.isOutOfBounds(i, i9, length())) {
            return new String(this.value, 0, i + this.offset, i9);
        }
        StringBuilder e = C1477r.e("expected: 0 <= start(", i, ") <= srcIdx + length(", i9, ") <= srcLen(");
        e.append(length());
        e.append(')');
        throw new IndexOutOfBoundsException(e.toString());
    }

    public static boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence instanceof C0847f) {
            return ((C0847f) charSequence).contentEquals(charSequence2);
        } else {
            if (charSequence2 instanceof C0847f) {
                return ((C0847f) charSequence2).contentEquals(charSequence);
            }
            if (charSequence.length() != charSequence2.length()) {
                return false;
            }
            for (int i = 0; i < charSequence.length(); i++) {
                if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean contentEqualsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence instanceof C0847f) {
            return ((C0847f) charSequence).contentEqualsIgnoreCase(charSequence2);
        } else {
            if (charSequence2 instanceof C0847f) {
                return ((C0847f) charSequence2).contentEqualsIgnoreCase(charSequence);
            }
            if (charSequence.length() != charSequence2.length()) {
                return false;
            }
            for (int i = 0; i < charSequence.length(); i++) {
                if (!equalsIgnoreCase(charSequence.charAt(i), charSequence2.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public C0847f trim() {
        int arrayOffset = arrayOffset();
        int length2 = (length() + arrayOffset()) - 1;
        while (arrayOffset <= length2 && this.value[arrayOffset] <= 32) {
            arrayOffset++;
        }
        int i = length2;
        while (i >= arrayOffset && this.value[i] <= 32) {
            i--;
        }
        if (arrayOffset == 0 && i == length2) {
            return this;
        }
        return new C0847f(this.value, arrayOffset, (i - arrayOffset) + 1, false);
    }

    public C0847f(CharSequence charSequence) {
        this(charSequence, 0, charSequence.length());
    }

    public C0847f(CharSequence charSequence, int i, int i8) {
        if (!C0984q.isOutOfBounds(i, i8, charSequence.length())) {
            this.value = Y.allocateUninitializedArray(i8);
            int i9 = 0;
            while (i9 < i8) {
                this.value[i9] = c2b(charSequence.charAt(i));
                i9++;
                i++;
            }
            this.offset = 0;
            this.length = i8;
            return;
        }
        StringBuilder e = C1477r.e("expected: 0 <= start(", i, ") <= start + length(", i8, ") <= value.length(");
        e.append(charSequence.length());
        e.append(')');
        throw new IndexOutOfBoundsException(e.toString());
    }
}
