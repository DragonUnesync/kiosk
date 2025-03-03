package a6;

import S5.C0185n;
import S5.D0;
import Y5.a;
import e6.C0852k;
import f6.C0934y;
import g6.Y;
import j$.util.Base64;
import java.security.MessageDigest;

public abstract class N {
    private static final C0934y MD5 = new L();
    private static final C0934y SHA1 = new M();

    public static String base64(byte[] bArr) {
        if (Y.javaVersion() >= 8) {
            return Base64.getEncoder().encodeToString(bArr);
        }
        C0185n wrappedBuffer = D0.wrappedBuffer(bArr);
        try {
            wrappedBuffer = a.encode(wrappedBuffer);
            return wrappedBuffer.toString(C0852k.UTF_8);
        } catch (Throwable th) {
            throw th;
        } finally {
            wrappedBuffer.release();
        }
    }

    public static int byteAtIndex(int i, int i8) {
        return (i >> ((3 - i8) * 8)) & 255;
    }

    private static byte[] digest(C0934y yVar, byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) yVar.get();
        messageDigest.reset();
        return messageDigest.digest(bArr);
    }

    public static byte[] md5(byte[] bArr) {
        return digest(MD5, bArr);
    }

    public static byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        Y.threadLocalRandom().nextBytes(bArr);
        return bArr;
    }

    public static int randomNumber(int i, int i8) {
        return (int) ((Y.threadLocalRandom().nextDouble() * ((double) (i8 - i))) + ((double) i));
    }

    public static byte[] sha1(byte[] bArr) {
        return digest(SHA1, bArr);
    }
}
