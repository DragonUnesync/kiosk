package H2;

import B2.i;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

public final class y implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1997a;

    /* renamed from: b  reason: collision with root package name */
    public final q f1998b;

    public /* synthetic */ y(q qVar, int i) {
        this.f1997a = i;
        this.f1998b = qVar;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        Uri uri;
        switch (this.f1997a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null) {
                    return null;
                }
                q qVar = this.f1998b;
                if (!qVar.b(uri)) {
                    return null;
                }
                return qVar.a(uri, i, i8, iVar);
            default:
                return this.f1998b.a(new g((URL) obj), i, i8, iVar);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f1997a) {
            case 0:
                String str = (String) obj;
                return true;
            default:
                URL url = (URL) obj;
                return true;
        }
    }
}
