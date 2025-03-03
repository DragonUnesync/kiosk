package org.altbeacon.beacon;

import Q0.g;
import android.annotation.TargetApi;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.regex.Pattern;
import org.altbeacon.bluetooth.Pdu;

public class Identifier implements Comparable<Identifier>, Serializable {
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("^0|[1-9][0-9]*$");
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final Pattern HEX_PATTERN = Pattern.compile("^0x[0-9A-Fa-f]*$");
    private static final Pattern HEX_PATTERN_NO_PREFIX = Pattern.compile("^[0-9A-Fa-f]*$");
    private static final int MAX_INTEGER = 65535;
    private static final Pattern UUID_PATTERN = Pattern.compile("^[0-9A-Fa-f]{8}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{12}$");
    private final byte[] mValue;

    @Deprecated
    public Identifier(Identifier identifier) {
        if (identifier != null) {
            this.mValue = identifier.mValue;
            return;
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"identifier\" is null.");
    }

    @TargetApi(9)
    public static Identifier fromBytes(byte[] bArr, int i, int i8, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"bytes\" is null.");
        } else if (i < 0 || i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("start < 0 || start > bytes.length");
        } else if (i8 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("end > bytes.length");
        } else if (i <= i8) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i8);
            if (z) {
                reverseArray(copyOfRange);
            }
            return new Identifier(copyOfRange);
        } else {
            throw new IllegalArgumentException("start > end");
        }
    }

    public static Identifier fromInt(int i) {
        if (i < 0 || i > MAX_INTEGER) {
            throw new IllegalArgumentException("Identifiers can only be constructed from integers between 0 and 65535 (inclusive).");
        }
        return new Identifier(new byte[]{(byte) (i >> 8), (byte) i});
    }

    public static Identifier fromLong(long j7, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            for (int i8 = i - 1; i8 >= 0; i8--) {
                bArr[i8] = (byte) ((int) (255 & j7));
                j7 >>= 8;
            }
            return new Identifier(bArr);
        }
        throw new IllegalArgumentException("Identifier length must be > 0.");
    }

    public static Identifier fromUuid(UUID uuid) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        return new Identifier(allocate.array());
    }

    public static Identifier parse(String str) {
        return parse(str, -1);
    }

    private static Identifier parseHex(String str, int i) {
        String str2;
        if (str.length() % 2 == 0) {
            str2 = "";
        } else {
            str2 = "0";
        }
        StringBuilder r8 = g.r(str2);
        r8.append(str.toUpperCase());
        String sb = r8.toString();
        if (i > 0 && i < sb.length() / 2) {
            sb = sb.substring(sb.length() - (i * 2));
        }
        if (i > 0 && i > sb.length() / 2) {
            int length = (i * 2) - sb.length();
            StringBuilder sb2 = new StringBuilder();
            while (sb2.length() < length) {
                sb2.append("0");
            }
            sb = sb2.toString() + sb;
        }
        int length2 = sb.length() / 2;
        byte[] bArr = new byte[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) (Integer.parseInt(sb.substring(i9, i9 + 2), 16) & 255);
        }
        return new Identifier(bArr);
    }

    private static void reverseArray(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - i) - 1;
            byte b8 = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b8;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Identifier)) {
            return false;
        }
        return Arrays.equals(this.mValue, ((Identifier) obj).mValue);
    }

    public int getByteCount() {
        return this.mValue.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mValue);
    }

    public byte[] toByteArray() {
        return (byte[]) this.mValue.clone();
    }

    @TargetApi(9)
    public byte[] toByteArrayOfSpecifiedEndianness(boolean z) {
        byte[] bArr = this.mValue;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (!z) {
            reverseArray(copyOf);
        }
        return copyOf;
    }

    public String toHexString() {
        char[] cArr = new char[((r0 * 2) + 2)];
        cArr[0] = '0';
        cArr[1] = 'x';
        int i = 2;
        for (byte b8 : this.mValue) {
            int i8 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b8 & 240) >>> 4];
            i += 2;
            cArr[i8] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public int toInt() {
        if (this.mValue.length <= 2) {
            int i = 0;
            int i8 = 0;
            while (true) {
                byte[] bArr = this.mValue;
                if (i >= bArr.length) {
                    return i8;
                }
                i8 |= (bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << (((bArr.length - i) - 1) * 8);
                i++;
            }
        } else {
            throw new UnsupportedOperationException("Only supported for Identifiers with max byte length of 2");
        }
    }

    public String toString() {
        byte[] bArr = this.mValue;
        if (bArr.length == 2) {
            return Integer.toString(toInt());
        }
        if (bArr.length == 16) {
            return toUuid().toString();
        }
        return toHexString();
    }

    public UUID toUuid() {
        byte[] bArr = this.mValue;
        if (bArr.length == 16) {
            LongBuffer asLongBuffer = ByteBuffer.wrap(bArr).asLongBuffer();
            return new UUID(asLongBuffer.get(), asLongBuffer.get());
        }
        throw new UnsupportedOperationException("Only Identifiers backed by a byte array with length of exactly 16 can be UUIDs.");
    }

    @Deprecated
    public String toUuidString() {
        return toUuid().toString();
    }

    public static Identifier parse(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"stringValue\" is null.");
        } else if (HEX_PATTERN.matcher(str).matches()) {
            return parseHex(str.substring(2), i);
        } else {
            if (UUID_PATTERN.matcher(str).matches()) {
                return parseHex(str.replace("-", ""), i);
            }
            if (DECIMAL_PATTERN.matcher(str).matches()) {
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    if (i <= 0 || i == 2) {
                        return fromInt(intValue);
                    }
                    return fromLong((long) intValue, i);
                } catch (Throwable th) {
                    throw new IllegalArgumentException("Unable to parse Identifier in decimal format.", th);
                }
            } else if (HEX_PATTERN_NO_PREFIX.matcher(str).matches()) {
                return parseHex(str, i);
            } else {
                throw new IllegalArgumentException("Unable to parse Identifier.");
            }
        }
    }

    public int compareTo(Identifier identifier) {
        byte[] bArr = this.mValue;
        int length = bArr.length;
        byte[] bArr2 = identifier.mValue;
        if (length == bArr2.length) {
            int i = 0;
            while (true) {
                byte[] bArr3 = this.mValue;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b8 = bArr3[i];
                byte b9 = identifier.mValue[i];
                if (b8 == b9) {
                    i++;
                } else if (b8 < b9) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else if (bArr.length < bArr2.length) {
            return -1;
        } else {
            return 1;
        }
    }

    public Identifier(byte[] bArr) {
        if (bArr != null) {
            this.mValue = bArr;
            return;
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"value\" is null.");
    }
}
