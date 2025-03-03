package org.acra.sender;

import A4.d;
import P6.f;
import Q7.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.samsung.android.knox.container.KnoxContainerManager;
import n7.C1247a;
import org.acra.ErrorReporter;
import r7.C1395d;

public final class LegacySenderService extends Service {

    /* renamed from: U  reason: collision with root package name */
    public static final /* synthetic */ int f14300U = 0;

    public final IBinder onBind(Intent intent) {
        f.e(intent, KnoxContainerManager.INTENT_BUNDLE);
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i8) {
        f.e(intent, KnoxContainerManager.INTENT_BUNDLE);
        if (intent.hasExtra("acraConfig")) {
            C1395d dVar = (C1395d) g.t(intent.getStringExtra("acraConfig"));
            if (dVar == null) {
                return 3;
            }
            new Thread(new d(this, dVar, intent, 1)).start();
            return 3;
        }
        ErrorReporter errorReporter = C1247a.f13789a;
        return 3;
    }
}
