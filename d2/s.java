package D2;

import S2.f;
import java.util.concurrent.Executor;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final f f1152a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f1153b;

    public s(f fVar, Executor executor) {
        this.f1152a = fVar;
        this.f1153b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f1152a.equals(((s) obj).f1152a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1152a.hashCode();
    }
}
