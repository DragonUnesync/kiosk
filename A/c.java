package A;

import G.i;
import a0.j;
import com.bumptech.glide.d;
import u.C1467h;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f5U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ e f6V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ j f7W;

    public /* synthetic */ c(e eVar, j jVar, int i) {
        this.f5U = i;
        this.f6V = eVar;
        this.f7W = jVar;
    }

    public final void run() {
        switch (this.f5U) {
            case 0:
                j jVar = this.f7W;
                e eVar = this.f6V;
                eVar.f11b = true;
                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                j jVar2 = (j) eVar.f15g;
                if (jVar2 != null) {
                    jVar2.b(exc);
                    eVar.f15g = null;
                }
                eVar.f15g = jVar;
                if (eVar.f10a) {
                    C1467h hVar = (C1467h) eVar.f12c;
                    hVar.getClass();
                    i.d(d.i(new androidx.camera.lifecycle.c(17, hVar))).d(new d(0, eVar), (F.i) eVar.f13d);
                    eVar.f11b = false;
                    return;
                }
                return;
            default:
                j jVar3 = this.f7W;
                e eVar2 = this.f6V;
                eVar2.f11b = true;
                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                j jVar4 = (j) eVar2.f15g;
                if (jVar4 != null) {
                    jVar4.b(exc2);
                    eVar2.f15g = null;
                }
                eVar2.f15g = jVar3;
                if (eVar2.f10a) {
                    C1467h hVar2 = (C1467h) eVar2.f12c;
                    hVar2.getClass();
                    i.d(d.i(new androidx.camera.lifecycle.c(17, hVar2))).d(new d(0, eVar2), (F.i) eVar2.f13d);
                    eVar2.f11b = false;
                    return;
                }
                return;
        }
    }
}
