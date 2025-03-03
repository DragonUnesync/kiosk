package E6;

import P6.f;
import j$.util.Comparator;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class a implements Comparator, j$.util.Comparator {

    /* renamed from: V  reason: collision with root package name */
    public static final a f1375V = new a(0);

    /* renamed from: W  reason: collision with root package name */
    public static final a f1376W = new a(1);

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1377U;

    public /* synthetic */ a(int i) {
        this.f1377U = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f1377U) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                f.e(comparable, "a");
                f.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                f.e(comparable3, "a");
                f.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    public final Comparator reversed() {
        switch (this.f1377U) {
            case 0:
                return f1376W;
            default:
                return f1375V;
        }
    }

    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        int i = this.f1377U;
        return Comparator.-CC.$default$thenComparing(this, comparator);
    }

    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        int i = this.f1377U;
        return Comparator.-CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        int i = this.f1377U;
        return Comparator.-CC.$default$thenComparingInt(this, toIntFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        int i = this.f1377U;
        return Comparator.-CC.$default$thenComparingLong(this, toLongFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        int i = this.f1377U;
        return Comparator.-CC.$default$thenComparing(this, function);
    }

    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        int i = this.f1377U;
        return Comparator.-CC.$default$thenComparing(this, function, comparator);
    }
}
