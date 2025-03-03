package T7;

import Q0.d;
import S7.l;
import S7.m;
import java.util.Arrays;
import java.util.Iterator;

public final class Q {

    /* renamed from: u  reason: collision with root package name */
    public static final char[] f5119u;

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f5120v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a  reason: collision with root package name */
    public final C0285a f5121a;

    /* renamed from: b  reason: collision with root package name */
    public final D f5122b;

    /* renamed from: c  reason: collision with root package name */
    public h1 f5123c = h1.f5193U;

    /* renamed from: d  reason: collision with root package name */
    public d f5124d = null;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f5125f = null;

    /* renamed from: g  reason: collision with root package name */
    public final StringBuilder f5126g = new StringBuilder(1024);

    /* renamed from: h  reason: collision with root package name */
    public final StringBuilder f5127h = new StringBuilder(1024);
    public final N i;

    /* renamed from: j  reason: collision with root package name */
    public final M f5128j;

    /* renamed from: k  reason: collision with root package name */
    public O f5129k;

    /* renamed from: l  reason: collision with root package name */
    public final I f5130l = new d(5, 2);

    /* renamed from: m  reason: collision with root package name */
    public final K f5131m = new K();

    /* renamed from: n  reason: collision with root package name */
    public final J f5132n = new J();

    /* renamed from: o  reason: collision with root package name */
    public String f5133o;

    /* renamed from: p  reason: collision with root package name */
    public String f5134p;

    /* renamed from: q  reason: collision with root package name */
    public int f5135q;

    /* renamed from: r  reason: collision with root package name */
    public int f5136r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f5137s = new int[1];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f5138t = new int[2];

