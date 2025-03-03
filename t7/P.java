package T7;

import Q7.g;
import R7.h;

public final class P {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f5115c = {"*", "|", "_", "-"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f5116d = {"-", "_"};

    /* renamed from: a  reason: collision with root package name */
    public final String f5117a;

    /* renamed from: b  reason: collision with root package name */
    public int f5118b = 0;

    public P(String str) {
        g.D(str);
        this.f5117a = str;
    }

    public static String k(String str) {
        StringBuilder b8 = h.b();
        char c8 = 0;
        for (char c9 : str.toCharArray()) {
            if (c9 != '\\') {
                b8.append(c9);
            } else if (c8 == '\\') {
                b8.append(c9);
                c8 = 0;
            }
            c8 = c9;
        }
        return h.h(b8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071 A[LOOP:0: B:1:0x0009->B:41:0x0071, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0055 A[EDGE_INSN: B:43:0x0055->B:34:0x0055 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        L_0x0009:
            boolean r9 = r11.f()
            if (r9 == 0) goto L_0x0010
            goto L_0x0055
        L_0x0010:
            char r9 = r11.b()
            r10 = 92
            if (r2 == r10) goto L_0x0042
            r10 = 39
            if (r9 != r10) goto L_0x0023
            if (r9 == r12) goto L_0x0023
            if (r3 != 0) goto L_0x0023
            r4 = r4 ^ 1
            goto L_0x002d
        L_0x0023:
            r10 = 34
            if (r9 != r10) goto L_0x002d
            if (r9 == r12) goto L_0x002d
            if (r4 != 0) goto L_0x002d
            r3 = r3 ^ 1
        L_0x002d:
            if (r4 != 0) goto L_0x0053
            if (r3 != 0) goto L_0x0053
            if (r8 == 0) goto L_0x0034
            goto L_0x0053
        L_0x0034:
            if (r9 != r12) goto L_0x003d
            int r7 = r7 + 1
            if (r5 != r0) goto L_0x004d
            int r5 = r11.f5118b
            goto L_0x004d
        L_0x003d:
            if (r9 != r13) goto L_0x004d
            int r7 = r7 + -1
            goto L_0x004d
        L_0x0042:
            r10 = 81
            if (r9 != r10) goto L_0x0048
            r8 = 1
            goto L_0x004d
        L_0x0048:
            r10 = 69
            if (r9 != r10) goto L_0x004d
            r8 = 0
        L_0x004d:
            if (r7 <= 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            int r6 = r11.f5118b
        L_0x0053:
            if (r7 > 0) goto L_0x0071
        L_0x0055:
            if (r6 < 0) goto L_0x005e
            java.lang.String r12 = r11.f5117a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L_0x0060
        L_0x005e:
            java.lang.String r12 = ""
        L_0x0060:
            if (r7 > 0) goto L_0x0063
            return r12
        L_0x0063:
            java.lang.String r13 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r12 = N.e.y(r13, r12, r0)
            Q7.h r13 = new Q7.h
            r13.<init>(r12)
            throw r13
        L_0x0071:
            r2 = r9
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.P.a(char, char):java.lang.String");
    }

    public final char b() {
        int i = this.f5118b;
        this.f5118b = i + 1;
        return this.f5117a.charAt(i);
    }

    public final String c(String... strArr) {
        String str;
        int i = this.f5118b;
        boolean z = false;
        loop0:
        while (true) {
            boolean f8 = f();
            str = this.f5117a;
            if (f8) {
                break;
            }
            if (str.charAt(this.f5118b) == '\\') {
                int length = this.f5117a.length();
                int i8 = this.f5118b;
                if (length - i8 > 1) {
                    this.f5118b = i8 + 2;
                    z = true;
                }
            }
            if (f() || !Character.isLetterOrDigit(this.f5117a.charAt(this.f5118b))) {
                int length2 = strArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    if (!h(strArr[i9])) {
                        i9++;
                    }
                }
                break loop0;
            }
            this.f5118b++;
        }
        String substring = str.substring(i, this.f5118b);
        if (z) {
            return k(substring);
        }
        return substring;
    }

    public final String d(String str) {
        int i = this.f5118b;
        String str2 = this.f5117a;
        int indexOf = str2.indexOf(str, i);
        if (indexOf == -1) {
            return j();
        }
        String substring = str2.substring(this.f5118b, indexOf);
        this.f5118b = substring.length() + this.f5118b;
        return substring;
    }

    public final boolean e() {
        boolean z = false;
        while (!f() && h.f(this.f5117a.charAt(this.f5118b))) {
            this.f5118b++;
            z = true;
        }
        return z;
    }

    public final boolean f() {
        if (this.f5117a.length() - this.f5118b == 0) {
            return true;
        }
        return false;
    }

    public final boolean g(String str) {
        if (!h(str)) {
            return false;
        }
        this.f5118b = str.length() + this.f5118b;
        return true;
    }

    public final boolean h(String str) {
        return this.f5117a.regionMatches(true, this.f5118b, str, 0, str.length());
    }

    public final boolean i(char... cArr) {
        if (f()) {
            return false;
        }
        for (char c8 : cArr) {
            if (this.f5117a.charAt(this.f5118b) == c8) {
                return true;
            }
        }
        return false;
    }

    public final String j() {
        int i = this.f5118b;
        String str = this.f5117a;
        String substring = str.substring(i);
        this.f5118b = str.length();
        return substring;
    }

    public final String toString() {
        return this.f5117a.substring(this.f5118b);
    }
}
