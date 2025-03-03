package S5;

import Q0.g;
import g6.B;
import g6.C0984q;
import g6.Y;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.altbeacon.bluetooth.Pdu;

public abstract class U0 {
    private static final boolean UNALIGNED = Y.isUnaligned();

    public static byte getByte(long j7) {
        return Y.getByte(j7);
    }

    public static void getBytes(C0159a aVar, long j7, int i, C0185n nVar, int i8, int i9) {
        aVar.checkIndex(i, i9);
        B.checkNotNull(nVar, "dst");
        if (C0984q.isOutOfBounds(i8, i9, nVar.capacity())) {
            throw new IndexOutOfBoundsException(g.m(i8, "dstIndex: "));
        } else if (nVar.hasMemoryAddress()) {
            Y.copyMemory(j7, nVar.memoryAddress() + ((long) i8), (long) i9);
        } else if (nVar.hasArray()) {
            Y.copyMemory(j7, nVar.array(), nVar.arrayOffset() + i8, (long) i9);
        } else {
            nVar.setBytes(i8, (C0185n) aVar, i, i9);
        }
    }

    public static int getInt(long j7) {
        if (UNALIGNED) {
            int i = Y.getInt(j7);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? i : Integer.reverseBytes(i);
        }
        return (Y.getByte(j7 + 3) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (Y.getByte(j7) << 24) | ((Y.getByte(1 + j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((Y.getByte(2 + j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public static int getIntLE(long j7) {
        if (UNALIGNED) {
            int i = Y.getInt(j7);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? Integer.reverseBytes(i) : i;
        }
        return (Y.getByte(j7 + 3) << 24) | (Y.getByte(j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((Y.getByte(1 + j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((Y.getByte(2 + j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
    }

    public static long getLong(long j7) {
        if (UNALIGNED) {
            long j8 = Y.getLong(j7);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? j8 : Long.reverseBytes(j8);
        }
        return (((long) Y.getByte(j7 + 7)) & 255) | (((long) Y.getByte(j7)) << 56) | ((((long) Y.getByte(1 + j7)) & 255) << 48) | ((((long) Y.getByte(2 + j7)) & 255) << 40) | ((((long) Y.getByte(3 + j7)) & 255) << 32) | ((((long) Y.getByte(4 + j7)) & 255) << 24) | ((((long) Y.getByte(5 + j7)) & 255) << 16) | ((((long) Y.getByte(6 + j7)) & 255) << 8);
    }

    public static long getLongLE(long j7) {
        if (UNALIGNED) {
            long j8 = Y.getLong(j7);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? Long.reverseBytes(j8) : j8;
        }
        return (((long) Y.getByte(j7 + 7)) << 56) | (((long) Y.getByte(j7)) & 255) | ((((long) Y.getByte(1 + j7)) & 255) << 8) | ((((long) Y.getByte(2 + j7)) & 255) << 16) | ((((long) Y.getByte(3 + j7)) & 255) << 24) | ((((long) Y.getByte(4 + j7)) & 255) << 32) | ((((long) Y.getByte(5 + j7)) & 255) << 40) | ((255 & ((long) Y.getByte(6 + j7))) << 48);
    }

    public static short getShort(long j7) {
        if (UNALIGNED) {
            short s8 = Y.getShort(j7);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? s8 : Short.reverseBytes(s8);
        }
        return (short) ((Y.getByte(j7 + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (Y.getByte(j7) << 8));
    }

    public static short getShortLE(long j7) {
        if (UNALIGNED) {
            short s8 = Y.getShort(j7);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(s8) : s8;
        }
        return (short) ((Y.getByte(j7 + 1) << 8) | (Y.getByte(j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE));
    }

    public static int getUnsignedMedium(long j7) {
        int i;
        byte b8;
        short s8;
        if (UNALIGNED) {
            i = (Y.getByte(j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16;
            if (Y.BIG_ENDIAN_NATIVE_ORDER) {
                s8 = Y.getShort(j7 + 1);
            } else {
                s8 = Short.reverseBytes(Y.getShort(j7 + 1));
            }
            b8 = s8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        } else {
            i = ((Y.getByte(j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((Y.getByte(1 + j7) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
            b8 = Y.getByte(j7 + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        }
        return b8 | i;
    }

    public static Q0 newUnsafeDirectByteBuf(C0187o oVar, int i, int i8) {
        if (Y.useDirectBufferNoCleaner()) {
            return new S0(oVar, i, i8);
        }
        return new Q0(oVar, i, i8);
    }

    public static void setByte(long j7, int i) {
        Y.putByte(j7, (byte) i);
    }

    public static void setBytes(C0159a aVar, long j7, int i, C0185n nVar, int i8, int i9) {
        aVar.checkIndex(i, i9);
        B.checkNotNull(nVar, "src");
        if (C0984q.isOutOfBounds(i8, i9, nVar.capacity())) {
            throw new IndexOutOfBoundsException(g.m(i8, "srcIndex: "));
        } else if (i9 == 0) {
        } else {
            if (nVar.hasMemoryAddress()) {
                Y.copyMemory(nVar.memoryAddress() + ((long) i8), j7, (long) i9);
            } else if (nVar.hasArray()) {
                Y.copyMemory(nVar.array(), nVar.arrayOffset() + i8, j7, (long) i9);
            } else {
                nVar.getBytes(i8, (C0185n) aVar, i, i9);
            }
        }
    }

    public static void setInt(long j7, int i) {
        if (UNALIGNED) {
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                i = Integer.reverseBytes(i);
            }
            Y.putInt(j7, i);
            return;
        }
        Y.putByte(j7, (byte) (i >>> 24));
        Y.putByte(1 + j7, (byte) (i >>> 16));
        Y.putByte(2 + j7, (byte) (i >>> 8));
        Y.putByte(j7 + 3, (byte) i);
    }

    public static void setLong(long j7, long j8) {
        if (UNALIGNED) {
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                j8 = Long.reverseBytes(j8);
            }
            Y.putLong(j7, j8);
            return;
        }
        Y.putByte(j7, (byte) ((int) (j8 >>> 56)));
        Y.putByte(1 + j7, (byte) ((int) (j8 >>> 48)));
        Y.putByte(2 + j7, (byte) ((int) (j8 >>> 40)));
        Y.putByte(3 + j7, (byte) ((int) (j8 >>> 32)));
        Y.putByte(4 + j7, (byte) ((int) (j8 >>> 24)));
        Y.putByte(5 + j7, (byte) ((int) (j8 >>> 16)));
        Y.putByte(6 + j7, (byte) ((int) (j8 >>> 8)));
        Y.putByte(j7 + 7, (byte) ((int) j8));
    }

    public static void setMedium(long j7, int i) {
        Y.putByte(j7, (byte) (i >>> 16));
        if (UNALIGNED) {
            long j8 = j7 + 1;
            short s8 = (short) i;
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                s8 = Short.reverseBytes(s8);
            }
            Y.putShort(j8, s8);
            return;
        }
        Y.putByte(1 + j7, (byte) (i >>> 8));
        Y.putByte(j7 + 2, (byte) i);
    }

    public static void setShort(long j7, int i) {
        if (UNALIGNED) {
            short s8 = (short) i;
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                s8 = Short.reverseBytes(s8);
            }
            Y.putShort(j7, s8);
            return;
        }
        Y.putByte(j7, (byte) (i >>> 8));
        Y.putByte(j7 + 1, (byte) i);
    }

    private static void setSingleBytes(C0159a aVar, long j7, int i, ByteBuffer byteBuffer, int i8) {
        aVar.checkIndex(i, i8);
        int limit = byteBuffer.limit();
        for (int position = byteBuffer.position(); position < limit; position++) {
            Y.putByte(j7, byteBuffer.get(position));
            j7++;
        }
        byteBuffer.position(limit);
    }

    public static void setZero(byte[] bArr, int i, int i8) {
        if (i8 != 0) {
            Y.setMemory(bArr, i, (long) i8, (byte) 0);
        }
    }

    public static byte getByte(byte[] bArr, int i) {
        return Y.getByte(bArr, i);
    }

    public static void setByte(byte[] bArr, int i, int i8) {
        Y.putByte(bArr, i, (byte) i8);
    }

    public static void setZero(long j7, int i) {
        if (i != 0) {
            Y.setMemory(j7, (long) i, (byte) 0);
        }
    }

    public static short getShort(byte[] bArr, int i) {
        if (UNALIGNED) {
            short s8 = Y.getShort(bArr, i);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? s8 : Short.reverseBytes(s8);
        }
        return (short) ((Y.getByte(bArr, i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (Y.getByte(bArr, i) << 8));
    }

    public static short getShortLE(byte[] bArr, int i) {
        if (UNALIGNED) {
            short s8 = Y.getShort(bArr, i);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? Short.reverseBytes(s8) : s8;
        }
        return (short) ((Y.getByte(bArr, i + 1) << 8) | (Y.getByte(bArr, i) & Pdu.MANUFACTURER_DATA_PDU_TYPE));
    }

    public static void setInt(byte[] bArr, int i, int i8) {
        if (UNALIGNED) {
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                i8 = Integer.reverseBytes(i8);
            }
            Y.putInt(bArr, i, i8);
            return;
        }
        Y.putByte(bArr, i, (byte) (i8 >>> 24));
        Y.putByte(bArr, i + 1, (byte) (i8 >>> 16));
        Y.putByte(bArr, i + 2, (byte) (i8 >>> 8));
        Y.putByte(bArr, i + 3, (byte) i8);
    }

    public static void setShort(byte[] bArr, int i, int i8) {
        if (UNALIGNED) {
            short s8 = (short) i8;
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                s8 = Short.reverseBytes(s8);
            }
            Y.putShort(bArr, i, s8);
            return;
        }
        Y.putByte(bArr, i, (byte) (i8 >>> 8));
        Y.putByte(bArr, i + 1, (byte) i8);
    }

    public static int getInt(byte[] bArr, int i) {
        if (UNALIGNED) {
            int i8 = Y.getInt(bArr, i);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? i8 : Integer.reverseBytes(i8);
        }
        return (Y.getByte(bArr, i + 3) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (Y.getByte(bArr, i) << 24) | ((Y.getByte(bArr, i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((Y.getByte(bArr, i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public static int getIntLE(byte[] bArr, int i) {
        if (UNALIGNED) {
            int i8 = Y.getInt(bArr, i);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? Integer.reverseBytes(i8) : i8;
        }
        return (Y.getByte(bArr, i + 3) << 24) | (Y.getByte(bArr, i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((Y.getByte(bArr, i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((Y.getByte(bArr, i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
    }

    public static int getUnsignedMedium(byte[] bArr, int i) {
        int i8;
        byte b8;
        short s8;
        if (UNALIGNED) {
            i8 = (Y.getByte(bArr, i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16;
            if (Y.BIG_ENDIAN_NATIVE_ORDER) {
                s8 = Y.getShort(bArr, i + 1);
            } else {
                s8 = Short.reverseBytes(Y.getShort(bArr, i + 1));
            }
            b8 = s8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        } else {
            i8 = ((Y.getByte(bArr, i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((Y.getByte(bArr, i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
            b8 = Y.getByte(bArr, i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        }
        return b8 | i8;
    }

    public static void setMedium(byte[] bArr, int i, int i8) {
        Y.putByte(bArr, i, (byte) (i8 >>> 16));
        if (UNALIGNED) {
            int i9 = i + 1;
            short s8 = (short) i8;
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                s8 = Short.reverseBytes(s8);
            }
            Y.putShort(bArr, i9, s8);
            return;
        }
        Y.putByte(bArr, i + 1, (byte) (i8 >>> 8));
        Y.putByte(bArr, i + 2, (byte) i8);
    }

    public static void setLong(byte[] bArr, int i, long j7) {
        if (UNALIGNED) {
            if (!Y.BIG_ENDIAN_NATIVE_ORDER) {
                j7 = Long.reverseBytes(j7);
            }
            Y.putLong(bArr, i, j7);
            return;
        }
        Y.putByte(bArr, i, (byte) ((int) (j7 >>> 56)));
        Y.putByte(bArr, i + 1, (byte) ((int) (j7 >>> 48)));
        Y.putByte(bArr, i + 2, (byte) ((int) (j7 >>> 40)));
        Y.putByte(bArr, i + 3, (byte) ((int) (j7 >>> 32)));
        Y.putByte(bArr, i + 4, (byte) ((int) (j7 >>> 24)));
        Y.putByte(bArr, i + 5, (byte) ((int) (j7 >>> 16)));
        Y.putByte(bArr, i + 6, (byte) ((int) (j7 >>> 8)));
        Y.putByte(bArr, i + 7, (byte) ((int) j7));
    }

    public static long getLong(byte[] bArr, int i) {
        if (UNALIGNED) {
            long j7 = Y.getLong(bArr, i);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? j7 : Long.reverseBytes(j7);
        }
        return (((long) Y.getByte(bArr, i + 7)) & 255) | (((long) Y.getByte(bArr, i)) << 56) | ((((long) Y.getByte(bArr, i + 1)) & 255) << 48) | ((((long) Y.getByte(bArr, i + 2)) & 255) << 40) | ((((long) Y.getByte(bArr, i + 3)) & 255) << 32) | ((((long) Y.getByte(bArr, i + 4)) & 255) << 24) | ((((long) Y.getByte(bArr, i + 5)) & 255) << 16) | ((((long) Y.getByte(bArr, i + 6)) & 255) << 8);
    }

    public static long getLongLE(byte[] bArr, int i) {
        if (UNALIGNED) {
            long j7 = Y.getLong(bArr, i);
            return Y.BIG_ENDIAN_NATIVE_ORDER ? Long.reverseBytes(j7) : j7;
        }
        return (((long) Y.getByte(bArr, i + 7)) << 56) | (((long) Y.getByte(bArr, i)) & 255) | ((((long) Y.getByte(bArr, i + 1)) & 255) << 8) | ((((long) Y.getByte(bArr, i + 2)) & 255) << 16) | ((((long) Y.getByte(bArr, i + 3)) & 255) << 24) | ((((long) Y.getByte(bArr, i + 4)) & 255) << 32) | ((((long) Y.getByte(bArr, i + 5)) & 255) << 40) | ((255 & ((long) Y.getByte(bArr, i + 6))) << 48);
    }

    public static void getBytes(C0159a aVar, long j7, int i, byte[] bArr, int i8, int i9) {
        aVar.checkIndex(i, i9);
        B.checkNotNull(bArr, "dst");
        if (C0984q.isOutOfBounds(i8, i9, bArr.length)) {
            throw new IndexOutOfBoundsException(g.m(i8, "dstIndex: "));
        } else if (i9 != 0) {
            Y.copyMemory(j7, bArr, i8, (long) i9);
        }
    }

    public static void setBytes(C0159a aVar, long j7, int i, byte[] bArr, int i8, int i9) {
        aVar.checkIndex(i, i9);
        B.checkNotNull(bArr, "src");
        if (C0984q.isOutOfBounds(i8, i9, bArr.length)) {
            throw new IndexOutOfBoundsException(g.m(i8, "srcIndex: "));
        } else if (i9 != 0) {
            Y.copyMemory(bArr, i8, j7, (long) i9);
        }
    }

    public static void getBytes(C0159a aVar, long j7, int i, ByteBuffer byteBuffer) {
        aVar.checkIndex(i, byteBuffer.remaining());
        if (byteBuffer.remaining() != 0) {
            if (byteBuffer.isDirect()) {
                if (!byteBuffer.isReadOnly()) {
                    Y.copyMemory(j7, Y.directBufferAddress(byteBuffer) + ((long) byteBuffer.position()), (long) byteBuffer.remaining());
                    byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                    return;
                }
                throw new ReadOnlyBufferException();
            } else if (byteBuffer.hasArray()) {
                long j8 = j7;
                Y.copyMemory(j8, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), (long) byteBuffer.remaining());
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
            } else {
                byteBuffer.put(aVar.nioBuffer());
            }
        }
    }

    public static void setBytes(C0159a aVar, long j7, int i, ByteBuffer byteBuffer) {
        C0159a aVar2 = aVar;
        int i8 = i;
        ByteBuffer byteBuffer2 = byteBuffer;
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            if (byteBuffer.isDirect()) {
                aVar.checkIndex(i, remaining);
                Y.copyMemory(Y.directBufferAddress(byteBuffer) + ((long) byteBuffer.position()), j7, (long) remaining);
                byteBuffer2.position(byteBuffer.position() + remaining);
            } else if (byteBuffer.hasArray()) {
                aVar.checkIndex(i, remaining);
                long j8 = j7;
                Y.copyMemory(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), j8, (long) remaining);
                byteBuffer2.position(byteBuffer.position() + remaining);
            } else if (remaining < 8) {
                setSingleBytes(aVar, j7, i, byteBuffer, remaining);
            } else {
                aVar.internalNioBuffer(i, remaining).put(byteBuffer2);
            }
        }
    }
}
