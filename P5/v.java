package P5;

import android.accessibilityservice.GestureDescription;
import android.graphics.Path;
import android.os.Handler;
import android.util.Log;
import de.ozerov.fully.F1;
import de.ozerov.fully.MyAccessibilityService;
import de.ozerov.fully.S1;
import n2.a;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ float f3928U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ float f3929V;

    public /* synthetic */ v(float f8, float f9) {
        this.f3928U = f8;
        this.f3929V = f9;
    }

    public final void run() {
        MyAccessibilityService myAccessibilityService = MyAccessibilityService.f10102V;
        if (a.z0() && MyAccessibilityService.f10102V != null) {
            S1 s1 = new S1();
            Path path = new Path();
            path.moveTo(this.f3928U, this.f3929V);
            GestureDescription.StrokeDescription c8 = F1.c(path);
            GestureDescription.Builder b8 = F1.b();
            b8.addStroke(c8);
            boolean A8 = MyAccessibilityService.f10102V.dispatchGesture(b8.build(), s1, (Handler) null);
            Log.d("MyAccessibilityService", "Gesture dispatched: " + A8);
        }
    }
}
