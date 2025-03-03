package L0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.HashMap;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f2684f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static c f2685g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2686a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2687b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2688c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2689d = new ArrayList();
    public final a e;

    public c(Context context) {
        this.f2686a = context;
        this.e = new a(this, context.getMainLooper(), 0);
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f2684f) {
            try {
                if (f2685g == null) {
                    f2685g = new c(context.getApplicationContext());
                }
                cVar = f2685g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f2687b) {
            try {
                b bVar = new b(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f2687b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f2687b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f2688c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f2688c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "Action list: "
            java.lang.String r3 = "Resolving type "
            java.util.HashMap r4 = r1.f2687b
            monitor-enter(r4)
            java.lang.String r12 = r23.getAction()     // Catch:{ all -> 0x0058 }
            android.content.Context r5 = r1.f2686a     // Catch:{ all -> 0x0058 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0058 }
            java.lang.String r13 = r0.resolveTypeIfNeeded(r5)     // Catch:{ all -> 0x0058 }
            android.net.Uri r14 = r23.getData()     // Catch:{ all -> 0x0058 }
            java.lang.String r15 = r23.getScheme()     // Catch:{ all -> 0x0058 }
            java.util.Set r16 = r23.getCategories()     // Catch:{ all -> 0x0058 }
            int r5 = r23.getFlags()     // Catch:{ all -> 0x0058 }
            r5 = r5 & 8
            r11 = 1
            r10 = 0
            if (r5 == 0) goto L_0x0032
            r17 = 1
            goto L_0x0034
        L_0x0032:
            r17 = 0
        L_0x0034:
            if (r17 == 0) goto L_0x005b
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r6.<init>(r3)     // Catch:{ all -> 0x0058 }
            r6.append(r13)     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = " scheme "
            r6.append(r3)     // Catch:{ all -> 0x0058 }
            r6.append(r15)     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = " of intent "
            r6.append(r3)     // Catch:{ all -> 0x0058 }
            r6.append(r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0058 }
            android.util.Log.v(r5, r3)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r0 = move-exception
            goto L_0x016e
        L_0x005b:
            java.util.HashMap r3 = r1.f2688c     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = r23.getAction()     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x016c
            if (r17 == 0) goto L_0x007c
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r6.<init>(r2)     // Catch:{ all -> 0x0058 }
            r6.append(r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0058 }
            android.util.Log.v(r5, r2)     // Catch:{ all -> 0x0058 }
        L_0x007c:
            r2 = 0
            r9 = 0
        L_0x007e:
            int r5 = r3.size()     // Catch:{ all -> 0x0058 }
            if (r9 >= r5) goto L_0x013b
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x0058 }
            r8 = r5
            L0.b r8 = (L0.b) r8     // Catch:{ all -> 0x0058 }
            if (r17 == 0) goto L_0x00a5
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r6.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = "Matching against filter "
            r6.append(r7)     // Catch:{ all -> 0x0058 }
            android.content.IntentFilter r7 = r8.f2680a     // Catch:{ all -> 0x0058 }
            r6.append(r7)     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0058 }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0058 }
        L_0x00a5:
            boolean r5 = r8.f2682c     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x00bb
            if (r17 == 0) goto L_0x00b2
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.String r6 = "  Filter's target already added"
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0058 }
        L_0x00b2:
            r19 = r3
            r20 = r9
            r21 = r12
            r12 = 1
            goto L_0x0131
        L_0x00bb:
            android.content.IntentFilter r5 = r8.f2680a     // Catch:{ all -> 0x0058 }
            java.lang.String r18 = "LocalBroadcastManager"
            r6 = r12
            r7 = r13
            r19 = r3
            r3 = r8
            r8 = r15
            r20 = r9
            r9 = r14
            r21 = r12
            r12 = 0
            r10 = r16
            r12 = 1
            r11 = r18
            int r5 = r5.match(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0058 }
            if (r5 < 0) goto L_0x00ff
            if (r17 == 0) goto L_0x00f2
            java.lang.String r6 = "LocalBroadcastManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r7.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r8 = "  Filter matched!  match=0x"
            r7.append(r8)     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0058 }
            r7.append(r5)     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0058 }
            android.util.Log.v(r6, r5)     // Catch:{ all -> 0x0058 }
        L_0x00f2:
            if (r2 != 0) goto L_0x00f9
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0058 }
            r2.<init>()     // Catch:{ all -> 0x0058 }
        L_0x00f9:
            r2.add(r3)     // Catch:{ all -> 0x0058 }
            r3.f2682c = r12     // Catch:{ all -> 0x0058 }
            goto L_0x0131
        L_0x00ff:
            if (r17 == 0) goto L_0x0131
            r3 = -4
            if (r5 == r3) goto L_0x0119
            r3 = -3
            if (r5 == r3) goto L_0x0116
            r3 = -2
            if (r5 == r3) goto L_0x0113
            r3 = -1
            if (r5 == r3) goto L_0x0110
            java.lang.String r3 = "unknown reason"
            goto L_0x011b
        L_0x0110:
            java.lang.String r3 = "type"
            goto L_0x011b
        L_0x0113:
            java.lang.String r3 = "data"
            goto L_0x011b
        L_0x0116:
            java.lang.String r3 = "action"
            goto L_0x011b
        L_0x0119:
            java.lang.String r3 = "category"
        L_0x011b:
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r6.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = "  Filter did not match: "
            r6.append(r7)     // Catch:{ all -> 0x0058 }
            r6.append(r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0058 }
            android.util.Log.v(r5, r3)     // Catch:{ all -> 0x0058 }
        L_0x0131:
            int r9 = r20 + 1
            r3 = r19
            r12 = r21
            r10 = 0
            r11 = 1
            goto L_0x007e
        L_0x013b:
            r12 = 1
            if (r2 == 0) goto L_0x016c
            r10 = 0
        L_0x013f:
            int r3 = r2.size()     // Catch:{ all -> 0x0058 }
            if (r10 >= r3) goto L_0x0151
            java.lang.Object r3 = r2.get(r10)     // Catch:{ all -> 0x0058 }
            L0.b r3 = (L0.b) r3     // Catch:{ all -> 0x0058 }
            r5 = 0
            r3.f2682c = r5     // Catch:{ all -> 0x0058 }
            int r10 = r10 + 1
            goto L_0x013f
        L_0x0151:
            java.util.ArrayList r3 = r1.f2689d     // Catch:{ all -> 0x0058 }
            A1.d r5 = new A1.d     // Catch:{ all -> 0x0058 }
            r6 = 19
            r5.<init>(r0, r6, r2)     // Catch:{ all -> 0x0058 }
            r3.add(r5)     // Catch:{ all -> 0x0058 }
            L0.a r0 = r1.e     // Catch:{ all -> 0x0058 }
            boolean r0 = r0.hasMessages(r12)     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x016a
            L0.a r0 = r1.e     // Catch:{ all -> 0x0058 }
            r0.sendEmptyMessage(r12)     // Catch:{ all -> 0x0058 }
        L_0x016a:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x016c:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            return
        L_0x016e:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.c(android.content.Intent):void");
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2687b) {
            try {
                ArrayList arrayList = (ArrayList) this.f2687b.remove(broadcastReceiver);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        b bVar = (b) arrayList.get(size);
                        bVar.f2683d = true;
                        for (int i = 0; i < bVar.f2680a.countActions(); i++) {
                            String action = bVar.f2680a.getAction(i);
                            ArrayList arrayList2 = (ArrayList) this.f2688c.get(action);
                            if (arrayList2 != null) {
                                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                    b bVar2 = (b) arrayList2.get(size2);
                                    if (bVar2.f2681b == broadcastReceiver) {
                                        bVar2.f2683d = true;
                                        arrayList2.remove(size2);
                                    }
                                }
                                if (arrayList2.size() <= 0) {
                                    this.f2688c.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
