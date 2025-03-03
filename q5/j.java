package Q5;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f4184a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f4185b = {"echo -BOC-", "id"};

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v3, types: [Q5.g, java.lang.Object, Q5.e] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:14|15|16|(3:19|20|17)|46|23|31|32|33|34|35|(1:40)|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ed */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            java.lang.String[] r0 = f4185b
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = "su"
            java.lang.String r1 = r2.toUpperCase(r1)
            boolean r3 = f4184a
            java.lang.String r4 = "\n"
            r5 = 0
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0045
            G3.e r1 = Q5.f.c(r2)
            Q5.i r1 = r1.b()     // Catch:{ h -> 0x010b }
            int[] r2 = new int[r7]     // Catch:{ all -> 0x0040 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0040 }
            r3.<init>()     // Catch:{ all -> 0x0040 }
            Q5.g r4 = new Q5.g     // Catch:{ all -> 0x0040 }
            r4.<init>()     // Catch:{ all -> 0x0040 }
            r4.f4142U = r2     // Catch:{ all -> 0x0040 }
            r4.f4143V = r3     // Catch:{ all -> 0x0040 }
            r1.n(r0, r4)     // Catch:{ all -> 0x0040 }
            r1.A()     // Catch:{ all -> 0x0040 }
            r0 = r2[r6]     // Catch:{ all -> 0x0040 }
            if (r0 >= 0) goto L_0x003a
            r1.close()     // Catch:{ h -> 0x010b }
            goto L_0x010b
        L_0x003a:
            r1.close()     // Catch:{ h -> 0x010b }
            r5 = r3
            goto L_0x010b
        L_0x0040:
            r0 = move-exception
            r1.close()     // Catch:{ h -> 0x010b }
            throw r0     // Catch:{ h -> 0x010b }
        L_0x0045:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = j$.util.DesugarCollections.synchronizedList(r3)
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.Process r8 = r8.exec(r2, r5)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.io.DataOutputStream r9 = new java.io.DataOutputStream     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.io.OutputStream r10 = r8.getOutputStream()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r9.<init>(r10)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            Q5.k r10 = new Q5.k     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r11.<init>()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r11.append(r1)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.String r12 = "-"
            r11.append(r12)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.io.InputStream r12 = r8.getInputStream()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r10.<init>(r11, r12, r3)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            Q5.k r11 = new Q5.k     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r12.<init>()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r12.append(r1)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.String r1 = "*"
            r12.append(r1)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.String r1 = r12.toString()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.io.InputStream r12 = r8.getErrorStream()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r11.<init>(r1, r12, r5)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r10.start()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r11.start()     // Catch:{ IOException | InterruptedException -> 0x0106 }
        L_0x0099:
            r1 = 2
            java.lang.String r12 = "UTF-8"
            if (r6 >= r1) goto L_0x00c0
            r1 = r0[r6]     // Catch:{ IOException -> 0x00be }
            java.util.Locale r13 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x00be }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00be }
            r13.<init>()     // Catch:{ IOException -> 0x00be }
            r13.append(r1)     // Catch:{ IOException -> 0x00be }
            r13.append(r4)     // Catch:{ IOException -> 0x00be }
            java.lang.String r1 = r13.toString()     // Catch:{ IOException -> 0x00be }
            byte[] r1 = r1.getBytes(r12)     // Catch:{ IOException -> 0x00be }
            r9.write(r1)     // Catch:{ IOException -> 0x00be }
            r9.flush()     // Catch:{ IOException -> 0x00be }
            int r6 = r6 + 1
            goto L_0x0099
        L_0x00be:
            r0 = move-exception
            goto L_0x00cd
        L_0x00c0:
            java.lang.String r0 = "exit\n"
            byte[] r0 = r0.getBytes(r12)     // Catch:{ IOException -> 0x00be }
            r9.write(r0)     // Catch:{ IOException -> 0x00be }
            r9.flush()     // Catch:{ IOException -> 0x00be }
            goto L_0x00e7
        L_0x00cd:
            java.lang.String r1 = r0.getMessage()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.String r4 = "EPIPE"
            boolean r1 = r1.contains(r4)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            if (r1 != 0) goto L_0x00e7
            java.lang.String r1 = r0.getMessage()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            java.lang.String r4 = "Stream closed"
            boolean r1 = r1.contains(r4)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            if (r1 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            throw r0     // Catch:{ IOException | InterruptedException -> 0x0106 }
        L_0x00e7:
            r8.waitFor()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r9.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            r10.join()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r11.join()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r8.destroy()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            boolean r0 = b(r2)     // Catch:{ IOException | InterruptedException -> 0x0106 }
            if (r0 == 0) goto L_0x0105
            int r0 = r8.exitValue()     // Catch:{ IOException | InterruptedException -> 0x0106 }
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r5 = r3
        L_0x0106:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r2.toUpperCase(r0)
        L_0x010b:
            boolean r0 = c(r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.j.a():boolean");
    }

    public static boolean b(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            str = str.substring(lastIndexOf + 1);
        }
        return str.toLowerCase(Locale.ENGLISH).equals("su");
    }

    public static boolean c(List list, boolean z) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.contains("uid=")) {
                if (!z || str.contains("uid=0")) {
                    return true;
                }
                return false;
            } else if (str.contains("-BOC-")) {
                z6 = true;
            }
        }
        return z6;
    }
}
