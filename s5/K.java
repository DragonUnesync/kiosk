package S5;

import org.altbeacon.bluetooth.Pdu;

public abstract class K {
    public static byte getByte(byte[] bArr, int i) {
        return bArr[i];
    }

    public static int getInt(byte[] bArr, int i) {
        return (bArr[i + 3] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public static int getIntLE(byte[] bArr, int i) {
        return ((bArr[i + 3] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24) | (bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
    }

    public static long getLong(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static long getLongLE(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static short getShort(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | (bArr[i] << 8));
    }

    public static short getShortLE(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] << 8) | (bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE));
    }

    public static int getUnsignedMedium(byte[] bArr, int i) {
        return (bArr[i + 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((bArr[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public static void setByte(byte[] bArr, int i, int i8) {
        bArr[i] = (byte) i8;
    }

    public static void setInt(byte[] bArr, int i, int i8) {
        bArr[i] = (byte) (i8 >>> 24);
        bArr[i + 1] = (byte) (i8 >>> 16);
        bArr[i + 2] = (byte) (i8 >>> 8);
        bArr[i + 3] = (byte) i8;
    }

    public static void setLong(byte[] bArr, int i, long j7) {
        bArr[i] = (byte) ((int) (j7 >>> 56));
        bArr[i + 1] = (byte) ((int) (j7 >>> 48));
        bArr[i + 2] = (byte) ((int) (j7 >>> 40));
        bArr[i + 3] = (byte) ((int) (j7 >>> 32));
        bArr[i + 4] = (byte) ((int) (j7 >>> 24));
        bArr[i + 5] = (byte) ((int) (j7 >>> 16));
        bArr[i + 6] = (byte) ((int) (j7 >>> 8));
        bArr[i + 7] = (byte) ((int) j7);
    }

    public static void setMedium(byte[] bArr, int i, int i8) {
        bArr[i] = (byte) (i8 >>> 16);
        bArr[i + 1] = (byte) (i8 >>> 8);
        bArr[i + 2] = (byte) i8;
    }

    public static void setShort(byte[] bArr, int i, int i8) {
        bArr[i] = (byte) (i8 >>> 8);
        bArr[i + 1] = (byte) i8;
    }
}
