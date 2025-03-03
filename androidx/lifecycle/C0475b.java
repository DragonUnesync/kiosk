package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
public final class C0475b {

    /* renamed from: a  reason: collision with root package name */
    public final int f8138a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f8139b;

    public C0475b(int i, Method method) {
        this.f8138a = i;
        this.f8139b = method;
        method.setAccessible(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (androidx.lifecycle.C0475b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.lifecycle.C0475b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            androidx.lifecycle.b r5 = (androidx.lifecycle.C0475b) r5
            int r1 = r5.f8138a
            int r3 = r4.f8138a
            if (r3 != r1) goto L_0x0025
            java.lang.reflect.Method r1 = r4.f8139b
            java.lang.String r1 = r1.getName()
            java.lang.reflect.Method r5 = r5.f8139b
            java.lang.String r5 = r5.getName()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0475b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f8139b.getName().hashCode() + (this.f8138a * 31);
    }
}
