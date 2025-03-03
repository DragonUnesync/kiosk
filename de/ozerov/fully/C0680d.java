package de.ozerov.fully;

import U.d;

/* renamed from: de.ozerov.fully.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0680d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10589U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ d f10590V;

    public /* synthetic */ C0680d(d dVar, int i) {
        this.f10589U = i;
        this.f10590V = dVar;
    }

    public final void run() {
        switch (this.f10589U) {
            case 0:
                this.f10590V.b();
                return;
            case 1:
                d dVar = this.f10590V;
                dVar.f5261Z = null;
                if (C0794w0.h0((FullyActivity) dVar.f5257V)) {
                    dVar.i();
                    return;
                }
                return;
            default:
                this.f10590V.g();
                return;
        }
    }
}
