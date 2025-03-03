package S7;

public final class f extends o {
    public final Object clone() {
        return (f) super.clone();
    }

    public final p h() {
        return (f) super.clone();
    }

    public final String q() {
        return "#data";
    }

    public final void t(StringBuilder sb, int i, g gVar) {
        String C8 = C();
        if (gVar.f4552Z != 2 || C8.contains("<![CDATA[")) {
            sb.append(C());
            return;
        }
        p pVar = this.f4578U;
        if (pVar == null || !pVar.r().equals("script")) {
            p pVar2 = this.f4578U;
            if (pVar2 == null || !pVar2.r().equals("style")) {
                sb.append("<![CDATA[").append(C8).append("]]>");
            } else {
                sb.append("/*<![CDATA[*/\n").append(C8).append("\n/*]]>*/");
            }
        } else {
            sb.append("//<![CDATA[\n").append(C8).append("\n//]]>");
        }
    }

    public final void u(StringBuilder sb, int i, g gVar) {
    }
}
