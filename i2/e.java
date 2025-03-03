package I2;

import B2.i;
import H2.p;
import H2.q;
import V2.b;
import android.content.Context;
import android.net.Uri;
import android.os.Build;

public final class e implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2270a;

    /* renamed from: b  reason: collision with root package name */
    public final q f2271b;

    /* renamed from: c  reason: collision with root package name */
    public final q f2272c;

    /* renamed from: d  reason: collision with root package name */
    public final Class f2273d;

    public e(Context context, q qVar, q qVar2, Class cls) {
        this.f2270a = context.getApplicationContext();
        this.f2271b = qVar;
        this.f2272c = qVar2;
        this.f2273d = cls;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        Uri uri = (Uri) obj;
        return new p(new b(uri), new d(this.f2270a, this.f2271b, this.f2272c, uri, i, i8, iVar, this.f2273d));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT < 29 || !android.support.v4.media.session.b.u(uri)) {
            return false;
        }
        return true;
    }
}
