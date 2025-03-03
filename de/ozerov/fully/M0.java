package de.ozerov.fully;

import androidx.camera.lifecycle.c;

public final /* synthetic */ class M0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10088U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U0 f10089V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f10090W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ String f10091X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f10092Y;

    public /* synthetic */ M0(U0 u02, String str, String str2, boolean z, int i) {
        this.f10088U = i;
        this.f10089V = u02;
        this.f10090W = str;
        this.f10091X = str2;
        this.f10092Y = z;
    }

    public final void run() {
        switch (this.f10088U) {
            case 0:
                U0 u02 = this.f10089V;
                u02.getClass();
                c cVar = new c(4, u02);
                u02.b(this.f10090W, this.f10091X, cVar, this.f10092Y);
                return;
            default:
                this.f10089V.b(this.f10090W, this.f10091X, (c) null, this.f10092Y);
                return;
        }
    }
}
