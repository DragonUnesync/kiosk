package androidx.profileinstaller;

import Z1.b;
import Z1.c;
import Z1.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.Serializable;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File file;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                e.s(context, new b(0), new c(0, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        c cVar = new c(0, (Object) this);
                        try {
                            e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            cVar.f(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e) {
                            cVar.f(7, e);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                c cVar2 = new c(0, (Object) this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    cVar2.f(12, (Serializable) null);
                    return;
                }
                cVar2.f(13, (Serializable) null);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                c cVar3 = new c(0, (Object) this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 24) {
                        file = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    } else if (i >= 23) {
                        file = context.getCodeCacheDir();
                    } else {
                        file = context.getCacheDir();
                    }
                    if (e.c(file)) {
                        cVar3.f(14, (Serializable) null);
                    } else {
                        cVar3.f(15, (Serializable) null);
                    }
                } else {
                    cVar3.f(16, (Serializable) null);
                }
            }
        }
    }
}
