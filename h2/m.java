package H2;

import B2.i;
import C2.a;
import K2.D;
import V2.b;
import android.content.Context;
import android.net.Uri;

public final class m implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1970a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1971b;

    public m(Context context, int i) {
        this.f1970a = i;
        switch (i) {
            case 1:
                this.f1971b = context.getApplicationContext();
                return;
            case 2:
                this.f1971b = context.getApplicationContext();
                return;
            default:
                this.f1971b = context;
                return;
        }
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        Long l8;
        switch (this.f1970a) {
            case 0:
                Uri uri = (Uri) obj;
                return new p(new b(uri), new l(this.f1971b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i8 == Integer.MIN_VALUE || i > 512 || i8 > 384) {
                    return null;
                }
                b bVar = new b(uri2);
                Context context = this.f1971b;
                return new p(bVar, C2.b.c(context, uri2, new a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i8 == Integer.MIN_VALUE || i > 512 || i8 > 384 || (l8 = (Long) iVar.c(D.f2592d)) == null || l8.longValue() != -1) {
                    return null;
                }
                b bVar2 = new b(uri3);
                Context context2 = this.f1971b;
                return new p(bVar2, C2.b.c(context2, uri3, new a(context2.getContentResolver(), 1)));
        }
    }

    public final boolean b(Object obj) {
        switch (this.f1970a) {
            case 0:
                return android.support.v4.media.session.b.u((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!android.support.v4.media.session.b.u(uri) || uri.getPathSegments().contains("video")) {
                    return false;
                }
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if (!android.support.v4.media.session.b.u(uri2) || !uri2.getPathSegments().contains("video")) {
                    return false;
                }
                return true;
        }
    }
}
