package U7;

import S7.k;
import j$.util.function.Predicate;
import java.util.function.Predicate;

public final /* synthetic */ class e implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f5440a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f5441b;

    public /* synthetic */ e(p pVar, k kVar) {
        this.f5440a = pVar;
        this.f5441b = kVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return Predicate.-CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return this.f5440a.b(this.f5441b, (k) obj);
    }
}
