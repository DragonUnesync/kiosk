package H5;

import A.f;
import G5.m;
import G5.v;
import G5.w;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

public final class g implements Camera.PreviewCallback {

    /* renamed from: a  reason: collision with root package name */
    public f f2186a;

    /* renamed from: b  reason: collision with root package name */
    public v f2187b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f2188c;

    public g(h hVar) {
        this.f2188c = hVar;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        v vVar = this.f2187b;
        f fVar = this.f2186a;
        if (vVar == null || fVar == null) {
            Log.d("h", "Got preview callback, but no handler or resolution available");
            if (fVar != null) {
                new Exception("No resolution available");
                fVar.Z();
            }
        } else if (bArr != null) {
            try {
                byte[] bArr2 = bArr;
                w wVar = new w(bArr2, vVar.f1735U, vVar.f1736V, camera.getParameters().getPreviewFormat(), this.f2188c.f2198k);
                if (this.f2188c.f2191b.facing == 1) {
                    wVar.e = true;
                }
                synchronized (((m) fVar.f17V).f1717h) {
                    m mVar = (m) fVar.f17V;
                    if (mVar.f1712b) {
                        ((Handler) mVar.f1711a).obtainMessage(2131362662, wVar).sendToTarget();
                    }
                }
            } catch (RuntimeException e) {
                Log.e("h", "Camera preview failed", e);
                fVar.Z();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("No preview data received");
        }
    }
}
