package E2;

import W2.m;
import android.graphics.Bitmap;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f f1354a;

    /* renamed from: b  reason: collision with root package name */
    public int f1355b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap.Config f1356c;

    public k(f fVar) {
        this.f1354a = fVar;
    }

    public final void a() {
        this.f1354a.j(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f1355b != kVar.f1355b || !m.b(this.f1356c, kVar.f1356c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8 = this.f1355b * 31;
        Bitmap.Config config = this.f1356c;
        if (config != null) {
            i = config.hashCode();
        } else {
            i = 0;
        }
        return i8 + i;
    }

    public final String toString() {
        return l.c(this.f1355b, this.f1356c);
    }
}
