package de.ozerov.fully.motiondetector;

import N5.j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import d4.k;
import de.ozerov.fully.I;

public class MotionDetectorService extends I {

    /* renamed from: V  reason: collision with root package name */
    public j f10807V = null;

    /* renamed from: W  reason: collision with root package name */
    public k f10808W;

    public final IBinder onBind(Intent intent) {
        this.f10808W = new k((Context) this, 1);
        j jVar = this.f10807V;
        if (jVar == null) {
            j jVar2 = new j(this, this.f10808W);
            this.f10807V = jVar2;
            jVar2.c();
            this.f10807V.e();
            this.f10807V.f3396F = true;
        } else if (jVar.f3409m == 0) {
            this.f10807V.c();
            this.f10807V.e();
            this.f10807V.f3396F = true;
        }
        return this.f10005U;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        j jVar;
        super.onConfigurationChanged(configuration);
        try {
            if (this.f10808W.s1().booleanValue() && (jVar = this.f10807V) != null) {
                jVar.d();
            }
        } catch (Exception unused) {
            Log.e("MotionDetectorService", "setCamPreview failed");
        }
    }

    public final boolean onUnbind(Intent intent) {
        j jVar = this.f10807V;
        if (jVar != null) {
            jVar.f3396F = false;
            this.f10807V.f(false);
        }
        return super.onUnbind(intent);
    }
}
