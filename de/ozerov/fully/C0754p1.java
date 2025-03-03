package de.ozerov.fully;

import android.app.job.JobParameters;

/* renamed from: de.ozerov.fully.p1  reason: case insensitive filesystem */
public final class C0754p1 extends C0765r1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ JobParameters f10882d;
    public final /* synthetic */ LoadContentZipFileJobService e;

    public C0754p1(LoadContentZipFileJobService loadContentZipFileJobService, JobParameters jobParameters) {
        this.e = loadContentZipFileJobService;
        this.f10882d = jobParameters;
    }

    public final void onPostExecute(Object obj) {
        boolean z;
        Long l8 = (Long) obj;
        super.b(l8);
        if (l8.longValue() == -1) {
            z = true;
        } else {
            z = false;
        }
        this.e.jobFinished(this.f10882d, z);
    }
}
