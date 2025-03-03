package u;

import A.h;
import B.j0;
import D.C0036c;
import D.C0041e0;
import D.C0045g0;
import D.C0053k0;
import D.C0064s;
import D.H0;
import D.I;
import D.L0;
import D.U;
import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import t.C1412a;

/* renamed from: u.y  reason: case insensitive filesystem */
public class C1484y {

    /* renamed from: a  reason: collision with root package name */
    public static final C1484y f15729a = new Object();

    public void a(U u3, j0 j0Var) {
        U u8 = u3;
        j0 j0Var2 = j0Var;
        I i = (I) u8.o0(L0.f811t, (Object) null);
        C0053k0 k0Var = C0053k0.f919W;
        C0036c cVar = I.f786h;
        HashSet hashSet = new HashSet();
        C0041e0 b8 = C0041e0.b();
        ArrayList arrayList = new ArrayList();
        C0045g0 a8 = C0045g0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C0053k0 a9 = C0053k0.a(b8);
        ArrayList arrayList3 = new ArrayList(arrayList);
        H0 h02 = H0.f784b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a8.f785a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        H0 h03 = new H0(arrayMap);
        int i8 = -1;
        new I(arrayList2, a9, -1, arrayList3, false, h03, (C0064s) null);
        if (i != null) {
            j0Var2.a(i.f791d);
            k0Var = i.f789b;
            i8 = i.f790c;
        }
        j0Var2.f267X = C0041e0.c(k0Var);
        j0Var2.f264U = ((Integer) u8.o0(C1412a.f15159W, Integer.valueOf(i8))).intValue();
        j0Var2.d(new C1446F((CameraCaptureSession.CaptureCallback) u8.o0(C1412a.f15163a0, new CameraCaptureSession.CaptureCallback())));
        j0Var2.e(h.e(u3).c());
    }
}
