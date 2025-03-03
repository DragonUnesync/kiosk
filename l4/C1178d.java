package l4;

import V4.f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: l4.d  reason: case insensitive filesystem */
public final class C1178d implements C1175a {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f13196a;

    public C1178d(Class cls) {
        this.f13196a = LoggerFactory.getLogger(cls);
    }

    public final void a(f fVar) {
        this.f13196a.error("DUP flag must be set for a resent PUBLISH ({})", fVar);
    }

    public final void b(String str, Object obj, Comparable comparable) {
        this.f13196a.warn(str, obj, comparable);
    }

    public final void error(String str) {
        this.f13196a.error(str);
    }

    public final void warn(String str) {
        this.f13196a.warn(str);
    }

    public final void error(String str, Throwable th) {
        this.f13196a.error(str, th);
    }

    public final void warn(String str, Object obj) {
        this.f13196a.warn(str, obj);
    }

    public final void error(String str, Object obj, Object obj2) {
        this.f13196a.error(str, obj, obj2);
    }
}
