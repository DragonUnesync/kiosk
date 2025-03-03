package U7;

import E7.d;
import E7.e;
import Q7.g;
import R7.b;
import S7.k;
import j$.util.Map;
import java.util.IdentityHashMap;

public abstract class h extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5445a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5446b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5447c;

    public h(p pVar) {
        this.f5445a = 1;
        this.f5447c = new e(new d(9), 4);
        this.f5446b = pVar;
    }

    public void c() {
        switch (this.f5445a) {
            case 1:
                ((IdentityHashMap) ((e) this.f5447c).get()).clear();
                return;
            default:
                return;
        }
    }

    public boolean d(k kVar, k kVar2) {
        return ((Boolean) Map.-EL.computeIfAbsent((java.util.Map) Map.-EL.computeIfAbsent((java.util.Map) ((e) this.f5447c).get(), kVar, b.f4359b), kVar2, new s(this, kVar))).booleanValue();
    }

    public h(String str, String str2, boolean z) {
        String str3;
        this.f5445a = 0;
        g.A(str);
        g.A(str2);
        this.f5446b = b.b(str);
        boolean z6 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z6 ? str2.substring(1, str2.length() - 1) : str2;
        if (z) {
            str3 = b.b(str2);
        } else {
            str3 = z6 ? b.a(str2) : b.b(str2);
        }
        this.f5447c = str3;
    }
}
