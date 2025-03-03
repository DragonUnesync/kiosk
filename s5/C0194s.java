package S5;

import g6.B;
import g6.n0;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: S5.s  reason: case insensitive filesystem */
public abstract class C0194s {
    private static final char[] BYTE2CHAR = new char[256];
    private static final String[] BYTE2HEX = new String[256];
    private static final String[] BYTEPADDING = new String[16];
    private static final String[] HEXDUMP_ROWPREFIXES = new String[4096];
    private static final char[] HEXDUMP_TABLE = new char[1024];
    private static final String[] HEXPADDING = new String[16];

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        int i = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            char[] cArr = HEXDUMP_TABLE;
            int i9 = i8 << 1;
            cArr[i9] = charArray[(i8 >>> 4) & 15];
            cArr[i9 + 1] = charArray[i8 & 15];
        }
        int i10 = 0;
        while (true) {
            String[] strArr = HEXPADDING;
            if (i10 >= strArr.length) {
                break;
            }
            int length = strArr.length - i10;
            StringBuilder sb = new StringBuilder(length * 3);
            for (int i11 = 0; i11 < length; i11++) {
                sb.append("   ");
            }
            HEXPADDING[i10] = sb.toString();
            i10++;
        }
        int i12 = 0;
        while (true) {
            String[] strArr2 = HEXDUMP_ROWPREFIXES;
            if (i12 >= strArr2.length) {
                break;
            }
            StringBuilder sb2 = new StringBuilder(12);
            sb2.append(n0.NEWLINE);
            sb2.append(Long.toHexString((((long) (i12 << 4)) & 4294967295L) | 4294967296L));
            sb2.setCharAt(sb2.length() - 9, '|');
            sb2.append('|');
            strArr2[i12] = sb2.toString();
            i12++;
        }
        int i13 = 0;
        while (true) {
            String[] strArr3 = BYTE2HEX;
            if (i13 >= strArr3.length) {
                break;
            }
            strArr3[i13] = " " + n0.byteToHexStringPadded(i13);
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr4 = BYTEPADDING;
            if (i14 >= strArr4.length) {
                break;
            }
            int length2 = strArr4.length - i14;
            StringBuilder sb3 = new StringBuilder(length2);
            for (int i15 = 0; i15 < length2; i15++) {
                sb3.append(' ');
            }
            BYTEPADDING[i14] = sb3.toString();
            i14++;
        }
        while (true) {
            char[] cArr2 = BYTE2CHAR;
            if (i < cArr2.length) {
                if (i <= 31 || i >= 127) {
                    cArr2[i] = '.';
                } else {
                    cArr2[i] = (char) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static String hexDump(C0185n nVar, int i, int i8) {
        B.checkPositiveOrZero(i8, "length");
        if (i8 == 0) {
            return "";
        }
        int i9 = i + i8;
        char[] cArr = new char[(i8 << 1)];
        int i10 = 0;
        while (i < i9) {
            System.arraycopy(HEXDUMP_TABLE, nVar.getUnsignedByte(i) << 1, cArr, i10, 2);
            i++;
            i10 += 2;
        }
        return new String(cArr);
    }

    /* access modifiers changed from: private */
    public static String hexDump(byte[] bArr, int i, int i8) {
        B.checkPositiveOrZero(i8, "length");
        if (i8 == 0) {
            return "";
        }
        int i9 = i + i8;
        char[] cArr = new char[(i8 << 1)];
        int i10 = 0;
        while (i < i9) {
            System.arraycopy(HEXDUMP_TABLE, (bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 1, cArr, i10, 2);
            i++;
            i10 += 2;
        }
        return new String(cArr);
    }
}
