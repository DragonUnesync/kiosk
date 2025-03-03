package B;

import N.e;

/* renamed from: B.x  reason: case insensitive filesystem */
public final class C0022x {

    /* renamed from: c  reason: collision with root package name */
    public static final C0022x f359c = new C0022x(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final C0022x f360d = new C0022x(1, 8);
    public static final C0022x e = new C0022x(3, 10);

    /* renamed from: f  reason: collision with root package name */
    public static final C0022x f361f = new C0022x(4, 10);

    /* renamed from: g  reason: collision with root package name */
    public static final C0022x f362g = new C0022x(5, 10);

    /* renamed from: h  reason: collision with root package name */
    public static final C0022x f363h = new C0022x(6, 10);
    public static final C0022x i = new C0022x(6, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int f364a;

    /* renamed from: b  reason: collision with root package name */
    public final int f365b;

    public C0022x(int i8, int i9) {
        this.f364a = i8;
        this.f365b = i9;
    }

    public final boolean a() {
        if (!b() || this.f364a == 1 || this.f365b != 10) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        int i8 = this.f364a;
        if (i8 == 0 || i8 == 2 || this.f365b == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (B.C0022x) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof B.C0022x
            r2 = 0
            if (r1 == 0) goto L_0x001a
            B.x r5 = (B.C0022x) r5
            int r1 = r5.f364a
            int r3 = r4.f364a
            if (r3 != r1) goto L_0x0018
            int r1 = r4.f365b
            int r5 = r5.f365b
            if (r1 != r5) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0022x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.f364a ^ 1000003) * 1000003) ^ this.f365b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f364a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return e.z(sb, this.f365b, "}");
    }
}
