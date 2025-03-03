package a6;

import Q0.g;
import S5.C0163c;
import S5.C0185n;
import T5.Y;
import X5.L;
import X5.P;
import e6.J;
import h6.C1082c;
import h6.d;
import java.nio.ByteOrder;
import java.util.List;

public class p extends L implements I {
    private static final C1082c logger = d.getInstance((Class<?>) p.class);
    private final boolean maskPayload;

    public p(boolean z) {
        this.maskPayload = z;
    }

    public void encode(Y y8, G g8, List<Object> list) {
        byte b8;
        C0185n nVar;
        C0185n content = g8.content();
        int i = 0;
        if (g8 instanceof C0439g) {
            b8 = 1;
        } else if (g8 instanceof C0437e) {
            b8 = 9;
        } else if (g8 instanceof C0438f) {
            b8 = 10;
        } else if (g8 instanceof C0434b) {
            b8 = 8;
        } else if (g8 instanceof C0433a) {
            b8 = 2;
        } else if (g8 instanceof C0435c) {
            b8 = 0;
        } else {
            throw new UnsupportedOperationException("Cannot encode frame of type: ".concat(g8.getClass().getName()));
        }
        int readableBytes = content.readableBytes();
        C1082c cVar = logger;
        if (cVar.isTraceEnabled()) {
            cVar.trace("Encoding WebSocket Frame opCode={} length={}", Byte.valueOf(b8), Integer.valueOf(readableBytes));
        }
        int rsv = ((g8.rsv() % 8) << 4) | (g8.isFinalFragment() ? 128 : 0) | (b8 % 128);
        if (b8 != 9 || readableBytes <= 125) {
            J j7 = null;
            try {
                boolean z = this.maskPayload;
                int i8 = z ? 4 : 0;
                if (readableBytes <= 125) {
                    nVar = ((C0163c) y8.alloc()).buffer(i8 + 2 + readableBytes);
                    nVar.writeByte(rsv);
                    nVar.writeByte((byte) (this.maskPayload ? ((byte) readableBytes) | 128 : (byte) readableBytes));
                } else {
                    int i9 = 255;
                    if (readableBytes <= 65535) {
                        int i10 = i8 + 4;
                        if (z || readableBytes <= 1024) {
                            i10 += readableBytes;
                        }
                        nVar = ((C0163c) y8.alloc()).buffer(i10);
                        nVar.writeByte(rsv);
                        nVar.writeByte(this.maskPayload ? 254 : 126);
                        nVar.writeByte((readableBytes >>> 8) & 255);
                        nVar.writeByte(readableBytes & 255);
                    } else {
                        int i11 = i8 + 10;
                        if (z) {
                            i11 += readableBytes;
                        }
                        nVar = ((C0163c) y8.alloc()).buffer(i11);
                        nVar.writeByte(rsv);
                        if (!this.maskPayload) {
                            i9 = 127;
                        }
                        nVar.writeByte(i9);
                        nVar.writeLong((long) readableBytes);
                    }
                }
                if (this.maskPayload) {
                    int nextInt = g6.Y.threadLocalRandom().nextInt(Integer.MAX_VALUE);
                    nVar.writeInt(nextInt);
                    if (content.isReadable()) {
                        ByteOrder order = content.order();
                        ByteOrder order2 = nVar.order();
                        int readerIndex = content.readerIndex();
                        int writerIndex = content.writerIndex();
                        if (order == order2) {
                            long j8 = ((long) nextInt) & 4294967295L;
                            long j9 = j8 | (j8 << 32);
                            if (order == ByteOrder.LITTLE_ENDIAN) {
                                j9 = Long.reverseBytes(j9);
                            }
                            int i12 = writerIndex - 7;
                            while (readerIndex < i12) {
                                nVar.writeLong(content.getLong(readerIndex) ^ j9);
                                readerIndex += 8;
                            }
                            if (readerIndex < writerIndex - 3) {
                                nVar.writeInt(content.getInt(readerIndex) ^ ((int) j9));
                                readerIndex += 4;
                            }
                        }
                        while (readerIndex < writerIndex) {
                            nVar.writeByte(content.getByte(readerIndex) ^ N.byteAtIndex(nextInt, i & 3));
                            readerIndex++;
                            i++;
                        }
                    }
                    list.add(nVar);
                } else if (nVar.writableBytes() >= content.readableBytes()) {
                    nVar.writeBytes(content);
                    list.add(nVar);
                } else {
                    list.add(nVar);
                    list.add(content.retain());
                }
            } catch (Throwable th) {
                if (j7 != null) {
                    j7.release();
                }
                throw th;
            }
        } else {
            throw new P(g.m(readableBytes, "invalid payload for PING (payload length must be <= 125, was "));
        }
    }
}
