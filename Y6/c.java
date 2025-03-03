package Y6;

import P6.f;
import java.util.concurrent.TimeUnit;

public final class c {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f6600n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6601a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6602b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6603c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6604d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6605f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6606g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6607h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6608j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6609k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6610l;

    /* renamed from: m  reason: collision with root package name */
    public String f6611m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f.e(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) Integer.MAX_VALUE);
    }

    public c(boolean z, boolean z6, int i8, int i9, boolean z8, boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, String str) {
        this.f6601a = z;
        this.f6602b = z6;
        this.f6603c = i8;
        this.f6604d = i9;
        this.e = z8;
        this.f6605f = z9;
        this.f6606g = z10;
        this.f6607h = i10;
        this.i = i11;
        this.f6608j = z11;
        this.f6609k = z12;
        this.f6610l = z13;
        this.f6611m = str;
    }

    public final String toString() {
        String str = this.f6611m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6601a) {
            sb.append("no-cache, ");
        }
        if (this.f6602b) {
            sb.append("no-store, ");
        }
        int i8 = this.f6603c;
        if (i8 != -1) {
            sb.append("max-age=");
            sb.append(i8);
            sb.append(", ");
        }
        int i9 = this.f6604d;
        if (i9 != -1) {
            sb.append("s-maxage=");
            sb.append(i9);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f6605f) {
            sb.append("public, ");
        }
        if (this.f6606g) {
            sb.append("must-revalidate, ");
        }
        int i10 = this.f6607h;
        if (i10 != -1) {
            sb.append("max-stale=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.i;
        if (i11 != -1) {
            sb.append("min-fresh=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f6608j) {
            sb.append("only-if-cached, ");
        }
        if (this.f6609k) {
            sb.append("no-transform, ");
        }
        if (this.f6610l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f6611m = sb2;
        return sb2;
    }
}
