package X5;

import g6.B;
import java.util.Map;

/* renamed from: X5.s  reason: case insensitive filesystem */
public final class C0367s implements Map.Entry {
    protected C0367s after;
    protected C0367s before;
    protected final int hash;
    protected final Object key;
    protected C0367s next;
    protected Object value;

    public C0367s(int i, Object obj, Object obj2, C0367s sVar, C0367s sVar2) {
        this.hash = i;
        this.key = obj;
        this.value = obj2;
        this.next = sVar;
        this.after = sVar2;
        this.before = sVar2.before;
        pointNeighborsToThis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.getKey()
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L_0x003f
            goto L_0x0023
        L_0x0015:
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x003f
        L_0x0023:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L_0x0030
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0030:
            java.lang.Object r0 = r3.getValue()
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.C0367s.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.key;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        Object obj = this.key;
        int i8 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.value;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i ^ i8;
    }

    public final void pointNeighborsToThis() {
        this.before.after = this;
        this.after.before = this;
    }

    public void remove() {
        C0367s sVar = this.before;
        sVar.after = this.after;
        this.after.before = sVar;
    }

    public final Object setValue(Object obj) {
        B.checkNotNull(obj, "value");
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        return this.key.toString() + '=' + this.value.toString();
    }

    public C0367s() {
        this.hash = -1;
        this.key = null;
        this.after = this;
        this.before = this;
    }
}
