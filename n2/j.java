package n2;

import java.util.Arrays;
import v2.C1559b;
import y2.C1628c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i[] f13756a;

    /* renamed from: b  reason: collision with root package name */
    public final C1559b f13757b;

    /* JADX WARNING: type inference failed for: r0v2, types: [v2.b, y2.c] */
    public j(i[] iVarArr) {
        this.f13756a = (i[]) iVarArr.clone();
        this.f13757b = new C1628c(iVarArr.length);
        for (int i = 0; i < iVarArr.length; i++) {
            this.f13757b.f(i, iVarArr[i].f13754b);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j) || !Arrays.equals(((j) obj).f13756a, this.f13756a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13756a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            i[] iVarArr = this.f13756a;
            if (i >= iVarArr.length) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(iVarArr[i]);
            i++;
        }
    }
}
