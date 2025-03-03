package j0;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12837b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static String f12838c;

    /* renamed from: d  reason: collision with root package name */
    public static HashSet f12839d = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final NotificationManager f12840a;

    public l(Context context) {
        this.f12840a = (NotificationManager) context.getSystemService("notification");
    }

    public static Set a(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f12837b) {
            if (string != null) {
                try {
                    if (!string.equals(f12838c)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet2.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f12839d = hashSet2;
                        f12838c = string;
                    }
                } finally {
                }
            }
            hashSet = f12839d;
        }
        return hashSet;
    }
}
