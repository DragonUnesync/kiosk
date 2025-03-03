package g6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u.C1477r;

public abstract class n0 {
    private static final String[] BYTE2HEX_NOPAD = new String[256];
    private static final String[] BYTE2HEX_PAD = new String[256];
    private static final byte[] HEX2B;
    public static final String NEWLINE = p0.get("line.separator", "\n");

    static {
        String str;
        int i = 0;
        while (true) {
            String[] strArr = BYTE2HEX_PAD;
            if (i < strArr.length) {
                String hexString = Integer.toHexString(i);
                if (i > 15) {
                    str = hexString;
                } else {
                    str = C1477r.d("0", hexString);
                }
                strArr[i] = str;
                BYTE2HEX_NOPAD[i] = hexString;
                i++;
            } else {
                byte[] bArr = new byte[65536];
                HEX2B = bArr;
                Arrays.fill(bArr, (byte) -1);
                bArr[48] = 0;
                bArr[49] = 1;
                bArr[50] = 2;
                bArr[51] = 3;
                bArr[52] = 4;
                bArr[53] = 5;
                bArr[54] = 6;
                bArr[55] = 7;
                bArr[56] = 8;
                bArr[57] = 9;
                bArr[65] = 10;
                bArr[66] = 11;
                bArr[67] = 12;
                bArr[68] = 13;
                bArr[69] = 14;
                bArr[70] = 15;
                bArr[97] = 10;
                bArr[98] = 11;
                bArr[99] = 12;
                bArr[100] = 13;
                bArr[101] = 14;
                bArr[102] = 15;
                return;
            }
        }
    }

    public static String byteToHexStringPadded(int i) {
        return BYTE2HEX_PAD[i & 255];
    }

    public static byte decodeHexByte(CharSequence charSequence, int i) {
        int decodeHexNibble = decodeHexNibble(charSequence.charAt(i));
        int decodeHexNibble2 = decodeHexNibble(charSequence.charAt(i + 1));
        if (decodeHexNibble != -1 && decodeHexNibble2 != -1) {
            return (byte) ((decodeHexNibble << 4) + decodeHexNibble2);
        }
        throw new IllegalArgumentException(String.format("invalid hex byte '%s' at index %d of '%s'", new Object[]{charSequence.subSequence(i, i + 2), Integer.valueOf(i), charSequence}));
    }

