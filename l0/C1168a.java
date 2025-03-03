package l0;

import android.graphics.Color;
import m0.C1195a;

/* renamed from: l0.a  reason: case insensitive filesystem */
public final class C1168a {

    /* renamed from: a  reason: collision with root package name */
    public final float f13056a;

    /* renamed from: b  reason: collision with root package name */
    public final float f13057b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13058c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13059d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13060f;

    public C1168a(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f13056a = f8;
        this.f13057b = f9;
        this.f13058c = f10;
        this.f13059d = f11;
        this.e = f12;
        this.f13060f = f13;
    }

    public static C1168a a(int i) {
        float f8;
        m mVar = m.f13086k;
        float f9 = C1169b.f(Color.red(i));
        float f10 = C1169b.f(Color.green(i));
        float f11 = C1169b.f(Color.blue(i));
        float[][] fArr = C1169b.f13064d;
        float[] fArr2 = fArr[0];
        float f12 = fArr2[1] * f10;
        float f13 = (fArr2[2] * f11) + f12 + (fArr2[0] * f9);
        float[] fArr3 = fArr[1];
        float f14 = fArr3[1] * f10;
        float f15 = (fArr3[2] * f11) + f14 + (fArr3[0] * f9);
        float[] fArr4 = fArr[2];
        float f16 = (f11 * fArr4[2]) + (f10 * fArr4[1]) + (f9 * fArr4[0]);
        float[][] fArr5 = C1169b.f13061a;
        float[] fArr6 = fArr5[0];
        float f17 = fArr6[1] * f15;
        float f18 = (fArr6[2] * f16) + f17 + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f19 = fArr7[1] * f15;
        float f20 = fArr7[2] * f16;
        float[] fArr8 = fArr5[2];
        float f21 = f13 * fArr8[0];
        float f22 = f16 * fArr8[2];
        float[] fArr9 = mVar.f13092g;
        float f23 = fArr9[0] * f18;
        float f24 = fArr9[1] * (f20 + f19 + (fArr7[0] * f13));
        float f25 = fArr9[2] * (f22 + (f15 * fArr8[1]) + f21);
        float abs = Math.abs(f23);
        float f26 = mVar.f13093h;
        float pow = (float) Math.pow(((double) (abs * f26)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f24) * f26)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f25) * f26)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f23) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f24) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f25) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d8 = (double) signum3;
        float f27 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d8)) / 11.0f;
        float f28 = ((float) (((double) (signum + signum2)) - (d8 * 2.0d))) / 9.0f;
        float f29 = signum2 * 20.0f;
        float f30 = ((21.0f * signum3) + ((signum * 20.0f) + f29)) / 20.0f;
        float f31 = (((signum * 40.0f) + f29) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f28, (double) f27)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f32 = atan2;
        float f33 = (3.1415927f * f32) / 180.0f;
        float f34 = f31 * mVar.f13088b;
        float f35 = mVar.f13087a;
        float f36 = mVar.f13090d;
        float pow4 = ((float) Math.pow((double) (f34 / f35), (double) (mVar.f13094j * f36))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f37 = f35 + 4.0f;
        if (((double) f32) < 20.14d) {
            f8 = 360.0f + f32;
        } else {
            f8 = f32;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) mVar.f13091f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f8) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.e) * mVar.f13089c) * ((float) Math.sqrt((double) ((f28 * f28) + (f27 * f27))))) / (f30 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f36) / f37));
        float f38 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((mVar.i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d9 = (double) f33;
        return new C1168a(f32, sqrt, pow4, f38, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public static C1168a b(float f8, float f9, float f10) {
        m mVar = m.f13086k;
        float f11 = mVar.f13090d;
        double d8 = ((double) f8) / 100.0d;
        Math.sqrt(d8);
        Math.sqrt((double) (((f9 / ((float) Math.sqrt(d8))) * mVar.f13090d) / (mVar.f13087a + 4.0f)));
        float f12 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float log = ((float) Math.log((((double) (mVar.i * f9)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (double) ((3.1415927f * f10) / 180.0f);
        return new C1168a(f10, f9, f8, f12, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public final int c(m mVar) {
        float f8;
        m mVar2 = mVar;
        float f9 = this.f13057b;
        float f10 = this.f13058c;
        if (((double) f9) != 0.0d) {
            double d8 = (double) f10;
            if (d8 != 0.0d) {
                f8 = f9 / ((float) Math.sqrt(d8 / 100.0d));
                float pow = (float) Math.pow(((double) f8) / Math.pow(1.64d - Math.pow(0.29d, (double) mVar2.f13091f), 0.73d), 1.1111111111111112d);
                double d9 = (double) ((this.f13056a * 3.1415927f) / 180.0f);
                float pow2 = mVar2.f13087a * ((float) Math.pow(((double) f10) / 100.0d, (1.0d / ((double) mVar2.f13090d)) / ((double) mVar2.f13094j)));
                float cos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f * 3846.1538f * mVar2.e * mVar2.f13089c;
                float f11 = pow2 / mVar2.f13088b;
                float sin = (float) Math.sin(d9);
                float cos2 = (float) Math.cos(d9);
                float f12 = 11.0f * pow * cos2;
                float f13 = (((0.305f + f11) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f12 + (cos * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f11 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float signum = Math.signum(f17);
                float f20 = 100.0f / mVar2.f13093h;
                float pow3 = signum * f20 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d));
                float signum2 = Math.signum(f18) * f20 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))))), 2.380952380952381d));
                float[] fArr = mVar2.f13092g;
                float f21 = pow3 / fArr[0];
                float f22 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f19) * f20) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = C1169b.f13062b;
                float[] fArr3 = fArr2[0];
                float f23 = fArr3[1] * f22;
                float f24 = (fArr3[2] * signum3) + f23 + (fArr3[0] * f21);
                float[] fArr4 = fArr2[1];
                float f25 = fArr4[1] * f22;
                float f26 = fArr4[2] * signum3;
                float[] fArr5 = fArr2[2];
                float f27 = f21 * fArr5[0];
                return C1195a.a((double) f24, (double) (f26 + f25 + (fArr4[0] * f21)), (double) ((signum3 * fArr5[2]) + (f22 * fArr5[1]) + f27));
            }
        }
        f8 = 0.0f;
        float pow4 = (float) Math.pow(((double) f8) / Math.pow(1.64d - Math.pow(0.29d, (double) mVar2.f13091f), 0.73d), 1.1111111111111112d);
        double d92 = (double) ((this.f13056a * 3.1415927f) / 180.0f);
        float pow22 = mVar2.f13087a * ((float) Math.pow(((double) f10) / 100.0d, (1.0d / ((double) mVar2.f13090d)) / ((double) mVar2.f13094j)));
        float cos3 = ((float) (Math.cos(2.0d + d92) + 3.8d)) * 0.25f * 3846.1538f * mVar2.e * mVar2.f13089c;
        float f112 = pow22 / mVar2.f13088b;
        float sin2 = (float) Math.sin(d92);
        float cos22 = (float) Math.cos(d92);
        float f122 = 11.0f * pow4 * cos22;
        float f132 = (((0.305f + f112) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f122 + (cos3 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f112 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float signum4 = Math.signum(f172);
        float f202 = 100.0f / mVar2.f13093h;
        float pow32 = signum4 * f202 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f172)) * 27.13d) / (400.0d - ((double) Math.abs(f172))))), 2.380952380952381d));
        float signum22 = Math.signum(f182) * f202 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f182)) * 27.13d) / (400.0d - ((double) Math.abs(f182))))), 2.380952380952381d));
        float[] fArr6 = mVar2.f13092g;
        float f212 = pow32 / fArr6[0];
        float f222 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f192) * f202) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f192)) * 27.13d) / (400.0d - ((double) Math.abs(f192))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = C1169b.f13062b;
        float[] fArr32 = fArr22[0];
        float f232 = fArr32[1] * f222;
        float f242 = (fArr32[2] * signum32) + f232 + (fArr32[0] * f212);
        float[] fArr42 = fArr22[1];
        float f252 = fArr42[1] * f222;
        float f262 = fArr42[2] * signum32;
        float[] fArr52 = fArr22[2];
        float f272 = f212 * fArr52[0];
        return C1195a.a((double) f242, (double) (f262 + f252 + (fArr42[0] * f212)), (double) ((signum32 * fArr52[2]) + (f222 * fArr52[1]) + f272));
    }
}
