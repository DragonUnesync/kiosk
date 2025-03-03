package j0;

import android.app.Notification;
import android.app.NotificationManager;

public abstract class j {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static void b(Notification.Builder builder) {
        builder.setRemoteInputHistory((CharSequence[]) null);
    }
}
