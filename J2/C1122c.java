package j2;

import android.content.pm.PackageInfo;
import android.net.Uri;

/* renamed from: j2.c  reason: case insensitive filesystem */
public abstract class C1122c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12864a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.PackageInfo a(android.content.Context r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L_0x000c
            android.content.pm.PackageInfo r1 = k2.C1147d.a()
            goto L_0x0013
        L_0x000c:
            android.content.pm.PackageInfo r1 = b()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            r1 = r2
        L_0x0013:
            if (r1 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r1 = 23
            if (r0 > r1) goto L_0x002d
            java.lang.String r0 = "android.webkit.WebViewFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.String r1 = "getWebViewPackageName"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            goto L_0x003f
        L_0x002d:
            java.lang.String r0 = "android.webkit.WebViewUpdateService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.String r1 = "getCurrentWebViewPackageName"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004b }
        L_0x003f:
            if (r0 != 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 0
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r0, r1)     // Catch:{  }
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C1122c.a(android.content.Context):android.content.pm.PackageInfo");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", (Class[]) null).invoke((Object) null, (Object[]) null);
    }
}
