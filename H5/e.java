package H5;

import A1.d;
import G5.v;
import P0.q;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;

public final class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2173U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ f f2174V;

    public /* synthetic */ e(f fVar, int i) {
        this.f2173U = i;
        this.f2174V = fVar;
    }

    public final void run() {
        boolean z = true;
        v vVar = null;
        switch (this.f2173U) {
            case 0:
                f fVar = this.f2174V;
                try {
                    Log.d("f", "Opening camera");
                    fVar.f2178c.c();
                    return;
                } catch (Exception e) {
                    Handler handler = fVar.f2179d;
                    if (handler != null) {
                        handler.obtainMessage(2131362661, e).sendToTarget();
                    }
                    Log.e("f", "Failed to open camera", e);
                    return;
                }
            case 1:
                f fVar2 = this.f2174V;
                try {
                    Log.d("f", "Configuring camera");
                    fVar2.f2178c.b();
                    Handler handler2 = fVar2.f2179d;
                    if (handler2 != null) {
                        h hVar = fVar2.f2178c;
                        v vVar2 = hVar.f2197j;
                        if (vVar2 != null) {
                            int i = hVar.f2198k;
                            if (i != -1) {
                                if (i % 180 == 0) {
                                    z = false;
                                }
                                if (z) {
                                    vVar = new v(vVar2.f1736V, vVar2.f1735U);
                                } else {
                                    vVar = vVar2;
                                }
                            } else {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                        }
                        handler2.obtainMessage(2131362668, vVar).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    Handler handler3 = fVar2.f2179d;
                    if (handler3 != null) {
                        handler3.obtainMessage(2131362661, e8).sendToTarget();
                    }
                    Log.e("f", "Failed to configure camera", e8);
                    return;
                }
            case 2:
                f fVar3 = this.f2174V;
                try {
                    Log.d("f", "Starting preview");
                    h hVar2 = fVar3.f2178c;
                    d dVar = fVar3.f2177b;
                    Camera camera = hVar2.f2190a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) dVar.f35V;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) dVar.f36W);
                    }
                    fVar3.f2178c.f();
                    return;
                } catch (Exception e9) {
                    Handler handler4 = fVar3.f2179d;
                    if (handler4 != null) {
                        handler4.obtainMessage(2131362661, e9).sendToTarget();
                    }
                    Log.e("f", "Failed to start preview", e9);
                    return;
                }
            default:
                try {
                    Log.d("f", "Closing camera");
                    h hVar3 = this.f2174V.f2178c;
                    b bVar = hVar3.f2192c;
                    if (bVar != null) {
                        bVar.c();
                        hVar3.f2192c = null;
                    }
                    if (hVar3.f2193d != null) {
                        hVar3.f2193d = null;
                    }
                    Camera camera2 = hVar3.f2190a;
                    if (camera2 != null && hVar3.e) {
                        camera2.stopPreview();
                        hVar3.f2199l.f2186a = null;
                        hVar3.e = false;
                    }
                    h hVar4 = this.f2174V.f2178c;
                    Camera camera3 = hVar4.f2190a;
                    if (camera3 != null) {
                        camera3.release();
                        hVar4.f2190a = null;
                    }
                } catch (Exception e10) {
                    Log.e("f", "Failed to close camera", e10);
                }
                f fVar4 = this.f2174V;
                fVar4.f2181g = true;
                fVar4.f2179d.sendEmptyMessage(2131362660);
                q qVar = this.f2174V.f2176a;
                synchronized (qVar.e) {
                    try {
                        int i8 = qVar.f3727b - 1;
                        qVar.f3727b = i8;
                        if (i8 == 0) {
                            qVar.o();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
