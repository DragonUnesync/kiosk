package H5;

import A.f;
import android.hardware.Camera;
import android.util.Log;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2170U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ f f2171V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ f f2172W;

    public /* synthetic */ d(f fVar, f fVar2, int i) {
        this.f2170U = i;
        this.f2171V = fVar;
        this.f2172W = fVar2;
    }

    public final void run() {
        f fVar = this.f2172W;
        f fVar2 = this.f2171V;
        switch (this.f2170U) {
            case 0:
                if (!fVar2.f2180f) {
                    Log.d("f", "Camera is closed, not requesting preview");
                    return;
                }
                fVar2.f2176a.g(new d(fVar2, fVar, 1));
                return;
            default:
                h hVar = fVar2.f2178c;
                Camera camera = hVar.f2190a;
                if (camera != null && hVar.e) {
                    g gVar = hVar.f2199l;
                    gVar.f2186a = fVar;
                    camera.setOneShotPreviewCallback(gVar);
                    return;
                }
                return;
        }
    }
}
