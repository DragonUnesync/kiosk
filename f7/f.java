package f7;

import N.e;
import W6.l;
import Z6.b;
import h1.C1048n;
import l7.i;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final i f11718a = C1048n.m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f11719b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f11720c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f11721d;

    static {
        i iVar = i.f13217X;
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            P6.f.d(binaryString, "toBinaryString(it)");
            String replace = b.h("%8s", binaryString).replace(' ', '0');
            P6.f.d(replace, "replace(...)");
            strArr[i] = replace;
        }
        f11721d = strArr;
        String[] strArr2 = f11720c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = e.A(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f11720c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = e.A(sb, strArr3[i10], "|PADDED");
        }
        int length = f11720c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = f11720c;
            if (strArr4[i13] == null) {
                strArr4[i13] = f11721d[i13];
            }
        }
    }

    public static String a(int i, int i8, int i9, int i10, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f11719b;
        if (i9 < strArr.length) {
            str = strArr[i9];
        } else {
            str = b.h("0x%02x", Integer.valueOf(i9));
        }
        if (i10 == 0) {
            str2 = "";
        } else {
            String[] strArr2 = f11721d;
            if (!(i9 == 2 || i9 == 3)) {
                if (i9 == 4 || i9 == 6) {
                    if (i10 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = strArr2[i10];
                    }
                } else if (!(i9 == 7 || i9 == 8)) {
                    String[] strArr3 = f11720c;
                    if (i10 < strArr3.length) {
                        str4 = strArr3[i10];
                        P6.f.b(str4);
                    } else {
                        str4 = strArr2[i10];
                    }
                    if (i9 == 5 && (i10 & 4) != 0) {
                        str2 = l.Y(str4, "HEADERS", "PUSH_PROMISE");
                    } else if (i9 != 0 || (i10 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = l.Y(str4, "PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = strArr2[i10];
        }
        if (z) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return b.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i), Integer.valueOf(i8), str, str2);
    }
}
