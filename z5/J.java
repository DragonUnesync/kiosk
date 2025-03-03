package Z5;

import e6.C0847f;
import org.altbeacon.bluetooth.Pdu;

public abstract class J {
    private static final long TOKEN_CHARS_HIGH;
    private static final long TOKEN_CHARS_LOW;

    static {
        I bits = new I().range('0', '9').range('a', 'z').range('A', 'Z').bits('-', '.', '_', '~').bits('!', '#', '$', '%', '&', '\'', '*', '+', '^', '`', '|');
        TOKEN_CHARS_HIGH = bits.high();
        TOKEN_CHARS_LOW = bits.low();
    }

    private static int validateAsciiStringToken(C0847f fVar) {
        byte[] array = fVar.array();
        int length = fVar.length() + fVar.arrayOffset();
        for (int arrayOffset = fVar.arrayOffset(); arrayOffset < length; arrayOffset++) {
            if (!I.contains(array[arrayOffset], TOKEN_CHARS_HIGH, TOKEN_CHARS_LOW)) {
                return arrayOffset - fVar.arrayOffset();
            }
        }
        return -1;
    }

    private static int validateCharSequenceToken(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!I.contains((byte) charSequence.charAt(i), TOKEN_CHARS_HIGH, TOKEN_CHARS_LOW)) {
                return i;
            }
        }
        return -1;
    }

    public static int validateToken(CharSequence charSequence) {
        if (charSequence instanceof C0847f) {
            return validateAsciiStringToken((C0847f) charSequence);
        }
        return validateCharSequenceToken(charSequence);
    }

    public static int validateValidHeaderValue(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return -1;
        }
        if (charSequence instanceof C0847f) {
            return verifyValidHeaderValueAsciiString((C0847f) charSequence);
        }
        return verifyValidHeaderValueCharSequence(charSequence);
    }

    private static int verifyValidHeaderValueAsciiString(C0847f fVar) {
        byte[] array = fVar.array();
        int arrayOffset = fVar.arrayOffset();
        byte b8 = array[arrayOffset] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        if (b8 < 33 || b8 == Byte.MAX_VALUE) {
            return 0;
        }
        int length = fVar.length();
        for (int i = arrayOffset + 1; i < length; i++) {
            byte b9 = array[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            if ((b9 < 32 && b9 != 9) || b9 == Byte.MAX_VALUE) {
                return i - arrayOffset;
            }
        }
        return -1;
    }

    private static int verifyValidHeaderValueCharSequence(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        if (charAt < '!' || charAt == 127) {
            return 0;
        }
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            char charAt2 = charSequence.charAt(i);
            if ((charAt2 < ' ' && charAt2 != 9) || charAt2 == 127) {
                return i;
            }
        }
        return -1;
    }
}
