package de.ozerov.fully;

import Q0.g;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import n2.a;

public class HelperService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i8) {
        int intExtra;
        if (!(intent == null || intent.getAction() == null)) {
            if (intent.getAction().equals("com.fullykiosk.singleapp.action.start_activity_from_service")) {
                try {
                    Intent P02 = a.P0(intent.getStringExtra("intentUrl"));
                    P02.setFlags(268435456);
                    P02.putExtra("isKioskLocked", intent.getBooleanExtra("isKioskLocked", false));
                    startActivity(P02);
                } catch (Exception e) {
                    Log.e("HelperService", "Failed to handle intent URL " + intent.getStringExtra("intentUrl") + " due to " + e.getMessage());
                }
            }
            if (intent.getAction().equals("com.fullykiosk.singleapp.action.bring_task_to_foreground") && (intExtra = intent.getIntExtra("taskId", -1)) != -1) {
                try {
                    ((ActivityManager) getApplicationContext().getSystemService("activity")).moveTaskToFront(intExtra, 2);
                } catch (Exception e8) {
                    g.x(e8, new StringBuilder("Failed to move task to front due to "), "HelperService");
                }
            }
            if (intent.getAction().equals("com.fullykiosk.singleapp.action.bring_to_foreground")) {
                Intent intent2 = new Intent(this, FullyActivity.class);
                if (intent.getBooleanExtra("isLauncher", false)) {
                    intent2.addCategory("android.intent.category.HOME");
                    intent2.setAction("android.intent.action.MAIN");
                    intent2.putExtra("isLauncher", true);
                    intent2.putExtra("action", "com.fullykiosk.singleapp.action.bring_to_foreground");
                    Intent c8 = a.c(intent2);
                    try {
                        PendingIntent.getActivity(this, 0, c8, 335544320).send();
                    } catch (Exception e9) {
                        Log.w("HelperService", "Failed to send intent " + a.o0(c8) + " due to " + e9.getMessage());
                    }
                } else {
                    try {
                        intent2.setAction("com.fullykiosk.singleapp.action.bring_to_foreground");
                        intent2.setFlags(268435456);
                        startActivity(intent2);
                    } catch (Exception e10) {
                        Log.w("HelperService", "Failed to start intent " + a.o0(intent2) + " due to " + e10.getMessage());
                    }
                }
            }
        }
        return 2;
    }
}
