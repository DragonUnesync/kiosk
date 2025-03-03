package de.ozerov.fully;

import Z1.c;
import android.os.Handler;
import d4.k;

public final /* synthetic */ class X3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10503U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Y3 f10504V;

    public /* synthetic */ X3(Y3 y32, int i) {
        this.f10503U = i;
        this.f10504V = y32;
    }

    public final void run() {
        C0800x0 x0Var;
        switch (this.f10503U) {
            case 0:
                Y3 y32 = this.f10504V;
                if (y32.i <= 0 || (y32.f10521j != -1 && System.currentTimeMillis() <= y32.f10521j + ((long) y32.i))) {
                    if (y32.f10514a.f10981v0 || C0794w0.f11032r || ((FullyActivity) y32.f10514a.f9919H0.f5257V).findViewById(2131362125).getVisibility() != 0 || y32.f10522k) {
                        if (System.currentTimeMillis() - y32.f10518f > ((long) y32.f10520h) * 180) {
                            y32.f10517d = 1;
                            y32.f10518f = System.currentTimeMillis();
                        } else {
                            y32.f10517d++;
                        }
                        if (y32.f10517d >= y32.f10520h && y32.f10514a.f9921J0.i() && (((y32.f10515b.g2().booleanValue() && !y32.f10515b.e2().isEmpty()) || y32.f10522k) && !y32.a())) {
                            Handler handler = y32.f10523l;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages((Object) null);
                            }
                            Handler handler2 = new Handler();
                            y32.f10523l = handler2;
                            handler2.postDelayed(new X3(y32, 1), 200);
                        }
                    }
                    if (y32.f10514a.f10981v0 || C0794w0.f11032r) {
                        if (C0794w0.f11017a && (x0Var = C0794w0.f11018b) != null) {
                            x0Var.f11063m++;
                        }
                        if (((c) y32.f10515b.f9767W).n("touchesOtherAppsBreakIdle", false) || (y32.f10515b.g2().booleanValue() && y32.f10515b.c0().booleanValue())) {
                            C0703g4 g4Var = y32.f10514a.f9945h1;
                            g4Var.getClass();
                            g4Var.f10653f = System.currentTimeMillis();
                            y32.f10514a.f9945h1.d();
                            C0703g4 g4Var2 = y32.f10514a.f9945h1;
                            g4Var2.f10652d.removeCallbacksAndMessages((Object) null);
                            k kVar = g4Var2.f10650b;
                            kVar.getClass();
                            try {
                                Integer.parseInt(((c) kVar.f9767W).r("rewindEachSeconds", "0"));
                            } catch (Exception unused) {
                            }
                            y32.f10514a.f9945h1.b();
                            y32.f10514a.f9943f1.b();
                            y32.f10514a.f9943f1.c();
                        }
                        y32.f10514a.f9945h1.c();
                        y32.f10514a.f9945h1.a();
                    }
                    if (y32.f10514a.f10981v0) {
                        y32.f10514a.f9943f1.g();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f10504V.f10514a.f9921J0.b();
                return;
        }
    }
}
