package G5;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

public final class d implements SurfaceHolder.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ BarcodeView f1664U;

    public d(BarcodeView barcodeView) {
        this.f1664U = barcodeView;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i8, int i9) {
        if (surfaceHolder == null) {
            int i10 = f.f1667w0;
            Log.e("f", "*** WARNING *** surfaceChanged() gave us a null surface!");
            return;
        }
        v vVar = new v(i8, i9);
        BarcodeView barcodeView = this.f1664U;
        barcodeView.f1683m0 = vVar;
        barcodeView.e();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f1664U.f1683m0 = null;
    }
}
