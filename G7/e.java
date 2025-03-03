package G7;

import M7.c;
import S7.p;
import S7.v;
import j$.util.Objects;
import j$.util.function.Predicate;
import java.util.function.Predicate;

public final /* synthetic */ class e implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1754a;

    public /* synthetic */ e(int i) {
        this.f1754a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f1754a;
        return Predicate.-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.f1754a) {
            case 0:
                return Predicate.-CC.$default$negate(this);
            case 1:
                return Predicate.-CC.$default$negate(this);
            case 2:
                return Predicate.-CC.$default$negate(this);
            default:
                return Predicate.-CC.$default$negate(this);
        }
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        int i = this.f1754a;
        return Predicate.-CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        switch (this.f1754a) {
            case 0:
                if (((g) obj) == g.f1757U) {
                    return true;
                }
                return false;
            case 1:
                if (g.f1757U == ((g) obj)) {
                    return true;
                }
                return false;
            case 2:
                return Objects.nonNull((c) obj);
            default:
                return v.class.isInstance((p) obj);
        }
    }
}
