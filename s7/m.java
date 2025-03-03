package S7;

import E7.d;
import E7.e;
import R7.h;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import u.C1477r;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4571a = {',', ';'};

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f4572b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f4573c = new ArrayList(106);

    /* renamed from: d  reason: collision with root package name */
    public static final e f4574d = new e(new d(5), 3);
    public static final ThreadLocal e = new ThreadLocal();

    public static void a(Appendable appendable, l lVar, int i) {
        String str;
        int binarySearch = Arrays.binarySearch(lVar.f4569W, i);
        if (binarySearch >= 0) {
            String[] strArr = lVar.f4570X;
            if (binarySearch < strArr.length - 1) {
                int i8 = binarySearch + 1;
                if (lVar.f4569W[i8] == i) {
                    str = strArr[i8];
                }
            }
            str = strArr[binarySearch];
        } else {
            str = "";
        }
        if (!"".equals(str)) {
            appendable.append('&').append(str).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    public static boolean b(int i, char c8, CharsetEncoder charsetEncoder) {
        int h5 = C1477r.h(i);
        if (h5 != 0) {
            if (h5 != 1) {
                return charsetEncoder.canEncode(c8);
            }
            if (c8 < 55296 || c8 >= 57344) {
                return true;
            }
            return false;
        } else if (c8 < 128) {
            return true;
        } else {
            return false;
        }
    }

    public static void c(Appendable appendable, String str, g gVar, int i) {
        int i8;
        Appendable appendable2 = appendable;
        g gVar2 = gVar;
        l lVar = gVar2.f4547U;
        int i9 = gVar2.f4552Z;
        Charset charset = gVar2.f4548V;
        String name = charset.name();
        int i10 = 2;
        if (name.equals("US-ASCII")) {
            i8 = 1;
        } else if (name.startsWith("UTF-")) {
            i8 = 2;
        } else {
            i8 = 3;
        }
        ThreadLocal threadLocal = e;
        CharsetEncoder charsetEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoder == null || !charsetEncoder.charset().equals(charset)) {
            charsetEncoder = charset.newEncoder();
            threadLocal.set(charsetEncoder);
        }
        int length = str.length();
        int i11 = 0;
        boolean z = false;
        boolean z6 = false;
        boolean z8 = false;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if ((i & 4) != 0) {
                if (h.f(codePointAt)) {
                    if (((i & 8) == 0 || z6) && !z8) {
                        if ((i & 16) != 0) {
                            z = true;
                        } else {
                            appendable2.append(' ');
                            z8 = true;
                        }
                        i11 += Character.charCount(codePointAt);
                        i10 = 2;
                    }
                    i11 += Character.charCount(codePointAt);
                    i10 = 2;
                } else {
                    if (z) {
                        appendable2.append(' ');
                        z = false;
                    }
                    z6 = true;
                    z8 = false;
                }
            }
            char c8 = (char) codePointAt;
            if (codePointAt >= 65536) {
                if (b(i8, c8, charsetEncoder)) {
                    char[] cArr = (char[]) f4574d.get();
                    int chars = Character.toChars(codePointAt, cArr, 0);
                    if (appendable2 instanceof StringBuilder) {
                        ((StringBuilder) appendable2).append(cArr, 0, chars);
                    } else {
                        appendable2.append(new String(cArr, 0, chars));
                    }
                } else {
                    a(appendable2, lVar, codePointAt);
                }
                i11 += Character.charCount(codePointAt);
                i10 = 2;
            } else if (c8 == 9 || c8 == 10 || c8 == 13) {
                appendable2.append(c8);
                i11 += Character.charCount(codePointAt);
                i10 = 2;
            } else {
                if (c8 != '\"') {
                    if (c8 != '<') {
                        if (c8 != '>') {
                            if (c8 != 160) {
                                if (c8 == '&') {
                                    appendable2.append("&amp;");
                                } else if (c8 != '\'') {
                                    if (c8 < ' ' || !b(i8, c8, charsetEncoder)) {
                                        a(appendable2, lVar, codePointAt);
                                    } else {
                                        appendable2.append(c8);
                                    }
                                } else if ((i & 2) == 0 || (i & 1) == 0) {
                                    appendable2.append('\'');
                                } else if (lVar == l.xhtml) {
                                    appendable2.append("&#x27;");
                                } else {
                                    appendable2.append("&apos;");
                                }
                            } else if (lVar != l.xhtml) {
                                appendable2.append("&nbsp;");
                            } else {
                                appendable2.append("&#xa0;");
                            }
                        } else if ((i & 1) != 0) {
                            appendable2.append("&gt;");
                        } else {
                            appendable2.append(c8);
                        }
                    } else if ((i & 1) != 0 || lVar == l.xhtml || i9 == i10) {
                        appendable2.append("&lt;");
                    } else {
                        appendable2.append('<');
                    }
                } else if ((i & 2) != 0) {
                    appendable2.append("&quot;");
                } else {
                    appendable2.append(c8);
                }
                i11 += Character.charCount(codePointAt);
                i10 = 2;
            }
        }
    }
}
