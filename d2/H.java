package D2;

import A1.d;
import B2.f;
import H2.p;
import android.util.Log;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.util.ArrayList;

public final class H implements C0079h, C0078g {

    /* renamed from: U  reason: collision with root package name */
    public final i f1053U;

    /* renamed from: V  reason: collision with root package name */
    public final l f1054V;

    /* renamed from: W  reason: collision with root package name */
    public volatile int f1055W;

    /* renamed from: X  reason: collision with root package name */
    public volatile C0076e f1056X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile Object f1057Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile p f1058Z;

    /* renamed from: a0  reason: collision with root package name */
    public volatile C0077f f1059a0;

    public H(i iVar, l lVar) {
        this.f1053U = iVar;
        this.f1054V = lVar;
    }

    public final void a(f fVar, Exception exc, e eVar, int i) {
        this.f1054V.a(fVar, exc, eVar, this.f1058Z.f1976c.e());
    }

    public final boolean b() {
        if (this.f1057Y != null) {
            Object obj = this.f1057Y;
            this.f1057Y = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f1056X != null && this.f1056X.b()) {
            return true;
        }
        this.f1056X = null;
        this.f1058Z = null;
        boolean z = false;
        while (!z && this.f1055W < this.f1053U.b().size()) {
            ArrayList b8 = this.f1053U.b();
            int i = this.f1055W;
            this.f1055W = i + 1;
            this.f1058Z = (p) b8.get(i);
            if (this.f1058Z != null && (this.f1053U.f1090p.a(this.f1058Z.f1976c.e()) || this.f1053U.c(this.f1058Z.f1976c.a()) != null)) {
                this.f1058Z.f1976c.f(this.f1053U.f1089o, new d(8, this, this.f1058Z, false));
                z = true;
            }
        }
        return z;
    }

    public final void c(f fVar, Object obj, e eVar, int i, f fVar2) {
        this.f1054V.c(fVar, obj, eVar, this.f1058Z.f1976c.e(), fVar);
    }

