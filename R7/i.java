package r7;

import E2.a;
import P6.f;
import P6.h;
import java.util.List;
import java.util.Map;
import org.acra.sender.HttpSender$Method;

public final class i extends a {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f15024W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ j f15025X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i) {
        super(3, (Object) null);
        this.f15024W = i;
        this.f15025X = jVar;
    }

    public final void a(h hVar, Object obj, Object obj2) {
        switch (this.f15024W) {
            case 0:
                f.e(hVar, "property");
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                this.f15025X.f15027a &= -1025;
                return;
            case 1:
                f.e(hVar, "property");
                String str = (String) obj2;
                String str2 = (String) obj;
                this.f15025X.f15027a &= -2049;
                return;
            case 2:
                f.e(hVar, "property");
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj;
                this.f15025X.f15027a &= -4097;
                return;
            case 3:
                f.e(hVar, "property");
                Boolean bool3 = (Boolean) obj2;
                Boolean bool4 = (Boolean) obj;
                this.f15025X.f15027a &= -8193;
                return;
            case 4:
                f.e(hVar, "property");
                List list = (List) obj2;
                List list2 = (List) obj;
                this.f15025X.f15027a &= -16385;
                return;
            case 5:
                f.e(hVar, "property");
                Map map = (Map) obj2;
                Map map2 = (Map) obj;
                this.f15025X.f15027a &= -32769;
                return;
            case 6:
                f.e(hVar, "property");
                Boolean bool5 = (Boolean) obj2;
                Boolean bool6 = (Boolean) obj;
                this.f15025X.f15027a &= -2;
                return;
            case 7:
                f.e(hVar, "property");
                String str3 = (String) obj2;
                String str4 = (String) obj;
                this.f15025X.f15027a &= -5;
                return;
            case 8:
                f.e(hVar, "property");
                String str5 = (String) obj2;
                String str6 = (String) obj;
                this.f15025X.f15027a &= -9;
                return;
            case 9:
                f.e(hVar, "property");
                HttpSender$Method httpSender$Method = (HttpSender$Method) obj2;
                HttpSender$Method httpSender$Method2 = (HttpSender$Method) obj;
                this.f15025X.f15027a &= -17;
                return;
            case 10:
                f.e(hVar, "property");
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj;
                this.f15025X.f15027a &= -33;
                return;
            case 11:
                f.e(hVar, "property");
                Integer num5 = (Integer) obj2;
                Integer num6 = (Integer) obj;
                this.f15025X.f15027a &= -65;
                return;
            case 12:
                f.e(hVar, "property");
                Boolean bool7 = (Boolean) obj2;
                Boolean bool8 = (Boolean) obj;
                this.f15025X.f15027a &= -129;
                return;
            case 13:
                f.e(hVar, "property");
                Class cls = (Class) obj2;
                Class cls2 = (Class) obj;
                this.f15025X.f15027a &= -257;
                return;
            default:
                f.e(hVar, "property");
                String str7 = (String) obj2;
                String str8 = (String) obj;
                this.f15025X.f15027a &= -513;
                return;
        }
    }
}
