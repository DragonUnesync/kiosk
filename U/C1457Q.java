package u;

import A.f;
import D.C0036c;
import D.C0041e0;
import D.L0;
import D.N0;
import D.U;
import D.t0;
import N.e;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t.C1412a;

/* renamed from: u.Q  reason: case insensitive filesystem */
public abstract class C1457Q {

    /* renamed from: a  reason: collision with root package name */
    public static final C0036c f15534a = new C0036c("camera2.streamSpec.streamUseCase", Long.TYPE, (CaptureRequest.Key) null);

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f15535b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f15536c;

    static {
        HashMap hashMap = new HashMap();
        f15535b = hashMap;
        HashMap hashMap2 = new HashMap();
        f15536c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            N0 n02 = N0.f831V;
            hashSet.add(n02);
            N0 n03 = N0.f835Z;
            hashSet.add(n03);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(n02);
            hashSet2.add(n03);
            hashSet2.add(N0.f832W);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            N0 n04 = N0.f830U;
            hashSet3.add(n04);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            N0 n05 = N0.f833X;
            hashSet4.add(n05);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(n02);
            hashSet5.add(n04);
            hashSet5.add(n05);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(n02);
            hashSet6.add(n05);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [t.a, A.f] */
    public static C1412a a(C1412a aVar, long j7) {
        aVar.getClass();
        C0036c cVar = f15534a;
        if (e.a(aVar, cVar) && ((Long) e.p(aVar, cVar)).longValue() == j7) {
            return null;
        }
        C0041e0 c8 = C0041e0.c(aVar);
        c8.e(cVar, Long.valueOf(j7));
        return new f(1, (Object) c8);
    }

    public static boolean b(N0 n02, long j7, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (n02 == N0.f834Y) {
            HashMap hashMap = f15536c;
            if (!hashMap.containsKey(Long.valueOf(j7))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j7));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((N0) it.next())) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = f15535b;
        if (!hashMap2.containsKey(Long.valueOf(j7)) || !((Set) hashMap2.get(Long.valueOf(j7))).contains(n02)) {
            return false;
        }
        return true;
    }

    public static boolean c(t0 t0Var, N0 n02) {
        if (((Boolean) t0Var.o0(L0.f816y, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C0036c cVar = U.f854V;
        if (!t0Var.q0(cVar)) {
            return false;
        }
        int intValue = ((Integer) t0Var.b0(cVar)).intValue();
        if (n02.ordinal() == 0 && intValue == 2) {
            return true;
        }
        return false;
    }
}
