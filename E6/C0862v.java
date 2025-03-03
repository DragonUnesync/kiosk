package e6;

import g6.Y;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.AccessController;
import java.util.Collection;

/* renamed from: e6.v  reason: case insensitive filesystem */
public abstract class C0862v {
    private static final boolean IPV4_PREFERRED;
    private static final boolean IPV6_ADDRESSES_PREFERRED;
    public static final InetAddress LOCALHOST;
    public static final Inet4Address LOCALHOST4;
    public static final Inet6Address LOCALHOST6;
    public static final NetworkInterface LOOPBACK_IF;
    public static final Collection<NetworkInterface> NETWORK_INTERFACES;
    public static final int SOMAXCONN = ((Integer) AccessController.doPrivileged(new C0861u())).intValue();
    /* access modifiers changed from: private */
    public static final C1082c logger;

    static {
        boolean z = p0.getBoolean("java.net.preferIPv4Stack", false);
        IPV4_PREFERRED = z;
        C1082c instance = d.getInstance((Class<?>) C0862v.class);
        logger = instance;
        String str = p0.get("java.net.preferIPv6Addresses", "false");
        if ("true".equalsIgnoreCase(str.trim())) {
            IPV6_ADDRESSES_PREFERRED = true;
        } else {
            IPV6_ADDRESSES_PREFERRED = false;
        }
        instance.debug("-Djava.net.preferIPv4Stack: {}", (Object) Boolean.valueOf(z));
        instance.debug("-Djava.net.preferIPv6Addresses: {}", (Object) str);
        Collection<NetworkInterface> networkInterfaces = C0864x.networkInterfaces();
        NETWORK_INTERFACES = networkInterfaces;
        Inet4Address createLocalhost4 = C0864x.createLocalhost4();
        LOCALHOST4 = createLocalhost4;
        Inet6Address createLocalhost6 = C0864x.createLocalhost6();
        LOCALHOST6 = createLocalhost6;
        C0863w determineLoopback = C0864x.determineLoopback(networkInterfaces, createLocalhost4, createLocalhost6);
        LOOPBACK_IF = determineLoopback.iface();
        LOCALHOST = determineLoopback.address();
    }

    public static byte[] createByteArrayFromIpAddressString(String str) {
        if (isValidIpV4Address(str)) {
            return validIpV4ToBytes(str);
        }
        if (!isValidIpV6Address(str)) {
            return null;
        }
        if (str.charAt(0) == '[') {
            str = str.substring(1, str.length() - 1);
        }
        int indexOf = str.indexOf(37);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return getIPv6ByName(str, true);
    }

