package me.weishu.reflection;

import java.lang.reflect.Method;

public final class BootstrapClass {
    private static final String TAG = "BootstrapClass";
    private static Object sVmRuntime;
    private static Method setHiddenApiExemptions;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L_0x0065
            java.lang.String r5 = "forName"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x005d }
            r6[r1] = r3     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "getDeclaredMethod"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x005d }
            r7[r1] = r3     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.Class[]> r3 = java.lang.Class[].class
            r7[r2] = r3     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r7)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "dalvik.system.VMRuntime"
            r4[r1] = r6     // Catch:{ all -> 0x005d }
            r6 = 0
            java.lang.Object r4 = r5.invoke(r6, r4)     // Catch:{ all -> 0x005d }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x005d }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x005d }
            java.lang.String r7 = "getRuntime"
            r5[r1] = r7     // Catch:{ all -> 0x005d }
            r5[r2] = r6     // Catch:{ all -> 0x005d }
            java.lang.Object r5 = r3.invoke(r4, r5)     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ all -> 0x005d }
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            r7[r1] = r8     // Catch:{ all -> 0x005d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "setHiddenApiExemptions"
            r0[r1] = r8     // Catch:{ all -> 0x005d }
            r0[r2] = r7     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r3.invoke(r4, r0)     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch:{ all -> 0x005d }
            setHiddenApiExemptions = r0     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r5.invoke(r6, r6)     // Catch:{ all -> 0x005d }
            sVmRuntime = r0     // Catch:{ all -> 0x005d }
            goto L_0x0065
        L_0x005d:
            r0 = move-exception
            java.lang.String r1 = "BootstrapClass"
            java.lang.String r2 = "reflect bootstrap failed:"
            android.util.Log.w(r1, r2, r0)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.weishu.reflection.BootstrapClass.<clinit>():void");
    }

    public static boolean exempt(String str) {
        return exempt(str);
    }

    public static boolean exemptAll() {
        return exempt("L");
    }

    public static boolean exempt(String... strArr) {
        Method method;
        Object obj = sVmRuntime;
        if (!(obj == null || (method = setHiddenApiExemptions) == null)) {
            try {
                method.invoke(obj, new Object[]{strArr});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
