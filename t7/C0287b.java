package T7;

import B.q0;
import R7.h;
import S7.c;
import S7.k;
import S7.n;
import S7.o;
import com.samsung.android.knox.accounts.HostAuth;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: T7.b  reason: case insensitive filesystem */
public final class C0287b extends i1 {

    /* renamed from: A  reason: collision with root package name */
    public static final String[] f5152A = {"html", "table"};

    /* renamed from: B  reason: collision with root package name */
    public static final String[] f5153B = {"optgroup", "option"};

    /* renamed from: C  reason: collision with root package name */
    public static final String[] f5154C = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};

    /* renamed from: D  reason: collision with root package name */
    public static final String[] f5155D = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* renamed from: E  reason: collision with root package name */
    public static final String[] f5156E = {HostAuth.ADDRESS, "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* renamed from: F  reason: collision with root package name */
    public static final String[] f5157F = {"mi", "mn", "mo", "ms", "mtext"};

    /* renamed from: G  reason: collision with root package name */
    public static final String[] f5158G = {"desc", "foreignObject", "title"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f5159x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f5160y = {"ol", "ul"};
    public static final String[] z = {"button"};

    /* renamed from: l  reason: collision with root package name */
    public B f5161l;

    /* renamed from: m  reason: collision with root package name */
    public B f5162m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5163n;

    /* renamed from: o  reason: collision with root package name */
    public k f5164o;

    /* renamed from: p  reason: collision with root package name */
    public n f5165p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f5166q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f5167r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f5168s;

    /* renamed from: t  reason: collision with root package name */
    public M f5169t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5170u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5171v;

    /* renamed from: w  reason: collision with root package name */
    public final String[] f5172w = {null};

    public static boolean L(ArrayList arrayList, k kVar) {
        int i;
        int size = arrayList.size();
        int i8 = size - 1;
        if (i8 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i8 >= i) {
            if (((k) arrayList.get(i8)) == kVar) {
                return true;
            }
            i8--;
        }
        return false;
    }

    public final boolean A(String[] strArr, String[] strArr2, String[] strArr3) {
        int i;
        int size = this.e.size();
        int i8 = size - 1;
        if (i8 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i8 >= i) {
            k kVar = (k) this.e.get(i8);
            if (kVar.f4559X.f5087W.equals("http://www.w3.org/1999/xhtml")) {
                String str = kVar.f4559X.f5086V;
                if (h.d(str, strArr)) {
                    return true;
                }
                if (h.d(str, strArr2)) {
                    return false;
                }
                if (strArr3 != null && h.d(str, strArr3)) {
                    return false;
                }
            }
            i8--;
        }
        return false;
    }

    public final boolean B(String str) {
        String[] strArr = f5152A;
        String[] strArr2 = this.f5172w;
        strArr2[0] = str;
        return A(strArr2, strArr, (String[]) null);
    }

    public final void C(I i) {
        D(i, a());
    }

    public final void D(I i, k kVar) {
        o oVar;
        String str = kVar.f4559X.f5086V;
        String str2 = i.f5095W;
        if (i instanceof H) {
            oVar = new o(str2);
        } else if (str.equals("script") || str.equals("style")) {
            oVar = new o(str2);
        } else {
            oVar = new o(str2);
        }
        kVar.C(oVar);
    }

    public final void E(J j7) {
        String str = j7.f5097X;
        if (str == null) {
            str = j7.f5096W.toString();
        }
        a().C(new o(str));
    }

    public final k F(N n4) {
        k q7 = q(n4, "http://www.w3.org/1999/xhtml", false);
        r(q7);
        if (n4.f5106Y) {
            HashMap hashMap = G.f5084e0;
            G g8 = q7.f4559X;
            if (!hashMap.containsKey(g8.f5085U)) {
                g8.f5091a0 = true;
            } else if (!g8.f5090Z) {
                Q q8 = this.f5245c;
                Object[] objArr = {g8.f5086V};
                D d8 = q8.f5122b;
                if (d8.b()) {
                    d8.add(new C(q8.f5121a, "Tag [%s] cannot be self closing; not a void tag", objArr));
                }
            }
            this.f5245c.p(h1.f5193U);
            Q q9 = this.f5245c;
            M m8 = this.f5169t;
            m8.p();
            m8.y(g8.f5085U);
            q9.g(m8);
        }
        return q7;
    }

    public final k G(N n4) {
        k q7 = q(n4, "http://www.w3.org/1999/xhtml", false);
        r(q7);
        g();
        return q7;
    }

    public final void H(N n4, String str) {
        k q7 = q(n4, str, true);
        r(q7);
        if (n4.f5106Y) {
            q7.f4559X.f5091a0 = true;
            g();
        }
    }

    public final void I(N n4, boolean z6, boolean z8) {
        n nVar = (n) q(n4, "http://www.w3.org/1999/xhtml", false);
        if (!z8) {
            this.f5165p = nVar;
        } else if (!K("template")) {
            this.f5165p = nVar;
        }
        r(nVar);
        if (!z6) {
            g();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(S7.k r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "table"
            S7.k r1 = r5.w(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0018
            S7.p r3 = r1.f4578U
            S7.k r3 = (S7.k) r3
            if (r3 == 0) goto L_0x0012
            r4 = 1
            goto L_0x0021
        L_0x0012:
            S7.k r3 = r5.k(r1)
        L_0x0016:
            r4 = 0
            goto L_0x0021
        L_0x0018:
            java.util.ArrayList r3 = r5.e
            java.lang.Object r3 = r3.get(r2)
            S7.k r3 = (S7.k) r3
            goto L_0x0016
        L_0x0021:
            if (r4 == 0) goto L_0x0040
            Q7.g.D(r1)
            S7.p r3 = r1.f4578U
            Q7.g.D(r3)
            S7.p r3 = r6.f4578U
            S7.p r4 = r1.f4578U
            if (r3 != r4) goto L_0x0034
            r6.y()
        L_0x0034:
            S7.p r3 = r1.f4578U
            int r1 = r1.f4579V
            S7.p[] r0 = new S7.p[r0]
            r0[r2] = r6
            r3.b(r1, r0)
            goto L_0x0043
        L_0x0040:
            r3.C(r6)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.C0287b.J(S7.k):void");
    }

    public final boolean K(String str) {
        if (w(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean M(String[] strArr) {
        int i;
        int size = this.e.size();
        int i8 = size - 1;
        if (i8 > 100) {
            i = size - 101;
        } else {
            i = 0;
        }
        while (i8 >= i) {
            if (!h.d(((k) this.e.get(i8)).f4559X.f5086V, strArr)) {
                return true;
            }
            i8--;
        }
        return false;
    }

    public final void N(String str) {
        int size = this.e.size() - 1;
        while (size >= 0) {
            G g8 = g().f4559X;
            if (!g8.f5086V.equals(str) || !g8.f5087W.equals("http://www.w3.org/1999/xhtml")) {
                size--;
            } else {
                return;
            }
        }
    }

    public final void O() {
        if (this.f5167r.size() > 0) {
            ArrayList arrayList = this.f5167r;
            B b8 = (B) arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void P(B b8) {
        this.f5167r.add(b8);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    public final void Q() {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.e
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L_0x000b
            return
        L_0x000b:
            java.util.ArrayList r0 = r11.f5166q
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x001e
            java.util.ArrayList r0 = r11.f5166q
            java.lang.Object r0 = Q0.g.l(r1, r0)
            S7.k r0 = (S7.k) r0
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0099
            java.util.ArrayList r3 = r11.e
            boolean r3 = L(r3, r0)
            if (r3 == 0) goto L_0x002a
            goto L_0x0099
        L_0x002a:
            java.util.ArrayList r3 = r11.f5166q
            int r3 = r3.size()
            int r4 = r3 + -12
            r5 = 0
            if (r4 >= 0) goto L_0x0036
            r4 = 0
        L_0x0036:
            int r3 = r3 - r1
            r6 = r3
        L_0x0038:
            if (r6 != r4) goto L_0x003b
            goto L_0x0050
        L_0x003b:
            java.util.ArrayList r0 = r11.f5166q
            int r6 = r6 + -1
            java.lang.Object r0 = r0.get(r6)
            S7.k r0 = (S7.k) r0
            if (r0 == 0) goto L_0x004f
            java.util.ArrayList r7 = r11.e
            boolean r7 = L(r7, r0)
            if (r7 == 0) goto L_0x0038
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 != 0) goto L_0x005c
            java.util.ArrayList r0 = r11.f5166q
            int r6 = r6 + 1
            java.lang.Object r0 = r0.get(r6)
            S7.k r0 = (S7.k) r0
        L_0x005c:
            Q7.g.D(r0)
            S7.k r1 = new S7.k
            T7.G r4 = r0.f4559X
            java.lang.String r4 = r4.f5086V
            T7.E r7 = r11.f5249h
            java.util.HashMap r8 = r11.i
            java.lang.Object r8 = r8.get(r4)
            T7.G r8 = (T7.G) r8
            java.lang.String r9 = "http://www.w3.org/1999/xhtml"
            if (r8 == 0) goto L_0x007b
            java.lang.String r10 = r8.f5087W
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x0084
        L_0x007b:
            T7.G r8 = T7.G.b(r4, r9, r7)
            java.util.HashMap r7 = r11.i
            r7.put(r4, r8)
        L_0x0084:
            S7.c r4 = r0.e()
            S7.c r4 = r4.clone()
            r1.<init>(r8, r2, r4)
            r11.r(r1)
            java.util.ArrayList r4 = r11.f5166q
            r4.set(r6, r1)
            if (r6 != r3) goto L_0x004f
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.C0287b.Q():void");
    }

    public final void R(k kVar) {
        for (int size = this.f5166q.size() - 1; size >= 0; size--) {
            if (((k) this.f5166q.get(size)) == kVar) {
                this.f5166q.remove(size);
                return;
            }
        }
    }

    public final void S(k kVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((k) this.e.get(size)) == kVar) {
                this.e.remove(size);
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean T() {
        /*
            r10 = this;
            r0 = -1
            java.util.ArrayList r1 = r10.e
            int r1 = r1.size()
            r2 = 1
            int r3 = r1 + -1
            r4 = 256(0x100, float:3.59E-43)
            r5 = 0
            if (r3 < r4) goto L_0x0012
            int r1 = r1 + -257
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            T7.B r4 = r10.f5161l
            java.util.ArrayList r6 = r10.e
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0021
            T7.x r6 = T7.B.f5057a0
            r10.f5161l = r6
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r3 < r1) goto L_0x017a
            java.util.ArrayList r7 = r10.e
            java.lang.Object r7 = r7.get(r3)
            S7.k r7 = (S7.k) r7
            if (r3 != r1) goto L_0x002f
            r6 = 1
        L_0x002f:
            if (r7 == 0) goto L_0x0036
            T7.G r8 = r7.f4559X
            java.lang.String r8 = r8.f5086V
            goto L_0x0038
        L_0x0036:
            java.lang.String r8 = ""
        L_0x0038:
            T7.G r7 = r7.f4559X
            java.lang.String r7 = r7.f5087W
            java.lang.String r9 = "http://www.w3.org/1999/xhtml"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x0046
            goto L_0x014a
        L_0x0046:
            r8.getClass()
            int r7 = r8.hashCode()
            switch(r7) {
                case -1644953643: goto L_0x00ff;
                case -1321546630: goto L_0x00f3;
                case -906021636: goto L_0x00e7;
                case -636197633: goto L_0x00db;
                case 3696: goto L_0x00cf;
                case 3700: goto L_0x00c4;
                case 3710: goto L_0x00b9;
                case 3029410: goto L_0x00ae;
                case 3198432: goto L_0x00a1;
                case 3213227: goto L_0x0094;
                case 110115790: goto L_0x0087;
                case 110157846: goto L_0x007a;
                case 110277346: goto L_0x006d;
                case 110326868: goto L_0x0060;
                case 552573414: goto L_0x0053;
                default: goto L_0x0050;
            }
        L_0x0050:
            r7 = -1
            goto L_0x010a
        L_0x0053:
            java.lang.String r7 = "caption"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x005c
            goto L_0x0050
        L_0x005c:
            r7 = 14
            goto L_0x010a
        L_0x0060:
            java.lang.String r7 = "thead"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0069
            goto L_0x0050
        L_0x0069:
            r7 = 13
            goto L_0x010a
        L_0x006d:
            java.lang.String r7 = "tfoot"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0076
            goto L_0x0050
        L_0x0076:
            r7 = 12
            goto L_0x010a
        L_0x007a:
            java.lang.String r7 = "tbody"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0083
            goto L_0x0050
        L_0x0083:
            r7 = 11
            goto L_0x010a
        L_0x0087:
            java.lang.String r7 = "table"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0090
            goto L_0x0050
        L_0x0090:
            r7 = 10
            goto L_0x010a
        L_0x0094:
            java.lang.String r7 = "html"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x009d
            goto L_0x0050
        L_0x009d:
            r7 = 9
            goto L_0x010a
        L_0x00a1:
            java.lang.String r7 = "head"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00aa
            goto L_0x0050
        L_0x00aa:
            r7 = 8
            goto L_0x010a
        L_0x00ae:
            java.lang.String r7 = "body"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00b7
            goto L_0x0050
        L_0x00b7:
            r7 = 7
            goto L_0x010a
        L_0x00b9:
            java.lang.String r7 = "tr"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00c2
            goto L_0x0050
        L_0x00c2:
            r7 = 6
            goto L_0x010a
        L_0x00c4:
            java.lang.String r7 = "th"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00cd
            goto L_0x0050
        L_0x00cd:
            r7 = 5
            goto L_0x010a
        L_0x00cf:
            java.lang.String r7 = "td"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00d9
            goto L_0x0050
        L_0x00d9:
            r7 = 4
            goto L_0x010a
        L_0x00db:
            java.lang.String r7 = "colgroup"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00e5
            goto L_0x0050
        L_0x00e5:
            r7 = 3
            goto L_0x010a
        L_0x00e7:
            java.lang.String r7 = "select"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00f1
            goto L_0x0050
        L_0x00f1:
            r7 = 2
            goto L_0x010a
        L_0x00f3:
            java.lang.String r7 = "template"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00fd
            goto L_0x0050
        L_0x00fd:
            r7 = 1
            goto L_0x010a
        L_0x00ff:
            java.lang.String r7 = "frameset"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0109
            goto L_0x0050
        L_0x0109:
            r7 = 0
        L_0x010a:
            switch(r7) {
                case 0: goto L_0x0176;
                case 1: goto L_0x0157;
                case 2: goto L_0x0152;
                case 3: goto L_0x014d;
                case 4: goto L_0x013c;
                case 5: goto L_0x013c;
                case 6: goto L_0x0137;
                case 7: goto L_0x0132;
                case 8: goto L_0x012b;
                case 9: goto L_0x011f;
                case 10: goto L_0x011a;
                case 11: goto L_0x0114;
                case 12: goto L_0x0114;
                case 13: goto L_0x0114;
                case 14: goto L_0x010e;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x0143
        L_0x010e:
            T7.d r0 = T7.B.f5061e0
            r10.f5161l = r0
            goto L_0x017a
        L_0x0114:
            T7.f r0 = T7.B.f5063g0
            r10.f5161l = r0
            goto L_0x017a
        L_0x011a:
            T7.z r0 = T7.B.f5059c0
            r10.f5161l = r0
            goto L_0x017a
        L_0x011f:
            S7.k r0 = r10.f5164o
            if (r0 != 0) goto L_0x0126
            T7.t r0 = T7.B.f5053W
            goto L_0x0128
        L_0x0126:
            T7.w r0 = T7.B.f5056Z
        L_0x0128:
            r10.f5161l = r0
            goto L_0x017a
        L_0x012b:
            if (r6 != 0) goto L_0x0143
            T7.u r0 = T7.B.f5054X
            r10.f5161l = r0
            goto L_0x017a
        L_0x0132:
            T7.x r0 = T7.B.f5057a0
            r10.f5161l = r0
            goto L_0x017a
        L_0x0137:
            T7.g r0 = T7.B.f5064h0
            r10.f5161l = r0
            goto L_0x017a
        L_0x013c:
            if (r6 != 0) goto L_0x0143
            T7.h r0 = T7.B.f5065i0
            r10.f5161l = r0
            goto L_0x017a
        L_0x0143:
            if (r6 == 0) goto L_0x014a
            T7.x r0 = T7.B.f5057a0
            r10.f5161l = r0
            goto L_0x017a
        L_0x014a:
            int r3 = r3 + r0
            goto L_0x0022
        L_0x014d:
            T7.e r0 = T7.B.f5062f0
            r10.f5161l = r0
            goto L_0x017a
        L_0x0152:
            T7.i r0 = T7.B.f5066j0
            r10.f5161l = r0
            goto L_0x017a
        L_0x0157:
            java.util.ArrayList r0 = r10.f5167r
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0168
            java.util.ArrayList r0 = r10.f5167r
            java.lang.Object r0 = Q0.g.l(r2, r0)
            T7.B r0 = (T7.B) r0
            goto L_0x0169
        L_0x0168:
            r0 = 0
        L_0x0169:
            if (r0 == 0) goto L_0x016e
            r10.f5161l = r0
            goto L_0x017a
        L_0x016e:
            Q7.h r0 = new Q7.h
            java.lang.String r1 = "Bug: no template insertion mode on stack!"
            r0.<init>(r1)
            throw r0
        L_0x0176:
            T7.n r0 = T7.B.f5070n0
            r10.f5161l = r0
        L_0x017a:
            T7.B r0 = r10.f5161l
            if (r0 == r4) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.C0287b.T():boolean");
    }

    public final E d() {
        return E.f5079c;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [T7.O, T7.M] */
    public final void e(Reader reader, String str, q0 q0Var) {
        super.e(reader, str, q0Var);
        this.f5161l = B.f5051U;
        this.f5162m = null;
        this.f5163n = false;
        this.f5164o = null;
        this.f5165p = null;
        this.f5166q = new ArrayList();
        this.f5167r = new ArrayList();
        this.f5168s = new ArrayList();
        this.f5169t = new O(3, this);
        this.f5170u = true;
        this.f5171v = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if ("malignmark".equals(r4.f5105X) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r9.j() != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r0.equals("application/xhtml+xml") == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (R7.h.c(r3.f5085U, f5158G) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if (r9.j() == false) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(Q0.d r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.e
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x000b
            goto L_0x00ca
        L_0x000b:
            S7.k r0 = r8.a()
            T7.G r2 = r0.f4559X
            java.lang.String r2 = r2.f5087W
            java.lang.String r3 = "http://www.w3.org/1999/xhtml"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x001d
            goto L_0x00ca
        L_0x001d:
            T7.G r3 = r0.f4559X
            java.lang.String r4 = r3.f5087W
            java.lang.String r5 = "http://www.w3.org/1998/Math/MathML"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x005a
            java.lang.String[] r4 = f5157F
            java.lang.String r6 = r3.f5086V
            boolean r4 = R7.h.d(r6, r4)
            if (r4 == 0) goto L_0x005a
            boolean r4 = r9.o()
            if (r4 == 0) goto L_0x0052
            r4 = r9
            T7.N r4 = (T7.N) r4
            java.lang.String r6 = r4.f5105X
            java.lang.String r7 = "mglyph"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x0052
            java.lang.String r4 = r4.f5105X
            java.lang.String r6 = "malignmark"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0052
            goto L_0x00ca
        L_0x0052:
            boolean r4 = r9.j()
            if (r4 == 0) goto L_0x005a
            goto L_0x00ca
        L_0x005a:
            boolean r2 = r5.equals(r2)
            java.lang.String r4 = "annotation-xml"
            if (r2 == 0) goto L_0x007c
            boolean r2 = r0.o(r4)
            if (r2 == 0) goto L_0x007c
            boolean r2 = r9.o()
            if (r2 == 0) goto L_0x007c
            r2 = r9
            T7.N r2 = (T7.N) r2
            java.lang.String r2 = r2.f5105X
            java.lang.String r6 = "svg"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x007c
            goto L_0x00ca
        L_0x007c:
            java.lang.String r2 = r3.f5087W
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00a5
            boolean r2 = r0.o(r4)
            if (r2 == 0) goto L_0x00a5
            java.lang.String r2 = "encoding"
            java.lang.String r0 = r0.c(r2)
            java.lang.String r0 = R7.b.b(r0)
            java.lang.String r2 = "text/html"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00b9
            java.lang.String r2 = "application/xhtml+xml"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            goto L_0x00b9
        L_0x00a5:
            java.lang.String r0 = r3.f5087W
            java.lang.String r2 = "http://www.w3.org/2000/svg"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = r3.f5085U
            java.lang.String[] r2 = f5158G
            boolean r0 = R7.h.c(r0, r2)
            if (r0 == 0) goto L_0x00c6
        L_0x00b9:
            boolean r0 = r9.o()
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r9.j()
            if (r0 == 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            boolean r1 = r9.m()
        L_0x00ca:
            if (r1 == 0) goto L_0x00cf
            T7.B r0 = r8.f5161l
            goto L_0x00d1
        L_0x00cf:
            T7.r r0 = T7.B.f5073r0
        L_0x00d1:
            boolean r9 = r0.d(r9, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.C0287b.h(Q0.d):boolean");
    }

    public final k k(k kVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((k) this.e.get(size)) == kVar) {
                return (k) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void l(k kVar) {
        int size = this.f5166q.size();
        int i = size - 1;
        int i8 = size - 13;
        int i9 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        while (i >= i8) {
            k kVar2 = (k) this.f5166q.get(i);
            if (kVar2 != null) {
                if (kVar.f4559X.f5086V.equals(kVar2.f4559X.f5086V) && kVar.e().equals(kVar2.e())) {
                    i9++;
                }
                if (i9 == 3) {
                    this.f5166q.remove(i);
                    return;
                }
                i--;
            } else {
                return;
            }
        }
    }

    public final void m() {
        k kVar;
        while (!this.f5166q.isEmpty()) {
            int size = this.f5166q.size();
            if (size > 0) {
                kVar = (k) this.f5166q.remove(size - 1);
                continue;
            } else {
                kVar = null;
                continue;
            }
            if (kVar == null) {
                return;
            }
        }
    }

    public final void n(String... strArr) {
        int size = this.e.size() - 1;
        while (size >= 0) {
            k kVar = (k) this.e.get(size);
            if (!"http://www.w3.org/1999/xhtml".equals(kVar.f4559X.f5087W) || (!h.c(kVar.f4559X.f5086V, strArr) && !kVar.o("html"))) {
                g();
                size--;
            } else {
                return;
            }
        }
    }

    public final void o() {
        n("table", "template");
    }

    public final void p() {
        n("tr", "template");
    }

    public final k q(N n4, String str, boolean z6) {
        E e;
        c cVar = n4.f5107Z;
        if (!z6) {
            this.f5249h.a(cVar);
        }
        if (!(cVar == null || cVar.f4544U == 0 || cVar.f(this.f5249h) <= 0)) {
            Object[] objArr = {n4.f5105X};
            D d8 = (D) this.f5243a.f301W;
            if (d8.b()) {
                d8.add(new C(this.f5244b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        String str2 = n4.f5104W;
        if (z6) {
            e = E.f5080d;
        } else {
            e = this.f5249h;
        }
        G g8 = (G) this.i.get(str2);
        if (g8 == null || !g8.f5087W.equals(str)) {
            g8 = G.b(str2, str, e);
            this.i.put(str2, g8);
        }
        if (g8.f5086V.equals("form")) {
            return new n(g8, cVar);
        }
        return new k(g8, (String) null, cVar);
    }

    public final void r(k kVar) {
        n nVar;
        if (kVar.f4559X.f5093c0 && (nVar = this.f5165p) != null) {
            nVar.f4575d0.add(kVar);
        }
        if (((D) this.f5243a.f301W).b() && kVar.l("xmlns")) {
            String c8 = kVar.c("xmlns");
            G g8 = kVar.f4559X;
            if (!c8.equals(g8.f5087W)) {
                Object[] objArr = {kVar.c("xmlns"), g8.f5085U};
                D d8 = (D) this.f5243a.f301W;
                if (d8.b()) {
                    d8.add(new C(this.f5244b, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
                }
            }
        }
        if (!this.f5171v || !h.d(a().f4559X.f5086V, A.f5015B)) {
            a().C(kVar);
        } else {
            J(kVar);
        }
        this.e.add(kVar);
    }

    public final void s(B b8) {
        if (((D) this.f5243a.f301W).b()) {
            ((D) this.f5243a.f301W).add(new C(this.f5244b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.f5248g.getClass().getSimpleName(), this.f5248g, b8}));
        }
    }

    public final void t(String str) {
        while (h.d(a().f4559X.f5086V, f5154C)) {
            if (str == null || !b(str)) {
                g();
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f5248g + ", state=" + this.f5161l + ", currentElement=" + a() + '}';
    }

    public final void u(boolean z6) {
        String[] strArr;
        if (z6) {
            strArr = f5155D;
        } else {
            strArr = f5154C;
        }
        while ("http://www.w3.org/1999/xhtml".equals(a().f4559X.f5087W) && h.d(a().f4559X.f5086V, strArr)) {
            g();
        }
    }

    public final k v(String str) {
        for (int size = this.f5166q.size() - 1; size >= 0; size--) {
            k kVar = (k) this.f5166q.get(size);
            if (kVar == null) {
                return null;
            }
            if (kVar.o(str)) {
                return kVar;
            }
        }
        return null;
    }

    public final k w(String str) {
        int i;
        int size = this.e.size();
        int i8 = size - 1;
        if (i8 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        while (i8 >= i) {
            k kVar = (k) this.e.get(i8);
            G g8 = kVar.f4559X;
            if (g8.f5086V.equals(str) && g8.f5087W.equals("http://www.w3.org/1999/xhtml")) {
                return kVar;
            }
            i8--;
        }
        return null;
    }

    public final boolean x(String str) {
        String[] strArr = z;
        String[] strArr2 = f5159x;
        String[] strArr3 = this.f5172w;
        strArr3[0] = str;
        return A(strArr3, strArr2, strArr);
    }

    public final boolean y(String str) {
        String[] strArr = f5159x;
        String[] strArr2 = this.f5172w;
        strArr2[0] = str;
        return A(strArr2, strArr, (String[]) null);
    }

    public final boolean z(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((k) this.e.get(size)).f4559X.f5086V;
            if (str2.equals(str)) {
                return true;
            }
            if (!h.d(str2, f5153B)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }
}
