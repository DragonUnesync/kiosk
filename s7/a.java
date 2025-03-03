package S7;

import Q7.g;
import R7.b;
import R7.h;
import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public final class a implements Map.Entry, Cloneable {

    /* renamed from: X  reason: collision with root package name */
    public static final String[] f4535X = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f4536Y = Pattern.compile("[^-a-zA-Z0-9_:.]+");

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f4537Z = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: U  reason: collision with root package name */
    public final String f4538U;

    /* renamed from: V  reason: collision with root package name */
    public String f4539V;

    /* renamed from: W  reason: collision with root package name */
    public c f4540W;

    public a(String str, String str2, c cVar) {
        g.D(str);
        String trim = str.trim();
        g.A(trim);
        this.f4538U = trim;
        this.f4539V = str2;
        this.f4540W = cVar;
    }

    public static String a(int i, String str) {
        if (i == 2 && !d(str)) {
            String replaceAll = f4536Y.matcher(str).replaceAll("_");
            if (d(replaceAll)) {
                return replaceAll;
            }
            return null;
        } else if (i != 1 || c(str)) {
            return str;
        } else {
            String replaceAll2 = f4537Z.matcher(str).replaceAll("_");
            if (c(replaceAll2)) {
                return replaceAll2;
            }
            return null;
        }
    }

    public static void b(String str, String str2, Appendable appendable, g gVar) {
        appendable.append(str);
        if (gVar.f4552Z == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f4535X, b.a(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        m.c(appendable, str2, gVar, 2);
        appendable.append('\"');
    }

    public static boolean c(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || ((charAt >= 127 && charAt <= 159) || charAt == ' ' || charAt == '\"' || charAt == '\'' || charAt == '/' || charAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_' && charAt != ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '-' && charAt2 != '_' && charAt2 != ':' && charAt2 != '.'))) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!Objects.equals(this.f4538U, aVar.f4538U) || !Objects.equals(this.f4539V, aVar.f4539V)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f4538U;
    }

    public final Object getValue() {
        String str = this.f4539V;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4538U, this.f4539V});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r4.f4538U;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setValue(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = r4.f4539V
            S7.c r1 = r4.f4540W
            if (r1 == 0) goto L_0x001d
            java.lang.String r2 = r4.f4538U
            int r1 = r1.k(r2)
            r3 = -1
            if (r1 == r3) goto L_0x001d
            S7.c r0 = r4.f4540W
            java.lang.String r0 = r0.g(r2)
            S7.c r2 = r4.f4540W
            java.lang.Object[] r2 = r2.f4546W
            r2[r1] = r5
        L_0x001d:
            r4.f4539V = r5
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = ""
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S7.a.setValue(java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        StringBuilder b8 = h.b();
        try {
            g gVar = new h().f4553d0;
            String str = this.f4539V;
            String a8 = a(gVar.f4552Z, this.f4538U);
            if (a8 != null) {
                b(a8, str, b8, gVar);
            }
            return h.h(b8);
        } catch (IOException e) {
            throw new C6.b((Throwable) e, 3);
        }
    }
}
