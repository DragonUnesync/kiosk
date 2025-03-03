package z3;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: z3.a  reason: case insensitive filesystem */
public final class C1646a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f16449a;

    public C1646a(float f8) {
        this.f16449a = f8;
    }

    public final float a(RectF rectF) {
        return this.f16449a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1646a) && this.f16449a == ((C1646a) obj).f16449a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f16449a)});
    }
}
