package g7;

import org.conscrypt.Conscrypt;

/* renamed from: g7.f  reason: case insensitive filesystem */
public abstract class C0998f {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() > 2) {
                return true;
            }
            return false;
        } else if (version.minor() != 1) {
            if (version.minor() > 1) {
                return true;
            }
            return false;
        } else if (version.patch() >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean b() {
        return h.f12033d;
    }
}
