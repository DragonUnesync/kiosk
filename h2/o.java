package H2;

import W2.m;
import java.util.ArrayDeque;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayDeque f1972b = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public Object f1973a;

    static {
        char[] cArr = m.f6173a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: H2.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: H2.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: H2.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static H2.o a(java.lang.Object r2) {
        /*
            java.util.ArrayDeque r0 = f1972b
            monitor-enter(r0)
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x0014 }
            H2.o r1 = (H2.o) r1     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0011
            H2.o r1 = new H2.o
            r1.<init>()
        L_0x0011:
            r1.f1973a = r2
            return r1
        L_0x0014:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.o.a(java.lang.Object):H2.o");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        oVar.getClass();
        return this.f1973a.equals(oVar.f1973a);
    }

    public final int hashCode() {
        return this.f1973a.hashCode();
    }
}
