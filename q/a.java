package Q;

import B.C0003d;
import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import org.acra.collector.Collector;
import s7.C1409b;

public final class a implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3959U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f3960V;

    public /* synthetic */ a(int i, Object obj) {
        this.f3959U = i;
        this.f3960V = obj;
    }

    public final int compare(Object obj, Object obj2) {
        float f8;
        float f9;
        Collector.Order order;
        Collector.Order order2;
        switch (this.f3959U) {
            case 0:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f3960V;
                float floatValue = ((Rational) obj).floatValue();
                float floatValue2 = rational2.floatValue();
                if (floatValue > floatValue2) {
                    f8 = floatValue2 / floatValue;
                } else {
                    f8 = floatValue / floatValue2;
                }
                float floatValue3 = rational.floatValue();
                float floatValue4 = rational2.floatValue();
                if (floatValue3 > floatValue4) {
                    f9 = floatValue4 / floatValue3;
                } else {
                    f9 = floatValue3 / floatValue4;
                }
                return Float.compare(f9, f8);
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f9228l0).compareTo(Boolean.valueOf(materialButton2.f9228l0));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f3960V;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Collector collector = (Collector) obj;
                ((C1409b) this.f3960V).getClass();
                try {
                    order = collector.getOrder();
                } catch (Exception unused) {
                    order = Collector.Order.NORMAL;
                }
                try {
                    order2 = ((Collector) obj2).getOrder();
                } catch (Exception unused2) {
                    order2 = Collector.Order.NORMAL;
                }
                return C0003d.i(order, order2);
        }
    }
}
