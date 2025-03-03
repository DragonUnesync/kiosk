package de.ozerov.fully;

import android.view.View;
import android.widget.EditText;
import b3.C0528a;
import d3.g;
import java.io.File;

/* renamed from: de.ozerov.fully.d1  reason: case insensitive filesystem */
public final /* synthetic */ class C0682d1 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10595U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0694f1 f10596V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ EditText f10597W;

    public /* synthetic */ C0682d1(C0694f1 f1Var, EditText editText, int i) {
        this.f10595U = i;
        this.f10596V = f1Var;
        this.f10597W = editText;
    }

    public final void onClick(View view) {
        switch (this.f10595U) {
            case 0:
                C0694f1 f1Var = this.f10596V;
                f1Var.getClass();
                C0528a aVar = new C0528a();
                aVar.f8653a = 0;
                aVar.f8655c = 0;
                g gVar = new g(f1Var.f9850f1, aVar);
                gVar.setTitle("Pick a file");
                gVar.f9739b0 = new C0688e1(f1Var, this.f10597W, 1);
                gVar.f9749l0 = f1Var.w1.getWindow();
                gVar.show();
                return;
            default:
                C0694f1 f1Var2 = this.f10596V;
                f1Var2.getClass();
                C0528a aVar2 = new C0528a();
                aVar2.f8653a = 0;
                aVar2.f8655c = 0;
                aVar2.e = new File("/mnt");
                aVar2.f8656d = new File("/sdcard");
                aVar2.f8657f = new File("/sdcard");
                aVar2.f8658g = null;
                aVar2.f8654b = true;
                g gVar2 = new g(f1Var2.f9850f1, aVar2);
                gVar2.setTitle("Pick a file");
                gVar2.f9739b0 = new C0688e1(f1Var2, this.f10597W, 0);
                gVar2.f9749l0 = f1Var2.w1.getWindow();
                gVar2.show();
                return;
        }
    }
}
