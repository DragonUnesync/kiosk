package de.ozerov.fully;

import Q5.j;
import android.webkit.WebStorage;

/* renamed from: de.ozerov.fully.a0  reason: case insensitive filesystem */
public final /* synthetic */ class C0663a0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10542U;

    public /* synthetic */ C0663a0(int i) {
        this.f10542U = i;
    }

    private final void a() {
    }

    public final void run() {
        switch (this.f10542U) {
            case 0:
                C0794w0.f11024j = C0794w0.z(true);
                C0794w0.f11025k = C0794w0.z(false);
                return;
            case 1:
                WebStorage.getInstance().deleteAllData();
                return;
            case 2:
                int i = 1 / 0;
                return;
            case 3:
                int i8 = 1 / 0;
                return;
            case 4:
                try {
                    P.f10240j = j.a();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                return;
        }
    }
}
