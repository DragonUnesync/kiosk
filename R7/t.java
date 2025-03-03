package r7;

import E2.a;
import P6.f;
import P6.h;

public final class t extends a {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f15072W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ u f15073X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i) {
        super(3, (Object) null);
        this.f15072W = i;
        this.f15073X = uVar;
    }

    public final void a(h hVar, Object obj, Object obj2) {
        switch (this.f15072W) {
            case 0:
                f.e(hVar, "property");
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj;
                this.f15073X.f15074a &= -2;
                return;
            default:
                f.e(hVar, "property");
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                this.f15073X.f15074a &= -5;
                return;
        }
    }
}
