package z3;

import com.bumptech.glide.c;

public final class i extends c {
    public final void n(t tVar, float f8, float f9) {
        tVar.d(f9 * f8, 180.0f, 90.0f);
        float f10 = f9 * 2.0f * f8;
        p pVar = new p(0.0f, 0.0f, f10, f10);
        pVar.f16521f = 180.0f;
        pVar.f16522g = 90.0f;
        tVar.f16532f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f16533g.add(nVar);
        tVar.f16531d = 270.0f;
        float f11 = (0.0f + f10) * 0.5f;
        float f12 = (f10 - 0.0f) / 2.0f;
        double d8 = (double) 270.0f;
        tVar.f16529b = (((float) Math.cos(Math.toRadians(d8))) * f12) + f11;
        tVar.f16530c = (f12 * ((float) Math.sin(Math.toRadians(d8)))) + f11;
    }
}