    private static int decimalDigit(String str, int i) {
        return str.charAt(i) - '0';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0188, code lost:
        if (r7 <= 2) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d4, code lost:
        if (r0.charAt(r12) != ':') goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0203, code lost:
        if (r0.charAt(r3 - 2) == ':') goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015b, code lost:
        if ((r6 - r9) <= 3) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0176, code lost:
        if (r0.charAt(0) == ':') goto L_0x017c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getIPv6ByName(java.lang.CharSequence r17, boolean r18) {
        /*
            r0 = r17
            r1 = 16
            byte[] r2 = new byte[r1]
            int r3 = r17.length()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0012:
            r16 = 0
            r15 = 58
            r4 = 4
            r5 = 2
            if (r6 >= r3) goto L_0x014f
            char r1 = r0.charAt(r6)
            r14 = 46
            if (r1 == r14) goto L_0x00ab
            if (r1 == r15) goto L_0x0049
            boolean r14 = isValidHexChar(r1)
            if (r14 == 0) goto L_0x0048
            if (r8 <= 0) goto L_0x0033
            boolean r14 = isValidNumericChar(r1)
            if (r14 != 0) goto L_0x0033
            goto L_0x0048
        L_0x0033:
            if (r9 >= 0) goto L_0x0037
            r9 = r6
            goto L_0x003c
        L_0x0037:
            int r14 = r6 - r9
            if (r14 <= r4) goto L_0x003c
            return r16
        L_0x003c:
            int r1 = g6.n0.decodeHexNibble((char) r1)
            int r4 = r6 - r9
            int r4 = r4 << r5
            int r1 = r1 << r4
            int r13 = r13 + r1
            r1 = 1
            goto L_0x0149
        L_0x0048:
            return r16
        L_0x0049:
            int r1 = r10 + 1
            int r9 = r6 - r9
            if (r9 > r4) goto L_0x00aa
            if (r8 > 0) goto L_0x00aa
            r14 = 8
            if (r1 > r14) goto L_0x00aa
            int r14 = r11 + 1
            r15 = 16
            if (r14 < r15) goto L_0x005c
            goto L_0x00aa
        L_0x005c:
            int r9 = 4 - r9
            int r5 = r9 << 2
            int r5 = r13 << r5
            if (r12 <= 0) goto L_0x0066
            int r12 = r12 + -2
        L_0x0066:
            r9 = r5 & 15
            int r9 = r9 << r4
            int r13 = r5 >> 4
            r13 = r13 & 15
            r9 = r9 | r13
            byte r9 = (byte) r9
            r2[r11] = r9
            int r11 = r11 + 2
            int r9 = r5 >> 8
            r9 = r9 & 15
            int r4 = r9 << 4
            r9 = 12
            int r5 = r5 >> r9
            r5 = r5 & 15
            r4 = r4 | r5
            byte r4 = (byte) r4
            r2[r14] = r4
            int r4 = r6 + 1
            if (r4 >= r3) goto L_0x00a4
            char r5 = r0.charAt(r4)
            r9 = 58
            if (r5 != r9) goto L_0x00a4
            int r6 = r6 + 2
            if (r7 != 0) goto L_0x00a3
            if (r6 >= r3) goto L_0x009b
            char r1 = r0.charAt(r6)
            if (r1 != r9) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            int r10 = r10 + 2
            int r1 = 14 - r11
            r12 = r1
            r6 = r4
            r7 = r11
            goto L_0x00a5
        L_0x00a3:
            return r16
        L_0x00a4:
            r10 = r1
        L_0x00a5:
            r1 = 1
            r9 = -1
            r13 = 0
            goto L_0x0149
        L_0x00aa:
            return r16
        L_0x00ab:
            int r8 = r8 + 1
            int r1 = r6 - r9
            r4 = 3
            if (r1 > r4) goto L_0x014e
            if (r9 < 0) goto L_0x014e
            if (r8 > r4) goto L_0x014e
            if (r10 <= 0) goto L_0x00be
            int r4 = r11 + r12
            r9 = 12
            if (r4 < r9) goto L_0x014e
        L_0x00be:
            int r4 = r6 + 1
            if (r4 >= r3) goto L_0x014e
            r4 = 16
            if (r11 >= r4) goto L_0x014e
            r4 = 1
            if (r8 != r4) goto L_0x0124
            if (r18 == 0) goto L_0x014e
            if (r11 == 0) goto L_0x00d3
            boolean r4 = isValidIPv4Mapped(r2, r11, r7, r12)
            if (r4 == 0) goto L_0x014e
        L_0x00d3:
            r4 = 3
            if (r1 != r4) goto L_0x00fa
            int r4 = r6 + -1
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L_0x014e
            int r4 = r6 + -2
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L_0x014e
            int r4 = r6 + -3
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L_0x014e
        L_0x00fa:
            if (r1 != r5) goto L_0x0114
            int r4 = r6 + -1
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L_0x014e
            int r4 = r6 + -2
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 == 0) goto L_0x014e
        L_0x0114:
            r4 = 1
            if (r1 != r4) goto L_0x0124
            int r4 = r6 + -1
            char r4 = r0.charAt(r4)
            boolean r4 = isValidNumericChar(r4)
            if (r4 != 0) goto L_0x0124
            goto L_0x014e
        L_0x0124:
            int r1 = 3 - r1
            int r1 = r1 << r5
            int r1 = r13 << r1
            r4 = r1 & 15
            int r4 = r4 * 100
            int r5 = r1 >> 4
            r5 = r5 & 15
            r9 = 10
            int r5 = r5 * 10
            int r5 = r5 + r4
            r4 = 8
            int r1 = r1 >> r4
            r1 = r1 & 15
            int r5 = r5 + r1
            r1 = 255(0xff, float:3.57E-43)
            if (r5 <= r1) goto L_0x0141
            return r16
        L_0x0141:
            int r1 = r11 + 1
            byte r4 = (byte) r5
            r2[r11] = r4
            r11 = r1
            goto L_0x00a5
        L_0x0149:
            int r6 = r6 + r1
            r1 = 16
            goto L_0x0012
        L_0x014e:
            return r16
        L_0x014f:
            r1 = 1
            if (r7 <= 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r1 = 0
        L_0x0154:
            if (r8 <= 0) goto L_0x01b5
            if (r9 <= 0) goto L_0x015e
            int r3 = r6 - r9
            r4 = 3
            if (r3 > r4) goto L_0x01b4
            goto L_0x015f
        L_0x015e:
            r4 = 3
        L_0x015f:
            if (r8 != r4) goto L_0x01b4
            r3 = 16
            if (r11 < r3) goto L_0x0166
            goto L_0x01b4
        L_0x0166:
            if (r10 == 0) goto L_0x018b
            if (r10 < r5) goto L_0x018a
            if (r1 != 0) goto L_0x0179
            r3 = 6
            if (r10 != r3) goto L_0x0179
            r3 = 0
            char r4 = r0.charAt(r3)
            r12 = 58
            if (r4 != r12) goto L_0x018b
            goto L_0x017c
        L_0x0179:
            r3 = 0
            r12 = 58
        L_0x017c:
            if (r1 == 0) goto L_0x018a
            r1 = 8
            if (r10 >= r1) goto L_0x018a
            char r0 = r0.charAt(r3)
            if (r0 != r12) goto L_0x018b
            if (r7 <= r5) goto L_0x018b
        L_0x018a:
            return r16
        L_0x018b:
            int r6 = r6 - r9
            r0 = 3
            int r4 = 3 - r6
            int r0 = r4 << 2
            int r0 = r13 << r0
            r1 = r0 & 15
            int r1 = r1 * 100
            int r3 = r0 >> 4
            r3 = r3 & 15
            r4 = 10
            int r3 = r3 * 10
            int r3 = r3 + r1
            r1 = 8
            int r0 = r0 >> r1
            r0 = r0 & 15
            int r3 = r3 + r0
            r0 = 255(0xff, float:3.57E-43)
            if (r3 <= r0) goto L_0x01ab
            return r16
        L_0x01ab:
            int r0 = r11 + 1
            byte r1 = (byte) r3
            r2[r11] = r1
        L_0x01b0:
            r1 = 16
            goto L_0x023f
        L_0x01b4:
            return r16
        L_0x01b5:
            int r12 = r3 + -1
            if (r9 <= 0) goto L_0x01bd
            int r14 = r6 - r9
            if (r14 > r4) goto L_0x0257
        L_0x01bd:
            if (r10 < r5) goto L_0x0257
            if (r1 != 0) goto L_0x01d7
            int r14 = r10 + 1
            r15 = 8
            if (r14 != r15) goto L_0x0257
            r14 = 0
            char r4 = r0.charAt(r14)
            r14 = 58
            if (r4 == r14) goto L_0x0257
            char r4 = r0.charAt(r12)
            if (r4 == r14) goto L_0x0257
            goto L_0x01db
        L_0x01d7:
            r14 = 58
            r15 = 8
        L_0x01db:
            if (r1 == 0) goto L_0x01f4
            if (r10 > r15) goto L_0x0257
            if (r10 != r15) goto L_0x01f4
            if (r7 > r5) goto L_0x01ea
            r1 = 0
            char r4 = r0.charAt(r1)
            if (r4 != r14) goto L_0x0257
        L_0x01ea:
            r1 = 14
            if (r7 < r1) goto L_0x01f4
            char r1 = r0.charAt(r12)
            if (r1 != r14) goto L_0x0257
        L_0x01f4:
            int r1 = r11 + 1
            r4 = 16
            if (r1 >= r4) goto L_0x0257
            if (r9 >= 0) goto L_0x0206
            int r3 = r3 - r5
            char r3 = r0.charAt(r3)
            r4 = 58
            if (r3 != r4) goto L_0x0257
            goto L_0x0208
        L_0x0206:
            r4 = 58
        L_0x0208:
            if (r7 <= r5) goto L_0x0212
            r3 = 0
            char r0 = r0.charAt(r3)
            if (r0 != r4) goto L_0x0212
            goto L_0x0257
        L_0x0212:
            if (r9 < 0) goto L_0x021e
            int r6 = r6 - r9
            r0 = 4
            if (r6 > r0) goto L_0x021f
            int r4 = 4 - r6
            int r3 = r4 << 2
            int r13 = r13 << r3
            goto L_0x021f
        L_0x021e:
            r0 = 4
        L_0x021f:
            r3 = r13 & 15
            int r3 = r3 << r0
            int r4 = r13 >> 4
            r4 = r4 & 15
            r3 = r3 | r4
            byte r3 = (byte) r3
            r2[r11] = r3
            int r3 = r11 + 2
            int r4 = r13 >> 8
            r4 = r4 & 15
            int r0 = r4 << 4
            r4 = 12
            int r4 = r13 >> 12
            r4 = r4 & 15
            r0 = r0 | r4
            byte r0 = (byte) r0
            r2[r1] = r0
            r0 = r3
            goto L_0x01b0
        L_0x023f:
            if (r0 >= r1) goto L_0x024b
            int r0 = r0 - r7
            int r1 = 16 - r0
            java.lang.System.arraycopy(r2, r7, r2, r1, r0)
            r0 = 0
            java.util.Arrays.fill(r2, r7, r1, r0)
        L_0x024b:
            if (r8 <= 0) goto L_0x0256
            r0 = 11
            r1 = -1
            r2[r0] = r1
            r0 = 10
            r2[r0] = r1
        L_0x0256:
            return r2
        L_0x0257:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.C0862v.getIPv6ByName(java.lang.CharSequence, boolean):byte[]");
    }

    private static byte ipv4WordToByte(String str, int i, int i8) {
        int decimalDigit = decimalDigit(str, i);
        int i9 = i + 1;
        if (i9 == i8) {
            return (byte) decimalDigit;
        }
        int decimalDigit2 = (decimalDigit * 10) + decimalDigit(str, i9);
        int i10 = i + 2;
        if (i10 == i8) {
            return (byte) decimalDigit2;
        }
        return (byte) ((decimalDigit2 * 10) + decimalDigit(str, i10));
    }

    private static boolean isValidHexChar(char c8) {
        if ((c8 < '0' || c8 > '9') && ((c8 < 'A' || c8 > 'F') && (c8 < 'a' || c8 > 'f'))) {
            return false;
        }
        return true;
    }

    private static boolean isValidIPv4Mapped(byte[] bArr, int i, int i8, int i9) {
        boolean z;
        if (i9 + i8 >= 14) {
            z = true;
        } else {
            z = false;
        }
        if (i > 12 || i < 2) {
            return false;
        }
        if ((!z || i8 < 12) && isValidIPv4MappedSeparators(bArr[i - 1], bArr[i - 2], z) && Y.isZero(bArr, 0, i - 3)) {
            return true;
        }
        return false;
    }

    private static boolean isValidIPv4MappedChar(char c8) {
        if (c8 == 'f' || c8 == 'F') {
            return true;
        }
        return false;
    }

    private static boolean isValidIPv4MappedSeparators(byte b8, byte b9, boolean z) {
        if (b8 != b9 || (b8 != 0 && (z || b9 != -1))) {
            return false;
        }
        return true;
    }

    public static boolean isValidIpV4Address(String str) {
        return isValidIpV4Address(str, 0, str.length());
    }

    private static boolean isValidIpV4Address0(CharSequence charSequence, int i, int i8) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int i9 = i8 - i;
        if (i9 > 15 || i9 < 7 || (indexOf = C0847f.indexOf(charSequence, '.', i + 1)) <= 0 || !isValidIpV4Word(charSequence, i, indexOf) || (indexOf2 = C0847f.indexOf(charSequence, '.', indexOf + 2)) <= 0 || !isValidIpV4Word(charSequence, indexOf + 1, indexOf2) || (indexOf3 = C0847f.indexOf(charSequence, '.', indexOf2 + 2)) <= 0 || !isValidIpV4Word(charSequence, indexOf2 + 1, indexOf3) || !isValidIpV4Word(charSequence, indexOf3 + 1, i8)) {
            return false;
        }
        return true;
    }

    private static boolean isValidIpV4Word(CharSequence charSequence, int i, int i8) {
        char charAt;
        char charAt2;
        int i9 = i8 - i;
        if (i9 < 1 || i9 > 3 || (charAt = charSequence.charAt(i)) < '0') {
            return false;
        }
        if (i9 == 3) {
            char charAt3 = charSequence.charAt(i + 1);
            if (charAt3 < '0' || (charAt2 = charSequence.charAt(i + 2)) < '0') {
                return false;
            }
            if (charAt > '1' || charAt3 > '9' || charAt2 > '9') {
                if (charAt != '2' || charAt3 > '5') {
                    return false;
                }
                if (charAt2 <= '5' || (charAt3 < '5' && charAt2 <= '9')) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (charAt > '9') {
            return false;
        } else {
            if (i9 == 1 || isValidNumericChar(charSequence.charAt(i + 1))) {
                return true;
            }
            return false;
        }
    }

    public static boolean isValidIpV6Address(String str) {
        return isValidIpV6Address((CharSequence) str);
    }

    private static boolean isValidNumericChar(char c8) {
        if (c8 < '0' || c8 > '9') {
            return false;
        }
        return true;
    }

    private static StringBuilder newSocketAddressStringBuilder(String str, String str2, boolean z) {
        int length = str.length();
        if (z) {
            StringBuilder sb = new StringBuilder(str2.length() + length + 1);
            sb.append(str);
            return sb;
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 3);
        if (length > 1 && str.charAt(0) == '[' && str.charAt(length - 1) == ']') {
            sb2.append(str);
            return sb2;
        }
        sb2.append('[');
        sb2.append(str);
        sb2.append(']');
        return sb2;
    }

    /* access modifiers changed from: private */
    public static Integer sysctlGetInt(String str) {
        BufferedReader bufferedReader;
        Process start = new ProcessBuilder(new String[]{"sysctl", str}).start();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null && readLine.startsWith(str)) {
                int length = readLine.length();
                while (true) {
                    length--;
                    if (length > str.length()) {
                        if (!Character.isDigit(readLine.charAt(length))) {
                            Integer valueOf = Integer.valueOf(readLine.substring(length + 1));
                            bufferedReader.close();
                            start.destroy();
                            return valueOf;
                        }
                    }
                }
            }
            bufferedReader.close();
            start.destroy();
            return null;
        } catch (Throwable th) {
            start.destroy();
            throw th;
        }
    }

