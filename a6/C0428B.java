package a6;

import Z5.L;
import java.net.URI;

/* renamed from: a6.B  reason: case insensitive filesystem */
public abstract class C0428B {
    public static C0427A newHandshaker(URI uri, O o2, String str, boolean z, L l8, int i, boolean z6, boolean z8) {
        return newHandshaker(uri, o2, str, z, l8, i, z6, z8, -1);
    }

    public static C0427A newHandshaker(URI uri, O o2, String str, boolean z, L l8, int i, boolean z6, boolean z8, long j7) {
        O o8 = o2;
        O o9 = O.V13;
        if (o8 == o9) {
            return new z(uri, o9, str, z, l8, i, z6, z8, j7);
        }
        O o10 = O.V08;
        if (o8 == o10) {
            return new y(uri, o10, str, z, l8, i, z6, z8, j7);
        }
        O o11 = O.V07;
        if (o8 == o11) {
            return new x(uri, o11, str, z, l8, i, z6, z8, j7);
        }
        O o12 = O.V00;
        if (o8 == o12) {
            return new w(uri, o12, str, l8, i, j7);
        }
        throw new s("Protocol version " + o8 + " not supported.");
    }
}
