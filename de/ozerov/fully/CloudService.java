package de.ozerov.fully;

import P5.O;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import d4.k;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

public class CloudService extends I {

    /* renamed from: i0  reason: collision with root package name */
    public static final long f9834i0 = (60000 - ((long) new Random().nextInt(5000)));

    /* renamed from: j0  reason: collision with root package name */
    public static volatile String f9835j0 = "";

    /* renamed from: V  reason: collision with root package name */
    public k f9836V;

    /* renamed from: W  reason: collision with root package name */
    public volatile Timer f9837W;

    /* renamed from: X  reason: collision with root package name */
    public volatile long f9838X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile long f9839Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile long f9840Z;

    /* renamed from: a0  reason: collision with root package name */
    public volatile long f9841a0;

    /* renamed from: b0  reason: collision with root package name */
    public volatile long f9842b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public volatile int f9843c0 = 5000;

    /* renamed from: d0  reason: collision with root package name */
    public volatile boolean f9844d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public final C0685d4 f9845e0 = new C0685d4(TimeUnit.SECONDS);

    /* renamed from: f0  reason: collision with root package name */
    public Bundle f9846f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f9847g0 = -1;

    /* renamed from: h0  reason: collision with root package name */
    public volatile Handler f9848h0;

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        c cVar = (c) this.f9836V.f9767W;
        cVar.getClass();
        long j7 = -1;
        try {
            j7 = ((SharedPreferences) cVar.f6955V).getLong("lastFullyLogTransmittedId", -1);
        } catch (Exception unused) {
        }
        Iterator it = C0794w0.y(j7 + 1, 10, true).iterator();
        while (it.hasNext()) {
            C0759q0 q0Var = (C0759q0) it.next();
            try {
                long j8 = q0Var.f10891a;
                if (j8 > this.f9847g0) {
                    this.f9847g0 = j8;
                }
                long j9 = q0Var.f10893c;
                if (j9 != 4) {
                    if (j9 != 3) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", q0Var.f10891a);
                        long j10 = q0Var.f10895f;
                        String str = q0Var.f10892b;
                        if (j10 < 2) {
                            str = a.d0(str);
                        }
                        jSONObject.put("time", str);
                        jSONObject.put("type", q0Var.f10893c);
                        jSONObject.put("tag", q0Var.f10894d);
                        jSONObject.put("message", q0Var.e);
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    public final synchronized void b() {
        d();
        if (this.f9844d0) {
            this.f9837W = new Timer();
            try {
                this.f9837W.schedule(new O(2, this), 0, 20000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f9842b0 = 20000;
        }
    }

    public final synchronized void c(long j7) {
        try {
            if (this.f9848h0 != null) {
                this.f9848h0.removeCallbacksAndMessages((Object) null);
                this.f9848h0 = null;
            }
            if (this.f9844d0) {
                this.f9848h0 = new Handler(Looper.getMainLooper());
                this.f9848h0.postDelayed(new Q(this, 0), j7);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void d() {
        if (this.f9837W != null) {
            this.f9837W.cancel();
            this.f9837W.purge();
            this.f9837W = null;
            this.f9842b0 = 0;
        }
    }

    public final synchronized void e() {
        if (this.f9848h0 != null) {
            this.f9848h0.removeCallbacksAndMessages((Object) null);
            this.f9848h0 = null;
        }
    }

    public final synchronized void f(long j7) {
        d();
        if (this.f9844d0) {
            this.f9837W = new Timer();
            try {
                this.f9837W.schedule(new O(2, this), j7, j7);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f9842b0 = j7;
        }
    }

    public final IBinder onBind(Intent intent) {
        this.f9836V = new k((Context) this, 1);
        f9835j0 = "Cloud service bound at " + a.I();
        return this.f10005U;
    }

    public final boolean onUnbind(Intent intent) {
        this.f9844d0 = false;
        this.f9845e0.shutdownNow();
        d();
        e();
        f9835j0 = "Cloud service unbound at " + a.I();
        return super.onUnbind(intent);
    }
}
