package T7;

import R7.b;
import S7.c;

public final class E {

    /* renamed from: c  reason: collision with root package name */
    public static final E f5079c = new E(false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final E f5080d = new E(true, true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5081a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5082b;

    public E(boolean z, boolean z6) {
        this.f5081a = z;
        this.f5082b = z6;
    }

    public final void a(c cVar) {
        if (cVar != null && !this.f5082b) {
            for (int i = 0; i < cVar.f4544U; i++) {
                String str = cVar.f4545V[i];
                if (!c.m(str)) {
                    cVar.f4545V[i] = b.a(str);
                }
            }
        }
    }

    public final String b(String str) {
        String trim = str.trim();
        if (!this.f5081a) {
            return b.a(trim);
        }
        return trim;
    }
}
