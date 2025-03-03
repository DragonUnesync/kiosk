package org.acra.sender;

import B7.e;
import P6.f;
import Q7.g;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import r7.C1395d;

public final class JobSenderService extends JobService {

    /* renamed from: U  reason: collision with root package name */
    public static final /* synthetic */ int f14299U = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        f.e(jobParameters, "params");
        PersistableBundle extras = jobParameters.getExtras();
        f.d(extras, "getExtras(...)");
        C1395d dVar = (C1395d) g.t(extras.getString("acraConfig"));
        if (dVar == null) {
            return true;
        }
        new Thread(new e(this, dVar, extras, jobParameters, 0)).start();
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        f.e(jobParameters, "params");
        return true;
    }
}
