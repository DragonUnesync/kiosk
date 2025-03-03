package h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import de.ozerov.fully.K2;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1516N;
import v0.C1551x;

/* renamed from: h.K  reason: case insensitive filesystem */
public final class C1010K extends C1516N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1012M f12127b;

    public /* synthetic */ C1010K(C1012M m8, int i) {
        this.f12126a = i;
        this.f12127b = m8;
    }

    public final void a() {
        View view;
        C1012M m8 = this.f12127b;
        switch (this.f12126a) {
            case 0:
                if (m8.f12146o && (view = m8.f12139g) != null) {
                    view.setTranslationY(0.0f);
                    m8.f12137d.setTranslationY(0.0f);
                }
                m8.f12137d.setVisibility(8);
                m8.f12137d.setTransitioning(false);
                m8.f12151t = null;
                K2 k22 = m8.f12142k;
                if (k22 != null) {
                    k22.J(m8.f12141j);
                    m8.f12141j = null;
                    m8.f12142k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m8.f12136c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1551x.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                m8.f12151t = null;
                m8.f12137d.requestLayout();
                return;
        }
    }
}
