package V0;

import Q7.g;
import java.nio.ByteBuffer;

public final class C {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5485d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f5486a;

    /* renamed from: b  reason: collision with root package name */
    public int f5487b;

    /* renamed from: c  reason: collision with root package name */
    public int f5488c;

    public static void a(ByteBuffer byteBuffer, long j7, int i, int i8, boolean z) {
        byte b8;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z6 = false;
        byteBuffer.put((byte) 0);
        if (z) {
            b8 = 2;
        } else {
            b8 = 0;
        }
        byteBuffer.put(b8);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j8 = (long) i8;
        if ((j8 >> 8) == 0) {
            z6 = true;
        }
        g.e(z6, "out of range: %s", j8);
        byteBuffer.put((byte) ((int) j8));
    }
}
