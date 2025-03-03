package org.altbeacon.beacon.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UrlBeaconUrlCompressor {
    private static final byte EDDYSTONE_URL_BIZ = 12;
    private static final byte EDDYSTONE_URL_BIZ_SLASH = 5;
    private static final byte EDDYSTONE_URL_COM = 7;
    private static final byte EDDYSTONE_URL_COM_SLASH = 0;
    private static final byte EDDYSTONE_URL_EDU = 9;
    private static final byte EDDYSTONE_URL_EDU_SLASH = 2;
    private static final int EDDYSTONE_URL_FQDN_GROUP = 3;
    private static final byte EDDYSTONE_URL_GOV = 13;
    private static final byte EDDYSTONE_URL_GOV_SLASH = 6;
    private static final byte EDDYSTONE_URL_INFO = 11;
    private static final byte EDDYSTONE_URL_INFO_SLASH = 4;
    private static final byte EDDYSTONE_URL_NET = 10;
    private static final byte EDDYSTONE_URL_NET_SLASH = 3;
    private static final byte EDDYSTONE_URL_ORG = 8;
    private static final byte EDDYSTONE_URL_ORG_SLASH = 1;
    private static final int EDDYSTONE_URL_PATH_GROUP = 5;
    private static final int EDDYSTONE_URL_PROTOCOL_GROUP = 1;
    private static final byte EDDYSTONE_URL_PROTOCOL_HTTP = 2;
    private static final byte EDDYSTONE_URL_PROTOCOL_HTTPS = 3;
    private static final byte EDDYSTONE_URL_PROTOCOL_HTTPS_WWW = 1;
    private static final byte EDDYSTONE_URL_PROTOCOL_HTTP_WWW = 0;
    private static final String EDDYSTONE_URL_REGEX = "^((?i)http|https):\\/\\/((?i)www\\.)?((?:[0-9a-zA-Z_-]+\\.?)+)(/?)([./0-9a-zA-Z_-]*)";
    private static final int EDDYSTONE_URL_SLASH_GROUP = 4;
    private static final int EDDYSTONE_URL_WWW_GROUP = 2;
    private static final byte TLD_NOT_ENCODABLE = -1;
    private static final String URL_HOST_WWW = "www.";
    private static final String URL_PROTOCOL_HTTP = "http";
    private static final String URL_PROTOCOL_HTTPS_COLON_SLASH_SLASH = "https://";
    private static final String URL_PROTOCOL_HTTPS_WWW_DOT = "https://www.";
    private static final String URL_PROTOCOL_HTTP_COLON_SLASH_SLASH = "http://";
    private static final String URL_PROTOCOL_HTTP_WWW_DOT = "http://www.";
    private static final String URL_TLD_DOT_BIZ = ".biz";
    private static final String URL_TLD_DOT_BIZ_SLASH = ".biz/";
    private static final String URL_TLD_DOT_COM = ".com";
    private static final String URL_TLD_DOT_COM_SLASH = ".com/";
    private static final String URL_TLD_DOT_EDU = ".edu";
    private static final String URL_TLD_DOT_EDU_SLASH = ".edu/";
    private static final String URL_TLD_DOT_GOV = ".gov";
    private static final String URL_TLD_DOT_GOV_SLASH = ".gov/";
    private static final String URL_TLD_DOT_INFO = ".info";
    private static final String URL_TLD_DOT_INFO_SLASH = ".info/";
    private static final String URL_TLD_DOT_NET = ".net";
    private static final String URL_TLD_DOT_NET_SLASH = ".net/";
    private static final String URL_TLD_DOT_ORG = ".org";
    private static final String URL_TLD_DOT_ORG_SLASH = ".org/";
    private static List<TLDMapEntry> tldMap;

    public static class TLDMapEntry {
        public final byte encodedByte;
        public final String tld;

        public TLDMapEntry(String str, byte b8) {
            this.tld = str;
            this.encodedByte = b8;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        tldMap = arrayList;
        arrayList.add(new TLDMapEntry(URL_TLD_DOT_COM_SLASH, (byte) 0));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_ORG_SLASH, (byte) 1));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_EDU_SLASH, (byte) 2));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_NET_SLASH, (byte) 3));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_INFO_SLASH, EDDYSTONE_URL_INFO_SLASH));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_BIZ_SLASH, EDDYSTONE_URL_BIZ_SLASH));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_GOV_SLASH, EDDYSTONE_URL_GOV_SLASH));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_COM, (byte) 7));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_ORG, EDDYSTONE_URL_ORG));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_EDU, EDDYSTONE_URL_EDU));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_NET, EDDYSTONE_URL_NET));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_INFO, EDDYSTONE_URL_INFO));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_BIZ, EDDYSTONE_URL_BIZ));
        tldMap.add(new TLDMapEntry(URL_TLD_DOT_GOV, EDDYSTONE_URL_GOV));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r4 != null) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] compress(java.lang.String r12) {
        /*
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x00f8
            int r2 = r12.length()
            byte[] r2 = new byte[r2]
            java.util.Arrays.fill(r2, r0)
            java.lang.String r3 = "^((?i)http|https):\\/\\/((?i)www\\.)?((?:[0-9a-zA-Z_-]+\\.?)+)(/?)([./0-9a-zA-Z_-]*)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r12 = r3.matcher(r12)
            boolean r3 = r12.matches()
            if (r3 == 0) goto L_0x00f2
            r3 = 2
            java.lang.String r4 = r12.group(r3)
            if (r4 == 0) goto L_0x0026
            r4 = 1
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            java.lang.String r5 = r12.group(r1)
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = "http"
            boolean r5 = r5.equalsIgnoreCase(r6)
            r6 = 3
            if (r5 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003b
            r3 = 0
        L_0x003b:
            r2[r0] = r3
            goto L_0x0045
        L_0x003e:
            if (r4 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x0042:
            r3 = 3
        L_0x0043:
            r2[r0] = r3
        L_0x0045:
            java.lang.String r3 = r12.group(r6)
            byte[] r3 = r3.getBytes()
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            java.lang.String r3 = r4.toLowerCase()
            java.lang.String r4 = "."
            java.lang.String r5 = java.util.regex.Pattern.quote(r4)
            java.lang.String[] r3 = r3.split(r5)
            r5 = 4
            if (r3 == 0) goto L_0x00c3
            byte[] r6 = new byte[r1]
            r7 = 46
            r6[r0] = r7
            int r7 = r3.length
            if (r7 != r1) goto L_0x006e
            r7 = 1
            goto L_0x0070
        L_0x006e:
            int r7 = r3.length
            int r7 = r7 - r1
        L_0x0070:
            r8 = 0
            r9 = 1
        L_0x0072:
            if (r8 >= r7) goto L_0x0087
            if (r8 <= 0) goto L_0x007a
            java.lang.System.arraycopy(r6, r0, r2, r9, r1)
            int r9 = r9 + r1
        L_0x007a:
            r10 = r3[r8]
            byte[] r10 = r10.getBytes()
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r0, r2, r9, r11)
            int r9 = r9 + r11
            int r8 = r8 + r1
            goto L_0x0072
        L_0x0087:
            int r6 = r3.length
            if (r6 <= r1) goto L_0x00c1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            int r4 = r3.length
            int r4 = r4 - r1
            r3 = r3[r4]
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = r12.group(r5)
            if (r4 != 0) goto L_0x00a2
            r6 = r3
            goto L_0x00a6
        L_0x00a2:
            java.lang.String r6 = N.e.x(r3, r4)
        L_0x00a6:
            byte r6 = encodedByteForTopLevelDomain(r6)
            r7 = -1
            if (r6 == r7) goto L_0x00b4
            int r3 = r9 + 1
            r2[r9] = r6
            if (r4 == 0) goto L_0x00bf
            goto L_0x00c5
        L_0x00b4:
            byte[] r1 = r3.getBytes()
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r0, r2, r9, r3)
            int r1 = r9 + r3
            r3 = r1
        L_0x00bf:
            r1 = 0
            goto L_0x00c5
        L_0x00c1:
            r3 = r9
            goto L_0x00bf
        L_0x00c3:
            r1 = 0
            r3 = 1
        L_0x00c5:
            if (r1 != 0) goto L_0x00d9
            java.lang.String r1 = r12.group(r5)
            if (r1 == 0) goto L_0x00d9
            int r4 = r1.length()
            byte[] r1 = r1.getBytes()
            java.lang.System.arraycopy(r1, r0, r2, r3, r4)
            int r3 = r3 + r4
        L_0x00d9:
            r1 = 5
            java.lang.String r12 = r12.group(r1)
            if (r12 == 0) goto L_0x00ec
            int r1 = r12.length()
            byte[] r12 = r12.getBytes()
            java.lang.System.arraycopy(r12, r0, r2, r3, r1)
            int r3 = r3 + r1
        L_0x00ec:
            byte[] r12 = new byte[r3]
            java.lang.System.arraycopy(r2, r0, r12, r0, r3)
            return r12
        L_0x00f2:
            java.net.MalformedURLException r12 = new java.net.MalformedURLException
            r12.<init>()
            throw r12
        L_0x00f8:
            java.net.MalformedURLException r12 = new java.net.MalformedURLException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.utils.UrlBeaconUrlCompressor.compress(java.lang.String):byte[]");
    }

    private static byte encodedByteForTopLevelDomain(String str) {
        Iterator<TLDMapEntry> it = tldMap.iterator();
        byte b8 = -1;
        boolean z = false;
        while (!z && it.hasNext()) {
            TLDMapEntry next = it.next();
            boolean equalsIgnoreCase = next.tld.equalsIgnoreCase(str);
            if (equalsIgnoreCase) {
                b8 = next.encodedByte;
            }
            z = equalsIgnoreCase;
        }
        return b8;
    }

    private static String topLevelDomainForByte(Byte b8) {
        boolean z;
        Iterator<TLDMapEntry> it = tldMap.iterator();
        String str = null;
        boolean z6 = false;
        while (!z6 && it.hasNext()) {
            TLDMapEntry next = it.next();
            if (next.encodedByte == b8.byteValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = next.tld;
            }
            z6 = z;
        }
        return str;
    }

    public static String uncompress(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        byte b8 = bArr[0] & 15;
        int i = 1;
        if (b8 == 0) {
            stringBuffer.append(URL_PROTOCOL_HTTP_WWW_DOT);
        } else if (b8 == 1) {
            stringBuffer.append(URL_PROTOCOL_HTTPS_WWW_DOT);
        } else if (b8 == 2) {
            stringBuffer.append(URL_PROTOCOL_HTTP_COLON_SLASH_SLASH);
        } else if (b8 == 3) {
            stringBuffer.append(URL_PROTOCOL_HTTPS_COLON_SLASH_SLASH);
        }
        byte b9 = -1;
        while (i < bArr.length) {
            byte b10 = bArr[i];
            if (b9 == 0 && b10 == 0) {
                break;
            }
            String str = topLevelDomainForByte(Byte.valueOf(b10));
            if (str != null) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append((char) b10);
            }
            i++;
            b9 = b10;
        }
        return stringBuffer.toString();
    }
}
