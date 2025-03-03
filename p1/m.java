package p1;

import H1.d;
import H3.M;
import H3.O;
import H3.i0;
import J1.k;
import K1.i;
import L1.a;
import P0.w;
import V1.B;
import V1.C0342a;
import V1.C0344c;
import V1.C0345d;
import V1.C0347f;
import V1.E;
import W0.n;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.K2;
import java.util.ArrayList;
import l1.j;
import q1.C1362a;
import r1.b;
import u1.C1489a;
import v1.C1555b;

public final class m implements r {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: f  reason: collision with root package name */
    public static final K2 f14412f = new K2(new j(2));

    /* renamed from: g  reason: collision with root package name */
    public static final K2 f14413g = new K2(new j(3));

    /* renamed from: a  reason: collision with root package name */
    public i0 f14414a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14415b;

    /* renamed from: c  reason: collision with root package name */
    public i f14416c;

    /* renamed from: d  reason: collision with root package name */
    public int f14417d;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ all -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p1.o[] a(android.net.Uri r6, java.util.Map r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0047 }
            int[] r1 = e     // Catch:{ all -> 0x0047 }
            r2 = 21
            r0.<init>(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "Content-Type"
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x0047 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0047 }
            r3 = 0
            if (r7 == 0) goto L_0x0023
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0023
        L_0x001c:
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0047 }
            goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            int r7 = android.support.v4.media.session.b.r(r7)     // Catch:{ all -> 0x0047 }
            r4 = -1
            if (r7 == r4) goto L_0x002e
            r5.b(r7, r0)     // Catch:{ all -> 0x0047 }
        L_0x002e:
            int r6 = android.support.v4.media.session.b.s(r6)     // Catch:{ all -> 0x0047 }
            if (r6 == r4) goto L_0x0039
            if (r6 == r7) goto L_0x0039
            r5.b(r6, r0)     // Catch:{ all -> 0x0047 }
        L_0x0039:
            if (r3 >= r2) goto L_0x0049
            r4 = r1[r3]     // Catch:{ all -> 0x0047 }
            if (r4 == r7) goto L_0x0044
            if (r4 == r6) goto L_0x0044
            r5.b(r4, r0)     // Catch:{ all -> 0x0047 }
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x0039
        L_0x0047:
            r6 = move-exception
            goto L_0x0057
        L_0x0049:
            int r6 = r0.size()     // Catch:{ all -> 0x0047 }
            p1.o[] r6 = new p1.o[r6]     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch:{ all -> 0x0047 }
            p1.o[] r6 = (p1.o[]) r6     // Catch:{ all -> 0x0047 }
            monitor-exit(r5)
            return r6
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0047 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m.a(android.net.Uri, java.util.Map):p1.o[]");
    }

    /* JADX WARNING: type inference failed for: r10v20, types: [W1.d, java.lang.Object] */
    public final void b(int i, ArrayList arrayList) {
        int i8;
        int i9 = 2;
        int i10 = 0;
        switch (i) {
            case 0:
                arrayList.add(new C0342a());
                return;
            case 1:
                arrayList.add(new C0344c());
                return;
            case 2:
                arrayList.add(new C0345d());
                return;
            case 3:
                arrayList.add(new C1362a());
                return;
            case 4:
                o B8 = f14412f.B(0);
                if (B8 != null) {
                    arrayList.add(B8);
                    return;
                } else {
                    arrayList.add(new C1489a());
                    return;
                }
            case 5:
                arrayList.add(new C1555b());
                return;
            case 6:
                i iVar = this.f14416c;
                if (this.f14415b) {
                    i9 = 0;
                }
                arrayList.add(new d(iVar, i9));
                return;
            case 7:
                arrayList.add(new I1.d());
                return;
            case 8:
                i iVar2 = this.f14416c;
                if (this.f14415b) {
                    i8 = 0;
                } else {
                    i8 = 32;
                }
                M m8 = O.f2026V;
                arrayList.add(new k(iVar2, i8, (w) null, i0.f2073Y, (n) null));
                i iVar3 = this.f14416c;
                if (!this.f14415b) {
                    i10 = 16;
                }
                arrayList.add(new J1.n(iVar3, i10));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new B());
                return;
            case 11:
                if (this.f14414a == null) {
                    M m9 = O.f2026V;
                    this.f14414a = i0.f2073Y;
                }
                arrayList.add(new E(1, !this.f14415b ? 1 : 0, this.f14416c, new w(0), new C0347f(0, this.f14414a)));
                return;
            case 12:
                ? obj = new Object();
                obj.f6143c = 0;
                obj.f6144d = -1;
                obj.f6145f = -1;
                obj.f6146g = -1;
                arrayList.add(obj);
                return;
            case EnterpriseDeviceManager.KNOX_2_3:
                arrayList.add(new a(this.f14417d));
                return;
            case EnterpriseDeviceManager.KNOX_2_4:
                o B9 = f14413g.B(new Object[0]);
                if (B9 != null) {
                    arrayList.add(B9);
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                arrayList.add(new b(this.f14415b ^ true ? 1 : 0, this.f14416c));
                return;
            case EnterpriseDeviceManager.KNOX_2_5:
                arrayList.add(new a(0, (byte) 0));
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                arrayList.add(new X1.a(0));
                return;
            case EnterpriseDeviceManager.KNOX_2_6:
                arrayList.add(new a(1, (byte) 0));
                return;
            case EnterpriseDeviceManager.KNOX_2_7:
                arrayList.add(new X1.a(2));
                return;
            case 21:
                arrayList.add(new X1.a(1));
                return;
            default:
                return;
        }
    }
}
