package g6;

import e6.C0862v;
import h6.C1082c;
import h6.d;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: g6.p  reason: case insensitive filesystem */
public abstract class C0983p {
    private static final C1082c logger = d.getInstance((Class<?>) C0983p.class);

    public static byte[] bestAvailableMac() {
        int compareAddresses;
        byte[] bArr = C0978k.EMPTY_BYTES;
        InetAddress inetAddress = C0862v.LOCALHOST4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (NetworkInterface next : C0862v.NETWORK_INTERFACES) {
            Enumeration<InetAddress> addressesFromNetworkInterface = m0.addressesFromNetworkInterface(next);
            if (addressesFromNetworkInterface.hasMoreElements()) {
                InetAddress nextElement = addressesFromNetworkInterface.nextElement();
                if (!nextElement.isLoopbackAddress()) {
                    linkedHashMap.put(next, nextElement);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            NetworkInterface networkInterface = (NetworkInterface) entry.getKey();
            InetAddress inetAddress2 = (InetAddress) entry.getValue();
            if (!networkInterface.isVirtual()) {
                try {
                    byte[] hardwareAddressFromNetworkInterface = m0.hardwareAddressFromNetworkInterface(networkInterface);
                    int compareAddresses2 = compareAddresses(bArr, hardwareAddressFromNetworkInterface);
                    if (compareAddresses2 < 0 || (compareAddresses2 == 0 && ((compareAddresses = compareAddresses(inetAddress, inetAddress2)) < 0 || (compareAddresses == 0 && bArr.length < hardwareAddressFromNetworkInterface.length)))) {
                        inetAddress = inetAddress2;
                        bArr = hardwareAddressFromNetworkInterface;
                    }
                } catch (SocketException e) {
                    logger.debug("Failed to get the hardware address of a network interface: {}", networkInterface, e);
                }
            }
        }
        if (bArr == C0978k.EMPTY_BYTES) {
            return null;
        }
        if (bArr.length != 6) {
            return Arrays.copyOf(bArr, 8);
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 3);
        bArr2[3] = -1;
        bArr2[4] = -2;
        System.arraycopy(bArr, 3, bArr2, 5, 3);
        return bArr2;
    }

    public static int compareAddresses(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= 6) {
            int length = bArr2.length;
            int i = 0;
            while (i < length) {
                byte b8 = bArr2[i];
                if (b8 == 0 || b8 == 1) {
                    i++;
                } else {
                    byte b9 = bArr2[0];
                    if ((b9 & 1) != 0) {
                        return 1;
                    }
                    if ((b9 & 2) == 0) {
                        if (bArr.length == 0 || (bArr[0] & 2) != 0) {
                            return -1;
                        }
                        return 0;
                    } else if (bArr.length == 0 || (bArr[0] & 2) != 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        }
        return 1;
    }

    public static byte[] defaultMachineId() {
        byte[] bestAvailableMac = bestAvailableMac();
        if (bestAvailableMac != null) {
            return bestAvailableMac;
        }
        byte[] bArr = new byte[8];
        Y.threadLocalRandom().nextBytes(bArr);
        logger.warn("Failed to find a usable hardware address from the network interfaces; using random bytes: {}", (Object) formatAddress(bArr));
        return bArr;
    }

    public static String formatAddress(byte[] bArr) {
        StringBuilder sb = new StringBuilder(24);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x:", new Object[]{Integer.valueOf(bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE)}));
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static byte[] parseMAC(String str) {
        byte[] bArr;
        char c8;
        int length = str.length();
        if (length == 17) {
            c8 = str.charAt(2);
            validateMacSeparator(c8);
            bArr = new byte[6];
        } else if (length == 23) {
            c8 = str.charAt(2);
            validateMacSeparator(c8);
            bArr = new byte[8];
        } else {
            throw new IllegalArgumentException("value is not supported [MAC-48, EUI-48, EUI-64]");
        }
        int length2 = bArr.length - 1;
        int i = 0;
        int i8 = 0;
        while (i < length2) {
            int i9 = i8 + 2;
            bArr[i] = n0.decodeHexByte(str, i8);
            if (str.charAt(i9) == c8) {
                i++;
                i8 += 3;
            } else {
                throw new IllegalArgumentException("expected separator '" + c8 + " but got '" + str.charAt(i9) + "' at index: " + i9);
            }
        }
        bArr[length2] = n0.decodeHexByte(str, i8);
        return bArr;
    }

    private static int scoreAddress(InetAddress inetAddress) {
        if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
            return 0;
        }
        if (inetAddress.isMulticastAddress()) {
            return 1;
        }
        if (inetAddress.isLinkLocalAddress()) {
            return 2;
        }
        if (inetAddress.isSiteLocalAddress()) {
            return 3;
        }
        return 4;
    }

    private static void validateMacSeparator(char c8) {
        if (c8 != ':' && c8 != '-') {
            throw new IllegalArgumentException("unsupported separator: " + c8 + " (expected: [:-])");
        }
    }

    private static int compareAddresses(InetAddress inetAddress, InetAddress inetAddress2) {
        return scoreAddress(inetAddress) - scoreAddress(inetAddress2);
    }
}
