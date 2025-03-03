package k2;

import G5.s;
import j2.C1122c;

/* renamed from: k2.l  reason: case insensitive filesystem */
public final class C1155l extends C1145b {
    public final boolean b() {
        if (!super.b() || !s.t("MULTI_PROCESS")) {
            return false;
        }
        int i = C1122c.f12864a;
        if (C1156m.f13021a.b()) {
            return C1158o.f13024a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
