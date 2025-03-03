package z3;

import com.bumptech.glide.c;

public final class d extends c {
    public final void n(t tVar, float f8, float f9) {
        tVar.d(f9 * f8, 180.0f, 90.0f);
        double d8 = (double) f9;
        double d9 = (double) f8;
        tVar.c((float) (Math.sin(Math.toRadians((double) 90.0f)) * d8 * d9), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d8 * d9));
    }
}
