package f7;

import N.e;
import b7.C0595a;
import java.io.IOException;

public final class j extends C0595a {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f11725f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f11726g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f11727h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i8, int i9) {
        super(str, true);
        this.e = i9;
        this.f11725f = oVar;
        this.f11726g = i;
        this.f11727h = i8;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                int i = this.f11726g;
                int i8 = this.f11727h;
                o oVar = this.f11725f;
                oVar.getClass();
                try {
                    oVar.f11759q0.p(i, i8, true);
                    return -1;
                } catch (IOException e8) {
                    oVar.k(2, 2, e8);
                    return -1;
                }
            case 1:
                z zVar = this.f11725f.f11748e0;
                int i9 = this.f11727h;
                zVar.getClass();
                e.E(i9, "errorCode");
                synchronized (this.f11725f) {
                    this.f11725f.f11761s0.remove(Integer.valueOf(this.f11726g));
                }
                return -1;
            default:
                o oVar2 = this.f11725f;
                try {
                    int i10 = this.f11726g;
                    int i11 = this.f11727h;
                    oVar2.getClass();
                    e.E(i11, "statusCode");
                    oVar2.f11759q0.q(i10, i11);
                    return -1;
                } catch (IOException e9) {
                    oVar2.k(2, 2, e9);
                    return -1;
                }
        }
    }
}
