package S7;

public final class w extends o {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f4595Y;

    public w(String str, boolean z) {
        super(str);
        this.f4595Y = z;
    }

    public final Object clone() {
        return (w) super.clone();
    }

    public final p h() {
        return (w) super.clone();
    }

    public final String q() {
        return "#declaration";
    }

    public final void t(StringBuilder sb, int i, g gVar) {
        String str;
        Appendable append = sb.append("<");
        String str2 = "?";
        boolean z = this.f4595Y;
        if (z) {
            str = "!";
        } else {
            str = str2;
        }
        append.append(str).append(C());
        c e = e();
        e.getClass();
        b bVar = new b(e);
        while (bVar.hasNext()) {
            a aVar = (a) bVar.next();
            String str3 = aVar.f4539V;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = aVar.f4538U;
            if (!str4.equals("#declaration")) {
                sb.append(' ');
                sb.append(str4);
                if (!str3.isEmpty()) {
                    sb.append("=\"");
                    m.c(sb, str3, gVar, 2);
                    sb.append('\"');
                }
            }
        }
        if (z) {
            str2 = "!";
        }
        sb.append(str2).append(">");
    }

    public final String toString() {
        return s();
    }

    public final void u(StringBuilder sb, int i, g gVar) {
    }
}
