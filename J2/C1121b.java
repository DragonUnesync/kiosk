package j2;

import N7.a;
import android.webkit.WebSettings;
import k2.C1145b;
import k2.C1150g;
import k2.C1156m;
import k2.C1157n;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: j2.b  reason: case insensitive filesystem */
public abstract class C1121b {
    public static void a(WebSettings webSettings, int i) {
        C1145b bVar = C1156m.f13022b;
        if (bVar.a()) {
            C1150g.d(webSettings, i);
        } else if (bVar.b()) {
            ((WebSettingsBoundaryInterface) a.c(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) C1157n.f13023a.f13026V).convertSettings(webSettings))).setForceDark(i);
        } else {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }
}
