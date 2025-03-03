package K2;

import B2.i;
import B2.k;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: K2.a  reason: case insensitive filesystem */
public final class C0109a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2598a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2599b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2600c;

    public /* synthetic */ C0109a(Object obj, int i, Object obj2) {
        this.f2598a = i;
        this.f2599b = obj;
        this.f2600c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D2.D a(java.lang.Object r10, int r11, int r12, B2.i r13) {
        /*
            r9 = this;
            int r0 = r9.f2598a
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0064;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.io.InputStream r10 = (java.io.InputStream) r10
            boolean r0 = r10 instanceof K2.w
            if (r0 == 0) goto L_0x000f
            K2.w r10 = (K2.w) r10
            r0 = 0
            goto L_0x001b
        L_0x000f:
            K2.w r0 = new K2.w
            java.lang.Object r1 = r9.f2600c
            E2.g r1 = (E2.g) r1
            r0.<init>(r10, r1)
            r10 = 1
            r10 = r0
            r0 = 1
        L_0x001b:
            java.util.ArrayDeque r1 = W2.e.f6159W
            monitor-enter(r1)
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0061 }
            W2.e r2 = (W2.e) r2     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x002c
            W2.e r2 = new W2.e
            r2.<init>()
        L_0x002c:
            r2.f6160U = r10
            W2.j r1 = new W2.j
            r1.<init>(r2)
            A1.d r8 = new A1.d
            r3 = 18
            r8.<init>(r10, r3, r2)
            java.lang.Object r3 = r9.f2599b     // Catch:{ all -> 0x0057 }
            K2.p r3 = (K2.p) r3     // Catch:{ all -> 0x0057 }
            B.q0 r4 = new B.q0     // Catch:{ all -> 0x0057 }
            java.util.ArrayList r5 = r3.f2635d     // Catch:{ all -> 0x0057 }
            E2.g r6 = r3.f2634c     // Catch:{ all -> 0x0057 }
            r4.<init>((W2.j) r1, (java.util.ArrayList) r5, (E2.g) r6)     // Catch:{ all -> 0x0057 }
            r5 = r11
            r6 = r12
            r7 = r13
            K2.d r11 = r3.a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0057 }
            r2.k()
            if (r0 == 0) goto L_0x0056
            r10.l()
        L_0x0056:
            return r11
        L_0x0057:
            r11 = move-exception
            r2.k()
            if (r0 == 0) goto L_0x0060
            r10.l()
        L_0x0060:
            throw r11
        L_0x0061:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r10
        L_0x0064:
            android.net.Uri r10 = (android.net.Uri) r10
            java.lang.Object r0 = r9.f2599b
            M2.c r0 = (M2.c) r0
            D2.D r10 = r0.c(r10, r13)
            if (r10 != 0) goto L_0x0072
            r10 = 0
            goto L_0x0082
        L_0x0072:
            M2.b r10 = (M2.b) r10
            java.lang.Object r10 = r10.get()
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            java.lang.Object r13 = r9.f2600c
            E2.b r13 = (E2.b) r13
            K2.d r10 = K2.r.a(r13, r10, r11, r12)
        L_0x0082:
            return r10
        L_0x0083:
            java.lang.Object r0 = r9.f2599b
            B2.k r0 = (B2.k) r0
            D2.D r10 = r0.a(r10, r11, r12, r13)
            if (r10 != 0) goto L_0x008f
            r10 = 0
            goto L_0x0099
        L_0x008f:
            K2.d r11 = new K2.d
            java.lang.Object r12 = r9.f2600c
            android.content.res.Resources r12 = (android.content.res.Resources) r12
            r11.<init>((android.content.res.Resources) r12, (D2.D) r10)
            r10 = r11
        L_0x0099:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.C0109a.a(java.lang.Object, int, int, B2.i):D2.D");
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f2598a) {
            case 0:
                return ((k) this.f2599b).b(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                InputStream inputStream = (InputStream) obj;
                ((p) this.f2599b).getClass();
                return true;
        }
    }

    public C0109a(Resources resources, k kVar) {
        this.f2598a = 0;
        this.f2600c = resources;
        this.f2599b = kVar;
    }
}
