package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: q.f  reason: case insensitive filesystem */
public class C1353f implements Iterable {

    /* renamed from: U  reason: collision with root package name */
    public C1350c f14697U;

    /* renamed from: V  reason: collision with root package name */
    public C1350c f14698V;

    /* renamed from: W  reason: collision with root package name */
    public final WeakHashMap f14699W = new WeakHashMap();

    /* renamed from: X  reason: collision with root package name */
    public int f14700X = 0;

    public C1350c b(Object obj) {
        C1350c cVar = this.f14697U;
        while (cVar != null && !cVar.f14690U.equals(obj)) {
            cVar = cVar.f14692W;
        }
        return cVar;
    }

    public Object c(Object obj) {
        C1350c b8 = b(obj);
        if (b8 == null) {
            return null;
        }
        this.f14700X--;
        WeakHashMap weakHashMap = this.f14699W;
        if (!weakHashMap.isEmpty()) {
            for (C1352e a8 : weakHashMap.keySet()) {
                a8.a(b8);
            }
        }
        C1350c cVar = b8.f14693X;
        if (cVar != null) {
            cVar.f14692W = b8.f14692W;
        } else {
            this.f14697U = b8.f14692W;
        }
        C1350c cVar2 = b8.f14692W;
        if (cVar2 != null) {
            cVar2.f14693X = cVar;
        } else {
            this.f14698V = cVar;
        }
        b8.f14692W = null;
        b8.f14693X = null;
        return b8.f14691V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((q.C1349b) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof q.C1353f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            q.f r7 = (q.C1353f) r7
            int r1 = r6.f14700X
            int r3 = r7.f14700X
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            q.b r3 = (q.C1349b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            q.b r4 = (q.C1349b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            q.b r7 = (q.C1349b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1353f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C1349b bVar = (C1349b) it;
            if (!bVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        C1349b bVar = new C1349b(this.f14697U, this.f14698V, 0);
        this.f14699W.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1349b bVar = (C1349b) it;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
