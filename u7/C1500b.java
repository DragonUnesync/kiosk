package u7;

import P6.f;
import W6.a;
import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.b;
import g7.C0996d;
import java.io.FilterOutputStream;
import java.util.Map;
import org.acra.attachment.AcraContentProvider;
import org.acra.sender.HttpSender$Method;
import r7.C1395d;

/* renamed from: u7.b  reason: case insensitive filesystem */
public final class C1500b extends C1499a {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f15825j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final Object f15826k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1500b(C1395d dVar, Context context, HttpSender$Method httpSender$Method, String str, String str2, String str3, int i, int i8, Map map) {
        super(dVar, context, httpSender$Method, str2, str3, i, i8, map);
        f.e(dVar, "config");
        f.e(context, "context");
        f.e(httpSender$Method, "method");
        f.e(str, "contentType");
        this.f15826k = str;
    }

    public final String b(Context context, Object obj) {
        String type;
        switch (this.f15825j) {
            case 0:
                Uri uri = (Uri) obj;
                f.e(context, "context");
                f.e(uri, "uri");
                if (f.a(uri.getScheme(), "content") && (type = context.getContentResolver().getType(uri)) != null) {
                    return type;
                }
                String[] strArr = AcraContentProvider.f14285V;
                return C0996d.i(uri);
            default:
                f.e(context, "context");
                f.e((String) obj, "t");
                return (String) this.f15826k;
        }
    }

    public final void e(FilterOutputStream filterOutputStream, Object obj) {
        switch (this.f15825j) {
            case 0:
                Uri uri = (Uri) obj;
                f.e(uri, "content");
                b.i((Context) this.f15826k, filterOutputStream, uri);
                return;
            default:
                String str = (String) obj;
                f.e(str, "content");
                byte[] bytes = str.getBytes(a.f6191a);
                f.d(bytes, "getBytes(...)");
                filterOutputStream.write(bytes);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1500b(C1395d dVar, Context context, String str, String str2, int i, int i8, Map map) {
        super(dVar, context, HttpSender$Method.PUT, str, str2, i, i8, map);
        f.e(dVar, "config");
        f.e(context, "context");
        this.f15826k = context;
    }
}
