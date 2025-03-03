package D5;

import u5.C1496c;

public enum a implements C1496c {
    GRANTED_QOS_0(0),
    GRANTED_QOS_1(1),
    GRANTED_QOS_2(2),
    UNSPECIFIED_ERROR(128);
    

    /* renamed from: Z  reason: collision with root package name */
    public static final a[] f1248Z = null;

    /* renamed from: U  reason: collision with root package name */
    public final int f1250U;

    static {
        f1248Z = values();
    }

    /* access modifiers changed from: public */
    a(int i) {
        this.f1250U = i;
    }

    public final int b() {
        return this.f1250U;
    }
}
