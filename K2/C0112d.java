package K2;

import D2.D;
import D2.z;
import E2.b;
import W2.f;
import W2.m;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: K2.d  reason: case insensitive filesystem */
public final class C0112d implements D, z {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2606U = 0;

    /* renamed from: V  reason: collision with root package name */
    public final Object f2607V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f2608W;

    public C0112d(b bVar, Bitmap bitmap) {
        f.c(bitmap, "Bitmap must not be null");
        this.f2607V = bitmap;
        f.c(bVar, "BitmapPool must not be null");
        this.f2608W = bVar;
    }

    public static C0112d b(b bVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0112d(bVar, bitmap);
    }

    public final void a() {
        switch (this.f2606U) {
            case 0:
                ((Bitmap) this.f2607V).prepareToDraw();
                return;
            default:
                D d8 = (D) this.f2608W;
                if (d8 instanceof z) {
                    ((z) d8).a();
                    return;
                }
                return;
        }
    }

    public final int c() {
        switch (this.f2606U) {
            case 0:
                return m.c((Bitmap) this.f2607V);
            default:
                return ((D) this.f2608W).c();
        }
    }

    public final Class d() {
        switch (this.f2606U) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public final void e() {
        switch (this.f2606U) {
            case 0:
                ((b) this.f2608W).h((Bitmap) this.f2607V);
                return;
            default:
                ((D) this.f2608W).e();
                return;
        }
    }

    public final Object get() {
        switch (this.f2606U) {
            case 0:
                return (Bitmap) this.f2607V;
            default:
                return new BitmapDrawable((Resources) this.f2607V, (Bitmap) ((D) this.f2608W).get());
        }
    }

    public C0112d(Resources resources, D d8) {
        f.c(resources, "Argument must not be null");
        this.f2607V = resources;
        f.c(d8, "Argument must not be null");
        this.f2608W = d8;
    }
}
