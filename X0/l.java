package X0;

import H3.O;
import H3.P;
import M0.r;
import W0.h;
import android.net.Uri;
import java.util.ArrayList;

public final class l extends m {

    /* renamed from: Z  reason: collision with root package name */
    public final j f6256Z;

    /* renamed from: a0  reason: collision with root package name */
    public final P f6257a0;

    public l(long j7, r rVar, O o2, r rVar2, ArrayList arrayList) {
        super(rVar, o2, rVar2, arrayList);
        j jVar;
        Uri.parse(((b) o2.get(0)).f6210a);
        P p3 = null;
        long j8 = rVar2.e;
        if (j8 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar2.f6273d, j8, (String) null);
        }
        this.f6256Z = jVar;
        this.f6257a0 = jVar == null ? new P((Object) new j(0, -1, (String) null)) : p3;
    }

    public final String a() {
        return null;
    }

    public final h c() {
        return this.f6257a0;
    }

    public final j d() {
        return this.f6256Z;
    }
}
