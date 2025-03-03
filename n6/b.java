package n6;

import Q7.g;
import j$.util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class b extends RuntimeException {

    /* renamed from: U  reason: collision with root package name */
    public final List f13786U;

    /* renamed from: V  reason: collision with root package name */
    public final String f13787V;

    /* renamed from: W  reason: collision with root package name */
    public C6.b f13788W;

    public b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof b) {
                    linkedHashSet.addAll(((b) th).f13786U);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            this.f13786U = unmodifiableList;
            this.f13787V = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public static void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(g gVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a8 : this.f13786U) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, a8, "\t");
            i++;
        }
        gVar.F(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|(1:(1:13)(1:(2:14|(1:54)(1:(2:55|17)(1:18)))))(0)|19|(4:22|(2:24|57)(2:27|58)|56|20)|28|29|30|31|(1:51)(1:(2:34|52)(3:(2:35|(1:63)(1:(2:64|38)(1:39)))|40|53))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            C6.b r0 = r8.f13788W     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0088
            C6.b r0 = new C6.b     // Catch:{ all -> 0x0067 }
            r1 = 7
            r0.<init>((int) r1)     // Catch:{ all -> 0x0067 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            java.util.List r2 = r8.f13786U     // Catch:{ all -> 0x0067 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0067 }
            r3 = r0
        L_0x0017:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0067 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0067 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x002a
            goto L_0x0017
        L_0x002a:
            r1.add(r4)     // Catch:{ all -> 0x0067 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0067 }
            r5.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x0049
            if (r6 != r4) goto L_0x003b
            goto L_0x0049
        L_0x003b:
            r5.add(r6)     // Catch:{ all -> 0x0067 }
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0049
            if (r7 != r6) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r6 = r7
            goto L_0x003b
        L_0x0049:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0067 }
        L_0x004d:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x006d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0067 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0067 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0069
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0067 }
            goto L_0x004d
        L_0x0067:
            r0 = move-exception
            goto L_0x008c
        L_0x0069:
            r1.add(r6)     // Catch:{ all -> 0x0067 }
            goto L_0x004d
        L_0x006d:
            r3.initCause(r4)     // Catch:{ all -> 0x0070 }
        L_0x0070:
            java.lang.Throwable r4 = r3.getCause()     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0017
            if (r3 != r4) goto L_0x0079
            goto L_0x0017
        L_0x0079:
            java.lang.Throwable r3 = r4.getCause()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0084
            if (r3 != r4) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r4 = r3
            goto L_0x0079
        L_0x0084:
            r3 = r4
            goto L_0x0017
        L_0x0086:
            r8.f13788W = r0     // Catch:{ all -> 0x0067 }
        L_0x0088:
            C6.b r0 = r8.f13788W     // Catch:{ all -> 0x0067 }
            monitor-exit(r8)
            return r0
        L_0x008c:
            monitor-exit(r8)     // Catch:{ all -> 0x0067 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.getCause():java.lang.Throwable");
    }

    public final String getMessage() {
        return this.f13787V;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        b(new C1246a(0, printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        b(new C1246a(1, printWriter));
    }
}
