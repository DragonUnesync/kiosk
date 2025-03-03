package m0;

import B.C0003d;
import android.graphics.Path;
import android.util.Log;

/* renamed from: m0.e  reason: case insensitive filesystem */
public final class C1199e {

    /* renamed from: a  reason: collision with root package name */
    public char f13321a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f13322b;

    public C1199e(char c8, float[] fArr) {
        this.f13321a = c8;
        this.f13322b = fArr;
    }

    public static void a(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z, boolean z6) {
        double d8;
        double d9;
        boolean z8;
        float f15 = f8;
        float f16 = f10;
        float f17 = f12;
        boolean z9 = z6;
        double radians = Math.toRadians((double) f14);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = (double) f15;
        double d11 = (double) f9;
        double d12 = (d11 * sin) + (d10 * cos);
        double d13 = d10;
        double d14 = (double) f17;
        double d15 = d12 / d14;
        double d16 = radians;
        double d17 = (double) f13;
        double d18 = ((d11 * cos) + (((double) (-f15)) * sin)) / d17;
        double d19 = d11;
        double d20 = (double) f11;
        double d21 = ((d20 * sin) + (((double) f16) * cos)) / d14;
        double d22 = ((d20 * cos) + (((double) (-f16)) * sin)) / d17;
        double d23 = d15 - d21;
        double d24 = d18 - d22;
        double d25 = (d15 + d21) / 2.0d;
        double d26 = (d18 + d22) / 2.0d;
        double d27 = sin;
        double d28 = (d24 * d24) + (d23 * d23);
        if (d28 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d28);
            float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f8, f9, f10, f11, f17 * sqrt, f13 * sqrt, f14, z, z6);
            return;
        }
        double sqrt2 = Math.sqrt(d29);
        double d30 = d23 * sqrt2;
        double d31 = sqrt2 * d24;
        if (z == z9) {
            d9 = d25 - d31;
            d8 = d26 + d30;
        } else {
            d9 = d25 + d31;
            d8 = d26 - d30;
        }
        double atan2 = Math.atan2(d18 - d8, d15 - d9);
        double atan22 = Math.atan2(d22 - d8, d21 - d9) - atan2;
        int i = 0;
        int i8 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z9 != z8) {
            if (i8 > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d32 = d9 * d14;
        double d33 = d8 * d17;
        double d34 = (d32 * cos) - (d33 * d27);
        double d35 = (d33 * cos) + (d32 * d27);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d16);
        double sin2 = Math.sin(d16);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d36 = -d14;
        double d37 = d36 * cos2;
        double d38 = d17 * sin2;
        double d39 = (d37 * sin3) - (d38 * cos3);
        double d40 = d36 * sin2;
        double d41 = d17 * cos2;
        double d42 = (cos3 * d41) + (sin3 * d40);
        double d43 = atan22 / ((double) ceil);
        double d44 = atan2;
        while (i < ceil) {
            double d45 = d44 + d43;
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            double d46 = d43;
            double d47 = (((d14 * cos2) * cos4) + d34) - (d38 * sin4);
            double d48 = d34;
            double d49 = (d41 * sin4) + (d14 * sin2 * cos4) + d35;
            double d50 = (d37 * sin4) - (d38 * cos4);
            double d51 = (cos4 * d41) + (sin4 * d40);
            double d52 = d45 - d44;
            double tan = Math.tan(d52 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
            double d53 = (d39 * sqrt3) + d13;
            int i9 = ceil;
            double d54 = d41;
            double d55 = (d42 * sqrt3) + d19;
            double d56 = d40;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) d53, (float) d55, (float) (d47 - (sqrt3 * d50)), (float) (d49 - (sqrt3 * d51)), (float) d47, (float) d49);
            i++;
            d41 = d54;
            d40 = d56;
            ceil = i9;
            cos2 = cos2;
            d44 = d45;
            d14 = d14;
            d42 = d51;
            d39 = d50;
            d13 = d47;
            d19 = d49;
            d43 = d46;
            d34 = d48;
        }
    }

    public C1199e(C1199e eVar) {
        this.f13321a = eVar.f13321a;
        float[] fArr = eVar.f13322b;
        this.f13322b = C0003d.k(fArr, fArr.length);
    }
}
