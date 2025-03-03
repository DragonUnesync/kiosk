package W6;

import P6.f;

public abstract class l extends k {
    public static boolean W(String str, String str2) {
        if (str != null) {
            return str.equalsIgnoreCase(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static final boolean X(int i, int i8, int i9, String str, String str2, boolean z) {
        f.e(str, "<this>");
        f.e(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i8, i9);
        }
        return str.regionMatches(z, i, str2, i8, i9);
    }

    public static String Y(String str, String str2, String str3) {
        f.e(str, "<this>");
        f.e(str2, "oldValue");
        int e02 = d.e0(str, str2, 0, false);
        if (e02 < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i8 = 0;
            do {
                sb.append(str, i8, e02);
                sb.append(str3);
                i8 = e02 + length;
                if (e02 >= str.length() || (e02 = d.e0(str, str2, e02 + i, false)) <= 0) {
                    sb.append(str, i8, str.length());
                    String sb2 = sb.toString();
                    f.d(sb2, "toString(...)");
                }
                sb.append(str, i8, e02);
                sb.append(str3);
                i8 = e02 + length;
                break;
            } while ((e02 = d.e0(str, str2, e02 + i, false)) <= 0);
            sb.append(str, i8, str.length());
            String sb22 = sb.toString();
            f.d(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static boolean Z(int i, String str, String str2, boolean z) {
        f.e(str, "<this>");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return X(i, 0, str2.length(), str, str2, z);
    }

    public static boolean a0(String str, String str2, boolean z) {
        f.e(str, "<this>");
        f.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return X(0, 0, str2.length(), str, str2, z);
    }
}
