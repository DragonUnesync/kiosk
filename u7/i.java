package U7;

import N.e;
import R7.b;
import S7.k;

public final class i extends h {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, String str, String str2, boolean z) {
        super(str, str2, z);
        this.f5448d = i;
    }

    public final int a() {
        switch (this.f5448d) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public final boolean b(k kVar, k kVar2) {
        switch (this.f5448d) {
            case 0:
                String str = (String) this.f5446b;
                if (kVar2.l(str)) {
                    if (((String) this.f5447c).equalsIgnoreCase(kVar2.c(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = (String) this.f5446b;
                if (!kVar2.l(str2) || !b.a(kVar2.c(str2)).contains((String) this.f5447c)) {
                    return false;
                }
                return true;
            case 2:
                String str3 = (String) this.f5446b;
                if (!kVar2.l(str3) || !b.a(kVar2.c(str3)).endsWith((String) this.f5447c)) {
                    return false;
                }
                return true;
            case 3:
                return !((String) this.f5447c).equalsIgnoreCase(kVar2.c((String) this.f5446b));
            default:
                String str4 = (String) this.f5446b;
                if (!kVar2.l(str4) || !b.a(kVar2.c(str4)).startsWith((String) this.f5447c)) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        switch (this.f5448d) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                sb.append((String) this.f5446b);
                sb.append("=");
                return e.A(sb, (String) this.f5447c, "]");
            case 1:
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append((String) this.f5446b);
                sb2.append("*=");
                return e.A(sb2, (String) this.f5447c, "]");
            case 2:
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append((String) this.f5446b);
                sb3.append("$=");
                return e.A(sb3, (String) this.f5447c, "]");
            case 3:
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append((String) this.f5446b);
                sb4.append("!=");
                return e.A(sb4, (String) this.f5447c, "]");
            default:
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append((String) this.f5446b);
                sb5.append("^=");
                return e.A(sb5, (String) this.f5447c, "]");
        }
    }
}
