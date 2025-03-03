package de.ozerov.fully;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import d4.k;
import n2.a;

@TargetApi(21)
public class AiJobService extends JobService {

    /* renamed from: U  reason: collision with root package name */
    public static final /* synthetic */ int f9790U = 0;

    public static void a(FullyActivity fullyActivity) {
        k kVar = new k((Context) fullyActivity, 1);
        if (kVar.l1() > 0) {
            ((JobScheduler) fullyActivity.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(8654, new ComponentName(fullyActivity, AiJobService.class)).setRequiredNetworkType(1).setPeriodic(((long) (kVar.l1() * 60)) * 1000).build());
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (!a.h0(this) && a.u0()) {
            Log.e("AiJobService", "Missing runtime permissions to write files");
            jobFinished(jobParameters, false);
            return true;
        } else if (!P.B()) {
            Log.e("AiJobService", "External storage is not writable");
            jobFinished(jobParameters, false);
            return true;
        } else if (C0752p.d()) {
            Log.w("AiJobService", "APK installer task is still running, skipping...");
            jobFinished(jobParameters, false);
            return true;
        } else {
            C0752p.e(this);
            jobFinished(jobParameters, false);
            return true;
        }
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        C0752p.f();
        return true;
    }
}
