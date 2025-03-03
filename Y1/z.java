package Y1;

import A4.d;
import E2.a;
import H3.P;
import M0.C;
import M0.F;
import M0.H;
import M0.K;
import M0.L;
import M0.M;
import M0.N;
import M0.O;
import M0.Q;
import M0.V;
import M0.X;
import M0.c0;
import M0.e0;
import O0.c;
import T0.C0232y;
import U.p;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.List;

public final class z implements O, View.OnClickListener, q, C0375h {

    /* renamed from: U  reason: collision with root package name */
    public final V f6568U = new V();

    /* renamed from: V  reason: collision with root package name */
    public Object f6569V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ PlayerView f6570W;

    public z(PlayerView playerView) {
        this.f6570W = playerView;
    }

    public final /* synthetic */ void A(boolean z) {
    }

    public final void B(int i, int i8) {
        if (P0.z.f3748a == 34) {
            PlayerView playerView = this.f6570W;
            if ((playerView.f8216a0 instanceof SurfaceView) && playerView.f8212C0) {
                P p3 = playerView.f8218c0;
                p3.getClass();
                playerView.f8227l0.post(new d(p3, (SurfaceView) playerView.f8216a0, new p(5, (Object) playerView), 8));
            }
        }
    }

    public final /* synthetic */ void C(F f8) {
    }

    public final /* synthetic */ void D(H h5) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r2.f6570W;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(M0.h0 r3) {
        /*
            r2 = this;
            M0.h0 r0 = M0.h0.f2952d
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x001b
            androidx.media3.ui.PlayerView r3 = r2.f6570W
            M0.Q r0 = r3.p0
            if (r0 == 0) goto L_0x001b
            T0.y r0 = (T0.C0232y) r0
            int r0 = r0.D()
            r1 = 1
            if (r0 != r1) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r3.k()
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.z.E(M0.h0):void");
    }

    public final /* synthetic */ void F(boolean z) {
    }

    public final /* synthetic */ void a(int i) {
    }

    public final /* synthetic */ void b(int i) {
    }

    public final void c(e0 e0Var) {
        X x8;
        PlayerView playerView = this.f6570W;
        Q q7 = playerView.p0;
        q7.getClass();
        a aVar = (a) q7;
        if (aVar.e(17)) {
            x8 = ((C0232y) q7).z();
        } else {
            x8 = X.f2884a;
        }
        if (x8.p()) {
            this.f6569V = null;
        } else {
            boolean e = aVar.e(30);
            V v4 = this.f6568U;
            if (e) {
                C0232y yVar = (C0232y) q7;
                if (!yVar.A().f2941a.isEmpty()) {
                    this.f6569V = x8.f(yVar.w(), v4, true).f2863b;
                }
            }
            Object obj = this.f6569V;
            if (obj != null) {
                int b8 = x8.b(obj);
                if (b8 == -1 || ((C0232y) q7).v() != x8.f(b8, v4, false).f2864c) {
                    this.f6569V = null;
                } else {
                    return;
                }
            }
        }
        playerView.o(false);
    }

    public final void d(c cVar) {
        SubtitleView subtitleView = this.f6570W.f8221f0;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f3544a);
        }
    }

    public final /* synthetic */ void e(K k8) {
    }

    public final /* synthetic */ void f(int i) {
    }

    public final /* synthetic */ void h(c0 c0Var) {
    }

    public final /* synthetic */ void i(boolean z) {
    }

    public final void j() {
        PlayerView playerView = this.f6570W;
        View view = playerView.f8215W;
        if (view != null) {
            view.setVisibility(4);
            if (playerView.b()) {
                ImageView imageView = playerView.f8219d0;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            playerView.d();
        }
    }

    public final /* synthetic */ void l(boolean z) {
    }

    public final void m(int i, M0.P p3, M0.P p8) {
        r rVar;
        int i8 = PlayerView.f8209D0;
        PlayerView playerView = this.f6570W;
        if (playerView.e() && playerView.f8210A0 && (rVar = playerView.f8224i0) != null) {
            rVar.f();
        }
    }

    public final /* synthetic */ void n(List list) {
    }

    public final /* synthetic */ void o(int i, boolean z) {
    }

    public final void onClick(View view) {
        int i = PlayerView.f8209D0;
        this.f6570W.j();
    }

    public final void p(int i, boolean z) {
        int i8 = PlayerView.f8209D0;
        PlayerView playerView = this.f6570W;
        playerView.l();
        if (!playerView.e() || !playerView.f8210A0) {
            playerView.f(false);
            return;
        }
        r rVar = playerView.f8224i0;
        if (rVar != null) {
            rVar.f();
        }
    }

    public final /* synthetic */ void q(C c8, int i) {
    }

    public final /* synthetic */ void t(N n4) {
    }

    public final /* synthetic */ void v(K k8) {
    }

    public final void w(int i) {
        int i8 = PlayerView.f8209D0;
        PlayerView playerView = this.f6570W;
        playerView.l();
        playerView.n();
        if (!playerView.e() || !playerView.f8210A0) {
            playerView.f(false);
            return;
        }
        r rVar = playerView.f8224i0;
        if (rVar != null) {
            rVar.f();
        }
    }

    public final /* synthetic */ void y(M m8) {
    }

    public final /* synthetic */ void z(L l8) {
    }
}
