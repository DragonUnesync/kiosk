package S7;

import Q7.g;
import R7.h;

public final class i extends o {
    public i(String str, String str2, String str3) {
        super(str);
        g.D(str2);
        g.D(str3);
        d("#doctype", str);
        d("publicId", str2);
        d("systemId", str3);
        if (E("publicId")) {
            d("pubSysKey", "PUBLIC");
        } else if (E("systemId")) {
            d("pubSysKey", "SYSTEM");
        }
    }

    public final boolean E(String str) {
        return !h.e(c(str));
    }

    public final String q() {
        return "#doctype";
    }

    public final void t(StringBuilder sb, int i, g gVar) {
        if (this.f4579V > 0 && gVar.f4549W) {
            sb.append(10);
        }
        if (gVar.f4552Z != 1 || E("publicId") || E("systemId")) {
            sb.append("<!DOCTYPE");
        } else {
            sb.append("<!doctype");
        }
        if (E("#doctype")) {
            sb.append(" ").append(c("#doctype"));
        }
        if (E("pubSysKey")) {
            sb.append(" ").append(c("pubSysKey"));
        }
        if (E("publicId")) {
            sb.append(" \"").append(c("publicId")).append('\"');
        }
        if (E("systemId")) {
            sb.append(" \"").append(c("systemId")).append('\"');
        }
        sb.append('>');
    }

    public final void u(StringBuilder sb, int i, g gVar) {
    }
}
