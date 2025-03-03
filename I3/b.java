package I3;

import E.e;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

public abstract class b {
    static {
        new OutputStream();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        int i;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i8 = 0;
        while (i8 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i8);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < min2) {
                int read = inputStream.read(bArr, i9, min2 - i9);
                if (read == -1) {
                    return a(arrayDeque, i8);
                }
                i9 += read;
                i8 += read;
            }
            if (min < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            min = e.u(((long) min) * ((long) i));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
