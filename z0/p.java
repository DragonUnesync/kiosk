package Z0;

import D1.m;
import M0.C0126n;
import M0.C0129q;
import M0.G;
import M0.H;
import M0.r;
import Y0.h;
import h1.X;
import java.util.Map;
import l1.e;

public final class p extends X {

    /* renamed from: H  reason: collision with root package name */
    public final Map f6877H;

    /* renamed from: I  reason: collision with root package name */
    public C0126n f6878I;

    public p(e eVar, h hVar, Y0.e eVar2, Map map) {
        super(eVar, hVar, eVar2);
        this.f6877H = map;
    }

    public final r n(r rVar) {
        int i;
        C0126n nVar;
        C0126n nVar2 = this.f6878I;
        if (nVar2 == null) {
            nVar2 = rVar.f3040r;
        }
        if (!(nVar2 == null || (nVar = (C0126n) this.f6877H.get(nVar2.f2975W)) == null)) {
            nVar2 = nVar;
        }
        H h5 = rVar.f3034l;
        H h8 = null;
        if (h5 != null) {
            G[] gArr = h5.f2837U;
            int length = gArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                }
                G g8 = gArr[i8];
                if ((g8 instanceof m) && "com.apple.streaming.transportStreamTimestamp".equals(((m) g8).f1019V)) {
                    break;
                }
                i8++;
            }
            if (i8 != -1) {
                if (length != 1) {
                    G[] gArr2 = new G[(length - 1)];
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 != i8) {
                            if (i9 < i8) {
                                i = i9;
                            } else {
                                i = i9 - 1;
                            }
                            gArr2[i] = gArr[i9];
                        }
                    }
                    h8 = new H(gArr2);
                }
            }
            if (!(nVar2 == rVar.f3040r && h5 == rVar.f3034l)) {
                C0129q a8 = rVar.a();
                a8.f3003q = nVar2;
                a8.f2997k = h5;
                rVar = new r(a8);
            }
            return super.n(rVar);
        }
        h5 = h8;
        C0129q a82 = rVar.a();
        a82.f3003q = nVar2;
        a82.f2997k = h5;
        rVar = new r(a82);
        return super.n(rVar);
    }
}
