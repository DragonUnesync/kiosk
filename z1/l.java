package Z1;

import K1.i;
import a0.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final n f6971a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f6972b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static i f6973c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return j.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static i b() {
        i iVar = new i(29);
        f6973c = iVar;
        f6971a.j(iVar);
        return f6973c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00cd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            if (r19 != 0) goto L_0x0007
            K1.i r0 = f6973c
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r1 = f6972b
            monitor-enter(r1)
            if (r19 != 0) goto L_0x0015
            K1.i r0 = f6973c     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r0 = move-exception
            goto L_0x00dc
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0012 }
            r2 = 28
            if (r0 < r2) goto L_0x00d7
            r2 = 30
            if (r0 != r2) goto L_0x0021
            goto L_0x00d7
        L_0x0021:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.lang.String r3 = "/data/misc/profiles/ref/"
            java.lang.String r4 = r18.getPackageName()     // Catch:{ all -> 0x0012 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0012 }
            java.lang.String r3 = "primary.prof"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0012 }
            long r2 = r0.length()     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0012 }
            r4 = 0
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0047
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch:{ all -> 0x0012 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0012 }
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch:{ all -> 0x0012 }
            long r16 = r8.length()     // Catch:{ all -> 0x0012 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x006a
            int r8 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x006a
            r5 = 1
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            long r14 = a(r18)     // Catch:{ NameNotFoundException -> 0x00d2 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0012 }
            java.io.File r8 = r18.getFilesDir()     // Catch:{ all -> 0x0012 }
            java.lang.String r9 = "profileInstalled"
            r6.<init>(r8, r9)     // Catch:{ all -> 0x0012 }
            boolean r8 = r6.exists()     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x008a
            Z1.k r8 = Z1.k.a(r6)     // Catch:{ IOException -> 0x0085 }
            goto L_0x008b
        L_0x0085:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x008a:
            r8 = 0
        L_0x008b:
            r9 = 2
            if (r8 == 0) goto L_0x009b
            long r10 = r8.f6969c     // Catch:{ all -> 0x0012 }
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x009b
            int r10 = r8.f6968b     // Catch:{ all -> 0x0012 }
            if (r10 != r9) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r4 = r10
            goto L_0x00a2
        L_0x009b:
            if (r0 == 0) goto L_0x009f
            r4 = 1
            goto L_0x00a2
        L_0x009f:
            if (r5 == 0) goto L_0x00a2
            r4 = 2
        L_0x00a2:
            if (r19 == 0) goto L_0x00a9
            if (r5 == 0) goto L_0x00a9
            if (r4 == r7) goto L_0x00a9
            r4 = 2
        L_0x00a9:
            if (r8 == 0) goto L_0x00ba
            int r0 = r8.f6968b     // Catch:{ all -> 0x0012 }
            if (r0 != r9) goto L_0x00ba
            if (r4 != r7) goto L_0x00ba
            long r9 = r8.f6970d     // Catch:{ all -> 0x0012 }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ba
            r0 = 3
            r13 = 3
            goto L_0x00bb
        L_0x00ba:
            r13 = r4
        L_0x00bb:
            Z1.k r0 = new Z1.k     // Catch:{ all -> 0x0012 }
            r12 = 1
            r11 = r0
            r11.<init>(r12, r13, r14, r16)     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x00ca
            boolean r2 = r8.equals(r0)     // Catch:{ all -> 0x0012 }
            if (r2 != 0) goto L_0x00cd
        L_0x00ca:
            r0.b(r6)     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00d2:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00d7:
            b()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            return
        L_0x00dc:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.l.c(android.content.Context, boolean):void");
    }
}
