package T7;

/* 'enum' modifier removed */
public final class S extends h1 {
    public S() {
        super("TagName", 9);
    }

    public final void d(Q q7, C0285a aVar) {
        String str;
        aVar.b();
        int i = aVar.f5144d;
        int i8 = aVar.e;
        char[] cArr = aVar.f5143c;
        int i9 = i;
        while (i9 < i8 && (r11 = cArr[i9]) != 9 && r11 != 10 && r11 != 12 && r11 != 13 && r11 != ' ' && r11 != '/' && r11 != '>') {
            i9++;
        }
        aVar.f5144d = i9;
        if (i9 > i) {
            str = C0285a.c(aVar.f5143c, aVar.f5141a, i, i9 - i);
        } else {
            str = "";
        }
        q7.f5129k.v(str);
        char e = aVar.e();
        if (e != 0) {
            if (e != ' ') {
                if (e != '/') {
                    C0290c0 c0Var = h1.f5193U;
                    if (e == '>') {
                        q7.l();
                        q7.p(c0Var);
                        return;
                    } else if (e == 65535) {
                        q7.m(this);
                        q7.p(c0Var);
                        return;
                    } else if (!(e == 9 || e == 10 || e == 12 || e == 13)) {
                        O o2 = q7.f5129k;
                        o2.getClass();
                        o2.v(String.valueOf(e));
                        return;
                    }
                } else {
                    q7.p(h1.f5182J0);
                    return;
                }
            }
            q7.p(h1.f5174B0);
            return;
        }
        q7.f5129k.v(h1.f5228l1);
    }
}
