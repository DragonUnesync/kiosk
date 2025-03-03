package r7;

import E2.a;
import P6.f;
import P6.h;
import java.util.concurrent.TimeUnit;

public final class l extends a {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f15052W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ m f15053X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i) {
        super(3, (Object) null);
        this.f15052W = i;
        this.f15053X = mVar;
    }

    public final void a(h hVar, Object obj, Object obj2) {
        switch (this.f15052W) {
            case 0:
                f.e(hVar, "property");
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj;
                this.f15053X.f15055a &= -513;
                return;
            case 1:
                f.e(hVar, "property");
                Boolean bool3 = (Boolean) obj2;
                Boolean bool4 = (Boolean) obj;
                this.f15053X.f15055a &= -2;
                return;
            case 2:
                f.e(hVar, "property");
                TimeUnit timeUnit = (TimeUnit) obj2;
                TimeUnit timeUnit2 = (TimeUnit) obj;
                this.f15053X.f15055a &= -3;
                return;
            case 3:
                f.e(hVar, "property");
                Long l8 = (Long) obj2;
                Long l9 = (Long) obj;
                this.f15053X.f15055a &= -5;
                return;
            case 4:
                f.e(hVar, "property");
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                this.f15053X.f15055a &= -9;
                return;
            case 5:
                f.e(hVar, "property");
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj;
                this.f15053X.f15055a &= -17;
                return;
            case 6:
                f.e(hVar, "property");
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj;
                this.f15053X.f15055a &= -33;
                return;
            case 7:
                f.e(hVar, "property");
                Integer num7 = (Integer) obj2;
                Integer num8 = (Integer) obj;
                this.f15053X.f15055a &= -65;
                return;
            case 8:
                f.e(hVar, "property");
                String str = (String) obj2;
                String str2 = (String) obj;
                this.f15053X.f15055a &= -129;
                return;
            default:
                f.e(hVar, "property");
                Boolean bool5 = (Boolean) obj2;
                Boolean bool6 = (Boolean) obj;
                this.f15053X.f15055a &= -257;
                return;
        }
    }
}
