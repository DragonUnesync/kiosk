package b6;

import java.security.PrivilegedAction;
import javax.net.ssl.SSLContext;

/* renamed from: b6.n0  reason: case insensitive filesystem */
public final class C0571n0 implements PrivilegedAction {
    final /* synthetic */ SSLContext val$finalContext;

    public C0571n0(SSLContext sSLContext) {
        this.val$finalContext = sSLContext;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[ExcHandler: SecurityException (r0v2 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }, LOOP:0: B:5:0x0018->B:15:0x003a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[EDGE_INSN: B:20:0x003d->B:18:0x003d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object run() {
        /*
            r7 = this;
            java.lang.Class<javax.net.ssl.SSLContext> r0 = javax.net.ssl.SSLContext.class
            java.lang.String r1 = "contextSpi"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            long r0 = g6.Y.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            javax.net.ssl.SSLContext r2 = r7.val$finalContext     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            java.lang.Object r2 = g6.Y.getObject(r2, r0)     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            if (r2 == 0) goto L_0x003d
            java.lang.Class r3 = r2.getClass()     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
        L_0x0018:
            java.lang.String r4 = "trustManager"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0034, SecurityException -> 0x0032 }
            long r4 = g6.Y.objectFieldOffset(r4)     // Catch:{ NoSuchFieldException -> 0x0034, SecurityException -> 0x0032 }
            java.lang.Object r6 = g6.Y.getObject(r2, r4)     // Catch:{ NoSuchFieldException -> 0x0034, SecurityException -> 0x0032 }
            boolean r6 = b6.C0579s.A(r6)     // Catch:{ NoSuchFieldException -> 0x0034, SecurityException -> 0x0032 }
            if (r6 == 0) goto L_0x0034
            b6.p0 r6 = new b6.p0     // Catch:{ NoSuchFieldException -> 0x0034, SecurityException -> 0x0032 }
            r6.<init>(r0, r4)     // Catch:{ NoSuchFieldException -> 0x0034, SecurityException -> 0x0032 }
            return r6
        L_0x0032:
            r0 = move-exception
            goto L_0x0043
        L_0x0034:
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            if (r3 == 0) goto L_0x003d
            goto L_0x0018
        L_0x003b:
            r0 = move-exception
            goto L_0x0043
        L_0x003d:
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            r0.<init>()     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
            throw r0     // Catch:{ NoSuchFieldException -> 0x003b, SecurityException -> 0x0032 }
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0571n0.run():java.lang.Object");
    }
}
