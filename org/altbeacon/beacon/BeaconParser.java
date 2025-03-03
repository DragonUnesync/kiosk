package org.altbeacon.beacon;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public class BeaconParser implements Serializable {
    public static final String ALTBEACON_LAYOUT = "m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25";
    private static final Pattern D_PATTERN = Pattern.compile("d\\:(\\d+)\\-(\\d+)([bl]*)?");
    public static final String EDDYSTONE_TLM_LAYOUT = "x,s:0-1=feaa,m:2-2=20,d:3-3,d:4-5,d:6-7,d:8-11,d:12-15";
    public static final String EDDYSTONE_UID_LAYOUT = "s:0-1=feaa,m:2-2=00,p:3-3:-41,i:4-13,i:14-19";
    public static final String EDDYSTONE_URL_LAYOUT = "s:0-1=feaa,m:2-2=10,p:3-3:-41,i:4-21v";
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final Pattern I_PATTERN = Pattern.compile("i\\:(\\d+)\\-(\\d+)([blv]*)?");
    private static final String LITTLE_ENDIAN_SUFFIX = "l";
    private static final Pattern M_PATTERN = Pattern.compile("m\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");
    private static final Pattern P_PATTERN = Pattern.compile("p\\:(\\d+)?\\-(\\d+)?\\:?([\\-\\d]+)?");
    private static final Pattern S_PATTERN = Pattern.compile("s\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f\\-]+)");
    private static final String TAG = "BeaconParser";
    public static final String URI_BEACON_LAYOUT = "s:0-1=fed8,m:2-2=00,p:3-3:-41,i:4-21v";
    private static final String VARIABLE_LENGTH_SUFFIX = "v";
    private static final Pattern X_PATTERN = Pattern.compile("x");
    protected List<BeaconParser> extraParsers = new ArrayList();
    protected Boolean mAllowPduOverflow = Boolean.TRUE;
    protected String mBeaconLayout;
    protected Integer mDBmCorrection;
    protected final List<Integer> mDataEndOffsets = new ArrayList();
    protected final List<Boolean> mDataLittleEndianFlags = new ArrayList();
    protected final List<Integer> mDataStartOffsets = new ArrayList();
    protected Boolean mExtraFrame;
    protected int[] mHardwareAssistManufacturers = {76};
    protected String mIdentifier;
    protected final List<Integer> mIdentifierEndOffsets = new ArrayList();
    protected final List<Boolean> mIdentifierLittleEndianFlags = new ArrayList();
    protected final List<Integer> mIdentifierStartOffsets = new ArrayList();
    protected final List<Boolean> mIdentifierVariableLengthFlags = new ArrayList();
    protected Integer mLayoutSize;
    private Long mMatchingBeaconTypeCode;
    protected Integer mMatchingBeaconTypeCodeEndOffset;
    protected Integer mMatchingBeaconTypeCodeStartOffset;
    protected Integer mPowerEndOffset;
    protected Integer mPowerStartOffset;
    protected Long mServiceUuid;
    protected byte[] mServiceUuid128Bit = new byte[0];
    protected Integer mServiceUuidEndOffset;
    protected Integer mServiceUuidStartOffset;

    public static class BeaconLayoutException extends RuntimeException {
        public BeaconLayoutException(String str) {
            super(str);
        }
    }

    public BeaconParser() {
    }

    private String byteArrayToFormattedString(byte[] bArr, int i, int i8, boolean z) {
        int i9 = i8 - i;
        int i10 = i9 + 1;
        byte[] bArr2 = new byte[i10];
        if (z) {
            for (int i11 = 0; i11 <= i9; i11++) {
                bArr2[i11] = bArr[((i + i10) - 1) - i11];
            }
        } else {
            for (int i12 = 0; i12 <= i9; i12++) {
                bArr2[i12] = bArr[i + i12];
            }
        }
        if (i10 < 5) {
            long j7 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                j7 += ((long) (bArr2[(i10 - i13) - 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE)) * ((long) Math.pow(256.0d, ((double) i13) * 1.0d));
            }
            return Long.toString(j7);
        }
        String bytesToHex = bytesToHex(bArr2);
        if (i10 != 16) {
            return C1477r.d("0x", bytesToHex);
        }
        return bytesToHex.substring(0, 8) + "-" + bytesToHex.substring(8, 12) + "-" + bytesToHex.substring(12, 16) + "-" + bytesToHex.substring(16, 20) + "-" + bytesToHex.substring(20, 32);
    }

    private String byteArrayToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private boolean byteArraysMatch(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2.length;
        if (bArr.length - i < length) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (bArr[i + i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b8 = bArr[i];
            byte b9 = b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            int i8 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i8] = cArr2[b9 >>> 4];
            cArr[i8 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    private int calculateLayoutSize() {
        List<Integer> list = this.mIdentifierEndOffsets;
        int i = 0;
        if (list != null) {
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                if (intValue2 > i) {
                    i = intValue2;
                }
            }
        }
        List<Integer> list2 = this.mDataEndOffsets;
        if (list2 != null) {
            for (Integer intValue3 : list2) {
                int intValue4 = intValue3.intValue();
                if (intValue4 > i) {
                    i = intValue4;
                }
            }
        }
        Integer num = this.mPowerEndOffset;
        if (num != null && num.intValue() > i) {
            i = this.mPowerEndOffset.intValue();
        }
        Integer num2 = this.mServiceUuidEndOffset;
        if (num2 != null && num2.intValue() > i) {
            i = this.mServiceUuidEndOffset.intValue();
        }
        return i + 1;
    }

    @TargetApi(9)
    private byte[] ensureMaxSize(byte[] bArr, int i) {
        if (bArr.length >= i) {
            return bArr;
        }
        return Arrays.copyOf(bArr, i);
    }

    public static byte[] longToByteArray(long j7, int i) {
        return longToByteArray(j7, i, true);
    }

    public boolean addExtraDataParser(BeaconParser beaconParser) {
        if (beaconParser == null || !beaconParser.mExtraFrame.booleanValue() || !this.extraParsers.add(beaconParser)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        String str;
        try {
            BeaconParser beaconParser = (BeaconParser) obj;
            String str2 = beaconParser.mBeaconLayout;
            if (str2 == null || !str2.equals(this.mBeaconLayout) || (str = beaconParser.mIdentifier) == null || !str.equals(this.mIdentifier)) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Deprecated
    public Beacon fromScanData(byte[] bArr, int i, BluetoothDevice bluetoothDevice) {
        return fromScanData(bArr, i, bluetoothDevice, System.currentTimeMillis(), new Beacon());
    }

    @TargetApi(9)
    public byte[] getBeaconAdvertisementData(Beacon beacon) {
        int i;
        int i8;
        if (beacon.getIdentifiers().size() == getIdentifierCount()) {
            Integer num = this.mMatchingBeaconTypeCodeEndOffset;
            if (num == null || num.intValue() <= -1) {
                i = -1;
            } else {
                i = this.mMatchingBeaconTypeCodeEndOffset.intValue();
            }
            Integer num2 = this.mPowerEndOffset;
            if (num2 != null && num2.intValue() > i) {
                i = this.mPowerEndOffset.intValue();
            }
            for (int i9 = 0; i9 < this.mIdentifierEndOffsets.size(); i9++) {
                if (this.mIdentifierEndOffsets.get(i9) != null && this.mIdentifierEndOffsets.get(i9).intValue() > i) {
                    i = this.mIdentifierEndOffsets.get(i9).intValue();
                }
            }
            for (int i10 = 0; i10 < this.mDataEndOffsets.size(); i10++) {
                if (this.mDataEndOffsets.get(i10) != null && this.mDataEndOffsets.get(i10).intValue() > i) {
                    i = this.mDataEndOffsets.get(i10).intValue();
                }
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.mIdentifierStartOffsets.size(); i12++) {
                if (this.mIdentifierVariableLengthFlags.get(i12).booleanValue()) {
                    i11 = (beacon.getIdentifier(i12).getByteCount() + i11) - ((this.mIdentifierEndOffsets.get(i12).intValue() - this.mIdentifierStartOffsets.get(i12).intValue()) + 1);
                }
            }
            byte[] bArr = new byte[((i + i11) - 1)];
            if (this.mMatchingBeaconTypeCodeEndOffset != null) {
                getMatchingBeaconTypeCode().getClass();
                for (int intValue = this.mMatchingBeaconTypeCodeStartOffset.intValue(); intValue <= this.mMatchingBeaconTypeCodeEndOffset.intValue(); intValue++) {
                    bArr[intValue - 2] = (byte) ((int) ((getMatchingBeaconTypeCode().longValue() >> ((this.mMatchingBeaconTypeCodeEndOffset.intValue() - intValue) * 8)) & 255));
                }
            }
            for (int i13 = 0; i13 < this.mIdentifierStartOffsets.size(); i13++) {
                byte[] byteArrayOfSpecifiedEndianness = beacon.getIdentifier(i13).toByteArrayOfSpecifiedEndianness(!this.mIdentifierLittleEndianFlags.get(i13).booleanValue());
                if (byteArrayOfSpecifiedEndianness.length < getIdentifierByteCount(i13)) {
                    if (!this.mIdentifierVariableLengthFlags.get(i13).booleanValue()) {
                        if (this.mIdentifierLittleEndianFlags.get(i13).booleanValue()) {
                            byteArrayOfSpecifiedEndianness = Arrays.copyOf(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i13));
                        } else {
                            byte[] bArr2 = new byte[getIdentifierByteCount(i13)];
                            System.arraycopy(byteArrayOfSpecifiedEndianness, 0, bArr2, getIdentifierByteCount(i13) - byteArrayOfSpecifiedEndianness.length, byteArrayOfSpecifiedEndianness.length);
                            byteArrayOfSpecifiedEndianness = bArr2;
                        }
                    }
                    LogManager.d(TAG, "Expanded identifier because it is too short.  It is now: " + byteArrayToString(byteArrayOfSpecifiedEndianness), new Object[0]);
                } else if (byteArrayOfSpecifiedEndianness.length > getIdentifierByteCount(i13)) {
                    if (this.mIdentifierLittleEndianFlags.get(i13).booleanValue()) {
                        byteArrayOfSpecifiedEndianness = Arrays.copyOfRange(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i13) - byteArrayOfSpecifiedEndianness.length, getIdentifierByteCount(i13));
                    } else {
                        byteArrayOfSpecifiedEndianness = Arrays.copyOf(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i13));
                    }
                    LogManager.d(TAG, "Truncated identifier because it is too long.  It is now: " + byteArrayToString(byteArrayOfSpecifiedEndianness), new Object[0]);
                } else {
                    LogManager.d(TAG, "Identifier size is just right: " + byteArrayToString(byteArrayOfSpecifiedEndianness), new Object[0]);
                }
                for (int intValue2 = this.mIdentifierStartOffsets.get(i13).intValue(); intValue2 <= (this.mIdentifierStartOffsets.get(i13).intValue() + byteArrayOfSpecifiedEndianness.length) - 1; intValue2++) {
                    bArr[intValue2 - 2] = byteArrayOfSpecifiedEndianness[intValue2 - this.mIdentifierStartOffsets.get(i13).intValue()];
                }
            }
            Integer num3 = this.mPowerStartOffset;
            if (!(num3 == null || this.mPowerEndOffset == null || num3.intValue() < 2)) {
                for (int intValue3 = this.mPowerStartOffset.intValue(); intValue3 <= this.mPowerEndOffset.intValue(); intValue3++) {
                    bArr[intValue3 - 2] = (byte) ((beacon.getTxPower() >> ((intValue3 - this.mPowerStartOffset.intValue()) * 8)) & 255);
                }
            }
            for (int i14 = 0; i14 < this.mDataStartOffsets.size(); i14++) {
                long longValue = beacon.getDataFields().get(i14).longValue();
                int intValue4 = this.mDataEndOffsets.get(i14).intValue() - this.mDataStartOffsets.get(i14).intValue();
                for (int i15 = 0; i15 <= intValue4; i15++) {
                    if (!this.mDataLittleEndianFlags.get(i14).booleanValue()) {
                        i8 = intValue4 - i15;
                    } else {
                        i8 = i15;
                    }
                    bArr[(this.mDataStartOffsets.get(i14).intValue() - 2) + i8] = (byte) ((int) ((longValue >> (i15 * 8)) & 255));
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Beacon has " + beacon.getIdentifiers().size() + " identifiers but format requires " + getIdentifierCount());
    }

    public int getDataFieldCount() {
        return this.mDataStartOffsets.size();
    }

    public List<BeaconParser> getExtraDataParsers() {
        return new ArrayList(this.extraParsers);
    }

    public int[] getHardwareAssistManufacturers() {
        return this.mHardwareAssistManufacturers;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public int getIdentifierByteCount(int i) {
        return (this.mIdentifierEndOffsets.get(i).intValue() - this.mIdentifierStartOffsets.get(i).intValue()) + 1;
    }

    public int getIdentifierCount() {
        return this.mIdentifierStartOffsets.size();
    }

    public String getLayout() {
        return this.mBeaconLayout;
    }

    public int getMServiceUuidStartOffset() {
        return this.mServiceUuidStartOffset.intValue();
    }

    public Long getMatchingBeaconTypeCode() {
        Long l8 = this.mMatchingBeaconTypeCode;
        if (l8 == null) {
            return -1L;
        }
        return l8;
    }

    public int getMatchingBeaconTypeCodeEndOffset() {
        Integer num = this.mMatchingBeaconTypeCodeEndOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public int getMatchingBeaconTypeCodeStartOffset() {
        Integer num = this.mMatchingBeaconTypeCodeStartOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public int getPowerCorrection() {
        return this.mDBmCorrection.intValue();
    }

    public Long getServiceUuid() {
        return this.mServiceUuid;
    }

    public byte[] getServiceUuid128Bit() {
        return this.mServiceUuid128Bit;
    }

    public int getServiceUuidEndOffset() {
        return this.mServiceUuidEndOffset.intValue();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mMatchingBeaconTypeCode, this.mIdentifierStartOffsets, this.mIdentifierEndOffsets, this.mIdentifierLittleEndianFlags, this.mDataStartOffsets, this.mDataEndOffsets, this.mDataLittleEndianFlags, this.mIdentifierVariableLengthFlags, this.mMatchingBeaconTypeCodeStartOffset, this.mMatchingBeaconTypeCodeEndOffset, this.mServiceUuidStartOffset, this.mServiceUuidEndOffset, this.mServiceUuid, this.mServiceUuid128Bit, this.mExtraFrame, this.mPowerStartOffset, this.mPowerEndOffset, this.mDBmCorrection, this.mLayoutSize, this.mAllowPduOverflow, this.mIdentifier, this.mHardwareAssistManufacturers, this.extraParsers});
    }

    public void setAllowPduOverflow(Boolean bool) {
        this.mAllowPduOverflow = bool;
    }

    public BeaconParser setBeaconLayout(String str) {
        int i;
        int i8;
        String str2 = str;
        int i9 = 2;
        int i10 = 1;
        LogManager.d(TAG, C1477r.d("API setBeaconLayout ", str2), new Object[0]);
        this.mBeaconLayout = str2;
        Log.d(TAG, "Parsing beacon layout: " + str2);
        String[] split = str2.split(",");
        this.mExtraFrame = Boolean.FALSE;
        int length = split.length;
        int i11 = 0;
        while (i11 < length) {
            String str3 = split[i11];
            Matcher matcher = I_PATTERN.matcher(str3);
            boolean z = false;
            while (true) {
                i = 3;
                if (!matcher.find()) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(matcher.group(i10));
                    int parseInt2 = Integer.parseInt(matcher.group(i9));
                    this.mIdentifierLittleEndianFlags.add(Boolean.valueOf(matcher.group(3).contains(LITTLE_ENDIAN_SUFFIX)));
                    this.mIdentifierVariableLengthFlags.add(Boolean.valueOf(matcher.group(3).contains(VARIABLE_LENGTH_SUFFIX)));
                    this.mIdentifierStartOffsets.add(Integer.valueOf(parseInt));
                    this.mIdentifierEndOffsets.add(Integer.valueOf(parseInt2));
                    z = true;
                } catch (NumberFormatException unused) {
                    throw new BeaconLayoutException(C1477r.d("Cannot parse integer byte offset in term: ", str3));
                }
            }
            Matcher matcher2 = D_PATTERN.matcher(str3);
            while (matcher2.find()) {
                try {
                    int parseInt3 = Integer.parseInt(matcher2.group(i10));
                    int parseInt4 = Integer.parseInt(matcher2.group(i9));
                    this.mDataLittleEndianFlags.add(Boolean.valueOf(matcher2.group(3).contains(LITTLE_ENDIAN_SUFFIX)));
                    this.mDataStartOffsets.add(Integer.valueOf(parseInt3));
                    this.mDataEndOffsets.add(Integer.valueOf(parseInt4));
                    z = true;
                } catch (NumberFormatException unused2) {
                    throw new BeaconLayoutException(C1477r.d("Cannot parse integer byte offset in term: ", str3));
                }
            }
            Matcher matcher3 = P_PATTERN.matcher(str3);
            while (matcher3.find()) {
                try {
                    if (!(matcher3.group(i10) == null || matcher3.group(i9) == null)) {
                        int parseInt5 = Integer.parseInt(matcher3.group(i10));
                        int parseInt6 = Integer.parseInt(matcher3.group(i9));
                        this.mPowerStartOffset = Integer.valueOf(parseInt5);
                        this.mPowerEndOffset = Integer.valueOf(parseInt6);
                    }
                    if (matcher3.group(3) != null) {
                        i8 = Integer.parseInt(matcher3.group(3));
                    } else {
                        i8 = 0;
                    }
                    this.mDBmCorrection = Integer.valueOf(i8);
                    z = true;
                } catch (NumberFormatException unused3) {
                    throw new BeaconLayoutException("Cannot parse integer power byte offset (" + "none" + ") in term: " + str3);
                }
            }
            Matcher matcher4 = M_PATTERN.matcher(str3);
            while (matcher4.find()) {
                try {
                    int parseInt7 = Integer.parseInt(matcher4.group(i10));
                    int parseInt8 = Integer.parseInt(matcher4.group(i9));
                    this.mMatchingBeaconTypeCodeStartOffset = Integer.valueOf(parseInt7);
                    this.mMatchingBeaconTypeCodeEndOffset = Integer.valueOf(parseInt8);
                    String group = matcher4.group(3);
                    try {
                        this.mMatchingBeaconTypeCode = Long.decode("0x" + group);
                        z = true;
                    } catch (NumberFormatException unused4) {
                        throw new BeaconLayoutException("Cannot parse beacon type code: " + group + " in term: " + str3);
                    }
                } catch (NumberFormatException unused5) {
                    throw new BeaconLayoutException(C1477r.d("Cannot parse integer byte offset in term: ", str3));
                }
            }
            Matcher matcher5 = S_PATTERN.matcher(str3);
            while (matcher5.find()) {
                try {
                    int parseInt9 = Integer.parseInt(matcher5.group(i10));
                    int parseInt10 = Integer.parseInt(matcher5.group(i9));
                    this.mServiceUuidStartOffset = Integer.valueOf(parseInt9);
                    this.mServiceUuidEndOffset = Integer.valueOf(parseInt10);
                    String group2 = matcher5.group(i);
                    if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + i10 == i9) {
                        try {
                            this.mServiceUuid = Long.decode("0x" + group2);
                        } catch (NumberFormatException unused6) {
                            throw new BeaconLayoutException("Cannot parse serviceUuid: " + group2 + " in term: " + str3);
                        }
                    } else if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + i10 == 16) {
                        String replace = group2.replace("-", "");
                        if (replace.length() == 32) {
                            this.mServiceUuid128Bit = new byte[16];
                            int i12 = 0;
                            while (i12 < 16) {
                                int i13 = i12 * 2;
                                String substring = replace.substring(i13, i13 + 2);
                                try {
                                    this.mServiceUuid128Bit[15 - i12] = (byte) Integer.parseInt(substring, 16);
                                    i12++;
                                } catch (NumberFormatException unused7) {
                                    throw new BeaconLayoutException("Cannot parse serviceUuid byte " + substring + " in term: " + str3);
                                }
                            }
                        } else {
                            throw new BeaconLayoutException("128-bit ServiceUuid must be 16 bytes long: " + group2 + " in term: " + str3);
                        }
                    } else {
                        throw new BeaconLayoutException("Cannot parse serviceUuid -- it must be 2 bytes or 16 bytes long: " + group2 + " in term: " + str3);
                    }
                    i9 = 2;
                    i10 = 1;
                    z = true;
                    i = 3;
                } catch (NumberFormatException unused8) {
                    throw new BeaconLayoutException(C1477r.d("Cannot parse integer byte offset in term: ", str3));
                }
            }
            Matcher matcher6 = X_PATTERN.matcher(str3);
            while (matcher6.find()) {
                this.mExtraFrame = Boolean.TRUE;
                z = true;
            }
            if (z) {
                i11++;
                i9 = 2;
                i10 = 1;
            } else {
                LogManager.d(TAG, "cannot parse term %s", str3);
                throw new BeaconLayoutException(C1477r.d("Cannot parse beacon layout term: ", str3));
            }
        }
        this.mLayoutSize = Integer.valueOf(calculateLayoutSize());
        return this;
    }

    public void setHardwareAssistManufacturerCodes(int[] iArr) {
        this.mHardwareAssistManufacturers = iArr;
    }

    public BeaconParser setMatchingBeaconTypeCode(Long l8) {
        this.mMatchingBeaconTypeCode = l8;
        return this;
    }

    public static byte[] longToByteArray(long j7, int i, boolean z) {
        byte[] bArr = new byte[i];
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = ((i - (z ? i8 : (i - i8) - 1)) - 1) * 8;
            bArr[i8] = (byte) ((int) ((j7 & (255 << i9)) >> ((int) ((long) i9))));
        }
        return bArr;
    }

    public Beacon fromScanData(byte[] bArr, int i, BluetoothDevice bluetoothDevice, long j7) {
        return fromScanData(bArr, i, bluetoothDevice, j7, new Beacon());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
        if (byteArraysMatch(r10, r0.mMatchingBeaconTypeCodeStartOffset.intValue() + r9, r4) != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019b, code lost:
        if (byteArraysMatch(r10, r0.mMatchingBeaconTypeCodeStartOffset.intValue() + r9, r4) != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ac, code lost:
        if (r11.getType() == 33) goto L_0x01b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x047c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0483 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.altbeacon.beacon.Beacon fromScanData(byte[] r25, int r26, android.bluetooth.BluetoothDevice r27, long r28, org.altbeacon.beacon.Beacon r30) {
        /*
            r24 = this;
            r0 = r24
            r1 = r28
            r3 = r30
            org.altbeacon.bluetooth.BleAdvertisement r9 = new org.altbeacon.bluetooth.BleAdvertisement
            r10 = r25
            r9.<init>(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r9 = r9.getPdus()
            java.util.Iterator r9 = r9.iterator()
        L_0x0024:
            boolean r14 = r9.hasNext()
            r15 = 7
            r4 = -1
            r6 = 33
            r8 = 22
            java.lang.String r7 = "BeaconParser"
            if (r14 == 0) goto L_0x00b3
            java.lang.Object r14 = r9.next()
            org.altbeacon.bluetooth.Pdu r14 = (org.altbeacon.bluetooth.Pdu) r14
            byte r5 = r14.getType()
            if (r5 != r8) goto L_0x0042
            java.lang.Long r5 = r0.mServiceUuid
            if (r5 != 0) goto L_0x005e
        L_0x0042:
            byte r5 = r14.getType()
            if (r5 != r6) goto L_0x004d
            byte[] r5 = r0.mServiceUuid128Bit
            int r5 = r5.length
            if (r5 != 0) goto L_0x005e
        L_0x004d:
            byte r5 = r14.getType()
            if (r5 != r15) goto L_0x0058
            byte[] r5 = r0.mServiceUuid128Bit
            int r5 = r5.length
            if (r5 != 0) goto L_0x005e
        L_0x0058:
            byte r5 = r14.getType()
            if (r5 != r4) goto L_0x0098
        L_0x005e:
            r11.add(r14)
            boolean r4 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r4 == 0) goto L_0x0024
            byte r4 = r14.getType()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.String r5 = bytesToHex(r25)
            int r6 = r14.getStartIndex()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r8 = r14.getEndIndex()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r4
            r4 = 1
            r15[r4] = r5
            r5 = 2
            r15[r5] = r6
            r5 = 3
            r15[r5] = r8
            java.lang.String r5 = "Processing pdu type %02X: %s with startIndex: %d, endIndex: %d"
            org.altbeacon.beacon.logging.LogManager.d(r7, r5, r15)
            goto L_0x0024
        L_0x0098:
            r4 = 1
            boolean r5 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r5 == 0) goto L_0x0024
            byte r5 = r14.getType()
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r4 = 0
            r6[r4] = r5
            java.lang.String r4 = "Ignoring pdu type %02X"
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r6)
            goto L_0x0024
        L_0x00b3:
            int r5 = r11.size()
            if (r5 != 0) goto L_0x00cd
            boolean r5 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r5 == 0) goto L_0x00c8
            java.lang.String r5 = "No PDUs to process in this packet."
            r14 = 0
            java.lang.Object[] r6 = new java.lang.Object[r14]
            org.altbeacon.beacon.logging.LogManager.d(r7, r5, r6)
            goto L_0x00c9
        L_0x00c8:
            r14 = 0
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            r2 = 0
            goto L_0x0496
        L_0x00cd:
            r14 = 0
            java.util.Iterator r5 = r11.iterator()
            r11 = 0
            r19 = 0
            r20 = 0
        L_0x00d7:
            boolean r18 = r5.hasNext()
            if (r18 == 0) goto L_0x0491
            java.lang.Object r11 = r5.next()
            org.altbeacon.bluetooth.Pdu r11 = (org.altbeacon.bluetooth.Pdu) r11
            byte[] r4 = new byte[r14]
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r14 == 0) goto L_0x010c
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeStartOffset
            int r14 = r14.intValue()
            if (r14 < 0) goto L_0x010c
            java.lang.Long r4 = r24.getMatchingBeaconTypeCode()
            long r8 = r4.longValue()
            java.lang.Integer r4 = r0.mMatchingBeaconTypeCodeEndOffset
            int r4 = r4.intValue()
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeStartOffset
            int r14 = r14.intValue()
            int r4 = r4 - r14
            r14 = 1
            int r4 = r4 + r14
            byte[] r4 = longToByteArray(r8, r4)
        L_0x010c:
            byte[] r8 = r24.getServiceUuid128Bit()
            java.lang.Long r9 = r24.getServiceUuid()
            if (r9 == 0) goto L_0x0132
            java.lang.Long r8 = r24.getServiceUuid()
            long r8 = r8.longValue()
            java.lang.Integer r14 = r0.mServiceUuidEndOffset
            int r14 = r14.intValue()
            java.lang.Integer r15 = r0.mServiceUuidStartOffset
            int r15 = r15.intValue()
            int r14 = r14 - r15
            r15 = 1
            int r14 = r14 + r15
            r15 = 0
            byte[] r8 = longToByteArray(r8, r14, r15)
        L_0x0132:
            int r9 = r11.getStartIndex()
            int r14 = r8.length
            if (r14 != 0) goto L_0x0155
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r14 == 0) goto L_0x0150
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeStartOffset
            int r14 = r14.intValue()
            int r14 = r14 + r9
            boolean r14 = r0.byteArraysMatch(r10, r14, r4)
            if (r14 == 0) goto L_0x0150
        L_0x014a:
            r6 = 1
            r14 = 33
            r15 = 22
            goto L_0x01b4
        L_0x0150:
            r14 = 33
            r15 = 22
            goto L_0x01b3
        L_0x0155:
            byte r14 = r11.getType()
            r15 = 16
            if (r14 != r6) goto L_0x0162
            int r14 = r8.length
            if (r14 != r15) goto L_0x0162
            r14 = 1
            goto L_0x0163
        L_0x0162:
            r14 = 0
        L_0x0163:
            byte r6 = r11.getType()
            r15 = 7
            if (r6 != r15) goto L_0x0170
            int r6 = r8.length
            r15 = 16
            if (r6 != r15) goto L_0x0170
            r14 = 1
        L_0x0170:
            byte r6 = r11.getType()
            r15 = 22
            if (r6 != r15) goto L_0x017d
            int r6 = r8.length
            r15 = 2
            if (r6 != r15) goto L_0x017d
            r14 = 1
        L_0x017d:
            if (r14 == 0) goto L_0x0150
            java.lang.Integer r6 = r0.mServiceUuidStartOffset
            int r6 = r6.intValue()
            int r6 = r6 + r9
            boolean r6 = r0.byteArraysMatch(r10, r6, r8)
            if (r6 == 0) goto L_0x0150
            java.lang.Integer r6 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r6 == 0) goto L_0x019e
            java.lang.Integer r6 = r0.mMatchingBeaconTypeCodeStartOffset
            int r6 = r6.intValue()
            int r6 = r6 + r9
            boolean r6 = r0.byteArraysMatch(r10, r6, r4)
            if (r6 == 0) goto L_0x0150
            goto L_0x014a
        L_0x019e:
            byte r6 = r11.getType()
            r15 = 22
            if (r6 == r15) goto L_0x01af
            byte r6 = r11.getType()
            r14 = 33
            if (r6 != r14) goto L_0x01b3
            goto L_0x01b1
        L_0x01af:
            r14 = 33
        L_0x01b1:
            r6 = 1
            goto L_0x01b4
        L_0x01b3:
            r6 = 0
        L_0x01b4:
            if (r6 != 0) goto L_0x0231
            java.lang.Long r21 = r24.getServiceUuid()
            if (r21 != 0) goto L_0x01e8
            byte[] r14 = r24.getServiceUuid128Bit()
            int r14 = r14.length
            if (r14 == 0) goto L_0x01c4
            goto L_0x01e8
        L_0x01c4:
            boolean r8 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r8 == 0) goto L_0x01e0
            java.lang.String r4 = r0.byteArrayToString(r4)
            java.lang.String r8 = bytesToHex(r10)
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r4
            r4 = 1
            r15[r4] = r8
            java.lang.String r4 = "This is not a matching Beacon advertisement. (Was expecting %s.  The bytes I see are: %s"
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r15)
        L_0x01e0:
            r23 = r5
            r15 = 2
            r16 = 3
            r17 = 4
            goto L_0x025a
        L_0x01e8:
            boolean r14 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r14 == 0) goto L_0x01e0
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeStartOffset
            if (r14 == 0) goto L_0x01f7
            int r14 = r14.intValue()
            goto L_0x01f8
        L_0x01f7:
            r14 = 0
        L_0x01f8:
            java.lang.String r8 = r0.byteArrayToString(r8)
            java.lang.Integer r15 = r0.mServiceUuidStartOffset
            int r15 = r15.intValue()
            int r15 = r15 + r9
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.String r4 = r0.byteArrayToString(r4)
            int r14 = r14 + r9
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r22 = bytesToHex(r10)
            r23 = r5
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r18 = 0
            r5[r18] = r8
            r8 = 1
            r5[r8] = r15
            r15 = 2
            r5[r15] = r4
            r16 = 3
            r5[r16] = r14
            r17 = 4
            r5[r17] = r22
            java.lang.String r4 = "This is not a matching Beacon advertisement. Was expecting %s at offset %d and %s at offset %d.  The bytes I see are: %s"
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r5)
            goto L_0x025a
        L_0x0231:
            r23 = r5
            r8 = 1
            r15 = 2
            r16 = 3
            r17 = 4
            boolean r5 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r5 == 0) goto L_0x025a
            java.lang.String r4 = r0.byteArrayToString(r4)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r14 = 0
            r5[r14] = r4
            java.lang.String r4 = "This is a recognized beacon advertisement -- %s seen"
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r5)
            java.lang.String r4 = bytesToHex(r10)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r14] = r4
            java.lang.String r4 = "Bytes are: %s"
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r5)
        L_0x025a:
            if (r6 == 0) goto L_0x0483
            int r4 = r10.length
            java.lang.Integer r5 = r0.mLayoutSize
            int r5 = r5.intValue()
            int r5 = r5 + r9
            if (r4 > r5) goto L_0x02a4
            java.lang.Boolean r4 = r0.mAllowPduOverflow
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x02a4
            boolean r4 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r4 == 0) goto L_0x0298
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Expanding buffer because it is too short to parse: "
            r4.<init>(r5)
            int r5 = r10.length
            r4.append(r5)
            java.lang.String r5 = ", needed: "
            r4.append(r5)
            java.lang.Integer r5 = r0.mLayoutSize
            int r5 = r5.intValue()
            int r5 = r5 + r9
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r6)
        L_0x0298:
            java.lang.Integer r4 = r0.mLayoutSize
            int r4 = r4.intValue()
            int r4 = r4 + r9
            byte[] r4 = r0.ensureMaxSize(r10, r4)
            r10 = r4
        L_0x02a4:
            r4 = r20
            r5 = 0
        L_0x02a7:
            java.util.List<java.lang.Integer> r6 = r0.mIdentifierEndOffsets
            int r6 = r6.size()
            java.lang.String r8 = " because PDU is too short.  endIndex: "
            java.lang.String r14 = " PDU endIndex: "
            if (r5 >= r6) goto L_0x037c
            java.util.List<java.lang.Integer> r6 = r0.mIdentifierEndOffsets
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r9
            int r15 = r11.getEndIndex()
            if (r6 <= r15) goto L_0x0328
            java.util.List<java.lang.Boolean> r15 = r0.mIdentifierVariableLengthFlags
            java.lang.Object r15 = r15.get(r5)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0328
            boolean r8 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r8 == 0) goto L_0x02f3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r14 = "Need to truncate identifier by "
            r8.<init>(r14)
            int r14 = r11.getEndIndex()
            int r6 = r6 - r14
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r8 = 0
            java.lang.Object[] r14 = new java.lang.Object[r8]
            org.altbeacon.beacon.logging.LogManager.d(r7, r6, r14)
        L_0x02f3:
            java.util.List<java.lang.Integer> r6 = r0.mIdentifierStartOffsets
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r9
            int r8 = r11.getEndIndex()
            r14 = 1
            int r8 = r8 + r14
            if (r8 > r6) goto L_0x0312
            java.lang.String r1 = "PDU is too short for identifer.  Packet is malformed"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r7, r1, r2)
            r1 = 0
            return r1
        L_0x0312:
            r15 = 33
            java.util.List<java.lang.Boolean> r14 = r0.mIdentifierLittleEndianFlags
            java.lang.Object r14 = r14.get(r5)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            org.altbeacon.beacon.Identifier r6 = org.altbeacon.beacon.Identifier.fromBytes(r10, r6, r8, r14)
            r12.add(r6)
            goto L_0x0354
        L_0x0328:
            int r15 = r11.getEndIndex()
            if (r6 <= r15) goto L_0x0356
            java.lang.Boolean r15 = r0.mAllowPduOverflow
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x0356
            boolean r4 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r4 == 0) goto L_0x0353
            java.lang.String r4 = "Cannot parse identifier "
            java.lang.StringBuilder r4 = u.C1477r.e(r4, r5, r8, r6, r14)
            int r6 = r11.getEndIndex()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]
            org.altbeacon.beacon.logging.LogManager.d(r7, r4, r8)
        L_0x0353:
            r4 = 1
        L_0x0354:
            r14 = 1
            goto L_0x0378
        L_0x0356:
            java.util.List<java.lang.Integer> r8 = r0.mIdentifierStartOffsets
            java.lang.Object r8 = r8.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 + r9
            r14 = 1
            int r6 = r6 + r14
            java.util.List<java.lang.Boolean> r15 = r0.mIdentifierLittleEndianFlags
            java.lang.Object r15 = r15.get(r5)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            org.altbeacon.beacon.Identifier r6 = org.altbeacon.beacon.Identifier.fromBytes(r10, r8, r6, r15)
            r12.add(r6)
        L_0x0378:
            int r5 = r5 + r14
            r15 = 2
            goto L_0x02a7
        L_0x037c:
            r5 = 0
        L_0x037d:
            java.util.List<java.lang.Integer> r6 = r0.mDataEndOffsets
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0401
            java.util.List<java.lang.Integer> r6 = r0.mDataEndOffsets
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r9
            int r15 = r11.getEndIndex()
            if (r6 <= r15) goto L_0x03d3
            java.lang.Boolean r15 = r0.mAllowPduOverflow
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x03d3
            boolean r15 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r15 == 0) goto L_0x03c5
            java.lang.String r15 = "Cannot parse data field "
            java.lang.StringBuilder r6 = u.C1477r.e(r15, r5, r8, r6, r14)
            int r15 = r11.getEndIndex()
            r6.append(r15)
            java.lang.String r15 = ".  Setting value to 0"
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r20 = r4
            r15 = 0
            java.lang.Object[] r4 = new java.lang.Object[r15]
            org.altbeacon.beacon.logging.LogManager.d(r7, r6, r4)
            goto L_0x03c7
        L_0x03c5:
            r20 = r4
        L_0x03c7:
            java.lang.Long r4 = new java.lang.Long
            r1 = 0
            r4.<init>(r1)
            r13.add(r4)
        L_0x03d1:
            r1 = 1
            goto L_0x03fa
        L_0x03d3:
            r20 = r4
            java.util.List<java.lang.Integer> r1 = r0.mDataStartOffsets
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 + r9
            java.util.List<java.lang.Boolean> r2 = r0.mDataLittleEndianFlags
            java.lang.Object r2 = r2.get(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r1 = r0.byteArrayToFormattedString(r10, r1, r6, r2)
            java.lang.Long r1 = java.lang.Long.decode(r1)
            r13.add(r1)
            goto L_0x03d1
        L_0x03fa:
            int r5 = r5 + r1
            r1 = r28
            r4 = r20
            goto L_0x037d
        L_0x0401:
            r20 = r4
            java.lang.Integer r1 = r0.mPowerStartOffset
            if (r1 == 0) goto L_0x046e
            java.lang.Integer r1 = r0.mPowerEndOffset
            int r1 = r1.intValue()
            int r1 = r1 + r9
            int r2 = r11.getEndIndex()     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            if (r1 <= r2) goto L_0x0449
            java.lang.Boolean r2 = r0.mAllowPduOverflow     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            boolean r2 = r2.booleanValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            if (r2 != 0) goto L_0x0449
            boolean r2 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            if (r2 == 0) goto L_0x0445
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            r2.<init>()     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            java.lang.String r4 = "Cannot parse power field because PDU is too short.  endIndex: "
            r2.append(r4)     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            r2.append(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            r2.append(r14)     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            int r1 = r11.getEndIndex()     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            r2.append(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            java.lang.String r1 = r2.toString()     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            org.altbeacon.beacon.logging.LogManager.d(r7, r1, r4)     // Catch:{ NullPointerException | NumberFormatException -> 0x0444 }
            goto L_0x0445
        L_0x0444:
        L_0x0445:
            r4 = 1
            goto L_0x047a
        L_0x0447:
            goto L_0x0478
        L_0x0449:
            java.lang.Integer r1 = r0.mPowerStartOffset     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r1 = r1.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r1 = r1 + r9
            java.lang.Integer r2 = r0.mPowerEndOffset     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r2 = r2.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r2 = r2 + r9
            r4 = 0
            java.lang.String r1 = r0.byteArrayToFormattedString(r10, r1, r2, r4)     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            java.lang.Integer r2 = r0.mDBmCorrection     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r2 = r2.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0447 }
            int r1 = r1 + r2
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 <= r2) goto L_0x0476
            int r1 = r1 + -256
            goto L_0x0476
        L_0x046e:
            java.lang.Integer r1 = r0.mDBmCorrection
            if (r1 == 0) goto L_0x0478
            int r1 = r1.intValue()
        L_0x0476:
            r19 = r1
        L_0x0478:
            r4 = r20
        L_0x047a:
            if (r4 != 0) goto L_0x0481
            r14 = r9
            r1 = r19
            r2 = 1
            goto L_0x0496
        L_0x0481:
            r20 = r4
        L_0x0483:
            r1 = r28
            r11 = r9
            r5 = r23
            r4 = -1
            r6 = 33
            r8 = 22
            r14 = 0
            r15 = 7
            goto L_0x00d7
        L_0x0491:
            r14 = r11
            r1 = r19
            goto L_0x00ca
        L_0x0496:
            if (r2 == 0) goto L_0x051f
            java.lang.Integer r2 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r2 == 0) goto L_0x04b5
            java.lang.Integer r2 = r0.mMatchingBeaconTypeCodeStartOffset
            int r2 = r2.intValue()
            int r2 = r2 + r14
            java.lang.Integer r4 = r0.mMatchingBeaconTypeCodeEndOffset
            int r4 = r4.intValue()
            int r4 = r4 + r14
            r5 = 0
            java.lang.String r2 = r0.byteArrayToFormattedString(r10, r2, r4, r5)
            int r2 = java.lang.Integer.parseInt(r2)
        L_0x04b3:
            r4 = 1
            goto L_0x04b7
        L_0x04b5:
            r2 = -1
            goto L_0x04b3
        L_0x04b7:
            int r8 = r14 + 1
            java.lang.String r5 = r0.byteArrayToFormattedString(r10, r14, r8, r4)
            int r5 = java.lang.Integer.parseInt(r5)
            if (r27 == 0) goto L_0x04d8
            java.lang.String r6 = r27.getAddress()
            java.lang.String r9 = r27.getName()     // Catch:{ SecurityException -> 0x04ce }
            r7 = r9
            r9 = 0
            goto L_0x04db
        L_0x04ce:
            java.lang.String r8 = "Cannot read device name without Manifest.permission.BLUETOOTH_CONNECT"
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            org.altbeacon.beacon.logging.LogManager.d(r7, r8, r11)
        L_0x04d6:
            r7 = 0
            goto L_0x04db
        L_0x04d8:
            r9 = 0
            r6 = 0
            goto L_0x04d6
        L_0x04db:
            r3.mIdentifiers = r12
            r3.mDataFields = r13
            r8 = r26
            r3.mRssi = r8
            r3.mBeaconTypeCode = r2
            java.lang.Long r2 = r0.mServiceUuid
            if (r2 == 0) goto L_0x04f1
            long r11 = r2.longValue()
            int r2 = (int) r11
            r3.mServiceUuid = r2
            goto L_0x04f4
        L_0x04f1:
            r2 = -1
            r3.mServiceUuid = r2
        L_0x04f4:
            r3.mBluetoothAddress = r6
            r3.mBluetoothName = r7
            r3.mManufacturer = r5
            java.lang.String r2 = r0.mIdentifier
            r3.mParserIdentifier = r2
            java.util.List<org.altbeacon.beacon.BeaconParser> r2 = r0.extraParsers
            int r2 = r2.size()
            if (r2 > 0) goto L_0x0511
            java.lang.Boolean r2 = r0.mExtraFrame
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x050f
            goto L_0x0511
        L_0x050f:
            r7 = 0
            goto L_0x0512
        L_0x0511:
            r7 = 1
        L_0x0512:
            r3.mMultiFrameBeacon = r7
            r4 = r28
            r3.mFirstCycleDetectionTimestamp = r4
            r3.mLastCycleDetectionTimestamp = r4
            r3.mLastPacketRawBytes = r10
            r3.mTxPower = r1
            return r3
        L_0x051f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconParser.fromScanData(byte[], int, android.bluetooth.BluetoothDevice, long, org.altbeacon.beacon.Beacon):org.altbeacon.beacon.Beacon");
    }

    public BeaconParser(String str) {
        this.mIdentifier = str;
    }
}
