package Z5;

import X5.y;

/* renamed from: Z5.l  reason: case insensitive filesystem */
public final class C0394l implements y {
    static final C0394l INSTANCE = new C0394l();

    private C0394l() {
    }

    public void validate(CharSequence charSequence) {
        int validateValidHeaderValue = J.validateValidHeaderValue(charSequence);
        if (validateValidHeaderValue != -1) {
            throw new IllegalArgumentException("a header value contains prohibited character 0x" + Integer.toHexString(charSequence.charAt(validateValidHeaderValue)) + " at index " + validateValidHeaderValue + '.');
        }
    }
}
