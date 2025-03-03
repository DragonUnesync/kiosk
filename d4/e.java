package D4;

import a5.C0426a;
import java.util.function.BooleanSupplier;

public final class e extends d implements BooleanSupplier {

    /* renamed from: Y  reason: collision with root package name */
    public final C0426a f1225Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1226Z;

    public e(C0426a aVar, a aVar2) {
        super(aVar2);
        this.f1225Y = aVar;
    }

    public final boolean getAsBoolean() {
        int i = this.f1226Z + 1;
        this.f1226Z = i;
        if (i == 2) {
            return true;
        }
        return false;
    }
}
