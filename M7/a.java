package M7;

import T7.G;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3177b;

    public /* synthetic */ a(int i, Object obj) {
        this.f3176a = i;
        this.f3177b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f3176a) {
            case 0:
                ((ArrayList) this.f3177b).add((c) obj);
                return;
            default:
                ((G) obj).f5087W = (String) ((Map.Entry) this.f3177b).getKey();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.f3176a;
        return Consumer.-CC.$default$andThen(this, consumer);
    }
}
