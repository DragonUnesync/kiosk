package T7;

import E7.d;
import R2.c;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;

/* renamed from: T7.a  reason: case insensitive filesystem */
public final class C0285a {

    /* renamed from: n  reason: collision with root package name */
    public static final c f5139n = new c((Supplier) new d(6));

    /* renamed from: o  reason: collision with root package name */
    public static final c f5140o = new c((Supplier) new d(7));

    /* renamed from: a  reason: collision with root package name */
    public String[] f5141a;

    /* renamed from: b  reason: collision with root package name */
    public Reader f5142b;

    /* renamed from: c  reason: collision with root package name */
    public char[] f5143c;

    /* renamed from: d  reason: collision with root package name */
    public int f5144d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f5145f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f5146g;

    /* renamed from: h  reason: collision with root package name */
    public int f5147h = -1;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f5148j = null;

    /* renamed from: k  reason: collision with root package name */
    public int f5149k = 1;

    /* renamed from: l  reason: collision with root package name */
    public String f5150l;

    /* renamed from: m  reason: collision with root package name */
    public int f5151m;

    public C0285a(Reader reader) {
        this.f5142b = reader;
        this.f5143c = (char[]) f5140o.F();
        this.f5141a = (String[]) f5139n.F();
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i8, int i9) {
        if (i9 > 12) {
            return new String(cArr, i8, i9);
        }
        if (i9 < 1) {
            return "";
        }
        int i10 = i9 + i8;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = i8; i13 < i10; i13++) {
            i12 = (i12 * 31) + cArr[i13];
        }
        int i14 = i12 & 511;
        String str = strArr[i14];
        if (str != null && i9 == str.length()) {
            int i15 = i8;
            int i16 = i9;
            while (true) {
                int i17 = i16 - 1;
                if (i16 == 0) {
                    return str;
                }
                int i18 = i15 + 1;
                int i19 = i11 + 1;
                if (cArr[i15] != str.charAt(i11)) {
                    break;
                }
                i15 = i18;
                i16 = i17;
                i11 = i19;
            }
        }
        String str2 = new String(cArr, i8, i9);
        strArr[i14] = str2;
        return str2;
    }

    public final void a() {
        this.f5144d++;
    }

    public final void b() {
        int i8;
        if (!this.i && (i8 = this.f5144d) >= this.f5145f && this.f5147h == -1) {
            this.f5146g += i8;
            int i9 = this.e - i8;
            this.e = i9;
            if (i9 > 0) {
                char[] cArr = this.f5143c;
                System.arraycopy(cArr, i8, cArr, 0, i9);
            }
            this.f5144d = 0;
            while (true) {
                int i10 = this.e;
                if (i10 >= 2048) {
                    break;
                }
                try {
                    Reader reader = this.f5142b;
                    char[] cArr2 = this.f5143c;
                    int read = reader.read(cArr2, i10, cArr2.length - i10);
                    if (read == -1) {
                        this.i = true;
                        break;
                    }
                    this.e += read;
                } catch (IOException e8) {
                    throw new UncheckedIOException(e8);
                }
            }
            this.f5145f = Math.min(this.e, 1024);
            ArrayList arrayList = this.f5148j;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    int n4 = n(this.f5146g);
                    if (n4 == -1) {
                        n4 = 0;
                    }
                    Integer num = (Integer) this.f5148j.get(n4);
                    num.getClass();
                    this.f5149k += n4;
                    this.f5148j.clear();
                    this.f5148j.add(num);
                }
                for (int i11 = this.f5144d; i11 < this.e; i11++) {
                    if (this.f5143c[i11] == 10) {
                        this.f5148j.add(Integer.valueOf(this.f5146g + 1 + i11));
                    }
                }
            }
            this.f5150l = null;
        }
    }

    public final void d() {
        c cVar = f5139n;
        c cVar2 = f5140o;
        Reader reader = this.f5142b;
        if (reader != null) {
            try {
                reader.close();
                this.f5142b = null;
                Arrays.fill(this.f5143c, 0);
                cVar2.u0(this.f5143c);
                this.f5143c = null;
                cVar.u0(this.f5141a);
            } catch (IOException unused) {
                this.f5142b = null;
                Arrays.fill(this.f5143c, 0);
                cVar2.u0(this.f5143c);
                this.f5143c = null;
                cVar.u0(this.f5141a);
            } catch (Throwable th) {
                this.f5142b = null;
                Arrays.fill(this.f5143c, 0);
                cVar2.u0(this.f5143c);
                this.f5143c = null;
                cVar.u0(this.f5141a);
                this.f5141a = null;
                throw th;
            }
            this.f5141a = null;
        }
    }

    public final char e() {
        char c8;
        b();
        int i8 = this.f5144d;
        if (i8 >= this.e) {
            c8 = 65535;
        } else {
            c8 = this.f5143c[i8];
        }
        this.f5144d = i8 + 1;
        return c8;
    }

    public final String f(boolean z) {
        int i8 = this.f5144d;
        int i9 = this.e;
        char[] cArr = this.f5143c;
        int i10 = i8;
        while (i10 < i9) {
            char c8 = cArr[i10];
            if (c8 == 0) {
                break;
            }
            if (c8 != '\"') {
                if (c8 != '&') {
                    if (c8 == '\'' && z) {
                        break;
                    }
                } else {
                    break;
                }
            } else if (!z) {
                break;
            }
            i10++;
        }
        this.f5144d = i10;
        if (i10 > i8) {
            return c(this.f5143c, this.f5141a, i8, i10 - i8);
        }
        return "";
    }

    public final String g() {
        int i8 = this.f5144d;
        int i9 = this.e;
        char[] cArr = this.f5143c;
        int i10 = i8;
        while (i10 < i9) {
            char c8 = cArr[i10];
            if (c8 == 0 || c8 == '&' || c8 == '<') {
                break;
            }
            i10++;
        }
        this.f5144d = i10;
        if (i10 > i8) {
            return c(this.f5143c, this.f5141a, i8, i10 - i8);
        }
        return "";
    }

    public final String h() {
        char c8;
        b();
        int i8 = this.f5144d;
        while (true) {
            int i9 = this.f5144d;
            if (i9 < this.e && (((c8 = this.f5143c[i9]) >= 'A' && c8 <= 'Z') || ((c8 >= 'a' && c8 <= 'z') || Character.isLetter(c8)))) {
                this.f5144d++;
            }
        }
        return c(this.f5143c, this.f5141a, i8, this.f5144d - i8);
    }

    public final String i(char c8) {
        int i8;
        b();
        int i9 = this.f5144d;
        while (true) {
            if (i9 >= this.e) {
                i8 = -1;
                break;
            } else if (c8 == this.f5143c[i9]) {
                i8 = i9 - this.f5144d;
                break;
            } else {
                i9++;
            }
        }
        if (i8 != -1) {
            String c9 = c(this.f5143c, this.f5141a, this.f5144d, i8);
            this.f5144d += i8;
            return c9;
        }
        b();
        char[] cArr = this.f5143c;
        String[] strArr = this.f5141a;
        int i10 = this.f5144d;
        String c10 = c(cArr, strArr, i10, this.e - i10);
        this.f5144d = this.e;
        return c10;
    }

    public final String j(char... cArr) {
        b();
        int i8 = this.f5144d;
        int i9 = this.e;
        char[] cArr2 = this.f5143c;
        int i10 = i8;
        loop0:
        while (i10 < i9) {
            for (char c8 : cArr) {
                if (cArr2[i10] == c8) {
                    break loop0;
                }
            }
            i10++;
        }
        this.f5144d = i10;
        if (i10 > i8) {
            return c(this.f5143c, this.f5141a, i8, i10 - i8);
        }
        return "";
    }

    public final String k(char... cArr) {
        b();
        int i8 = this.f5144d;
        int i9 = this.e;
        char[] cArr2 = this.f5143c;
        int i10 = i8;
        while (i10 < i9 && Arrays.binarySearch(cArr, cArr2[i10]) < 0) {
            i10++;
        }
        this.f5144d = i10;
        if (i10 > i8) {
            return c(this.f5143c, this.f5141a, i8, i10 - i8);
        }
        return "";
    }

    public final char l() {
        b();
        int i8 = this.f5144d;
        if (i8 >= this.e) {
            return 65535;
        }
        return this.f5143c[i8];
    }

    public final boolean m() {
        b();
        if (this.f5144d >= this.e) {
            return true;
        }
        return false;
    }

    public final int n(int i8) {
        ArrayList arrayList = this.f5148j;
        if (arrayList == null) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i8));
        if (binarySearch < -1) {
            return Math.abs(binarySearch) - 2;
        }
        return binarySearch;
    }

    public final boolean o(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.e - this.f5144d) {
            int i8 = 0;
            while (i8 < length) {
                if (str.charAt(i8) == this.f5143c[this.f5144d + i8]) {
                    i8++;
                }
            }
            this.f5144d = str.length() + this.f5144d;
            return true;
        }
        return false;
    }

    public final boolean p(String str) {
        b();
        int length = str.length();
        if (length <= this.e - this.f5144d) {
            int i8 = 0;
            while (i8 < length) {
                if (Character.toUpperCase(str.charAt(i8)) == Character.toUpperCase(this.f5143c[this.f5144d + i8])) {
                    i8++;
                }
            }
            this.f5144d = str.length() + this.f5144d;
            return true;
        }
        return false;
    }

    public final boolean q(char c8) {
        if (m() || this.f5143c[this.f5144d] != c8) {
            return false;
        }
        return true;
    }

    public final boolean r(char... cArr) {
        if (m()) {
            return false;
        }
        b();
        char c8 = this.f5143c[this.f5144d];
        for (char c9 : cArr) {
            if (c9 == c8) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        if (m()) {
            return false;
        }
        char c8 = this.f5143c[this.f5144d];
        if ((c8 < 'A' || c8 > 'Z') && (c8 < 'a' || c8 > 'z')) {
            return false;
        }
        return true;
    }

    public final boolean t() {
        if (m()) {
            return false;
        }
        char c8 = this.f5143c[this.f5144d];
        if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !Character.isLetter(c8))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i8 = this.e;
        int i9 = this.f5144d;
        if (i8 - i9 < 0) {
            return "";
        }
        return new String(this.f5143c, i9, i8 - i9);
    }

    public final int u(String str) {
        b();
        char charAt = str.charAt(0);
        int i8 = this.f5144d;
        while (i8 < this.e) {
            int i9 = 1;
            if (charAt != this.f5143c[i8]) {
                do {
                    i8++;
                    if (i8 >= this.e) {
                        break;
                    }
                } while (charAt == this.f5143c[i8]);
            }
            int i10 = i8 + 1;
            int length = (str.length() + i10) - 1;
            int i11 = this.e;
            if (i8 < i11 && length <= i11) {
                int i12 = i10;
                while (i12 < length && str.charAt(i9) == this.f5143c[i12]) {
                    i12++;
                    i9++;
                }
                if (i12 == length) {
                    return i8 - this.f5144d;
                }
            }
            i8 = i10;
        }
        return -1;
    }

    public final int v() {
        return this.f5146g + this.f5144d;
    }

    public final String w() {
        boolean z;
        boolean z6;
        int n4;
        StringBuilder sb = new StringBuilder();
        int v4 = v();
        int i8 = 1;
        if (this.f5148j != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int n5 = n(v4);
            if (n5 == -1) {
                i8 = this.f5149k;
            } else {
                i8 = 1 + n5 + this.f5149k;
            }
        }
        sb.append(i8);
        sb.append(":");
        int v8 = v();
        if (this.f5148j != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 && (n4 = n(v8)) != -1) {
            v8 -= ((Integer) this.f5148j.get(n4)).intValue();
        }
        sb.append(v8 + 1);
        return sb.toString();
    }

    public final void x() {
        int i8 = this.f5147h;
        if (i8 != -1) {
            this.f5144d = i8;
            this.f5147h = -1;
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    public final void y() {
        int i8 = this.f5144d;
        if (i8 >= 1) {
            this.f5144d = i8 - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }
}
