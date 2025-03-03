package de.ozerov.fully;

import V0.r;
import f5.C0907e;
import m4.C1214b;

/* renamed from: de.ozerov.fully.r4  reason: case insensitive filesystem */
public final /* synthetic */ class C0768r4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10929U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ long f10930V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f10931W;

    public /* synthetic */ C0768r4(Object obj, long j7, int i) {
        this.f10929U = i;
        this.f10931W = obj;
        this.f10930V = j7;
    }

    public final void run() {
        switch (this.f10929U) {
            case 0:
                ((r) this.f10931W).c(this.f10930V);
                return;
            default:
                C1214b bVar = (C1214b) this.f10931W;
                long j7 = this.f10930V;
                synchronized (bVar.f13363j) {
                    try {
                        if (j7 == bVar.i) {
                            bVar.f13361g = null;
                            C0907e eVar = C0907e.f11689d;
                            bVar.f13357b.getClass();
                            eVar.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
