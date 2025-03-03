package Z5;

import X5.v;

/* renamed from: Z5.i  reason: case insensitive filesystem */
public final class C0391i implements v {
    public void validateName(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("empty headers are not allowed [" + charSequence + ']');
        }
        int validateToken = J.validateToken(charSequence);
        if (validateToken != -1) {
            throw new IllegalArgumentException("a header name can only contain \"token\" characters, but found invalid character 0x" + Integer.toHexString(charSequence.charAt(validateToken)) + " at index " + validateToken + " of header '" + charSequence + "'.");
        }
    }
}
