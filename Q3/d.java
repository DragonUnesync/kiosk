package Q3;

import M3.a;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4109a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f4110b;

    static {
        EnumSet of = EnumSet.of(a.f3117f0);
        EnumSet of2 = EnumSet.of(a.f3111Z);
        EnumSet of3 = EnumSet.of(a.f3106U);
        EnumSet of4 = EnumSet.of(a.f3116e0);
        EnumSet of5 = EnumSet.of(a.f3120i0, new a[]{a.f3121j0, a.f3113b0, a.f3112a0, a.f3118g0, a.f3119h0});
        EnumSet of6 = EnumSet.of(a.f3108W, a.f3109X, a.f3110Y, a.f3114c0, a.f3107V);
        EnumSet copyOf = EnumSet.copyOf(of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f4110b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
