package a6;

import f6.C0934y;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class L extends C0934y {
    public MessageDigest initialValue() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            throw new InternalError("MD5 not supported on this platform - Outdated?");
        }
    }
}
