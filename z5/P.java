package Z5;

import g6.n0;
import java.util.Iterator;
import java.util.Map;

public abstract class P {
    private static void appendCommon(StringBuilder sb, N n4) {
        sb.append(n0.simpleClassName((Object) n4));
        sb.append("(decodeResult: ");
        sb.append(n4.decoderResult());
        sb.append(", version: ");
        sb.append(n4.protocolVersion());
        sb.append(')');
        sb.append(n0.NEWLINE);
    }

    private static void appendFullCommon(StringBuilder sb, C0404w wVar) {
        sb.append(n0.simpleClassName((Object) wVar));
        sb.append("(decodeResult: ");
        sb.append(wVar.decoderResult());
        sb.append(", version: ");
        sb.append(wVar.protocolVersion());
        sb.append(", content: ");
        sb.append(wVar.content());
        sb.append(')');
        sb.append(n0.NEWLINE);
    }

    public static StringBuilder appendFullRequest(StringBuilder sb, C0405x xVar) {
        appendFullCommon(sb, xVar);
        appendInitialLine(sb, (i0) xVar);
        appendHeaders(sb, xVar.headers());
        appendHeaders(sb, xVar.trailingHeaders());
        removeLastNewLine(sb);
        return sb;
    }

    public static StringBuilder appendFullResponse(StringBuilder sb, C0406y yVar) {
        appendFullCommon(sb, yVar);
        appendInitialLine(sb, (k0) yVar);
        appendHeaders(sb, yVar.headers());
        appendHeaders(sb, yVar.trailingHeaders());
        removeLastNewLine(sb);
        return sb;
    }

    private static void appendHeaders(StringBuilder sb, L l8) {
        Iterator<Map.Entry<String, String>> it = l8.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            sb.append((String) next.getKey());
            sb.append(": ");
            sb.append((String) next.getValue());
            sb.append(n0.NEWLINE);
        }
    }

    private static void appendInitialLine(StringBuilder sb, i0 i0Var) {
        sb.append(i0Var.method());
        sb.append(' ');
        sb.append(i0Var.uri());
        sb.append(' ');
        sb.append(i0Var.protocolVersion());
        sb.append(n0.NEWLINE);
    }

    public static StringBuilder appendResponse(StringBuilder sb, k0 k0Var) {
        appendCommon(sb, k0Var);
        appendInitialLine(sb, k0Var);
        appendHeaders(sb, k0Var.headers());
        removeLastNewLine(sb);
        return sb;
    }

    private static void removeLastNewLine(StringBuilder sb) {
        sb.setLength(sb.length() - n0.NEWLINE.length());
    }

    private static void appendInitialLine(StringBuilder sb, k0 k0Var) {
        sb.append(k0Var.protocolVersion());
        sb.append(' ');
        sb.append(k0Var.status());
        sb.append(n0.NEWLINE);
    }
}
