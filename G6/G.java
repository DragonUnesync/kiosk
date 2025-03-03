package g6;

import java.io.File;
import java.security.PrivilegedAction;
import java.util.Set;

public final class G implements PrivilegedAction {
    final /* synthetic */ Set val$allowedClassifiers;
    final /* synthetic */ Set val$availableClassifiers;
    final /* synthetic */ File val$file;
    final /* synthetic */ String val$osReleaseFileName;

    public G(File file, Set set, Set set2, String str) {
        this.val$file = file;
        this.val$allowedClassifiers = set;
        this.val$availableClassifiers = set2;
        this.val$osReleaseFileName = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r1 != null) goto L_0x0066;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x009f */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088 A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c A[SYNTHETIC, Splitter:B:40:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean run() {
        /*
            r6 = this;
            java.io.File r0 = r6.val$file     // Catch:{ SecurityException -> 0x006a }
            boolean r0 = r0.exists()     // Catch:{ SecurityException -> 0x006a }
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            java.io.File r4 = r6.val$file     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            r3.<init>(r4)     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            java.nio.charset.Charset r4 = e6.C0852k.UTF_8     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x0076, IOException -> 0x0071, all -> 0x006c }
        L_0x001c:
            java.lang.String r0 = r1.readLine()     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r2 = "ID="
            boolean r2 = r0.startsWith(r2)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            if (r2 == 0) goto L_0x0046
            r2 = 3
            java.lang.String r0 = r0.substring(r2)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.lang.String r0 = g6.Y.normalizeOsReleaseVariableValue(r0)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.util.Set r2 = r6.val$allowedClassifiers     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.util.Set r3 = r6.val$availableClassifiers     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            g6.Y.addClassifier(r2, r3, r0)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            goto L_0x001c
        L_0x003f:
            r0 = move-exception
            goto L_0x009a
        L_0x0042:
            r0 = move-exception
            goto L_0x007b
        L_0x0044:
            r0 = move-exception
            goto L_0x0089
        L_0x0046:
            java.lang.String r2 = "ID_LIKE="
            boolean r2 = r0.startsWith(r2)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            if (r2 == 0) goto L_0x001c
            r2 = 8
            java.lang.String r0 = r0.substring(r2)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.lang.String r0 = g6.Y.normalizeOsReleaseVariableValue(r0)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.util.Set r2 = r6.val$allowedClassifiers     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.util.Set r3 = r6.val$availableClassifiers     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            java.lang.String r4 = "[ ]+"
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            g6.Y.addClassifier(r2, r3, r0)     // Catch:{ SecurityException -> 0x0044, IOException -> 0x0042 }
            goto L_0x001c
        L_0x0066:
            r1.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x0097
        L_0x006a:
            r0 = move-exception
            goto L_0x00a0
        L_0x006c:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x009a
        L_0x0071:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x007b
        L_0x0076:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0089
        L_0x007b:
            h6.c r2 = g6.Y.logger     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "Error while reading content of {}"
            java.lang.String r4 = r6.val$osReleaseFileName     // Catch:{ all -> 0x003f }
            r2.debug(r3, r4, r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0097
            goto L_0x0066
        L_0x0089:
            h6.c r2 = g6.Y.logger     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "Unable to read {}"
            java.lang.String r4 = r6.val$osReleaseFileName     // Catch:{ all -> 0x003f }
            r2.debug(r3, r4, r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0097
            goto L_0x0066
        L_0x0097:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ SecurityException -> 0x006a }
            return r0
        L_0x009a:
            if (r1 == 0) goto L_0x009f
            r1.close()     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            throw r0     // Catch:{ SecurityException -> 0x006a }
        L_0x00a0:
            h6.c r1 = g6.Y.logger
            java.lang.String r2 = "Unable to check if {} exists"
            java.lang.String r3 = r6.val$osReleaseFileName
            r1.debug(r2, r3, r0)
        L_0x00ab:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.G.run():java.lang.Boolean");
    }
}
