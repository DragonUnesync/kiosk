package c0;

import B3.q;
import java.util.ArrayList;

/* renamed from: c0.c  reason: case insensitive filesystem */
public class C0605c {

    /* renamed from: a  reason: collision with root package name */
    public i f8715a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f8716b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f8717c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public C0604b f8718d;
    public boolean e = false;

    public C0605c(q qVar) {
        this.f8718d = new C0603a(this, qVar);
    }

    public final void a(C0607e eVar, int i) {
        this.f8718d.i(eVar.i(i), 1.0f);
        this.f8718d.i(eVar.i(i), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8716b = (float) i;
        }
        if (!z) {
            this.f8718d.i(iVar, -1.0f);
            this.f8718d.i(iVar2, 1.0f);
            this.f8718d.i(iVar3, 1.0f);
            return;
        }
        this.f8718d.i(iVar, 1.0f);
        this.f8718d.i(iVar2, -1.0f);
        this.f8718d.i(iVar3, -1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8716b = (float) i;
        }
        if (!z) {
            this.f8718d.i(iVar, -1.0f);
            this.f8718d.i(iVar2, 1.0f);
            this.f8718d.i(iVar3, -1.0f);
            return;
        }
        this.f8718d.i(iVar, 1.0f);
        this.f8718d.i(iVar2, -1.0f);
        this.f8718d.i(iVar3, 1.0f);
    }

    public i d(boolean[] zArr) {
        return e(zArr, (i) null);
    }

    public final i e(boolean[] zArr, i iVar) {
        int i;
        int d8 = this.f8718d.d();
        i iVar2 = null;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < d8; i8++) {
            float a8 = this.f8718d.a(i8);
            if (a8 < 0.0f) {
                i g8 = this.f8718d.g(i8);
                if ((zArr == null || !zArr[g8.f8742b]) && g8 != iVar && (((i = g8.f8750l) == 3 || i == 4) && a8 < f8)) {
                    f8 = a8;
                    iVar2 = g8;
                }
            }
        }
        return iVar2;
    }

    public final void f(i iVar) {
        i iVar2 = this.f8715a;
        if (iVar2 != null) {
            this.f8718d.i(iVar2, -1.0f);
            this.f8715a = null;
        }
        float b8 = this.f8718d.b(iVar, true) * -1.0f;
        this.f8715a = iVar;
        if (b8 != 1.0f) {
            this.f8716b /= b8;
            this.f8718d.h(b8);
        }
    }

    public final void g(i iVar, boolean z) {
        if (iVar.f8745f) {
            float j7 = this.f8718d.j(iVar);
            this.f8716b = (iVar.e * j7) + this.f8716b;
            this.f8718d.b(iVar, z);
            if (z) {
                iVar.b(this);
            }
        }
    }

    public void h(C0605c cVar, boolean z) {
        float c8 = this.f8718d.c(cVar, z);
        this.f8716b = (cVar.f8716b * c8) + this.f8716b;
        if (z) {
            cVar.f8715a.b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r7 = r10.f8718d.a(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            c0.i r0 = r10.f8715a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            c0.i r1 = r10.f8715a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = N.e.x(r0, r1)
            float r1 = r10.f8716b
            r2 = 1
            r3 = 0
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            java.lang.StringBuilder r0 = Q0.g.r(r0)
            float r1 = r10.f8716b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            c0.b r5 = r10.f8718d
            int r5 = r5.d()
        L_0x003c:
            if (r3 >= r5) goto L_0x009d
            c0.b r6 = r10.f8718d
            c0.i r6 = r6.g(r3)
            if (r6 != 0) goto L_0x0047
            goto L_0x009a
        L_0x0047:
            c0.b r7 = r10.f8718d
            float r7 = r7.a(r3)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x009a
        L_0x0052:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0067
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0077
            java.lang.String r1 = "- "
            java.lang.String r0 = N.e.x(r0, r1)
        L_0x0064:
            float r7 = r7 * r9
            goto L_0x0077
        L_0x0067:
            if (r8 <= 0) goto L_0x0070
            java.lang.String r1 = " + "
            java.lang.String r0 = N.e.x(r0, r1)
            goto L_0x0077
        L_0x0070:
            java.lang.String r1 = " - "
            java.lang.String r0 = N.e.x(r0, r1)
            goto L_0x0064
        L_0x0077:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0082
            java.lang.String r0 = N.e.x(r0, r6)
            goto L_0x0099
        L_0x0082:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0099:
            r1 = 1
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x009d:
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "0.0"
            java.lang.String r0 = N.e.x(r0, r1)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0605c.toString():java.lang.String");
    }
}
