package r2;

import android.support.v4.media.session.b;
import y2.C1627b;

public final class r extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final q f14924Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1377A f14925Z;

    /* renamed from: a0  reason: collision with root package name */
    public final p f14926a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f14927b0;

    public r(q qVar, C1377A a8, p pVar, p pVar2, int i) {
        super(4, 12);
        if (qVar == null) {
            throw new NullPointerException("type == null");
        } else if (pVar == null) {
            throw new NullPointerException("firstItem == null");
        } else if (pVar2 == null) {
            throw new NullPointerException("lastItem == null");
        } else if (i > 0) {
            this.f14924Y = qVar;
            this.f14925Z = a8;
            this.f14926a0 = pVar;
            this.f14927b0 = i;
        } else {
            throw new IllegalArgumentException("itemCount <= 0");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: r2.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(r2.C1377A[] r16, r2.w r17) {
        /*
            r0 = r16
            r1 = r17
            if (r0 == 0) goto L_0x007c
            java.util.ArrayList r2 = r1.f14931f
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0074
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 50
            r2.<init>(r3)
            int r3 = r0.length
            r5 = 0
        L_0x0017:
            if (r5 >= r3) goto L_0x0069
            r12 = r0[r5]
            java.util.Collection r6 = r12.c()
            java.util.Iterator r13 = r6.iterator()
            r6 = 0
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = 0
        L_0x0028:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r13.next()
            r14 = r6
            r2.p r14 = (r2.p) r14
            r2.q r15 = r14.b()
            if (r15 == r7) goto L_0x004b
            if (r11 == 0) goto L_0x0048
            r2.r r8 = new r2.r
            r6 = r8
            r4 = r8
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.add(r4)
        L_0x0048:
            r9 = r14
            r7 = r15
            r11 = 0
        L_0x004b:
            int r11 = r11 + 1
            r10 = r14
            goto L_0x0028
        L_0x004f:
            if (r11 == 0) goto L_0x005c
            r2.r r4 = new r2.r
            r6 = r4
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.add(r4)
            goto L_0x0066
        L_0x005c:
            if (r12 != r1) goto L_0x0066
            r2.r r4 = new r2.r
            r4.<init>(r1)
            r2.add(r4)
        L_0x0066:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0069:
            r2.G r0 = new r2.G
            r2.q r3 = r2.q.TYPE_MAP_LIST
            r0.<init>(r3, r2)
            r1.k(r0)
            return
        L_0x0074:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "mapSection.items().size() != 0"
            r0.<init>(r1)
            throw r0
        L_0x007c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "sections == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.r.l(r2.A[], r2.w):void");
    }

    public final void a(C1387f fVar) {
    }

    public final q b() {
        return q.TYPE_MAP_ITEM;
    }

    public final void k(C1387f fVar, C1627b bVar) {
        int i;
        q qVar = this.f14924Y;
        int i8 = qVar.f14921U;
        C1377A a8 = this.f14925Z;
        p pVar = this.f14926a0;
        if (pVar == null) {
            i = a8.b();
        } else {
            i = a8.a(pVar);
        }
        boolean d8 = bVar.d();
        int i9 = this.f14927b0;
        if (d8) {
            bVar.b(0, g() + ' ' + qVar.f14922V + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(b.P(i8));
            sb.append(" // ");
            sb.append(qVar.toString());
            bVar.b(2, sb.toString());
            bVar.b(2, "  unused: 0");
            bVar.b(4, "  size:   ".concat(b.Q(i9)));
            bVar.b(4, "  offset: ".concat(b.Q(i)));
        }
        bVar.k(i8);
        bVar.k(0);
        bVar.j(i9);
        bVar.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(r.class.getName());
        sb.append('{');
        sb.append(this.f14925Z.toString());
        sb.append(' ');
        sb.append(this.f14924Y.f14923W);
        sb.append('}');
        return sb.toString();
    }

    public r(w wVar) {
        super(4, 12);
        if (wVar != null) {
            this.f14924Y = q.TYPE_MAP_LIST;
            this.f14925Z = wVar;
            this.f14926a0 = null;
            this.f14927b0 = 1;
            return;
        }
        throw new NullPointerException("section == null");
    }
}
