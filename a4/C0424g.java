package a4;

import M3.a;
import M3.c;
import b4.e;
import c4.C0617c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;

/* renamed from: a4.g  reason: case insensitive filesystem */
public final class C0424g extends C0425h {

    /* renamed from: c  reason: collision with root package name */
    public static final C0425h[] f7202c = new C0425h[0];

    /* renamed from: d  reason: collision with root package name */
    public static final k[] f7203d = new k[0];

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7204a;

    /* renamed from: b  reason: collision with root package name */
    public final C0425h[] f7205b;

    public C0424g(EnumMap enumMap, int i) {
        Collection collection;
        Collection collection2;
        boolean z;
        this.f7204a = i;
        switch (i) {
            case 1:
                if (enumMap == null) {
                    collection = null;
                } else {
                    collection = (Collection) enumMap.get(c.f3126W);
                }
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(a.f3113b0)) {
                        arrayList.add(new C0422e(0));
                    } else if (collection.contains(a.f3120i0)) {
                        arrayList.add(new C0422e(3));
                    }
                    if (collection.contains(a.f3112a0)) {
                        arrayList.add(new C0422e(2));
                    }
                    if (collection.contains(a.f3121j0)) {
                        arrayList.add(new C0422e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new C0422e(0));
                    arrayList.add(new C0422e(2));
                    arrayList.add(new C0422e(1));
                }
                this.f7205b = (k[]) arrayList.toArray(f7203d);
                return;
            default:
                if (enumMap == null) {
                    collection2 = null;
                } else {
                    collection2 = (Collection) enumMap.get(c.f3126W);
                }
                if (enumMap == null || enumMap.get(c.f3130a0) == null) {
                    z = false;
                } else {
                    z = true;
                }
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(a.f3113b0) || collection2.contains(a.f3120i0) || collection2.contains(a.f3112a0) || collection2.contains(a.f3121j0)) {
                        arrayList2.add(new C0424g(enumMap, 1));
                    }
                    if (collection2.contains(a.f3108W)) {
                        arrayList2.add(new C0420c(z));
                    }
                    if (collection2.contains(a.f3109X)) {
                        arrayList2.add(new C0421d());
                    }
                    if (collection2.contains(a.f3110Y)) {
                        arrayList2.add(new Object());
                    }
                    if (collection2.contains(a.f3114c0)) {
                        arrayList2.add(new C0423f());
                    }
                    if (collection2.contains(a.f3107V)) {
                        arrayList2.add(new C0418a());
                    }
                    if (collection2.contains(a.f3118g0)) {
                        arrayList2.add(new e());
                    }
                    if (collection2.contains(a.f3119h0)) {
                        arrayList2.add(new C0617c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new C0424g(enumMap, 1));
                    arrayList2.add(new C0420c(false));
                    arrayList2.add(new C0418a());
                    arrayList2.add(new C0421d());
                    arrayList2.add(new Object());
                    arrayList2.add(new C0423f());
                    arrayList2.add(new e());
                    arrayList2.add(new C0617c());
                }
                this.f7205b = (C0425h[]) arrayList2.toArray(f7202c);
                return;
        }
    }

    public final void a() {
        switch (this.f7204a) {
            case 0:
                for (C0425h a8 : this.f7205b) {
                    a8.a();
                }
                return;
            default:
                for (k kVar : (k[]) this.f7205b) {
                    kVar.getClass();
                }
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[Catch:{ k -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[Catch:{ k -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[SYNTHETIC, Splitter:B:19:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048 A[ADDED_TO_REGION, Catch:{ k -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0045 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l c(int r12, S3.a r13, java.util.Map r14) {
        /*
            r11 = this;
            int r0 = r11.f7204a
            switch(r0) {
                case 0: goto L_0x0064;
                default: goto L_0x0005;
            }
        L_0x0005:
            int[] r0 = a4.k.n(r13)
            a4.h[] r1 = r11.f7205b
            a4.k[] r1 = (a4.k[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0010:
            if (r4 >= r2) goto L_0x0061
            r5 = r1[r4]
            M3.l r5 = r5.l(r12, r13, r0, r14)     // Catch:{ k -> 0x005e }
            M3.a r6 = r5.f3152d     // Catch:{ k -> 0x005e }
            M3.a r7 = M3.a.f3113b0     // Catch:{ k -> 0x005e }
            r8 = 1
            java.lang.String r9 = r5.f3149a
            if (r6 != r7) goto L_0x002b
            char r6 = r9.charAt(r3)     // Catch:{ k -> 0x005e }
            r7 = 48
            if (r6 != r7) goto L_0x002b
            r6 = 1
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            if (r14 != 0) goto L_0x0030
            r7 = 0
            goto L_0x0038
        L_0x0030:
            M3.c r7 = M3.c.f3126W     // Catch:{ k -> 0x005e }
            java.lang.Object r7 = r14.get(r7)     // Catch:{ k -> 0x005e }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ k -> 0x005e }
        L_0x0038:
            M3.a r10 = M3.a.f3120i0
            if (r7 == 0) goto L_0x0045
            boolean r7 = r7.contains(r10)     // Catch:{ k -> 0x005e }
            if (r7 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r7 = 0
            goto L_0x0046
        L_0x0045:
            r7 = 1
        L_0x0046:
            if (r6 == 0) goto L_0x005d
            if (r7 == 0) goto L_0x005d
            M3.l r6 = new M3.l     // Catch:{ k -> 0x005e }
            java.lang.String r7 = r9.substring(r8)     // Catch:{ k -> 0x005e }
            byte[] r8 = r5.f3150b     // Catch:{ k -> 0x005e }
            M3.n[] r9 = r5.f3151c     // Catch:{ k -> 0x005e }
            r6.<init>(r7, r8, r9, r10)     // Catch:{ k -> 0x005e }
            java.util.EnumMap r5 = r5.e     // Catch:{ k -> 0x005e }
            r6.a(r5)     // Catch:{ k -> 0x005e }
            r5 = r6
        L_0x005d:
            return r5
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0061:
            M3.h r12 = M3.h.f3144W
            throw r12
        L_0x0064:
            a4.h[] r0 = r11.f7205b
            int r1 = r0.length
            r2 = 0
        L_0x0068:
            if (r2 >= r1) goto L_0x0074
            r3 = r0[r2]
            M3.l r12 = r3.c(r12, r13, r14)     // Catch:{ k -> 0x0071 }
            return r12
        L_0x0071:
            int r2 = r2 + 1
            goto L_0x0068
        L_0x0074:
            M3.h r12 = M3.h.f3144W
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0424g.c(int, S3.a, java.util.Map):M3.l");
    }
}
