package H2;

import B2.i;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class D implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f1939b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final q f1940a;

    public D(q qVar) {
        this.f1940a = qVar;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        return this.f1940a.a(new g(((Uri) obj).toString()), i, i8, iVar);
    }

    public final boolean b(Object obj) {
        return f1939b.contains(((Uri) obj).getScheme());
    }
}
