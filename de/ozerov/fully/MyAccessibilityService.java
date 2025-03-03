package de.ozerov.fully;

import Q0.g;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import d4.k;

public class MyAccessibilityService extends AccessibilityService {

    /* renamed from: V  reason: collision with root package name */
    public static MyAccessibilityService f10102V;

    /* renamed from: W  reason: collision with root package name */
    public static boolean f10103W;

    /* renamed from: U  reason: collision with root package name */
    public k f10104U;

    public static boolean a() {
        return f10103W;
    }

    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityWindowInfo accessibilityWindowInfo = null;
        try {
            accessibilityNodeInfo = accessibilityEvent.getSource();
        } catch (Exception e) {
            g.x(e, new StringBuilder("getSource failed due to "), "MyAccessibilityService");
            accessibilityNodeInfo = null;
        }
        if (accessibilityNodeInfo != null) {
            try {
                accessibilityWindowInfo = accessibilityNodeInfo.getWindow();
            } catch (Exception e8) {
                g.x(e8, new StringBuilder("getWindow failed due to "), "MyAccessibilityService");
            }
            if (accessibilityWindowInfo != null) {
                int type = accessibilityWindowInfo.getType();
                Log.d("MyAccessibilityService", "onAccessibilityEvent Action:" + accessibilityEvent.getAction() + " Event:" + accessibilityEvent.getEventType() + " Package:" + accessibilityEvent.getPackageName() + " Class:" + accessibilityNodeInfo.getClassName() + " Type:" + type);
                if (this.f10104U.c0().booleanValue() && this.f10104U.F().booleanValue()) {
                    if (type == -1) {
                        performGlobalAction(1);
                    }
                    if (type == 3) {
                        if (getApplicationContext().getApplicationInfo().targetSdkVersion >= 31) {
                            performGlobalAction(15);
                        } else {
                            W3.a(this);
                        }
                    }
                }
                if (this.f10104U.c0().booleanValue() && this.f10104U.D().booleanValue() && accessibilityEvent.getPackageName()
                        != null && accessibilityEvent.getPackageName().equals("com.google.android.apps.nexuslauncher")) {
                    performGlobalAction(2);
                }
                if (this.f10104U.c0().booleanValue() && this.f10104U.C().booleanValue() && accessibilityEvent.getPackageName()
                        != null && (accessibilityEvent.getPackageName().equals("com.amazon.firelauncher") || accessibilityEvent.getPackageName().equals("com.amazon.tv.launcher"))) {
                    Intent intent = new Intent(this, LauncherReplacement.class);
                    intent.setAction("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    intent.setFlags(344064000);
                    try {
                        PendingIntent.getActivity(this, 0, intent, 67108864).send();
                    } catch (PendingIntent.CanceledException e9) {
                        e9.printStackTrace();
                    }
                }
                accessibilityWindowInfo.recycle();
                accessibilityNodeInfo.recycle();
            }
        }
    }

    public final void onInterrupt() {
        Log.v("MyAccessibilityService", "onInterrupt");
    }

    public final boolean onKeyEvent(KeyEvent keyEvent) {
        Log.d("MyAccessibilityService", "onKeyEvent keyCode:" + keyEvent.getKeyCode() + " action:" + keyEvent.getAction());
        return false;
    }

    public final void onServiceConnected() {
        super.onServiceConnected();
        Log.i("MyAccessibilityService", "onServiceConnected");
        C0794w0.q0(0, "MyAccessibilityService", "Accessibility Service connected");
        this.f10104U = new k((Context) this, 1);
        f10102V = this;
        f10103W = true;
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        serviceInfo.eventTypes = 32;
        serviceInfo.feedbackType = 16;
        serviceInfo.flags = 66;
        setServiceInfo(serviceInfo);
    }

    public final boolean onUnbind(Intent intent) {
        Log.d("MyAccessibilityService", "onUnbind");
        f10103W = false;
        f10102V = null;
        return super.onUnbind(intent);
    }
}
