package U7;

import S7.k;
import j$.util.function.Function;
import java.util.function.Function;

public final /* synthetic */ class s implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f5464a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f5465b;

    public /* synthetic */ s(h hVar, k kVar) {
        this.f5464a = hVar;
        this.f5465b = kVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.-CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((p) this.f5464a.f5446b).b(this.f5465b, (k) obj));
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return Function.-CC.$default$compose(this, function);
    }
}
