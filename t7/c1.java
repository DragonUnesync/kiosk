package T7;

import Q0.d;

/* 'enum' modifier removed */
public final class c1 extends h1 {
    public c1() {
        super("CdataSection", 66);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [Q0.d, T7.I] */
    public final void d(Q q7, C0285a aVar) {
        String str;
        int u3 = aVar.u("]]>");
        if (u3 != -1) {
            str = C0285a.c(aVar.f5143c, aVar.f5141a, aVar.f5144d, u3);
            aVar.f5144d += u3;
        } else {
            int i = aVar.e;
            int i8 = aVar.f5144d;
            if (i - i8 < 3) {
                aVar.b();
                char[] cArr = aVar.f5143c;
                String[] strArr = aVar.f5141a;
                int i9 = aVar.f5144d;
                str = C0285a.c(cArr, strArr, i9, aVar.e - i9);
                aVar.f5144d = aVar.e;
            } else {
                int i10 = i - 2;
                str = C0285a.c(aVar.f5143c, aVar.f5141a, i8, i10 - i8);
                aVar.f5144d = i10;
            }
        }
        q7.f5127h.append(str);
        if (aVar.o("]]>") || aVar.m()) {
            String sb = q7.f5127h.toString();
            ? dVar = new d(5, 2);
            dVar.f5095W = sb;
            q7.g(dVar);
            q7.p(h1.f5193U);
        }
    }
}
