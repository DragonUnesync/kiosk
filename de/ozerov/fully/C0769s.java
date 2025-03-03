package de.ozerov.fully;

import android.view.View;
import android.widget.ListView;
import n2.a;

/* renamed from: de.ozerov.fully.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0769s implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10935U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f10936V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ ListView f10937W;

    public /* synthetic */ C0769s(int i, ListView listView, int i8) {
        this.f10935U = i8;
        this.f10936V = i;
        this.f10937W = listView;
    }

    public final void run() {
        int i = this.f10936V;
        ListView listView = this.f10937W;
        switch (this.f10935U) {
            case 0:
                View P8 = a.P(i, listView);
                if (P8 != null) {
                    a.e(P8);
                    return;
                }
                return;
            default:
                int i8 = C0695f2.f10625d0;
                View P9 = a.P(i, listView);
                if (P9 != null) {
                    a.e(P9);
                    return;
                }
                return;
        }
    }
}
