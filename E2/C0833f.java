package e2;

import Z1.c;
import android.view.animation.Animation;
import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import de.ozerov.fully.Z4;
import de.ozerov.fully.g5;

/* renamed from: e2.f  reason: case insensitive filesystem */
public final class C0833f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f11198b;

    public /* synthetic */ C0833f(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f11197a = i;
        this.f11198b = swipeRefreshLayout;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        C0836i iVar;
        SwipeRefreshLayout swipeRefreshLayout = this.f11198b;
        switch (this.f11197a) {
            case 0:
                if (swipeRefreshLayout.f8573W) {
                    swipeRefreshLayout.f8595w0.setAlpha(255);
                    swipeRefreshLayout.f8595w0.start();
                    if (swipeRefreshLayout.f8565B0 && (iVar = swipeRefreshLayout.f8572V) != null) {
                        g5 g5Var = ((Z4) iVar).f10539a;
                        g5Var.getClass();
                        WebView.clearClientCertPreferences((Runnable) null);
                        if (g5Var.f10664g.f10125e0 == null) {
                            String str = g5Var.f10675s;
                            if (str != null) {
                                g5Var.g(str);
                            }
                        } else if (((c) g5Var.f10677u.f9767W).n("resendFormData", false)) {
                            g5Var.f10664g.reload();
                        } else {
                            g5Var.g(g5Var.f10664g.f10125e0);
                        }
                    }
                    swipeRefreshLayout.f8584k0 = swipeRefreshLayout.f8589q0.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                swipeRefreshLayout.getClass();
                C0834g gVar = new C0834g(swipeRefreshLayout, 1);
                swipeRefreshLayout.f8597y0 = gVar;
                gVar.setDuration(150);
                C0828a aVar = swipeRefreshLayout.f8589q0;
                aVar.f11163U = null;
                aVar.clearAnimation();
                swipeRefreshLayout.f8589q0.startAnimation(swipeRefreshLayout.f8597y0);
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i = this.f11197a;
    }

    public final void onAnimationStart(Animation animation) {
        int i = this.f11197a;
    }
}
