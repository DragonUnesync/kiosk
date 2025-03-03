package O2;

import B2.m;
import D2.D;
import K2.C0112d;
import W2.f;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import java.security.MessageDigest;

public final class d implements m {

    /* renamed from: b  reason: collision with root package name */
    public final m f3620b;

    public d(m mVar) {
        f.c(mVar, "Argument must not be null");
        this.f3620b = mVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f3620b.a(messageDigest);
    }

    public final D b(Context context, D d8, int i, int i8) {
        c cVar = (c) d8.get();
        C0112d dVar = new C0112d(b.a(context).f8970V, ((g) cVar.f3610U.f3609b).f3634l);
        m mVar = this.f3620b;
        D b8 = mVar.b(context, dVar, i, i8);
        if (!dVar.equals(b8)) {
            dVar.e();
        }
        ((g) cVar.f3610U.f3609b).c(mVar, (Bitmap) b8.get());
        return d8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3620b.equals(((d) obj).f3620b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3620b.hashCode();
    }
}
