package u;

import D.H0;
import a0.j;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: u.d  reason: case insensitive filesystem */
public final /* synthetic */ class C1463d implements C1466g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f15606b;

    public /* synthetic */ C1463d(long j7, j jVar) {
        this.f15605a = j7;
        this.f15606b = jVar;
    }

    public final boolean b(TotalCaptureResult totalCaptureResult) {
        Long l8;
        long j7 = this.f15605a;
        boolean z = false;
        if (totalCaptureResult.getRequest() != null) {
            Object tag = totalCaptureResult.getRequest().getTag();
            if ((tag instanceof H0) && (l8 = (Long) ((H0) tag).f785a.get("CameraControlSessionUpdateId")) != null && l8.longValue() >= j7) {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        this.f15606b.a((Object) null);
        return true;
    }
}
