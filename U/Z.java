package u;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

public final /* synthetic */ class Z implements C1466g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f15589a;

    public /* synthetic */ Z(a0 a0Var) {
        this.f15589a = a0Var;
    }

    public final boolean b(TotalCaptureResult totalCaptureResult) {
        boolean z;
        a0 a0Var = this.f15589a;
        if (a0Var.f15593d != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num == null || num.intValue() != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z == a0Var.e) {
                a0Var.f15593d.a((Object) null);
                a0Var.f15593d = null;
            }
        }
        return false;
    }
}
