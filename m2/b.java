package M2;

import A2.d;
import D2.D;
import D2.z;
import O2.c;
import O2.e;
import O2.g;
import W2.f;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.o;

public final class b implements D, z {

    /* renamed from: U  reason: collision with root package name */
    public final Drawable f3102U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f3103V;

    public b(Drawable drawable, int i) {
        this.f3103V = i;
        f.c(drawable, "Argument must not be null");
        this.f3102U = drawable;
    }

    private final void b() {
    }

    public void a() {
        switch (this.f3103V) {
            case 1:
                ((g) ((c) this.f3102U).f3610U.f3609b).f3634l.prepareToDraw();
                return;
            default:
                Drawable drawable = this.f3102U;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else if (drawable instanceof c) {
                    ((g) ((c) drawable).f3610U.f3609b).f3634l.prepareToDraw();
                    return;
                } else {
                    return;
                }
        }
    }

    public final int c() {
        switch (this.f3103V) {
            case 0:
                Drawable drawable = this.f3102U;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                g gVar = (g) ((c) this.f3102U).f3610U.f3609b;
                d dVar = gVar.f3625a;
                return (dVar.f66j.length * 4) + dVar.f62d.limit() + dVar.i.length + gVar.f3636n;
        }
    }

    public final Class d() {
        switch (this.f3103V) {
            case 0:
                return this.f3102U.getClass();
            default:
                return c.class;
        }
    }

    public final void e() {
        E2.g gVar;
        E2.g gVar2;
        E2.g gVar3;
        switch (this.f3103V) {
            case 0:
                return;
            default:
                c cVar = (c) this.f3102U;
                cVar.stop();
                cVar.f3613X = true;
                g gVar4 = (g) cVar.f3610U.f3609b;
                gVar4.f3627c.clear();
                Bitmap bitmap = gVar4.f3634l;
                if (bitmap != null) {
                    gVar4.e.h(bitmap);
                    gVar4.f3634l = null;
                }
                gVar4.f3629f = false;
                e eVar = gVar4.i;
                o oVar = gVar4.f3628d;
                if (eVar != null) {
                    oVar.n(eVar);
                    gVar4.i = null;
                }
                e eVar2 = gVar4.f3633k;
                if (eVar2 != null) {
                    oVar.n(eVar2);
                    gVar4.f3633k = null;
                }
                e eVar3 = gVar4.f3635m;
                if (eVar3 != null) {
                    oVar.n(eVar3);
                    gVar4.f3635m = null;
                }
                d dVar = gVar4.f3625a;
                dVar.f68l = null;
                byte[] bArr = dVar.i;
                A1.d dVar2 = dVar.f61c;
                if (!(bArr == null || (gVar3 = (E2.g) dVar2.f36W) == null)) {
                    gVar3.h(bArr);
                }
                int[] iArr = dVar.f66j;
                if (!(iArr == null || (gVar2 = (E2.g) dVar2.f36W) == null)) {
                    gVar2.h(iArr);
                }
                Bitmap bitmap2 = dVar.f69m;
                if (bitmap2 != null) {
                    ((E2.b) dVar2.f35V).h(bitmap2);
                }
                dVar.f69m = null;
                dVar.f62d = null;
                dVar.f75s = null;
                byte[] bArr2 = dVar.e;
                if (!(bArr2 == null || (gVar = (E2.g) dVar2.f36W) == null)) {
                    gVar.h(bArr2);
                }
                gVar4.f3632j = true;
                return;
        }
    }

    public final Object get() {
        Drawable drawable = this.f3102U;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return drawable;
        }
        return constantState.newDrawable();
    }
}
