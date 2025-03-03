package T7;

public enum h1 {
    ;
    

    /* renamed from: j1  reason: collision with root package name */
    public static final char[] f5224j1 = null;

    /* renamed from: k1  reason: collision with root package name */
    public static final char[] f5226k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    public static final String f5228l1 = null;

    static {
        f5224j1 = new char[]{9, 10, 12, 13, ' ', '\"', '\'', '/', '<', '=', '>'};
        f5226k1 = new char[]{0, 9, 10, 12, 13, ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        f5228l1 = String.valueOf(65533);
    }

    public static void a(Q q7, C0285a aVar, h1 h1Var, h1 h1Var2) {
        String str;
        char l8 = aVar.l();
        if (l8 == 0) {
            q7.n(h1Var);
            aVar.a();
            q7.f(65533);
        } else if (l8 == '<') {
            q7.a(h1Var2);
        } else if (l8 != 65535) {
            int i = aVar.f5144d;
            int i8 = aVar.e;
            char[] cArr = aVar.f5143c;
            int i9 = i;
            while (i9 < i8) {
                char c8 = cArr[i9];
                if (c8 == 0 || c8 == '<') {
                    break;
                }
                i9++;
            }
            aVar.f5144d = i9;
            if (i9 > i) {
                str = C0285a.c(aVar.f5143c, aVar.f5141a, i, i9 - i);
            } else {
                str = "";
            }
            q7.h(str);
        } else {
            q7.g(new L());
        }
    }

    public static void b(Q q7, C0285a aVar, h1 h1Var) {
        if (aVar.t()) {
            String h5 = aVar.h();
            q7.f5129k.v(h5);
            q7.f5127h.append(h5);
            return;
        }
        boolean o2 = q7.o();
        StringBuilder sb = q7.f5127h;
        if (o2 && !aVar.m()) {
            char e = aVar.e();
            if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ') {
                q7.p(f5174B0);
                return;
            } else if (e == '/') {
                q7.p(f5182J0);
                return;
            } else if (e != '>') {
                sb.append(e);
            } else {
                q7.l();
                q7.p(f5193U);
                return;
            }
        }
        q7.h("</");
        q7.i(sb);
        q7.p(h1Var);
    }

    public static void c(Q q7, C0285a aVar, h1 h1Var, h1 h1Var2) {
        if (aVar.t()) {
            String h5 = aVar.h();
            q7.f5127h.append(h5);
            q7.h(h5);
            return;
        }
        char e = aVar.e();
        if (e == 9 || e == 10 || e == 12 || e == 13 || e == ' ' || e == '/' || e == '>') {
            if (q7.f5127h.toString().equals("script")) {
                q7.p(h1Var);
            } else {
                q7.p(h1Var2);
            }
            q7.f(e);
            return;
        }
        aVar.y();
        q7.p(h1Var2);
    }

    public abstract void d(Q q7, C0285a aVar);
}
