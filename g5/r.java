package G5;

import A.d;
import A.f;
import P0.q;
import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;

public final class r extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f1723a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(q qVar, Context context) {
        super(context, 3);
        this.f1723a = qVar;
    }

    public final void onOrientationChanged(int i) {
        int rotation;
        q qVar = this.f1723a;
        WindowManager windowManager = (WindowManager) qVar.f3728c;
        f fVar = (f) qVar.e;
        if (windowManager != null && fVar != null && (rotation = windowManager.getDefaultDisplay().getRotation()) != qVar.f3727b) {
            qVar.f3727b = rotation;
            ((BarcodeView) fVar.f17V).f1670W.postDelayed(new d(14, fVar), 250);
        }
    }
}
