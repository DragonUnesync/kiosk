package R7;

import Q7.g;
import j$.util.function.BiFunction;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final /* synthetic */ class f implements BinaryOperator {
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.-CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        String h5 = h.h(gVar2.f4368a);
        gVar2.f4368a = null;
        g.D(gVar.f4368a);
        gVar.f4368a.append(h5);
        return gVar;
    }
}
