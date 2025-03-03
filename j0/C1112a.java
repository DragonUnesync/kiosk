package j0;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;

/* renamed from: j0.a  reason: case insensitive filesystem */
public abstract class C1112a {
    public static Object a(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String c(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static void d(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    public static void e(Notification.Builder builder) {
        builder.setLargeIcon((Icon) null);
    }
}
