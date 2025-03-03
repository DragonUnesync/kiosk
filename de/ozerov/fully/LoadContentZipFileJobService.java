package de.ozerov.fully;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

@TargetApi(21)
public class LoadContentZipFileJobService extends JobService {

    /* renamed from: V  reason: collision with root package name */
    public static final /* synthetic */ int f10085V = 0;

    /* renamed from: U  reason: collision with root package name */
    public C0754p1 f10086U;

    public static void a(Context context) {
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(8653, new ComponentName(context, LoadContentZipFileJobService.class)).setRequiredNetworkType(1).setPeriodic(3600000).build());
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (C0765r1.f10910c) {
            Log.w("LoadContentZipFileJobService", "Previous task is still running, skipping...");
            jobFinished(jobParameters, false);
            return true;
        }
        C0754p1 p1Var = new C0754p1(this, jobParameters);
        this.f10086U = p1Var;
        p1Var.f10911a = new WeakReference(this);
        this.f10086U.execute(new Void[0]);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        C0754p1 p1Var = this.f10086U;
        if (p1Var != null) {
            p1Var.cancel(true);
        }
        return true;
    }
}
