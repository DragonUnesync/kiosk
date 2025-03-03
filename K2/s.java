package K2;

import B2.m;
import D2.D;
import E2.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

public final class s implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f2637b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2638c;

    public s(m mVar, boolean z) {
        this.f2637b = mVar;
        this.f2638c = z;
    }

    public final void a(MessageDigest messageDigest) {
        this.f2637b.a(messageDigest);
    }

    public final D b(Context context, D d8, int i, int i8) {
        b bVar = com.bumptech.glide.b.a(context).f8970V;
        Drawable drawable = (Drawable) d8.get();
        C0112d a8 = r.a(bVar, drawable, i, i8);
        if (a8 != null) {
            D b8 = this.f2637b.b(context, a8, i, i8);
            if (!b8.equals(a8)) {
                return new C0112d(context.getResources(), b8);
            }
            b8.e();
            return d8;
        } else if (!this.f2638c) {
            return d8;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f2637b.equals(((s) obj).f2637b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2637b.hashCode();
    }
}