    static {
        char[] cArr = {9, 10, 13, 12, ' ', '<', '&'};
        f5119u = cArr;
        Arrays.sort(cArr);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [Q0.d, T7.I] */
    /* JADX WARNING: type inference failed for: r1v2, types: [T7.O, T7.N] */
    /* JADX WARNING: type inference failed for: r0v10, types: [T7.O, T7.M] */
    public Q(i1 i1Var) {
        ? o2 = new O(2, i1Var);
        this.i = o2;
        this.f5129k = o2;
        this.f5128j = new O(3, i1Var);
        this.f5121a = i1Var.f5244b;
        this.f5122b = (D) i1Var.f5243a.f301W;
    }

    public final void a(h1 h1Var) {
        p(h1Var);
        this.f5121a.a();
    }

    public final void b(String str, Object... objArr) {
        D d8 = this.f5122b;
        if (d8.b()) {
            d8.add(new C(this.f5121a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    public final int[] c(Character ch, boolean z) {
        int i8;
        int i9;
        char c8;
        int i10;
        char c9;
        int i11;
        char c10;
        char c11;
        String str;
        int i12;
        int i13;
        int i14;
        char c12;
        int i15;
        char c13;
        C0285a aVar = this.f5121a;
        if (aVar.m()) {
            return null;
        }
        if (ch != null && ch.charValue() == aVar.l()) {
            return null;
        }
        char[] cArr = f5119u;
        aVar.b();
        if (!aVar.m() && Arrays.binarySearch(cArr, aVar.f5143c[aVar.f5144d]) >= 0) {
            return null;
        }
        if (aVar.e - aVar.f5144d < 1024) {
            aVar.f5145f = 0;
        }
        aVar.b();
        aVar.f5147h = aVar.f5144d;
        boolean o2 = aVar.o("#");
        char c14 = 'A';
        int[] iArr = this.f5137s;
        if (o2) {
            boolean p3 = aVar.p("X");
            if (p3) {
                aVar.b();
                int i16 = aVar.f5144d;
                while (true) {
                    i15 = aVar.f5144d;
                    if (i15 >= aVar.e || (((c13 = aVar.f5143c[i15]) < '0' || c13 > '9') && ((c13 < c14 || c13 > 'F') && (c13 < 'a' || c13 > 'f')))) {
                        str = C0285a.c(aVar.f5143c, aVar.f5141a, i16, i15 - i16);
                    } else {
                        aVar.f5144d = i15 + 1;
                        c14 = 'A';
                    }
                }
                str = C0285a.c(aVar.f5143c, aVar.f5141a, i16, i15 - i16);
            } else {
                aVar.b();
                int i17 = aVar.f5144d;
                while (true) {
                    i14 = aVar.f5144d;
                    if (i14 >= aVar.e || (c12 = aVar.f5143c[i14]) < '0' || c12 > '9') {
                        str = C0285a.c(aVar.f5143c, aVar.f5141a, i17, i14 - i17);
                    } else {
                        aVar.f5144d = i14 + 1;
                    }
                }
                str = C0285a.c(aVar.f5143c, aVar.f5141a, i17, i14 - i17);
            }
            if (str.length() == 0) {
                b("numeric reference with no numerals", new Object[0]);
                aVar.x();
                return null;
            }
            aVar.f5147h = -1;
            if (!aVar.o(";")) {
                b("missing semicolon on [&#%s]", str);
            }
            if (p3) {
                i12 = 16;
            } else {
                i12 = 10;
            }
            try {
                i13 = Integer.valueOf(str, i12).intValue();
            } catch (NumberFormatException unused) {
                i13 = -1;
            }
            if (i13 == -1 || i13 > 1114111) {
                b("character [%s] outside of valid range", Integer.valueOf(i13));
                iArr[0] = 65533;
            } else {
                if (i13 >= 128 && i13 < 160) {
                    b("character [%s] is not a valid unicode code point", Integer.valueOf(i13));
                    i13 = f5120v[i13 - 128];
                }
                iArr[0] = i13;
            }
            return iArr;
        }
        aVar.b();
        int i18 = aVar.f5144d;
        while (true) {
            int i19 = aVar.f5144d;
            if (i19 < aVar.e && (((c11 = aVar.f5143c[i19]) >= 'A' && c11 <= 'Z') || ((c11 >= 'a' && c11 <= 'z') || Character.isLetter(c11)))) {
                aVar.f5144d++;
            }
        }
        while (true) {
            i8 = aVar.f5144d;
            if (i8 < aVar.e && (c10 = aVar.f5143c[i8]) >= '0' && c10 <= '9') {
                aVar.f5144d = i8 + 1;
            }
        }
        String c15 = C0285a.c(aVar.f5143c, aVar.f5141a, i18, i8 - i18);
        boolean q7 = aVar.q(';');
        char[] cArr2 = m.f4571a;
        l lVar = l.base;
        int binarySearch = Arrays.binarySearch(lVar.f4567U, c15);
        if (binarySearch >= 0) {
            i9 = lVar.f4568V[binarySearch];
        } else {
            i9 = -1;
        }
        if (i9 == -1) {
            l lVar2 = l.extended;
            int binarySearch2 = Arrays.binarySearch(lVar2.f4567U, c15);
            if (binarySearch2 >= 0) {
                i11 = lVar2.f4568V[binarySearch2];
            } else {
                i11 = -1;
            }
            if (i11 == -1 || !q7) {
                aVar.x();
                if (q7) {
                    b("invalid named reference [%s]", c15);
                }
                if (z) {
                    return null;
                }
                Iterator it = m.f4573c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c15 = "";
                        break;
                    }
                    String str2 = (String) it.next();
                    if (c15.startsWith(str2)) {
                        c15 = str2;
                        break;
                    }
                }
                if (c15.isEmpty()) {
                    return null;
                }
                aVar.o(c15);
            }
        }
        if (!z || (!aVar.t() && ((aVar.m() || (c9 = aVar.f5143c[aVar.f5144d]) < '0' || c9 > '9') && !aVar.r('=', '-', '_')))) {
            aVar.f5147h = -1;
            if (!aVar.o(";")) {
                b("missing semicolon on [&%s]", c15);
            }
            String str3 = (String) m.f4572b.get(c15);
            int[] iArr2 = this.f5138t;
            if (str3 != null) {
                iArr2[0] = str3.codePointAt(0);
                iArr2[1] = str3.codePointAt(1);
                c8 = 2;
            } else {
                l lVar3 = l.extended;
                int binarySearch3 = Arrays.binarySearch(lVar3.f4567U, c15);
                if (binarySearch3 >= 0) {
                    i10 = lVar3.f4568V[binarySearch3];
                } else {
                    i10 = -1;
                }
                if (i10 != -1) {
                    iArr2[0] = i10;
                    c8 = 1;
                } else {
                    c8 = 0;
                }
            }
            if (c8 == 1) {
                iArr[0] = iArr2[0];
                return iArr;
            } else if (c8 == 2) {
                return iArr2;
            } else {
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(c15));
            }
        } else {
            aVar.x();
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: T7.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: T7.N} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: T7.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: T7.M} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T7.O d(boolean r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0008
            T7.N r1 = r0.i
            r1.p()
            goto L_0x000d
        L_0x0008:
            T7.M r1 = r0.f5128j
            r1.p()
        L_0x000d:
            r0.f5129k = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.Q.d(boolean):T7.O");
    }

    public final void e() {
        d.q(this.f5127h);
    }

    public final void f(char c8) {
        if (this.f5125f == null) {
            this.f5125f = String.valueOf(c8);
        } else {
            StringBuilder sb = this.f5126g;
            if (sb.length() == 0) {
                sb.append(this.f5125f);
            }
            sb.append(c8);
        }
        this.f5130l.getClass();
        this.f5121a.v();
    }

    public final void g(d dVar) {
        if (!this.e) {
            this.f5124d = dVar;
            this.e = true;
            dVar.getClass();
            C0285a aVar = this.f5121a;
            aVar.v();
            this.f5136r = aVar.v();
            int i8 = dVar.f4018V;
            if (i8 == 2) {
                this.f5133o = ((N) dVar).f5104W;
                this.f5134p = null;
            } else if (i8 == 3) {
                M m8 = (M) dVar;
                if (m8.f5107Z != null) {
                    Object[] objArr = {m8.f5105X};
                    D d8 = this.f5122b;
                    if (d8.b()) {
                        d8.add(new C(aVar, "Attributes incorrectly present on end tag [/%s]", objArr));
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Must be false");
        }
    }

    public final void h(String str) {
        if (this.f5125f == null) {
            this.f5125f = str;
        } else {
            StringBuilder sb = this.f5126g;
            if (sb.length() == 0) {
                sb.append(this.f5125f);
            }
            sb.append(str);
        }
        this.f5130l.getClass();
        this.f5121a.v();
    }

    public final void i(StringBuilder sb) {
        if (this.f5125f == null) {
            this.f5125f = sb.toString();
        } else {
            StringBuilder sb2 = this.f5126g;
            if (sb2.length() == 0) {
                sb2.append(this.f5125f);
            }
            sb2.append(sb);
        }
        this.f5130l.getClass();
        this.f5121a.v();
    }

    public final void j() {
        g(this.f5132n);
    }

    public final void k() {
        g(this.f5131m);
    }

    public final void l() {
        O o2 = this.f5129k;
        if (o2.f5110c0) {
            o2.z();
        }
        g(this.f5129k);
    }

    public final void m(h1 h1Var) {
        D d8 = this.f5122b;
        if (d8.b()) {
            d8.add(new C(this.f5121a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{h1Var}));
        }
    }

    public final void n(h1 h1Var) {
        D d8 = this.f5122b;
        if (d8.b()) {
            C0285a aVar = this.f5121a;
            d8.add(new C(aVar, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.l()), h1Var}));
        }
    }

    public final boolean o() {
        if (this.f5133o != null) {
            O o2 = this.f5129k;
            String str = o2.f5104W;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            } else if (o2.f5104W.equalsIgnoreCase(this.f5133o)) {
                return true;
            }
        }
        return false;
    }

    public final void p(h1 h1Var) {
        if (h1Var == h1.f5207b0) {
            this.f5135q = this.f5121a.v();
        }
        this.f5123c = h1Var;
    }
}
