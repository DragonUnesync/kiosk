package D2;

import W2.f;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: D2.c  reason: case insensitive filesystem */
public final class C0074c extends WeakReference {

    /* renamed from: a  reason: collision with root package name */
    public final v f1063a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1064b;

    /* renamed from: c  reason: collision with root package name */
    public D f1065c = null;

    public C0074c(v vVar, w wVar, ReferenceQueue referenceQueue) {
        super(wVar, referenceQueue);
        f.c(vVar, "Argument must not be null");
        this.f1063a = vVar;
        boolean z = wVar.f1185U;
        this.f1064b = z;
    }
}
