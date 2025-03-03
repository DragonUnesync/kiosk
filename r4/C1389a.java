package r4;

import D2.j;
import S5.C0187o;
import T5.M;
import T5.Y;
import s4.C1405a;

/* renamed from: r4.a  reason: case insensitive filesystem */
public final class C1389a extends M {

    /* renamed from: U  reason: collision with root package name */
    public final C1405a f14943U;

    /* renamed from: V  reason: collision with root package name */
    public final j f14944V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f14945W = false;

    /* renamed from: X  reason: collision with root package name */
    public boolean f14946X = false;

    /* JADX WARNING: type inference failed for: r3v1, types: [D2.j, java.lang.Object] */
    public C1389a(C1405a aVar) {
        this.f14943U = aVar;
        C0187o oVar = C0187o.DEFAULT;
        ? obj = new Object();
        obj.f1093U = 268435460;
        obj.f1094V = oVar;
        this.f14944V = obj;
    }

    public final void channelRead(Y y8, Object obj) {
        this.f14945W = true;
        y8.fireChannelRead(obj);
    }

    public final void channelReadComplete(Y y8) {
        y8.fireChannelReadComplete();
        this.f14945W = false;
        if (this.f14946X) {
            this.f14946X = false;
            y8.flush();
        }
    }

    public final void flush(Y y8) {
        if (this.f14945W) {
            this.f14946X = true;
        } else {
            y8.flush();
        }
    }

    public final boolean isSharable() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(T5.Y r4, java.lang.Object r5, T5.C0274u0 r6) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof L4.c
            if (r0 == 0) goto L_0x0031
            L4.c r5 = (L4.c) r5
            u5.b r0 = r5.getType()
            int r0 = r0.a()
            s4.a r1 = r3.f14943U
            if (r0 < 0) goto L_0x001b
            r4.c[] r1 = r1.f15087a
            int r2 = r1.length
            if (r0 < r2) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            r0 = r1[r0]
            goto L_0x001f
        L_0x001b:
            r1.getClass()
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x002b
            D2.j r1 = r3.f14944V
            S5.n r5 = r0.a(r5, r1)
            r4.write(r5, r6)
            goto L_0x0034
        L_0x002b:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
        L_0x0031:
            r4.write(r5, r6)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.C1389a.write(T5.Y, java.lang.Object, T5.u0):void");
    }
}
