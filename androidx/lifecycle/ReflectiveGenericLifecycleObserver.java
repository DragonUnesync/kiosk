package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final q f8132U;

    /* renamed from: V  reason: collision with root package name */
    public final C0474a f8133V;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f8132U = qVar;
        C0476c cVar = C0476c.f8140c;
        Class<?> cls = qVar.getClass();
        C0474a aVar = (C0474a) cVar.f8141a.get(cls);
        this.f8133V = aVar == null ? cVar.a(cls, (Method[]) null) : aVar;
    }

    public final void c(r rVar, C0485l lVar) {
        HashMap hashMap = this.f8133V.f8136a;
        q qVar = this.f8132U;
        C0474a.a((List) hashMap.get(lVar), rVar, lVar, qVar);
        C0474a.a((List) hashMap.get(C0485l.ON_ANY), rVar, lVar, qVar);
    }
}
