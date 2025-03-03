package de.ozerov.fully;

import Z1.c;
import android.content.Intent;
import android.util.Log;
import n2.a;

/* renamed from: de.ozerov.fully.v3  reason: case insensitive filesystem */
public final class C0791v3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f11012U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0797w3 f11013V;

    public /* synthetic */ C0791v3(C0797w3 w3Var, int i) {
        this.f11012U = i;
        this.f11013V = w3Var;
    }

    public final void run() {
        C0740n nVar;
        C0740n nVar2;
        boolean z = true;
        switch (this.f11012U) {
            case 0:
                if (!this.f11013V.f11042a.y("preferences") && !this.f11013V.f11042a.y("playlistItemSelector") && !this.f11013V.f11042a.y("launcherItemSelector") && !this.f11013V.f11042a.y("scheduleItemSelector") && (!this.f11013V.f11042a.y("single_app_manager") || !this.f11013V.f11042a.f10980u0)) {
                    C0797w3 w3Var = this.f11013V;
                    if (!w3Var.f11044c && !w3Var.f11042a.f9916E0.b()) {
                        C0797w3 w3Var2 = this.f11013V;
                        O o2 = w3Var2.f11042a.f9920I0;
                        if (!o2.f10190v && !o2.f10193y && ((!C0794w0.f11032r || !w3Var2.f11043b.W().booleanValue()) && ((!C0794w0.d0(this.f11013V.f11042a) || !this.f11013V.f11043b.V().booleanValue()) && ((this.f11013V.f11042a.f10980u0 || !((c) this.f11013V.f11043b.f9767W).n("inUseWhileAnotherAppInForeground", false)) && ((!this.f11013V.f11042a.f9917F0.m() || !((c) this.f11013V.f11043b.f9767W).n("keepOnWhileFullscreen", true)) && (((nVar = this.f11013V.f11042a.f9928Q0.f10445c) == null || !nVar.l()) && !this.f11013V.f11046f)))))) {
                            if (C0794w0.f11017a && C0794w0.f11018b != null) {
                                C0794w0.a();
                                C0794w0.f11018b.f11058g++;
                            }
                            if (this.f11013V.f11043b.V1().startsWith("daydream:") || ((c) this.f11013V.f11043b.f9767W).n("screensaverDaydream", false)) {
                                this.f11013V.d();
                            } else if (!this.f11013V.f11043b.T1().booleanValue()) {
                                this.f11013V.e();
                            } else if (!this.f11013V.f11043b.U1().isEmpty()) {
                                try {
                                    Intent P02 = a.P0(this.f11013V.f11043b.U1());
                                    P02.addFlags(805306368);
                                    this.f11013V.f11042a.startActivity(P02);
                                } catch (Exception unused) {
                                    a.b1(this.f11013V.f11042a, "Can't start screensaver app for intent URL");
                                    Log.e("w3", "Can't start app for " + this.f11013V.f11043b.U1());
                                }
                            }
                        }
                    }
                }
                this.f11013V.c();
                return;
            default:
                if (!this.f11013V.f11042a.y("preferences") && !this.f11013V.f11042a.y("playlistItemSelector") && !this.f11013V.f11042a.y("launcherItemSelector") && !this.f11013V.f11042a.y("scheduleItemSelector") && ((!this.f11013V.f11042a.y("single_app_manager") || !this.f11013V.f11042a.f10980u0) && !this.f11013V.f11042a.f9916E0.b())) {
                    C0797w3 w3Var3 = this.f11013V;
                    O o8 = w3Var3.f11042a.f9920I0;
                    if (!o8.f10190v && !o8.f10193y && ((!C0794w0.f11032r || !w3Var3.f11043b.W().booleanValue()) && ((!C0794w0.d0(this.f11013V.f11042a) || !this.f11013V.f11043b.V().booleanValue()) && ((this.f11013V.f11042a.f10980u0 || !((c) this.f11013V.f11043b.f9767W).n("inUseWhileAnotherAppInForeground", false)) && ((!this.f11013V.f11042a.f9917F0.m() || !((c) this.f11013V.f11043b.f9767W).n("keepOnWhileFullscreen", true)) && ((nVar2 = this.f11013V.f11042a.f9928Q0.f10445c) == null || !nVar2.l())))))) {
                        C0797w3 w3Var4 = this.f11013V;
                        FullyActivity fullyActivity = w3Var4.f11042a;
                        if (!w3Var4.f11043b.J1().booleanValue() && !this.f11013V.f11043b.s1().booleanValue() && !this.f11013V.f11043b.t1().booleanValue() && !this.f11013V.f11043b.y1().booleanValue() && !this.f11013V.f11043b.E1().booleanValue()) {
                            z = false;
                        }
                        C0794w0.J0(fullyActivity, z);
                    }
                }
                this.f11013V.b();
                return;
        }
    }
}
