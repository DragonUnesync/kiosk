package N5;

import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;

public final class g extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f3380b;

    public g(j jVar, boolean z) {
        this.f3380b = jVar;
        this.f3379a = z;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        j jVar = this.f3380b;
        Camera camera = jVar.f3417u;
        if (camera != null) {
            try {
                camera.setErrorCallback((Camera.ErrorCallback) null);
                jVar.f3417u.setPreviewCallback((Camera.PreviewCallback) null);
                a aVar = jVar.f3419w;
                if (aVar != null) {
                    aVar.a();
                }
                jVar.f3417u.release();
                jVar.f3417u = null;
            } catch (Exception e) {
                Log.e("j", "Failed to stop camera");
                e.printStackTrace();
            }
        }
        return null;
    }

    public final void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        j jVar = this.f3380b;
        if (jVar.f3419w != null) {
            ((WindowManager) jVar.f3399a.getSystemService("window")).removeView(this.f3380b.f3419w);
            this.f3380b.f3419w = null;
        }
        this.f3380b.f3409m = 0;
        if (this.f3379a) {
            this.f3380b.e();
        }
    }

    public final void onPreExecute() {
    }
}
