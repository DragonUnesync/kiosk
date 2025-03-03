package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import d4.k;
import j$.util.Objects;
import j0.l;
import java.util.HashSet;

public class NotificationService extends NotificationListenerService {

    /* renamed from: V  reason: collision with root package name */
    public static final /* synthetic */ int f10166V = 0;

    /* renamed from: U  reason: collision with root package name */
    public boolean f10167U = false;

    public final void a(StatusBarNotification statusBarNotification) {
        k kVar = new k((Context) this, 1);
        if (((HashSet) l.a(this)).contains(getPackageName()) && this.f10167U && !statusBarNotification.getPackageName().equals("android") && !statusBarNotification.getPackageName().equals(getPackageName()) && kVar.c0().booleanValue() && ((c) kVar.f9767W).n("disableNotifications", false)) {
            try {
                cancelNotification(statusBarNotification.getKey());
                Log.i("NotificationService", "Notification from " + statusBarNotification.getPackageName() + " cancelled");
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to cancel notification due to "), "NotificationService");
            }
        }
    }

    public final void onListenerConnected() {
        Log.i("NotificationService", "Listener connected");
        this.f10167U = true;
    }

    public final void onListenerDisconnected() {
        Log.i("NotificationService", "Listener disconnected");
        this.f10167U = false;
    }

    public final void onNotificationPosted(StatusBarNotification statusBarNotification) {
        super.onNotificationPosted(statusBarNotification);
        statusBarNotification.getPackageName();
        Objects.toString(statusBarNotification.getNotification().tickerText);
        a(statusBarNotification);
    }

    public final int onStartCommand(Intent intent, int i, int i8) {
        if (!((HashSet) l.a(this)).contains(getPackageName()) || !this.f10167U) {
            return 2;
        }
        try {
            StatusBarNotification[] activeNotifications = getActiveNotifications();
            if (activeNotifications == null) {
                return 2;
            }
            for (StatusBarNotification a8 : activeNotifications) {
                a(a8);
            }
            return 2;
        } catch (Exception e) {
            g.z(e, new StringBuilder("Clearing notifications failed due to "), "NotificationService");
            return 2;
        }
    }
}
