package H2;

import B2.i;
import V2.b;
import android.net.Uri;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.data.e;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class C implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f1937b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));

    /* renamed from: a  reason: collision with root package name */
    public final Object f1938a;

    public C(B b8) {
        this.f1938a = b8;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        e eVar;
        Uri uri = (Uri) obj;
        b bVar = new b(uri);
        B b8 = (B) this.f1938a;
        switch (b8.f1935U) {
            case 0:
                eVar = new a(b8.f1936V, uri, 0);
                break;
            case 1:
                eVar = new a(b8.f1936V, uri, 1);
                break;
            default:
                eVar = new com.bumptech.glide.load.data.b(1, uri, b8.f1936V);
                break;
        }
        return new p(bVar, eVar);
    }

    public final boolean b(Object obj) {
        return f1937b.contains(((Uri) obj).getScheme());
    }
}
