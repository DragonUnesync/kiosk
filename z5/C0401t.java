package Z5;

import S5.C0185n;
import g6.n0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Z5.t  reason: case insensitive filesystem */
public final class C0401t extends C0390h implements t0 {
    private final L trailingHeaders;
    private final boolean validateHeaders;

    public C0401t(C0185n nVar) {
        this(nVar, true);
    }

    private void appendHeaders(StringBuilder sb) {
        Iterator<Map.Entry<String, String>> it = trailingHeaders().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            sb.append((String) next.getKey());
            sb.append(": ");
            sb.append((String) next.getValue());
            sb.append(n0.NEWLINE);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        String str = n0.NEWLINE;
        sb.append(str);
        appendHeaders(sb);
        sb.setLength(sb.length() - str.length());
        return sb.toString();
    }

    public L trailingHeaders() {
        return this.trailingHeaders;
    }

    public C0401t(C0185n nVar, boolean z) {
        super(nVar);
        this.trailingHeaders = new C0400s(z);
        this.validateHeaders = z;
    }

    public t0 touch(Object obj) {
        super.touch(obj);
        return this;
    }
}
