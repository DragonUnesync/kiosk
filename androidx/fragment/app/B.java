package androidx.fragment.app;

import android.content.res.Configuration;
import j0.i;
import j0.o;
import u0.C1486a;

public final /* synthetic */ class B implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7834a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L f7835b;

    public /* synthetic */ B(L l8, int i) {
        this.f7834a = i;
        this.f7835b = l8;
    }

    public final void accept(Object obj) {
        switch (this.f7834a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                L l8 = this.f7835b;
                if (l8.M()) {
                    l8.i(false);
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) obj;
                L l9 = this.f7835b;
                if (l9.M() && num.intValue() == 80) {
                    l9.m(false);
                    return;
                }
                return;
            case 2:
                i iVar = (i) obj;
                L l10 = this.f7835b;
                if (l10.M()) {
                    l10.n(iVar.f12836a, false);
                    return;
                }
                return;
            default:
                o oVar = (o) obj;
                L l11 = this.f7835b;
                if (l11.M()) {
                    l11.s(oVar.f12841a, false);
                    return;
                }
                return;
        }
    }
}
