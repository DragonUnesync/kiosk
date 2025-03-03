package T7;

import M7.a;
import R7.b;
import com.samsung.android.knox.accounts.HostAuth;
import com.samsung.android.knox.container.KnoxContainerManager;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public final class G implements Cloneable {

    /* renamed from: e0  reason: collision with root package name */
    public static final HashMap f5084e0 = new HashMap();

    /* renamed from: U  reason: collision with root package name */
    public String f5085U;

    /* renamed from: V  reason: collision with root package name */
    public final String f5086V;

    /* renamed from: W  reason: collision with root package name */
    public String f5087W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f5088X = true;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f5089Y = true;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f5090Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5091a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f5092b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f5093c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f5094d0 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", HostAuth.ADDRESS, "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        String[] strArr2 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", KnoxContainerManager.CONTAINER_CREATION_STATUS_CODE, "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"};
        String[] strArr3 = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", HostAuth.ADDRESS, "li", "th", "td", "script", "style", "ins", "del", "s", "button"};
        String[] strArr4 = b.f4360c;
        HashMap hashMap = new HashMap();
        hashMap.put("http://www.w3.org/1998/Math/MathML", new String[]{"math", "mi", "mo", "msup", "mn", "mtext"});
        hashMap.put("http://www.w3.org/2000/svg", new String[]{"svg", "text"});
        a(strArr, new F(0));
        a(strArr2, new F(1));
        a(new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new F(2));
        a(strArr3, new F(3));
        a(new String[]{"pre", "plaintext", "title", "textarea"}, new F(4));
        a(new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"}, new F(5));
        a(strArr4, new F(6));
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String[]) entry.getValue(), new a(1, entry));
        }
    }

    public G(String str, String str2) {
        this.f5085U = str;
        this.f5086V = b.a(str);
        this.f5087W = str2;
    }

    public static void a(String[] strArr, Consumer consumer) {
        for (String str : strArr) {
            HashMap hashMap = f5084e0;
            G g8 = (G) hashMap.get(str);
            if (g8 == null) {
                g8 = new G(str, "http://www.w3.org/1999/xhtml");
                hashMap.put(g8.f5085U, g8);
            }
            consumer.accept(g8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: T7.G} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static T7.G b(java.lang.String r3, java.lang.String r4, T7.E r5) {
        /*
            Q7.g.A(r3)
            Q7.g.D(r4)
            java.util.HashMap r0 = f5084e0
            java.lang.Object r1 = r0.get(r3)
            T7.G r1 = (T7.G) r1
            if (r1 == 0) goto L_0x0019
            java.lang.String r2 = r1.f5087W
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0019
            return r1
        L_0x0019:
            java.lang.String r3 = r5.b(r3)
            Q7.g.A(r3)
            java.lang.String r1 = R7.b.a(r3)
            java.lang.Object r0 = r0.get(r1)
            T7.G r0 = (T7.G) r0
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = r0.f5087W
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0050
            boolean r4 = r5.f5081a
            if (r4 == 0) goto L_0x004f
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L_0x004f
            java.lang.Object r4 = super.clone()     // Catch:{ CloneNotSupportedException -> 0x0048 }
            r0 = r4
            T7.G r0 = (T7.G) r0     // Catch:{ CloneNotSupportedException -> 0x0048 }
            r0.f5085U = r3
            goto L_0x004f
        L_0x0048:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L_0x004f:
            return r0
        L_0x0050:
            T7.G r5 = new T7.G
            r5.<init>(r3, r4)
            r3 = 0
            r5.f5088X = r3
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T7.G.b(java.lang.String, java.lang.String, T7.E):T7.G");
    }

    public final Object clone() {
        try {
            return (G) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f5085U.equals(g8.f5085U) && this.f5090Z == g8.f5090Z && this.f5089Y == g8.f5089Y && this.f5088X == g8.f5088X && this.f5092b0 == g8.f5092b0 && this.f5091a0 == g8.f5091a0 && this.f5093c0 == g8.f5093c0 && this.f5094d0 == g8.f5094d0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f5085U, Boolean.valueOf(this.f5088X), Boolean.valueOf(this.f5089Y), Boolean.valueOf(this.f5090Z), Boolean.valueOf(this.f5091a0), Boolean.valueOf(this.f5092b0), Boolean.valueOf(this.f5093c0), Boolean.valueOf(this.f5094d0)});
    }

    public final String toString() {
        return this.f5085U;
    }
}
