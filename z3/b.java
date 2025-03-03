package z3;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f16450a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16451b;

    public b(float f8, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f16450a;
            f8 += ((b) cVar).f16451b;
        }
        this.f16450a = cVar;
        this.f16451b = f8;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f16450a.a(rectF) + this.f16451b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f16450a.equals(bVar.f16450a) || this.f16451b != bVar.f16451b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16450a, Float.valueOf(this.f16451b)});
    }
}
