package M0;

import P0.l;
import P0.z;
import java.util.Arrays;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f2934a;

    /* renamed from: b  reason: collision with root package name */
    public final Y f2935b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2936c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f2937d;
    public final boolean[] e;

    static {
        z.J(0);
        z.J(1);
        z.J(3);
        z.J(4);
    }

    public d0(Y y8, boolean z, int[] iArr, boolean[] zArr) {
        boolean z6;
        int i = y8.f2885a;
        this.f2934a = i;
        boolean z8 = false;
        if (i == iArr.length && i == zArr.length) {
            z6 = true;
        } else {
            z6 = false;
        }
        l.d(z6);
        this.f2935b = y8;
        if (z && i > 1) {
            z8 = true;
        }
        this.f2936c = z8;
        this.f2937d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f2935b.f2887c;
    }

    public final boolean b(int i) {
        if (this.f2937d[i] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f2936c != d0Var.f2936c || !this.f2935b.equals(d0Var.f2935b) || !Arrays.equals(this.f2937d, d0Var.f2937d) || !Arrays.equals(this.e, d0Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f2937d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f2935b.hashCode() * 31) + (this.f2936c ? 1 : 0)) * 31)) * 31);
    }
}
