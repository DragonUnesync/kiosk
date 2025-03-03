package Y1;

import E2.a;
import M0.C;
import M0.F;
import M0.H;
import M0.K;
import M0.L;
import M0.M;
import M0.N;
import M0.O;
import M0.P;
import M0.Q;
import M0.c0;
import M0.e0;
import M0.h0;
import O0.c;
import P0.k;
import P0.u;
import P0.v;
import P0.z;
import T0.C0232y;
import T0.r;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.List;

/* renamed from: Y1.g  reason: case insensitive filesystem */
public final class C0374g implements O, View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ r f6435U;

    public C0374g(r rVar) {
        this.f6435U = rVar;
    }

    public final /* synthetic */ void A(boolean z) {
    }

    public final /* synthetic */ void B(int i, int i8) {
    }

    public final /* synthetic */ void C(F f8) {
    }

    public final /* synthetic */ void D(H h5) {
    }

    public final /* synthetic */ void E(h0 h0Var) {
    }

    public final /* synthetic */ void F(boolean z) {
    }

    public final /* synthetic */ void a(int i) {
    }

    public final /* synthetic */ void b(int i) {
    }

    public final /* synthetic */ void c(e0 e0Var) {
    }

    public final /* synthetic */ void d(c cVar) {
    }

    public final /* synthetic */ void e(K k8) {
    }

    public final /* synthetic */ void f(int i) {
    }

    public final /* synthetic */ void h(c0 c0Var) {
    }

    public final /* synthetic */ void i(boolean z) {
    }

    public final /* synthetic */ void j() {
    }

    public final /* synthetic */ void l(boolean z) {
    }

    public final /* synthetic */ void m(int i, P p3, P p8) {
    }

    public final /* synthetic */ void n(List list) {
    }

    public final /* synthetic */ void o(int i, boolean z) {
    }

    public final void onClick(View view) {
        int i;
        r rVar = this.f6435U;
        Q q7 = rVar.f6496d1;
        if (q7 != null) {
            w wVar = rVar.f6480U;
            wVar.g();
            if (rVar.f6509k0 == view) {
                a aVar = (a) q7;
                if (aVar.e(9)) {
                    aVar.l();
                }
            } else if (rVar.f6507j0 == view) {
                a aVar2 = (a) q7;
                if (aVar2.e(7)) {
                    aVar2.n();
                }
            } else if (rVar.f6513m0 == view) {
                if (((C0232y) q7).D() != 4) {
                    a aVar3 = (a) q7;
                    if (aVar3.e(12)) {
                        C0232y yVar = (C0232y) aVar3;
                        yVar.Y();
                        aVar3.m(12, yVar.f4961q0);
                    }
                }
            } else if (rVar.f6515n0 == view) {
                a aVar4 = (a) q7;
                if (aVar4.e(11)) {
                    C0232y yVar2 = (C0232y) aVar4;
                    yVar2.Y();
                    aVar4.m(11, -yVar2.p0);
                }
            } else if (rVar.f6511l0 == view) {
                if (z.Y(q7, rVar.f6506i1)) {
                    z.G(q7);
                    return;
                }
                a aVar5 = (a) q7;
                if (aVar5.e(1)) {
                    ((C0232y) aVar5).P(false);
                }
            } else if (rVar.f6520q0 == view) {
                if (((a) q7).e(15)) {
                    C0232y yVar3 = (C0232y) q7;
                    yVar3.Y();
                    int i8 = yVar3.f4912A0;
                    int i9 = rVar.f6516n1;
                    int i10 = 1;
                    while (true) {
                        if (i10 > 2) {
                            break;
                        }
                        i = (i8 + i10) % 3;
                        if (i == 0) {
                            break;
                        }
                        if (i != 1) {
                            if (i == 2 && (i9 & 2) != 0) {
                                break;
                            }
                        } else if ((i9 & 1) != 0) {
                            break;
                        }
                        i10++;
                    }
                    i8 = i;
                    yVar3.Q(i8);
                }
            } else if (rVar.f6522r0 != view) {
                View view2 = rVar.f6528w0;
                if (view2 == view) {
                    wVar.f();
                    rVar.d(rVar.f6493c0, view2);
                    return;
                }
                View view3 = rVar.f6529x0;
                if (view3 == view) {
                    wVar.f();
                    rVar.d(rVar.f6495d0, view3);
                    return;
                }
                View view4 = rVar.f6530y0;
                if (view4 == view) {
                    wVar.f();
                    rVar.d(rVar.f6499f0, view4);
                    return;
                }
                ImageView imageView = rVar.f6525t0;
                if (imageView == view) {
                    wVar.f();
                    rVar.d(rVar.f6497e0, imageView);
                }
            } else if (((a) q7).e(14)) {
                C0232y yVar4 = (C0232y) q7;
                yVar4.Y();
                boolean z = !yVar4.f4913B0;
                yVar4.Y();
                if (yVar4.f4913B0 != z) {
                    yVar4.f4913B0 = z;
                    v vVar = yVar4.f4951f0.f4646c0;
                    vVar.getClass();
                    u b8 = v.b();
                    b8.f3739a = vVar.f3741a.obtainMessage(12, z ? 1 : 0, 0);
                    b8.b();
                    r rVar2 = new r(z, 0);
                    k kVar = yVar4.f4952g0;
                    kVar.c(9, rVar2);
                    yVar4.U();
                    kVar.b();
                }
            }
        }
    }

    public final void onDismiss() {
        r rVar = this.f6435U;
        if (rVar.t1) {
            rVar.f6480U.g();
        }
    }

    public final /* synthetic */ void p(int i, boolean z) {
    }

    public final /* synthetic */ void q(C c8, int i) {
    }

    public final void t(N n4) {
        boolean a8 = n4.a(4, 5, 13);
        r rVar = this.f6435U;
        if (a8) {
            rVar.m();
        }
        if (n4.a(4, 5, 7, 13)) {
            rVar.o();
        }
        if (n4.a(8, 13)) {
            rVar.p();
        }
        if (n4.a(9, 13)) {
            rVar.r();
        }
        if (n4.a(8, 9, 11, 0, 16, 17, 13)) {
            rVar.l();
        }
        if (n4.a(11, 0, 13)) {
            rVar.s();
        }
        if (n4.a(12, 13)) {
            rVar.n();
        }
        if (n4.a(2, 13)) {
            rVar.t();
        }
    }

    public final /* synthetic */ void v(K k8) {
    }

    public final /* synthetic */ void w(int i) {
    }

    public final /* synthetic */ void y(M m8) {
    }

    public final /* synthetic */ void z(L l8) {
    }
}
