package j0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;

public abstract class g {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager b(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static void c(Notification.Builder builder) {
        builder.setAllowSystemGeneratedContextualActions(true);
    }

    public static void d(Notification.Builder builder) {
        builder.setBubbleMetadata((Notification.BubbleMetadata) null);
    }
}
