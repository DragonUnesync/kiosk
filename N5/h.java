package N5;

import android.app.Service;
import android.hardware.Camera;
import android.util.Log;
import de.ozerov.fully.O1;
import n2.a;

public final class h implements Camera.PreviewCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f3381a;

    public h(j jVar) {
        this.f3381a = jVar;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z;
        boolean z6;
        byte[] bArr2 = bArr;
        if (bArr2 != null && camera != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j7 = this.f3381a.f3412p;
            j jVar = this.f3381a;
            if (currentTimeMillis >= j7 + ((long) (1000 / jVar.f3402d)) && !jVar.f3410n.get()) {
                long j8 = O1.f10199t;
                j jVar2 = this.f3381a;
                if (!jVar2.i || j8 == 0 || currentTimeMillis - j8 >= 300) {
                    z = false;
                } else {
                    z = true;
                }
                if (!jVar2.f3406j || jVar2.f3414r == 0 || currentTimeMillis - this.f3381a.f3414r >= 3000) {
                    z6 = z;
                } else {
                    z6 = true;
                }
                try {
                    this.f3381a.f3421y = bArr2;
                    j jVar3 = this.f3381a;
                    Service service = jVar3.f3399a;
                    Camera.Size size = jVar3.f3420x;
                    new i(jVar3, service, bArr, size.width, size.height, jVar3.f3401c, jVar3.e, z6).start();
                    this.f3381a.f3412p = currentTimeMillis;
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                    Log.e("j", "Out of memory in motion detector");
                    a.a1(0, this.f3381a.f3399a, "Not enough memory for motion detection. Stopping it...");
                    this.f3381a.f(false);
                }
            }
        }
    }
}
