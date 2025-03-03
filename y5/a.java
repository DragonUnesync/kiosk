package Y5;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import g6.B;
import java.nio.ByteOrder;
import org.altbeacon.bluetooth.Pdu;

public abstract class a {
    private static byte[] alphabet(b bVar) {
        return ((b) B.checkNotNull(bVar, "dialect")).alphabet;
    }

    private static boolean breakLines(b bVar) {
        return ((b) B.checkNotNull(bVar, "dialect")).breakLinesByDefault;
    }

    public static C0185n encode(C0185n nVar) {
        return encode(nVar, b.STANDARD);
    }

    private static void encode3to4(C0185n nVar, int i, int i8, C0185n nVar2, int i9, byte[] bArr) {
        int i10 = 0;
        if (nVar.order() == ByteOrder.BIG_ENDIAN) {
            if (i8 == 1) {
                i10 = toInt(nVar.getByte(i));
            } else if (i8 == 2) {
                i10 = toIntBE(nVar.getShort(i));
            } else if (i8 > 0) {
                i10 = toIntBE(nVar.getMedium(i));
            }
            encode3to4BigEndian(i10, i8, nVar2, i9, bArr);
            return;
        }
        if (i8 == 1) {
            i10 = toInt(nVar.getByte(i));
        } else if (i8 == 2) {
            i10 = toIntLE(nVar.getShort(i));
        } else if (i8 > 0) {
            i10 = toIntLE(nVar.getMedium(i));
        }
        encode3to4LittleEndian(i10, i8, nVar2, i9, bArr);
    }

    private static void encode3to4BigEndian(int i, int i8, C0185n nVar, int i9, byte[] bArr) {
        if (i8 == 1) {
            nVar.setInt(i9, (bArr[(i >>> 12) & 63] << 16) | (bArr[i >>> 18] << 24) | 15677);
        } else if (i8 == 2) {
            nVar.setInt(i9, (bArr[(i >>> 6) & 63] << 8) | (bArr[i >>> 18] << 24) | (bArr[(i >>> 12) & 63] << 16) | 61);
        } else if (i8 == 3) {
            nVar.setInt(i9, bArr[i & 63] | (bArr[i >>> 18] << 24) | (bArr[(i >>> 12) & 63] << 16) | (bArr[(i >>> 6) & 63] << 8));
        }
    }

    private static void encode3to4LittleEndian(int i, int i8, C0185n nVar, int i9, byte[] bArr) {
        if (i8 == 1) {
            nVar.setInt(i9, (bArr[(i >>> 12) & 63] << 8) | bArr[i >>> 18] | 1027407872);
        } else if (i8 == 2) {
            nVar.setInt(i9, (bArr[(i >>> 6) & 63] << 16) | bArr[i >>> 18] | (bArr[(i >>> 12) & 63] << 8) | 1023410176);
        } else if (i8 == 3) {
            nVar.setInt(i9, (bArr[i & 63] << 24) | bArr[i >>> 18] | (bArr[(i >>> 12) & 63] << 8) | (bArr[(i >>> 6) & 63] << 16));
        }
    }

    public static int encodedBufferSize(int i, boolean z) {
        long j7 = (((long) i) << 2) / 3;
        long j8 = (3 + j7) & -4;
        if (z) {
            j8 += j7 / 76;
        }
        if (j8 < 2147483647L) {
            return (int) j8;
        }
        return Integer.MAX_VALUE;
    }

    private static int toInt(byte b8) {
        return (b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16;
    }

    private static int toIntBE(short s8) {
        return (s8 & 65535) << 8;
    }

    private static int toIntLE(short s8) {
        return (s8 & 65280) | ((s8 & 255) << 16);
    }

    public static C0185n encode(C0185n nVar, b bVar) {
        return encode(nVar, breakLines(bVar), bVar);
    }

    private static int toIntBE(int i) {
        return i & 16777215;
    }

    private static int toIntLE(int i) {
        return ((i & 16711680) >>> 16) | ((i & 255) << 16) | (65280 & i);
    }

    public static C0185n encode(C0185n nVar, boolean z, b bVar) {
        B.checkNotNull(nVar, "src");
        C0185n encode = encode(nVar, nVar.readerIndex(), nVar.readableBytes(), z, bVar);
        nVar.readerIndex(nVar.writerIndex());
        return encode;
    }

    public static C0185n encode(C0185n nVar, int i, int i8, boolean z, b bVar) {
        return encode(nVar, i, i8, z, bVar, nVar.alloc());
    }

    public static C0185n encode(C0185n nVar, int i, int i8, boolean z, b bVar, C0187o oVar) {
        int i9 = i8;
        B.checkNotNull(nVar, "src");
        B.checkNotNull(bVar, "dialect");
        C0185n order = ((C0163c) oVar).buffer(encodedBufferSize(i8, z)).order(nVar.order());
        byte[] alphabet = alphabet(bVar);
        int i10 = i9 - 2;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i10) {
            encode3to4(nVar, i11 + i, 3, order, i12, alphabet);
            i13 += 4;
            if (z && i13 == 76) {
                order.setByte(i12 + 4, 10);
                i12++;
                i13 = 0;
            }
            i11 += 3;
            i12 += 4;
        }
        if (i11 < i9) {
            encode3to4(nVar, i11 + i, i9 - i11, order, i12, alphabet);
            i12 += 4;
        }
        if (i12 > 1 && order.getByte(i12 - 1) == 10) {
            i12--;
        }
        return order.slice(0, i12);
    }
}
