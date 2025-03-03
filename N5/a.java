package N5;

import A.d;
import android.app.Service;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import android.view.TextureView;
import android.widget.FrameLayout;

public final class a extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: U  reason: collision with root package name */
    public final Camera f3364U;

    /* renamed from: V  reason: collision with root package name */
    public final d f3365V;

    /* renamed from: W  reason: collision with root package name */
    public volatile boolean f3366W = false;

    public a(Service service, Camera camera, d dVar) {
        super(service);
        this.f3364U = camera;
        this.f3365V = dVar;
        setSurfaceTextureListener(this);
    }

    public final void a() {
        try {
            if (this.f3366W) {
                this.f3364U.stopPreview();
                this.f3366W = false;
            }
        } catch (Exception unused) {
            Log.e("a", "Stopping Camera Preview Failed");
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i8) {
        try {
            Camera.Size previewSize = this.f3364U.getParameters().getPreviewSize();
            setLayoutParams(new FrameLayout.LayoutParams(previewSize.width, previewSize.height, 17));
            try {
                this.f3364U.setPreviewTexture(surfaceTexture);
                this.f3364U.startPreview();
                this.f3366W = true;
                d dVar = this.f3365V;
                if (dVar != null) {
                    dVar.run();
                }
            } catch (Exception e) {
                Log.e("a", "Starting preview failed");
                e.printStackTrace();
            }
        } catch (Exception unused) {
            Log.e("a", "getParameters failed in onSurfaceTextureAvailable");
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        a();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i8) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
