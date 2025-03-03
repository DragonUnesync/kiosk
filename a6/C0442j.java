package a6;

import S5.C0163c;
import S5.C0185n;
import S5.D0;
import T5.Y;
import X5.L;
import java.util.List;

/* renamed from: a6.j  reason: case insensitive filesystem */
public final class C0442j extends L implements I {
    private static final C0185n _0X00 = D0.unreleasableBuffer(D0.directBuffer(1, 1).writeByte(0)).asReadOnly();
    private static final C0185n _0XFF = D0.unreleasableBuffer(D0.directBuffer(1, 1).writeByte(-1)).asReadOnly();
    private static final C0185n _0XFF_0X00 = D0.unreleasableBuffer(D0.directBuffer(2, 2).writeByte(-1).writeByte(0)).asReadOnly();

    public void encode(Y y8, G g8, List<Object> list) {
        if (g8 instanceof C0439g) {
            C0185n content = g8.content();
            list.add(_0X00.duplicate());
            list.add(content.retain());
            list.add(_0XFF.duplicate());
        } else if (g8 instanceof C0434b) {
            list.add(_0XFF_0X00.duplicate());
        } else {
            C0185n content2 = g8.content();
            int readableBytes = content2.readableBytes();
            C0185n buffer = ((C0163c) y8.alloc()).buffer(5);
            try {
                buffer.writeByte(-128);
                int i = (readableBytes >>> 28) & 127;
                int i8 = (readableBytes >>> 14) & 127;
                int i9 = (readableBytes >>> 7) & 127;
                int i10 = readableBytes & 127;
                if (i != 0) {
                    buffer.writeByte(i | 128);
                    buffer.writeByte(i8 | 128);
                    buffer.writeByte(i9 | 128);
                    buffer.writeByte(i10);
                } else if (i8 == 0) {
                    if (i9 != 0) {
                        buffer.writeByte(i9 | 128);
                    }
                    buffer.writeByte(i10);
                } else {
                    buffer.writeByte(i8 | 128);
                    buffer.writeByte(i9 | 128);
                    buffer.writeByte(i10);
                }
                list.add(buffer);
                list.add(content2.retain());
            } catch (Throwable th) {
                buffer.release();
                throw th;
            }
        }
    }
}
