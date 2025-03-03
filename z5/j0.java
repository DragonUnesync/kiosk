package Z5;

import S5.C0185n;
import S5.C0206y;
import e6.C0852k;

public abstract class j0 extends h0 {
    public boolean acceptOutboundMessage(Object obj) {
        if (!super.acceptOutboundMessage(obj) || (obj instanceof k0)) {
            return false;
        }
        return true;
    }

    public void encodeInitialLine(C0185n nVar, i0 i0Var) {
        C0206y.copy(i0Var.method().asciiName(), nVar);
        String uri = i0Var.uri();
        if (uri.isEmpty()) {
            C0206y.writeMediumBE(nVar, 2109216);
        } else {
            int indexOf = uri.indexOf("://");
            boolean z = false;
            CharSequence charSequence = uri;
            if (indexOf != -1) {
                char charAt = uri.charAt(0);
                charSequence = uri;
                if (charAt != '/') {
                    int i = indexOf + 3;
                    int indexOf2 = uri.indexOf(63, i);
                    if (indexOf2 == -1) {
                        int lastIndexOf = uri.lastIndexOf(47);
                        charSequence = uri;
                        if (lastIndexOf < i) {
                            z = true;
                            charSequence = uri;
                        }
                    } else {
                        int lastIndexOf2 = uri.lastIndexOf(47, indexOf2);
                        charSequence = uri;
                        if (lastIndexOf2 < i) {
                            charSequence = new StringBuilder(uri).insert(indexOf2, '/');
                        }
                    }
                }
            }
            nVar.writeByte(32).writeCharSequence(charSequence, C0852k.UTF_8);
            if (z) {
                C0206y.writeShortBE(nVar, 12064);
            } else {
                nVar.writeByte(32);
            }
        }
        i0Var.protocolVersion().encode(nVar);
        C0206y.writeShortBE(nVar, 3338);
    }
}
