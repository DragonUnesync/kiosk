package H3;

import G3.f;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class V extends x0 {

    /* renamed from: U  reason: collision with root package name */
    public int f2034U;

    /* renamed from: V  reason: collision with root package name */
    public Object f2035V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f2036W;

    /* renamed from: X  reason: collision with root package name */
    public final Iterator f2037X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f2038Y;

    public V() {
        this.f2034U = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (((H3.r0) r5.f2038Y).f2118V.contains(r0) == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r5.f2034U = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = r5.f2037X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r0.hasNext() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r0 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (((G3.f) r5.f2038Y).apply(r0) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r5.f2034U = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r5.f2035V = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r5.f2034U == 3) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r5.f2034U = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = r5.f2037X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r5 = this;
            int r0 = r5.f2034U
            r1 = 4
            if (r0 == r1) goto L_0x005e
            int r0 = u.C1477r.h(r0)
            r2 = 1
            if (r0 == 0) goto L_0x005d
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L_0x005c
            r5.f2034U = r1
            int r0 = r5.f2036W
            switch(r0) {
                case 0: goto L_0x0035;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.util.Iterator r0 = r5.f2037X
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r5.f2038Y
            H3.r0 r1 = (H3.r0) r1
            H3.U r1 = r1.f2118V
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x0050
        L_0x0030:
            r0 = 3
            r5.f2034U = r0
        L_0x0033:
            r0 = 0
            goto L_0x0050
        L_0x0035:
            java.util.Iterator r0 = r5.f2037X
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r5.f2038Y
            G3.f r1 = (G3.f) r1
            boolean r1 = r1.apply(r0)
            if (r1 == 0) goto L_0x0035
            goto L_0x0050
        L_0x004c:
            r0 = 3
            r5.f2034U = r0
            goto L_0x0033
        L_0x0050:
            r5.f2035V = r0
            int r0 = r5.f2034U
            r1 = 3
            if (r0 == r1) goto L_0x005a
            r5.f2034U = r2
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            return r2
        L_0x005c:
            return r4
        L_0x005d:
            return r2
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.V.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.f2034U = 2;
            Object obj = this.f2035V;
            this.f2035V = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public V(Iterator it, f fVar) {
        this();
        this.f2036W = 0;
        this.f2037X = it;
        this.f2038Y = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public V(r0 r0Var) {
        this();
        this.f2036W = 1;
        this.f2038Y = r0Var;
        this.f2037X = r0Var.f2117U.iterator();
    }
}
