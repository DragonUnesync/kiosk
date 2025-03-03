package w;

import B.C0022x;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: w.a  reason: case insensitive filesystem */
public abstract class C1571a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f16146a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16147b;

    static {
        C0022x xVar;
        HashMap hashMap = new HashMap();
        f16146a = hashMap;
        HashMap hashMap2 = new HashMap();
        f16147b = hashMap2;
        C0022x xVar2 = C0022x.f360d;
        hashMap.put(1L, xVar2);
        hashMap2.put(xVar2, Collections.singletonList(1L));
        hashMap.put(2L, C0022x.e);
        hashMap2.put((C0022x) hashMap.get(2L), Collections.singletonList(2L));
        C0022x xVar3 = C0022x.f361f;
        hashMap.put(4L, xVar3);
        hashMap2.put(xVar3, Collections.singletonList(4L));
        C0022x xVar4 = C0022x.f362g;
        hashMap.put(8L, xVar4);
        hashMap2.put(xVar4, Collections.singletonList(8L));
        List asList = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            xVar = C0022x.f363h;
            if (!hasNext) {
                break;
            }
            f16146a.put((Long) it.next(), xVar);
        }
        f16147b.put(xVar, asList);
        List asList2 = Arrays.asList(new Long[]{1024L, 2048L, 256L, 512L});
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            C0022x xVar5 = C0022x.i;
            if (hasNext2) {
                f16146a.put((Long) it2.next(), xVar5);
            } else {
                f16147b.put(xVar5, asList2);
                return;
            }
        }
    }

    public static Long a(C0022x xVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f16147b.get(xVar);
        if (list == null) {
            return null;
        }
        Set j7 = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l8 : list) {
            if (j7.contains(l8)) {
                return l8;
            }
        }
        return null;
    }
}