    public static String toSocketAddressString(String str, int i) {
        String valueOf = String.valueOf(i);
        StringBuilder newSocketAddressStringBuilder = newSocketAddressStringBuilder(str, valueOf, !isValidIpV6Address(str));
        newSocketAddressStringBuilder.append(':');
        newSocketAddressStringBuilder.append(valueOf);
        return newSocketAddressStringBuilder.toString();
    }

    public static byte[] validIpV4ToBytes(String str) {
        int indexOf = str.indexOf(46, 1);
        byte ipv4WordToByte = ipv4WordToByte(str, 0, indexOf);
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(46, indexOf + 2);
        byte ipv4WordToByte2 = ipv4WordToByte(str, i, indexOf2);
        int indexOf3 = str.indexOf(46, indexOf2 + 2);
        return new byte[]{ipv4WordToByte, ipv4WordToByte2, ipv4WordToByte(str, indexOf2 + 1, indexOf3), ipv4WordToByte(str, indexOf3 + 1, str.length())};
    }

    private static boolean isValidIpV4Address(CharSequence charSequence, int i, int i8) {
        if (charSequence instanceof String) {
            return isValidIpV4Address((String) charSequence, i, i8);
        }
        if (charSequence instanceof C0847f) {
            return isValidIpV4Address((C0847f) charSequence, i, i8);
        }
        return isValidIpV4Address0(charSequence, i, i8);
    }

