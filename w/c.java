package w;

import B.C0022x;
import android.hardware.camera2.params.DynamicRangeProfiles;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n2.a;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final DynamicRangeProfiles f16148a;

    public c(Object obj) {
        this.f16148a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l8 = (Long) it.next();
            long longValue = l8.longValue();
            C0022x xVar = (C0022x) C1571a.f16146a.get(l8);
            a.l(xVar, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(xVar);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public final DynamicRangeProfiles a() {
        return this.f16148a;
    }

    public final Set b() {
        return d(this.f16148a.getSupportedProfiles());
    }

    public final Set c(C0022x xVar) {
        boolean z;
        Long a8 = C1571a.a(xVar, this.f16148a);
        if (a8 != null) {
            z = true;
        } else {
            z = false;
        }
        a.h("DynamicRange is not supported: " + xVar, z);
        return d(this.f16148a.getProfileCaptureRequestConstraints(a8.longValue()));
    }
}
