package org.acra.config;

import android.content.Context;
import p7.C1346a;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;
import x7.a;

public interface ReportingAdministrator extends a {
    /* bridge */ /* synthetic */ boolean enabled(C1395d dVar);

    void notifyReportDropped(Context context, C1395d dVar);

    boolean shouldFinishActivity(Context context, C1395d dVar, C1346a aVar);

    boolean shouldKillApplication(Context context, C1395d dVar, C1347b bVar, C1408a aVar);

    boolean shouldSendReport(Context context, C1395d dVar, C1408a aVar);

    boolean shouldStartCollecting(Context context, C1395d dVar, C1347b bVar);
}
