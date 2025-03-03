package C3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import z3.f;
import z3.g;
import z3.k;

/* renamed from: C3.g  reason: case insensitive filesystem */
public final class C0031g extends f {

    /* renamed from: q  reason: collision with root package name */
    public final RectF f589q;

    public C0031g(k kVar, RectF rectF) {
        super(kVar);
        this.f589q = rectF;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [C3.i, z3.g, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable() {
        ? gVar = new g((f) this);
        gVar.f591r0 = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public C0031g(C0031g gVar) {
        super((f) gVar);
        this.f589q = gVar.f589q;
    }
}
