package z3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public float f16528a;

    /* renamed from: b  reason: collision with root package name */
    public float f16529b;

    /* renamed from: c  reason: collision with root package name */
    public float f16530c;

    /* renamed from: d  reason: collision with root package name */
    public float f16531d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f16532f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16533g = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f8) {
        float f9 = this.f16531d;
        if (f9 != f8) {
            float f10 = ((f8 - f9) + 360.0f) % 360.0f;
            if (f10 <= 180.0f) {
                float f11 = this.f16529b;
                float f12 = this.f16530c;
                p pVar = new p(f11, f12, f11, f12);
                pVar.f16521f = this.f16531d;
                pVar.f16522g = f10;
                this.f16533g.add(new n(pVar));
                this.f16531d = f8;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f16532f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [z3.q, z3.r, java.lang.Object] */
    public final void c(float f8, float f9) {
        ? rVar = new r();
        rVar.f16523b = f8;
        rVar.f16524c = f9;
        this.f16532f.add(rVar);
        o oVar = new o(rVar, this.f16529b, this.f16530c);
        a(oVar.b() + 270.0f);
        this.f16533g.add(oVar);
        this.f16531d = oVar.b() + 270.0f;
        this.f16529b = f8;
        this.f16530c = f9;
    }

    public final void d(float f8, float f9, float f10) {
        this.f16528a = f8;
        this.f16529b = 0.0f;
        this.f16530c = f8;
        this.f16531d = f9;
        this.e = (f9 + f10) % 360.0f;
        this.f16532f.clear();
        this.f16533g.clear();
    }
}
