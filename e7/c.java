package E7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends IOException implements Iterable {

    /* renamed from: V  reason: collision with root package name */
    public static final /* synthetic */ int f1380V = 0;

    /* renamed from: U  reason: collision with root package name */
    public final List f1381U;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r4, java.util.List r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0005
            goto L_0x001e
        L_0x0005:
            if (r5 == 0) goto L_0x000c
            int r4 = r5.size()
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            r2[r0] = r5
            java.lang.String r4 = "%,d exception(s): %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
        L_0x001e:
            if (r5 == 0) goto L_0x0025
            int r2 = r5.size()
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            r0 = 0
            goto L_0x0034
        L_0x002e:
            java.lang.Object r0 = r5.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x0034:
            r3.<init>(r4, r0)
            if (r5 != 0) goto L_0x003d
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x003d:
            r3.f1381U = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.c.<init>(java.lang.String, java.util.List):void");
    }

    public final Iterator iterator() {
        return new ArrayList(this.f1381U).iterator();
    }
}
