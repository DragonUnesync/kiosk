package de.ozerov.fully;

import U0.c;
import android.view.View;
import b3.C0528a;
import d3.g;
import java.io.File;

public final /* synthetic */ class S2 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10326U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ V2 f10327V;

    public /* synthetic */ S2(V2 v22, int i) {
        this.f10326U = i;
        this.f10327V = v22;
    }

    public final void onClick(View view) {
        V2 v22 = this.f10327V;
        int i = this.f10326U;
        v22.getClass();
        switch (i) {
            case 0:
                C0528a aVar = new C0528a();
                aVar.f8653a = 0;
                aVar.f8655c = 1;
                g gVar = new g(v22.f9850f1, aVar);
                gVar.setTitle("Add Folder to Playlist");
                gVar.f9739b0 = new T2(v22, 2);
                gVar.f9749l0 = v22.f8029a1.getWindow();
                gVar.show();
                return;
            case 1:
                C0528a aVar2 = new C0528a();
                aVar2.f8653a = 1;
                aVar2.f8655c = 0;
                aVar2.e = new File("/mnt");
                aVar2.f8656d = new File("/sdcard");
                aVar2.f8657f = new File("/sdcard");
                aVar2.f8658g = null;
                aVar2.f8654b = true;
                g gVar2 = new g(v22.f9850f1, aVar2);
                gVar2.setTitle("Add Files to Playlist");
                gVar2.f9739b0 = new T2(v22, 1);
                gVar2.f9749l0 = v22.f8029a1.getWindow();
                gVar2.show();
                return;
            case 2:
                C0786u4 u4Var = new C0786u4();
                u4Var.f9865o1 = "Add URL to Playlist";
                u4Var.f9868r1 = "Cancel";
                u4Var.f9867q1 = "Ok";
                u4Var.Q();
                u4Var.f9863m1 = new c(16);
                u4Var.f9862l1 = new T2(v22, 0);
                u4Var.T(v22.f9850f1.l(), "URLdialog");
                return;
            default:
                C0786u4 u4Var2 = new C0786u4();
                u4Var2.f9865o1 = "Add YouTube Video/Playlist URL";
                u4Var2.f9868r1 = "Cancel";
                u4Var2.f9867q1 = "Ok";
                u4Var2.Q();
                u4Var2.f9863m1 = new c(16);
                u4Var2.f9862l1 = new T2(v22, 3);
                u4Var2.T(v22.f9850f1.l(), "URLdialog");
                return;
        }
    }
}
