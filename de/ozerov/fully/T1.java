package de.ozerov.fully;

import U.d;
import android.os.Build;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.Log;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Date;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.altbeacon.beacon.service.RangedBeacon;

public final class T1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MyApplication f10358a;

    public T1(MyApplication myApplication) {
        this.f10358a = myApplication;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        String str2;
        String str3 = "Caught exception, thread:" + thread.getId() + ", main thread:" + Looper.getMainLooper().getThread().getId() + ", class:" + th.getClass().getSimpleName() + ", message:" + th.getMessage();
        int i = MyApplication.f10105b0;
        Log.e("MyApplication", str3);
        C0794w0.q0(4, "MyApplication", str3);
        try {
            if (C0794w0.f11017a) {
                if (C0794w0.f11018b != null) {
                    C0794w0.a();
                    C0794w0.f11018b.f11062l++;
                }
            }
        } catch (Exception unused) {
            int i8 = MyApplication.f10105b0;
            Log.e("MyApplication", "Failed to incrementAppCrashes");
        }
        ErrorReporter errorReporter = C1247a.f13789a;
        MyApplication myApplication = this.f10358a;
        String str4 = "false";
        if (!myApplication.f10107V.c0().booleanValue() || !myApplication.f10107V.C().booleanValue()) {
            str = str4;
        } else {
            str = "true";
        }
        errorReporter.a("kioskMode", str);
        ErrorReporter errorReporter2 = C1247a.f13789a;
        if (myApplication.f10107V.s1().booleanValue()) {
            str4 = "true";
        }
        errorReporter2.a("motionDetection", str4);
        C1247a.f13789a.a("motionCameraApi", String.valueOf(myApplication.f10107V.r1()));
        C1247a.f13789a.a("videoPlayerEngine", String.valueOf(myApplication.f10107V.x2()));
        C1247a.f13789a.a("ROM", Build.DISPLAY);
        C1247a.f13789a.a("packageName", myApplication.getApplicationContext().getPackageName());
        C1247a.f13789a.a("crashTime", DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date()).toString());
        ArrayList P8 = C0794w0.P(myApplication.getApplicationContext(), myApplication.getApplicationContext().getPackageName());
        if (P8 != null) {
            C1247a.f13789a.a("signatures", a.H0(P8));
        }
        if (!myApplication.f10107V.P1().booleanValue() || System.currentTimeMillis() - myApplication.f10108W <= RangedBeacon.DEFAULT_MAX_TRACKING_AGE) {
            Log.w("MyApplication", "Caught exception, but no auto-restart for crashes during app start");
        } else {
            th.printStackTrace();
            d.h(myApplication.getApplicationContext(), "Caught Crash", 3000);
        }
        if (th.getStackTrace().length > 0) {
            str2 = th.getStackTrace()[0].toString();
        } else {
            str2 = null;
        }
        if (thread.getId() == Looper.getMainLooper().getThread().getId()) {
            if (a.y0() || th.getMessage() == null || !th.getMessage().contains("Bad notification posted from package")) {
                myApplication.f10106U.uncaughtException(thread, th);
            }
        } else if (str2 == null || th.getMessage() == null || !th.getMessage().contains("Results have already been set") || !str2.contains("com.google.android.gms")) {
            myApplication.f10106U.uncaughtException(thread, th);
        }
    }
}
