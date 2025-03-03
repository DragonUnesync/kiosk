package de.ozerov.fully;

import U0.c;
import android.view.View;
import b3.C0528a;
import d3.g;

/* renamed from: de.ozerov.fully.g1  reason: case insensitive filesystem */
public final /* synthetic */ class C0700g1 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10641U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0718j1 f10642V;

    public /* synthetic */ C0700g1(C0718j1 j1Var, int i) {
        this.f10641U = i;
        this.f10642V = j1Var;
    }

    public final void onClick(View view) {
        switch (this.f10641U) {
            case 0:
                C0718j1 j1Var = this.f10642V;
                j1Var.getClass();
                C0805y yVar = new C0805y();
                yVar.f11111z1 = new C0706h1(j1Var);
                yVar.f11099A1 = new c(15);
                yVar.T(j1Var.f9850f1.l(), "AppPicker");
                return;
            case 1:
                C0718j1 j1Var2 = this.f10642V;
                j1Var2.getClass();
                C0786u4 u4Var = new C0786u4();
                u4Var.f9865o1 = "Add URL to launcher";
                u4Var.f9868r1 = "Cancel";
                u4Var.f9867q1 = "Ok";
                u4Var.Q();
                u4Var.f9863m1 = new c(14);
                u4Var.f9862l1 = new C0706h1(j1Var2);
                u4Var.T(j1Var2.f9850f1.l(), "URLdialog");
                return;
            default:
                C0718j1 j1Var3 = this.f10642V;
                j1Var3.getClass();
                C0528a aVar = new C0528a();
                aVar.f8653a = 1;
                aVar.f8655c = 0;
                g gVar = new g(j1Var3.f9850f1, aVar);
                gVar.setTitle("Add File Shortcuts to Launcher");
                gVar.f9739b0 = new C0706h1(j1Var3);
                gVar.f9749l0 = j1Var3.f8029a1.getWindow();
                gVar.show();
                return;
        }
    }
}
