package K3;

import java.util.Arrays;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2663a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i8 = 0; i8 < 26; i8++) {
            byte b8 = (byte) (i8 + 10);
            bArr[i8 + 65] = b8;
            bArr[i8 + 97] = b8;
        }
        f2663a = bArr;
    }
}
