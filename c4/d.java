package C4;

import U7.p;
import Z4.a;
import java.util.function.ToIntFunction;

public final /* synthetic */ class d implements ToIntFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f696a;

    public /* synthetic */ d(int i) {
        this.f696a = i;
    }

    public final int applyAsInt(Object obj) {
        switch (this.f696a) {
            case 0:
                if (obj instanceof f) {
                    return ((f) obj).f704Z.f2712d;
                }
                return ((a) obj).f2707f;
            case 1:
                return ((D4.d) obj).f1224X;
            case 2:
                return ((F4.a) obj).f1532W;
            default:
                return ((p) obj).a();
        }
    }
}
