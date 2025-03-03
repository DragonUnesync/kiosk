package a6;

import f6.C0934y;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class M extends C0934y {
    public MessageDigest initialValue() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused) {
            throw new InternalError("SHA-1 not supported on this platform - Outdated?");
        }
    }
}
