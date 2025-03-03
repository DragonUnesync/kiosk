package v1;

import E2.a;
import P0.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: v1.c  reason: case insensitive filesystem */
public final class C1556c extends a {

    /* renamed from: W  reason: collision with root package name */
    public long f15991W;

    /* renamed from: X  reason: collision with root package name */
    public long[] f15992X;

    /* renamed from: Y  reason: collision with root package name */
    public long[] f15993Y;

    public static Serializable p(int i, r rVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(rVar.p()));
        }
        boolean z = true;
        if (i == 1) {
            if (rVar.v() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return r(rVar);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String r8 = r(rVar);
                    int v4 = rVar.v();
                    if (v4 == 9) {
                        return hashMap;
                    }
                    Serializable p3 = p(v4, rVar);
                    if (p3 != null) {
                        hashMap.put(r8, p3);
                    }
                }
            } else if (i == 8) {
                return q(rVar);
            } else {
                if (i == 10) {
                    int z6 = rVar.z();
                    ArrayList arrayList = new ArrayList(z6);
                    for (int i8 = 0; i8 < z6; i8++) {
                        Serializable p8 = p(rVar.v(), rVar);
                        if (p8 != null) {
                            arrayList.add(p8);
                        }
                    }
                    return arrayList;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) Double.longBitsToDouble(rVar.p()));
                    rVar.I(2);
                    return date;
                }
            }
        }
    }

    public static HashMap q(r rVar) {
        int z = rVar.z();
        HashMap hashMap = new HashMap(z);
        for (int i = 0; i < z; i++) {
            String r8 = r(rVar);
            Serializable p3 = p(rVar.v(), rVar);
            if (p3 != null) {
                hashMap.put(r8, p3);
            }
        }
        return hashMap;
    }

    public static String r(r rVar) {
        int B8 = rVar.B();
        int i = rVar.f3733b;
        rVar.I(B8);
        return new String(rVar.f3732a, i, B8);
    }
}
