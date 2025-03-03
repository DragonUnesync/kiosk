package C7;

import java.util.Comparator;

public final class e implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f737U;

    public /* synthetic */ e(int i) {
        this.f737U = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r3 = r6.f737U
            switch(r3) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00b5;
                case 3: goto L_0x009b;
                case 4: goto L_0x008a;
                case 5: goto L_0x007c;
                case 6: goto L_0x0063;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getDeclaringClass()
            r0.append(r1)
            java.lang.String r1 = r7.getName()
            r0.append(r1)
            java.lang.Class[] r1 = r7.getParameterTypes()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.Class r7 = r7.getReturnType()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r8.getDeclaringClass()
            r0.append(r1)
            java.lang.String r1 = r8.getName()
            r0.append(r1)
            java.lang.Class[] r1 = r8.getParameterTypes()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.Class r8 = r8.getReturnType()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            int r7 = r7.compareTo(r8)
            return r7
        L_0x0063:
            java.io.File r7 = (java.io.File) r7
            long r0 = r7.lastModified()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.io.File r8 = (java.io.File) r8
            long r0 = r8.lastModified()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r7 = B.C0003d.i(r7, r8)
            return r7
        L_0x007c:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        L_0x008a:
            r2.x r7 = (r2.x) r7
            r2.x r8 = (r2.x) r8
            r2.q r7 = r7.b()
            r2.q r8 = r8.b()
            int r7 = r7.compareTo(r8)
            return r7
        L_0x009b:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = v0.C1510H.f15874a
            float r7 = v0.C1553z.h(r7)
            float r8 = v0.C1553z.h(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x00af
            r0 = -1
            goto L_0x00b4
        L_0x00af:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b4
            r0 = 1
        L_0x00b4:
            return r0
        L_0x00b5:
            c0.i r7 = (c0.i) r7
            c0.i r8 = (c0.i) r8
            int r7 = r7.f8742b
            int r8 = r8.f8742b
            int r7 = r7 - r8
            return r7
        L_0x00bf:
            androidx.recyclerview.widget.r r7 = (androidx.recyclerview.widget.r) r7
            androidx.recyclerview.widget.r r8 = (androidx.recyclerview.widget.r) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.f8508d
            if (r3 != 0) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x00c9:
            r4 = 0
        L_0x00ca:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f8508d
            if (r5 != 0) goto L_0x00d0
            r5 = 1
            goto L_0x00d1
        L_0x00d0:
            r5 = 0
        L_0x00d1:
            if (r4 == r5) goto L_0x00d9
            if (r3 != 0) goto L_0x00d7
        L_0x00d5:
            r0 = 1
            goto L_0x00f3
        L_0x00d7:
            r0 = -1
            goto L_0x00f3
        L_0x00d9:
            boolean r3 = r7.f8505a
            boolean r4 = r8.f8505a
            if (r3 == r4) goto L_0x00e2
            if (r3 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00e2:
            int r1 = r8.f8506b
            int r2 = r7.f8506b
            int r1 = r1 - r2
            if (r1 == 0) goto L_0x00eb
            r0 = r1
            goto L_0x00f3
        L_0x00eb:
            int r7 = r7.f8507c
            int r8 = r8.f8507c
            int r7 = r7 - r8
            if (r7 == 0) goto L_0x00f3
            r0 = r7
        L_0x00f3:
            return r0
        L_0x00f4:
            C7.a r7 = (C7.a) r7
            java.io.File r7 = r7.f723a
            long r0 = r7.lastModified()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            C7.a r8 = (C7.a) r8
            java.io.File r8 = r8.f723a
            long r0 = r8.lastModified()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r7 = B.C0003d.i(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.e.compare(java.lang.Object, java.lang.Object):int");
    }
}
