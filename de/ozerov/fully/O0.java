package de.ozerov.fully;

import java.util.ArrayList;

public final /* synthetic */ class O0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10194U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U0 f10195V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f10196W;

    public /* synthetic */ O0(U0 u02, int i, int i8) {
        this.f10194U = i8;
        this.f10195V = u02;
        this.f10196W = i;
    }

    public final void run() {
        int i;
        switch (this.f10194U) {
            case 0:
                C0794w0.C0(this.f10195V.f10414a, this.f10196W);
                return;
            case 1:
                this.f10195V.f10414a.f9917F0.j(this.f10196W);
                return;
            default:
                i5 i5Var = this.f10195V.f10414a.f9917F0;
                ArrayList arrayList = i5Var.f10710c;
                if (!arrayList.isEmpty() && (i = this.f10196W) >= 0 && i < arrayList.size()) {
                    i5Var.e((g5) arrayList.get(i));
                    return;
                }
                return;
        }
    }
}
