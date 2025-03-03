package W6;

import D2.t;
import D6.h;
import D6.k;
import P6.f;
import Q0.g;
import R.e;
import T6.a;
import T6.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import u.C1477r;

public abstract class d extends l {
    public static boolean b0(CharSequence charSequence, char c8) {
        f.e(charSequence, "<this>");
        if (f0(charSequence, c8, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean c0(CharSequence charSequence, String str) {
        f.e(charSequence, "<this>");
        f.e(str, "other");
        if (g0(charSequence, str, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final int d0(CharSequence charSequence) {
        f.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e0(CharSequence charSequence, String str, int i, boolean z) {
        f.e(charSequence, "<this>");
        f.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        a aVar = new a(i, length, 1);
        boolean z6 = charSequence instanceof String;
        int i8 = aVar.f5008W;
        int i9 = aVar.f5007V;
        if (z6) {
            if ((i8 > 0 && i <= i9) || (i8 < 0 && i9 <= i)) {
                while (true) {
                    if (!l.X(0, i, str.length(), str, (String) charSequence, z)) {
                        if (i == i9) {
                            break;
                        }
                        i += i8;
                    } else {
                        break;
                    }
                }
            }
            return -1;
        }
        if ((i8 > 0 && i <= i9) || (i8 < 0 && i9 <= i)) {
            while (true) {
                if (!k0(str, 0, charSequence, i, str.length(), z)) {
                    if (i == i9) {
                        break;
                    }
                    i += i8;
                } else {
                    break;
                }
            }
        }
        return -1;
        return i;
    }

    public static int f0(CharSequence charSequence, char c8, int i, boolean z, int i8) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            z = false;
        }
        f.e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c8, i);
        }
        return h0(charSequence, new char[]{c8}, i, z);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, String str, int i, boolean z, int i8) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            z = false;
        }
        return e0(charSequence, str, i, z);
    }

    public static final int h0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        f.e(charSequence, "<this>");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int d02 = d0(charSequence);
            if (i > d02) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                for (char e : cArr) {
                    if (e.e(e, charAt, z)) {
                        return i;
                    }
                }
                if (i == d02) {
                    return -1;
                }
                i++;
            }
        } else {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            } else if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            } else {
                throw new IllegalArgumentException("Array has more than one element.");
            }
        }
    }

    public static int i0(String str, char c8, int i, int i8) {
        if ((i8 & 2) != 0) {
            i = d0(str);
        }
        f.e(str, "<this>");
        return str.lastIndexOf(c8, i);
    }

    public static c j0(String str, String[] strArr, boolean z, int i) {
        m0(i);
        return new c(str, 0, i, new m(h.A(strArr), z, 1));
    }

    public static final boolean k0(String str, int i, CharSequence charSequence, int i8, int i9, boolean z) {
        f.e(str, "<this>");
        f.e(charSequence, "other");
        if (i8 < 0 || i < 0 || i > str.length() - i9 || i8 > charSequence.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!e.e(str.charAt(i + i10), charSequence.charAt(i8 + i10), z)) {
                return false;
            }
        }
        return true;
    }

    public static String l0(String str, String str2) {
        if (!l.a0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        f.d(substring, "substring(...)");
        return substring;
    }

    public static final void m0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(g.m(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List n0(int i, String str, String str2, boolean z) {
        boolean z6;
        m0(i);
        int i8 = 0;
        int e02 = e0(str, str2, 0, z);
        if (e02 == -1 || i == 1) {
            return F.h.w(str.toString());
        }
        if (i > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i9 = 10;
        if (z6 && i <= 10) {
            i9 = i;
        }
        ArrayList arrayList = new ArrayList(i9);
        do {
            arrayList.add(str.subSequence(i8, e02).toString());
            i8 = str2.length() + e02;
            if ((z6 && arrayList.size() == i - 1) || (e02 = e0(str, str2, i8, z)) == -1) {
                arrayList.add(str.subSequence(i8, str.length()).toString());
            }
            arrayList.add(str.subSequence(i8, e02).toString());
            i8 = str2.length() + e02;
            break;
        } while ((e02 = e0(str, str2, i8, z)) == -1);
        arrayList.add(str.subSequence(i8, str.length()).toString());
        return arrayList;
    }

    public static List o0(String str, char[] cArr) {
        f.e(str, "<this>");
        if (cArr.length == 1) {
            return n0(0, str, String.valueOf(cArr[0]), false);
        }
        m0(0);
        t tVar = new t(1, new c(str, 0, 0, new m(cArr, false, 0)));
        ArrayList arrayList = new ArrayList(k.M(tVar));
        Iterator it = tVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(p0(str, (c) bVar.next()));
        }
    }

    public static final String p0(String str, c cVar) {
        f.e(str, "<this>");
        f.e(cVar, "range");
        return str.subSequence(cVar.f5006U, cVar.f5007V + 1).toString();
    }

    public static String q0(String str) {
        f.e(str, "<this>");
        f.e(str, "missingDelimiterValue");
        int i02 = i0(str, '.', 0, 6);
        if (i02 == -1) {
            return str;
        }
        String substring = str.substring(i02 + 1, str.length());
        f.d(substring, "substring(...)");
        return substring;
    }

    public static String r0(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            f.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(C1477r.c(i, "Requested character count ", " is less than zero.").toString());
    }

    public static CharSequence s0(String str) {
        int i;
        boolean z;
        f.e(str, "<this>");
        int length = str.length() - 1;
        int i8 = 0;
        boolean z6 = false;
        while (i8 <= length) {
            if (!z6) {
                i = i8;
            } else {
                i = length;
            }
            char charAt = str.charAt(i);
            if (Character.isWhitespace(charAt) || Character.isSpaceChar(charAt)) {
                z = true;
            } else {
                z = false;
            }
            if (!z6) {
                if (!z) {
                    z6 = true;
                } else {
                    i8++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i8, length + 1);
    }
}
