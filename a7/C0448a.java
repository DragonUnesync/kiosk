package a7;

import Y6.t;
import Y6.u;
import Y6.v;

/* renamed from: a7.a  reason: case insensitive filesystem */
public final class C0448a {
    public static final u a(u uVar) {
        v vVar;
        if (uVar != null) {
            vVar = uVar.f6745a0;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return uVar;
        }
        t k8 = uVar.k();
        k8.f6733g = null;
        return k8.a();
    }

    public static boolean b(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }
}
