package r4;

import D2.j;
import N.e;
import S5.C0185n;
import com.bumptech.glide.g;
import l5.C1179a;
import q4.k;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final k f14948a = new k(3);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.bumptech.glide.g, l5.a] */
    public static C1179a b(L4.c cVar, int i, int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.getType());
        sb.append(" exceeded maximum packet size, minimal possible encoded length: ");
        sb.append(i);
        sb.append(", maximum: ");
        return new g(e.z(sb, i8, "."), (Throwable) null);
    }

    public abstract C0185n a(L4.c cVar, j jVar);
}
