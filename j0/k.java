package j0;

import android.app.Notification;
import android.content.Context;

public abstract class k {
    public static Notification.Builder a(Context context) {
        return new Notification.Builder(context, "err");
    }

    public static void b(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void c(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void d(Notification.Builder builder) {
        builder.setSettingsText((CharSequence) null);
    }

    public static void e(Notification.Builder builder) {
        builder.setShortcutId((String) null);
    }

    public static void f(Notification.Builder builder) {
        builder.setTimeoutAfter(0);
    }
}
