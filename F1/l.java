package f1;

import D2.o;
import F.h;
import H3.C0103u;
import H3.C0105w;
import H3.C0107y;
import H3.G;
import H3.L;
import H3.O;
import H3.P;
import H3.Q;
import H3.i0;
import Z1.c;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Q f11573a;

    static {
        new c(18).j();
    }

    public l(c cVar) {
        Q q7;
        C0107y yVar = (C0107y) ((P) cVar.f6955V).f2027U;
        if (yVar == null) {
            q7 = G.f2012Y;
        } else {
            Set entrySet = yVar.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                q7 = G.f2012Y;
            } else {
                C0105w wVar = (C0105w) entrySet;
                o oVar = new o(((C0107y) wVar.f2131V).size());
                Iterator it = wVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    i0 g8 = ((L) entry.getValue()).g();
                    oVar.n(key, g8);
                    i += g8.f2075X;
                }
                q7 = new Q(oVar.c(), i);
            }
        }
        this.f11573a = q7;
    }

    public static String b(String str) {
        if (h.n(str, "Accept")) {
            return "Accept";
        }
        if (h.n(str, "Allow")) {
            return "Allow";
        }
        if (h.n(str, "Authorization")) {
            return "Authorization";
        }
        if (h.n(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (h.n(str, "Blocksize")) {
            return "Blocksize";
        }
        if (h.n(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (h.n(str, "Connection")) {
            return "Connection";
        }
        if (h.n(str, "Content-Base")) {
            return "Content-Base";
        }
        if (h.n(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (h.n(str, "Content-Language")) {
            return "Content-Language";
        }
        if (h.n(str, "Content-Length")) {
            return "Content-Length";
        }
        if (h.n(str, "Content-Location")) {
            return "Content-Location";
        }
        if (h.n(str, "Content-Type")) {
            return "Content-Type";
        }
        if (h.n(str, "CSeq")) {
            return "CSeq";
        }
        if (h.n(str, "Date")) {
            return "Date";
        }
        if (h.n(str, "Expires")) {
            return "Expires";
        }
        if (h.n(str, "Location")) {
            return "Location";
        }
        if (h.n(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (h.n(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (h.n(str, "Public")) {
            return "Public";
        }
        if (h.n(str, "Range")) {
            return "Range";
        }
        if (h.n(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (h.n(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (h.n(str, "Scale")) {
            return "Scale";
        }
        if (h.n(str, "Session")) {
            return "Session";
        }
        if (h.n(str, "Speed")) {
            return "Speed";
        }
        if (h.n(str, "Supported")) {
            return "Supported";
        }
        if (h.n(str, "Timestamp")) {
            return "Timestamp";
        }
        if (h.n(str, "Transport")) {
            return "Transport";
        }
        if (h.n(str, "User-Agent")) {
            return "User-Agent";
        }
        if (h.n(str, "Via")) {
            return "Via";
        }
        if (h.n(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public final Q a() {
        return this.f11573a;
    }

    public final String c(String str) {
        O d8 = this.f11573a.d(b(str));
        if (d8.isEmpty()) {
            return null;
        }
        return (String) C0103u.l(d8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f11573a.equals(((l) obj).f11573a);
    }

    public final int hashCode() {
        return this.f11573a.hashCode();
    }
}
