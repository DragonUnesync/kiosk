package N5;

import B.C0016q;
import D.C0038d;
import D.C0069x;
import android.hardware.camera2.CameraManager;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;
import u.C1481v;

public final /* synthetic */ class n implements C0016q {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f3426b;

    public /* synthetic */ n(p pVar) {
        this.f3426b = pVar;
    }

    public final C0038d a() {
        return C0016q.f298a;
    }

    public final ArrayList b(List list) {
        k kVar;
        ArrayList arrayList;
        p pVar = this.f3426b;
        pVar.getClass();
        Iterator it = list.iterator();
        C0069x xVar = null;
        while (true) {
            boolean hasNext = it.hasNext();
            kVar = pVar.f3441b;
            if (!hasNext) {
                break;
            }
            C0069x xVar2 = (C0069x) it.next();
            C0069x h5 = xVar2.h();
            a.h("CameraInfo doesn't contain Camera2 implementation.", h5 instanceof C1481v);
            String str = ((C1481v) ((C1481v) h5).f15722c.f17V).f15720a;
            if (!kVar.q1().isEmpty()) {
                if (!str.equals(kVar.q1())) {
                }
            } else if (xVar2.d() != 0) {
            }
            xVar = xVar2;
        }
        if (xVar != null) {
            kVar.q1();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(xVar);
            return arrayList2;
        }
        kVar.q1();
        CameraManager cameraManager = (CameraManager) pVar.f3440a.getApplicationContext().getSystemService("camera");
        if (cameraManager != null) {
            try {
                for (String str2 : cameraManager.getCameraIdList()) {
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList(list);
        }
        return arrayList;
    }
}
