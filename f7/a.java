package F7;

import j$.util.function.IntUnaryOperator;
import java.util.function.IntUnaryOperator;

public final /* synthetic */ class a implements IntUnaryOperator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f1593a;

    public /* synthetic */ a(b bVar) {
        this.f1593a = bVar;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator);
    }

    public final int applyAsInt(int i) {
        this.f1593a.getClass();
        if (i <= Integer.MAX_VALUE) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", new Object[]{Integer.valueOf(i), Integer.MAX_VALUE}));
    }

    public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator);
    }
}
