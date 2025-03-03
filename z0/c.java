package Z0;

import E.e;
import K1.i;
import M0.C0129q;
import M0.I;
import M0.r;
import java.util.ArrayList;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f6776c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a  reason: collision with root package name */
    public i f6777a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6778b;

    public static void a(int i, ArrayList arrayList) {
        if (e.r(i, 0, 7, f6776c) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final r b(r rVar) {
        String str;
        if (!this.f6778b || !this.f6777a.a(rVar)) {
            return rVar;
        }
        C0129q a8 = rVar.a();
        a8.f2999m = I.o("application/x-media3-cues");
        a8.f2985H = this.f6777a.o(rVar);
        StringBuilder sb = new StringBuilder();
        sb.append(rVar.f3036n);
        String str2 = rVar.f3033k;
        if (str2 != null) {
            str = " ".concat(str2);
        } else {
            str = "";
        }
        sb.append(str);
        a8.f2996j = sb.toString();
        a8.f3004r = Long.MAX_VALUE;
        return new r(a8);
    }
}
