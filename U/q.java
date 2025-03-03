package U;

import F.h;
import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

public final /* synthetic */ class q implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Semaphore f5298a;

    public /* synthetic */ q(Semaphore semaphore) {
        this.f5298a = semaphore;
    }

    public final void onPixelCopyFinished(int i) {
        Semaphore semaphore = this.f5298a;
        if (i == 0) {
            h.j("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            h.l("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
        }
        semaphore.release();
    }
}
