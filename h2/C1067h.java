package h2;

import Q0.g;
import android.animation.TypeEvaluator;

/* renamed from: h2.h  reason: case insensitive filesystem */
public final class C1067h implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final C1067h f12556a = new Object();

    public final Object evaluate(float f8, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f9 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float j7 = g.j(((float) ((intValue2 >> 24) & 255)) / 255.0f, f9, f8, f9);
        float j8 = g.j(pow4, pow, f8, pow);
        float j9 = g.j((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, f8, pow2);
        float j10 = g.j((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, f8, pow3);
        int round = Math.round(((float) Math.pow((double) j8, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) j10, 0.45454545454545453d)) * 255.0f) | round | (Math.round(j7 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) j9, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
