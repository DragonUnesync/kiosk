package d1;

import A1.c;
import C1.a;
import D1.h;
import M0.r;
import Q7.g;
import u.C1477r;

/* renamed from: d1.a  reason: case insensitive filesystem */
public final class C0630a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0630a f9707a = new Object();

    public final g a(r rVar) {
        String str = rVar.f3036n;
        if (str != null) {
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    return new c(1);
                case 1:
                    return new a();
                case 2:
                    return new h((B7.g) null);
                case 3:
                    return new c(0);
                case 4:
                    return new F1.c();
            }
        }
        throw new IllegalArgumentException(C1477r.d("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(r rVar) {
        String str = rVar.f3036n;
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return true;
        }
        return false;
    }
}
