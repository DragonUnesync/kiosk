package Z5;

import X5.v;

public final class r implements v {
    public void validateName(CharSequence charSequence) {
        C0395m.HttpNameValidator.validateName(charSequence);
        if (G.CONTENT_LENGTH.contentEqualsIgnoreCase(charSequence) || G.TRANSFER_ENCODING.contentEqualsIgnoreCase(charSequence) || G.TRAILER.contentEqualsIgnoreCase(charSequence)) {
            throw new IllegalArgumentException("prohibited trailing header: " + charSequence);
        }
    }
}
