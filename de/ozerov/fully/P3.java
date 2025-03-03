package de.ozerov.fully;

import android.os.Handler;

public final class P3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ boolean f10253U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Handler f10254V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ boolean f10255W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Q3 f10256X;

    public P3(Q3 q32, boolean z, Handler handler, boolean z6) {
        this.f10256X = q32;
        this.f10253U = z;
        this.f10254V = handler;
        this.f10255W = z6;
    }

    public final void run() {
        if (this.f10256X.f10298c) {
            if (this.f10253U) {
                this.f10256X.f10297b.startTone(93);
                this.f10254V.postDelayed(this, 1000);
                return;
            }
            if (this.f10255W) {
                this.f10256X.b();
            }
            this.f10256X.f10298c = false;
            this.f10256X.f10299d = null;
        }
    }
}
