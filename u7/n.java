package U7;

import S7.h;
import S7.k;
import S7.p;

public class n extends p {

    /* renamed from: a  reason: collision with root package name */
    public final int f5453a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5454b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5455c;

    public n(int i, int i8, int i9) {
        this.f5455c = i9;
        this.f5453a = i;
        this.f5454b = i8;
    }

    public final boolean b(k kVar, k kVar2) {
        int i;
        k kVar3 = (k) kVar2.f4578U;
        if (kVar3 == null || (kVar3 instanceof h)) {
            return false;
        }
        switch (this.f5455c) {
            case 0:
                i = kVar2.H() + 1;
                break;
            case 1:
                k kVar4 = (k) kVar2.f4578U;
                if (kVar4 != null) {
                    i = kVar4.E().size() - kVar2.H();
                    break;
                } else {
                    i = 0;
                    break;
                }
            case 2:
                i = 0;
                if (((k) kVar2.f4578U) != null) {
                    for (k kVar5 = kVar2; kVar5 != null; kVar5 = kVar5.J()) {
                        if (kVar5.f4559X.f5086V.equals(kVar2.f4559X.f5086V)) {
                            i++;
                        }
                    }
                    break;
                }
                break;
            default:
                k kVar6 = (k) kVar2.f4578U;
                i = 0;
                if (kVar6 != null) {
                    int size = kVar6.f4561Z.size();
                    int i8 = 0;
                    while (i < size) {
                        p pVar = (p) kVar6.k().get(i);
                        if (pVar.r().equals(kVar2.f4559X.f5086V)) {
                            i8++;
                        }
                        if (pVar == kVar2) {
                            i = i8;
                            break;
                        } else {
                            i++;
                        }
                    }
                    i = i8;
                }
                break;
        }
        int i9 = this.f5454b;
        int i10 = this.f5453a;
        if (i10 != 0) {
            int i11 = i - i9;
            if (i11 * i10 < 0 || i11 % i10 != 0) {
                return false;
            }
            return true;
        } else if (i == i9) {
            return true;
        } else {
            return false;
        }
    }

    public final String d() {
        switch (this.f5455c) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.f5454b;
        int i8 = this.f5453a;
        if (i8 == 0) {
            return String.format(":%s(%d)", new Object[]{d(), Integer.valueOf(i)});
        } else if (i == 0) {
            return String.format(":%s(%dn)", new Object[]{d(), Integer.valueOf(i8)});
        } else {
            return String.format(":%s(%dn%+d)", new Object[]{d(), Integer.valueOf(i8), Integer.valueOf(i)});
        }
    }
}
