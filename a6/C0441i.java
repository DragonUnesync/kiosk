package a6;

import S5.C0163c;
import S5.C0185n;
import S5.C0206y;
import T5.Y;
import X5.N;
import X5.P;
import java.util.List;

/* renamed from: a6.i  reason: case insensitive filesystem */
public final class C0441i extends N implements H {
    private final long maxFrameSize;
    private boolean receivedClosingHandshake;

    public C0441i(int i) {
        this.maxFrameSize = (long) i;
    }

    private G decodeBinaryFrame(Y y8, byte b8, C0185n nVar) {
        byte readByte;
        long j7 = 0;
        int i = 0;
        do {
            readByte = nVar.readByte();
            j7 = (j7 << 7) | ((long) (readByte & Byte.MAX_VALUE));
            if (j7 <= this.maxFrameSize) {
                i++;
                if (i > 8) {
                    throw new P();
                }
            } else {
                throw new P();
            }
        } while ((readByte & 128) == 128);
        if (b8 != -1 || j7 != 0) {
            return new C0433a(C0206y.readBytes(y8.alloc(), nVar, (int) j7));
        }
        this.receivedClosingHandshake = true;
        return new C0434b(true, 0, ((C0163c) y8.alloc()).buffer(0));
    }

    private G decodeTextFrame(Y y8, C0185n nVar) {
        int readerIndex = nVar.readerIndex();
        int actualReadableBytes = actualReadableBytes();
        int indexOf = nVar.indexOf(readerIndex, readerIndex + actualReadableBytes, (byte) -1);
        if (indexOf != -1) {
            int i = indexOf - readerIndex;
            if (((long) i) <= this.maxFrameSize) {
                C0185n readBytes = C0206y.readBytes(y8.alloc(), nVar, i);
                nVar.skipBytes(1);
                if (readBytes.indexOf(readBytes.readerIndex(), readBytes.writerIndex(), (byte) -1) < 0) {
                    return new C0439g(readBytes);
                }
                readBytes.release();
                throw new IllegalArgumentException("a text frame should not contain 0xFF.");
            }
            throw new P();
        } else if (((long) actualReadableBytes) <= this.maxFrameSize) {
            return null;
        } else {
            throw new P();
        }
    }

    public void decode(Y y8, C0185n nVar, List<Object> list) {
        G g8;
        if (this.receivedClosingHandshake) {
            nVar.skipBytes(actualReadableBytes());
            return;
        }
        byte readByte = nVar.readByte();
        if ((readByte & 128) == 128) {
            g8 = decodeBinaryFrame(y8, readByte, nVar);
        } else {
            g8 = decodeTextFrame(y8, nVar);
        }
        if (g8 != null) {
            list.add(g8);
        }
    }
}
