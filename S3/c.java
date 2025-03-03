package S3;

import java.util.HashMap;

public enum c {
    ;
    

    /* renamed from: W  reason: collision with root package name */
    public static final HashMap f4509W = null;

    /* renamed from: X  reason: collision with root package name */
    public static final HashMap f4510X = null;

    /* renamed from: U  reason: collision with root package name */
    public final int[] f4512U;

    /* renamed from: V  reason: collision with root package name */
    public final String[] f4513V;

    static {
        f4509W = new HashMap();
        f4510X = new HashMap();
        for (c cVar : values()) {
            for (int valueOf : cVar.f4512U) {
                f4509W.put(Integer.valueOf(valueOf), cVar);
            }
            f4510X.put(cVar.name(), cVar);
            for (String put : cVar.f4513V) {
                f4510X.put(put, cVar);
            }
        }
    }

    /* access modifiers changed from: public */
    c(int i, int i8) {
        this.f4512U = new int[]{i8};
        this.f4513V = r2;
    }

    /* access modifiers changed from: public */
    c(int[] iArr, String... strArr) {
        this.f4512U = iArr;
        this.f4513V = strArr;
    }
}
