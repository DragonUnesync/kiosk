package l1;

import D.C0051j0;
import Q0.g;
import java.util.ArrayList;
import java.util.Collections;

public final class u {

    /* renamed from: h  reason: collision with root package name */
    public static final C0051j0 f13162h = new C0051j0(24);
    public static final C0051j0 i = new C0051j0(25);

    /* renamed from: a  reason: collision with root package name */
    public final int f13163a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13164b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final t[] f13165c = new t[5];

    /* renamed from: d  reason: collision with root package name */
    public int f13166d = -1;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f13167f;

    /* renamed from: g  reason: collision with root package name */
    public int f13168g;

    public u(int i8) {
        this.f13163a = i8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: l1.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: l1.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: l1.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, float r7) {
        /*
            r5 = this;
            int r0 = r5.f13166d
            java.util.ArrayList r1 = r5.f13164b
            r2 = 1
            if (r0 == r2) goto L_0x000e
            D.j0 r0 = f13162h
            java.util.Collections.sort(r1, r0)
            r5.f13166d = r2
        L_0x000e:
            int r0 = r5.f13168g
            l1.t[] r3 = r5.f13165c
            if (r0 <= 0) goto L_0x001a
            int r0 = r0 - r2
            r5.f13168g = r0
            r0 = r3[r0]
            goto L_0x001f
        L_0x001a:
            l1.t r0 = new l1.t
            r0.<init>()
        L_0x001f:
            int r2 = r5.e
            int r4 = r2 + 1
            r5.e = r4
            r0.f13159a = r2
            r0.f13160b = r6
            r0.f13161c = r7
            r1.add(r0)
            int r7 = r5.f13167f
            int r7 = r7 + r6
            r5.f13167f = r7
        L_0x0033:
            int r6 = r5.f13167f
            int r7 = r5.f13163a
            if (r6 <= r7) goto L_0x0062
            int r6 = r6 - r7
            r7 = 0
            java.lang.Object r0 = r1.get(r7)
            l1.t r0 = (l1.t) r0
            int r2 = r0.f13160b
            if (r2 > r6) goto L_0x0059
            int r6 = r5.f13167f
            int r6 = r6 - r2
            r5.f13167f = r6
            r1.remove(r7)
            int r6 = r5.f13168g
            r7 = 5
            if (r6 >= r7) goto L_0x0033
            int r7 = r6 + 1
            r5.f13168g = r7
            r3[r6] = r0
            goto L_0x0033
        L_0x0059:
            int r2 = r2 - r6
            r0.f13160b = r2
            int r7 = r5.f13167f
            int r7 = r7 - r6
            r5.f13167f = r7
            goto L_0x0033
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.u.a(int, float):void");
    }

    public final float b() {
        int i8 = this.f13166d;
        ArrayList arrayList = this.f13164b;
        if (i8 != 0) {
            Collections.sort(arrayList, i);
            this.f13166d = 0;
        }
        float f8 = 0.5f * ((float) this.f13167f);
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            t tVar = (t) arrayList.get(i10);
            i9 += tVar.f13160b;
            if (((float) i9) >= f8) {
                return tVar.f13161c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t) g.l(1, arrayList)).f13161c;
    }
}
