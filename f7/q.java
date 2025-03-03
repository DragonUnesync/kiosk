package f7;

import java.io.IOException;

public abstract class q {
    public static int a(int i, int i8, int i9) {
        if ((i8 & 8) != 0) {
            i--;
        }
        if (i9 <= i) {
            return i - i9;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i9 + " > remaining length " + i);
    }
}
