package T7;

import j$.util.function.Consumer;
import java.util.function.Consumer;

public final /* synthetic */ class F implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5083a;

    public /* synthetic */ F(int i) {
        this.f5083a = i;
    }

    public final void accept(Object obj) {
        G g8 = (G) obj;
        switch (this.f5083a) {
            case 0:
                g8.f5088X = true;
                g8.f5089Y = true;
                return;
            case 1:
                g8.f5088X = false;
                g8.f5089Y = false;
                return;
            case 2:
                g8.f5090Z = true;
                return;
            case 3:
                g8.f5089Y = false;
                return;
            case 4:
                g8.f5092b0 = true;
                return;
            case 5:
                g8.f5093c0 = true;
                return;
            default:
                g8.f5094d0 = true;
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.f5083a;
        return Consumer.-CC.$default$andThen(this, consumer);
    }
}
