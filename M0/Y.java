package M0;

import N.e;
import P0.l;
import P0.z;
import java.util.Arrays;

public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final int f2885a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2886b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2887c;

    /* renamed from: d  reason: collision with root package name */
    public final r[] f2888d;
    public int e;

    static {
        z.J(0);
        z.J(1);
    }

    public Y(String str, r... rVarArr) {
        boolean z;
        int i = 1;
        if (rVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f2886b = str;
        this.f2888d = rVarArr;
        this.f2885a = rVarArr.length;
        int i8 = I.i(rVarArr[0].f3036n);
        this.f2887c = i8 == -1 ? I.i(rVarArr[0].f3035m) : i8;
        String str2 = rVarArr[0].f3028d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i9 = rVarArr[0].f3029f | 16384;
        while (i < rVarArr.length) {
            String str3 = rVarArr[i].f3028d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", i, rVarArr[0].f3028d, rVarArr[i].f3028d);
                return;
            } else if (i9 != (rVarArr[i].f3029f | 16384)) {
                c("role flags", i, Integer.toBinaryString(rVarArr[0].f3029f), Integer.toBinaryString(rVarArr[i].f3029f));
                return;
            } else {
                i++;
            }
        }
    }

    public static void c(String str, int i, String str2, String str3) {
        l.p("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final r a() {
        return this.f2888d[0];
    }

    public final int b(r rVar) {
        int i = 0;
        while (true) {
            r[] rVarArr = this.f2888d;
            if (i >= rVarArr.length) {
                return -1;
            }
            if (rVar == rVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y8 = (Y) obj;
        if (!this.f2886b.equals(y8.f2886b) || !Arrays.equals(this.f2888d, y8.f2888d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.f2888d) + e.u(527, 31, this.f2886b);
        }
        return this.e;
    }
}
