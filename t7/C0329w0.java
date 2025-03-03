package T7;

/* 'enum' modifier removed */
/* renamed from: T7.w0  reason: case insensitive filesystem */
public final class C0329w0 extends h1 {
    public C0329w0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    public final void d(Q q7, C0285a aVar) {
        int v4 = aVar.v();
        String f8 = aVar.f(false);
        if (f8.length() > 0) {
            q7.f5129k.t(v4, aVar.v(), f8);
        } else {
            q7.f5129k.f5114g0 = true;
        }
        int v8 = aVar.v();
        char e = aVar.e();
        if (e == 0) {
            q7.n(this);
            q7.f5129k.r(65533, v8, aVar.v());
        } else if (e == '\"') {
            q7.p(h1.f5181I0);
        } else if (e == '&') {
            int[] c8 = q7.c('\"', true);
            if (c8 != null) {
                q7.f5129k.u(v8, aVar.v(), c8);
            } else {
                q7.f5129k.r('&', v8, aVar.v());
            }
        } else if (e != 65535) {
            q7.f5129k.r(e, v8, aVar.v());
        } else {
            q7.m(this);
            q7.p(h1.f5193U);
        }
    }
}