    public static int decodeHexNibble(char c8) {
        return HEX2B[c8];
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence escapeCsv(java.lang.CharSequence r7, boolean r8) {
        /*
            java.lang.String r0 = "value"
            java.lang.Object r0 = g6.B.checkNotNull(r7, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0019
            int r8 = indexOfFirstNonOwsChar(r7, r0)
            int r0 = indexOfLastNonOwsChar(r7, r8, r0)
            goto L_0x001b
        L_0x0019:
            int r0 = r0 - r2
            r8 = 0
        L_0x001b:
            if (r8 <= r0) goto L_0x0020
            java.lang.String r7 = ""
            return r7
        L_0x0020:
            char r3 = r7.charAt(r8)
            boolean r3 = isDoubleQuote(r3)
            r4 = -1
            if (r3 == 0) goto L_0x0047
            char r3 = r7.charAt(r0)
            boolean r3 = isDoubleQuote(r3)
            if (r3 == 0) goto L_0x0038
            if (r0 <= r8) goto L_0x0038
            r1 = 1
        L_0x0038:
            if (r1 == 0) goto L_0x0043
            int r8 = r8 + 1
            int r0 = r0 + -1
            r3 = r1
            r1 = r0
        L_0x0040:
            r0 = r8
            r8 = -1
            goto L_0x004a
        L_0x0043:
            r3 = r1
            r1 = r0
            r0 = r8
            goto L_0x004a
        L_0x0047:
            r1 = r0
            r3 = 0
            goto L_0x0040
        L_0x004a:
            if (r8 >= 0) goto L_0x00a9
            if (r3 == 0) goto L_0x006d
            r4 = r0
        L_0x004f:
            if (r4 > r1) goto L_0x009a
            char r5 = r7.charAt(r4)
            boolean r5 = isDoubleQuote(r5)
            if (r5 == 0) goto L_0x006b
            if (r4 == r1) goto L_0x0099
            int r5 = r4 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 != 0) goto L_0x006a
            goto L_0x0099
        L_0x006a:
            r4 = r5
        L_0x006b:
            int r4 = r4 + r2
            goto L_0x004f
        L_0x006d:
            r4 = r0
        L_0x006e:
            if (r4 > r1) goto L_0x009a
            char r5 = r7.charAt(r4)
            r6 = 10
            if (r5 == r6) goto L_0x0099
            r6 = 13
            if (r5 == r6) goto L_0x0099
            r6 = 44
            if (r5 != r6) goto L_0x0081
            goto L_0x0099
        L_0x0081:
            boolean r5 = isDoubleQuote(r5)
            if (r5 == 0) goto L_0x0097
            if (r4 == r1) goto L_0x0099
            int r5 = r4 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 != 0) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r4 = r5
        L_0x0097:
            int r4 = r4 + r2
            goto L_0x006e
        L_0x0099:
            r8 = r4
        L_0x009a:
            if (r8 >= 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a6
            int r0 = r0 - r2
            int r1 = r1 + 2
        L_0x00a1:
            java.lang.CharSequence r7 = r7.subSequence(r0, r1)
            goto L_0x00a8
        L_0x00a6:
            int r1 = r1 + r2
            goto L_0x00a1
        L_0x00a8:
            return r7
        L_0x00a9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r1 - r0
            int r4 = r4 + 8
            r3.<init>(r4)
            r4 = 34
            r3.append(r4)
            r3.append(r7, r0, r8)
        L_0x00ba:
            if (r8 > r1) goto L_0x00dd
            char r0 = r7.charAt(r8)
            boolean r5 = isDoubleQuote(r0)
            if (r5 == 0) goto L_0x00d8
            r3.append(r4)
            if (r8 >= r1) goto L_0x00d8
            int r5 = r8 + 1
            char r6 = r7.charAt(r5)
            boolean r6 = isDoubleQuote(r6)
            if (r6 == 0) goto L_0x00d8
            r8 = r5
        L_0x00d8:
            r3.append(r0)
            int r8 = r8 + r2
            goto L_0x00ba
        L_0x00dd:
            r3.append(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.n0.escapeCsv(java.lang.CharSequence, boolean):java.lang.CharSequence");
    }

    private static int indexOfFirstNonOwsChar(CharSequence charSequence, int i) {
        int i8 = 0;
        while (i8 < i && isOws(charSequence.charAt(i8))) {
            i8++;
        }
        return i8;
    }

    private static int indexOfLastNonOwsChar(CharSequence charSequence, int i, int i8) {
        int i9 = i8 - 1;
        while (i9 > i && isOws(charSequence.charAt(i9))) {
            i9--;
        }
        return i9;
    }

    private static boolean isDoubleQuote(char c8) {
        if (c8 == '\"') {
            return true;
        }
        return false;
    }

    private static boolean isOws(char c8) {
        if (c8 == ' ' || c8 == 9) {
            return true;
        }
        return false;
    }

    public static boolean isSurrogate(char c8) {
        if (c8 < 55296 || c8 > 57343) {
            return false;
        }
        return true;
    }

    private static IllegalArgumentException newInvalidEscapedCsvFieldException(CharSequence charSequence, int i) {
        return new IllegalArgumentException("invalid escaped CSV field: " + charSequence + " index: " + i);
    }

    public static String simpleClassName(Object obj) {
        if (obj == null) {
            return "null_object";
        }
        return simpleClassName(obj.getClass());
    }

    public static CharSequence trimOws(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return charSequence;
        }
        int indexOfFirstNonOwsChar = indexOfFirstNonOwsChar(charSequence, length);
        int indexOfLastNonOwsChar = indexOfLastNonOwsChar(charSequence, indexOfFirstNonOwsChar, length);
        if (indexOfFirstNonOwsChar == 0 && indexOfLastNonOwsChar == length - 1) {
            return charSequence;
        }
        return charSequence.subSequence(indexOfFirstNonOwsChar, indexOfLastNonOwsChar + 1);
    }

    public static List<CharSequence> unescapeCsvFields(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList(2);
        StringBuilder stringBuilder = C0980m.get().stringBuilder();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = charSequence.charAt(i);
            if (!z) {
                if (!(charAt == 10 || charAt == 13)) {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            stringBuilder.append(charAt);
                        } else {
                            arrayList.add(stringBuilder.toString());
                            stringBuilder.setLength(0);
                        }
                    } else if (stringBuilder.length() == 0) {
                        z = true;
                    }
                }
                throw newInvalidEscapedCsvFieldException(charSequence, i);
            } else if (charAt != '\"') {
                stringBuilder.append(charAt);
            } else if (i == length) {
                arrayList.add(stringBuilder.toString());
                return arrayList;
            } else {
                int i8 = i + 1;
                char charAt2 = charSequence.charAt(i8);
                if (charAt2 == '\"') {
                    stringBuilder.append('\"');
                    i = i8;
                } else if (charAt2 == ',') {
                    arrayList.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    i = i8;
                    z = false;
                } else {
                    throw newInvalidEscapedCsvFieldException(charSequence, i);
                }
            }
            i++;
        }
        if (!z) {
            arrayList.add(stringBuilder.toString());
            return arrayList;
        }
        throw newInvalidEscapedCsvFieldException(charSequence, length);
    }

    public static int decodeHexNibble(byte b8) {
        return HEX2B[b8];
    }

    public static String simpleClassName(Class<?> cls) {
        String name = ((Class) B.checkNotNull(cls, "clazz")).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf > -1 ? name.substring(lastIndexOf + 1) : name;
    }
}