    public static boolean isValidIpV6Address(CharSequence charSequence) {
        int i;
        int i8;
        int length = charSequence.length();
        int i9 = 2;
        if (length < 2) {
            return false;
        }
        char charAt = charSequence.charAt(0);
        if (charAt == '[') {
            length--;
            if (charSequence.charAt(length) != ']') {
                return false;
            }
            charAt = charSequence.charAt(1);
            i = 1;
        } else {
            i = 0;
        }
        if (charAt != ':') {
            i9 = 0;
            i8 = -1;
        } else if (charSequence.charAt(i + 1) != ':') {
            return false;
        } else {
            int i10 = i;
            i += 2;
            i8 = i10;
        }
        int i11 = i;
        int i12 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt2 = charSequence.charAt(i11);
            if (!isValidHexChar(charAt2)) {
                if (charAt2 == '%') {
                    length = i11;
                    break;
                } else if (charAt2 != '.') {
                    if (charAt2 != ':' || i9 > 7) {
                        return false;
                    }
                    int i13 = i11 - 1;
                    if (charSequence.charAt(i13) != ':') {
                        i12 = 0;
                    } else if (i8 >= 0) {
                        return false;
                    } else {
                        i8 = i13;
                    }
                    i9++;
                } else if ((i8 < 0 && i9 != 6) || ((i9 == 7 && i8 >= i) || i9 > 7)) {
                    return false;
                } else {
                    int i14 = i11 - i12;
                    int i15 = i14 - 2;
                    if (isValidIPv4MappedChar(charSequence.charAt(i15))) {
                        if (!isValidIPv4MappedChar(charSequence.charAt(i14 - 3)) || !isValidIPv4MappedChar(charSequence.charAt(i14 - 4)) || !isValidIPv4MappedChar(charSequence.charAt(i14 - 5))) {
                            return false;
                        }
                        i15 = i14 - 7;
                    }
                    while (i15 >= i) {
                        char charAt3 = charSequence.charAt(i15);
                        if (charAt3 != '0' && charAt3 != ':') {
                            return false;
                        }
                        i15--;
                    }
                    int indexOf = C0847f.indexOf(charSequence, '%', i14 + 7);
                    if (indexOf >= 0) {
                        length = indexOf;
                    }
                    return isValidIpV4Address(charSequence, i14, length);
                }
            } else if (i12 >= 4) {
                return false;
            } else {
                i12++;
            }
            i11++;
        }
        if (i8 >= 0) {
            if (i8 + 2 != length) {
                if (i12 <= 0) {
                    return false;
                }
                if (i9 < 8 || i8 <= i) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (i9 != 7 || i12 <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isValidIpV4Address(String str, int i, int i8) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int i9 = i8 - i;
        if (i9 > 15 || i9 < 7 || (indexOf = str.indexOf(46, i + 1)) <= 0 || !isValidIpV4Word(str, i, indexOf) || (indexOf2 = str.indexOf(46, indexOf + 2)) <= 0 || !isValidIpV4Word(str, indexOf + 1, indexOf2) || (indexOf3 = str.indexOf(46, indexOf2 + 2)) <= 0 || !isValidIpV4Word(str, indexOf2 + 1, indexOf3) || !isValidIpV4Word(str, indexOf3 + 1, i8)) {
            return false;
        }
        return true;
    }

    private static boolean isValidIpV4Address(C0847f fVar, int i, int i8) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        int i9 = i8 - i;
        if (i9 > 15 || i9 < 7 || (indexOf = fVar.indexOf('.', i + 1)) <= 0 || !isValidIpV4Word(fVar, i, indexOf) || (indexOf2 = fVar.indexOf('.', indexOf + 2)) <= 0 || !isValidIpV4Word(fVar, indexOf + 1, indexOf2) || (indexOf3 = fVar.indexOf('.', indexOf2 + 2)) <= 0 || !isValidIpV4Word(fVar, indexOf2 + 1, indexOf3) || !isValidIpV4Word(fVar, indexOf3 + 1, i8)) {
            return false;
        }
        return true;
    }
}