    public final void cancel() {
        p pVar = this.f1058Z;
        if (pVar != null) {
            pVar.f1976c.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 2
            java.lang.String r1 = "SourceGenerator"
            java.lang.String r2 = "Attempt to write: "
            java.lang.String r3 = "Finished encoding source to cache, key: "
            int r4 = W2.h.f6165b
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 0
            D2.i r7 = r14.f1053U     // Catch:{ all -> 0x0075 }
            com.bumptech.glide.e r7 = r7.f1079c     // Catch:{ all -> 0x0075 }
            com.bumptech.glide.i r7 = r7.b()     // Catch:{ all -> 0x0075 }
            com.bumptech.glide.load.data.g r7 = r7.h(r15)     // Catch:{ all -> 0x0075 }
            java.lang.Object r8 = r7.a()     // Catch:{ all -> 0x0075 }
            D2.i r9 = r14.f1053U     // Catch:{ all -> 0x0075 }
            B2.b r9 = r9.d(r8)     // Catch:{ all -> 0x0075 }
            B.q0 r10 = new B.q0     // Catch:{ all -> 0x0075 }
            D2.i r11 = r14.f1053U     // Catch:{ all -> 0x0075 }
            B2.i r11 = r11.i     // Catch:{ all -> 0x0075 }
            r10.<init>((java.lang.Object) r9, (java.lang.Object) r8, (java.lang.Object) r11, (int) r0)     // Catch:{ all -> 0x0075 }
            D2.f r8 = new D2.f     // Catch:{ all -> 0x0075 }
            H2.p r11 = r14.f1058Z     // Catch:{ all -> 0x0075 }
            B2.f r11 = r11.f1974a     // Catch:{ all -> 0x0075 }
            D2.i r12 = r14.f1053U     // Catch:{ all -> 0x0075 }
            B2.f r13 = r12.f1088n     // Catch:{ all -> 0x0075 }
            r8.<init>(r11, r13)     // Catch:{ all -> 0x0075 }
            D2.p r11 = r12.f1083h     // Catch:{ all -> 0x0075 }
            F2.a r11 = r11.a()     // Catch:{ all -> 0x0075 }
            r11.i(r8, r10)     // Catch:{ all -> 0x0075 }
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = ", data: "
            if (r0 == 0) goto L_0x0077
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>(r3)     // Catch:{ all -> 0x0075 }
            r0.append(r8)     // Catch:{ all -> 0x0075 }
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            r0.append(r15)     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = ", encoder: "
            r0.append(r3)     // Catch:{ all -> 0x0075 }
            r0.append(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = ", duration: "
            r0.append(r3)     // Catch:{ all -> 0x0075 }
            double r3 = W2.h.a(r4)     // Catch:{ all -> 0x0075 }
            r0.append(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0075 }
            goto L_0x0077
        L_0x0075:
            r15 = move-exception
            goto L_0x00dd
        L_0x0077:
            java.io.File r0 = r11.b(r8)     // Catch:{ all -> 0x0075 }
            r3 = 1
            if (r0 == 0) goto L_0x0099
            r14.f1059a0 = r8     // Catch:{ all -> 0x0075 }
            D2.e r15 = new D2.e     // Catch:{ all -> 0x0075 }
            H2.p r0 = r14.f1058Z     // Catch:{ all -> 0x0075 }
            B2.f r0 = r0.f1974a     // Catch:{ all -> 0x0075 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0075 }
            D2.i r1 = r14.f1053U     // Catch:{ all -> 0x0075 }
            r15.<init>(r0, r1, r14)     // Catch:{ all -> 0x0075 }
            r14.f1056X = r15     // Catch:{ all -> 0x0075 }
            H2.p r15 = r14.f1058Z
            com.bumptech.glide.load.data.e r15 = r15.f1976c
            r15.b()
            return r3
        L_0x0099:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x00bc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>(r2)     // Catch:{ all -> 0x0075 }
            D2.f r2 = r14.f1059a0     // Catch:{ all -> 0x0075 }
            r0.append(r2)     // Catch:{ all -> 0x0075 }
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            r0.append(r15)     // Catch:{ all -> 0x0075 }
            java.lang.String r15 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r0.append(r15)     // Catch:{ all -> 0x0075 }
            java.lang.String r15 = r0.toString()     // Catch:{ all -> 0x0075 }
            android.util.Log.d(r1, r15)     // Catch:{ all -> 0x0075 }
        L_0x00bc:
            D2.l r15 = r14.f1054V     // Catch:{ all -> 0x00db }
            H2.p r0 = r14.f1058Z     // Catch:{ all -> 0x00db }
            B2.f r8 = r0.f1974a     // Catch:{ all -> 0x00db }
            java.lang.Object r9 = r7.a()     // Catch:{ all -> 0x00db }
            H2.p r0 = r14.f1058Z     // Catch:{ all -> 0x00db }
            com.bumptech.glide.load.data.e r10 = r0.f1976c     // Catch:{ all -> 0x00db }
            H2.p r0 = r14.f1058Z     // Catch:{ all -> 0x00db }
            com.bumptech.glide.load.data.e r0 = r0.f1976c     // Catch:{ all -> 0x00db }
            int r11 = r0.e()     // Catch:{ all -> 0x00db }
            H2.p r0 = r14.f1058Z     // Catch:{ all -> 0x00db }
            B2.f r12 = r0.f1974a     // Catch:{ all -> 0x00db }
            r7 = r15
            r7.c(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00db }
            return r6
        L_0x00db:
            r15 = move-exception
            r6 = 1
        L_0x00dd:
            if (r6 != 0) goto L_0x00e6
            H2.p r0 = r14.f1058Z
            com.bumptech.glide.load.data.e r0 = r0.f1976c
            r0.b()
        L_0x00e6:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.H.d(java.lang.Object):boolean");
    }
}
